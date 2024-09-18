package com.wipro.emaas.pbaportal.professional_claim.model;

public class ClaimStatusInfo {

	private String consolidated;
	private String hccClaimNumber;
	private String claimType;
	private String processingDate;
	private String claimState;
	private String totalChargedAmount;
	private String receiptDate;
	private String claimDeliveryType;
	private ClaimSource claimSource;
	private MemberInfo memberInfo;
	private DeliveredService[] deliveredService;
	private ExceptionInfo exception;
}
