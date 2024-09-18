package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DeliveredService {
	private String serviceStartDate;
	private String tdsUnitCount;
	private String requestedFeeAmount;
	private String hccClaimLineNumber;
	private String dslStatusCode;
	private DefiningService definingService;
}