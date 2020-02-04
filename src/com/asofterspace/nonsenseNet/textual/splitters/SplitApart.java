/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.textual.splitters;

import com.asofterspace.nonsenseNet.textual.Splitter;


public class SplitApart extends Splitter {

	@Override
	public String[] distribute(String value) {

		return value.split("");
	}

}
