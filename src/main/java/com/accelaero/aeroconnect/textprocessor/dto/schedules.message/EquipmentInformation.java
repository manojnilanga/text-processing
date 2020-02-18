package com.accelaero.aeroconnect.textprocessor.dto.schedules.message;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by psuaris on 3/28/19.
 */
@Getter
@Setter
public class EquipmentInformation {
    private String serviceType;
    private String aircraftType;
    private String passengerReservationBookingDesignatorOrAircraftConfiguration;
    private String passengerReservationBookingModifier;
    private String aircraftConfigurationOrVersion;
    private String codeSharingCommercialDuplicate;
    private String aircraftOwner;
    private String cockpitCrewEmployer;
    private String cabinCrewEmployer;
    private String onwardFlight;
    private String codeSharedOrWetLeaseAirlineDesignation;

}
