package org.trello4j;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
	final static String API_KEY = "1ae06ad5bee3715dbcfabb71342c54ed";

	final static String API_TOKEN = "ed4b95898da90220abc1c6e86e29e7b3d6b8a22bf5c759954a7cad3d678b5bfb";

	public static void main(String[] args) {

		TrelloImpl trello = new TrelloImpl(API_KEY, API_TOKEN);

		Map<String, String> keyValueMap = new HashMap<String, String>();
		keyValueMap.put("pos", "bottom");

		trello.createList("56af6582ccde1bf9a1bfd85a", "TODO List", keyValueMap);
	}
}
