package main.antlr4.generatecode;// Generated from BSharp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BSharpParser}.
 */
public interface BSharpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BSharpParser#bSharp}.
	 * @param ctx the parse tree
	 */
	void enterBSharp(BSharpParser.BSharpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#bSharp}.
	 * @param ctx the parse tree
	 */
	void exitBSharp(BSharpParser.BSharpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(BSharpParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(BSharpParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BSharpParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BSharpParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(BSharpParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(BSharpParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(BSharpParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(BSharpParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(BSharpParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(BSharpParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(BSharpParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(BSharpParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#boolAssignment}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssignment(BSharpParser.BoolAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#boolAssignment}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssignment(BSharpParser.BoolAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(BSharpParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(BSharpParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#blockOfStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockOfStatements(BSharpParser.BlockOfStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#blockOfStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockOfStatements(BSharpParser.BlockOfStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(BSharpParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(BSharpParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(BSharpParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(BSharpParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(BSharpParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(BSharpParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(BSharpParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(BSharpParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(BSharpParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(BSharpParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(BSharpParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(BSharpParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(BSharpParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(BSharpParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSharpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(BSharpParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSharpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(BSharpParser.ArithmeticOperatorContext ctx);
}