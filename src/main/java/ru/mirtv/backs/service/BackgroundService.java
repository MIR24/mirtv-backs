package ru.mirtv.backs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.mirtv.backs.database.DatabaseClass;
import ru.mirtv.backs.model.Background;

public class BackgroundService {

	private Map<Integer, Background> backgrounds = DatabaseClass.getBackgrounds();

	public BackgroundService() {
		backgrounds.put(1, new Background(1, "Вместе выгодно", "http://mirtv.ru/broadcast/111/",
				"/0509/back-vmeste-vygodno-0509.jpg", "#eef2f5", true));
		backgrounds.put(2, new Background(2, "Культтуризм", "http://mirtv.ru/broadcast/295/",
				"back-kult-turizm-2001.jpg", "#a3ab9b", true));
		backgrounds.put(3, new Background(3, "Союзники", "http://mirtv.ru/broadcast/60/", "back-souzniki-23102017.jpg",
				"#1d0b28", true));
	}

	public List<Background> getBackgrounds() {
		return new ArrayList<>(backgrounds.values());
	}

	public Background getBackgroundById(int backgroundId) {
		return backgrounds.get(backgroundId);
	}

	public Background addBackground(Background newBackground) {
		newBackground.setId(backgrounds.size() + 1);
		backgrounds.put(newBackground.getId(), newBackground);
		return newBackground;
	}

	public Background updateBackground(Background background) {
		if (background.getId() <= 0) {
			return null;
		}
		backgrounds.put(background.getId(), background);
		return background;
	}
	
	public void removeBackground(int backgroundId) {
		backgrounds.remove(backgroundId);
	}
}
