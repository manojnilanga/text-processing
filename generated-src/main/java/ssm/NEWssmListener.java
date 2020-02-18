// Generated from ssm/NEWssm.g4 by ANTLR 4.7.1
package com.accelaero.aeroconnect.textprocessor.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NEWssmParser}.
 */
public interface NEWssmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#ssmInput}.
	 * @param ctx the parse tree
	 */
	void enterSsmInput(NEWssmParser.SsmInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#ssmInput}.
	 * @param ctx the parse tree
	 */
	void exitSsmInput(NEWssmParser.SsmInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#conditionalStatement_1}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement_1(NEWssmParser.ConditionalStatement_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#conditionalStatement_1}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement_1(NEWssmParser.ConditionalStatement_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#messageReference}.
	 * @param ctx the parse tree
	 */
	void enterMessageReference(NEWssmParser.MessageReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#messageReference}.
	 * @param ctx the parse tree
	 */
	void exitMessageReference(NEWssmParser.MessageReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#conditionalStatement_2}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement_2(NEWssmParser.ConditionalStatement_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#conditionalStatement_2}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement_2(NEWssmParser.ConditionalStatement_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#standardMessageIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterStandardMessageIdentifier(NEWssmParser.StandardMessageIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#standardMessageIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitStandardMessageIdentifier(NEWssmParser.StandardMessageIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#timeMode}.
	 * @param ctx the parse tree
	 */
	void enterTimeMode(NEWssmParser.TimeModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#timeMode}.
	 * @param ctx the parse tree
	 */
	void exitTimeMode(NEWssmParser.TimeModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#messageSequenceReference}.
	 * @param ctx the parse tree
	 */
	void enterMessageSequenceReference(NEWssmParser.MessageSequenceReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#messageSequenceReference}.
	 * @param ctx the parse tree
	 */
	void exitMessageSequenceReference(NEWssmParser.MessageSequenceReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#creatorReference}.
	 * @param ctx the parse tree
	 */
	void enterCreatorReference(NEWssmParser.CreatorReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#creatorReference}.
	 * @param ctx the parse tree
	 */
	void exitCreatorReference(NEWssmParser.CreatorReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#actionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterActionIdentifier(NEWssmParser.ActionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#actionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitActionIdentifier(NEWssmParser.ActionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#asmWithdrawalIndicator}.
	 * @param ctx the parse tree
	 */
	void enterAsmWithdrawalIndicator(NEWssmParser.AsmWithdrawalIndicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#asmWithdrawalIndicator}.
	 * @param ctx the parse tree
	 */
	void exitAsmWithdrawalIndicator(NEWssmParser.AsmWithdrawalIndicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NEWssmParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(NEWssmParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link NEWssmParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(NEWssmParser.EolContext ctx);
}