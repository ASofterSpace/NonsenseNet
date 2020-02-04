/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet;

public abstract class NodeAction {

	public int getAsInt(Object input) {

		if (input == null) {
			return 0;
		}

		if (input instanceof Integer) {
			return (int) (Integer) input;
		}

		// TODO :: convert string (or other data) to integer

		return 0;
	}

	public String getAsStr(Object input) {

		if (input == null) {
			return "";
		}

		return input.toString();
	}

}
