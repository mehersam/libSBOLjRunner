package libSBOLjRunner;

import java.io.File;
import java.io.IOException;

import org.sbolstandard.core2.SBOLConversionException;
import org.sbolstandard.core2.SBOLValidationException;
import org.synbiohub.frontend.SynBioHubException;

public class libSBOLjRunner {

	public static void main(String[] args) throws SBOLValidationException, IOException, SBOLConversionException {
		if(args.length != 2)
			System.err.println("Please provide an input file and the retrieved SBOLDocument filepath");
		
		
		File input_file = new File(args[0]);
		String retrieved_doc_fp = args[1]; 		
		
		libSBOLjTester test = new libSBOLjTester(input_file); 
		test.retrieveDoc(retrieved_doc_fp);
		
		
	}

}
