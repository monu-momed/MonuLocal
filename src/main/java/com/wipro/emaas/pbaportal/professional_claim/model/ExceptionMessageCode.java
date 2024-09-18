package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionMessageCode {

	String messageCode;
	String codeDomainName;
	String messageDescription;
	String policyName;
}
