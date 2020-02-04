/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet;

import java.util.ArrayList;
import java.util.List;


public class NodeCtrl {

	private int NODE_AMOUNT = 100;

	private List<Node> nodes;


	public NodeCtrl() {

		this.nodes = new ArrayList<>();

		for (int i = 0; i < NODE_AMOUNT; i++) {
			nodes.add(new Node());
		}
	}

	public void run() {

		for (Node node : nodes) {
			node.calculate();
		}
	}

}
