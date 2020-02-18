package com.accelaero.aeroconnect.textprocessor.parser.domain;

import com.accelaero.aeroconnect.textprocessor.parser.NEWssmBaseVisitor;
import com.accelaero.aeroconnect.textprocessor.parser.NEWssmLexer;
import com.accelaero.aeroconnect.textprocessor.parser.NEWssmParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * Created by hashinig on 4/1/19.
 */
public class VisitorParserTestSSM  {

    public TestSSM parse(String code) {
        CharStream charStream = new ANTLRInputStream(code);
        NEWssmLexer lexer = new NEWssmLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        NEWssmParser parser = new NEWssmParser(tokens);

        SSMinputVisitor classVisitor = new SSMinputVisitor();
        TestSSM traverseResult = classVisitor.visit(parser.ssmInput());
        return traverseResult;
    }

    private static class SSMinputVisitor extends NEWssmBaseVisitor<TestSSM> {

        @Override
        public TestSSM visitSsmInput(NEWssmParser.SsmInputContext ctx) {
            TestSSM testSSM = new TestSSM();

            StandardMessageIdentifierVisitor standardMessageIdentifierVisitor = new StandardMessageIdentifierVisitor();
            String stdMsgIdf = ctx.standardMessageIdentifier().accept(standardMessageIdentifierVisitor);
            testSSM.setStandardMessageIdentifier(stdMsgIdf);

            TimeModeVisitor timeModeVisitor = new TimeModeVisitor();
            String timeMode = ctx.conditionalStatement_1().timeMode().accept(timeModeVisitor);
            testSSM.setTimeMode(timeMode);

            MessageSeqRefVisitor messageSeqRefVisitor = new MessageSeqRefVisitor();
            String msgSeqRef = ctx.conditionalStatement_1().messageReference().messageSequenceReference().accept(messageSeqRefVisitor);
            testSSM.setMessageSequenceReference(msgSeqRef);

            CreatorRefVisitor creatorRefVisitor = new CreatorRefVisitor();
            String creatorFef = ctx.conditionalStatement_1().messageReference().creatorReference().accept(creatorRefVisitor);
            testSSM.setCreatorReference(creatorFef);

            ActionIdfVisitor actionIdfVisitor = new ActionIdfVisitor();
            String actionIdf = ctx.conditionalStatement_1().actionIdentifier().accept(actionIdfVisitor);
            testSSM.setActionIdentifier(actionIdf);

            ASMWithdrawalVisitor asmWithdrawalVisitor = new ASMWithdrawalVisitor();
            String asw = ctx.conditionalStatement_2().asmWithdrawalIndicator().accept(asmWithdrawalVisitor);

            testSSM.setAsmWithdrawalIndicator(asw);


            return testSSM;
        }

    }

    private static class StandardMessageIdentifierVisitor extends NEWssmBaseVisitor<String> {

        @Override
        public String visitStandardMessageIdentifier(NEWssmParser.StandardMessageIdentifierContext ctx) {
        String stdMsgIdf = ctx.getText();
            return stdMsgIdf;
        }

    }

    private static class TimeModeVisitor extends NEWssmBaseVisitor<String> {

        @Override
        public String visitTimeMode(NEWssmParser.TimeModeContext ctx) {
            String timeMode = ctx.getText();

            return timeMode;
        }

    }

    private static class MessageSeqRefVisitor extends NEWssmBaseVisitor<String> {

        @Override
        public String visitMessageSequenceReference(NEWssmParser.MessageSequenceReferenceContext ctx) {

            return ctx.getText();
        }

    }

    private static class CreatorRefVisitor extends NEWssmBaseVisitor<String> {

        @Override
        public String visitCreatorReference (NEWssmParser.CreatorReferenceContext ctx) {
            return ctx.getText();
        }
    }

    private static class ActionIdfVisitor extends NEWssmBaseVisitor<String> {

        @Override
        public String visitActionIdentifier(NEWssmParser.ActionIdentifierContext ctx) {
            return ctx.getText(); }


    }

    private static class ASMWithdrawalVisitor extends NEWssmBaseVisitor<String>{

        @Override
        public String visitAsmWithdrawalIndicator(NEWssmParser.AsmWithdrawalIndicatorContext ctx) { return ctx.getText(); }
    }
}
