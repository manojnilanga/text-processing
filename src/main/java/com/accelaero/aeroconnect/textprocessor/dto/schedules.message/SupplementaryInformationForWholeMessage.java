package com.accelaero.aeroconnect.textprocessor.dto.schedules.message;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by psuaris on 3/28/19.
 */
@Getter
@Setter
public class SupplementaryInformationForWholeMessage {
    private String supplementaryInformationIndicator;
    private String supplementaryInformation;
}
