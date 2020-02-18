package com.accelaero.aeroconnect.textprocessor.parser.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hashinig on 4/1/19.
 */
@Getter
@Setter
public class TestSSM {

    private String standardMessageIdentifier;
    private String timeMode;
    private String messageSequenceReference;
    private String creatorReference;
    private String actionIdentifier;
    private String asmWithdrawalIndicator;

}
