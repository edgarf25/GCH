<h1 align="center">
   DNDesigner
</h1>

## Interactive Dungeons and Dragons Character Creation Tool

**DNDesigner** is an interactive desktop application built using Java and JavaFX that allows players to quickly and easily create fully customized characters for Dungeons and Dragons. This tool generates characters based on user input, automatically calculating stats, abilities, and equipment according to the official game rules. The application streamlines the character creation process, making it accessible for both new and experienced players.

## Features

- **Character Customization**: Choose your character's race, class, and background, with automatic stat calculation.
- **Equipment and Skills Management**: Assign skills, equipment, and abilities based on character choices and D&D rules.
- **Stat Generation**: Supports various stat generation methods such as standard array, point buy, or rolling dice.
- **Automatic Ability Calculation**: Automatically calculates stats like attack bonuses, skill checks, and saving throws.
- **Game Progression**: Handles Health advancement and the ability to take notes during the game.

### Installation

To run the Dungeons and Dragons Character Creator locally, follow these steps:

1. Clone the repository:
    ```bash
    git clone https://github.com/edgarf25/dnd-character-creator.git
    ```
2. Navigate into the project directory:
    ```bash
    cd dnd-character-creator
    ```
3. Compile and run the application:
    ```bash
    javac -cp .:path/to/javafx-sdk/lib/* Main.java
    java -cp .:path/to/javafx-sdk/lib/* Main
    ```

    Make sure you have JavaFX properly installed and configured.

## Usage

- **Character Creation**: Select your character's race, class, background, and use the built-in stat generation methods. The application will automatically update skills, abilities, and equipment based on your choices.
- **Update**: Update your character's stats and see changes in stats, hit points, and abilities as they progress.

## Technologies Used

- **Java**: The main programming language used for logic and functionality.
- **JavaFX**: Used for creating the graphical user interface and ensuring an interactive user experience.
- **JSON/XML**: Used for storing Dungeons and Dragons data, such as classes, races, and abilities.

## Screenshots

_Screenshot of the character creation process, showing race and class selection, stats, and equipment management._

![Screenshot](https://github.com/edgarf25/SE370-2023-Team1-DND_CC/blob/main/Code/src/dndimg.png?raw=true)

