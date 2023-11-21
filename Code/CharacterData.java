import java.util.List;

public class CharacterData {
    private String race;
    private String subrace;
    private String characterClass;
    private String subclass;
    private int[] abilities;
    private String name;
    private String background;
    private String skillsAndProficiencies1;
    private String skillsAndProficiencies2;
    private String hair;
    private String skin;
    private String eyes;
    private String height;
    private String weight;
    private int age;
    private String gender;
    private List<String> equipment;

    // Constructor
    public CharacterData() 
    {
        // You can initialize default values here if needed
    }

    // Getter and Setter methods for each variable

    public String getRace() 
    {
        return race;
    }

    public void setRace(String race) 
    {
        this.race = race;
    }

    public String getSubrace() 
    {
        return subrace;
    }

    public void setSubrace(String subrace) 
    {
        this.subrace = subrace;
    }

    public String getCharacterClass() 
    {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) 
    {
        this.characterClass = characterClass;
    }

    public String getSubclass() 
    {
        return subclass;
    }

    public void setSubclass(String subclass) 
    {
        this.subclass = subclass;
    }

    public int[] getAbilities() 
    {
        return abilities;
    }

    public void setAbilities(int[] abilities) 
    {
        this.abilities = abilities;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getBackground() 
    {
        return background;
    }

    public void setBackground(String background) 
    {
        this.background = background;
    }

    public String getSkillsAndProficiencies1() 
    {
        return skillsAndProficiencies1;
    }

    public void setSkillsAndProficiencies1(String skillsAndProficiencies1) 
    {
        this.skillsAndProficiencies1 = skillsAndProficiencies1;
    }

    public String getSkillsAndProficiencies2() 
    {
        return skillsAndProficiencies2;
    }

    public void setSkillsAndProficiencies2(String skillsAndProficiencies2) 
    {
        this.skillsAndProficiencies2 = skillsAndProficiencies2;
    }

    public String getHair() 
    {
        return hair;
    }

    public void setHair(String hair) 
    {
        this.hair = hair;
    }

    public String getSkin() 
    {
        return skin;
    }

    public void setSkin(String skin) 
    {
        this.skin = skin;
    }

    public String getEyes() 
    {
        return eyes;
    }

    public void setEyes(String eyes) 
    {
        this.eyes = eyes;
    }

    public String getHeight() 
    {
        return height;
    }

    public void setHeight(String height) 
    {
        this.height = height;
    }

    public String getWeight() 
    {
        return weight;
    }

    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public List<String> getEquipment() 
    {
        return equipment;
    }

    public void setEquipment(List<String> equipment) 
    {
        this.equipment = equipment;
    }
}
