package ru.mirtv.backs.service;

import java.util.List;

import ru.mirtv.backs.model.Background;
import ru.mirtv.backs.persistence.BackgroundDAO;

public class BackgroundService {

    private final BackgroundDAO backgroundsManager;

    public BackgroundService(BackgroundDAO backgroundsManager) {
        this.backgroundsManager = backgroundsManager;
        /*databaseManager.addBackground(new Background(1, "Вместе выгодно", "http://mirtv.ru/broadcast/111/",
				"/0509/back-vmeste-vygodno-0509.jpg", "#eef2f5", true));
		databaseManager.addBackground(new Background(2, "Культтуризм", "http://mirtv.ru/broadcast/295/",
				"back-kult-turizm-2001.jpg", "#a3ab9b", true));
		databaseManager.addBackground(new Background(3, "Союзники", "http://mirtv.ru/broadcast/60/", "back-souzniki-23102017.jpg",
				"#1d0b28", true));*/
    }

    public List<Background> getBackgrounds() {
        return backgroundsManager.getBackgrounds();
    }

    public Background getBackgroundById(int backgroundId) {
        return backgroundsManager.getBackgroundById(backgroundId);
    }

    public Background addBackground(Background newBackground) {
        return backgroundsManager.addBackground(newBackground);
    }

    public Background updateBackground(Background background) {
        if (background.getId() <= 0) {
            return null;
        }
        return backgroundsManager.updateBackground(background);
    }

    public void removeBackground(int backgroundId) {
        Background background = getBackgroundById(backgroundId);
        backgroundsManager.removeBackground(background);
    }
}
