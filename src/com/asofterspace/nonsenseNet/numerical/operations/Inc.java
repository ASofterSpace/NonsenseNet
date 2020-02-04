/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.numerical.combinators;

import com.asofterspace.nonsenseNet.numerical.Operation;


public class Inc extends Operation {

	@Override
	public int applyTo(int input) {
		return input + 1;
	}
}
