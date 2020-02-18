// Generated from ssm/SSMdataelement.g4 by ANTLR 4.7.1
package com.accelaero.aeroconnect.textprocessor.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SSMdataelementParser}.
 */
public interface SSMdataelementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SSMdataelementParser#standardMessageIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterStandardMessageIdentifier(SSMdataelementParser.StandardMessageIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSMdataelementParser#standardMessageIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitStandardMessageIdentifier(SSMdataelementParser.StandardMessageIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSMdataelementParser#timeMode}.
	 * @param ctx the parse tree
	 */
	void enterTimeMode(SSMdataelementParser.TimeModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSMdataelementParser#timeMode}.
	 * @param ctx the parse tree
	 */
	void exitTimeMode(SSMdataelementParser.TimeModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSMdataelementParser#messageSequenceReference}.
	 * @param ctx the parse tree
	 */
	void enterMessageSequenceReference(SSMdataelementParser.MessageSequenceReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSMdataelementParser#messageSequenceReference}.
	 * @param ctx the parse tree
	 */
	void exitMessageSequenceReference(SSMdataelementParser.MessageSequenceReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSMdataelementParser#creatorReference}.
	 * @param ctx the parse tree
	 */
	void enterCreatorReference(SSMdataelementParser.CreatorReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSMdataelementParser#creatorReference}.
	 * @param ctx the parse tree
	 */
	void exitCreatorReference(SSMdataelementParser.CreatorReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSMdataelementParser#actionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterActionIdentifier(SSMdataelementParser.ActionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSMdataelementParser#actionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitActionIdentifier(SSMdataelementParser.ActionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSMdataelementParser#asmWithdrawalIndicator}.
	 * @param ctx the parse tree
	 */
	void enterAsmWithdrawalIndicator(SSMdataelementParser.AsmWithdrawalIndicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSMdataelementParser#asmWithdrawalIndicator}.
	 * @param ctx the parse tree
	 */
	void exitAsmWithdrawalIndicator(SSMdataelementParser.AsmWithdrawalIndicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSMdataelementParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(SSMdataelementParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSMdataelementParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(SSMdataelementParser.EolContext ctx);
}