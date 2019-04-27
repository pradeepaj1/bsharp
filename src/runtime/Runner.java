package runtime;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Runner {

    private static HashMap<String, Integer> opcodeOperationMap = new HashMap<String, Integer>(){
        {
            put("TYPE", 1);
            put("MOV", 2);
            put("WRITE", 3);
            put("ADD", 4);
            put("SUB", 5);
            put("MUL", 6);
            put("DIV", 7);
            put("LESS_THAN", 8);
            put("GREATER_THAN", 9);
            put("LESS_THAN_EQUAL_TO", 10);
            put("GREATER_THAN_EQUAL_TO", 11);
            put("DOUBLE_EQUAL_TO", 12);
            put("NOT_EQUAL_TO", 13);
            put("AND", 14);
            put("OR", 15);
            put("START_IF_ELSE_BLOCK", 16);
            put("BEGIN_WHILE", 17);
        }
    };
    private static HashMap<String, Object> variableValueMap = new HashMap<String, Object>();
    private static HashMap<String, Class<?>> variableTypeMap = new HashMap<String, Class<?>>();
    private static Object acc;
    private static int programCounter = 0;
    private static List<String> code;

    public static void main(String args[]) {
        String intermediateCodeFilePath;
        if (args.length > 0) {
            intermediateCodeFilePath = args[0];
        } else {
            intermediateCodeFilePath = "data/DefaultProgram/defaultprogram.bsharp.intermediate";
        }
        run(intermediateCodeFilePath);
    }

    private static void run(String intermediateCodeFilePath) {
        code = readProgramFromFile(intermediateCodeFilePath);
        System.out.println("\n\n******** PROGRAM OUTPUT ********");
        while (programCounter < code.size()) {
            evaluateLine(code.get(programCounter));
            programCounter++;
        }
        System.out.println("******** PROGRAM OUTPUT ********\n\n");
        printFinalEnvironment();
    }

    private static void printFinalEnvironment() {
        System.out.println("********  FINAL ENV ********");
        for (HashMap.Entry entry: variableValueMap.entrySet()) {

            System.out.println(entry.getKey()+ "\t\t-->\t\t" + entry.getValue());
        }
        System.out.println("********  FINAL ENV ********");
    }

    private static List<String> readProgramFromFile(String filepath) {
        List<String> program = null;
        try {
            program = FileUtils.readLines(
                    new File(filepath), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return program;
    }

    private static void evaluateLine(String line) {
        String[] splits = line.split(" ");
        Integer opcode = opcodeOperationMap.get(splits[0]);
        opcode = opcode != null ? opcode : -1;
        switch (opcode) {
            case 1:
                handleType(splits[2], splits[1]);
                break;
            case 2:
                handleMove(splits[2], splits[1]);
                break;
            case 3:
                StringBuilder displayResult = new StringBuilder();
                if (splits[1].contains("\"")) {
                    for (int i = 1; i < splits.length; i++) {
                        displayResult.append(splits[i]).append(" ");
                    }
                    displayResult = new StringBuilder(displayResult.substring(1, displayResult.length() - 2));
                } else {
                    displayResult = new StringBuilder(getVariableValue(splits[1]).toString());
                }
                System.out.println(displayResult);
                break;
            case 4:
                Double addResult = (Double)getVariableValue(splits[2]) + (Double)getVariableValue(splits[3]);
                setVariableValue(splits[1], addResult);
                break;
            case 5:
                Double subResult = (Double)getVariableValue(splits[2]) - (Double)getVariableValue(splits[3]);
                setVariableValue(splits[1], subResult);
                break;
            case 6:
                Double mulResult = (Double)getVariableValue(splits[2]) * (Double)getVariableValue(splits[3]);
                setVariableValue(splits[1], mulResult);
                break;
            case 7:
                Double divResult = (Double)getVariableValue(splits[2]) / (Double)getVariableValue(splits[3]);
                setVariableValue(splits[1], divResult);
                break;
            case 8:
                boolean ltResult = (Double)getVariableValue(splits[2]) < (Double)getVariableValue(splits[3]);
                setVariableValue(splits[1], ltResult);
                break;
            case 9:
                boolean gtResult = (Double)getVariableValue(splits[2]) > (Double)getVariableValue(splits[3]);
                setVariableValue(splits[1], gtResult);
                break;
            case 10:
                boolean lteResult = (Double)getVariableValue(splits[2]) <= (Double)getVariableValue(splits[3]);
                setVariableValue(splits[1], lteResult);
                break;
            case 11:
                boolean gteResult = (Double)getVariableValue(splits[2]) >= (Double)getVariableValue(splits[3]);
                setVariableValue(splits[1], gteResult);
                break;
            case 12:
                boolean eqResult = getVariableValue(splits[2]).equals(getVariableValue(splits[3]));
                setVariableValue(splits[1], eqResult);
                break;
            case 13:
                boolean neqResult = !(getVariableValue(splits[2]).equals(getVariableValue(splits[3])));
                setVariableValue(splits[1], neqResult);
                break;
            case 14:
                boolean andResult = (Boolean) getVariableValue(splits[2]) && (Boolean) getVariableValue(splits[3]);
                setVariableValue(splits[1], andResult);
                break;
            case 15:
                boolean orResult = (Boolean) getVariableValue(splits[2]) || (Boolean) getVariableValue(splits[3]);
                setVariableValue(splits[1], orResult);
                break;
            case 16:
                ++programCounter;
                processIfElseBlock();
                break;
            case 17:
                ++programCounter;
                processWhileLoop();
            default:
                break;
        }
    }

    private static Object getVariableValue(String variable) {
        Object value;
        if (variable.equals("ACC")) {
            value = acc;
        } else {
            value = variableValueMap.get(variable);
            if (value == null) {
                if (variable.contains(".")) {
                    value = Double.parseDouble(variable);
                } else {
                    value = Boolean.parseBoolean(variable);
                }
            }
        }
        return value;
    }

    private static void setVariableValue(String variable, Object value) {
        if (variable.equals("ACC")) {
            acc = value;
        } else {
            variableValueMap.get(variable);
        }
        variableValueMap.put(variable, value);
    }

    private static void handleMove(String source, String target) {
        Object val = getVariableValue(source);
        if (source.equals("True") || source.equals("False")) {
            val = Boolean.parseBoolean(source);
        }
        else if (val == null) {
            val = Double.parseDouble(source);
        }
        setVariableValue(target, val);
    }

    private static void handleType(String var, String type) {
        Class<?> variableType;
        if (type.equals("bool")) {
            variableType = Boolean.class;
        } else {
            variableType = Double.class;
        }
        variableTypeMap.put(var, variableType);
    }

    private static void processIfElseBlock() {
        while (!code.get(programCounter).split(" ")[0].equals("END_CONDITION")) {
            evaluateLine(code.get(programCounter));
            programCounter++;
        }
        if ((Boolean) acc) {
            while (!code.get(programCounter).split(" ")[0].equals("IF_BLOCK_ENDS")) {
                evaluateLine(code.get(programCounter));
                programCounter++;
            }
            while (!code.get(programCounter).split(" ")[0].equals("END_IF_ELSE_BLOCK")) {
                programCounter++;
            }
        } else {
            while (!code.get(programCounter).split(" ")[0].equals("IF_BLOCK_ENDS")) {
                programCounter++;
            }
            while (!code.get(programCounter).split(" ")[0].equals("END_IF_ELSE_BLOCK")) {
                evaluateLine(code.get(programCounter));
                programCounter++;
            }
        }
    }

    private static void processWhileLoop() {
        while (evaluateExpression(programCounter)) {
            int tempProgramCounter = programCounter;

            while (!code.get(tempProgramCounter).split(" ")[0].equals("END_CONDITION")) {
                tempProgramCounter++;
            }
            tempProgramCounter++;
            while (!code.get(tempProgramCounter).split(" ")[0].equals("END_WHILE")) {
                evaluateLine(code.get(tempProgramCounter));
                tempProgramCounter++;
            }
        }
        while (!code.get(programCounter).split(" ")[0].equals("END_WHILE")) {
            programCounter++;
        }
    }


    private static boolean evaluateExpression(int programCounter) {
        while (!code.get(programCounter).split(" ")[0].equals("END_CONDITION")) {
            evaluateLine(code.get(programCounter));
            programCounter++;
        }
        return (Boolean) acc;
    }

}
