/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.pt163010.lab5;

import java.util.List;

/**
 *
 * @author phongtt
 * @description Đây là hàm main
 */
public class Program {
    
    public static void main(String[] args) {
        // Lấy tất cả các tướng được khai báo trong package Champion
        List<LOLChampion> champions = ChampionFactory.getAllChampions();
        
        // In thông tin các tướng và thực hiện kỹ năng
        champions.forEach(champion -> {
            System.out.println(champion);
            CastSkill(champion);
        });
    }
    
    /**
    * @description Tùy vào loại tướng có kỹ năng phép hay vật lý
    * sẽ thực hiện chức năng khác nhau.
    * Ở đây không sử dụng hàm else vì tướng có thể 
    * có cả kỹ năng phép và vât lý
    */
    private static void CastSkill(LOLChampion champion) {
        if (champion instanceof IMagicAttack) { // Nếu có kỹ năng phép
            ((IMagicAttack) champion).CastMagicSkill();
        }
        if (champion instanceof IPhysicalAttack) { // Nếu có kỹ năng vật lý
            ((IPhysicalAttack) champion).CastPhysicSkill();
        }
    }
}
