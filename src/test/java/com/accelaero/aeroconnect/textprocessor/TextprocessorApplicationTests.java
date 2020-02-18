package com.accelaero.aeroconnect.textprocessor;

import com.accelaero.aeroconnect.textprocessor.parser.NEWssmLexer;
import com.accelaero.aeroconnect.textprocessor.parser.NEWssmParser;
import com.accelaero.aeroconnect.textprocessor.parser.SSMdataelementLexer;
import com.accelaero.aeroconnect.textprocessor.parser.SSMdataelementParser;
import com.accelaero.aeroconnect.textprocessor.parser.SsmNewLexer;
import com.accelaero.aeroconnect.textprocessor.parser.SsmNewParser;
import org.antlr.v4.runtime.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TextprocessorApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testParser() throws IOException {
		String jointOperationAirline =  "AS";
		CharStream charStreams =  new ANTLRInputStream(jointOperationAirline);
		Lexer lexer = new SSMdataelementLexer(charStreams);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SSMdataelementParser parser = new SSMdataelementParser(tokenStream);
		SSMdataelementParser.TimeModeContext startRuleContext = parser.timeMode();


	}

	@Test
	public void testParser2() throws IOException {
		String message =
				"SSM\r\n" +
				"LT\n" +
				"24MAY00144E003/REF 123\r\n" +
				"NEW XASM\r\n" +
				"LX544A 1/LX/LH 3/LX 4/LH 5/LX 9/LX\r\n";

		CharStream charStreams =  new ANTLRInputStream(message);
		Lexer lexer = new SsmNewLexer(charStreams);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SsmNewParser parser = new SsmNewParser(tokenStream);
		SsmNewParser.SsmNewMessageContext startRuleContext = parser.ssmNewMessage();

	}


	@Test
	public void testParserTimeMode() throws IOException {
		String jointOperationAirline = 	"LTC";

		CharStream charStreams =  new ANTLRInputStream(jointOperationAirline);
		Lexer lexer = new NEWssmLexer(charStreams);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		NEWssmParser parser = new NEWssmParser(tokenStream);
		NEWssmParser.TimeModeContext startRuleContext = parser.timeMode();


	}

}
