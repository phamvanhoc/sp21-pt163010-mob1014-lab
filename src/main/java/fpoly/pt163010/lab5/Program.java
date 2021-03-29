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
 */
public class Program {
    
    public static void main(String[] args) {
        List<LOLChampion> champions = ChampionFactory.getAllChampions();
        champions.forEach(champion -> {
            System.out.println(champion);
            CastSkill(champion);
        });
    }
    
    private static void CastSkill(LOLChampion champion) {
        if (champion instanceof IMagicAttack) {
            ((IMagicAttack) champion).CastMagicSkill();
        }
        if (champion instanceof IPhysicalAttack) {
            ((IPhysicalAttack) champion).CastPhysicSkill();
        }
    }
}
