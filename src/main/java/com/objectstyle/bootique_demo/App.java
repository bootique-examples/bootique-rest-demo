package com.objectstyle.bootique_demo;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.nhl.bootique.Bootique;
import com.nhl.bootique.jersey.JerseyModule;

/**
 * Hello world!
 *
 */
public class App implements Module {

	public static void main(String[] args) {
		Bootique.app(args).autoLoadModules().module(App.class).run();
	}

	@Override
	public void configure(Binder binder) {
		JerseyModule.contributeResources(binder).addBinding().to(HelloApi.class);
	}
}
