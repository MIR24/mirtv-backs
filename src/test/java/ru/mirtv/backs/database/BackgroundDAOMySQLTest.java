package ru.mirtv.backs.database;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import ru.mirtv.backs.model.Background;

/**
 *
 * @author babikov_pv
 */
public class BackgroundDAOMySQLTest extends Assert {

    private static final BackgroundDAOMySQLImpl BACKGROUNDS_MANAGER = 
            new BackgroundDAOMySQLImpl();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        create();
        list();
    }

    @Test
    public static void create() {
        Background newBackground = BACKGROUNDS_MANAGER.addBackground(
                new Background("Тестовый задник", "http://xyz.com", "test.png", "#ccc", true)
        );
        assertNotNull(newBackground);
    }
    
    @Test
    public static void list(){
        List<Background> backgrounds = BACKGROUNDS_MANAGER.getBackgrounds();
        assertFalse(backgrounds.isEmpty());
    }

}
