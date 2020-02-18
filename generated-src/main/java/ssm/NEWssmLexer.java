// Generated from ssm/NEWssm.g4 by ANTLR 4.7.1
package com.accelaero.aeroconnect.textprocessor.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NEWssmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ALPHA=5, NUM=6, ALPHANUM=7, PERIOD=8, 
		SLASH=9, MINUS=10, PLUS=11, ASTERISK=12, ANYCHARACTER=13, EOL=14, SPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "ALPHA", "NUM", "ALPHANUM", "PERIOD", 
		"SLASH", "MINUS", "PLUS", "ASTERISK", "ANYCHARACTER", "EOL", "SPACE"
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


	public NEWssmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NEWssm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\5"+
		"\b8\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21\3\2\6\3\2C\\\3\2\62;\4\2/;C\\\3\2\f\f\2I\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5%\3\2\2\2\7(\3"+
		"\2\2\2\t,\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2"+
		"\23;\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33C\3\2\2\2\35E\3\2\2"+
		"\2\37G\3\2\2\2!\"\7U\2\2\"#\7U\2\2#$\7O\2\2$\4\3\2\2\2%&\7N\2\2&\'\7V"+
		"\2\2\'\6\3\2\2\2()\7W\2\2)*\7V\2\2*+\7E\2\2+\b\3\2\2\2,-\7Z\2\2-.\7C\2"+
		"\2./\7U\2\2/\60\7O\2\2\60\n\3\2\2\2\61\62\t\2\2\2\62\f\3\2\2\2\63\64\t"+
		"\3\2\2\64\16\3\2\2\2\658\5\13\6\2\668\5\r\7\2\67\65\3\2\2\2\67\66\3\2"+
		"\2\28\20\3\2\2\29:\7\60\2\2:\22\3\2\2\2;<\7\61\2\2<\24\3\2\2\2=>\7/\2"+
		"\2>\26\3\2\2\2?@\7-\2\2@\30\3\2\2\2AB\7,\2\2B\32\3\2\2\2CD\t\4\2\2D\34"+
		"\3\2\2\2EF\t\5\2\2F\36\3\2\2\2GH\7\"\2\2H \3\2\2\2\4\2\67\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}