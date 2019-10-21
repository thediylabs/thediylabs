package com.diy.labs.model.common;

import com.fasterxml.jackson.databind.JsonNode;

import com.sun.codemodel.*;
import org.jsonschema2pojo.Schema;
import org.jsonschema2pojo.rules.Rule;

/** 
 * 
 * @author nicholaschin
 *
 */

public class DIYLABLombokPropertyRule implements Rule<JDefinedClass, JDefinedClass> {
	
	private final DIYLABLombokRuleFactory ruleFactory;
	
	protected DIYLABLombokPropertyRule(DIYLABLombokRuleFactory ruleFactory) {
		this.ruleFactory = ruleFactory;
	}

	/**
	 * This rule adds a property to a given Java class according to the Java bean spec.
	 * A private field is added to the class, along with accompanying Lombok annotations.
	 * 
	 * @param nodeName 		the name of the property to be applied
	 * @param node 			the node describing the characteristics of this property
	 * @param jclass		the Java class which should have this property added
	 * @return 				the given jclass
	 */
	public JDefinedClass apply(String nodeName, JsonNode node, JDefinedClass jclass, Schema schema) {
		String propertyName = ruleFactory.getNameHelper().getPropertyName(nodeName, node);
		
		JType propertyType = ruleFactory.getSchemaRule().apply(nodeName, node, jclass, schema);
		
		node = resolveRefs(node, schema);
		JFieldVar field = jclass.field(JMod.PRIVATE, propertyType, propertyName);
		
		propertyAnnotations(nodeName, node, schema, field);
		
		formatAnnotation(field, jclass, nodeName, node);
		
		ruleFactory.getAnnotator().propertyField(field, jclass, nodeName, node);
		
		if (node.has("pattern")) {
			ruleFactory.getPatternRule().apply(nodeName, node.get("pattern"), field, schema);
		}
		
		ruleFactory.getDefaultRule().apply(nodeName, node.get("default"), field, schema);
		
		ruleFactory.getMinimumMaximumRule().apply(nodeName, node, field, schema);
		ruleFactory.getMinItemsMaxItemsRule().apply(nodeName, node, field, schema);
		ruleFactory.getMinLengthMaxLengthRule().apply(nodeName, node, field, schema);
		ruleFactory.getTruncateRule().apply(nodeName, node, field, schema);
		
		if (isObject(node) || isArray(node)) {
			ruleFactory.getValidRule().apply(nodeName, node, field, schema);
		}
		
		return jclass;
	}
	

	private void propertyAnnotations(String nodeName, JsonNode node, Schema schema, JDocCommentable generatedJavaConstruct) {
		if (node.has("title")) {
			ruleFactory.getTitleRule().apply(nodeName, node.get("title"), generatedJavaConstruct, schema);
		}
		
		if (node.has("javaName")) {
			ruleFactory.getJavaNameRule().apply(nodeName, node.get("javaName"), generatedJavaConstruct, schema);
		}
		
		if (node.has("description")) {
			ruleFactory.getDescriptionRule().apply(nodeName, node.get("descriptions"), generatedJavaConstruct, schema);
		}
		
		if (node.has("required")) {
			ruleFactory.getRequiredRule().apply(nodeName, node.get("required"), generatedJavaConstruct, schema);
		} else {
			ruleFactory.getNotRequiredRule().apply(nodeName, node.get("required"), generatedJavaConstruct, schema);
		}
	}
	
	private void formatAnnotation(JFieldVar field, JDefinedClass clazz, String nodeName, JsonNode node) {
		String format = node.findPath("format").asText();
		if ("date-time".equalsIgnoreCase(format) || "data".equalsIgnoreCase(format)) {
			ruleFactory.getAnnotator().dateField(field, node);
		}
	}
	
	private JsonNode resolveRefs(JsonNode node, Schema parent) {
		if (node.has("$ref")) {
			Schema refSchema = ruleFactory.getSchemaStore().create(parent.getId(), node.get("$ref").asText());
			JsonNode refNode = refSchema.getContent();
			return resolveRefs(refNode, parent);
		}
		else {
			return node;
		}
	}

	
	private boolean isObject(JsonNode node) {
		return node.path("type").asText().equals("object");
	}
	
	private boolean isArray(JsonNode node) {
		return node.path("type").asText().equals("array");
	}

}
