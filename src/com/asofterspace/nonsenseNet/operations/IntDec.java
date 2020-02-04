/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.combinators;

import com.asofterspace.nonsenseNet.Operation;


public class IntDec extends Operation {

	public Object applyTo(Object input) {

		int value = getAsInt(input);

		return (Integer) (value - 1);
	}

}
