package net.springhub.examples.petclinic.jbehave;

import org.jbehave.core.io.StoryPathResolver;

public class GenericSpringJBehaveStoryRunner extends AbstractSpringJBehaveStoryRunner {

	@Override
	protected StoryPathResolver storyPathResolver() {
		return new SystemPropertyStoryPathResolver();
	}

}
