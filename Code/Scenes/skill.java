package Scenes;
public class skill {
    CharacterData characterData = CharacterData.getInstance();
    int acrobaticsBonus = 0;
    int animalHandlingBonus = 0;
    int arcanaBonus = 0;
    int athleticsBonus = 0;
    int deceptionBonus = 0;
    int insightBonus = 0;
    int intimidationBonus = 0;
    int investigationBonus = 0;
    int medicineBonus = 0;
    int natureBonus = 0;
    int perceptionBonus = 0;
    int performanceBonus = 0;
    int persuasionBonus = 0;
    int religionBonus = 0;
    int sleightOfHandBonus = 0;
    int stealthBonus = 0;
    int survivalBonus = 0;
    int historyBonus = 0;

    public void updateAcrobaticsBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Lightfoot Halfling")) { // checking for bonuses for acrobatics
                acrobaticsBonus++;
                characterData.setAcrobaticsBonus(acrobaticsBonus);
            }
            if (characterData.getSubrace().equals("Wood Elf")) {
                acrobaticsBonus++;
                characterData.setAcrobaticsBonus(acrobaticsBonus);
            }
            if (characterData.getSkillsAndProficiencies1().equals("Acrobatics") || characterData.getSkillsAndProficiencies2().equals("Acrobatics")) {
                acrobaticsBonus++;
                characterData.setAcrobaticsBonus(acrobaticsBonus);
            }
            if (characterData.getAbilities()[1] <= 9) {
                acrobaticsBonus--;
                characterData.setAcrobaticsBonus(acrobaticsBonus);
            } else if (characterData.getAbilities()[1] <= 13 && characterData.getAbilities()[1] > 11) {
                acrobaticsBonus++;
                characterData.setAcrobaticsBonus(acrobaticsBonus);
            } else if (characterData.getAbilities()[1] <= 15) {
                acrobaticsBonus += 2;
                characterData.setAcrobaticsBonus(acrobaticsBonus);
            } else if (characterData.getAbilities()[1] <= 20) {
                acrobaticsBonus += 3;
                characterData.setAcrobaticsBonus(acrobaticsBonus);
            }
        }
    }

    public void updateAnimalHandlingBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Hill Dwarf")) {
                animalHandlingBonus++;
                characterData.setAnimalHandlingBonus(animalHandlingBonus);
            }
            if (characterData.getSubrace().equals("Stout Halfling")) {
                animalHandlingBonus++;
                characterData.setAnimalHandlingBonus(animalHandlingBonus);
            }
            if (characterData.getSkillsAndProficiencies1().equals("Animal Handlling") || characterData.getSkillsAndProficiencies2().equals("Animal Handling")) {
                animalHandlingBonus++;
                characterData.setAnimalHandlingBonus(animalHandlingBonus);
            }
            if (characterData.getAbilities()[4] <= 9) {
                animalHandlingBonus--;
                characterData.setAnimalHandlingBonus(animalHandlingBonus);
            } else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
                animalHandlingBonus++;
                characterData.setAnimalHandlingBonus(animalHandlingBonus);
            } else if (characterData.getAbilities()[4] <= 15) {
                animalHandlingBonus += 2;
                characterData.setAnimalHandlingBonus(animalHandlingBonus);
            } else if (characterData.getAbilities()[4] <= 20) {
                animalHandlingBonus += 3;
                characterData.setAnimalHandlingBonus(animalHandlingBonus);
            }
        }
    }

    public void updateArcanaBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("High Elf")) {
                arcanaBonus++;
                characterData.setArcanaBonus(arcanaBonus);
            }
            if (characterData.getSkillsAndProficiencies1().equals("Arcana") || characterData.getSkillsAndProficiencies2().equals("Arcana")) {
                arcanaBonus++;
                characterData.setArcanaBonus(arcanaBonus);
            }
            if (characterData.getAbilities()[3] <= 9) {
                arcanaBonus--;
                characterData.setArcanaBonus(arcanaBonus);
            } else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
                arcanaBonus++;
                characterData.setArcanaBonus(arcanaBonus);
            } else if (characterData.getAbilities()[3] <= 15) {
                arcanaBonus += 2;
                characterData.setArcanaBonus(arcanaBonus);
            } else if (characterData.getAbilities()[3] <= 20) {
                arcanaBonus += 3;
                characterData.setArcanaBonus(arcanaBonus);
            }
        }
    }

    public void updateAthleticsBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Mountain Dwarf")) {
                athleticsBonus++;
                characterData.setAthleticsBonus(athleticsBonus);
            }
            if (characterData.getSkillsAndProficiencies1().equals("Athletics") || characterData.getSkillsAndProficiencies2().equals("Athletics")) {
                animalHandlingBonus++;
                characterData.setAthleticsBonus(athleticsBonus);
            }
            if (characterData.getAbilities()[0] <= 9) {
                athleticsBonus--;
                characterData.setAthleticsBonus(athleticsBonus);
            } else if (characterData.getAbilities()[0] <= 13 && characterData.getAbilities()[0] > 11) {
                athleticsBonus++;
                characterData.setAthleticsBonus(athleticsBonus);
            } else if (characterData.getAbilities()[0] <= 15) {
                athleticsBonus += 2;
                characterData.setAthleticsBonus(athleticsBonus);
            } else if (characterData.getAbilities()[0] <= 20) {
                athleticsBonus += 3;
                characterData.setAthleticsBonus(athleticsBonus);
            }
        }
    }

    public void updateDeceptionBonus() {
        if (characterData.getRace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getRace().equals("Tiefling")) {
                deceptionBonus++;
                characterData.setDeceptionBonus(deceptionBonus);
            }
            if (characterData.getRace().equals("Half-Elf")) {
                deceptionBonus++;
                characterData.setDeceptionBonus(deceptionBonus);
            }
            if (characterData.getSkillsAndProficiencies1().equals("Deception") || characterData.getSkillsAndProficiencies2().equals("Deception")) {
                deceptionBonus++;
                characterData.setDeceptionBonus(deceptionBonus);
            }
            if (characterData.getAbilities()[5] <= 9) {
                deceptionBonus--;
                characterData.setDeceptionBonus(deceptionBonus);
            } else if (characterData.getAbilities()[5] <= 13 && characterData.getAbilities()[5] > 11) {
                deceptionBonus++;
                characterData.setDeceptionBonus(deceptionBonus);
            } else if (characterData.getAbilities()[5] <= 15) {
                deceptionBonus += 2;
                characterData.setDeceptionBonus(deceptionBonus);
            } else if (characterData.getAbilities()[5] <= 20) {
                deceptionBonus += 3;
                characterData.setDeceptionBonus(deceptionBonus);
            }
        }
    }

    public void updateInsightBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Wood Elf")) {
                insightBonus++;
                characterData.setInsightBonus(insightBonus);
            }
            if (characterData.getSubrace().equals("Hill Dwarf")) {
                insightBonus++;
                characterData.setInsightBonus(insightBonus);
            }
            if (characterData.getSkillsAndProficiencies1().equals("Insight") || characterData.getSkillsAndProficiencies2().equals("Insight")) {
                insightBonus++;
                characterData.setInsightBonus(insightBonus);
            }
            if (characterData.getAbilities()[4] <= 9) {
                insightBonus--;
                characterData.setInsightBonus(insightBonus);
            } else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
                insightBonus++;
                characterData.setInsightBonus(insightBonus);
            } else if (characterData.getAbilities()[4] <= 15) {
                insightBonus += 2;
                characterData.setInsightBonus(insightBonus);
            } else if (characterData.getAbilities()[4] <= 20) {
                insightBonus += 3;
                characterData.setInsightBonus(insightBonus);
            }
        }
    }

    public void updateIntimidationBonus() {
        if (characterData.getRace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getRace().equals("Dragonborn")) {
                intimidationBonus++;
                characterData.setIntimidationBonus(intimidationBonus);
            }
            if (characterData.getRace().equals("Half-Orc")) {
                intimidationBonus++;
                characterData.setIntimidationBonus(intimidationBonus);
            }
            if (characterData.getSkillsAndProficiencies1().equals("Intimidation") || characterData.getSkillsAndProficiencies2().equals("Intimidation")) {
                intimidationBonus++;
                characterData.setIntimidationBonus(intimidationBonus);
            }
            if (characterData.getAbilities()[5] <= 9) {
                intimidationBonus--;
                characterData.setIntimidationBonus(intimidationBonus);
            } else if (characterData.getAbilities()[5] <= 13 && characterData.getAbilities()[5] > 11) {
                intimidationBonus++;
                characterData.setIntimidationBonus(intimidationBonus);
            } else if (characterData.getAbilities()[5] <= 15) {
                intimidationBonus += 2;
                characterData.setIntimidationBonus(intimidationBonus);
            } else if (characterData.getAbilities()[5] <= 20) {
                intimidationBonus += 3;
                characterData.setIntimidationBonus(intimidationBonus);
            }
        }
    }

    public void updateInvestigationBonus() {
        if (characterData.getRace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getRace().equals("Gnome")) {
                investigationBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Investigation") || characterData.getSkillsAndProficiencies2().equals("Investigation")) {
                investigationBonus++;
            }
            if (characterData.getAbilities()[3] <= 9) {
                investigationBonus--;
            } else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
                investigationBonus++;
            } else if (characterData.getAbilities()[3] <= 15) {
                investigationBonus += 2;
            } else if (characterData.getAbilities()[3] <= 20) {
                investigationBonus += 3;
            }
        }
    }

    public void updateMedicineBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Hill Dwarf")) {
                medicineBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Medicine") || characterData.getSkillsAndProficiencies2().equals("Medicine")) {
                medicineBonus++;
            }
            if (characterData.getAbilities()[4] <= 9) {
                medicineBonus--;
            } else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
                medicineBonus++;
            } else if (characterData.getAbilities()[4] <= 15) {
                medicineBonus += 2;
            } else if (characterData.getAbilities()[4] <= 20) {
                medicineBonus += 3;
            }
        }
    }

    public void updateNatureBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Wood Elf")) {
                natureBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Nature") || characterData.getSkillsAndProficiencies2().equals("Nature")) {
                natureBonus++;
            }
            if (characterData.getAbilities()[3] <= 9) {
                natureBonus--;
            } else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
                natureBonus++;
            } else if (characterData.getAbilities()[3] <= 15) {
                natureBonus += 2;
            } else if (characterData.getAbilities()[3] <= 20) {
                natureBonus += 3;
            }
        }
    }

    public void updatePerceptionBonus() {
        if (characterData.getRace() != null && characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Wood Elf")) {
                perceptionBonus++;
            }
            if (characterData.getRace().equals("Half-Elf")) {
                perceptionBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Perception") || characterData.getSkillsAndProficiencies2().equals("Perception")) {
                perceptionBonus++;
            }
            if (characterData.getAbilities()[4] <= 9) {
                perceptionBonus--;
            } else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
                perceptionBonus++;
            } else if (characterData.getAbilities()[4] <= 15) {
                perceptionBonus += 2;
            } else if (characterData.getAbilities()[4] <= 20) {
                perceptionBonus += 3;
            }
        }
    }

    public void updatePerformanceBonus() {
        if (characterData.getRace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getRace().equals("Half-Elf")) {
                performanceBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Performance") || characterData.getSkillsAndProficiencies2().equals("Performance")) {
                performanceBonus++;
            }
            if (characterData.getAbilities()[5] <= 9) {
                performanceBonus--;
            } else if (characterData.getAbilities()[5] <= 13 && characterData.getAbilities()[5] > 11) {
                performanceBonus++;
            } else if (characterData.getAbilities()[5] <= 15) {
                performanceBonus += 2;
            } else if (characterData.getAbilities()[5] <= 20) {
                performanceBonus += 3;
            }
        }
    }

    public void updatePersuasionBonus() {
        if (characterData.getRace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getRace().equals("Half-Elf")) {
                persuasionBonus++;
            }
            if (characterData.getRace().equals("Half-Orc")) {
                persuasionBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Persuasion") || characterData.getSkillsAndProficiencies2().equals("Persuasion")) {
                persuasionBonus++;
            }
            if (characterData.getAbilities()[5] <= 9) {
                persuasionBonus--;
            } else if (characterData.getAbilities()[5] <= 13 && characterData.getAbilities()[5] > 11) {
                persuasionBonus++;
            } else if (characterData.getAbilities()[5] <= 15) {
                persuasionBonus += 2;
            } else if (characterData.getAbilities()[5] <= 20) {
                persuasionBonus += 3;
            }
        }
    }

    public void updateReligionBonus() {
        if (characterData.getRace() != null && characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getRace().equals("Tiefling")) {
                religionBonus++;
            }
            if (characterData.getSubrace().equals("Hill Dwarf")) {
                religionBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Religion") || characterData.getSkillsAndProficiencies2().equals("Religion")) {
                religionBonus++;
            }
            if (characterData.getAbilities()[3] <= 9) {
                religionBonus--;
            } else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
                religionBonus++;
            } else if (characterData.getAbilities()[3] <= 15) {
                religionBonus += 2;
            } else if (characterData.getAbilities()[3] <= 20) {
                religionBonus += 3;
            }
        }
    }

    public void updateSleightOfHandBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Lightfoot Halfling")) {
                sleightOfHandBonus++;
            }
            if (characterData.getSubrace().equals("Wood Dwarf")) {
                sleightOfHandBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Sleight Of Hand") || characterData.getSkillsAndProficiencies2().equals("Sleight Of Hand")) {
                sleightOfHandBonus++;
            }
            if (characterData.getAbilities()[1] <= 9) {
                sleightOfHandBonus--;
            } else if (characterData.getAbilities()[1] <= 13 && characterData.getAbilities()[1] > 11) {
                sleightOfHandBonus++;
            } else if (characterData.getAbilities()[1] <= 15) {
                sleightOfHandBonus += 2;
            } else if (characterData.getAbilities()[1] <= 20) {
                sleightOfHandBonus += 3;
            }
        }
    }

    public void updateStealthBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Wood Elf")) {
                stealthBonus++;
            }
            if (characterData.getSubrace().equals("Lightfoot Halfling")) {
                stealthBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Stealth") || characterData.getSkillsAndProficiencies2().equals("Stealth")) {
                stealthBonus++;
            }
            if (characterData.getAbilities()[1] <= 9) {
                stealthBonus--;
            } else if (characterData.getAbilities()[1] <= 13 && characterData.getAbilities()[1] > 11) {
                stealthBonus++;
            } else if (characterData.getAbilities()[1] <= 15) {
                stealthBonus += 2;
            } else if (characterData.getAbilities()[1] <= 20) {
                stealthBonus += 3;
            }
        }
    }

    public void updateSurvivalBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Wood Elf")) {
                survivalBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("Survival") || characterData.getSkillsAndProficiencies2().equals("Survival")) {
                survivalBonus++;
            }
            if (characterData.getAbilities()[4] <= 9) {
                survivalBonus--;
            } else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
                survivalBonus++;
            } else if (characterData.getAbilities()[4] <= 15) {
                survivalBonus += 2;
            } else if (characterData.getAbilities()[4] <= 20) {
                survivalBonus += 3;
            }
        }
    }

    public void updateHistoryBonus() {
        if (characterData.getSubrace() != null && characterData.getSkillsAndProficiencies1() != null && characterData.getSkillsAndProficiencies2() != null && characterData.getAbilities() != null) {
            if (characterData.getSubrace().equals("Hill Dwarf")) {
                historyBonus++;
            }
            if (characterData.getSkillsAndProficiencies1().equals("History") || characterData.getSkillsAndProficiencies2().equals("History ")) {
                historyBonus++;
            }
            if (characterData.getAbilities()[3] <= 9) {
                historyBonus--;
            } else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
                historyBonus++;
            } else if (characterData.getAbilities()[3] <= 15) {
                historyBonus += 2;
            } else if (characterData.getAbilities()[3] <= 20) {
                historyBonus += 3;
            }
        }
    }

    public void updateAbilities() {
        Integer[] newAbilities = characterData.getAbilities();
        Integer newStrength = newAbilities[0];
        Integer newDexterity = newAbilities[1];
        Integer newConstitution = newAbilities[2];
        Integer newIntelligence = newAbilities[3];
        Integer newWisdom = newAbilities[4];
        Integer newCharisma = newAbilities[5];
        if (characterData.getRace() != null && characterData.getSubrace() != null) {
            if (characterData.getRace().equals("Half-Orc")) {
                newStrength += 2;
                newConstitution++;
            }
            if (characterData.getSubrace().equals("Mountain Dwarf")) {
                newStrength += 2;
            }
            if (characterData.getRace().equals("Elf")) {
                newDexterity += 2;
            }
            if (characterData.getRace().equals("Halfling")) {
                newDexterity += 2;
            }
            if (characterData.getSubrace().equals("Hill Dwarf")) {
                newConstitution += 2;
                newWisdom++;
            }
            if (characterData.getRace().equals("Dragonborn")) {
                newConstitution += 2;
                newCharisma++;
            }
            if (characterData.getSubrace().equals("Rock Gnome")) {
                newIntelligence++;
            }
            if (characterData.getSubrace().equals("High Elf")) {
                newIntelligence++;
            }
            if (characterData.getRace().equals("Tiefling")) {
                newIntelligence++;
                newCharisma += 2;
            }
            if (characterData.getSubrace().equals("Wood Elf")) {
                newWisdom++;
            }
            if (characterData.getRace().equals("Half-Elf")) {
                newCharisma += 2;
            }
        }

        newAbilities[0] = newStrength;
        newAbilities[1] = newDexterity;
        newAbilities[2] = newConstitution;
        newAbilities[3] = newIntelligence;
        newAbilities[4] = newWisdom;
        newAbilities[5] = newCharisma;

        characterData.setAbilities(newAbilities);
    }

    public void updateHealth() {
        int health = 0;
        if (characterData.getCharacterClass() != null) {
            if (characterData.getCharacterClass().equals("Barbarian")) {
                health = 12 + characterData.getAbilities()[2];
                characterData.setHealthAmount(health);
            }
            if (characterData.getCharacterClass().equals("Fighter") || characterData.getCharacterClass().equals("Paladin") || characterData.getCharacterClass().equals("Ranger")) {
                health = 10 + characterData.getAbilities()[2];
                characterData.setHealthAmount(health);
            }
            if (characterData.getCharacterClass().equals("Bard") || characterData.getCharacterClass().equals("Cleric") || characterData.getCharacterClass().equals("Druid") || characterData.getCharacterClass().equals("Monk") || characterData.getCharacterClass().equals("Rogue") || characterData.getCharacterClass().equals("Warlock")) {
                health = 8 + characterData.getAbilities()[2];
                characterData.setHealthAmount(health);
            }
            if (characterData.getCharacterClass().equals("Sorcerer") || characterData.getCharacterClass().equals("Wizard")) {
                health = 6 + characterData.getAbilities()[2];
                characterData.setHealthAmount(health);
            }
        }
    }
}