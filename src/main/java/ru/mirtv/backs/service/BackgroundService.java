package ru.mirtv.backs.service;

import java.util.Map;

import ru.mirtv.backs.database.DatabaseClass;
import ru.mirtv.backs.model.Background;

public class BackgroundService {

	private Map<Integer, Background> backgrounds = DatabaseClass.getBackgrounds();
	
	public BackgroundService() {
		backgrounds.put(1, new Background(1, "Вместе выгодно", "http://mirtv.ru/broadcast/111/", "/0509/back-vmeste-vygodno-0509.jpg", "#eef2f5"));
		backgrounds.put(2, new Background(2, "Культтуризм", "http://mirtv.ru/broadcast/295/", "back-kult-turizm-2001.jpg", "#a3ab9b"));
		backgrounds.put(3, new Background(3, "Союзники", "http://mirtv.ru/broadcast/60/", "back-souzniki-23102017.jpg", "#1d0b28"));
	}
}
