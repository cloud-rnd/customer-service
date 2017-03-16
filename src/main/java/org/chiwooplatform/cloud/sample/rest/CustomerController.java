package org.chiwooplatform.cloud.sample.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CustomerController {

	@Value("${greeting:Hi~~}")
	private String greeting;

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greeting() {
		return greeting;
	}
}
 