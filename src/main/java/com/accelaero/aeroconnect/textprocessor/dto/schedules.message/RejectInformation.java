package com.accelaero.aeroconnect.textprocessor.dto.schedules.message;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

/**
 * Created by psuaris on 3/28/19.
 */
@Getter
@Setter
public class RejectInformation {

    private Collection<RejectReason> rejectReasonCollection;

    @Getter
    @Setter
    public class RejectReason {
        private String errorLine;
        private String rejectReason;
    }
}
