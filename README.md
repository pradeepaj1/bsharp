# SER502-Spring2019-Team16


System: Windows, MacOS


Tools used: 

    antlr4.7 - To generate the parser
    
    java - To compile and run the bSharp code
    
    maven - For dependency management and build
    




Directions to build the project: 

    1. Navigate to the project root folder(SER502-Spring2019-Team16) in terminal
    2. Execute the command :  mvn clean package
    
    The bSharpCompiler.jar and bSharpRunner.jar will be generated inside the `target` directory



Directions to compile and run the bSharp source code:
    

     1. Navigate to the project root folder(SER502-Spring2019-Team16) in terminal

     **To compile the source code:**
                (Invoke the compiler jar with source code file path as argument, file path has 
                to be relative to the present working directory. This will generate the intermediate
                code inside the same directory with .bsharp.intermediate extension)
                
                _java -jar target/bSharpCompiler.jar data/{directoryname}/{filename}.bsharp_
                
     **To run the source code:**
                 (Invoke the runner jar with the intermediate code file path as argument, file path has 
                 to be relative to the present working directory. This will print the output of the 
                 program along with the final environment)
                 
                 _java -jar target/bSharpRunner.jar data/{directoryname}/{filename}.bsharp.intermediate_
                
                
     Inside the `data` direcory, there will be subdirectories where each subdirectorie contains a bSharp program.



Link to the YouTube video: NONE
