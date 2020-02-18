package com.accelaero.aeroconnect.textprocessor.dto.schedules.message;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by psuaris on 3/27/19.
 */
@Getter
@Setter
public class PeriodFrequencyInformation {

    private String scheduleValidityEffectiveDate;
    private String scheduleValidityDiscontinueDate;
    private String periodOfOperationStart;
    private String periodOfOperationTo;
    private String daysOfOperation;
    private String frequencyRate;
    private String jointOperationAirlineDesignators;
    private String codeSharingCommercialDuplicate;
    private String aircraftOwner;
    private String cockpitCrewEmployer;
    private String cabinCrewEmployer;
    private String onwardFlight;
    private String codeSharedOrWetLeaseAirlineDesignation;

}
