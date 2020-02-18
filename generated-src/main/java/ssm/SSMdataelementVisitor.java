// Generated from ssm/SSMdataelement.g4 by ANTLR 4.7.1
package com.accelaero.aeroconnect.textprocessor.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SSMdataelementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SSMdataelementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SSMdataelementParser#standardMessageIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardMessageIdentifier(SSMdataelementParser.StandardMessageIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSMdataelementParser#timeMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeMode(SSMdataelementParser.TimeModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSMdataelementParser#messageSequenceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageSequenceReference(SSMdataelementParser.MessageSequenceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSMdataelementParser#creatorReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorReference(SSMdataelementParser.CreatorReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSMdataelementParser#actionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionIdentifier(SSMdataelementParser.ActionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSMdataelementParser#asmWithdrawalIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmWithdrawalIndicator(SSMdataelementParser.AsmWithdrawalIndicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSMdataelementParser#eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(SSMdataelementParser.EolContext ctx);
}