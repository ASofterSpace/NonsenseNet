/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.numerical.splitters;

import com.asofterspace.nonsenseNet.numerical.Splitter;


public class SplitApart extends Splitter {

	public Integer[] distribute(int value) {

		// TODO :: instead actually split the result, e.g. by outputting
		// fixed size chunks that add up to the value

		Integer[] result = new Integer[1];

		result[0] = value;

		return result;
	}

}
