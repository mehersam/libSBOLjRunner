libSBOLjRunner
===============

libSBOLjRunner is the test runner that tests the [libSBOLj](https://github.com/SynBioDex/libSBOLj/releases) application for compliance of the [SBOL Standard](http://sbolstandard.org/). This test runner can be run as a standalone application, but it's intended purpose is to run it using the [SBOLTestRunner](https://github.com/mehersam/SBOLTestRunner). The application follows the Simple Round-trip approach as described within the github link to SBOLTestRunner. The application takes as input an SBOL data file and imports the file into libSBOLjRunner and exports an SBOL data file. The purpose of this process is to ensure the libSBOLj does not internally perform any data changes to SBOL data on import. Additionally, this proces also identifies any unstated changes and test its overall compliance of the SBOL Standard.  

### Retrieving libSBOLjRunner

1. [Create](https://github.com/) a GitHub account.
2. [Setup](https://help.github.com/articles/set-up-git) Git on your machine.
3. [Clone](https://help.github.com/articles/cloning-a-repository/) the SBOLRunners GitHub repository to your machine.


### Compiling and Packaging libSBOLjRunner 

1. [Setup](http://maven.apache.org/download.cgi) Apache Maven. A tutorial on using Apache Maven is provided [here](http://maven.apache.org/guides/getting-started/index.html).

2. In the command line, change to the directory of the runner needed (e.g. ```cd /path/to/libSBOLjRunner```) and execute the following command

```
mvn package
```

This will compile the libSBOLjRunner source files, package the compiled source into a libSBOLjRunner JAR file (```libSBOLjRunner-<version>-SNAPSHOT-withDependencies.jar```), and place the JAR file into the ```core2/target``` sub-directory. 

### Using the libSBOLjRunner

The libSBOLjRunner can be run through the command-line by using the following command: 

```
  java -jar <jarFileName> <sbol_file_name> <retrieved_file_path> 
```

a. <jarFileName> is the name of the libSBOLjRunner jar file downloaded. <br />
b. <sbol_file_name> is the SBOL data file to import. <br />
c. <retrieved_file_path> is the file path location where the exported file from SynBioHub will be placed. <br />
