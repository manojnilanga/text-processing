// Generated from ssm/Employee.g4 by ANTLR 4.7.1
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
public class EmployeeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ALPHABET=4, ID=5;
	public static final int
		RULE_employeeDeclaration = 0, RULE_empID = 1, RULE_firstName = 2, RULE_secondName = 3, 
		RULE_department = 4;
	public static final String[] ruleNames = {
		"employeeDeclaration", "empID", "firstName", "secondName", "department"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ALPHABET", "ID"
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
	public String getGrammarFileName() { return "Employee.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EmployeeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EmployeeDeclarationContext extends ParserRuleContext {
		public EmpIDContext empID() {
			return getRuleContext(EmpIDContext.class,0);
		}
		public FirstNameContext firstName() {
			return getRuleContext(FirstNameContext.class,0);
		}
		public SecondNameContext secondName() {
			return getRuleContext(SecondNameContext.class,0);
		}
		public DepartmentContext department() {
			return getRuleContext(DepartmentContext.class,0);
		}
		public EmployeeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_employeeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).enterEmployeeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).exitEmployeeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmployeeVisitor ) return ((EmployeeVisitor<? extends T>)visitor).visitEmployeeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmployeeDeclarationContext employeeDeclaration() throws RecognitionException {
		EmployeeDeclarationContext _localctx = new EmployeeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_employeeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			empID();
			setState(12);
			match(T__1);
			setState(13);
			firstName();
			setState(14);
			secondName();
			setState(15);
			match(T__2);
			setState(16);
			department();
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

	public static class EmpIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmployeeParser.ID, 0); }
		public EmpIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).enterEmpID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).exitEmpID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmployeeVisitor ) return ((EmployeeVisitor<? extends T>)visitor).visitEmpID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmpIDContext empID() throws RecognitionException {
		EmpIDContext _localctx = new EmpIDContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_empID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ID);
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

	public static class FirstNameContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(EmployeeParser.ALPHABET, 0); }
		public FirstNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).enterFirstName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).exitFirstName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmployeeVisitor ) return ((EmployeeVisitor<? extends T>)visitor).visitFirstName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstNameContext firstName() throws RecognitionException {
		FirstNameContext _localctx = new FirstNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_firstName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(ALPHABET);
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

	public static class SecondNameContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(EmployeeParser.ALPHABET, 0); }
		public SecondNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).enterSecondName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).exitSecondName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmployeeVisitor ) return ((EmployeeVisitor<? extends T>)visitor).visitSecondName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondNameContext secondName() throws RecognitionException {
		SecondNameContext _localctx = new SecondNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_secondName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(ALPHABET);
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

	public static class DepartmentContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(EmployeeParser.ALPHABET, 0); }
		public DepartmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_department; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).enterDepartment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmployeeListener ) ((EmployeeListener)listener).exitDepartment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmployeeVisitor ) return ((EmployeeVisitor<? extends T>)visitor).visitDepartment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepartmentContext department() throws RecognitionException {
		DepartmentContext _localctx = new DepartmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_department);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(ALPHABET);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\35\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2\27\2\f\3\2\2\2\4\24\3"+
		"\2\2\2\6\26\3\2\2\2\b\30\3\2\2\2\n\32\3\2\2\2\f\r\7\3\2\2\r\16\5\4\3\2"+
		"\16\17\7\4\2\2\17\20\5\6\4\2\20\21\5\b\5\2\21\22\7\5\2\2\22\23\5\n\6\2"+
		"\23\3\3\2\2\2\24\25\7\7\2\2\25\5\3\2\2\2\26\27\7\6\2\2\27\7\3\2\2\2\30"+
		"\31\7\6\2\2\31\t\3\2\2\2\32\33\7\6\2\2\33\13\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}