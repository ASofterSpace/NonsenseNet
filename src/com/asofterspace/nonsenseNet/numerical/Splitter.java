/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet.numerical;

import com.asofterspace.nonsenseNet.GenericSplitter;


public abstract class Splitter extends GenericSplitter {

	public abstract Integer[] distribute(int value);
}
