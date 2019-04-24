package main.antlr4.generatecode;// Generated from BSharp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
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
		"'if'", "'else'", "'while'", null, "'\n'"
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
		public TerminalNode NEWLINE() { return getToken(BSharpParser.NEWLINE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BSharpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bSharp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterBSharp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitBSharp(this);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					declaration();
					setState(42);
					match(NEWLINE);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(49);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(DOUBLE);
				setState(52);
				match(WHITESPACE);
				setState(53);
				match(VARIABLE);
				setState(54);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(DOUBLE);
				setState(56);
				match(WHITESPACE);
				setState(57);
				match(VARIABLE);
				setState(58);
				match(EQUAL);
				setState(59);
				match(DOUBLEVALUE);
				setState(60);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(BOOL);
				setState(62);
				match(WHITESPACE);
				setState(63);
				match(VARIABLE);
				setState(64);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(BOOL);
				setState(66);
				match(WHITESPACE);
				setState(67);
				match(VARIABLE);
				setState(68);
				match(EQUAL);
				setState(69);
				match(BOOLVALUE);
				setState(70);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(WRITE);
			setState(74);
			match(WHITESPACE);
			setState(75);
			match(WORD);
			setState(76);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				singleStatement();
				setState(79);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				singleStatement();
				setState(82);
				match(NEWLINE);
				setState(83);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitSingleStatement(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleStatement);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				assignmentStatement();
				setState(88);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				boolAssignment();
				setState(91);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				conditionalStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentStatement);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(VARIABLE);
				setState(99);
				match(EQUAL);
				setState(100);
				match(DOUBLEVALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(VARIABLE);
				setState(102);
				match(EQUAL);
				setState(103);
				match(BOOLVALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(DOUBLE);
				setState(105);
				match(WHITESPACE);
				setState(106);
				match(VARIABLE);
				setState(107);
				match(EQUAL);
				setState(108);
				match(DOUBLEVALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(BOOL);
				setState(110);
				match(WHITESPACE);
				setState(111);
				match(VARIABLE);
				setState(112);
				match(EQUAL);
				setState(113);
				match(BOOLVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(DOUBLE);
				setState(115);
				match(WHITESPACE);
				setState(116);
				match(VARIABLE);
				setState(117);
				match(EQUAL);
				setState(118);
				arithmeticExpression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(BOOL);
				setState(120);
				match(WHITESPACE);
				setState(121);
				match(VARIABLE);
				setState(122);
				match(EQUAL);
				setState(123);
				booleanExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				match(VARIABLE);
				setState(125);
				match(EQUAL);
				setState(126);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterBoolAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitBoolAssignment(this);
		}
	}

	public final BoolAssignmentContext boolAssignment() throws RecognitionException {
		BoolAssignmentContext _localctx = new BoolAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolAssignment);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(VARIABLE);
				setState(130);
				match(EQUAL);
				setState(131);
				match(BOOLVALUE);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(BOOL);
				setState(133);
				match(WHITESPACE);
				setState(134);
				match(VARIABLE);
				setState(135);
				match(EQUAL);
				setState(136);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitConditionalStatement(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IF);
			setState(140);
			match(T__2);
			setState(141);
			booleanExpression();
			setState(142);
			match(T__3);
			setState(143);
			blockOfStatements();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(144);
				match(ELSE);
				setState(145);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterBlockOfStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitBlockOfStatements(this);
		}
	}

	public final BlockOfStatementsContext blockOfStatements() throws RecognitionException {
		BlockOfStatementsContext _localctx = new BlockOfStatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockOfStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__4);
			setState(149);
			statements();
			setState(150);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(WHILE);
			setState(153);
			match(T__2);
			setState(154);
			booleanExpression();
			setState(155);
			match(T__3);
			setState(156);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleanExpression);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				relationalExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitLogicalExpression(this);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(163);
				arithmeticExpression(0);
				}
				break;
			case 2:
				{
				setState(164);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(165);
				match(BOOLVALUE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
					setState(168);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(169);
					logicalOperator();
					setState(170);
					logicalExpression(4);
					}
					} 
				}
				setState(176);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitRelationalExpression(this);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(178);
				arithmeticExpression(0);
				}
				break;
			case 2:
				{
				setState(179);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(180);
				match(DOUBLEVALUE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(183);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(184);
					relationalOperator();
					setState(185);
					relationalExpression(4);
					}
					} 
				}
				setState(191);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitArithmeticExpression(this);
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(193);
				match(T__2);
				setState(194);
				arithmeticExpression(0);
				setState(195);
				match(T__3);
				}
				break;
			case VARIABLE:
				{
				setState(197);
				match(VARIABLE);
				}
				break;
			case DOUBLEVALUE:
				{
				setState(198);
				match(DOUBLEVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
					setState(201);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(202);
					arithmeticOperator();
					setState(203);
					arithmeticExpression(5);
					}
					} 
				}
				setState(209);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitRelationalOperator(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSharpListener ) ((BSharpListener)listener).exitArithmeticOperator(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7c\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u008c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0095\n\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00a3\n\r\3\16\3\16"+
		"\3\16\3\16\5\16\u00a9\n\16\3\16\3\16\3\16\3\16\7\16\u00af\n\16\f\16\16"+
		"\16\u00b2\13\16\3\17\3\17\3\17\3\17\5\17\u00b8\n\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00be\n\17\f\17\16\17\u00c1\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00ca\n\20\3\20\3\20\3\20\3\20\7\20\u00d0\n\20\f\20\16\20\u00d3"+
		"\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\5\32\34\36\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\t\16\3\2\17\21\3\2\22\25\2\u00e3"+
		"\2&\3\2\2\2\4\60\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2\nW\3\2\2\2\fb\3\2\2\2\16"+
		"\u0081\3\2\2\2\20\u008b\3\2\2\2\22\u008d\3\2\2\2\24\u0096\3\2\2\2\26\u009a"+
		"\3\2\2\2\30\u00a2\3\2\2\2\32\u00a8\3\2\2\2\34\u00b7\3\2\2\2\36\u00c9\3"+
		"\2\2\2 \u00d4\3\2\2\2\"\u00d6\3\2\2\2$\u00d8\3\2\2\2&\'\7\3\2\2\'(\7#"+
		"\2\2()\5\4\3\2)*\7\4\2\2*\3\3\2\2\2+,\5\6\4\2,-\7#\2\2-/\3\2\2\2.+\3\2"+
		"\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2"+
		"\63\64\5\n\6\2\64\5\3\2\2\2\65\66\7\33\2\2\66\67\7\26\2\2\678\7\"\2\2"+
		"8J\7\35\2\29:\7\33\2\2:;\7\26\2\2;<\7\"\2\2<=\7\36\2\2=>\7\31\2\2>J\7"+
		"\35\2\2?@\7\34\2\2@A\7\26\2\2AB\7\"\2\2BJ\7\35\2\2CD\7\34\2\2DE\7\26\2"+
		"\2EF\7\"\2\2FG\7\36\2\2GH\7\32\2\2HJ\7\35\2\2I\65\3\2\2\2I9\3\2\2\2I?"+
		"\3\2\2\2IC\3\2\2\2J\7\3\2\2\2KL\7\30\2\2LM\7\26\2\2MN\7\27\2\2NO\7\35"+
		"\2\2O\t\3\2\2\2PQ\5\f\7\2QR\7#\2\2RX\3\2\2\2ST\5\f\7\2TU\7#\2\2UV\5\n"+
		"\6\2VX\3\2\2\2WP\3\2\2\2WS\3\2\2\2X\13\3\2\2\2YZ\5\16\b\2Z[\7\35\2\2["+
		"c\3\2\2\2\\]\5\20\t\2]^\7\35\2\2^c\3\2\2\2_c\5\22\n\2`c\5\26\f\2ac\5\b"+
		"\5\2bY\3\2\2\2b\\\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\r\3\2\2\2de\7"+
		"\"\2\2ef\7\36\2\2f\u0082\7\31\2\2gh\7\"\2\2hi\7\36\2\2i\u0082\7\32\2\2"+
		"jk\7\33\2\2kl\7\26\2\2lm\7\"\2\2mn\7\36\2\2n\u0082\7\31\2\2op\7\34\2\2"+
		"pq\7\26\2\2qr\7\"\2\2rs\7\36\2\2s\u0082\7\32\2\2tu\7\33\2\2uv\7\26\2\2"+
		"vw\7\"\2\2wx\7\36\2\2x\u0082\5\36\20\2yz\7\34\2\2z{\7\26\2\2{|\7\"\2\2"+
		"|}\7\36\2\2}\u0082\5\30\r\2~\177\7\"\2\2\177\u0080\7\36\2\2\u0080\u0082"+
		"\5\36\20\2\u0081d\3\2\2\2\u0081g\3\2\2\2\u0081j\3\2\2\2\u0081o\3\2\2\2"+
		"\u0081t\3\2\2\2\u0081y\3\2\2\2\u0081~\3\2\2\2\u0082\17\3\2\2\2\u0083\u0084"+
		"\7\"\2\2\u0084\u0085\7\36\2\2\u0085\u008c\7\32\2\2\u0086\u0087\7\34\2"+
		"\2\u0087\u0088\7\26\2\2\u0088\u0089\7\"\2\2\u0089\u008a\7\36\2\2\u008a"+
		"\u008c\7\32\2\2\u008b\u0083\3\2\2\2\u008b\u0086\3\2\2\2\u008c\21\3\2\2"+
		"\2\u008d\u008e\7\37\2\2\u008e\u008f\7\5\2\2\u008f\u0090\5\30\r\2\u0090"+
		"\u0091\7\6\2\2\u0091\u0094\5\24\13\2\u0092\u0093\7 \2\2\u0093\u0095\5"+
		"\24\13\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096"+
		"\u0097\7\7\2\2\u0097\u0098\5\n\6\2\u0098\u0099\7\b\2\2\u0099\25\3\2\2"+
		"\2\u009a\u009b\7!\2\2\u009b\u009c\7\5\2\2\u009c\u009d\5\30\r\2\u009d\u009e"+
		"\7\6\2\2\u009e\u009f\5\24\13\2\u009f\27\3\2\2\2\u00a0\u00a3\5\34\17\2"+
		"\u00a1\u00a3\5\32\16\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\31"+
		"\3\2\2\2\u00a4\u00a5\b\16\1\2\u00a5\u00a9\5\36\20\2\u00a6\u00a9\7\"\2"+
		"\2\u00a7\u00a9\7\32\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00b0\3\2\2\2\u00aa\u00ab\f\5\2\2\u00ab\u00ac\5\""+
		"\22\2\u00ac\u00ad\5\32\16\6\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\33\3\2\2"+
		"\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\b\17\1\2\u00b4\u00b8\5\36\20\2\u00b5"+
		"\u00b8\7\"\2\2\u00b6\u00b8\7\31\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bf\3\2\2\2\u00b9\u00ba\f\5\2\2\u00ba"+
		"\u00bb\5 \21\2\u00bb\u00bc\5\34\17\6\u00bc\u00be\3\2\2\2\u00bd\u00b9\3"+
		"\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\35\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\b\20\1\2\u00c3\u00c4\7\5\2"+
		"\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6\7\6\2\2\u00c6\u00ca\3\2\2\2\u00c7"+
		"\u00ca\7\"\2\2\u00c8\u00ca\7\31\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00d1\3\2\2\2\u00cb\u00cc\f\6\2\2\u00cc"+
		"\u00cd\5$\23\2\u00cd\u00ce\5\36\20\7\u00ce\u00d0\3\2\2\2\u00cf\u00cb\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\37\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5!\3\2\2\2\u00d6"+
		"\u00d7\t\3\2\2\u00d7#\3\2\2\2\u00d8\u00d9\t\4\2\2\u00d9%\3\2\2\2\20\60"+
		"IWb\u0081\u008b\u0094\u00a2\u00a8\u00b0\u00b7\u00bf\u00c9\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}