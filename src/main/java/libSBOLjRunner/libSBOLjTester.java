package libSBOLjRunner;

import java.io.File;
import java.io.IOException;

import org.sbolstandard.core2.SBOLConversionException;
import org.sbolstandard.core2.SBOLDocument;
import org.sbolstandard.core2.SBOLValidationException;

public class libSBOLjTester {
	
	private File input_file; 
	private SBOLDocument retrievedDoc;
	
	public libSBOLjTester(File read_file)
	{
		input_file = read_file; 

	}
	
	public void retrieveDoc(String filepath) throws SBOLValidationException, IOException, SBOLConversionException {
		retrievedDoc = new SBOLDocument();
		
		retrievedDoc.read(input_file);
		retrievedDoc.write(filepath); 		
	}
	
	public String retrieveInputFile() {
		return (String)input_file.getName();
	}


}
