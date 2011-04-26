package com.esen.web.simple;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.esen.entity.User;
import com.esen.web.BaseController;

@Controller
@RequestMapping("/simple")
public class SimpleController extends BaseController {

	/**
	 * /WEB-INF/jsp/test.jsp
	 * @return
	 */
	public String test() {
		return null;
	}

	/**
	 * /WEB-INF/jsp/simple/show.jsp
	 * @param model
	 */
	@RequestMapping("/show")
	public void show(Model model) {
		model.addAttribute("msg", "提示信息");
	}

	/**
	 * /WEB-INF/jsp/show.jsp
	 * @return
	 */
	@RequestMapping("/view")
	public ModelAndView view() {
		ModelAndView view = new ModelAndView();
		view.setViewName("/show");
		return view;
	}

	/**
	 * /WEB-INF/jsp/simple/map.jsp
	 * @return
	 */
	@RequestMapping("/map")
	public Map<String, Object> map(WebRequest request) {
		Map map = new HashMap();
		map.put("msg", getText("info.user.add"));
		return map;
	}

	/**
	 * /WEB-INF/jsp/simple/bean.jsp
	 * @param model
	 */
	@RequestMapping("/bean")
	public void bean(Model model) {
		User user = new User();
		user.setId("001");
		user.setName("sam");
		model.addAttribute("user", user);
	}
}
