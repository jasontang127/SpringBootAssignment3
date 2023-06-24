package com.jtang.assignment3.healthchecks;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		Health.Builder build = new Health.Builder();
		return build.up().withDetail("health", 200).withDetail("testing", 300).build();
	}

}
