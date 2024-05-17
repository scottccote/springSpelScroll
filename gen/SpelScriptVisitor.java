// Generated from /Users/scottccote/IdeaProjects/SpringScroll3/src/main/antlr4/com/coteware/antlr/SpelScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpelScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpelScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#spell_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpell_script(SpelScriptParser.Spell_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#unit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit_statement(SpelScriptParser.Unit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SpelScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#declare_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_spec(SpelScriptParser.Declare_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(SpelScriptParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SpelScriptParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(SpelScriptParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(SpelScriptParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(SpelScriptParser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SpelScriptParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#id_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_expression(SpelScriptParser.Id_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#regular_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_id(SpelScriptParser.Regular_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#exception_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_name(SpelScriptParser.Exception_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SpelScriptParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#seq_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_of_statements(SpelScriptParser.Seq_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#label_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_declaration(SpelScriptParser.Label_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SpelScriptParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#exception_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_handler(SpelScriptParser.Exception_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SpelScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#general_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_element(SpelScriptParser.General_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#general_element_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_element_part(SpelScriptParser.General_element_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(SpelScriptParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(SpelScriptParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(SpelScriptParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(SpelScriptParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SpelScriptParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#elsif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_part(SpelScriptParser.Elsif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(SpelScriptParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(SpelScriptParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_loop_param(SpelScriptParser.Cursor_loop_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#lower_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower_bound(SpelScriptParser.Lower_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(SpelScriptParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#null_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_statement(SpelScriptParser.Null_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#raise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_statement(SpelScriptParser.Raise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(SpelScriptParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#simple_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_statement(SpelScriptParser.Simple_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_when_part(SpelScriptParser.Simple_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#searched_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_statement(SpelScriptParser.Searched_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_when_part(SpelScriptParser.Searched_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#case_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_else_part(SpelScriptParser.Case_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SpelScriptParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(SpelScriptParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SpelScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(SpelScriptParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#unary_logical_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_logical_operation(SpelScriptParser.Unary_logical_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#logical_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operation(SpelScriptParser.Logical_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpelScriptParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(SpelScriptParser.ConcatenationContext ctx);
}