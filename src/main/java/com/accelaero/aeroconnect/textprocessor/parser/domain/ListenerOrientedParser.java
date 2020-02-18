package com.accelaero.aeroconnect.textprocessor.parser.domain;




import com.accelaero.aeroconnect.textprocessor.parser.EmployeeBaseListener;
import com.accelaero.aeroconnect.textprocessor.parser.EmployeeLexer;
import com.accelaero.aeroconnect.textprocessor.parser.EmployeeParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by jdziworski on 30.03.16.
 */
/*public class ListenerOrientedParser implements Parser{

    @Override
    public Class parse(String code) {
        CharStream charStream = new ANTLRInputStream(code);
        SomeLanguageLexer lexer = new SomeLanguageLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        SomeLanguageParser parser = new SomeLanguageParser(tokens);

        ClassListener classListener = new ClassListener();
        parser.classDeclaration().enterRule(classListener);
        return classListener.getParsedClass();
    }

    class ClassListener extends SomeLanguageBaseListener {

        private Class parsedClass;

        @Override
        public void enterClassDeclaration(@NotNull SomeLanguageParser.ClassDeclarationContext ctx) {
            String className = ctx.className().getText();
            MethodListener methodListener = new MethodListener();
            ctx.method().forEach(method -> method.enterRule(methodListener));
            Collection<Method> methods = methodListener.getMethods();
            parsedClass = new Class(className,methods);
        }

        public Class getParsedClass() {
            return parsedClass;
        }
    }

    class MethodListener extends SomeLanguageBaseListener {

        private Collection<Method> methods;

        public MethodListener() {
            methods = new ArrayList<>();
        }

        @Override
        public void enterMethod(@NotNull SomeLanguageParser.MethodContext ctx) {
            String methodName = ctx.methodName().getText();
            InstructionListener instructionListener = new InstructionListener();
            ctx.instruction().forEach(instruction -> instruction.enterRule(instructionListener));
            Collection<Instruction> instructions = instructionListener.getInstructions();
            methods.add(new Method(methodName, instructions));
        }

        public Collection<Method> getMethods() {
            return methods;
        }
    }

    class InstructionListener extends SomeLanguageBaseListener {

        private Collection<Instruction> instructions;

        public InstructionListener() {
            instructions = new ArrayList<>();
        }

        @Override
        public void enterInstruction(@NotNull SomeLanguageParser.InstructionContext ctx) {
            String instructionName = ctx.getText();
            instructions.add(new Instruction(instructionName));
        }

        public Collection<Instruction> getInstructions() {
            return instructions;
        }
    }
}*/


public class ListenerOrientedParser implements Parser{

    @Override
    public Class parse(String employeeSourceCode) {
        CharStream charStream = new ANTLRInputStream(employeeSourceCode);
        EmployeeLexer lexer = new EmployeeLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        EmployeeParser parser = new EmployeeParser(tokens);

        EmployeeListener employeeListener = new EmployeeListener();
        parser.employeeDeclaration().enterRule(employeeListener);
        return employeeListener.getParsedClass();
    }

    class EmployeeListener extends EmployeeBaseListener {

        private Class parsedClass;

        @Override
        public void enterEmployeeDeclaration(@NotNull EmployeeParser.EmployeeDeclarationContext ctx) {

            int empID = Integer.parseInt(ctx.empID().getText());
            String firstName = ctx.firstName().getText();
            String secondName = ctx.secondName().getText();
            String department = ctx.department().getText();
        }

        public Class getParsedClass() {
            return parsedClass;
        }
    }



}
