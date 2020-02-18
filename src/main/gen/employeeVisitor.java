// Generated from /home/mnilanga/Assignments/textprocessor/src/main/antlr/ssm/Employee.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link employeeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface employeeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link employeeParser#employeeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmployeeDeclaration(employeeParser.EmployeeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link employeeParser#empID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpID(employeeParser.EmpIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link employeeParser#firstName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstName(employeeParser.FirstNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link employeeParser#secondName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondName(employeeParser.SecondNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link employeeParser#department}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartment(employeeParser.DepartmentContext ctx);
}