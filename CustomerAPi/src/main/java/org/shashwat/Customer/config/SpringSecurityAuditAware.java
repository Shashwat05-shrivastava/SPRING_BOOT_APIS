package org.shashwat.Customer.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component(value="auditAware")
public class SpringSecurityAuditAware implements  AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.ofNullable("Shashwat");
	}

}
