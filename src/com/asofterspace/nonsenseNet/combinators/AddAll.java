/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.combinators;

import com.asofterspace.nonsenseNet.Combinator;


public class AddAll extends Combinator {

	public Object gatherInputFrom(List<Node> inputs) {

		if (inputs.size() < 1) {
			return null;
		}

		if (inputs.get(0) == null) {
			return null;
		}

		Object input = inputs.get(0).getValue();

		if (input instanceof String) {
			StringBuilder result = new StringBuilder();
			for (Object input : inputs) {
				result.append(getAsStr(input));
			}
			return result.toString();
		}

		if (input instanceof Integer) {
			Integer result = 0;
			for (Object curInput : inputs) {
				result += getAsInt(input);
			}
			return result;
		}

		return null;
	}

}
