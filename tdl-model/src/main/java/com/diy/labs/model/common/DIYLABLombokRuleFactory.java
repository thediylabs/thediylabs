package com.diy.labs.model.common;

import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import org.jsonschema2pojo.rules.Rule;
import org.jsonschema2pojo.rules.RuleFactory;


public class DIYLABLombokRuleFactory extends RuleFactory {
	
	@Override
	public Rule<JDefinedClass, JDefinedClass> getPropertyRule() {
		return new DIYLABLombokPropertyRule(this);
	}
	
	public Rule<JFieldVar, JFieldVar> getTruncateRule() {
		return new TruncateRule(this);
	}

}
