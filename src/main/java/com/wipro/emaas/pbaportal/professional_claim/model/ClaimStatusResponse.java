package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClaimStatusResponse {
	
	private String status;
	private ClaimStatusInfo claimStatusInfo;
	private MemberInformation memberInfo;
	private DeliveredService deliveredService;
	private ClaimException exception;
}
