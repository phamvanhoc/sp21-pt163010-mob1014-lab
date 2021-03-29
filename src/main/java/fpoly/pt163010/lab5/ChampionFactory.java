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
    
    /**
    * @description Hàm này tạo tướng từ tên Class
    * sử dụng Reflection
    */
    public static LOLChampion createChampion(String name) {
        String className = CHAMPION_PACKAGE + "." + name;
        try {
            // Tạo Class theo tên
            Class<LOLChampion> clazz = 
                    (Class<LOLChampion>) Class.forName(className);
            
            // Lấy Constructor của Class
            Constructor<LOLChampion> ctor = clazz.getConstructor();
            
            // Khởi tạo tướng
            LOLChampion champion = (LOLChampion) ctor.newInstance().Build();  
            return champion;
        } catch (Exception ex) {
            return null;
        }
    }
    
    /**
    * @description Hàm này tạo tất cả tướng được định nghĩa
    * trong Package Champion
    */
    public static List<LOLChampion> getAllChampions() {
        // Định nghĩa địa chỉ trỏ đến Package 
        String scannedPath = CHAMPION_PACKAGE.replace('.', '/');
        URL scannedUrl = Thread.currentThread()
                .getContextClassLoader()
                .getResource(scannedPath);
        
        // Lấy các File trong Package
        File scannedDir = new File(scannedUrl.getFile());

        // Tạo tướng từ danh sách File trong Package
        List<LOLChampion> champions = new ArrayList<>();
        for (File file : scannedDir.listFiles()) {
            // Vì tên file có dạng Aatrox.class
            // nên ta cần bỏ đuôi .class đi
            String fileName = file.getName();
            String name = fileName.substring(0, 
                    fileName.length() - CLASS_POST_FIX.length());
            
            // Tạo tướng và thêm vào danh sách
            LOLChampion champion = createChampion(name);
            champions.add(champion);
        }
        return champions;
    }
}
