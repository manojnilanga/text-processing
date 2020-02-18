package com.accelaero.aeroconnect.textprocessor.dto.schedules.message;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by psuaris on 3/27/19.
 */
@Getter
@Setter
public class FlightInformation {
    private String flightDesignator;
    private String operationalSuffix;
    private String existingPeriodOfOperation;
    private String existingDaysOfOperation;
    private String existingFrequencyRate;
    private String jointOperationAirlineDesignator;
    private String codeSharingCommercialDuplicate;
    private String aircraftOwner;
    private String cockpitCrewEmployer;
    private String cabinCrewEmployer;
    private String codeSharedOrWetLeaseAirlineDesignation;

}
