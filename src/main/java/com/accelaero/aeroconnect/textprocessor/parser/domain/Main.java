package com.accelaero.aeroconnect.textprocessor.parser.domain;

//import com.google.gson.Gson;

/**
 * Created by jdziworski on 30.03.16.
 */

/*public class Main {
    private static final String someLangSourceCode =
            "class SomeClass {\n"+
                    "    fun1 {\n"+
                    "        instruction11\n"+
                    "        instruction12\n"+
                    "    }\n"+
                    "    fun2 {\n"+
                    "        instruction21\n"+
                    "        instruction22\n"+
                    "    }\n"+
                    "}";

            "[23] Subangani Nagarasa-DEV";

    private static final String ssm = "SSM\n" +
            "LT\n" +
            "24MAY00144E003/REF 123/449\n" +
            "NEW XASM\n";

    public static void main(String[] args) {
        final Class result = new VisitorOrientedParser().parse(someLangSourceCode);
//        Gson gson = new Gson();
//        final String json = gson.toJson(result);
        System.out.printf("code below: %n '%s' %n has been parsed to object: %n '%s'%n",someLangSourceCode,result.toString());

        final TestSSM TestSSM = new VisitorParserTestSSM().parse(ssm);
        System.out.println(TestSSM.toString());
    }
}*/

public class Main{
    private static final String employeeSourceCode = "[23] Subangani Nagarasa-DEV";

    public static void main(String[] args) {
        final Class result = new VisitorOrientedParser().parse(employeeSourceCode);
//        Gson gson = new Gson();
//        final String json = gson.toJson(result);
        System.out.printf("code below: %n '%s' %n has been parsed to object: %n '%s'%n",employeeSourceCode,result.toString());

//        final TestSSM TestSSM = new VisitorParserTestSSM().parse(ssm);
//        System.out.println(TestSSM.toString());
        String query = "INSERT INTO `employee` (KEY, VALUE)\n" +
                "VALUES (\"empID\" : \"01\", \"firstName\" : \"Manoj\", \"secondName\":\"Nilanga\", \"department\":\"aeroConnect\")";
    }

}
