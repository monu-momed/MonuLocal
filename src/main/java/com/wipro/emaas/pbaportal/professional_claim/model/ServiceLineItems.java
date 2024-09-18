package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ServiceLineItems {
    // Modify this to handle a list of ServiceLineItem objects
    private List<ServiceLineItem> serviceLineItem;

}
