// Generated from ssm/NEWssm.g4 by ANTLR 4.7.1
package com.accelaero.aeroconnect.textprocessor.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NEWssmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NEWssmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#ssmInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsmInput(NEWssmParser.SsmInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#conditionalStatement_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement_1(NEWssmParser.ConditionalStatement_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#messageReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageReference(NEWssmParser.MessageReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#conditionalStatement_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement_2(NEWssmParser.ConditionalStatement_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#standardMessageIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardMessageIdentifier(NEWssmParser.StandardMessageIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#timeMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeMode(NEWssmParser.TimeModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#messageSequenceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageSequenceReference(NEWssmParser.MessageSequenceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#creatorReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorReference(NEWssmParser.CreatorReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#actionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionIdentifier(NEWssmParser.ActionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#asmWithdrawalIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmWithdrawalIndicator(NEWssmParser.AsmWithdrawalIndicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NEWssmParser#eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(NEWssmParser.EolContext ctx);
}