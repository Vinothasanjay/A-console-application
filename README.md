
# Console-based Tic-Tac-Toe Game in Java

This is a simple command-line implementation of the classic Tic-Tac-Toe game in Java.

## Overview

This project implements a basic Tic-Tac-Toe game where two players can take turns marking spaces on a 3x3 grid. The game is played entirely through the console, making it accessible and easy to run on any Java-supported environment.

## Features

- **Console Interface:** Interact with the game using standard input and output.
- **Turn-based Gameplay:** Players alternate turns to mark 'X' or 'O' on the board.
- **Win Detection:** Automatically detects when a player has achieved three symbols in a row (horizontal, vertical, or diagonal).
- **Draw Detection:** Ends the game in a draw when all spaces on the board are filled without a winner.
- **Simple and Clear UI:** Provides clear prompts and feedback within the console for easy gameplay.

## How to Run

1. **Compile the Code:**
   ```
   javac Main.java
   ```

2. **Run the Game:**
   ```
   java Main
   ```

## Gameplay Instructions

1. **Board Layout:**
   ```
   | 0 0 | 0 1 | 0 2 |
   | 1 0 | 1 1 | 1 2 |
   | 2 0 | 2 1 | 2 2 |
   ```

2. **Player Turns:**
   - Player 'X' starts first.
   - Enter row and column numbers (0-2) to place your symbol on the board.

3. **Winning Condition:**
   - The game will announce the winner ('X' or 'O') or declare a draw when all spaces are filled.

## Example Gameplay

```
Player X's turn.
Enter row and column (0-2): 1 1
```

This places 'X' in the center of the board.

## Additional Notes

- Ensure Java Development Kit (JDK) is installed on your system to compile and run the code.
- This game runs entirely in the console without any graphical interface.
- Developed as a learning project to practice Java programming and basic game logic.
