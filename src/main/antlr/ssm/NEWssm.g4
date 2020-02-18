grammar NEWssm ;
import SSMdataelement ;

ssmInput : standardMessageIdentifier eol conditionalStatement_1  conditionalStatement_2 ;

conditionalStatement_1  : (timeMode eol messageReference actionIdentifier) |  (messageReference actionIdentifier) | (timeMode eol actionIdentifier) | (actionIdentifier);

messageReference : (messageSequenceReference creatorReference eol) | (messageSequenceReference eol) | (creatorReference eol) ;

conditionalStatement_2 : (SPACE asmWithdrawalIndicator eol) | (eol) ;
