package com.wipro.emaas.pbaportal.professional_claim.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SubscriberInformation {
	
	private Long subscriberIdentificationNumber;
	private String subscriberName;
	private String lastName;
	private String firstName;
	private String streetAddress;
	private String cityName;
	private String stateCode;
	private int postalCode;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	private String benefitAssignment;
	

}
