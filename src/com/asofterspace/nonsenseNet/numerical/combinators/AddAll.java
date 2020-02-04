/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.numerical.combinators;

import com.asofterspace.nonsenseNet.numerical.Combinator;
import com.asofterspace.nonsenseNet.numerical.Node;


public class AddAll extends Combinator {

	public int gatherInputFrom(List<Node> inputs) {

		if (inputs.size() < 1) {
			return 0;
		}

		int result = 0;
		for (Node curInput : inputs) {
			if (curInput != null) {
				result += curInput.getValue();
			}
		}
		return result;
	}

}
