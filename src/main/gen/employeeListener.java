// Generated from /home/mnilanga/Assignments/textprocessor/src/main/antlr/ssm/Employee.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link employeeParser}.
 */
public interface employeeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link employeeParser#employeeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmployeeDeclaration(employeeParser.EmployeeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link employeeParser#employeeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmployeeDeclaration(employeeParser.EmployeeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link employeeParser#empID}.
	 * @param ctx the parse tree
	 */
	void enterEmpID(employeeParser.EmpIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link employeeParser#empID}.
	 * @param ctx the parse tree
	 */
	void exitEmpID(employeeParser.EmpIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link employeeParser#firstName}.
	 * @param ctx the parse tree
	 */
	void enterFirstName(employeeParser.FirstNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link employeeParser#firstName}.
	 * @param ctx the parse tree
	 */
	void exitFirstName(employeeParser.FirstNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link employeeParser#secondName}.
	 * @param ctx the parse tree
	 */
	void enterSecondName(employeeParser.SecondNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link employeeParser#secondName}.
	 * @param ctx the parse tree
	 */
	void exitSecondName(employeeParser.SecondNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link employeeParser#department}.
	 * @param ctx the parse tree
	 */
	void enterDepartment(employeeParser.DepartmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link employeeParser#department}.
	 * @param ctx the parse tree
	 */
	void exitDepartment(employeeParser.DepartmentContext ctx);
}