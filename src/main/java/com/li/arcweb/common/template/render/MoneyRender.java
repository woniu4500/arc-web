package com.li.arcweb.common.template.render;

import org.apache.commons.lang.StringUtils;

import com.li.arcweb.common.template.RenderType;

public class MoneyRender implements RenderType {

	@Override
	public String render(String value) {
		if (StringUtils.isNumeric(value)) {
			value = String.valueOf((Double.valueOf(value) / 100.00));
		}
		return value;
	}

}
