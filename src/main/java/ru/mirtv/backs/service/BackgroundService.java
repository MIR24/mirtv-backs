package ru.mirtv.backs.service;

import java.util.List;

import ru.mirtv.backs.model.Background;
import ru.mirtv.backs.persistence.BackgroundDAO;

public class BackgroundService {

    private final BackgroundDAO backgroundManager;

    public BackgroundService(BackgroundDAO backgroundsManager) {
        this.backgroundManager = backgroundsManager;
    }

    public List<Background> getBackgrounds() {
        return backgroundManager.getBackgrounds();
    }

    public Background getBackgroundById(int backgroundId) {
        return backgroundManager.getBackgroundById(backgroundId);
    }

    public Background addBackground(Background newBackground) {
        return backgroundManager.addBackground(newBackground);
    }

    public Background updateBackground(Background background) {
        if (background.getId() <= 0) {
            return null;
        }
        return backgroundManager.updateBackground(background);
    }

    public void removeBackground(int backgroundId) {
        Background background = getBackgroundById(backgroundId);
        backgroundManager.removeBackground(background);
    }
}
