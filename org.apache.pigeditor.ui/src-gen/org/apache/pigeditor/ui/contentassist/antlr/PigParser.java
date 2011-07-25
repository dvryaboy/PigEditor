/*
* generated by Xtext
*/
package org.apache.pigeditor.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.apache.pigeditor.services.PigGrammarAccess;

public class PigParser extends AbstractContentAssistParser {
	
	@Inject
	private PigGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.apache.pigeditor.ui.contentassist.antlr.internal.InternalPigParser createParser() {
		org.apache.pigeditor.ui.contentassist.antlr.internal.InternalPigParser result = new org.apache.pigeditor.ui.contentassist.antlr.internal.InternalPigParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives_0_0(), "rule__Statement__Alternatives_0_0");
					put(grammarAccess.getStatementAccess().getAlternatives_0_0_2_0(), "rule__Statement__Alternatives_0_0_2_0");
					put(grammarAccess.getDefineStatementAccess().getAlternatives(), "rule__DefineStatement__Alternatives");
					put(grammarAccess.getForeachStatementAccess().getAlternatives_4(), "rule__ForeachStatement__Alternatives_4");
					put(grammarAccess.getStreamStatementAccess().getAlternatives_5(), "rule__StreamStatement__Alternatives_5");
					put(grammarAccess.getUnaryConditionAccess().getAlternatives(), "rule__UnaryCondition__Alternatives");
					put(grammarAccess.getReal_argAccess().getAlternatives(), "rule__Real_arg__Alternatives");
					put(grammarAccess.getAddExpressionAccess().getAlternatives_1_0(), "rule__AddExpression__Alternatives_1_0");
					put(grammarAccess.getMulti_exprAccess().getAlternatives_1_0(), "rule__Multi_expr__Alternatives_1_0");
					put(grammarAccess.getUnary_exprAccess().getAlternatives(), "rule__Unary_expr__Alternatives");
					put(grammarAccess.getExpr_evalAccess().getAlternatives(), "rule__Expr_eval__Alternatives");
					put(grammarAccess.getVar_exprAccess().getAlternatives_1(), "rule__Var_expr__Alternatives_1");
					put(grammarAccess.getProjectable_exprAccess().getAlternatives(), "rule__Projectable_expr__Alternatives");
					put(grammarAccess.getDot_projAccess().getAlternatives_0(), "rule__Dot_proj__Alternatives_0");
					put(grammarAccess.getCol_alias_or_indexAccess().getAlternatives(), "rule__Col_alias_or_index__Alternatives");
					put(grammarAccess.getCol_indexAccess().getAlternatives_1(), "rule__Col_index__Alternatives_1");
					put(grammarAccess.getPound_projAccess().getAlternatives_1(), "rule__Pound_proj__Alternatives_1");
					put(grammarAccess.getRel_opAccess().getAlternatives(), "rule__Rel_op__Alternatives");
					put(grammarAccess.getRel_op_eqAccess().getAlternatives(), "rule__Rel_op_eq__Alternatives");
					put(grammarAccess.getRel_op_neAccess().getAlternatives(), "rule__Rel_op_ne__Alternatives");
					put(grammarAccess.getRel_op_gtAccess().getAlternatives(), "rule__Rel_op_gt__Alternatives");
					put(grammarAccess.getRel_op_gteAccess().getAlternatives(), "rule__Rel_op_gte__Alternatives");
					put(grammarAccess.getRel_op_ltAccess().getAlternatives(), "rule__Rel_op_lt__Alternatives");
					put(grammarAccess.getRel_op_lteAccess().getAlternatives(), "rule__Rel_op_lte__Alternatives");
					put(grammarAccess.getFlattenGeneratedItemAccess().getAlternatives_0(), "rule__FlattenGeneratedItem__Alternatives_0");
					put(grammarAccess.getFlattenGeneratedItemAccess().getAlternatives_1_1(), "rule__FlattenGeneratedItem__Alternatives_1_1");
					put(grammarAccess.getFuncNameAccess().getAlternatives(), "rule__FuncName__Alternatives");
					put(grammarAccess.getPathClauseAccess().getAlternatives(), "rule__PathClause__Alternatives");
					put(grammarAccess.getAsClauseAccess().getAlternatives_1(), "rule__AsClause__Alternatives_1");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getSimpleTypeAccess().getAlternatives(), "rule__SimpleType__Alternatives");
					put(grammarAccess.getOrder_by_clauseAccess().getAlternatives(), "rule__Order_by_clause__Alternatives");
					put(grammarAccess.getOrder_by_clauseAccess().getAlternatives_0_1(), "rule__Order_by_clause__Alternatives_0_1");
					put(grammarAccess.getOrder_colAccess().getAlternatives(), "rule__Order_col__Alternatives");
					put(grammarAccess.getOrder_colAccess().getAlternatives_0_1(), "rule__Order_col__Alternatives_0_1");
					put(grammarAccess.getOrder_colAccess().getAlternatives_1_2(), "rule__Order_col__Alternatives_1_2");
					put(grammarAccess.getJoin_sub_clauseAccess().getAlternatives_1(), "rule__Join_sub_clause__Alternatives_1");
					put(grammarAccess.getGroup_itemAccess().getAlternatives_0(), "rule__Group_item__Alternatives_0");
					put(grammarAccess.getGroup_itemAccess().getAlternatives_1(), "rule__Group_item__Alternatives_1");
					put(grammarAccess.getJoin_group_by_expr_listAccess().getAlternatives(), "rule__Join_group_by_expr_list__Alternatives");
					put(grammarAccess.getJoin_group_by_exprAccess().getAlternatives(), "rule__Join_group_by_expr__Alternatives");
					put(grammarAccess.getNested_opAccess().getAlternatives(), "rule__Nested_op__Alternatives");
					put(grammarAccess.getNested_limitAccess().getAlternatives_2(), "rule__Nested_limit__Alternatives_2");
					put(grammarAccess.getCol_refAccess().getAlternatives(), "rule__Col_ref__Alternatives");
					put(grammarAccess.getAlias_col_refAccess().getAlternatives(), "rule__Alias_col_ref__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getScalarAccess().getAlternatives(), "rule__Scalar__Alternatives");
					put(grammarAccess.getScalarIntAccess().getAlternatives(), "rule__ScalarInt__Alternatives");
					put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
					put(grammarAccess.getStatementAccess().getGroup_0_0_2(), "rule__Statement__Group_0_0_2__0");
					put(grammarAccess.getLoadStatementAccess().getGroup(), "rule__LoadStatement__Group__0");
					put(grammarAccess.getForeachStatementAccess().getGroup(), "rule__ForeachStatement__Group__0");
					put(grammarAccess.getForeachStatementAccess().getGroup_4_0(), "rule__ForeachStatement__Group_4_0__0");
					put(grammarAccess.getFilterStatementAccess().getGroup(), "rule__FilterStatement__Group__0");
					put(grammarAccess.getGroupByStatementAccess().getGroup(), "rule__GroupByStatement__Group__0");
					put(grammarAccess.getGroupByStatementAccess().getGroup_5(), "rule__GroupByStatement__Group_5__0");
					put(grammarAccess.getCoGroupByStatementAccess().getGroup(), "rule__CoGroupByStatement__Group__0");
					put(grammarAccess.getCoGroupByStatementAccess().getGroup_4(), "rule__CoGroupByStatement__Group_4__0");
					put(grammarAccess.getOrderStatementAccess().getGroup(), "rule__OrderStatement__Group__0");
					put(grammarAccess.getOrderStatementAccess().getGroup_6(), "rule__OrderStatement__Group_6__0");
					put(grammarAccess.getCrossStatementAccess().getGroup(), "rule__CrossStatement__Group__0");
					put(grammarAccess.getUnionStatementAccess().getGroup(), "rule__UnionStatement__Group__0");
					put(grammarAccess.getJoinStatementAccess().getGroup(), "rule__JoinStatement__Group__0");
					put(grammarAccess.getJoinStatementAccess().getGroup_4(), "rule__JoinStatement__Group_4__0");
					put(grammarAccess.getLimitStatementAccess().getGroup(), "rule__LimitStatement__Group__0");
					put(grammarAccess.getSampleStatementAccess().getGroup(), "rule__SampleStatement__Group__0");
					put(grammarAccess.getDistinctStatementAccess().getGroup(), "rule__DistinctStatement__Group__0");
					put(grammarAccess.getStreamStatementAccess().getGroup(), "rule__StreamStatement__Group__0");
					put(grammarAccess.getMrStatementAccess().getGroup(), "rule__MrStatement__Group__0");
					put(grammarAccess.getSplitStatementAccess().getGroup(), "rule__SplitStatement__Group__0");
					put(grammarAccess.getSplitStatementAccess().getGroup_6(), "rule__SplitStatement__Group_6__0");
					put(grammarAccess.getStoreStatementAccess().getGroup(), "rule__StoreStatement__Group__0");
					put(grammarAccess.getStoreStatementAccess().getGroup_4(), "rule__StoreStatement__Group_4__0");
					put(grammarAccess.getDescribeStatementAccess().getGroup(), "rule__DescribeStatement__Group__0");
					put(grammarAccess.getExplainStatementAccess().getGroup(), "rule__ExplainStatement__Group__0");
					put(grammarAccess.getDumpStatementAccess().getGroup(), "rule__DumpStatement__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getConditionAccess().getGroup_0(), "rule__Condition__Group_0__0");
					put(grammarAccess.getOrConditionAccess().getGroup(), "rule__OrCondition__Group__0");
					put(grammarAccess.getOrConditionAccess().getGroup_1(), "rule__OrCondition__Group_1__0");
					put(grammarAccess.getAndConditionAccess().getGroup(), "rule__AndCondition__Group__0");
					put(grammarAccess.getAndConditionAccess().getGroup_1(), "rule__AndCondition__Group_1__0");
					put(grammarAccess.getUnaryConditionAccess().getGroup_0(), "rule__UnaryCondition__Group_0__0");
					put(grammarAccess.getUnaryConditionAccess().getGroup_0_2(), "rule__UnaryCondition__Group_0_2__0");
					put(grammarAccess.getUnaryConditionAccess().getGroup_0_4(), "rule__UnaryCondition__Group_0_4__0");
					put(grammarAccess.getUnaryConditionAccess().getGroup_1(), "rule__UnaryCondition__Group_1__0");
					put(grammarAccess.getUnaryConditionAccess().getGroup_1_1(), "rule__UnaryCondition__Group_1_1__0");
					put(grammarAccess.getTEAccess().getGroup(), "rule__TE__Group__0");
					put(grammarAccess.getTEAccess().getGroup_1(), "rule__TE__Group_1__0");
					put(grammarAccess.getFunc_evalAccess().getGroup(), "rule__Func_eval__Group__0");
					put(grammarAccess.getReal_arg_listAccess().getGroup(), "rule__Real_arg_list__Group__0");
					put(grammarAccess.getReal_arg_listAccess().getGroup_1(), "rule__Real_arg_list__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getAddExpressionAccess().getGroup(), "rule__AddExpression__Group__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1(), "rule__AddExpression__Group_1__0");
					put(grammarAccess.getMulti_exprAccess().getGroup(), "rule__Multi_expr__Group__0");
					put(grammarAccess.getMulti_exprAccess().getGroup_1(), "rule__Multi_expr__Group_1__0");
					put(grammarAccess.getVar_exprAccess().getGroup(), "rule__Var_expr__Group__0");
					put(grammarAccess.getDot_projAccess().getGroup(), "rule__Dot_proj__Group__0");
					put(grammarAccess.getCol_indexAccess().getGroup(), "rule__Col_index__Group__0");
					put(grammarAccess.getPound_projAccess().getGroup(), "rule__Pound_proj__Group__0");
					put(grammarAccess.getBin_exprAccess().getGroup(), "rule__Bin_expr__Group__0");
					put(grammarAccess.getNeg_exprAccess().getGroup(), "rule__Neg_expr__Group__0");
					put(grammarAccess.getFlattenGeneratedItemAccess().getGroup(), "rule__FlattenGeneratedItem__Group__0");
					put(grammarAccess.getFlattenGeneratedItemAccess().getGroup_1(), "rule__FlattenGeneratedItem__Group_1__0");
					put(grammarAccess.getParallelClauseAccess().getGroup(), "rule__ParallelClause__Group__0");
					put(grammarAccess.getRegisterClauseAccess().getGroup(), "rule__RegisterClause__Group__0");
					put(grammarAccess.getDefaultClauseAccess().getGroup(), "rule__DefaultClause__Group__0");
					put(grammarAccess.getDeclareClauseAccess().getGroup(), "rule__DeclareClause__Group__0");
					put(grammarAccess.getDefineClauseAccess().getGroup(), "rule__DefineClause__Group__0");
					put(grammarAccess.getLoadUsingAccess().getGroup(), "rule__LoadUsing__Group__0");
					put(grammarAccess.getFuncClauseAccess().getGroup(), "rule__FuncClause__Group__0");
					put(grammarAccess.getFuncClauseAccess().getGroup_3(), "rule__FuncClause__Group_3__0");
					put(grammarAccess.getAsClauseAccess().getGroup(), "rule__AsClause__Group__0");
					put(grammarAccess.getAliasDefAccess().getGroup(), "rule__AliasDef__Group__0");
					put(grammarAccess.getAliasDefAccess().getGroup_1(), "rule__AliasDef__Group_1__0");
					put(grammarAccess.getAliasDefListAccess().getGroup(), "rule__AliasDefList__Group__0");
					put(grammarAccess.getAliasDefListAccess().getGroup_2(), "rule__AliasDefList__Group_2__0");
					put(grammarAccess.getFieldDefAccess().getGroup(), "rule__FieldDef__Group__0");
					put(grammarAccess.getFieldDefAccess().getGroup_1(), "rule__FieldDef__Group_1__0");
					put(grammarAccess.getFieldFefListAccess().getGroup(), "rule__FieldFefList__Group__0");
					put(grammarAccess.getFieldFefListAccess().getGroup_2(), "rule__FieldFefList__Group_2__0");
					put(grammarAccess.getTupleTypeAccess().getGroup(), "rule__TupleType__Group__0");
					put(grammarAccess.getBag_typeAccess().getGroup(), "rule__Bag_type__Group__0");
					put(grammarAccess.getBag_typeAccess().getGroup_2(), "rule__Bag_type__Group_2__0");
					put(grammarAccess.getBag_typeAccess().getGroup_2_0(), "rule__Bag_type__Group_2_0__0");
					put(grammarAccess.getGroup_item_listAccess().getGroup(), "rule__Group_item_list__Group__0");
					put(grammarAccess.getGroup_item_listAccess().getGroup_1(), "rule__Group_item_list__Group_1__0");
					put(grammarAccess.getOrder_by_clauseAccess().getGroup_0(), "rule__Order_by_clause__Group_0__0");
					put(grammarAccess.getOrder_col_listAccess().getGroup(), "rule__Order_col_list__Group__0");
					put(grammarAccess.getOrder_col_listAccess().getGroup_1(), "rule__Order_col_list__Group_1__0");
					put(grammarAccess.getOrder_colAccess().getGroup_0(), "rule__Order_col__Group_0__0");
					put(grammarAccess.getOrder_colAccess().getGroup_1(), "rule__Order_col__Group_1__0");
					put(grammarAccess.getPartition_clauseAccess().getGroup(), "rule__Partition_clause__Group__0");
					put(grammarAccess.getRel_listAccess().getGroup(), "rule__Rel_list__Group__0");
					put(grammarAccess.getRel_listAccess().getGroup_1(), "rule__Rel_list__Group_1__0");
					put(grammarAccess.getJoin_sub_clauseAccess().getGroup(), "rule__Join_sub_clause__Group__0");
					put(grammarAccess.getJoin_sub_clauseAccess().getGroup_3(), "rule__Join_sub_clause__Group_3__0");
					put(grammarAccess.getJoin_itemAccess().getGroup(), "rule__Join_item__Group__0");
					put(grammarAccess.getGroup_itemAccess().getGroup(), "rule__Group_item__Group__0");
					put(grammarAccess.getGroup_itemAccess().getGroup_0_0(), "rule__Group_item__Group_0_0__0");
					put(grammarAccess.getJoin_group_by_clauseAccess().getGroup(), "rule__Join_group_by_clause__Group__0");
					put(grammarAccess.getJoin_group_by_expr_listAccess().getGroup_1(), "rule__Join_group_by_expr_list__Group_1__0");
					put(grammarAccess.getJoin_group_by_expr_listAccess().getGroup_1_2(), "rule__Join_group_by_expr_list__Group_1_2__0");
					put(grammarAccess.getNested_blkAccess().getGroup(), "rule__Nested_blk__Group__0");
					put(grammarAccess.getGenerate_clauseAccess().getGroup(), "rule__Generate_clause__Group__0");
					put(grammarAccess.getGenerate_clauseAccess().getGroup_2(), "rule__Generate_clause__Group_2__0");
					put(grammarAccess.getNested_command_listAccess().getGroup(), "rule__Nested_command_list__Group__0");
					put(grammarAccess.getNested_command_listAccess().getGroup_1(), "rule__Nested_command_list__Group_1__0");
					put(grammarAccess.getNested_commandAccess().getGroup(), "rule__Nested_command__Group__0");
					put(grammarAccess.getNested_opAccess().getGroup_4(), "rule__Nested_op__Group_4__0");
					put(grammarAccess.getNested_opAccess().getGroup_4_0(), "rule__Nested_op__Group_4_0__0");
					put(grammarAccess.getNestedFilterAccess().getGroup(), "rule__NestedFilter__Group__0");
					put(grammarAccess.getNested_sortAccess().getGroup(), "rule__Nested_sort__Group__0");
					put(grammarAccess.getNested_sortAccess().getGroup_4(), "rule__Nested_sort__Group_4__0");
					put(grammarAccess.getNested_distinctAccess().getGroup(), "rule__Nested_distinct__Group__0");
					put(grammarAccess.getNested_limitAccess().getGroup(), "rule__Nested_limit__Group__0");
					put(grammarAccess.getSplit_branchAccess().getGroup(), "rule__Split_branch__Group__0");
					put(grammarAccess.getDollar_col_refAccess().getGroup(), "rule__Dollar_col_ref__Group__0");
					put(grammarAccess.getScalarIntAccess().getGroup_3(), "rule__ScalarInt__Group_3__0");
					put(grammarAccess.getQueryAccess().getElementsAssignment(), "rule__Query__ElementsAssignment");
					put(grammarAccess.getLoadStatementAccess().getNameAssignment_0(), "rule__LoadStatement__NameAssignment_0");
					put(grammarAccess.getForeachStatementAccess().getNameAssignment_0(), "rule__ForeachStatement__NameAssignment_0");
					put(grammarAccess.getForeachStatementAccess().getTypeAssignment_3(), "rule__ForeachStatement__TypeAssignment_3");
					put(grammarAccess.getForeachStatementAccess().getItemsAssignment_4_0_0(), "rule__ForeachStatement__ItemsAssignment_4_0_0");
					put(grammarAccess.getForeachStatementAccess().getItemsAssignment_4_1(), "rule__ForeachStatement__ItemsAssignment_4_1");
					put(grammarAccess.getFilterStatementAccess().getNameAssignment_0(), "rule__FilterStatement__NameAssignment_0");
					put(grammarAccess.getFilterStatementAccess().getTypeAssignment_3(), "rule__FilterStatement__TypeAssignment_3");
					put(grammarAccess.getFilterStatementAccess().getCondAssignment_5(), "rule__FilterStatement__CondAssignment_5");
					put(grammarAccess.getGroupByStatementAccess().getNameAssignment_0(), "rule__GroupByStatement__NameAssignment_0");
					put(grammarAccess.getGroupByStatementAccess().getTypeAssignment_3(), "rule__GroupByStatement__TypeAssignment_3");
					put(grammarAccess.getGroupByStatementAccess().getItemsAssignment_4(), "rule__GroupByStatement__ItemsAssignment_4");
					put(grammarAccess.getCoGroupByStatementAccess().getNameAssignment_0(), "rule__CoGroupByStatement__NameAssignment_0");
					put(grammarAccess.getCoGroupByStatementAccess().getAliasesAssignment_3(), "rule__CoGroupByStatement__AliasesAssignment_3");
					put(grammarAccess.getOrderStatementAccess().getNameAssignment_0(), "rule__OrderStatement__NameAssignment_0");
					put(grammarAccess.getOrderStatementAccess().getTypeAssignment_3(), "rule__OrderStatement__TypeAssignment_3");
					put(grammarAccess.getCrossStatementAccess().getNameAssignment_0(), "rule__CrossStatement__NameAssignment_0");
					put(grammarAccess.getCrossStatementAccess().getAliasesAssignment_3(), "rule__CrossStatement__AliasesAssignment_3");
					put(grammarAccess.getUnionStatementAccess().getNameAssignment_0(), "rule__UnionStatement__NameAssignment_0");
					put(grammarAccess.getUnionStatementAccess().getAliasesAssignment_4(), "rule__UnionStatement__AliasesAssignment_4");
					put(grammarAccess.getJoinStatementAccess().getNameAssignment_0(), "rule__JoinStatement__NameAssignment_0");
					put(grammarAccess.getJoinStatementAccess().getAliasesAssignment_3(), "rule__JoinStatement__AliasesAssignment_3");
					put(grammarAccess.getLimitStatementAccess().getNameAssignment_0(), "rule__LimitStatement__NameAssignment_0");
					put(grammarAccess.getLimitStatementAccess().getTypeAssignment_3(), "rule__LimitStatement__TypeAssignment_3");
					put(grammarAccess.getSampleStatementAccess().getNameAssignment_0(), "rule__SampleStatement__NameAssignment_0");
					put(grammarAccess.getSampleStatementAccess().getTypeAssignment_3(), "rule__SampleStatement__TypeAssignment_3");
					put(grammarAccess.getDistinctStatementAccess().getNameAssignment_0(), "rule__DistinctStatement__NameAssignment_0");
					put(grammarAccess.getDistinctStatementAccess().getTypeAssignment_3(), "rule__DistinctStatement__TypeAssignment_3");
					put(grammarAccess.getStreamStatementAccess().getNameAssignment_0(), "rule__StreamStatement__NameAssignment_0");
					put(grammarAccess.getStreamStatementAccess().getTypeAssignment_3(), "rule__StreamStatement__TypeAssignment_3");
					put(grammarAccess.getMrStatementAccess().getNameAssignment_0(), "rule__MrStatement__NameAssignment_0");
					put(grammarAccess.getMrStatementAccess().getLoadAssignment_5(), "rule__MrStatement__LoadAssignment_5");
					put(grammarAccess.getSplitStatementAccess().getNameAssignment_0(), "rule__SplitStatement__NameAssignment_0");
					put(grammarAccess.getSplitStatementAccess().getTypeAssignment_3(), "rule__SplitStatement__TypeAssignment_3");
					put(grammarAccess.getSplitStatementAccess().getBranchesAssignment_5(), "rule__SplitStatement__BranchesAssignment_5");
					put(grammarAccess.getSplitStatementAccess().getBranchesAssignment_6_1(), "rule__SplitStatement__BranchesAssignment_6_1");
					put(grammarAccess.getStoreStatementAccess().getTypeAssignment_1(), "rule__StoreStatement__TypeAssignment_1");
					put(grammarAccess.getDescribeStatementAccess().getTypeAssignment_1(), "rule__DescribeStatement__TypeAssignment_1");
					put(grammarAccess.getExplainStatementAccess().getTypeAssignment_1(), "rule__ExplainStatement__TypeAssignment_1");
					put(grammarAccess.getDumpStatementAccess().getTypeAssignment_1(), "rule__DumpStatement__TypeAssignment_1");
					put(grammarAccess.getOrConditionAccess().getRightAssignment_1_2(), "rule__OrCondition__RightAssignment_1_2");
					put(grammarAccess.getAndConditionAccess().getRightAssignment_1_2(), "rule__AndCondition__RightAssignment_1_2");
					put(grammarAccess.getUnaryConditionAccess().getLeftExpAssignment_0_2_1(), "rule__UnaryCondition__LeftExpAssignment_0_2_1");
					put(grammarAccess.getUnaryConditionAccess().getRightExpAssignment_0_2_3(), "rule__UnaryCondition__RightExpAssignment_0_2_3");
					put(grammarAccess.getUnaryConditionAccess().getRightAssignment_0_4_2(), "rule__UnaryCondition__RightAssignment_0_4_2");
					put(grammarAccess.getUnaryConditionAccess().getRightAssignment_1_1_2(), "rule__UnaryCondition__RightAssignment_1_1_2");
					put(grammarAccess.getFunc_evalAccess().getArg_listAssignment_3(), "rule__Func_eval__Arg_listAssignment_3");
					put(grammarAccess.getReal_arg_listAccess().getArgsAssignment_0(), "rule__Real_arg_list__ArgsAssignment_0");
					put(grammarAccess.getReal_arg_listAccess().getArgsAssignment_1_1(), "rule__Real_arg_list__ArgsAssignment_1_1");
					put(grammarAccess.getAddExpressionAccess().getMul_expAssignment_1_1(), "rule__AddExpression__Mul_expAssignment_1_1");
					put(grammarAccess.getMulti_exprAccess().getMul_castAssignment_1_1(), "rule__Multi_expr__Mul_castAssignment_1_1");
					put(grammarAccess.getBin_exprAccess().getLeftExpAssignment_3(), "rule__Bin_expr__LeftExpAssignment_3");
					put(grammarAccess.getBin_exprAccess().getRightExpAssignment_5(), "rule__Bin_expr__RightExpAssignment_5");
					put(grammarAccess.getAliasTypeAccess().getReferencedAssignment(), "rule__AliasType__ReferencedAssignment");
					put(grammarAccess.getDefaultClauseAccess().getNameAssignment_1(), "rule__DefaultClause__NameAssignment_1");
					put(grammarAccess.getDeclareClauseAccess().getNameAssignment_1(), "rule__DeclareClause__NameAssignment_1");
					put(grammarAccess.getDefineClauseAccess().getNameAssignment_1(), "rule__DefineClause__NameAssignment_1");
					put(grammarAccess.getGroup_item_listAccess().getItemsAssignment_1_1(), "rule__Group_item_list__ItemsAssignment_1_1");
					put(grammarAccess.getRel_listAccess().getTypeAssignment_0(), "rule__Rel_list__TypeAssignment_0");
					put(grammarAccess.getRel_listAccess().getTypeAssignment_1_1(), "rule__Rel_list__TypeAssignment_1_1");
					put(grammarAccess.getJoin_sub_clauseAccess().getOthersAssignment_3_1(), "rule__Join_sub_clause__OthersAssignment_3_1");
					put(grammarAccess.getJoin_itemAccess().getTypeAssignment_0(), "rule__Join_item__TypeAssignment_0");
					put(grammarAccess.getJoin_itemAccess().getExpressionsAssignment_1(), "rule__Join_item__ExpressionsAssignment_1");
					put(grammarAccess.getJoin_group_by_expr_listAccess().getLeftAssignment_1_1(), "rule__Join_group_by_expr_list__LeftAssignment_1_1");
					put(grammarAccess.getJoin_group_by_expr_listAccess().getExpressionsAssignment_1_2_1(), "rule__Join_group_by_expr_list__ExpressionsAssignment_1_2_1");
					put(grammarAccess.getNested_blkAccess().getClausesAssignment_2(), "rule__Nested_blk__ClausesAssignment_2");
					put(grammarAccess.getGenerate_clauseAccess().getItemsAssignment_1(), "rule__Generate_clause__ItemsAssignment_1");
					put(grammarAccess.getGenerate_clauseAccess().getItemsAssignment_2_1(), "rule__Generate_clause__ItemsAssignment_2_1");
					put(grammarAccess.getNested_command_listAccess().getCmdsAssignment_1_0(), "rule__Nested_command_list__CmdsAssignment_1_0");
					put(grammarAccess.getNestedFilterAccess().getExpAssignment_1(), "rule__NestedFilter__ExpAssignment_1");
					put(grammarAccess.getNestedFilterAccess().getCondAssignment_3(), "rule__NestedFilter__CondAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.apache.pigeditor.ui.contentassist.antlr.internal.InternalPigParser typedParser = (org.apache.pigeditor.ui.contentassist.antlr.internal.InternalPigParser) parser;
			typedParser.entryRuleQuery();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PigGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PigGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
