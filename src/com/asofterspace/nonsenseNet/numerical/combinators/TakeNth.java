/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.numerical.combinators;

import com.asofterspace.nonsenseNet.numerical.Combinator;
import com.asofterspace.nonsenseNet.numerical.Node;


public class TakeNth extends Combinator {

	private int numberToTake = 0;


	public TakeNth(int which) {
		this.numberToTake = which;
	}

	public int gatherInputFrom(List<Node> inputs) {

		if (inputs.size() < 1) {
			return 0;
		}

		if (numberToTake >= inputs.size()) {
			return 0;
		}

		return inputs.get(numberToTake).getValue();
	}

}
