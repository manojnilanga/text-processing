// Generated from ssm/Employee.g4 by ANTLR 4.7.1
package com.accelaero.aeroconnect.textprocessor.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EmployeeParser}.
 */
public interface EmployeeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EmployeeParser#employeeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmployeeDeclaration(EmployeeParser.EmployeeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmployeeParser#employeeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmployeeDeclaration(EmployeeParser.EmployeeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmployeeParser#empID}.
	 * @param ctx the parse tree
	 */
	void enterEmpID(EmployeeParser.EmpIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmployeeParser#empID}.
	 * @param ctx the parse tree
	 */
	void exitEmpID(EmployeeParser.EmpIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmployeeParser#firstName}.
	 * @param ctx the parse tree
	 */
	void enterFirstName(EmployeeParser.FirstNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmployeeParser#firstName}.
	 * @param ctx the parse tree
	 */
	void exitFirstName(EmployeeParser.FirstNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmployeeParser#secondName}.
	 * @param ctx the parse tree
	 */
	void enterSecondName(EmployeeParser.SecondNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmployeeParser#secondName}.
	 * @param ctx the parse tree
	 */
	void exitSecondName(EmployeeParser.SecondNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmployeeParser#department}.
	 * @param ctx the parse tree
	 */
	void enterDepartment(EmployeeParser.DepartmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmployeeParser#department}.
	 * @param ctx the parse tree
	 */
	void exitDepartment(EmployeeParser.DepartmentContext ctx);
}