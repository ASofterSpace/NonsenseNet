/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet;

import com.asofterspace.toolbox.io.Directory;
import com.asofterspace.toolbox.io.File;
import com.asofterspace.toolbox.sound.SoundData;
import com.asofterspace.toolbox.sound.WavFile;

import java.util.List;
import java.util.Random;


/**
 * Trains the listener by scoring its results for its inputs, and if the trainer
 * itself is confused, asks the user about input
 */
public class ListenerTrainer {

	private Directory inputDir;

	private Random rand;


	public ListenerTrainer() {
		this.rand = new Random();
	}

	public void setInputDir(Directory inputDir) {
		this.inputDir = inputDir;
	}

	/**
	 * We want to read an original file from the input directory, and break it up into a smaller chunk
	 * that can be more easily understood and trained for (in the beginning just individual words, later
	 * also longer sentences)
	 */
	public void generateExampleInput() {

		Directory origDir = new Directory(inputDir, "original");

		boolean recursively = true;
		List<File> origFiles = origDir.getAllFiles(recursively);

		if (origFiles.size() < 1) {
			return;
		}

		// take one at random
		File origFile = origFiles.get(rand.nextInt(origFiles.size()));

		WavFile origWavFile = new WavFile(origFile);
		SoundData soundData = origWavFile.getSoundData();

		// pick a position inside the sound data at random
		int pos = rand.nextInt(soundData.getLength());

		// from this position onwards, expand left and right until we get a little bit of silence
		// TODO

		// cut out this portion, as it is the new word that we want to extract
		// TODO

		// save the new word as its own wav file
		// TODO

		// save metadata belonging to it, such as the text it actually truly represents
		// (which has to be filled in by a human - for now it is just unknown!)
		// TODO
	}

	public double scoreListening(WavFile inputFile, String extractedText) {
		return 0;
	}

}
