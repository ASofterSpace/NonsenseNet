/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.numerical.splitters;

import com.asofterspace.nonsenseNet.numerical.Splitter;


public class ReturnToAll extends Splitter {

	public int[] distribute(int value) {

		int[] result = new int[1];

		result[0] = value;

		return result;
	}

}
