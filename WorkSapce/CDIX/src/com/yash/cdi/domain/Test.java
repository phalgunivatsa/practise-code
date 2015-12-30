package com.yash.cdi.domain;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeldContainer container = new Weld().initialize();

		StandardOutView outView = container.instance().select(StandardOutView.class).get();
		
	}

}
