/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.pt163010.lab5.champion;

import fpoly.pt163010.lab5.IPhysicalAttack;
import fpoly.pt163010.lab5.LOLChampion;

/**
 *
 * @author phongtt
 * @desription Đây là class mẫu
 */
public class Aatrox extends LOLChampion // Đối tượng là tướng LOL
        implements IPhysicalAttack { // Đối tượng là tướng vật lý

    @Override
    public LOLChampion Build() {
        return new Aatrox()
                .setName("Aatrox")
                .setArmor(38.0)
                .setAttack(60)
                .setHealth(580)
                .setMoveSpeed(345);
        // Còn thiếu thông tin ReleaseDate
    }

    @Override
    public void CastPhysicSkill() {
        System.out.println("World Ender");
    }

}
