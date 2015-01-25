/*
 *
 */
package com.rht.rht2.util;

import java.math.BigDecimal;

import com.mysema.query.BooleanBuilder;
import com.mysema.query.support.Expressions;
import com.mysema.query.types.ConstantImpl;
import com.mysema.query.types.Expression;
import com.mysema.query.types.Ops;
import com.mysema.query.types.Predicate;
import com.mysema.query.types.expr.BooleanExpression;
import com.mysema.query.types.expr.BooleanOperation;
import com.mysema.query.types.expr.SimpleExpression;
import com.mysema.query.types.path.BooleanPath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import com.mysema.query.types.template.SimpleTemplate;
import com.rht.rht2.model.PersistentItemTO;

// TODO: Auto-generated Javadoc
/**
 * The Class QueryHelper.
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class QueryHelper {

	/**
	 * All of.
	 *
	 * @param bb
	 *            the bb
	 * @param predicates
	 *            the predicates
	 * 
	
	 * @return the boolean builder */
	public static BooleanBuilder allOf(BooleanBuilder bb,
			Predicate... predicates) {
		if (predicates != null) {
			for (final Predicate p : predicates) {
				if (p != null) {
					bb.and(p);
				}
			}
		}
		return bb;
	}

	/**
	 * Any of.
	 *
	 * @param bb
	 *            the bb
	 * @param predicates
	 *            the predicates
	 * 
	
	 * @return the boolean builder */
	public static BooleanBuilder anyOf(BooleanBuilder bb,
			Predicate... predicates) {
		if (predicates != null) {
			for (final Predicate p : predicates) {
				if (p != null) {
					bb.or(p);
				}
			}
		}
		return bb;
	}

	/**
	 * Builds the like.
	 *
	 * @param like
	 *            the like
	 * 
	
	 * @return the string */
	public static String buildLike(String like) {
		return "%" + like + "%";
	}

	/**
	 * Creates the predicate and list.
	 *
	 * @param predicates
	 *            the predicates
	 * 
	
	 * @return the boolean builder */
	public static BooleanBuilder createPredicateAndList(Predicate... predicates) {
		final BooleanBuilder bb = new BooleanBuilder();
		allOf(bb, predicates);

		return bb;
	}

	/**
	 * Returns a BooleanExpression based on the supplied id and
	 * {@link NumberPath}.
	 *
	 * @param id
	 *            the id which we are trying to match to the supplied
	 *            {@link NumberPath}.
	 * @param value
	 *            the {@link NumberPath} to be matched.
	 * 
	
	 * @return a BooleanExpression if the supplied id is not 0, else null. */
	public static BooleanExpression getBooleanExpressionForNumberPath(
			final int id, final NumberPath<Integer> value) {
		BooleanExpression predicate = null;

		if (id > 0) {
			predicate = value.eq(id);
		}
		return predicate;
	}

	/**
	 * Returns a BooleanExpression based on the supplied
	 * {@link PersistentItemTO} and {@link NumberPath}.
	 *
	 * @param to
	 *            the {@link PersistentItemTO} whose <code>id</code> we are
	 *            trying to match to the supplied {@link NumberPath}.
	 * @param value
	 *            the {@link NumberPath} to be matched.
	 * 
	
	 * @return a BooleanExpression if the supplied {@link PersistentItemTO} is
	 *         not null and its <code>id</code> is not 0, else null. */
	public static BooleanExpression getBooleanExpressionForNumberPath(
			final PersistentItemTO to, final NumberPath<Integer> value) {
		BooleanExpression predicate = null;
		if (to != null) {
			predicate = getBooleanExpressionForNumberPath(to.getId(), value);
		}
		return predicate;
	}

	/**
	 * Returns a BooleanExpression based on the supplied
	 * <code>numberArray</code> and {@link NumberPath} which will search for
	 * values in <code>value</code> which are "in" the supplied
	 * <code>numberArray</code>.
	 *
	 * @param numberArray
	 *            the Number[] holding the values to be matched
	 * @param value
	 *            the {@link NumberPath} to be matched against.
	 * 
	
	 * @return the boolean expression for number path in */
	public static BooleanExpression getBooleanExpressionForNumberPathIn(
			final Number[] numberArray, final NumberPath<Integer> value) {
		BooleanExpression predicate = null;
		if (numberArray != null) {
			predicate = value.in(numberArray);
		}
		return predicate;
	}

	/**
	 * Returns a BooleanExpression based on the supplied
	 * <code>numberArray</code> and {@link NumberPath} which will search for
	 * values in <code>value</code> which are not "in" the supplied
	 * <code>numberArray</code>.
	 *
	 * @param numberArray
	 *            the Number[] holding the values to be matched
	 * @param value
	 *            the {@link NumberPath} to be matched against.
	 * 
	
	 * @return the boolean expression for number path not in */
	public static BooleanExpression getBooleanExpressionForNumberPathNotIn(
			final Number[] numberArray, final NumberPath<Integer> value) {
		BooleanExpression predicate = null;
		if (numberArray != null) {
			predicate = value.notIn(numberArray);
		}
		return predicate;
	}

	/**
	 * Returns a BooleanExpression based on the supplied id and
	 * {@link NumberPath}. The expression will be "id = value OR value IS NULL"
	 *
	 * @param id
	 *            the id which we are trying to match to the supplied
	 *            {@link NumberPath}.
	 * @param value
	 *            the {@link NumberPath} to be matched.
	 * 
	
	 * @return a BooleanExpression if the supplied id is not 0, else null. */

	public static BooleanExpression getBooleanExpressionForNumberPathOrIsNull(
			final int id, final NumberPath<Integer> value) {
		BooleanExpression predicate = null;

		if (id > 0) {
			predicate = value.eq(id).or(value.isNull());
		}
		return predicate;

	}

	/**
	 * Checks if is null.
	 *
	 * @param path
	 *            the path
	 * @param value
	 *            the value
	 * 
	
	 * @return the simple expression */
	public static SimpleExpression<Boolean> isNull(BooleanPath path,
			boolean value) {
		final Expression<Boolean> booleanConstant = Expressions.constant(value);

		final SimpleExpression<Boolean> expr = SimpleTemplate.create(
				Boolean.class, "ISNULL({0}, {1})", path, booleanConstant);

		return expr;

	}

	/**
	 * Checks if is null.
	 *
	 * @param path
	 *            the path
	 * @param value
	 *            the value
	 * 
	
	 * @return the expression */
	public static Expression<BigDecimal> isNull(NumberPath<BigDecimal> path,
			BigDecimal value) {
		final Expression<BigDecimal> intConstant = Expressions.constant(value);
		final Expression<BigDecimal> expr = SimpleTemplate.create(
				BigDecimal.class, "ISNULL({0}, {1})", path, intConstant);

		return expr;
	}

	/**
	 * Checks if is null.
	 *
	 * @param path
	 *            the path
	 * @param value
	 *            the value
	 * 
	
	 * @return the expression */
	public static Expression<String> isNull(StringPath path, String value) {

		final Expression<String> strConstant = Expressions.constant(value);

		final SimpleExpression<String> exp = SimpleTemplate.create(
				String.class, "ISNULL({0}, {1})", path, strConstant);

		return exp;
	}

	/**
	 * Checks if is null.
	 *
	 * @param path
	 *            the path
	 * @param value
	 *            the value
	 * @param alias
	 *            the alias
	 * 
	
	 * @return the expression */
	public static Expression<String> isNull(StringPath path, String value,
			String alias) {

		final Expression<String> strConstant = Expressions.constant(value);
		final Expression<String> strAlias = Expressions.constant(alias);

		final SimpleExpression<String> exp = SimpleTemplate.create(
				String.class, "ISNULL({0}, {1}) AS {2}", path, strConstant,
				strAlias);

		return exp;
	}

	/**
	 * Logical and.
	 *
	 * @param path
	 *            the path
	 * @param value
	 *            the value
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression logicalAnd(NumberPath<Integer> path,
			int value) {
		final Expression<Integer> flagConstant = Expressions.constant(value);
		final SimpleExpression<Integer> expr = SimpleTemplate.create(
				Integer.class, "({0} & {1})", path, flagConstant);

		final BooleanExpression predicate = BooleanOperation.create(
				Ops.EQ_IGNORE_CASE, expr, flagConstant);
		return predicate;
	}

	/**
	 * Logical and.
	 *
	 * @param path
	 *            the path
	 * @param andBy
	 *            the and by
	 * @param value
	 *            the value
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression logicalAnd(NumberPath<Integer> path,
			int andBy, int value) {
		final Expression<Integer> flagConstant = Expressions.constant(andBy);
		final SimpleExpression<Integer> expr = SimpleTemplate.create(
				Integer.class, "({0} & {1})", path, flagConstant);

		final BooleanExpression predicate = BooleanOperation.create(
				Ops.EQ_IGNORE_CASE, expr, Expressions.constant(value));
		return predicate;
	}

	/**
	 * Sets the like predicate.
	 *
	 * @param value
	 *            the value
	 * @param column
	 *            the column
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression setLikePredicate(int value,
			NumberPath<Integer> column) {
		return BooleanOperation.create(Ops.LIKE, column,
				ConstantImpl.create(buildLike(String.valueOf(value))));
	}

	/**
	 * Sets the like predicate.
	 *
	 * @param value
	 *            the value
	 * @param column
	 *            the column
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression setLikePredicate(String value,
			StringPath column) {
		if (value != null && !value.isEmpty()) {
			return column.like(buildLike(value));
		}
		return null;
	}

	/**
	 * Sets the predicate.
	 *
	 * @param value
	 *            the value
	 * @param column
	 *            the column
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression setPredicate(boolean value,
			BooleanPath column) {
		return column.eq(value);
	}

	/**
	 * Sets the predicate.
	 *
	 * @param value
	 *            the value
	 * @param column
	 *            the column
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression setPredicate(boolean value,
			NumberPath<Integer> column) {
		if (value) {
			return column.eq(1);
		}
		return column.isNull().or(column.eq(0));
	}

	/**
	 * Sets the predicate.
	 *
	 * @param value
	 *            the value
	 * @param column
	 *            the column
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression setPredicate(int value,
			NumberPath<Integer> column) {
		if (value > 0) {
			return column.eq(value);
		}
		return null;
	}

	/**
	 * Sets the predicate.
	 *
	 * @param value
	 *            the value
	 * @param column
	 *            the column
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression setPredicate(long value,
			NumberPath<Long> column) {
		if (value > 0) {
			return column.eq(value);
		}
		return null;
	}

	/**
	 * Sets the predicate like.
	 *
	 * @param value
	 *            the value
	 * @param column
	 *            the column
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression setPredicateLike(String value,
			StringPath column) {
		if (value != null && !value.isEmpty()) {
			return column.like(value + "%");
		}
		return null;
	}

	/**
	 * Sets the predicate string equals.
	 *
	 * @param value
	 *            the value
	 * @param column
	 *            the column
	 * 
	
	 * @return the boolean expression */
	public static BooleanExpression setPredicateStringEquals(String value,
			StringPath column) {
		if (StringHelper.isStringPopulated(value)) {
			return column.eq(value);
		}
		return null;
	}

}
