package com.accelaero.aeroconnect.textprocessor.parser.domain;


import com.accelaero.aeroconnect.textprocessor.parser.*;
import com.accelaero.aeroconnect.textprocessor.parser.EmployeeBaseVisitor;
import com.accelaero.aeroconnect.textprocessor.parser.EmployeeLexer;
import com.accelaero.aeroconnect.textprocessor.parser.EmployeeParser;
import com.accelaero.aeroconnect.textprocessor.parser.SomeLanguageBaseVisitor;
import com.accelaero.aeroconnect.textprocessor.parser.SomeLanguageLexer;
import com.accelaero.aeroconnect.textprocessor.parser.SomeLanguageParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by jdziworski on 30.03.16.
 */
/*public class VisitorOrientedParser implements Parser {

    public Class parse(String someLangSourceCode) {
        CharStream charStream = new ANTLRInputStream(someLangSourceCode);
        SomeLanguageLexer lexer = new SomeLanguageLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        SomeLanguageParser parser = new SomeLanguageParser(tokens);

        ClassVisitor classVisitor = new ClassVisitor();
        Class traverseResult = classVisitor.visit(parser.classDeclaration());
        return traverseResult;
    }

    private static class ClassVisitor extends SomeLanguageBaseVisitor<Class> {
        @Override
        public Class visitClassDeclaration(@NotNull SomeLanguageParser.ClassDeclarationContext ctx) {
            String className = ctx.className().getText();
            MethodVisitor methodVisitor = new MethodVisitor();
            List<Method> methods = ctx.method()
                    .stream()
                    .map(method -> method.accept(methodVisitor))
                    .collect(toList());
            return new Class(className, methods);
        }
    }

    private static class MethodVisitor extends SomeLanguageBaseVisitor<Method> {
        @Override
        public Method visitMethod(@NotNull SomeLanguageParser.MethodContext ctx) {
            String methodName = ctx.methodName().getText();
            InstructionVisitor instructionVisitor = new InstructionVisitor();
            List<Instruction> instructions = ctx.instruction()
                    .stream()
                    .map(instruction -> instruction.accept(instructionVisitor))
                    .collect(toList());
            return new Method(methodName, instructions);
        }
    }

    private static class InstructionVisitor extends  SomeLanguageBaseVisitor<Instruction> {

        @Override
        public Instruction visitInstruction(@NotNull SomeLanguageParser.InstructionContext ctx) {
            String instructionName = ctx.getText();
            return new Instruction(instructionName);
        }
    }
}*/


public class VisitorOrientedParser implements Parser {

    public Class parse(String employeeSourceCode) {
        CharStream charStream = new ANTLRInputStream(employeeSourceCode);
        EmployeeLexer lexer = new EmployeeLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        com.accelaero.aeroconnect.textprocessor.parser.EmployeeParser parser = new EmployeeParser(tokens);

        EmployeeVisitor employeeVisitor = new EmployeeVisitor();
        Class traverseResult = employeeVisitor.visit(parser.employeeDeclaration());
        return traverseResult;
    }

    private static class EmployeeVisitor extends EmployeeBaseVisitor<Class> {
        @Override
        public Class visitEmployeeDeclaration(@NotNull EmployeeParser.EmployeeDeclarationContext ctx) {

            int empID = Integer.parseInt(ctx.empID().getText());
            String firstName = ctx.firstName().getText();
            String secondName = ctx.secondName().getText();
            String department = ctx.department().getText();

            /*String className = ctx.className().getText();
            MethodVisitor methodVisitor = new MethodVisitor();
            List<Method> methods = ctx.method()
                    .stream()
                    .map(method -> method.accept(methodVisitor))
                    .collect(toList());
            return new Class(className, methods);*/
            return new Class(empID,firstName,secondName,department);
        }
    }

    /*private static class MethodVisitor extends SomeLanguageBaseVisitor<Method> {
        @Override
        public Method visitMethod(@NotNull SomeLanguageParser.MethodContext ctx) {
            String methodName = ctx.methodName().getText();
            InstructionVisitor instructionVisitor = new InstructionVisitor();
            List<Instruction> instructions = ctx.instruction()
                    .stream()
                    .map(instruction -> instruction.accept(instructionVisitor))
                    .collect(toList());
            return new Method(methodName, instructions);
        }
    }

    private static class InstructionVisitor extends  SomeLanguageBaseVisitor<Instruction> {

        @Override
        public Instruction visitInstruction(@NotNull SomeLanguageParser.InstructionContext ctx) {
            String instructionName = ctx.getText();
            return new Instruction(instructionName);
        }
    }*/
}