// Generated from ssm/Employee.g4 by ANTLR 4.7.1
package com.accelaero.aeroconnect.textprocessor.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EmployeeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EmployeeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EmployeeParser#employeeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmployeeDeclaration(EmployeeParser.EmployeeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmployeeParser#empID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpID(EmployeeParser.EmpIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmployeeParser#firstName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstName(EmployeeParser.FirstNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmployeeParser#secondName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondName(EmployeeParser.SecondNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmployeeParser#department}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartment(EmployeeParser.DepartmentContext ctx);
}