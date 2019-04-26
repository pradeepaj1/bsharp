package runtime;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Runner {

    public static void main(String args[]) {
        List<String> code = readProgramFromFile();

        for (String line : code) {
            evaluateLine(line);
        }


        for (HashMap.Entry entry: variableValueMap.entrySet()) {
            System.out.println(entry.getKey()+ "---" + entry.getValue());
        }
    }


    private static List<String> readProgramFromFile() {
        List<String> program = null;
        try {
            program = FileUtils.readLines(
                    new File("data/s.intermediate"), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return program;
    }


    private static HashMap<String, Integer> opcodeOperationMap = new HashMap<String, Integer>(){
        {
            put("TYPE", 1);
            put("MOV", 2);
            put("WRITE", 3);
            put("ADD", 4);
            put("SUB", 5);
            put("MUL", 6);
            put("DIV", 7);
        }
    };

    private static HashMap<String, Object> variableValueMap = new HashMap<String, Object>(){
        {

        }
    };
    private static HashMap<String, Class<?>> variableTypeMap = new HashMap<String, Class<?>>(){
        {

        }
    };


    private static void evaluateLine(String line) {
        String[] splits = line.split(" ");
        int opcode = opcodeOperationMap.get(splits[0]);
        switch (opcode) {
            case 1:
                handleType(splits[2], splits[1]);
                break;
            case 2:
                handleMove(splits[2], splits[1]);
                break;
            case 3:
                String displayResult = getVariableValue(splits[1]) == null
                                        ? splits[1]
                                        : getVariableValue(splits[1]).toString();
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
        }
    }



    private static Object acc;
    private static int programCounter = 1;

    private static Object getVariableValue(String variable) {
        Object value;
        if (variable.equals("ACC")) {
            value = acc;
        } else {
            value = variableValueMap.get(variable);
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
        Class<?> variableType = null;
        if (type.equals("bool")) {
            variableType = Boolean.class;
        } else {
            variableType = Double.class;
        }
        variableTypeMap.put(var, variableType);
    }


}