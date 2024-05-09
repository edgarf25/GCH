package Scenes;

import java.util.Arrays;

public class Skill {
    SummaryBuilder summaryBuilder = SummaryBuilder.getInstance();
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
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Lightfoot Halfling")) { // checking for bonuses for acrobatics
                acrobaticsBonus++;
                summaryBuilder.setAcrobaticsBonus(acrobaticsBonus);
            }
            if (summaryBuilder.getSubrace().equals("Wood Elf")) {
                acrobaticsBonus++;
                summaryBuilder.setAcrobaticsBonus(acrobaticsBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Acrobatics") || summaryBuilder.getSkillsAndProficiencies2().equals("Acrobatics")) {
                acrobaticsBonus++;
                summaryBuilder.setAcrobaticsBonus(acrobaticsBonus);
            }
            if (summaryBuilder.getAbilities()[1] <= 9) {
                acrobaticsBonus--;
                summaryBuilder.setAcrobaticsBonus(acrobaticsBonus);
            } else if (summaryBuilder.getAbilities()[1] <= 13 && summaryBuilder.getAbilities()[1] > 11) {
                acrobaticsBonus++;
                summaryBuilder.setAcrobaticsBonus(acrobaticsBonus);
            } else if (summaryBuilder.getAbilities()[1] <= 15) {
                acrobaticsBonus += 2;
                summaryBuilder.setAcrobaticsBonus(acrobaticsBonus);
            } else if (summaryBuilder.getAbilities()[1] <= 20) {
                acrobaticsBonus += 3;
                summaryBuilder.setAcrobaticsBonus(acrobaticsBonus);
            }
        }
    }

    public void updateAnimalHandlingBonus() {
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Hill Dwarf")) {
                animalHandlingBonus++;
                summaryBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            }
            if (summaryBuilder.getSubrace().equals("Stout Halfling")) {
                animalHandlingBonus++;
                summaryBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Animal Handlling") || summaryBuilder.getSkillsAndProficiencies2().equals("Animal Handling")) {
                animalHandlingBonus++;
                summaryBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            }
            if (summaryBuilder.getAbilities()[4] <= 9) {
                animalHandlingBonus--;
                summaryBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 13 && summaryBuilder.getAbilities()[4] > 11) {
                animalHandlingBonus++;
                summaryBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 15) {
                animalHandlingBonus += 2;
                summaryBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 20) {
                animalHandlingBonus += 3;
                summaryBuilder.setAnimalHandlingBonus(animalHandlingBonus);
            }
        }
    }

    public void updateArcanaBonus() {
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("High Elf")) {
                arcanaBonus++;
                summaryBuilder.setArcanaBonus(arcanaBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Arcana") || summaryBuilder.getSkillsAndProficiencies2().equals("Arcana")) {
                arcanaBonus++;
                summaryBuilder.setArcanaBonus(arcanaBonus);
            }
            if (summaryBuilder.getAbilities()[3] <= 9) {
                arcanaBonus--;
                summaryBuilder.setArcanaBonus(arcanaBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 13 && summaryBuilder.getAbilities()[3] > 11) {
                arcanaBonus++;
                summaryBuilder.setArcanaBonus(arcanaBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 15) {
                arcanaBonus += 2;
                summaryBuilder.setArcanaBonus(arcanaBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 20) {
                arcanaBonus += 3;
                summaryBuilder.setArcanaBonus(arcanaBonus);
            }
        }
    }

    public void updateAthleticsBonus() {
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Mountain Dwarf")) {
                athleticsBonus++;
                summaryBuilder.setAthleticsBonus(athleticsBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Athletics") || summaryBuilder.getSkillsAndProficiencies2().equals("Athletics")) {
                animalHandlingBonus++;
                summaryBuilder.setAthleticsBonus(athleticsBonus);
            }
            if (summaryBuilder.getAbilities()[0] <= 9) {
                athleticsBonus--;
                summaryBuilder.setAthleticsBonus(athleticsBonus);
            } else if (summaryBuilder.getAbilities()[0] <= 13 && summaryBuilder.getAbilities()[0] > 11) {
                athleticsBonus++;
                summaryBuilder.setAthleticsBonus(athleticsBonus);
            } else if (summaryBuilder.getAbilities()[0] <= 15) {
                athleticsBonus += 2;
                summaryBuilder.setAthleticsBonus(athleticsBonus);
            } else if (summaryBuilder.getAbilities()[0] <= 20) {
                athleticsBonus += 3;
                summaryBuilder.setAthleticsBonus(athleticsBonus);
            }
        }
    }

    public void updateDeceptionBonus() {
        if (summaryBuilder.getRace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getRace().equals("Tiefling")) {
                deceptionBonus++;
                summaryBuilder.setDeceptionBonus(deceptionBonus);
            }
            if (summaryBuilder.getRace().equals("Half-Elf")) {
                deceptionBonus++;
                summaryBuilder.setDeceptionBonus(deceptionBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Deception") || summaryBuilder.getSkillsAndProficiencies2().equals("Deception")) {
                deceptionBonus++;
                summaryBuilder.setDeceptionBonus(deceptionBonus);
            }
            if (summaryBuilder.getAbilities()[5] <= 9) {
                deceptionBonus--;
                summaryBuilder.setDeceptionBonus(deceptionBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 13 && summaryBuilder.getAbilities()[5] > 11) {
                deceptionBonus++;
                summaryBuilder.setDeceptionBonus(deceptionBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 15) {
                deceptionBonus += 2;
                summaryBuilder.setDeceptionBonus(deceptionBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 20) {
                deceptionBonus += 3;
                summaryBuilder.setDeceptionBonus(deceptionBonus);
            }
        }
    }

    public void updateInsightBonus() {
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Wood Elf")) {
                insightBonus++;
                summaryBuilder.setInsightBonus(insightBonus);
            }
            if (summaryBuilder.getSubrace().equals("Hill Dwarf")) {
                insightBonus++;
                summaryBuilder.setInsightBonus(insightBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Insight") || summaryBuilder.getSkillsAndProficiencies2().equals("Insight")) {
                insightBonus++;
                summaryBuilder.setInsightBonus(insightBonus);
            }
            if (summaryBuilder.getAbilities()[4] <= 9) {
                insightBonus--;
                summaryBuilder.setInsightBonus(insightBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 13 && summaryBuilder.getAbilities()[4] > 11) {
                insightBonus++;
                summaryBuilder.setInsightBonus(insightBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 15) {
                insightBonus += 2;
                summaryBuilder.setInsightBonus(insightBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 20) {
                insightBonus += 3;
                summaryBuilder.setInsightBonus(insightBonus);
            }
        }
    }

    public void updateIntimidationBonus() {
        if (summaryBuilder.getRace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getRace().equals("Dragonborn")) {
                intimidationBonus++;
                summaryBuilder.setIntimidationBonus(intimidationBonus);
            }
            if (summaryBuilder.getRace().equals("Half-Orc")) {
                intimidationBonus++;
                summaryBuilder.setIntimidationBonus(intimidationBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Intimidation") || summaryBuilder.getSkillsAndProficiencies2().equals("Intimidation")) {
                intimidationBonus++;
                summaryBuilder.setIntimidationBonus(intimidationBonus);
            }
            if (summaryBuilder.getAbilities()[5] <= 9) {
                intimidationBonus--;
                summaryBuilder.setIntimidationBonus(intimidationBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 13 && summaryBuilder.getAbilities()[5] > 11) {
                intimidationBonus++;
                summaryBuilder.setIntimidationBonus(intimidationBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 15) {
                intimidationBonus += 2;
                summaryBuilder.setIntimidationBonus(intimidationBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 20) {
                intimidationBonus += 3;
                summaryBuilder.setIntimidationBonus(intimidationBonus);
            }
        }
    }

    public void updateInvestigationBonus() {
        if (summaryBuilder.getRace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getRace().equals("Gnome")) {
                investigationBonus++;
                summaryBuilder.setInvestigationBonus(investigationBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Investigation") || summaryBuilder.getSkillsAndProficiencies2().equals("Investigation")) {
                investigationBonus++;
                summaryBuilder.setInvestigationBonus(investigationBonus);
            }
            if (summaryBuilder.getAbilities()[3] <= 9) {
                investigationBonus--;
                summaryBuilder.setInvestigationBonus(investigationBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 13 && summaryBuilder.getAbilities()[3] > 11) {
                investigationBonus++;
                summaryBuilder.setInvestigationBonus(investigationBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 15) {
                investigationBonus += 2;
                summaryBuilder.setInvestigationBonus(investigationBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 20) {
                investigationBonus += 3;
                summaryBuilder.setInvestigationBonus(investigationBonus);
            }
        }
    }

    public void updateMedicineBonus() {
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Hill Dwarf")) {
                medicineBonus++;
                summaryBuilder.setMedicineBonus(medicineBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Medicine") || summaryBuilder.getSkillsAndProficiencies2().equals("Medicine")) {
                medicineBonus++;
                summaryBuilder.setMedicineBonus(medicineBonus);
            }
            if (summaryBuilder.getAbilities()[4] <= 9) {
                medicineBonus--;
                summaryBuilder.setMedicineBonus(medicineBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 13 && summaryBuilder.getAbilities()[4] > 11) {
                medicineBonus++;
                summaryBuilder.setMedicineBonus(medicineBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 15) {
                medicineBonus += 2;
                summaryBuilder.setMedicineBonus(medicineBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 20) {
                medicineBonus += 3;
                summaryBuilder.setMedicineBonus(medicineBonus);
            }
        }
    }

    public void updateNatureBonus() {
        if (summaryBuilder.getRace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null && summaryBuilder.getSubrace() != null) {
            if (summaryBuilder.getSubrace().equals("Wood Elf")) {
                natureBonus++;
                summaryBuilder.setNatureBonus(natureBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Nature") || summaryBuilder.getSkillsAndProficiencies2().equals("Nature")) {
                natureBonus++;
                summaryBuilder.setNatureBonus(natureBonus);
            }
            if (summaryBuilder.getAbilities()[3] <= 9) {
                natureBonus--;
                summaryBuilder.setNatureBonus(natureBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 13 && summaryBuilder.getAbilities()[3] > 11) {
                natureBonus++;
                summaryBuilder.setNatureBonus(natureBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 15) {
                natureBonus += 2;
                summaryBuilder.setNatureBonus(natureBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 20) {
                natureBonus += 3;
                summaryBuilder.setNatureBonus(natureBonus);
            }
        }
    }

    public void updatePerceptionBonus() {
        if (summaryBuilder.getRace() != null && summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Wood Elf")) {
                perceptionBonus++;
                summaryBuilder.setPerceptionBonus(perceptionBonus);
            }
            if (summaryBuilder.getRace().equals("Half-Elf")) {
                perceptionBonus++;
                summaryBuilder.setPerceptionBonus(perceptionBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Perception") || summaryBuilder.getSkillsAndProficiencies2().equals("Perception")) {
                perceptionBonus++;
                summaryBuilder.setPerceptionBonus(perceptionBonus);
            }
            if (summaryBuilder.getAbilities()[4] <= 9) {
                perceptionBonus--;
                summaryBuilder.setPerceptionBonus(perceptionBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 13 && summaryBuilder.getAbilities()[4] > 11) {
                perceptionBonus++;
                summaryBuilder.setPerceptionBonus(perceptionBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 15) {
                perceptionBonus += 2;
                summaryBuilder.setPerceptionBonus(perceptionBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 20) {
                perceptionBonus += 3;
                summaryBuilder.setPerceptionBonus(perceptionBonus);
            }
        }
    }

    public void updatePerformanceBonus() {
        if (summaryBuilder.getRace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getRace().equals("Half-Elf")) {
                performanceBonus++;
                summaryBuilder.setPerformanceBonus(performanceBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Performance") || summaryBuilder.getSkillsAndProficiencies2().equals("Performance")) {
                performanceBonus++;
                summaryBuilder.setPerformanceBonus(performanceBonus);
            }
            if (summaryBuilder.getAbilities()[5] <= 9) {
                performanceBonus--;
                summaryBuilder.setPerformanceBonus(performanceBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 13 && summaryBuilder.getAbilities()[5] > 11) {
                performanceBonus++;
                summaryBuilder.setPerformanceBonus(performanceBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 15) {
                performanceBonus += 2;
                summaryBuilder.setPerformanceBonus(performanceBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 20) {
                performanceBonus += 3;
                summaryBuilder.setPerformanceBonus(performanceBonus);
            }
        }
    }

    public void updatePersuasionBonus() {
        if (summaryBuilder.getRace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getRace().equals("Half-Elf")) {
                persuasionBonus++;
                summaryBuilder.setPersuasionBonus(persuasionBonus);
            }
            if (summaryBuilder.getRace().equals("Half-Orc")) {
                persuasionBonus++;
                summaryBuilder.setPersuasionBonus(persuasionBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Persuasion") || summaryBuilder.getSkillsAndProficiencies2().equals("Persuasion")) {
                persuasionBonus++;
                summaryBuilder.setPersuasionBonus(persuasionBonus);
            }
            if (summaryBuilder.getAbilities()[5] <= 9) {
                persuasionBonus--;
                summaryBuilder.setPersuasionBonus(persuasionBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 13 && summaryBuilder.getAbilities()[5] > 11) {
                persuasionBonus++;
                summaryBuilder.setPersuasionBonus(persuasionBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 15) {
                persuasionBonus += 2;
                summaryBuilder.setPersuasionBonus(persuasionBonus);
            } else if (summaryBuilder.getAbilities()[5] <= 20) {
                persuasionBonus += 3;
                summaryBuilder.setPersuasionBonus(persuasionBonus);
            }
        }
    }

    public void updateReligionBonus() {
        if (summaryBuilder.getRace() != null && summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getRace().equals("Tiefling")) {
                religionBonus++;
                summaryBuilder.setReligionBonus(religionBonus);
            }
            if (summaryBuilder.getSubrace().equals("Hill Dwarf")) {
                religionBonus++;
                summaryBuilder.setReligionBonus(religionBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Religion") || summaryBuilder.getSkillsAndProficiencies2().equals("Religion")) {
                religionBonus++;
                summaryBuilder.setReligionBonus(religionBonus);
            }
            if (summaryBuilder.getAbilities()[3] <= 9) {
                religionBonus--;
                summaryBuilder.setReligionBonus(religionBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 13 && summaryBuilder.getAbilities()[3] > 11) {
                religionBonus++;
                summaryBuilder.setReligionBonus(religionBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 15) {
                religionBonus += 2;
                summaryBuilder.setReligionBonus(religionBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 20) {
                religionBonus += 3;
                summaryBuilder.setReligionBonus(religionBonus);
            }
        }
    }

    public void updateSleightOfHandBonus() {
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Lightfoot Halfling")) {
                sleightOfHandBonus++;
                summaryBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            }
            if (summaryBuilder.getSubrace().equals("Wood Dwarf")) {
                sleightOfHandBonus++;
                summaryBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Sleight Of Hand") || summaryBuilder.getSkillsAndProficiencies2().equals("Sleight Of Hand")) {
                sleightOfHandBonus++;
                summaryBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            }
            if (summaryBuilder.getAbilities()[1] <= 9) {
                sleightOfHandBonus--;
                summaryBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            } else if (summaryBuilder.getAbilities()[1] <= 13 && summaryBuilder.getAbilities()[1] > 11) {
                sleightOfHandBonus++;
                summaryBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            } else if (summaryBuilder.getAbilities()[1] <= 15) {
                sleightOfHandBonus += 2;
                summaryBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            } else if (summaryBuilder.getAbilities()[1] <= 20) {
                sleightOfHandBonus += 3;
                summaryBuilder.setSleightOfHandBonus(sleightOfHandBonus);
            }
        }
    }

    public void updateStealthBonus() {
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Wood Elf")) {
                stealthBonus++;
                summaryBuilder.setStealthBonus(stealthBonus);
            }
            if (summaryBuilder.getSubrace().equals("Lightfoot Halfling")) {
                stealthBonus++;
                summaryBuilder.setStealthBonus(stealthBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Stealth") || summaryBuilder.getSkillsAndProficiencies2().equals("Stealth")) {
                stealthBonus++;
                summaryBuilder.setStealthBonus(stealthBonus);
            }
            if (summaryBuilder.getAbilities()[1] <= 9) {
                stealthBonus--;
                summaryBuilder.setStealthBonus(stealthBonus);
            } else if (summaryBuilder.getAbilities()[1] <= 13 && summaryBuilder.getAbilities()[1] > 11) {
                stealthBonus++;
                summaryBuilder.setStealthBonus(stealthBonus);
            } else if (summaryBuilder.getAbilities()[1] <= 15) {
                stealthBonus += 2;
                summaryBuilder.setStealthBonus(stealthBonus);
            } else if (summaryBuilder.getAbilities()[1] <= 20) {
                stealthBonus += 3;
                summaryBuilder.setStealthBonus(stealthBonus);
            }
        }
    }

    public void updateSurvivalBonus() {
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Wood Elf")) {
                survivalBonus++;
                summaryBuilder.setSurvivalBonus(survivalBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("Survival") || summaryBuilder.getSkillsAndProficiencies2().equals("Survival")) {
                survivalBonus++;
                summaryBuilder.setSurvivalBonus(survivalBonus);
            }
            if (summaryBuilder.getAbilities()[4] <= 9) {
                survivalBonus--;
                summaryBuilder.setSurvivalBonus(survivalBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 13 && summaryBuilder.getAbilities()[4] > 11) {
                survivalBonus++;
                summaryBuilder.setSurvivalBonus(survivalBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 15) {
                survivalBonus += 2;
                summaryBuilder.setSurvivalBonus(survivalBonus);
            } else if (summaryBuilder.getAbilities()[4] <= 20) {
                survivalBonus += 3;
                summaryBuilder.setSurvivalBonus(survivalBonus);
            }
        }
    }

    public void updateHistoryBonus() {
        if (summaryBuilder.getSubrace() != null && summaryBuilder.getSkillsAndProficiencies1() != null && summaryBuilder.getSkillsAndProficiencies2() != null && summaryBuilder.getAbilities() != null) {
            if (summaryBuilder.getSubrace().equals("Hill Dwarf")) {
                historyBonus++;
                summaryBuilder.setHistoryBonus(historyBonus);
            }
            if (summaryBuilder.getSkillsAndProficiencies1().equals("History") || summaryBuilder.getSkillsAndProficiencies2().equals("History ")) {
                historyBonus++;
                summaryBuilder.setHistoryBonus(historyBonus);
            }
            if (summaryBuilder.getAbilities()[3] <= 9) {
                historyBonus--;
                summaryBuilder.setHistoryBonus(historyBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 13 && summaryBuilder.getAbilities()[3] > 11) {
                historyBonus++;
                summaryBuilder.setHistoryBonus(historyBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 15) {
                historyBonus += 2;
                summaryBuilder.setHistoryBonus(historyBonus);
            } else if (summaryBuilder.getAbilities()[3] <= 20) {
                historyBonus += 3;
                summaryBuilder.setHistoryBonus(historyBonus);
            }
        }
    }

    public void updateAbilities() {
        if (summaryBuilder.getRace() != null && summaryBuilder.getSubrace() != null && summaryBuilder.getAbilities() != null) {
            Integer[] newAbilities = Arrays.copyOf(summaryBuilder.getAbilities(), summaryBuilder.getAbilities().length);
            Integer newStrength = newAbilities[0];
            Integer newDexterity = newAbilities[1];
            Integer newConstitution = newAbilities[2];
            Integer newIntelligence = newAbilities[3];
            Integer newWisdom = newAbilities[4];
            Integer newCharisma = newAbilities[5];
            if (summaryBuilder.getRace().equals("Half-Orc")) {
                newStrength += 2;
                newConstitution++;
            }
            if (summaryBuilder.getSubrace().equals("Mountain Dwarf")) {
                newStrength += 2;
            }
            if (summaryBuilder.getRace().equals("Elf")) {
                newDexterity += 2;
            }
            if (summaryBuilder.getRace().equals("Halfling")) {
                newDexterity += 2;
            }
            if (summaryBuilder.getSubrace().equals("Hill Dwarf")) {
                newConstitution += 2;
                newWisdom++;
            }
            if (summaryBuilder.getRace().equals("Dragonborn")) {
                newConstitution += 2;
                newCharisma++;
            }
            if (summaryBuilder.getSubrace().equals("Rock Gnome")) {
                newIntelligence++;
            }
            if (summaryBuilder.getSubrace().equals("High Elf")) {
                newIntelligence++;
            }
            if (summaryBuilder.getRace().equals("Tiefling")) {
                newIntelligence++;
                newCharisma += 2;
            }
            if (summaryBuilder.getSubrace().equals("Wood Elf")) {
                newWisdom++;
            }
            if (summaryBuilder.getRace().equals("Half-Elf")) {
                newCharisma += 2;
            }
            newAbilities[0] = newStrength;
            newAbilities[1] = newDexterity;
            newAbilities[2] = newConstitution;
            newAbilities[3] = newIntelligence;
            newAbilities[4] = newWisdom;
            newAbilities[5] = newCharisma;

            summaryBuilder.setUpdateAbilities(newAbilities);
        }
    }

    public void updateHealth() {
        int health = 0;
        if (summaryBuilder.getCharacterClass() != null && summaryBuilder.getAbilities() != null)
        {
            if (summaryBuilder.getCharacterClass().equals("Barbarian")) {
                health = 12 + summaryBuilder.getAbilities()[2];
                summaryBuilder.setHealthAmount(health);
            }
            if (summaryBuilder.getCharacterClass().equals("Fighter") || summaryBuilder.getCharacterClass().equals("Paladin") || summaryBuilder.getCharacterClass().equals("Ranger")) {
                health = 10 + summaryBuilder.getAbilities()[2];
                summaryBuilder.setHealthAmount(health);
            }
            if (summaryBuilder.getCharacterClass().equals("Bard") || summaryBuilder.getCharacterClass().equals("Cleric") || summaryBuilder.getCharacterClass().equals("Druid") || summaryBuilder.getCharacterClass().equals("Monk") || summaryBuilder.getCharacterClass().equals("Rogue") || summaryBuilder.getCharacterClass().equals("Warlock")) {
                health = 8 + summaryBuilder.getAbilities()[2];
                summaryBuilder.setHealthAmount(health);
            }
            if (summaryBuilder.getCharacterClass().equals("Sorcerer") || summaryBuilder.getCharacterClass().equals("Wizard")) {
                health = 6 + summaryBuilder.getAbilities()[2];
                summaryBuilder.setHealthAmount(health);
            }
        }
    }

    public void savingThrows() {
        if (summaryBuilder.getAbilities() != null && summaryBuilder.getCharacterClass() != null) {
            strengthThrow = (summaryBuilder.getUpdateAbilities()[0] - 10) / 2;
            System.out.println(summaryBuilder.getUpdateAbilities()[0]);
            dexterityThrow = (summaryBuilder.getUpdateAbilities()[1] - 10) / 2;
            System.out.println(summaryBuilder.getUpdateAbilities()[1]);
            constitutionThrow = (summaryBuilder.getUpdateAbilities()[2] - 10) / 2;
            System.out.println(summaryBuilder.getUpdateAbilities()[2]);
            intelligenceThrow = (summaryBuilder.getUpdateAbilities()[3] - 10) / 2;
            System.out.println(summaryBuilder.getUpdateAbilities()[3]);
            wisdomThrow = (summaryBuilder.getUpdateAbilities()[4] - 10) / 2;
            System.out.println(summaryBuilder.getUpdateAbilities()[4]);
            charismaThrow = (summaryBuilder.getUpdateAbilities()[5] - 10) / 2;
            System.out.println(summaryBuilder.getUpdateAbilities()[5]);
            if (summaryBuilder.getCharacterClass().equals("Barbarian")) {
                strengthThrow += 2;
                constitutionThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Bard")) {
                dexterityThrow += 2;
                charismaThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Cleric")) {
                wisdomThrow += 2;
                charismaThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Druid")) {
                intelligenceThrow += 2;
                wisdomThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Fighter")) {
                strengthThrow += 2;
                constitutionThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Monk")) {
                strengthThrow += 2;
                dexterityThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Paladin")) {
                wisdomThrow += 2;
                charismaThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Ranger")) {
                strengthThrow += 2;
                dexterityThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Rogue")) {
                dexterityThrow += 2;
                intelligenceThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Sorcerer")) {
                constitutionThrow += 2;
                charismaThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Warlock")) {
                wisdomThrow += 2;
                charismaThrow += 2;
            }
            if (summaryBuilder.getCharacterClass().equals("Wizard")) {
                intelligenceThrow += 2;
                wisdomThrow += 2;
            }
            summaryBuilder.setStrThrow(strengthThrow);
            summaryBuilder.setDexThrow(dexterityThrow);
            summaryBuilder.setConThrow(constitutionThrow);
            summaryBuilder.setIntThrow(intelligenceThrow);
            summaryBuilder.setWisThrow(wisdomThrow);
            summaryBuilder.setChaThrow(charismaThrow);
        }
    }

    public void armorModifier()
    {
        armor = 10;

        if (summaryBuilder.getAbilities() != null && summaryBuilder.getCharacterClass() != null)
        {
            dexterityThrow = (summaryBuilder.getAbilities()[1] - 10) / 2;
            armor = armor + dexterityThrow;
            if (summaryBuilder.getCharacterClass().equals("Barbarian"))
            {
                constitutionThrow = (summaryBuilder.getAbilities()[2] - 10) / 2;
                armor = armor + constitutionThrow;
            }

            if (summaryBuilder.getCharacterClass().equals("Monk"))
            {
                wisdomThrow = (summaryBuilder.getAbilities()[4] - 10) / 2;
                armor = armor + wisdomThrow;
            }
        }

        summaryBuilder.setArmorAmount(armor);
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