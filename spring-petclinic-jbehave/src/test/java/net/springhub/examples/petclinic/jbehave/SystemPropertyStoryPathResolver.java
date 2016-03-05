package net.springhub.examples.petclinic.jbehave;

import org.jbehave.core.Embeddable;
import org.jbehave.core.io.AbstractStoryPathResolver;

public class SystemPropertyStoryPathResolver extends AbstractStoryPathResolver {
	
	protected SystemPropertyStoryPathResolver() {
		super("");
	}

	@Override
	protected String resolveName(Class<? extends Embeddable> embeddableClass) {
		return System.getProperty("jbehave.story.path");
	}
	
	@Override
	protected String resolveDirectory(Class<? extends Embeddable> embeddableClass) {
		return "";
	}

}
