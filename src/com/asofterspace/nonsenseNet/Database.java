/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet;

import com.asofterspace.toolbox.io.JSON;
import com.asofterspace.toolbox.io.JsonFile;
import com.asofterspace.toolbox.io.JsonParseException;
import com.asofterspace.toolbox.utils.Record;


public class Database {

	private final static String GENERATED_TEST_FILE_AMOUNT = "generatedTestFileAmount";

	private JsonFile dbFile;

	private JSON root;

	private Integer generatedTestFileAmount;

	/* here, put something like e.g.:
	private List<Object> objects;
	*/


	public Database() {

		this.dbFile = new JsonFile("config/database.json");
		this.dbFile.createParentDirectory();
		try {
			this.root = dbFile.getAllContents();
		} catch (JsonParseException e) {
			System.err.println("Oh no!");
			e.printStackTrace(System.err);
			System.exit(1);
		}

		/* here, put something like e.g.:

		List<Record> objectsRecs = root.getArray("objects");

		this.objects = new ArrayList<>();

		for (Record rec : objectsRecs) {
			objects.add(new Object(rec));
		}
		*/

		generatedTestFileAmount = root.getInteger(GENERATED_TEST_FILE_AMOUNT);
	}

	public Record getRoot() {
		return root;
	}

	public Integer getGeneratedTestFileAmount() {
		return generatedTestFileAmount;
	}

	public void setGeneratedTestFileAmount(Integer generatedTestFileAmount) {
		this.generatedTestFileAmount = generatedTestFileAmount;
	}

	public void save() {

		root.makeObject();

		/* here, put something like e.g.:

		List<Record> objectsRecs = new ArrayList<>();

		for (Object obj : objects) {
			objectsRecs.add(obj.toRecord());
		}

		root.set("objects", objectsRecs);
		*/

		root.set(GENERATED_TEST_FILE_AMOUNT, generatedTestFileAmount);

		dbFile.setAllContents(root);
		dbFile.save();
	}
}
