package com.accelaero.aeroconnect.textprocessor.dto.schedules.message;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by psuaris on 3/27/19.
 */
@Getter
@Setter
public class MessageHeader {

    private String standardMessageIdentifier;
    private String timeMode;
}
