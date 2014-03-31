package cs.ut.ee.algorithm;

public class Parameters {
	
	public static int N = 12;   
	 
	public final static String CLASS_PATH_ROUTINES = "cs.ut.ee.characterization.";
	
	public final static String JSON_PATTERN_SAMPLE = "{ \"mobileApplication\": \"Angry birds\", \"deviceID\": \"i9100\", \"description\": \"definition of candidates for computational offloading\", \"candidateComponents\": [ \"callplaceNqueens\", \"render\", \"draw\" ], \"variables\": [{ \"linguisticVariable\" : \"BANDWIDTH\", \"linguisticTerms\":[ {\"id\": \"speed_slow\", \"functionType\": \"Trepezoidal\", \"value1\": 0, \"value2\": 5, \"value3\": 11, \"value4\": 16 }, {\"id\": \"speed_normal\", \"functionType\": \"Trepezoidal\", \"value1\": 11, \"value2\": 38, \"value3\": 54, \"value4\": 92 }, {\"id\": \"speed_fast\", \"functionType\": \"Trepezoidal\", \"value1\": 54, \"value2\": 110, \"value3\": 160, \"value4\": 200 } ], \"setDescription\": \"mobile parameter\" },{ \"linguisticVariable\": \"CPULOAD_INSTANCE\", \"linguisticTerms\": [ {\"id\": \"cpu_low\", \"functionType\": \"Trepezoidal\", \"value1\": 0, \"value2\": 9, \"value3\": 18, \"value4\": 36 }, {\"id\": \"cpu_normal\", \"functionType\": \"Trepezoidal\", \"value1\": 27, \"value2\": 45, \"value3\": 54, \"value4\": 72 }, {\"id\": \"cpu_high\", \"functionType\": \"Trepezoidal\", \"value1\": 63, \"value2\": 81, \"value3\": 90, \"value4\": 100 } ], \"setDescription\":\"cloud parameter\" }], \"rules\":[ { \"operand1\": \"speed_slow\", \"operand2\": \"cpu_low\", \"operation\": \"AND\", \"result\": \"local\", \"ruleDescription\": \"Local processing\" }, { \"operand1\": \"speed_slow\", \"operand2\": \"cpu_normal\", \"operation\": \"AND\", \"result\": \"local\", \"ruleDescription\": \"Local processing\" }, { \"operand1\": \"speed_slow\", \"operand2\": \"cpu_high\", \"operation\": \"AND\", \"result\": \"local\", \"ruleDescription\": \"Local processing\" }, { \"operand1\": \"speed_normal\", \"operand2\": \"cpu_low\", \"operation\": \"AND\", \"result\": \"offload\", \"ruleDescription\": \"Remote processing\" }, { \"operand1\": \"speed_normal\", \"operand2\": \"cpu_normal\", \"operation\": \"AND\", \"result\": \"offload\", \"ruleDescription\": \"Remote processing\" }, { \"operand1\": \"speed_normal\", \"operand2\": \"cpu_high\", \"operation\": \"AND\", \"result\": \"local\", \"ruleDescription\": \"Local processing\" }, { \"operand1\": \"speed_fast\", \"operand2\": \"cpu_low\", \"operation\": \"AND\", \"result\": \"offload\", \"ruleDescription\": \"Remote processing\" }, { \"operand1\": \"speed_fast\", \"operand2\": \"cpu_normal\", \"operation\": \"AND\", \"result\": \"offload\", \"ruleDescription\": \"Remote processing\" }, { \"operand1\": \"speed_normal\", \"operand2\": \"cpu_low\", \"operation\": \"AND\", \"result\": \"offload\", \"ruleDescription\": \"Remote processing\" } ] }";
 
}