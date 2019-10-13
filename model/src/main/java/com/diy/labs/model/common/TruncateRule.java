package com.diy.labs.model.common;

import org.jsonschema2pojo.Schema;
import org.jsonschema2pojo.rules.Rule;
import org.jsonschema2pojo.rules.RuleFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JAnnotationUse;


public class TruncateRule implements Rule<JFieldVar, JFieldVar> {
	private RuleFactory ruleFactory;
	
	protected TruncateRule(RuleFactory ruleFactory) {
		this.ruleFactory = ruleFactory;
}


	@Override
	public JFieldVar apply(String nodeName, JsonNode node, JFieldVar field, Schema currentSchema) {
		if(node.has("truncate")) {
			JAnnotationUse annotation = field.annotate(Truncate.class);
			annotation.param("length", node.get("maxLength").asInt());
			annotation.param("enabled", true);
		}
		
		return field;
	}
}