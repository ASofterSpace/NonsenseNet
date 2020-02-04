/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.combinators;

import com.asofterspace.nonsenseNet.Combinator;


public class TakeNth extends Combinator {

	private int numberToTake = 0;


	public TakeNth(int which) {
		this.numberToTake = which;
	}

	public Object gatherInputFrom(List<Node> inputs) {

		if (inputs.size() < 1) {
			return null;
		}

		if (numberToTake >= inputs.size()) {
			return null;
		}

		return inputs.get(numberToTake).getValue();
	}

}
