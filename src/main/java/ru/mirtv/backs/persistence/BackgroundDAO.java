package ru.mirtv.backs.persistence;

import java.util.List;
import ru.mirtv.backs.model.Background;

/**
 *
 * @author babikov_pv
 */
public interface BackgroundDAO {
    Background getBackgroundById(int id);
    List<Background> getBackgrounds();
    Background addBackground(Background background);
    Background updateBackground(Background background);
    void removeBackground(Background background);
}
