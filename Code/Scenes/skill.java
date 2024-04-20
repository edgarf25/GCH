package Scenes;

import java.util.Arrays;

public class skill {
    CharacterBuilder characterBuilder = CharacterBuilder.getInstance();
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
    int strengthThrow = 0;
    int dexterityThrow = 0;
    int constitutionThrow = 0;
    int intelligenceThrow = 0;
    int wisdomThrow = 0;
    int charismaThrow = 0;
    int armor = 0;


    public void updateAcrobaticsBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Lightfoot Halfling")) { // checking for bonuses for acrobatics
                acrobaticsBonus++;
                characterBuilder.setAcrobaticsBonus(acrobaticsBonus);
            }
            if (characterBuilder.getSubrace().equals("Wood Elf")) {
                acrobaticsBonus++;
                characterBuilder.setAcrobaticsBonus(acrobaticsBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Acrobatics") || characterBuilder.getSkillsAndProficiencies2().equals("Acrobatics")) {
                acrobaticsBonus++;
                characterBuilder.setAcrobaticsBonus(acrobaticsBonus);
            }
            if (characterBuilder.getAbilities()[1] <= 9) {
                acrobaticsBonus--;
                characterBuilder.setAcrobaticsBonus(acrobaticsBonus);
            } else if (characterBuilder.getAbilities()[1] <= 13 && characterBuilder.getAbilities()[1] > 11) {
                acrobaticsBonus++;
                characterBuilder.setAcrobaticsBonus(acrobaticsBonus);
            } else if (characterBuilder.getAbilities()[1] <= 15) {
                acrobaticsBonus += 2;
                characterBuilder.setAcrobaticsBonus(acrobaticsBonus);
            } else if (characterBuilder.getAbilities()[1] <= 20) {
                acrobaticsBonus += 3;
                characterBuilder.setAcrobaticsBonus(acrobaticsBonus);
            }
        }
    }

    public void updateAnimalHandlingBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Hill Dwarf")) {
                animalHandlingBonus++;
                characterBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            }
            if (characterBuilder.getSubrace().equals("Stout Halfling")) {
                animalHandlingBonus++;
                characterBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Animal Handlling") || characterBuilder.getSkillsAndProficiencies2().equals("Animal Handling")) {
                animalHandlingBonus++;
                characterBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            }
            if (characterBuilder.getAbilities()[4] <= 9) {
                animalHandlingBonus--;
                characterBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            } else if (characterBuilder.getAbilities()[4] <= 13 && characterBuilder.getAbilities()[4] > 11) {
                animalHandlingBonus++;
                characterBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            } else if (characterBuilder.getAbilities()[4] <= 15) {
                animalHandlingBonus += 2;
                characterBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            } else if (characterBuilder.getAbilities()[4] <= 20) {
                animalHandlingBonus += 3;
                characterBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            }
        }
    }

    public void updateArcanaBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("High Elf")) {
                arcanaBonus++;
                characterBuilder.setArcanaBonus(arcanaBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Arcana") || characterBuilder.getSkillsAndProficiencies2().equals("Arcana")) {
                arcanaBonus++;
                characterBuilder.setArcanaBonus(arcanaBonus);
            }
            if (characterBuilder.getAbilities()[3] <= 9) {
                arcanaBonus--;
                characterBuilder.setArcanaBonus(arcanaBonus);
            } else if (characterBuilder.getAbilities()[3] <= 13 && characterBuilder.getAbilities()[3] > 11) {
                arcanaBonus++;
                characterBuilder.setArcanaBonus(arcanaBonus);
            } else if (characterBuilder.getAbilities()[3] <= 15) {
                arcanaBonus += 2;
                characterBuilder.setArcanaBonus(arcanaBonus);
            } else if (characterBuilder.getAbilities()[3] <= 20) {
                arcanaBonus += 3;
                characterBuilder.setArcanaBonus(arcanaBonus);
            }
        }
    }

    public void updateAthleticsBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Mountain Dwarf")) {
                athleticsBonus++;
                characterBuilder.setAthleticsBonus(athleticsBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Athletics") || characterBuilder.getSkillsAndProficiencies2().equals("Athletics")) {
                animalHandlingBonus++;
                characterBuilder.setAthleticsBonus(athleticsBonus);
            }
            if (characterBuilder.getAbilities()[0] <= 9) {
                athleticsBonus--;
                characterBuilder.setAthleticsBonus(athleticsBonus);
            } else if (characterBuilder.getAbilities()[0] <= 13 && characterBuilder.getAbilities()[0] > 11) {
                athleticsBonus++;
                characterBuilder.setAthleticsBonus(athleticsBonus);
            } else if (characterBuilder.getAbilities()[0] <= 15) {
                athleticsBonus += 2;
                characterBuilder.setAthleticsBonus(athleticsBonus);
            } else if (characterBuilder.getAbilities()[0] <= 20) {
                athleticsBonus += 3;
                characterBuilder.setAthleticsBonus(athleticsBonus);
            }
        }
    }

    public void updateDeceptionBonus() {
        if (characterBuilder.getRace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getRace().equals("Tiefling")) {
                deceptionBonus++;
                characterBuilder.setDeceptionBonus(deceptionBonus);
            }
            if (characterBuilder.getRace().equals("Half-Elf")) {
                deceptionBonus++;
                characterBuilder.setDeceptionBonus(deceptionBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Deception") || characterBuilder.getSkillsAndProficiencies2().equals("Deception")) {
                deceptionBonus++;
                characterBuilder.setDeceptionBonus(deceptionBonus);
            }
            if (characterBuilder.getAbilities()[5] <= 9) {
                deceptionBonus--;
                characterBuilder.setDeceptionBonus(deceptionBonus);
            } else if (characterBuilder.getAbilities()[5] <= 13 && characterBuilder.getAbilities()[5] > 11) {
                deceptionBonus++;
                characterBuilder.setDeceptionBonus(deceptionBonus);
            } else if (characterBuilder.getAbilities()[5] <= 15) {
                deceptionBonus += 2;
                characterBuilder.setDeceptionBonus(deceptionBonus);
            } else if (characterBuilder.getAbilities()[5] <= 20) {
                deceptionBonus += 3;
                characterBuilder.setDeceptionBonus(deceptionBonus);
            }
        }
    }

    public void updateInsightBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Wood Elf")) {
                insightBonus++;
                characterBuilder.setInsightBonus(insightBonus);
            }
            if (characterBuilder.getSubrace().equals("Hill Dwarf")) {
                insightBonus++;
                characterBuilder.setInsightBonus(insightBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Insight") || characterBuilder.getSkillsAndProficiencies2().equals("Insight")) {
                insightBonus++;
                characterBuilder.setInsightBonus(insightBonus);
            }
            if (characterBuilder.getAbilities()[4] <= 9) {
                insightBonus--;
                characterBuilder.setInsightBonus(insightBonus);
            } else if (characterBuilder.getAbilities()[4] <= 13 && characterBuilder.getAbilities()[4] > 11) {
                insightBonus++;
                characterBuilder.setInsightBonus(insightBonus);
            } else if (characterBuilder.getAbilities()[4] <= 15) {
                insightBonus += 2;
                characterBuilder.setInsightBonus(insightBonus);
            } else if (characterBuilder.getAbilities()[4] <= 20) {
                insightBonus += 3;
                characterBuilder.setInsightBonus(insightBonus);
            }
        }
    }

    public void updateIntimidationBonus() {
        if (characterBuilder.getRace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getRace().equals("Dragonborn")) {
                intimidationBonus++;
                characterBuilder.setIntimidationBonus(intimidationBonus);
            }
            if (characterBuilder.getRace().equals("Half-Orc")) {
                intimidationBonus++;
                characterBuilder.setIntimidationBonus(intimidationBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Intimidation") || characterBuilder.getSkillsAndProficiencies2().equals("Intimidation")) {
                intimidationBonus++;
                characterBuilder.setIntimidationBonus(intimidationBonus);
            }
            if (characterBuilder.getAbilities()[5] <= 9) {
                intimidationBonus--;
                characterBuilder.setIntimidationBonus(intimidationBonus);
            } else if (characterBuilder.getAbilities()[5] <= 13 && characterBuilder.getAbilities()[5] > 11) {
                intimidationBonus++;
                characterBuilder.setIntimidationBonus(intimidationBonus);
            } else if (characterBuilder.getAbilities()[5] <= 15) {
                intimidationBonus += 2;
                characterBuilder.setIntimidationBonus(intimidationBonus);
            } else if (characterBuilder.getAbilities()[5] <= 20) {
                intimidationBonus += 3;
                characterBuilder.setIntimidationBonus(intimidationBonus);
            }
        }
    }

    public void updateInvestigationBonus() {
        if (characterBuilder.getRace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getRace().equals("Gnome")) {
                investigationBonus++;
                characterBuilder.setInvestigationBonus(investigationBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Investigation") || characterBuilder.getSkillsAndProficiencies2().equals("Investigation")) {
                investigationBonus++;
                characterBuilder.setInvestigationBonus(investigationBonus);
            }
            if (characterBuilder.getAbilities()[3] <= 9) {
                investigationBonus--;
                characterBuilder.setInvestigationBonus(investigationBonus);
            } else if (characterBuilder.getAbilities()[3] <= 13 && characterBuilder.getAbilities()[3] > 11) {
                investigationBonus++;
                characterBuilder.setInvestigationBonus(investigationBonus);
            } else if (characterBuilder.getAbilities()[3] <= 15) {
                investigationBonus += 2;
                characterBuilder.setInvestigationBonus(investigationBonus);
            } else if (characterBuilder.getAbilities()[3] <= 20) {
                investigationBonus += 3;
                characterBuilder.setInvestigationBonus(investigationBonus);
            }
        }
    }

    public void updateMedicineBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Hill Dwarf")) {
                medicineBonus++;
                characterBuilder.setMedicineBonus(medicineBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Medicine") || characterBuilder.getSkillsAndProficiencies2().equals("Medicine")) {
                medicineBonus++;
                characterBuilder.setMedicineBonus(medicineBonus);
            }
            if (characterBuilder.getAbilities()[4] <= 9) {
                medicineBonus--;
                characterBuilder.setMedicineBonus(medicineBonus);
            } else if (characterBuilder.getAbilities()[4] <= 13 && characterBuilder.getAbilities()[4] > 11) {
                medicineBonus++;
                characterBuilder.setMedicineBonus(medicineBonus);
            } else if (characterBuilder.getAbilities()[4] <= 15) {
                medicineBonus += 2;
                characterBuilder.setMedicineBonus(medicineBonus);
            } else if (characterBuilder.getAbilities()[4] <= 20) {
                medicineBonus += 3;
                characterBuilder.setMedicineBonus(medicineBonus);
            }
        }
    }

    public void updateNatureBonus() {
        if (characterBuilder.getRace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null && characterBuilder.getSubrace() != null) {
            if (characterBuilder.getSubrace().equals("Wood Elf")) {
                natureBonus++;
                characterBuilder.setNatureBonus(natureBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Nature") || characterBuilder.getSkillsAndProficiencies2().equals("Nature")) {
                natureBonus++;
                characterBuilder.setNatureBonus(natureBonus);
            }
            if (characterBuilder.getAbilities()[3] <= 9) {
                natureBonus--;
                characterBuilder.setNatureBonus(natureBonus);
            } else if (characterBuilder.getAbilities()[3] <= 13 && characterBuilder.getAbilities()[3] > 11) {
                natureBonus++;
                characterBuilder.setNatureBonus(natureBonus);
            } else if (characterBuilder.getAbilities()[3] <= 15) {
                natureBonus += 2;
                characterBuilder.setNatureBonus(natureBonus);
            } else if (characterBuilder.getAbilities()[3] <= 20) {
                natureBonus += 3;
                characterBuilder.setNatureBonus(natureBonus);
            }
        }
    }

    public void updatePerceptionBonus() {
        if (characterBuilder.getRace() != null && characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Wood Elf")) {
                perceptionBonus++;
                characterBuilder.setPerceptionBonus(perceptionBonus);
            }
            if (characterBuilder.getRace().equals("Half-Elf")) {
                perceptionBonus++;
                characterBuilder.setPerceptionBonus(perceptionBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Perception") || characterBuilder.getSkillsAndProficiencies2().equals("Perception")) {
                perceptionBonus++;
                characterBuilder.setPerceptionBonus(perceptionBonus);
            }
            if (characterBuilder.getAbilities()[4] <= 9) {
                perceptionBonus--;
                characterBuilder.setPerceptionBonus(perceptionBonus);
            } else if (characterBuilder.getAbilities()[4] <= 13 && characterBuilder.getAbilities()[4] > 11) {
                perceptionBonus++;
                characterBuilder.setPerceptionBonus(perceptionBonus);
            } else if (characterBuilder.getAbilities()[4] <= 15) {
                perceptionBonus += 2;
                characterBuilder.setPerceptionBonus(perceptionBonus);
            } else if (characterBuilder.getAbilities()[4] <= 20) {
                perceptionBonus += 3;
                characterBuilder.setPerceptionBonus(perceptionBonus);
            }
        }
    }

    public void updatePerformanceBonus() {
        if (characterBuilder.getRace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getRace().equals("Half-Elf")) {
                performanceBonus++;
                characterBuilder.setPerformanceBonus(performanceBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Performance") || characterBuilder.getSkillsAndProficiencies2().equals("Performance")) {
                performanceBonus++;
                characterBuilder.setPerformanceBonus(performanceBonus);
            }
            if (characterBuilder.getAbilities()[5] <= 9) {
                performanceBonus--;
                characterBuilder.setPerformanceBonus(performanceBonus);
            } else if (characterBuilder.getAbilities()[5] <= 13 && characterBuilder.getAbilities()[5] > 11) {
                performanceBonus++;
                characterBuilder.setPerformanceBonus(performanceBonus);
            } else if (characterBuilder.getAbilities()[5] <= 15) {
                performanceBonus += 2;
                characterBuilder.setPerformanceBonus(performanceBonus);
            } else if (characterBuilder.getAbilities()[5] <= 20) {
                performanceBonus += 3;
                characterBuilder.setPerformanceBonus(performanceBonus);
            }
        }
    }

    public void updatePersuasionBonus() {
        if (characterBuilder.getRace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getRace().equals("Half-Elf")) {
                persuasionBonus++;
                characterBuilder.setPersuasionBonus(persuasionBonus);
            }
            if (characterBuilder.getRace().equals("Half-Orc")) {
                persuasionBonus++;
                characterBuilder.setPersuasionBonus(persuasionBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Persuasion") || characterBuilder.getSkillsAndProficiencies2().equals("Persuasion")) {
                persuasionBonus++;
                characterBuilder.setPersuasionBonus(persuasionBonus);
            }
            if (characterBuilder.getAbilities()[5] <= 9) {
                persuasionBonus--;
                characterBuilder.setPersuasionBonus(persuasionBonus);
            } else if (characterBuilder.getAbilities()[5] <= 13 && characterBuilder.getAbilities()[5] > 11) {
                persuasionBonus++;
                characterBuilder.setPersuasionBonus(persuasionBonus);
            } else if (characterBuilder.getAbilities()[5] <= 15) {
                persuasionBonus += 2;
                characterBuilder.setPersuasionBonus(persuasionBonus);
            } else if (characterBuilder.getAbilities()[5] <= 20) {
                persuasionBonus += 3;
                characterBuilder.setPersuasionBonus(persuasionBonus);
            }
        }
    }

    public void updateReligionBonus() {
        if (characterBuilder.getRace() != null && characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getRace().equals("Tiefling")) {
                religionBonus++;
                characterBuilder.setReligionBonus(religionBonus);
            }
            if (characterBuilder.getSubrace().equals("Hill Dwarf")) {
                religionBonus++;
                characterBuilder.setReligionBonus(religionBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Religion") || characterBuilder.getSkillsAndProficiencies2().equals("Religion")) {
                religionBonus++;
                characterBuilder.setReligionBonus(religionBonus);
            }
            if (characterBuilder.getAbilities()[3] <= 9) {
                religionBonus--;
                characterBuilder.setReligionBonus(religionBonus);
            } else if (characterBuilder.getAbilities()[3] <= 13 && characterBuilder.getAbilities()[3] > 11) {
                religionBonus++;
                characterBuilder.setReligionBonus(religionBonus);
            } else if (characterBuilder.getAbilities()[3] <= 15) {
                religionBonus += 2;
                characterBuilder.setReligionBonus(religionBonus);
            } else if (characterBuilder.getAbilities()[3] <= 20) {
                religionBonus += 3;
                characterBuilder.setReligionBonus(religionBonus);
            }
        }
    }

    public void updateSleightOfHandBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Lightfoot Halfling")) {
                sleightOfHandBonus++;
                characterBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            }
            if (characterBuilder.getSubrace().equals("Wood Dwarf")) {
                sleightOfHandBonus++;
                characterBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Sleight Of Hand") || characterBuilder.getSkillsAndProficiencies2().equals("Sleight Of Hand")) {
                sleightOfHandBonus++;
                characterBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            }
            if (characterBuilder.getAbilities()[1] <= 9) {
                sleightOfHandBonus--;
                characterBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            } else if (characterBuilder.getAbilities()[1] <= 13 && characterBuilder.getAbilities()[1] > 11) {
                sleightOfHandBonus++;
                characterBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            } else if (characterBuilder.getAbilities()[1] <= 15) {
                sleightOfHandBonus += 2;
                characterBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            } else if (characterBuilder.getAbilities()[1] <= 20) {
                sleightOfHandBonus += 3;
                characterBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            }
        }
    }

    public void updateStealthBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Wood Elf")) {
                stealthBonus++;
                characterBuilder.setStealthBonus(stealthBonus);
            }
            if (characterBuilder.getSubrace().equals("Lightfoot Halfling")) {
                stealthBonus++;
                characterBuilder.setStealthBonus(stealthBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Stealth") || characterBuilder.getSkillsAndProficiencies2().equals("Stealth")) {
                stealthBonus++;
                characterBuilder.setStealthBonus(stealthBonus);
            }
            if (characterBuilder.getAbilities()[1] <= 9) {
                stealthBonus--;
                characterBuilder.setStealthBonus(stealthBonus);
            } else if (characterBuilder.getAbilities()[1] <= 13 && characterBuilder.getAbilities()[1] > 11) {
                stealthBonus++;
                characterBuilder.setStealthBonus(stealthBonus);
            } else if (characterBuilder.getAbilities()[1] <= 15) {
                stealthBonus += 2;
                characterBuilder.setStealthBonus(stealthBonus);
            } else if (characterBuilder.getAbilities()[1] <= 20) {
                stealthBonus += 3;
                characterBuilder.setStealthBonus(stealthBonus);
            }
        }
    }

    public void updateSurvivalBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Wood Elf")) {
                survivalBonus++;
                characterBuilder.setSurvivalBonus(survivalBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("Survival") || characterBuilder.getSkillsAndProficiencies2().equals("Survival")) {
                survivalBonus++;
                characterBuilder.setSurvivalBonus(survivalBonus);
            }
            if (characterBuilder.getAbilities()[4] <= 9) {
                survivalBonus--;
                characterBuilder.setSurvivalBonus(survivalBonus);
            } else if (characterBuilder.getAbilities()[4] <= 13 && characterBuilder.getAbilities()[4] > 11) {
                survivalBonus++;
                characterBuilder.setSurvivalBonus(survivalBonus);
            } else if (characterBuilder.getAbilities()[4] <= 15) {
                survivalBonus += 2;
                characterBuilder.setSurvivalBonus(survivalBonus);
            } else if (characterBuilder.getAbilities()[4] <= 20) {
                survivalBonus += 3;
                characterBuilder.setSurvivalBonus(survivalBonus);
            }
        }
    }

    public void updateHistoryBonus() {
        if (characterBuilder.getSubrace() != null && characterBuilder.getSkillsAndProficiencies1() != null && characterBuilder.getSkillsAndProficiencies2() != null && characterBuilder.getAbilities() != null) {
            if (characterBuilder.getSubrace().equals("Hill Dwarf")) {
                historyBonus++;
                characterBuilder.setHistoryBonus(historyBonus);
            }
            if (characterBuilder.getSkillsAndProficiencies1().equals("History") || characterBuilder.getSkillsAndProficiencies2().equals("History ")) {
                historyBonus++;
                characterBuilder.setHistoryBonus(historyBonus);
            }
            if (characterBuilder.getAbilities()[3] <= 9) {
                historyBonus--;
                characterBuilder.setHistoryBonus(historyBonus);
            } else if (characterBuilder.getAbilities()[3] <= 13 && characterBuilder.getAbilities()[3] > 11) {
                historyBonus++;
                characterBuilder.setHistoryBonus(historyBonus);
            } else if (characterBuilder.getAbilities()[3] <= 15) {
                historyBonus += 2;
                characterBuilder.setHistoryBonus(historyBonus);
            } else if (characterBuilder.getAbilities()[3] <= 20) {
                historyBonus += 3;
                characterBuilder.setHistoryBonus(historyBonus);
            }
        }
    }

    public void updateAbilities() {
        if (characterBuilder.getRace() != null && characterBuilder.getSubrace() != null && characterBuilder.getAbilities() != null) {
            Integer[] newAbilities = Arrays.copyOf(characterBuilder.getAbilities(), characterBuilder.getAbilities().length);
            Integer newStrength = newAbilities[0];
            Integer newDexterity = newAbilities[1];
            Integer newConstitution = newAbilities[2];
            Integer newIntelligence = newAbilities[3];
            Integer newWisdom = newAbilities[4];
            Integer newCharisma = newAbilities[5];
            if (characterBuilder.getRace().equals("Half-Orc")) {
                newStrength += 2;
                newConstitution++;
            }
            if (characterBuilder.getSubrace().equals("Mountain Dwarf")) {
                newStrength += 2;
            }
            if (characterBuilder.getRace().equals("Elf")) {
                newDexterity += 2;
            }
            if (characterBuilder.getRace().equals("Halfling")) {
                newDexterity += 2;
            }
            if (characterBuilder.getSubrace().equals("Hill Dwarf")) {
                newConstitution += 2;
                newWisdom++;
            }
            if (characterBuilder.getRace().equals("Dragonborn")) {
                newConstitution += 2;
                newCharisma++;
            }
            if (characterBuilder.getSubrace().equals("Rock Gnome")) {
                newIntelligence++;
            }
            if (characterBuilder.getSubrace().equals("High Elf")) {
                newIntelligence++;
            }
            if (characterBuilder.getRace().equals("Tiefling")) {
                newIntelligence++;
                newCharisma += 2;
            }
            if (characterBuilder.getSubrace().equals("Wood Elf")) {
                newWisdom++;
            }
            if (characterBuilder.getRace().equals("Half-Elf")) {
                newCharisma += 2;
            }
            newAbilities[0] = newStrength;
            newAbilities[1] = newDexterity;
            newAbilities[2] = newConstitution;
            newAbilities[3] = newIntelligence;
            newAbilities[4] = newWisdom;
            newAbilities[5] = newCharisma;

            characterBuilder.setUpdateAbilities(newAbilities);
        }
    }

    public void updateHealth() {
        int health = 0;
        if (characterBuilder.getCharacterClass() != null && characterBuilder.getAbilities() != null)
        {
            if (characterBuilder.getCharacterClass().equals("Barbarian")) {
                health = 12 + characterBuilder.getAbilities()[2];
                characterBuilder.setHealthAmount(health);
            }
            if (characterBuilder.getCharacterClass().equals("Fighter") || characterBuilder.getCharacterClass().equals("Paladin") || characterBuilder.getCharacterClass().equals("Ranger")) {
                health = 10 + characterBuilder.getAbilities()[2];
                characterBuilder.setHealthAmount(health);
            }
            if (characterBuilder.getCharacterClass().equals("Bard") || characterBuilder.getCharacterClass().equals("Cleric") || characterBuilder.getCharacterClass().equals("Druid") || characterBuilder.getCharacterClass().equals("Monk") || characterBuilder.getCharacterClass().equals("Rogue") || characterBuilder.getCharacterClass().equals("Warlock")) {
                health = 8 + characterBuilder.getAbilities()[2];
                characterBuilder.setHealthAmount(health);
            }
            if (characterBuilder.getCharacterClass().equals("Sorcerer") || characterBuilder.getCharacterClass().equals("Wizard")) {
                health = 6 + characterBuilder.getAbilities()[2];
                characterBuilder.setHealthAmount(health);
            }
        }
    }

    public void savingThrows() {
        if (characterBuilder.getAbilities() != null && characterBuilder.getCharacterClass() != null) {
            strengthThrow = (characterBuilder.getUpdateAbilities()[0] - 10) / 2;
            System.out.println(characterBuilder.getUpdateAbilities()[0]);
            dexterityThrow = (characterBuilder.getUpdateAbilities()[1] - 10) / 2;
            System.out.println(characterBuilder.getUpdateAbilities()[1]);
            constitutionThrow = (characterBuilder.getUpdateAbilities()[2] - 10) / 2;
            System.out.println(characterBuilder.getUpdateAbilities()[2]);
            intelligenceThrow = (characterBuilder.getUpdateAbilities()[3] - 10) / 2;
            System.out.println(characterBuilder.getUpdateAbilities()[3]);
            wisdomThrow = (characterBuilder.getUpdateAbilities()[4] - 10) / 2;
            System.out.println(characterBuilder.getUpdateAbilities()[4]);
            charismaThrow = (characterBuilder.getUpdateAbilities()[5] - 10) / 2;
            System.out.println(characterBuilder.getUpdateAbilities()[5]);
            if (characterBuilder.getCharacterClass().equals("Barbarian")) {
                strengthThrow += 2;
                constitutionThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Bard")) {
                dexterityThrow += 2;
                charismaThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Cleric")) {
                wisdomThrow += 2;
                charismaThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Druid")) {
                intelligenceThrow += 2;
                wisdomThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Fighter")) {
                strengthThrow += 2;
                constitutionThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Monk")) {
                strengthThrow += 2;
                dexterityThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Paladin")) {
                wisdomThrow += 2;
                charismaThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Ranger")) {
                strengthThrow += 2;
                dexterityThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Rogue")) {
                dexterityThrow += 2;
                intelligenceThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Sorcerer")) {
                constitutionThrow += 2;
                charismaThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Warlock")) {
                wisdomThrow += 2;
                charismaThrow += 2;
            }
            if (characterBuilder.getCharacterClass().equals("Wizard")) {
                intelligenceThrow += 2;
                wisdomThrow += 2;
            }
            characterBuilder.setStrThrow(strengthThrow);
            characterBuilder.setDexThrow(dexterityThrow);
            characterBuilder.setConThrow(constitutionThrow);
            characterBuilder.setIntThrow(intelligenceThrow);
            characterBuilder.setWisThrow(wisdomThrow);
            characterBuilder.setChaThrow(charismaThrow);
        }
    }

    public void armorModifier()
    {
        armor = 10;

        if (characterBuilder.getAbilities() != null && characterBuilder.getCharacterClass() != null)
        {
            dexterityThrow = (characterBuilder.getAbilities()[1] - 10) / 2;
            armor = armor + dexterityThrow;
            if (characterBuilder.getCharacterClass().equals("Barbarian"))
            {
                constitutionThrow = (characterBuilder.getAbilities()[2] - 10) / 2;
                armor = armor + constitutionThrow;
            }

            if (characterBuilder.getCharacterClass().equals("Monk"))
            {
                wisdomThrow = (characterBuilder.getAbilities()[4] - 10) / 2;
                armor = armor + wisdomThrow;
            }
        }

        characterBuilder.setArmorAmount(armor);
    }

    public void startSkills()
    {
        updateHealth();
        updateAbilities();
        updateHistoryBonus();
        updateSurvivalBonus();
        updateStealthBonus();
        updateSleightOfHandBonus();
        updateReligionBonus();
        updatePersuasionBonus();
        updatePerformanceBonus();
        updatePerceptionBonus();
        updateNatureBonus();
        updateMedicineBonus();
        updateInvestigationBonus();
        updateIntimidationBonus();
        updateInsightBonus();
        updateDeceptionBonus();
        updateAthleticsBonus();
        updateArcanaBonus();
        updateAnimalHandlingBonus();
        updateAcrobaticsBonus();
        savingThrows();
        armorModifier();
    }
}