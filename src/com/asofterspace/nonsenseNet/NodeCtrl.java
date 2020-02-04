/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet;

import com.asofterspace.nonsenseNet.textual.Node;

import java.util.ArrayList;
import java.util.List;


public class NodeCtrl {

	private int NODE_AMOUNT = 100;

	private List<GenericNode> nodes;


	public NodeCtrl() {

		this.nodes = new ArrayList<>();

		for (int i = 0; i < NODE_AMOUNT; i++) {
			nodes.add(new Node());
		}
	}

	public void run() {

		for (GenericNode node : nodes) {
			node.calculate();
		}
	}

}
