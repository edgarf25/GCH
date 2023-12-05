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
        }
        else if (characterData.getAbilities()[1] <= 13 && characterData.getAbilities()[1] > 11) {
            acrobaticsBonus++;
            characterData.setAcrobaticsBonus(acrobaticsBonus);
        }
        else if (characterData.getAbilities()[1] <= 15) {
            acrobaticsBonus += 2;
            characterData.setAcrobaticsBonus(acrobaticsBonus);
        }
        else if (characterData.getAbilities()[1] <= 20) {
            acrobaticsBonus += 3;
            characterData.setAcrobaticsBonus(acrobaticsBonus);
        }
    }

    public void updateAnimalHandlingBonus() {
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
        }
        else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
            animalHandlingBonus++;
            characterData.setAnimalHandlingBonus(animalHandlingBonus);
        }
        else if (characterData.getAbilities()[4] <= 15) {
            animalHandlingBonus += 2;
            characterData.setAnimalHandlingBonus(animalHandlingBonus);
        }
        else if (characterData.getAbilities()[4] <= 20) {
            animalHandlingBonus += 3;
            characterData.setAnimalHandlingBonus(animalHandlingBonus);
        }
    }

    public void updateArcanaBonus() {
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
        }
        else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
            arcanaBonus++;
            characterData.setArcanaBonus(arcanaBonus);
        }
        else if (characterData.getAbilities()[3] <= 15) {
            arcanaBonus += 2;
            characterData.setArcanaBonus(arcanaBonus);
        }
        else if (characterData.getAbilities()[3] <= 20) {
            arcanaBonus += 3;
            characterData.setArcanaBonus(arcanaBonus);
        }
    }

    public void updateAthleticsBonus() {
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
        }
        else if (characterData.getAbilities()[0] <= 13 && characterData.getAbilities()[0] > 11) {
            athleticsBonus++;
            characterData.setAthleticsBonus(athleticsBonus);
        }
        else if (characterData.getAbilities()[0] <= 15) {
            athleticsBonus += 2;
            characterData.setAthleticsBonus(athleticsBonus);
        }
        else if (characterData.getAbilities()[0] <= 20) {
            athleticsBonus += 3;
            characterData.setAthleticsBonus(athleticsBonus);
        }
    }

    public void updateDeceptionBonus() {
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
        }
        else if (characterData.getAbilities()[5] <= 13 && characterData.getAbilities()[5] > 11) {
            deceptionBonus++;
            characterData.setDeceptionBonus(deceptionBonus);
        }
        else if (characterData.getAbilities()[5] <= 15) {
            deceptionBonus += 2;
            characterData.setDeceptionBonus(deceptionBonus);
        }
        else if (characterData.getAbilities()[5] <= 20) {
            deceptionBonus += 3;
            characterData.setDeceptionBonus(deceptionBonus);
        }
    }

    public void updateInsightBonus() {
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
        }
        else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
            insightBonus++;
            characterData.setInsightBonus(insightBonus);
        }
        else if (characterData.getAbilities()[4] <= 15) {
            insightBonus += 2;
            characterData.setInsightBonus(insightBonus);
        }
        else if (characterData.getAbilities()[4] <= 20) {
            insightBonus += 3;
            characterData.setInsightBonus(insightBonus);
        }
    }

    public void updateIntimidationBonus() {
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
        }
        else if (characterData.getAbilities()[5] <= 13 && characterData.getAbilities()[5] > 11) {
            intimidationBonus++;
            characterData.setIntimidationBonus(intimidationBonus);
        }
        else if (characterData.getAbilities()[5] <= 15) {
            intimidationBonus += 2;
            characterData.setIntimidationBonus(intimidationBonus);
        }
        else if (characterData.getAbilities()[5] <= 20) {
            intimidationBonus += 3;
            characterData.setIntimidationBonus(intimidationBonus);
        }
    }

    public void updateInvestigationBonus() {
        if (characterData.getRace().equals("Gnome")) {
            investigationBonus++;
            characterData.setInvestigationBonus(investigationBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Investigation") || characterData.getSkillsAndProficiencies2().equals("Investigation")) {
            investigationBonus++;
            characterData.setInvestigationBonus(investigationBonus);
        }
        if (characterData.getAbilities()[3] <= 9) {
            investigationBonus--;
            characterData.setInvestigationBonus(investigationBonus);
        }
        else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
            investigationBonus++;
            characterData.setInvestigationBonus(investigationBonus);
        }
        else if (characterData.getAbilities()[3] <= 15) {
            investigationBonus += 2;
            characterData.setInvestigationBonus(investigationBonus);
        }
        else if (characterData.getAbilities()[3] <= 20) {
            investigationBonus += 3;
            characterData.setInvestigationBonus(investigationBonus);
        }
    }

    public void updateMedicineBonus() {
        if (characterData.getSubrace().equals("Hill Dwarf")) {
            medicineBonus++;
            characterData.setMedicineBonus(medicineBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Medicine") || characterData.getSkillsAndProficiencies2().equals("Medicine")) {
            medicineBonus++;
            characterData.setMedicineBonus(medicineBonus);
        }
        if (characterData.getAbilities()[4] <= 9) {
            medicineBonus--;
            characterData.setMedicineBonus(medicineBonus);
        }
        else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
            medicineBonus++;
            characterData.setMedicineBonus(medicineBonus);
        }
        else if (characterData.getAbilities()[4] <= 15) {
            medicineBonus += 2;
            characterData.setMedicineBonus(medicineBonus);
        }
        else if (characterData.getAbilities()[4] <= 20) {
            medicineBonus += 3;
            characterData.setMedicineBonus(medicineBonus);
        }
    }

    public void updateNatureBonus() {
        if (characterData.getSubrace().equals("Wood Elf")) {
            natureBonus++;
            characterData.setNatureBonus(natureBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Nature") || characterData.getSkillsAndProficiencies2().equals("Nature")) {
            natureBonus++;
            characterData.setNatureBonus(natureBonus);
        }
        if (characterData.getAbilities()[3] <= 9) {
            natureBonus--;
            characterData.setNatureBonus(natureBonus);
        }
        else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
            natureBonus++;
            characterData.setNatureBonus(natureBonus);
        }
        else if (characterData.getAbilities()[3] <= 15) {
            natureBonus += 2;
            characterData.setNatureBonus(natureBonus);
        }
        else if (characterData.getAbilities()[3] <= 20) {
            natureBonus += 3;
            characterData.setNatureBonus(natureBonus);
        }
    }

    public void updatePerceptionBonus() {
        if (characterData.getSubrace().equals("Wood Elf")) {
            perceptionBonus++;
            characterData.setPerceptionBonus(perceptionBonus);
        }
        if (characterData.getRace().equals("Half-Elf")) {
            perceptionBonus++;
            characterData.setPerceptionBonus(perceptionBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Perception") || characterData.getSkillsAndProficiencies2().equals("Perception")) {
            perceptionBonus++;
            characterData.setPerceptionBonus(perceptionBonus);
        }
        if (characterData.getAbilities()[4] <= 9) {
            perceptionBonus--;
            characterData.setPerceptionBonus(perceptionBonus);
        }
        else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
            perceptionBonus++;
            characterData.setPerceptionBonus(perceptionBonus);
        }
        else if (characterData.getAbilities()[4] <= 15) {
            perceptionBonus += 2;
            characterData.setPerceptionBonus(perceptionBonus);
        }
        else if (characterData.getAbilities()[4] <= 20) {
            perceptionBonus += 3;
            characterData.setPerceptionBonus(perceptionBonus);
        }
    }

    public void updatePerformanceBonus() {
        if (characterData.getRace().equals("Half-Elf")) {
            performanceBonus++;
            characterData.setPerformanceBonus(performanceBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Performance") || characterData.getSkillsAndProficiencies2().equals("Performance")) {
            performanceBonus++;
            characterData.setPerformanceBonus(performanceBonus);
        }
        if (characterData.getAbilities()[5] <= 9) {
            performanceBonus--;
            characterData.setPerformanceBonus(performanceBonus);
        }
        else if (characterData.getAbilities()[5] <= 13 && characterData.getAbilities()[5] > 11) {
            performanceBonus++;
            characterData.setPerformanceBonus(performanceBonus);
        }
        else if (characterData.getAbilities()[5] <= 15) {
            performanceBonus += 2;
            characterData.setPerformanceBonus(performanceBonus);
        }
        else if (characterData.getAbilities()[5] <= 20) {
            performanceBonus += 3;
            characterData.setPerformanceBonus(performanceBonus);
        }
    }

    public void updatePersuasionBonus() {
        if (characterData.getRace().equals("Half-Elf")) {
            persuasionBonus++;
            characterData.setPersuasionBonus(persuasionBonus);
        }
        if (characterData.getRace().equals("Half-Orc")) {
            persuasionBonus++;
            characterData.setPersuasionBonus(persuasionBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Persuasion") || characterData.getSkillsAndProficiencies2().equals("Persuasion")) {
            persuasionBonus++;
            characterData.setPersuasionBonus(persuasionBonus);
        }
        if (characterData.getAbilities()[5] <= 9) {
            persuasionBonus--;
            characterData.setPersuasionBonus(persuasionBonus);
        }
        else if (characterData.getAbilities()[5] <= 13 && characterData.getAbilities()[5] > 11) {
            persuasionBonus++;
            characterData.setPersuasionBonus(persuasionBonus);
        }
        else if (characterData.getAbilities()[5] <= 15) {
            persuasionBonus += 2;
            characterData.setPersuasionBonus(persuasionBonus);
        }
        else if (characterData.getAbilities()[5] <= 20) {
            persuasionBonus += 3;
            characterData.setPersuasionBonus(persuasionBonus);
        }
    }

    public void updateReligionBonus() {
        if (characterData.getRace().equals("Tiefling")) {
            religionBonus++;
            characterData.setReligionBonus(religionBonus);
        }
        if (characterData.getSubrace().equals("Hill Dwarf")) {
            religionBonus++;
            characterData.setReligionBonus(religionBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Religion") || characterData.getSkillsAndProficiencies2().equals("Religion")) {
            religionBonus++;
            characterData.setReligionBonus(religionBonus);
        }
        if (characterData.getAbilities()[3] <= 9) {
            religionBonus--;
            characterData.setReligionBonus(religionBonus);
        }
        else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
            religionBonus++;
            characterData.setReligionBonus(religionBonus);
        }
        else if (characterData.getAbilities()[3] <= 15) {
            religionBonus += 2;
            characterData.setReligionBonus(religionBonus);
        }
        else if (characterData.getAbilities()[3] <= 20) {
            religionBonus += 3;
            characterData.setReligionBonus(religionBonus);
        }
    }

    public void updateSleightOfHandBonus() {
        if (characterData.getSubrace().equals("Lightfoot Halfling")) {
            sleightOfHandBonus++;
            characterData.setSleightOfHandBonus(sleightOfHandBonus);
        }
        if (characterData.getSubrace().equals("Wood Dwarf")) {
            sleightOfHandBonus++;
            characterData.setSleightOfHandBonus(sleightOfHandBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Sleight Of Hand") || characterData.getSkillsAndProficiencies2().equals("Sleight Of Hand")) {
            sleightOfHandBonus++;
            characterData.setSleightOfHandBonus(sleightOfHandBonus);
        }
        if (characterData.getAbilities()[1] <= 9) {
            sleightOfHandBonus--;
            characterData.setSleightOfHandBonus(sleightOfHandBonus);
        }
        else if (characterData.getAbilities()[1] <= 13 && characterData.getAbilities()[1] > 11) {
            sleightOfHandBonus++;
            characterData.setSleightOfHandBonus(sleightOfHandBonus);
        }
        else if (characterData.getAbilities()[1] <= 15) {
            sleightOfHandBonus += 2;
            characterData.setSleightOfHandBonus(sleightOfHandBonus);
        }
        else if (characterData.getAbilities()[1] <= 20) {
            sleightOfHandBonus += 3;
            characterData.setSleightOfHandBonus(sleightOfHandBonus);
        }
    }

    public void updateStealthBonus() {
        if (characterData.getSubrace().equals("Wood Elf")) {
            stealthBonus++;
            characterData.setStealthBonus(stealthBonus);
        }
        if (characterData.getSubrace().equals("Lightfoot Halfling")) {
            stealthBonus++;
            characterData.setStealthBonus(stealthBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Stealth") || characterData.getSkillsAndProficiencies2().equals("Stealth")) {
            stealthBonus++;
            characterData.setStealthBonus(stealthBonus);
        }
        if (characterData.getAbilities()[1] <= 9) {
            stealthBonus--;
            characterData.setStealthBonus(stealthBonus);
        }
        else if (characterData.getAbilities()[1] <= 13 && characterData.getAbilities()[1] > 11) {
            stealthBonus++;
            characterData.setStealthBonus(stealthBonus);
        }
        else if (characterData.getAbilities()[1] <= 15) {
            stealthBonus += 2;
            characterData.setStealthBonus(stealthBonus);
        }
        else if (characterData.getAbilities()[1] <= 20) {
            stealthBonus += 3;
            characterData.setStealthBonus(stealthBonus);
        }
    }

    public void updateSurvivalBonus() {
        if (characterData.getSubrace().equals("Wood Elf")) {
            survivalBonus++;
            characterData.setSurvivalBonus(survivalBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("Survival") || characterData.getSkillsAndProficiencies2().equals("Survival")) {
            survivalBonus++;
            characterData.setSurvivalBonus(survivalBonus);
        }
        if (characterData.getAbilities()[4] <= 9) {
            survivalBonus--;
            characterData.setSurvivalBonus(survivalBonus);
        }
        else if (characterData.getAbilities()[4] <= 13 && characterData.getAbilities()[4] > 11) {
            survivalBonus++;
            characterData.setSurvivalBonus(survivalBonus);
        }
        else if (characterData.getAbilities()[4] <= 15) {
            survivalBonus += 2;
            characterData.setSurvivalBonus(survivalBonus);
        }
        else if (characterData.getAbilities()[4] <= 20) {
            survivalBonus += 3;
            characterData.setSurvivalBonus(survivalBonus);
        }
    }

    public void updateHistoryBonus() {
        if (characterData.getSubrace().equals("Hill Dwarf")) {
            historyBonus++;
            characterData.setHistoryBonus(historyBonus);
        }
        if (characterData.getSkillsAndProficiencies1().equals("History") || characterData.getSkillsAndProficiencies2().equals("History ")) {
            historyBonus++;
            characterData.setHistoryBonus(historyBonus);
        }
        if (characterData.getAbilities()[3] <= 9) {
            historyBonus--;
            characterData.setHistoryBonus(historyBonus);
        }
        else if (characterData.getAbilities()[3] <= 13 && characterData.getAbilities()[3] > 11) {
            historyBonus++;
            characterData.setHistoryBonus(historyBonus);
        }
        else if (characterData.getAbilities()[3] <= 15) {
            historyBonus += 2;
            characterData.setHistoryBonus(historyBonus);
        }
        else if (characterData.getAbilities()[3] <= 20) {
            historyBonus += 3;
            characterData.setHistoryBonus(historyBonus);
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
        if (characterData.getCharacterClass() != null)
        {
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
    }
}