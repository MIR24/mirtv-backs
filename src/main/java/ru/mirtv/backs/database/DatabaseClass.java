package ru.mirtv.backs.database;

import java.util.HashMap;
import java.util.Map;

import ru.mirtv.backs.model.Background;

public class DatabaseClass {

	private static Map<Integer, Background> backgrounds = new HashMap<>();
	
	public static Map<Integer, Background> getBackgrounds(){
		return backgrounds;
	}
	
}
