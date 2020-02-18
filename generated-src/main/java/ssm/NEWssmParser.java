// Generated from ssm/NEWssm.g4 by ANTLR 4.7.1
package com.accelaero.aeroconnect.textprocessor.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NEWssmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ALPHA=5, NUM=6, ALPHANUM=7, PERIOD=8, 
		SLASH=9, MINUS=10, PLUS=11, ASTERISK=12, ANYCHARACTER=13, EOL=14, SPACE=15;
	public static final int
		RULE_ssmInput = 0, RULE_conditionalStatement_1 = 1, RULE_messageReference = 2, 
		RULE_conditionalStatement_2 = 3, RULE_standardMessageIdentifier = 4, RULE_timeMode = 5, 
		RULE_messageSequenceReference = 6, RULE_creatorReference = 7, RULE_actionIdentifier = 8, 
		RULE_asmWithdrawalIndicator = 9, RULE_eol = 10;
	public static final String[] ruleNames = {
		"ssmInput", "conditionalStatement_1", "messageReference", "conditionalStatement_2", 
		"standardMessageIdentifier", "timeMode", "messageSequenceReference", "creatorReference", 
		"actionIdentifier", "asmWithdrawalIndicator", "eol"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SSM'", "'LT'", "'UTC'", "'XASM'", null, null, null, "'.'", "'/'", 
		"'-'", "'+'", "'*'", null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ALPHA", "NUM", "ALPHANUM", "PERIOD", "SLASH", 
		"MINUS", "PLUS", "ASTERISK", "ANYCHARACTER", "EOL", "SPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NEWssm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NEWssmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SsmInputContext extends ParserRuleContext {
		public StandardMessageIdentifierContext standardMessageIdentifier() {
			return getRuleContext(StandardMessageIdentifierContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public ConditionalStatement_1Context conditionalStatement_1() {
			return getRuleContext(ConditionalStatement_1Context.class,0);
		}
		public ConditionalStatement_2Context conditionalStatement_2() {
			return getRuleContext(ConditionalStatement_2Context.class,0);
		}
		public SsmInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ssmInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterSsmInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitSsmInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitSsmInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SsmInputContext ssmInput() throws RecognitionException {
		SsmInputContext _localctx = new SsmInputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ssmInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			standardMessageIdentifier();
			setState(23);
			eol();
			setState(24);
			conditionalStatement_1();
			setState(25);
			conditionalStatement_2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatement_1Context extends ParserRuleContext {
		public TimeModeContext timeMode() {
			return getRuleContext(TimeModeContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public MessageReferenceContext messageReference() {
			return getRuleContext(MessageReferenceContext.class,0);
		}
		public ActionIdentifierContext actionIdentifier() {
			return getRuleContext(ActionIdentifierContext.class,0);
		}
		public ConditionalStatement_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterConditionalStatement_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitConditionalStatement_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitConditionalStatement_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatement_1Context conditionalStatement_1() throws RecognitionException {
		ConditionalStatement_1Context _localctx = new ConditionalStatement_1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_conditionalStatement_1);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(27);
				timeMode();
				setState(28);
				eol();
				setState(29);
				messageReference();
				setState(30);
				actionIdentifier();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(32);
				messageReference();
				setState(33);
				actionIdentifier();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(35);
				timeMode();
				setState(36);
				eol();
				setState(37);
				actionIdentifier();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(39);
				actionIdentifier();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageReferenceContext extends ParserRuleContext {
		public MessageSequenceReferenceContext messageSequenceReference() {
			return getRuleContext(MessageSequenceReferenceContext.class,0);
		}
		public CreatorReferenceContext creatorReference() {
			return getRuleContext(CreatorReferenceContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public MessageReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterMessageReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitMessageReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitMessageReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageReferenceContext messageReference() throws RecognitionException {
		MessageReferenceContext _localctx = new MessageReferenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_messageReference);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(42);
				messageSequenceReference();
				setState(43);
				creatorReference();
				setState(44);
				eol();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(46);
				messageSequenceReference();
				setState(47);
				eol();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(49);
				creatorReference();
				setState(50);
				eol();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatement_2Context extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(NEWssmParser.SPACE, 0); }
		public AsmWithdrawalIndicatorContext asmWithdrawalIndicator() {
			return getRuleContext(AsmWithdrawalIndicatorContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public ConditionalStatement_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterConditionalStatement_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitConditionalStatement_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitConditionalStatement_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatement_2Context conditionalStatement_2() throws RecognitionException {
		ConditionalStatement_2Context _localctx = new ConditionalStatement_2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditionalStatement_2);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(54);
				match(SPACE);
				setState(55);
				asmWithdrawalIndicator();
				setState(56);
				eol();
				}
				}
				break;
			case EOL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(58);
				eol();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandardMessageIdentifierContext extends ParserRuleContext {
		public StandardMessageIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardMessageIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterStandardMessageIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitStandardMessageIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitStandardMessageIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardMessageIdentifierContext standardMessageIdentifier() throws RecognitionException {
		StandardMessageIdentifierContext _localctx = new StandardMessageIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_standardMessageIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeModeContext extends ParserRuleContext {
		public TimeModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterTimeMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitTimeMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitTimeMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeModeContext timeMode() throws RecognitionException {
		TimeModeContext _localctx = new TimeModeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_timeMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageSequenceReferenceContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(NEWssmParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(NEWssmParser.NUM, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(NEWssmParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(NEWssmParser.ALPHA, i);
		}
		public MessageSequenceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSequenceReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterMessageSequenceReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitMessageSequenceReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitMessageSequenceReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageSequenceReferenceContext messageSequenceReference() throws RecognitionException {
		MessageSequenceReferenceContext _localctx = new MessageSequenceReferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_messageSequenceReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(NUM);
			setState(66);
			match(NUM);
			setState(67);
			match(ALPHA);
			setState(68);
			match(ALPHA);
			setState(69);
			match(ALPHA);
			setState(70);
			match(NUM);
			setState(71);
			match(NUM);
			setState(72);
			match(NUM);
			setState(73);
			match(NUM);
			setState(74);
			match(NUM);
			setState(75);
			match(ALPHA);
			setState(76);
			match(NUM);
			setState(77);
			match(NUM);
			setState(78);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorReferenceContext extends ParserRuleContext {
		public Token ALPHA;
		public List<Token> b = new ArrayList<Token>();
		public TerminalNode SLASH() { return getToken(NEWssmParser.SLASH, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(NEWssmParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(NEWssmParser.ALPHA, i);
		}
		public CreatorReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creatorReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterCreatorReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitCreatorReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitCreatorReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorReferenceContext creatorReference() throws RecognitionException {
		CreatorReferenceContext _localctx = new CreatorReferenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_creatorReference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(SLASH);
			{
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(81);
					((CreatorReferenceContext)_localctx).ALPHA = match(ALPHA);
					((CreatorReferenceContext)_localctx).b.add(((CreatorReferenceContext)_localctx).ALPHA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(86);
			if (!(((CreatorReferenceContext)_localctx).b.size() <= 35)) throw new FailedPredicateException(this, "$b.size() <= 35");
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(NEWssmParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(NEWssmParser.ALPHA, i);
		}
		public ActionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterActionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitActionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitActionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionIdentifierContext actionIdentifier() throws RecognitionException {
		ActionIdentifierContext _localctx = new ActionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_actionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ALPHA);
			setState(89);
			match(ALPHA);
			setState(90);
			match(ALPHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmWithdrawalIndicatorContext extends ParserRuleContext {
		public AsmWithdrawalIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmWithdrawalIndicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterAsmWithdrawalIndicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitAsmWithdrawalIndicator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitAsmWithdrawalIndicator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmWithdrawalIndicatorContext asmWithdrawalIndicator() throws RecognitionException {
		AsmWithdrawalIndicatorContext _localctx = new AsmWithdrawalIndicatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asmWithdrawalIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(NEWssmParser.EOL, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NEWssmListener ) ((NEWssmListener)listener).exitEol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NEWssmVisitor ) return ((NEWssmVisitor<? extends T>)visitor).visitEol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return creatorReference_sempred((CreatorReferenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean creatorReference_sempred(CreatorReferenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return ((CreatorReferenceContext)_localctx).b.size() <= 35;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\67\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\6\tU\n\t\r\t\16\tV\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26"+
		"\2\3\3\2\4\5\2^\2\30\3\2\2\2\4*\3\2\2\2\6\66\3\2\2\2\b=\3\2\2\2\n?\3\2"+
		"\2\2\fA\3\2\2\2\16C\3\2\2\2\20R\3\2\2\2\22Z\3\2\2\2\24^\3\2\2\2\26`\3"+
		"\2\2\2\30\31\5\n\6\2\31\32\5\26\f\2\32\33\5\4\3\2\33\34\5\b\5\2\34\3\3"+
		"\2\2\2\35\36\5\f\7\2\36\37\5\26\f\2\37 \5\6\4\2 !\5\22\n\2!+\3\2\2\2\""+
		"#\5\6\4\2#$\5\22\n\2$+\3\2\2\2%&\5\f\7\2&\'\5\26\f\2\'(\5\22\n\2(+\3\2"+
		"\2\2)+\5\22\n\2*\35\3\2\2\2*\"\3\2\2\2*%\3\2\2\2*)\3\2\2\2+\5\3\2\2\2"+
		",-\5\16\b\2-.\5\20\t\2./\5\26\f\2/\67\3\2\2\2\60\61\5\16\b\2\61\62\5\26"+
		"\f\2\62\67\3\2\2\2\63\64\5\20\t\2\64\65\5\26\f\2\65\67\3\2\2\2\66,\3\2"+
		"\2\2\66\60\3\2\2\2\66\63\3\2\2\2\67\7\3\2\2\289\7\21\2\29:\5\24\13\2:"+
		";\5\26\f\2;>\3\2\2\2<>\5\26\f\2=8\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?@\7\3\2"+
		"\2@\13\3\2\2\2AB\t\2\2\2B\r\3\2\2\2CD\7\b\2\2DE\7\b\2\2EF\7\7\2\2FG\7"+
		"\7\2\2GH\7\7\2\2HI\7\b\2\2IJ\7\b\2\2JK\7\b\2\2KL\7\b\2\2LM\7\b\2\2MN\7"+
		"\7\2\2NO\7\b\2\2OP\7\b\2\2PQ\7\b\2\2Q\17\3\2\2\2RT\7\13\2\2SU\7\7\2\2"+
		"TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\6\t\2\3Y\21\3\2\2"+
		"\2Z[\7\7\2\2[\\\7\7\2\2\\]\7\7\2\2]\23\3\2\2\2^_\7\6\2\2_\25\3\2\2\2`"+
		"a\7\20\2\2a\27\3\2\2\2\6*\66=V";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}