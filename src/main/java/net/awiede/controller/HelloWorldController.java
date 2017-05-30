package net.awiede.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.awiede.manager.HelloWorldManager;

@Controller
public class HelloWorldController {

	@Autowired
	private HelloWorldManager helloWorldManager;
	
	@RequestMapping(value="helloWorld.action", method={RequestMethod.GET})
	public ModelAndView getHelloWorld(HttpServletRequest request) {
		return new ModelAndView("helloWorld");
	}
	
	@RequestMapping(value="answerMyQuestion.action", method={RequestMethod.GET})
	public ModelAndView answerQuestion(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("helloWorld");
		
		model.addObject("answer", helloWorldManager.getAnswer());
		
		return model;
	}
}
