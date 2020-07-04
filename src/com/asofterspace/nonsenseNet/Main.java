/**
 * Unlicensed code created by A Softer Space, 2020
 * www.asofterspace.com/licenses/unlicense.txt
 */
package com.asofterspace.nonsenseNet;

import com.asofterspace.toolbox.ai.nonsenseNet.NodeCtrl;
import com.asofterspace.toolbox.Utils;


public class Main {

	public final static String PROGRAM_TITLE = "NonsenseNet";
	public final static String VERSION_NUMBER = "0.0.0.3(" + Utils.TOOLBOX_VERSION_NUMBER + ")";
	public final static String VERSION_DATE = "3. February 2020 - 4. July 2020";


	public static void main(String[] args) {

		// let the Utils know in what program it is being used
		Utils.setProgramTitle(PROGRAM_TITLE);
		Utils.setVersionNumber(VERSION_NUMBER);
		Utils.setVersionDate(VERSION_DATE);

		if (args.length > 0) {
			if (args[0].equals("--version")) {
				System.out.println(Utils.getFullProgramIdentifierWithDate());
				return;
			}

			if (args[0].equals("--version_for_zip")) {
				System.out.println("version " + Utils.getVersionNumber());
				return;
			}
		}

		/*
		General plan:
		Right now, there is just one node ctrl here, so basically one NonsenseNet
		We want to:
		1) Get that one to work at least a liiiittle bit
		2) Create the first tiny "organism" in a simulated 2D environment, let's say amoeba,
		   with a NonsenseNet inside, which just floats around and acts on stimuli such as
		   food: nom!
		3) Add more of them, let's say at least have 100 amoeba floating around doing their
		   thing, ideally with reproduction and evolving NonseneNets
		4) Add new, more advanced organisms, let's say ants, which crawl around 2D space
		   with intention and in addition to eating and reproducing also solve puzzles
		   together
		5) Finally, add even more advanced organisms that exist in a 3D space and see the 3D
		   space through eyes which get a generated view of their environment as input
		   (so yeah the server knows about the absolute positions and body shapes and so on
		   of everything, and generates 2D images for their eyes to see, and their NonsenseNets
		   then take these images and try to understand where everything is in the space etc. xD)
		6) Add a new 3D avatar for us as human to interact with the advanced organisms
		*/

		/*
		Random notes:
		* Regarding memory, it would be great to have fuzzy memory that groups similar
		  events and forgets about less important things etc... in general, we want to
		  imitate life as we know it as well as we can, hoping that if we do this well
		  enough, just magically awesomeness arises :D
		*/

		NodeCtrl nodeCtrl = new NodeCtrl();
		nodeCtrl.run();

		System.out.println("Nonsense Net finished. Have a nice day! :)");
	}

}
