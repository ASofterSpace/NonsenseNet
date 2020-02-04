/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.numerical;

import com.asofterspace.nonsenseNet.GenericNode;


public class Node extends GenericNode {

	private List<Node> inputs;

	private List<Node> outputs;

	private Combinator combinator;

	private List<Operation> operations;

	private Splitter splitter;

	private int[] outputValues;

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

		int curValue = combinator.gatherInputFrom(inputs);

		for (Operation operation : operations) {
			curValue = operation.applyTo(curValue);
		}

		outputValues = splitter.distribute(curValue);

		currentlyAccessedOutVal = 0;
	}

	public int getValue() {

		int result = outputValues.get[currentlyAccessedOutVal];

		currentlyAccessedOutVal++;

		if (currentlyAccessedOutVal > outputValues.length) {
			currentlyAccessedOutVal = 0;
		}

		return result;
	}

}