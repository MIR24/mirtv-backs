package ru.mirtv.backs.database;

import java.util.HashMap;
import java.util.Map;

import ru.mirtv.backs.model.Background;
import ru.mirtv.backs.model.Banner;

public class DatabaseClass {

	private static Map<Integer, Background> backgrounds = new HashMap<>();
	private static Map<Integer, Banner> banners = new HashMap<>();
	
	public static Map<Integer, Background> getBackgrounds(){
		return backgrounds;
	}
	
	public static Map<Integer, Banner> getBanners(){
		return banners;
	}
	
}
