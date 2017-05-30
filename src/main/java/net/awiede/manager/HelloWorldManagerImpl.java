package net.awiede.manager;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldManagerImpl implements HelloWorldManager {

	private static final String[] ANSWERS = {"Yes", "No"};
	
	@Override
	public String getAnswer() {
		String answer;
		
		Random generator = new Random();
		
		answer = ANSWERS[generator.nextInt(ANSWERS.length)];
		
		return answer;
	}
	
}
