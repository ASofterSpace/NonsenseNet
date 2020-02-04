/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet;

import java.util.ArrayList;
import java.util.List;


public class Node {

	private List<Node> inputs;

	private List<Node> outputs;

	private Combinator combinator;

	private List<Operation> operations;

	private Splitter splitter;

	private List<Object> outputValues;

	private int currentlyAccessedOutVal;


	public Node() {

		this.inputs = new ArrayList<>();

		this.outputs = new ArrayList<>();

		this.operations = new ArrayList<>();

		this.outputValues = new ArrayList<>();

		currentlyAccessedOutVal = 0;
	}

	public void addInput(Node inNode) {
		inputs.add(inNode);
	}

	public void addOutput(Node outNode) {
		outputs.add(outNode);
	}

	public void calculate() {

		Object curValue = combinator.gatherInputFrom(inputs);

		for (Operation operation : operations) {
			curValue = operation.applyTo(curValue);
		}

		outputValues = splitter.distributeOutputTo(outputs);

		currentlyAccessedOutVal = 0;
	}

	public Object getValue() {

		Object result = outputValues.get(currentlyAccessedOutVal);

		currentlyAccessedOutVal++;

		if (currentlyAccessedOutVal > outputValues.size()) {
			currentlyAccessedOutVal = 0;
		}

		return result;
	}

}
