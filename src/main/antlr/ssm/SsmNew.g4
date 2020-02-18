grammar SsmNew;

options {
  output=AST;
}

ssmNewMessage : standardMessageIdentifier EOL condition_1? actionIdentifier
                condition_2 EOL flightDesignator
                condition_3 EOL EOF;

/*condition_1 : timeMode EOL messageSequenceReference creatorReference EOL NEW
            | timeMode EOL messageSequenceReference EOL NEW
            | timeMode EOL NEW
            | messageSequenceReference SLASH creatorReference EOL NEW
            | messageSequenceReference EOL NEW
            | SLASH creatorReference EOL NEW
            | NEW;*/

standardMessageIdentifier : SSM;

condition_1 : timeMode EOL condition_1_1
            | condition_1_1
            ;

timeMode : LT
         | UTC
         ;

condition_1_1 : (messageSequenceReference condition_1_1_1)?;

messageSequenceReference : MESSAGE_SEQUENCE_REFERENCE;

condition_1_1_1 : creatorReference EOL
                | EOL
                ;

creatorReference : CREATOR_REFERENCE;

actionIdentifier : NEW;

condition_2 : (SPACE asmWithdrawalIndicator)?;

asmWithdrawalIndicator : XASM;

flightDesignator : FLIGHT_DESIGNATOR;

operationalSuffix : OPERATIONAL_SUFFIX;

condition_3 : operationalSuffix? condition_3_1;

condition_3_1 : (SPACE jointOperationAirlineDesignatorsDEI1)? condition_3_1_1;

condition_3_1_1 :  (SPACE codeSharingCommercialDuplicateDEI2)? (SPACE aircraftOwnerDEI3)?
                   (SPACE cockpitCrewEmployerDEI4)? (SPACE cabinCrewEmployerDEI5)?
                |  (SPACE aircraftOwnerDEI3)?
                   (SPACE cockpitCrewEmployerDEI4)? (SPACE cabinCrewEmployerDEI5)?
                   (SPACE codeSharingSharedAirlineDesignationOrWetLeaseAirlineDesignationDEI9)?
                ;

/*condition_3 : SPACE jointOperationAirlineDesignatorsDEI1 SPACE codeSharingCommercialDuplicateDEI2 SPACE aircraftOwnerDEI3
              SPACE cockpitCrewEmployerDEI4 SPACE cabinCrewEmployerDEI5
            | SPACE jointOperationAirlineDesignatorsDEI1 SPACE aircraftOwnerDEI3
              SPACE cockpitCrewEmployerDEI4 SPACE cabinCrewEmployerDEI5
              SPACE codeSharingSharedAirlineDesignationOrWetLeaseAirlineDesignationDEI9
            ;  */

jointOperationAirlineDesignatorsDEI1 : DEI1;
codeSharingCommercialDuplicateDEI2 : DEI2;
aircraftOwnerDEI3 : DEI3;
cockpitCrewEmployerDEI4 : DEI4;
cabinCrewEmployerDEI5 : DEI5;
codeSharingSharedAirlineDesignationOrWetLeaseAirlineDesignationDEI9 : DEI9;

/*
"SSM\n"
"LT\n"
"24MAY00144E003/REF 123\n"
"NEW XASM LX544A 1/LX/LH 3/LX 4/LH 5/LX 9/LX"
*/

SSM : 'SSM';
NEW : 'NEW';
LT : 'LT';
UTC : 'UTC';
EOL : '\r'? '\n';
XASM : 'XASM';

fragment FULLSTOP : '.';
fragment SLASH : '/';
fragment MINUS : '-';
fragment PLUS : '+';
fragment ASTRIX : '*';
SPACE : ' ';

fragment A : [A-Z];
fragment N : [0-9];
fragment AN : [A-Z0-9];
fragment X : (AN | FULLSTOP | SLASH | MINUS | PLUS | ASTRIX | SPACE);
MESSAGE_SEQUENCE_REFERENCE : N N A A A N N N N N A N N N;
CREATOR_REFERENCE : SLASH (X)+;
fragment AIRLINE_DESIGNATOR : AN AN A?;
FLIGHT_DESIGNATOR : AIRLINE_DESIGNATOR N N N N?;
OPERATIONAL_SUFFIX : A;
DEI1 : '1' SLASH AIRLINE_DESIGNATOR SLASH AIRLINE_DESIGNATOR (SLASH AIRLINE_DESIGNATOR)?;
DEI2 : '2' SLASH (AIRLINE_DESIGNATOR | 'X');
DEI3 : '3' SLASH (AIRLINE_DESIGNATOR | 'X');
DEI4 : '4' SLASH (AIRLINE_DESIGNATOR | 'X');
DEI5 : '5' SLASH (AIRLINE_DESIGNATOR | 'X');
DEI9 : '9' SLASH (AIRLINE_DESIGNATOR | 'X');