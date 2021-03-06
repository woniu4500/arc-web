package com.li.arcweb.common.template.render;

import com.li.arcweb.common.template.RenderType;

public class DateRender implements RenderType {

	@Override
	public String render(String value) {
			if (value.length() == 8) {
				value=value
						.substring(0, 4)
						+ '-'
						+ value.substring(4, 6)
						+ '-' + value.substring(6);
			} 
		return value;
	}

}
