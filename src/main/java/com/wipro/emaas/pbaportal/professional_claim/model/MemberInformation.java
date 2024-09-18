package com.wipro.emaas.pbaportal.professional_claim.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MemberInformation {
	
	private Long memberIdentificationNumber;
	private String lastName;
	private String firstName;
	private String streetAddress;
	private String cityName;
	private String stateCode;
	private Integer postalCode;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;

}
