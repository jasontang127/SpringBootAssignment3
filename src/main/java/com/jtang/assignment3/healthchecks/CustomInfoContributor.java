package com.jtang.assignment3.healthchecks;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoContributor implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		// TODO Auto-generated method stub
		builder.withDetail("information", 123);
		builder.withDetail("bing bong", 300);
		builder.build();
	}

}
