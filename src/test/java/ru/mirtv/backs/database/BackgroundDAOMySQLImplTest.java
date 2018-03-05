package ru.mirtv.backs.database;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.mirtv.backs.model.Background;

/**
 *
 * @author babikov_pv
 */
public class BackgroundDAOMySQLImplTest {

    @Test
    public void testBackgroundCRUD() {
        System.out.println("Test list, insert, get, update and remove methods.");
        
        BackgroundDAOMySQLImpl instance = new BackgroundDAOMySQLImpl();
        
        List<Background> backgrounds = instance.getBackgrounds();
        assertNotNull(backgrounds);
        
        int initSize = backgrounds.size();
        Background newBackground = new Background("test", "link", "image", "#eee", false);
        Background addedBackground = instance.addBackground(newBackground);
        backgrounds = instance.getBackgrounds();
        assertEquals(backgrounds.size(), initSize + 1);
        assertEquals(addedBackground, instance.getBackgroundById(addedBackground.getId()));
        
        addedBackground.setColor("#ddd");
        instance.updateBackground(addedBackground);
        assertEquals(instance.getBackgroundById(addedBackground.getId()).getColor(), "#ddd");
        
        instance.removeBackground(addedBackground);
        
        backgrounds = instance.getBackgrounds();
        assertEquals(backgrounds.size(), initSize);
        assertTrue(!backgrounds.contains(addedBackground));
    }
    
}
