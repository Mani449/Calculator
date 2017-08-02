package com.mani.learning;

import java.util.function.BinaryOperator;

public class Calculator<T> {

	private T operator1, operator2;

	/**
	 * Empty constructor for the creation of Calculator object.
	 */
	public Calculator() {
	}

	/** Calculator constructor with operands. hellow */
	public Calculator(final T operator1, final T operator2) {
		this();
		setOperator2(operator1, operator2);
	}

	public void setOperator2(final T operator1, final T operator2) {
		this.operator1 = operator1;
		this.operator2 = operator2;
	}

	public T getOperator1() {
		return this.operator1;
	}

	public T getOperator2() {
		return this.operator2;
	}

	public T operation(final BinaryOperator<T> operation) {
		return operation.apply(operator1, operator2);
	}
}
