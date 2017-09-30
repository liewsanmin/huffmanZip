import java.io.*;
import java.util.*;

public class frequencyRecorder{
	String input;

	public frequencyRecorder(){}

	public frequencyRecorder(String input){
		this.input = input;
	}

	public static HashMap<Character, Integer> record(String input){
		if(input == null ||  input.length() == 0)
			throw new RuntimeException("Must pass in a string that is not empty");

		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < input.length(); i++){
			char curr = input.charAt(i);
			if(!map.containsKey(curr))
				map.put(curr, 1);
			else{
				map.put(curr, map.get(curr) + 1);
			}
		}
		return map;
	}
}
