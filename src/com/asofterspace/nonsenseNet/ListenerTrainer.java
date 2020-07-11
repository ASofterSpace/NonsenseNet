/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet;

import com.asofterspace.toolbox.io.Directory;
import com.asofterspace.toolbox.io.File;
import com.asofterspace.toolbox.io.JsonFile;
import com.asofterspace.toolbox.sound.SoundData;
import com.asofterspace.toolbox.sound.WavFile;
import com.asofterspace.toolbox.utils.Record;

import java.util.List;
import java.util.Random;


/**
 * Trains the listener by scoring its results for its inputs, and if the trainer
 * itself is confused, asks the user about input
 */
public class ListenerTrainer {

	private Database database;

	private Directory inputDir;

	private Random rand;


	public ListenerTrainer(Database database, Directory inputDir) {
		this.database = database;
		this.inputDir = inputDir;
		this.rand = new Random();
	}

	public void setInputDir(Directory inputDir) {
		this.inputDir = inputDir;
	}

	/**
	 * We want to read an original file from the input directory, and break it up into a smaller chunk
	 * that can be more easily understood and trained for (such as individual words and sentences)
	 */
	public void generateExampleInput() {

		Directory origDir = new Directory(inputDir, "original");
		Directory generatedDir = new Directory(inputDir, "generated");

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
		// (let's say a quarter of a second of silence should be enough to get a sentence or even single words)
		// TODO
		int posStart = 0;
		int posEnd = 0;

		// cut out this portion, as it is the new word that we want to extract
		SoundData cutData = soundData.copy(posStart, posEnd);

		// save the new word or sentence as its own wav file
		Integer amount = database.getGeneratedTestFileAmount();
		if (amount == null) {
			amount = 0;
		}
		String newName = "ex" + amount;
		amount++;
		database.setGeneratedTestFileAmount(amount);
		database.save();
		WavFile outFile = new WavFile(generatedDir, newName + ".wav");
		outFile.setSoundData(curData);
		TODO - get more data of the original wav file into this one?

		// save metadata belonging to it, such as the text it actually truly represents
		// (which has to be filled in by a human - for now it is just unknown!)
		JsonFile metaFile = new JsonFile(generatedDir, newName + ".json");
		Record emptyRec = Record.emptyObject();
		emptyRec.set("trueText", null);
		emptyRec.set("origin", origFile.getLocalFilename());
		metaFile.save(emptyRec);
	}

	public double scoreListening(WavFile inputFile, String extractedText) {
		return 0;
	}

}
