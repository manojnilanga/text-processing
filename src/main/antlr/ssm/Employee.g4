grammar Employee ;
employeeDeclaration : '[' empID ']' firstName secondName '-' department;
empID : ID ;
firstName : ALPHABET ;
secondName : ALPHABET ;
department : ALPHABET ;
ALPHABET : [a-zA-Z]+;
ID : [0-9]+;
