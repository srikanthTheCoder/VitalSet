package com.ideas2it.vitaltrendservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RefreshScope
@RestController
@RequestMapping
@Api(value = "Resource Controller")
public class ResourceController {

	@Value("${app.service-name}")
	private String serviceName;

	@Value("${app.shared.attribute}")
	private String sharedAttribute;

//	@Value("${print.server}")
//	private String server;

	@ApiOperation(value = "finding service name from config server using vital properties")
	@GetMapping("/service")
	public String getServiceName() {
		return "service name [" + this.serviceName + "]";
	}

	@ApiOperation(value = "finding shared atrribute from config server using common app properties")
	@GetMapping("/shared")
	public String getSharedAttribute() {
		return " application.properties [" + this.sharedAttribute + "]";
	}

//	@ApiOperation(value = "finding shared atrribute from config server using common app properties")
//	@GetMapping("/server")
//	public String getServerName() {
//		return "server name [" + this.server + "]";
//	}
	
}
