/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.numerical.splitters;

import com.asofterspace.nonsenseNet.numerical.Splitter;


public class ReturnToAll extends Splitter {

	public Integer[] distribute(int value) {

		Integer[] result = new Integer[1];

		result[0] = value;

		return result;
	}

}
