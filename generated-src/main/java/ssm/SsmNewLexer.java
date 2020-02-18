// Generated from ssm/SsmNew.g4 by ANTLR 4.7.1
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
public class SsmNewLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SSM=1, NEW=2, LT=3, UTC=4, EOL=5, XASM=6, SPACE=7, MESSAGE_SEQUENCE_REFERENCE=8, 
		CREATOR_REFERENCE=9, FLIGHT_DESIGNATOR=10, OPERATIONAL_SUFFIX=11, DEI1=12, 
		DEI2=13, DEI3=14, DEI4=15, DEI5=16, DEI9=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SSM", "NEW", "LT", "UTC", "EOL", "XASM", "FULLSTOP", "SLASH", "MINUS", 
		"PLUS", "ASTRIX", "SPACE", "A", "N", "AN", "X", "MESSAGE_SEQUENCE_REFERENCE", 
		"CREATOR_REFERENCE", "AIRLINE_DESIGNATOR", "FLIGHT_DESIGNATOR", "OPERATIONAL_SUFFIX", 
		"DEI1", "DEI2", "DEI3", "DEI4", "DEI5", "DEI9"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SSM'", "'NEW'", "'LT'", "'UTC'", null, "'XASM'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SSM", "NEW", "LT", "UTC", "EOL", "XASM", "SPACE", "MESSAGE_SEQUENCE_REFERENCE", 
		"CREATOR_REFERENCE", "FLIGHT_DESIGNATOR", "OPERATIONAL_SUFFIX", "DEI1", 
		"DEI2", "DEI3", "DEI4", "DEI5", "DEI9"
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


	public SsmNewLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SsmNew.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\5\6J\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21l\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\6\23\177\n\23\r\23\16\23\u0080\3\24\3\24\3\24\5\24\u0086\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u008d\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0099\n\27\3\30\3\30\3\30\3\30\5\30\u009f\n\30\3"+
		"\31\3\31\3\31\3\31\5\31\u00a5\n\31\3\32\3\32\3\32\3\32\5\32\u00ab\n\32"+
		"\3\33\3\33\3\33\3\33\5\33\u00b1\n\33\3\34\3\34\3\34\3\34\5\34\u00b7\n"+
		"\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\2\27\2\31\t\33\2"+
		"\35\2\37\2!\2#\n%\13\'\2)\f+\r-\16/\17\61\20\63\21\65\22\67\23\3\2\5\3"+
		"\2C\\\3\2\62;\4\2\62;C\\\2\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\31\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5=\3\2\2\2\7A\3\2\2\2\tD\3\2\2\2"+
		"\13I\3\2\2\2\rM\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25X\3\2\2"+
		"\2\27Z\3\2\2\2\31\\\3\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37b\3\2\2\2!k\3\2"+
		"\2\2#m\3\2\2\2%|\3\2\2\2\'\u0082\3\2\2\2)\u0087\3\2\2\2+\u008e\3\2\2\2"+
		"-\u0090\3\2\2\2/\u009a\3\2\2\2\61\u00a0\3\2\2\2\63\u00a6\3\2\2\2\65\u00ac"+
		"\3\2\2\2\67\u00b2\3\2\2\29:\7U\2\2:;\7U\2\2;<\7O\2\2<\4\3\2\2\2=>\7P\2"+
		"\2>?\7G\2\2?@\7Y\2\2@\6\3\2\2\2AB\7N\2\2BC\7V\2\2C\b\3\2\2\2DE\7W\2\2"+
		"EF\7V\2\2FG\7E\2\2G\n\3\2\2\2HJ\7\17\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2"+
		"KL\7\f\2\2L\f\3\2\2\2MN\7Z\2\2NO\7C\2\2OP\7U\2\2PQ\7O\2\2Q\16\3\2\2\2"+
		"RS\7\60\2\2S\20\3\2\2\2TU\7\61\2\2U\22\3\2\2\2VW\7/\2\2W\24\3\2\2\2XY"+
		"\7-\2\2Y\26\3\2\2\2Z[\7,\2\2[\30\3\2\2\2\\]\7\"\2\2]\32\3\2\2\2^_\t\2"+
		"\2\2_\34\3\2\2\2`a\t\3\2\2a\36\3\2\2\2bc\t\4\2\2c \3\2\2\2dl\5\37\20\2"+
		"el\5\17\b\2fl\5\21\t\2gl\5\23\n\2hl\5\25\13\2il\5\27\f\2jl\5\31\r\2kd"+
		"\3\2\2\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l"+
		"\"\3\2\2\2mn\5\35\17\2no\5\35\17\2op\5\33\16\2pq\5\33\16\2qr\5\33\16\2"+
		"rs\5\35\17\2st\5\35\17\2tu\5\35\17\2uv\5\35\17\2vw\5\35\17\2wx\5\33\16"+
		"\2xy\5\35\17\2yz\5\35\17\2z{\5\35\17\2{$\3\2\2\2|~\5\21\t\2}\177\5!\21"+
		"\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"&\3\2\2\2\u0082\u0083\5\37\20\2\u0083\u0085\5\37\20\2\u0084\u0086\5\33"+
		"\16\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086(\3\2\2\2\u0087\u0088"+
		"\5\'\24\2\u0088\u0089\5\35\17\2\u0089\u008a\5\35\17\2\u008a\u008c\5\35"+
		"\17\2\u008b\u008d\5\35\17\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"*\3\2\2\2\u008e\u008f\5\33\16\2\u008f,\3\2\2\2\u0090\u0091\7\63\2\2\u0091"+
		"\u0092\5\21\t\2\u0092\u0093\5\'\24\2\u0093\u0094\5\21\t\2\u0094\u0098"+
		"\5\'\24\2\u0095\u0096\5\21\t\2\u0096\u0097\5\'\24\2\u0097\u0099\3\2\2"+
		"\2\u0098\u0095\3\2\2\2\u0098\u0099\3\2\2\2\u0099.\3\2\2\2\u009a\u009b"+
		"\7\64\2\2\u009b\u009e\5\21\t\2\u009c\u009f\5\'\24\2\u009d\u009f\7Z\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\60\3\2\2\2\u00a0\u00a1"+
		"\7\65\2\2\u00a1\u00a4\5\21\t\2\u00a2\u00a5\5\'\24\2\u00a3\u00a5\7Z\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\62\3\2\2\2\u00a6\u00a7"+
		"\7\66\2\2\u00a7\u00aa\5\21\t\2\u00a8\u00ab\5\'\24\2\u00a9\u00ab\7Z\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\64\3\2\2\2\u00ac\u00ad"+
		"\7\67\2\2\u00ad\u00b0\5\21\t\2\u00ae\u00b1\5\'\24\2\u00af\u00b1\7Z\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\66\3\2\2\2\u00b2\u00b3"+
		"\7;\2\2\u00b3\u00b6\5\21\t\2\u00b4\u00b7\5\'\24\2\u00b5\u00b7\7Z\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b78\3\2\2\2\16\2Ik\u0080\u0085\u008c"+
		"\u0098\u009e\u00a4\u00aa\u00b0\u00b6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}