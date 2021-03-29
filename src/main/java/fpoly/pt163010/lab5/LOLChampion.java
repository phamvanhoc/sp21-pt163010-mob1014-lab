/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.pt163010.lab5;

import java.util.Date;

/**
 *
 * @author phongtt
 */
public abstract class LOLChampion {
    private String name;
    private Integer health;
    private Integer attack;
    private Integer moveSpeed;
    private Double armor;
    private Date releaseDate;

    public LOLChampion() {
        
    }

    public abstract LOLChampion Build();
    
    public String getName() {
        return name;
    }

    public LOLChampion setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getHealth() {
        return health;
    }

    public LOLChampion setHealth(Integer health) {
        this.health = health;
        return this;
    }

    public Integer getAttack() {
        return attack;
    }

    public LOLChampion setAttack(Integer attack) {
        this.attack = attack;
        return this;
    }

    public Integer getMoveSpeed() {
        return moveSpeed;
    }

    public LOLChampion setMoveSpeed(Integer moveSpeed) {
        this.moveSpeed = moveSpeed;
        return this;
    }

    public Double getArmor() {
        return armor;
    }

    public LOLChampion setArmor(Double armor) {
        this.armor = armor;
        return this;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public LOLChampion setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @Override
    public String toString() {
        return "LOLChampion{" + "name=" + name + ", "
                + "health=" + health + ", attack=" + attack + ", "
                + "moveSpeed=" + moveSpeed + ", armor=" + armor + ", "
                + "releaseDate=" + releaseDate + '}';
    }
}
