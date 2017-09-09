package org.code0.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**  
 * @Title: ResponseBodyController.java
 * @Package org.code0.springmvc.controller
 * @Description: ResponseBody Demo
 * @author Code0   
 * @date 2017年9月7日 下午12:59:35 
 */
@Controller
public class ResponseBodyController {

	@RequestMapping(value="testResponsBody")
	@ResponseBody
	public String testResponseBody(Model model){
		model.addAttribute("name", "Codeo");
		model.addAttribute("nickname", "666Codeo666");
		model.addAttribute("age", "18");
		return model.toString();//没有对应的视图直接返回一个字符串
		
	}
}
