package main.antlr4.generatecode;// Generated from BSharp.g4 by ANTLR 4.7

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BSharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WHITESPACE=20, WORD=21, WRITE=22, DOUBLEVALUE=23, 
		BOOLVALUE=24, DOUBLE=25, BOOL=26, SEMICOLON=27, EQUAL=28, IF=29, ELSE=30, 
		WHILE=31, VARIABLE=32, NEWLINE=33;
	public static final int
		RULE_bSharp = 0, RULE_body = 1, RULE_declaration = 2, RULE_writeStatement = 3, 
		RULE_statements = 4, RULE_singleStatement = 5, RULE_assignmentStatement = 6, 
		RULE_boolAssignment = 7, RULE_conditionalStatement = 8, RULE_blockOfStatements = 9, 
		RULE_whileStatement = 10, RULE_booleanExpression = 11, RULE_logicalExpression = 12, 
		RULE_relationalExpression = 13, RULE_arithmeticExpression = 14, RULE_relationalOperator = 15, 
		RULE_logicalOperator = 16, RULE_arithmeticOperator = 17;
	public static final String[] ruleNames = {
		"bSharp", "body", "declaration", "writeStatement", "statements", "singleStatement", 
		"assignmentStatement", "boolAssignment", "conditionalStatement", "blockOfStatements", 
		"whileStatement", "booleanExpression", "logicalExpression", "relationalExpression", 
		"arithmeticExpression", "relationalOperator", "logicalOperator", "arithmeticOperator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'start'", "'end'", "'('", "')'", "'{'", "'}'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", 
		"' '", null, "'write'", null, null, "'double'", "'bool'", "';'", "'='", 
		"'if'", "'else'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "WHITESPACE", "WORD", 
		"WRITE", "DOUBLEVALUE", "BOOLVALUE", "DOUBLE", "BOOL", "SEMICOLON", "EQUAL", 
		"IF", "ELSE", "WHILE", "VARIABLE", "NEWLINE"
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
	public String getGrammarFileName() { return "BSharp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BSharpContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(BSharpParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BSharpParser.NEWLINE, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BSharpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bSharp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterBSharp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitBSharp(this);
		}
	}

	public final BSharpContext bSharp() throws RecognitionException {
		BSharpContext _localctx = new BSharpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bSharp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(NEWLINE);
			setState(38);
			body();
			setState(39);
			match(NEWLINE);
			setState(40);
			match(T__1);
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

	public static class BodyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BSharpParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BSharpParser.NEWLINE, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					declaration();
					setState(43);
					match(NEWLINE);
					}
					}
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(50);
			statements();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(BSharpParser.DOUBLE, 0); }
		public TerminalNode WHITESPACE() { return getToken(BSharpParser.WHITESPACE, 0); }
		public TerminalNode VARIABLE() { return getToken(BSharpParser.VARIABLE, 0); }
		public TerminalNode SEMICOLON() { return getToken(BSharpParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(BSharpParser.EQUAL, 0); }
		public TerminalNode DOUBLEVALUE() { return getToken(BSharpParser.DOUBLEVALUE, 0); }
		public TerminalNode BOOL() { return getToken(BSharpParser.BOOL, 0); }
		public TerminalNode BOOLVALUE() { return getToken(BSharpParser.BOOLVALUE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(DOUBLE);
				setState(53);
				match(WHITESPACE);
				setState(54);
				match(VARIABLE);
				setState(55);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(DOUBLE);
				setState(57);
				match(WHITESPACE);
				setState(58);
				match(VARIABLE);
				setState(59);
				match(EQUAL);
				setState(60);
				match(DOUBLEVALUE);
				setState(61);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(BOOL);
				setState(63);
				match(WHITESPACE);
				setState(64);
				match(VARIABLE);
				setState(65);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(BOOL);
				setState(67);
				match(WHITESPACE);
				setState(68);
				match(VARIABLE);
				setState(69);
				match(EQUAL);
				setState(70);
				match(BOOLVALUE);
				setState(71);
				match(SEMICOLON);
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

	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(BSharpParser.WRITE, 0); }
		public TerminalNode WHITESPACE() { return getToken(BSharpParser.WHITESPACE, 0); }
		public TerminalNode WORD() { return getToken(BSharpParser.WORD, 0); }
		public TerminalNode SEMICOLON() { return getToken(BSharpParser.SEMICOLON, 0); }
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(WRITE);
			setState(75);
			match(WHITESPACE);
			setState(76);
			match(WORD);
			setState(77);
			match(SEMICOLON);
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

	public static class StatementsContext extends ParserRuleContext {
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BSharpParser.NEWLINE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				singleStatement();
				setState(80);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				singleStatement();
				setState(83);
				match(NEWLINE);
				setState(84);
				statements();
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

	public static class SingleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BSharpParser.SEMICOLON, 0); }
		public BoolAssignmentContext boolAssignment() {
			return getRuleContext(BoolAssignmentContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitSingleStatement(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleStatement);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				assignmentStatement();
				setState(89);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				boolAssignment();
				setState(92);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				conditionalStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				writeStatement();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(BSharpParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(BSharpParser.EQUAL, 0); }
		public TerminalNode DOUBLEVALUE() { return getToken(BSharpParser.DOUBLEVALUE, 0); }
		public TerminalNode BOOLVALUE() { return getToken(BSharpParser.BOOLVALUE, 0); }
		public TerminalNode DOUBLE() { return getToken(BSharpParser.DOUBLE, 0); }
		public TerminalNode WHITESPACE() { return getToken(BSharpParser.WHITESPACE, 0); }
		public TerminalNode BOOL() { return getToken(BSharpParser.BOOL, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentStatement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(VARIABLE);
				setState(100);
				match(EQUAL);
				setState(101);
				match(DOUBLEVALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(VARIABLE);
				setState(103);
				match(EQUAL);
				setState(104);
				match(BOOLVALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(DOUBLE);
				setState(106);
				match(WHITESPACE);
				setState(107);
				match(VARIABLE);
				setState(108);
				match(EQUAL);
				setState(109);
				match(DOUBLEVALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(BOOL);
				setState(111);
				match(WHITESPACE);
				setState(112);
				match(VARIABLE);
				setState(113);
				match(EQUAL);
				setState(114);
				match(BOOLVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(DOUBLE);
				setState(116);
				match(WHITESPACE);
				setState(117);
				match(VARIABLE);
				setState(118);
				match(EQUAL);
				setState(119);
				arithmeticExpression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(BOOL);
				setState(121);
				match(WHITESPACE);
				setState(122);
				match(VARIABLE);
				setState(123);
				match(EQUAL);
				setState(124);
				booleanExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(VARIABLE);
				setState(126);
				match(EQUAL);
				setState(127);
				arithmeticExpression(0);
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

	public static class BoolAssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(BSharpParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(BSharpParser.EQUAL, 0); }
		public TerminalNode BOOLVALUE() { return getToken(BSharpParser.BOOLVALUE, 0); }
		public TerminalNode BOOL() { return getToken(BSharpParser.BOOL, 0); }
		public TerminalNode WHITESPACE() { return getToken(BSharpParser.WHITESPACE, 0); }
		public BoolAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterBoolAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitBoolAssignment(this);
		}
	}

	public final BoolAssignmentContext boolAssignment() throws RecognitionException {
		BoolAssignmentContext _localctx = new BoolAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolAssignment);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(VARIABLE);
				setState(131);
				match(EQUAL);
				setState(132);
				match(BOOLVALUE);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(BOOL);
				setState(134);
				match(WHITESPACE);
				setState(135);
				match(VARIABLE);
				setState(136);
				match(EQUAL);
				setState(137);
				match(BOOLVALUE);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BSharpParser.IF, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public List<BlockOfStatementsContext> blockOfStatements() {
			return getRuleContexts(BlockOfStatementsContext.class);
		}
		public BlockOfStatementsContext blockOfStatements(int i) {
			return getRuleContext(BlockOfStatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BSharpParser.ELSE, 0); }
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitConditionalStatement(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IF);
			setState(141);
			match(T__2);
			setState(142);
			booleanExpression();
			setState(143);
			match(T__3);
			setState(144);
			blockOfStatements();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(145);
				match(ELSE);
				setState(146);
				blockOfStatements();
				}
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

	public static class BlockOfStatementsContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockOfStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOfStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterBlockOfStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitBlockOfStatements(this);
		}
	}

	public final BlockOfStatementsContext blockOfStatements() throws RecognitionException {
		BlockOfStatementsContext _localctx = new BlockOfStatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockOfStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__4);
			setState(150);
			statements();
			setState(151);
			match(T__5);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BSharpParser.WHILE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BlockOfStatementsContext blockOfStatements() {
			return getRuleContext(BlockOfStatementsContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(WHILE);
			setState(154);
			match(T__2);
			setState(155);
			booleanExpression();
			setState(156);
			match(T__3);
			setState(157);
			blockOfStatements();
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleanExpression);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				relationalExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				logicalExpression(0);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(BSharpParser.VARIABLE, 0); }
		public TerminalNode BOOLVALUE() { return getToken(BSharpParser.BOOLVALUE, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(164);
				arithmeticExpression(0);
				}
				break;
			case 2:
				{
				setState(165);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(166);
				match(BOOLVALUE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
					setState(169);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(170);
					logicalOperator();
					setState(171);
					logicalExpression(4);
					}
					}
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(BSharpParser.VARIABLE, 0); }
		public TerminalNode DOUBLEVALUE() { return getToken(BSharpParser.DOUBLEVALUE, 0); }
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(179);
				arithmeticExpression(0);
				}
				break;
			case 2:
				{
				setState(180);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(181);
				match(DOUBLEVALUE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(184);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(185);
					relationalOperator();
					setState(186);
					relationalExpression(4);
					}
					}
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode VARIABLE() { return getToken(BSharpParser.VARIABLE, 0); }
		public TerminalNode DOUBLEVALUE() { return getToken(BSharpParser.DOUBLEVALUE, 0); }
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitArithmeticExpression(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(194);
				match(T__2);
				setState(195);
				arithmeticExpression(0);
				setState(196);
				match(T__3);
				}
				break;
			case VARIABLE:
				{
				setState(198);
				match(VARIABLE);
				}
				break;
			case DOUBLEVALUE:
				{
				setState(199);
				match(DOUBLEVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
					setState(202);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(203);
					arithmeticOperator();
					setState(204);
					arithmeticExpression(5);
					}
					}
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitRelationalOperator(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener) ((BSharpListener)listener).exitArithmeticOperator(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 13:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 14:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7d\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0096"+
		"\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00a4\n\r"+
		"\3\16\3\16\3\16\3\16\5\16\u00aa\n\16\3\16\3\16\3\16\3\16\7\16\u00b0\n"+
		"\16\f\16\16\16\u00b3\13\16\3\17\3\17\3\17\3\17\5\17\u00b9\n\17\3\17\3"+
		"\17\3\17\3\17\7\17\u00bf\n\17\f\17\16\17\u00c2\13\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00cb\n\20\3\20\3\20\3\20\3\20\7\20\u00d1\n\20"+
		"\f\20\16\20\u00d4\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\5\32\34\36"+
		"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\t\16\3\2\17\21"+
		"\3\2\22\25\2\u00e4\2&\3\2\2\2\4\61\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nX\3"+
		"\2\2\2\fc\3\2\2\2\16\u0082\3\2\2\2\20\u008c\3\2\2\2\22\u008e\3\2\2\2\24"+
		"\u0097\3\2\2\2\26\u009b\3\2\2\2\30\u00a3\3\2\2\2\32\u00a9\3\2\2\2\34\u00b8"+
		"\3\2\2\2\36\u00ca\3\2\2\2 \u00d5\3\2\2\2\"\u00d7\3\2\2\2$\u00d9\3\2\2"+
		"\2&\'\7\3\2\2\'(\7#\2\2()\5\4\3\2)*\7#\2\2*+\7\4\2\2+\3\3\2\2\2,-\5\6"+
		"\4\2-.\7#\2\2.\60\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\5\n\6\2\65\5\3\2\2\2\66\67\7"+
		"\33\2\2\678\7\26\2\289\7\"\2\29K\7\35\2\2:;\7\33\2\2;<\7\26\2\2<=\7\""+
		"\2\2=>\7\36\2\2>?\7\31\2\2?K\7\35\2\2@A\7\34\2\2AB\7\26\2\2BC\7\"\2\2"+
		"CK\7\35\2\2DE\7\34\2\2EF\7\26\2\2FG\7\"\2\2GH\7\36\2\2HI\7\32\2\2IK\7"+
		"\35\2\2J\66\3\2\2\2J:\3\2\2\2J@\3\2\2\2JD\3\2\2\2K\7\3\2\2\2LM\7\30\2"+
		"\2MN\7\26\2\2NO\7\27\2\2OP\7\35\2\2P\t\3\2\2\2QR\5\f\7\2RS\7#\2\2SY\3"+
		"\2\2\2TU\5\f\7\2UV\7#\2\2VW\5\n\6\2WY\3\2\2\2XQ\3\2\2\2XT\3\2\2\2Y\13"+
		"\3\2\2\2Z[\5\16\b\2[\\\7\35\2\2\\d\3\2\2\2]^\5\20\t\2^_\7\35\2\2_d\3\2"+
		"\2\2`d\5\22\n\2ad\5\26\f\2bd\5\b\5\2cZ\3\2\2\2c]\3\2\2\2c`\3\2\2\2ca\3"+
		"\2\2\2cb\3\2\2\2d\r\3\2\2\2ef\7\"\2\2fg\7\36\2\2g\u0083\7\31\2\2hi\7\""+
		"\2\2ij\7\36\2\2j\u0083\7\32\2\2kl\7\33\2\2lm\7\26\2\2mn\7\"\2\2no\7\36"+
		"\2\2o\u0083\7\31\2\2pq\7\34\2\2qr\7\26\2\2rs\7\"\2\2st\7\36\2\2t\u0083"+
		"\7\32\2\2uv\7\33\2\2vw\7\26\2\2wx\7\"\2\2xy\7\36\2\2y\u0083\5\36\20\2"+
		"z{\7\34\2\2{|\7\26\2\2|}\7\"\2\2}~\7\36\2\2~\u0083\5\30\r\2\177\u0080"+
		"\7\"\2\2\u0080\u0081\7\36\2\2\u0081\u0083\5\36\20\2\u0082e\3\2\2\2\u0082"+
		"h\3\2\2\2\u0082k\3\2\2\2\u0082p\3\2\2\2\u0082u\3\2\2\2\u0082z\3\2\2\2"+
		"\u0082\177\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085\7\"\2\2\u0085\u0086\7"+
		"\36\2\2\u0086\u008d\7\32\2\2\u0087\u0088\7\34\2\2\u0088\u0089\7\26\2\2"+
		"\u0089\u008a\7\"\2\2\u008a\u008b\7\36\2\2\u008b\u008d\7\32\2\2\u008c\u0084"+
		"\3\2\2\2\u008c\u0087\3\2\2\2\u008d\21\3\2\2\2\u008e\u008f\7\37\2\2\u008f"+
		"\u0090\7\5\2\2\u0090\u0091\5\30\r\2\u0091\u0092\7\6\2\2\u0092\u0095\5"+
		"\24\13\2\u0093\u0094\7 \2\2\u0094\u0096\5\24\13\2\u0095\u0093\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\23\3\2\2\2\u0097\u0098\7\7\2\2\u0098\u0099"+
		"\5\n\6\2\u0099\u009a\7\b\2\2\u009a\25\3\2\2\2\u009b\u009c\7!\2\2\u009c"+
		"\u009d\7\5\2\2\u009d\u009e\5\30\r\2\u009e\u009f\7\6\2\2\u009f\u00a0\5"+
		"\24\13\2\u00a0\27\3\2\2\2\u00a1\u00a4\5\34\17\2\u00a2\u00a4\5\32\16\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\31\3\2\2\2\u00a5\u00a6"+
		"\b\16\1\2\u00a6\u00aa\5\36\20\2\u00a7\u00aa\7\"\2\2\u00a8\u00aa\7\32\2"+
		"\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00b1"+
		"\3\2\2\2\u00ab\u00ac\f\5\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\5\32\16"+
		"\6\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\b\17\1\2\u00b5\u00b9\5\36\20\2\u00b6\u00b9\7\"\2\2\u00b7\u00b9"+
		"\7\31\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00c0\3\2\2\2\u00ba\u00bb\f\5\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd"+
		"\5\34\17\6\u00bd\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\u00c2\3\2\2\2"+
		"\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\35\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c4\b\20\1\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\5\36\20"+
		"\2\u00c6\u00c7\7\6\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00cb\7\"\2\2\u00c9\u00cb"+
		"\7\31\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\u00d2\3\2\2\2\u00cc\u00cd\f\6\2\2\u00cd\u00ce\5$\23\2\u00ce\u00cf"+
		"\5\36\20\7\u00cf\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d4\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d6\t\2\2\2\u00d6!\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8"+
		"#\3\2\2\2\u00d9\u00da\t\4\2\2\u00da%\3\2\2\2\20\61JXc\u0082\u008c\u0095"+
		"\u00a3\u00a9\u00b1\u00b8\u00c0\u00ca\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}