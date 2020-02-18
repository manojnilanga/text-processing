grammar SSMdataelement;


standardMessageIdentifier : 'SSM' ;

timeMode : 'LT' | 'UTC'  ;

messageSequenceReference : NUM NUM ALPHA ALPHA ALPHA NUM NUM NUM NUM NUM ALPHA NUM NUM NUM ;

creatorReference : SLASH ((b+=ALPHA)+ {$b.size() <= 35}?) ;

actionIdentifier : ALPHA ALPHA ALPHA ;

asmWithdrawalIndicator : 'XASM' ;

eol : EOL ;


ALPHA    : [A-Z];
NUM :   [0-9];
ALPHANUM :  (ALPHA|NUM);
PERIOD : '.' ;
SLASH : '/' ;
MINUS : '-' ;
PLUS : '+' ;
ASTERISK : '*' ;
ANYCHARACTER : [A-Z0-9/.-];
EOL : [\n] ;
SPACE : ' ' ;