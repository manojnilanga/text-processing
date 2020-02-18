// Generated from ssm/SsmNew.g4 by ANTLR 4.7.1
package com.accelaero.aeroconnect.textprocessor.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SsmNewParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SsmNewVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#ssmNewMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsmNewMessage(SsmNewParser.SsmNewMessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#standardMessageIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardMessageIdentifier(SsmNewParser.StandardMessageIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#condition_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_1(SsmNewParser.Condition_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#timeMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeMode(SsmNewParser.TimeModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#condition_1_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_1_1(SsmNewParser.Condition_1_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#messageSequenceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageSequenceReference(SsmNewParser.MessageSequenceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#condition_1_1_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_1_1_1(SsmNewParser.Condition_1_1_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#creatorReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorReference(SsmNewParser.CreatorReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#actionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionIdentifier(SsmNewParser.ActionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#condition_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_2(SsmNewParser.Condition_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#asmWithdrawalIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmWithdrawalIndicator(SsmNewParser.AsmWithdrawalIndicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#flightDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightDesignator(SsmNewParser.FlightDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#operationalSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationalSuffix(SsmNewParser.OperationalSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#condition_3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_3(SsmNewParser.Condition_3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#condition_3_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_3_1(SsmNewParser.Condition_3_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#condition_3_1_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_3_1_1(SsmNewParser.Condition_3_1_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#jointOperationAirlineDesignatorsDEI1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJointOperationAirlineDesignatorsDEI1(SsmNewParser.JointOperationAirlineDesignatorsDEI1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#codeSharingCommercialDuplicateDEI2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeSharingCommercialDuplicateDEI2(SsmNewParser.CodeSharingCommercialDuplicateDEI2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#aircraftOwnerDEI3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAircraftOwnerDEI3(SsmNewParser.AircraftOwnerDEI3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#cockpitCrewEmployerDEI4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCockpitCrewEmployerDEI4(SsmNewParser.CockpitCrewEmployerDEI4Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#cabinCrewEmployerDEI5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabinCrewEmployerDEI5(SsmNewParser.CabinCrewEmployerDEI5Context ctx);
	/**
	 * Visit a parse tree produced by {@link SsmNewParser#codeSharingSharedAirlineDesignationOrWetLeaseAirlineDesignationDEI9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeSharingSharedAirlineDesignationOrWetLeaseAirlineDesignationDEI9(SsmNewParser.CodeSharingSharedAirlineDesignationOrWetLeaseAirlineDesignationDEI9Context ctx);
}