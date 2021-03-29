/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.pt163010.lab5;

import java.io.File;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phongtt
 */
public class ChampionFactory {
    
    private static final String CHAMPION_PACKAGE = "fpoly.pt163010.lab5.champion";
    private static final String CLASS_POST_FIX = ".class";
    
    public static LOLChampion createChampion(String name) {
        String className = CHAMPION_PACKAGE + "." + name;
        try {
            Class<LOLChampion> clazz = 
                    (Class<LOLChampion>) Class.forName(className);
            Constructor<LOLChampion> ctor = clazz.getConstructor();
            LOLChampion champion = (LOLChampion) ctor.newInstance().Build();  
            return champion;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public static List<LOLChampion> getAllChampions() {
        String scannedPath = CHAMPION_PACKAGE.replace('.', '/');
        URL scannedUrl = Thread.currentThread()
                .getContextClassLoader()
                .getResource(scannedPath);
        File scannedDir = new File(scannedUrl.getFile());
        List<LOLChampion> champions = new ArrayList<>();
        for (File file : scannedDir.listFiles()) {
            String fileName = file.getName();
            String name = fileName.substring(0, 
                    fileName.length() - CLASS_POST_FIX.length());
            LOLChampion champion = createChampion(name);
            champions.add(champion);
        }
        return champions;
    }
}
