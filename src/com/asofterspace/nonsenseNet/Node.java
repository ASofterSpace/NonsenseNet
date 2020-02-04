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


	public Node() {

		this.inputs = new ArrayList<>();

		this.outputs = new ArrayList<>();

		this.operations = new ArrayList<>();
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

		splitter.distributeOutputTo(outputs);
	}

	public Object getValue();

}
