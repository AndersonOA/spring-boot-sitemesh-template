/**
 * 
 */
package br.com.sitemesh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author anderson.aristides
 *
 */
@Controller
public class LoginController {
	
	private static String GO_LOGIN = "login";
	
	@RequestMapping(value = "login.html")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView(GO_LOGIN);

		return mav;
	}

}
