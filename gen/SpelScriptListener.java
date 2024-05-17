// Generated from /Users/scottccote/IdeaProjects/SpringScroll3/src/main/antlr4/com/coteware/antlr/SpelScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpelScriptParser}.
 */
public interface SpelScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#spell_script}.
	 * @param ctx the parse tree
	 */
	void enterSpell_script(SpelScriptParser.Spell_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#spell_script}.
	 * @param ctx the parse tree
	 */
	void exitSpell_script(SpelScriptParser.Spell_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnit_statement(SpelScriptParser.Unit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnit_statement(SpelScriptParser.Unit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SpelScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SpelScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_spec(SpelScriptParser.Declare_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_spec(SpelScriptParser.Declare_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(SpelScriptParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(SpelScriptParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SpelScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SpelScriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(SpelScriptParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(SpelScriptParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(SpelScriptParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(SpelScriptParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(SpelScriptParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(SpelScriptParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SpelScriptParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SpelScriptParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(SpelScriptParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(SpelScriptParser.Id_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void enterRegular_id(SpelScriptParser.Regular_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void exitRegular_id(SpelScriptParser.Regular_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void enterException_name(SpelScriptParser.Exception_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void exitException_name(SpelScriptParser.Exception_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SpelScriptParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SpelScriptParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_statements(SpelScriptParser.Seq_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_statements(SpelScriptParser.Seq_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLabel_declaration(SpelScriptParser.Label_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLabel_declaration(SpelScriptParser.Label_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SpelScriptParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SpelScriptParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(SpelScriptParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(SpelScriptParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SpelScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SpelScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#general_element}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element(SpelScriptParser.General_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#general_element}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element(SpelScriptParser.General_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element_part(SpelScriptParser.General_element_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element_part(SpelScriptParser.General_element_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(SpelScriptParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(SpelScriptParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(SpelScriptParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(SpelScriptParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(SpelScriptParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(SpelScriptParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(SpelScriptParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(SpelScriptParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SpelScriptParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SpelScriptParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void enterElsif_part(SpelScriptParser.Elsif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void exitElsif_part(SpelScriptParser.Elsif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(SpelScriptParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(SpelScriptParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(SpelScriptParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(SpelScriptParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void enterCursor_loop_param(SpelScriptParser.Cursor_loop_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void exitCursor_loop_param(SpelScriptParser.Cursor_loop_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(SpelScriptParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(SpelScriptParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(SpelScriptParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(SpelScriptParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(SpelScriptParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(SpelScriptParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(SpelScriptParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(SpelScriptParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(SpelScriptParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(SpelScriptParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(SpelScriptParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(SpelScriptParser.Simple_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_when_part(SpelScriptParser.Simple_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_when_part(SpelScriptParser.Simple_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(SpelScriptParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(SpelScriptParser.Searched_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_when_part(SpelScriptParser.Searched_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_when_part(SpelScriptParser.Searched_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void enterCase_else_part(SpelScriptParser.Case_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void exitCase_else_part(SpelScriptParser.Case_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SpelScriptParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SpelScriptParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SpelScriptParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SpelScriptParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SpelScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SpelScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(SpelScriptParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(SpelScriptParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#unary_logical_operation}.
	 * @param ctx the parse tree
	 */
	void enterUnary_logical_operation(SpelScriptParser.Unary_logical_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#unary_logical_operation}.
	 * @param ctx the parse tree
	 */
	void exitUnary_logical_operation(SpelScriptParser.Unary_logical_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#logical_operation}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operation(SpelScriptParser.Logical_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#logical_operation}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operation(SpelScriptParser.Logical_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpelScriptParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(SpelScriptParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpelScriptParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(SpelScriptParser.ConcatenationContext ctx);
}