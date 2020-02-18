package com.accelaero.aeroconnect.textprocessor.dto.schedules.message;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by psuaris on 3/28/19.
 */
@Getter
@Setter
public class RoutingOrLegInformation {
    private String flightLegChangeIdentifier;
    private String departureStation;
    private String scheduledTimeOfAircraftDeparture;
    private String dateVariationForSTD;
    private String passengerSTD;
    private String arrivalStation;
    private String scheduledTimeOfAircraftArrival;
    private String dateVariationForSTA;
    private String passengerSTA;
    private String jointOperationAirlineDesignators;
    private String codeSharingCommercialDuplicate;
    private String aircraftOwner;
    private String cockpitCrewEmployer;
    private String cabinCrewEmployer;
    private String onwardFlight;
    private String mealServiceNote;
    private String codeSharedOrWetLeaseAirlineDesignation;
}
