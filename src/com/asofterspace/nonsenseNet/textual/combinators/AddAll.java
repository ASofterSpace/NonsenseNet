/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.textual.combinators;

import com.asofterspace.nonsenseNet.textual.Combinator;


public class AddAll extends Combinator {

	public String gatherInputFrom(List<Node> inputs) {

		if (inputs.size() < 1) {
			return null;
		}

		StringBuilder result = new StringBuilder();
		for (Object input : inputs) {
			result.append(input.getValue());
		}
		return result.toString();
	}

}
