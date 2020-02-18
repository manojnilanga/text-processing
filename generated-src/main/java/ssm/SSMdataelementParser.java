// Generated from ssm/SSMdataelement.g4 by ANTLR 4.7.1
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
public class SSMdataelementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ALPHA=5, NUM=6, ALPHANUM=7, PERIOD=8, 
		SLASH=9, MINUS=10, PLUS=11, ASTERISK=12, ANYCHARACTER=13, EOL=14, SPACE=15;
	public static final int
		RULE_standardMessageIdentifier = 0, RULE_timeMode = 1, RULE_messageSequenceReference = 2, 
		RULE_creatorReference = 3, RULE_actionIdentifier = 4, RULE_asmWithdrawalIndicator = 5, 
		RULE_eol = 6;
	public static final String[] ruleNames = {
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
	public String getGrammarFileName() { return "SSMdataelement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SSMdataelementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StandardMessageIdentifierContext extends ParserRuleContext {
		public StandardMessageIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardMessageIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).enterStandardMessageIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).exitStandardMessageIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSMdataelementVisitor ) return ((SSMdataelementVisitor<? extends T>)visitor).visitStandardMessageIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardMessageIdentifierContext standardMessageIdentifier() throws RecognitionException {
		StandardMessageIdentifierContext _localctx = new StandardMessageIdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_standardMessageIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
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
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).enterTimeMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).exitTimeMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSMdataelementVisitor ) return ((SSMdataelementVisitor<? extends T>)visitor).visitTimeMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeModeContext timeMode() throws RecognitionException {
		TimeModeContext _localctx = new TimeModeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_timeMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
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
		public List<TerminalNode> NUM() { return getTokens(SSMdataelementParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SSMdataelementParser.NUM, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(SSMdataelementParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(SSMdataelementParser.ALPHA, i);
		}
		public MessageSequenceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSequenceReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).enterMessageSequenceReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).exitMessageSequenceReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSMdataelementVisitor ) return ((SSMdataelementVisitor<? extends T>)visitor).visitMessageSequenceReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageSequenceReferenceContext messageSequenceReference() throws RecognitionException {
		MessageSequenceReferenceContext _localctx = new MessageSequenceReferenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_messageSequenceReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(NUM);
			setState(19);
			match(NUM);
			setState(20);
			match(ALPHA);
			setState(21);
			match(ALPHA);
			setState(22);
			match(ALPHA);
			setState(23);
			match(NUM);
			setState(24);
			match(NUM);
			setState(25);
			match(NUM);
			setState(26);
			match(NUM);
			setState(27);
			match(NUM);
			setState(28);
			match(ALPHA);
			setState(29);
			match(NUM);
			setState(30);
			match(NUM);
			setState(31);
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
		public TerminalNode SLASH() { return getToken(SSMdataelementParser.SLASH, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(SSMdataelementParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(SSMdataelementParser.ALPHA, i);
		}
		public CreatorReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creatorReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).enterCreatorReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).exitCreatorReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSMdataelementVisitor ) return ((SSMdataelementVisitor<? extends T>)visitor).visitCreatorReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorReferenceContext creatorReference() throws RecognitionException {
		CreatorReferenceContext _localctx = new CreatorReferenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_creatorReference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(SLASH);
			{
			setState(35); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					((CreatorReferenceContext)_localctx).ALPHA = match(ALPHA);
					((CreatorReferenceContext)_localctx).b.add(((CreatorReferenceContext)_localctx).ALPHA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(39);
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
		public List<TerminalNode> ALPHA() { return getTokens(SSMdataelementParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(SSMdataelementParser.ALPHA, i);
		}
		public ActionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).enterActionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).exitActionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSMdataelementVisitor ) return ((SSMdataelementVisitor<? extends T>)visitor).visitActionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionIdentifierContext actionIdentifier() throws RecognitionException {
		ActionIdentifierContext _localctx = new ActionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ALPHA);
			setState(42);
			match(ALPHA);
			setState(43);
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
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).enterAsmWithdrawalIndicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).exitAsmWithdrawalIndicator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSMdataelementVisitor ) return ((SSMdataelementVisitor<? extends T>)visitor).visitAsmWithdrawalIndicator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmWithdrawalIndicatorContext asmWithdrawalIndicator() throws RecognitionException {
		AsmWithdrawalIndicatorContext _localctx = new AsmWithdrawalIndicatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asmWithdrawalIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
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
		public TerminalNode EOL() { return getToken(SSMdataelementParser.EOL, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSMdataelementListener ) ((SSMdataelementListener)listener).exitEol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSMdataelementVisitor ) return ((SSMdataelementVisitor<? extends T>)visitor).visitEol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
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
		case 3:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\6\5&\n\5\r"+
		"\5\16\5\'\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n"+
		"\f\16\2\3\3\2\4\5\2-\2\20\3\2\2\2\4\22\3\2\2\2\6\24\3\2\2\2\b#\3\2\2\2"+
		"\n+\3\2\2\2\f/\3\2\2\2\16\61\3\2\2\2\20\21\7\3\2\2\21\3\3\2\2\2\22\23"+
		"\t\2\2\2\23\5\3\2\2\2\24\25\7\b\2\2\25\26\7\b\2\2\26\27\7\7\2\2\27\30"+
		"\7\7\2\2\30\31\7\7\2\2\31\32\7\b\2\2\32\33\7\b\2\2\33\34\7\b\2\2\34\35"+
		"\7\b\2\2\35\36\7\b\2\2\36\37\7\7\2\2\37 \7\b\2\2 !\7\b\2\2!\"\7\b\2\2"+
		"\"\7\3\2\2\2#%\7\13\2\2$&\7\7\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3"+
		"\2\2\2()\3\2\2\2)*\6\5\2\3*\t\3\2\2\2+,\7\7\2\2,-\7\7\2\2-.\7\7\2\2.\13"+
		"\3\2\2\2/\60\7\6\2\2\60\r\3\2\2\2\61\62\7\20\2\2\62\17\3\2\2\2\3\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}