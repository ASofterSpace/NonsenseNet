/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.combinators;

import com.asofterspace.nonsenseNet.Operation;


public class StrUpCase extends Operation {

	public Object applyTo(Object input) {

		String value = getAsStr(input);

		return value.toUpperCase();
	}

}
