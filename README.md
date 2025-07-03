# 🎮 Tic Tac Toe Game – Java (Swing GUI)

A simple and functional **Tic Tac Toe** game built using **Java Swing**. The game allows two players to play turn-by-turn, detects wins and draws, and includes a reset button for replaying.

---

## 🧩 Features

- ✅ Two-player turn-based gameplay (X and O)
- ✅ Win and draw detection
- ✅ Reset button to replay without restarting the program
- ✅ GUI-based using Java Swing
- ✅ Fully runnable in **VS Code** or **Eclipse**

---

## 🛠️ Technologies Used

- Java (JDK 8 or higher)
- Java Swing (GUI)
- VS Code or any Java-supporting IDE

---

## 📂 Folder Structure

TicTacToe/
├── src/
│ └── TicTacToe.java
└── README.md


---

## 🚀 How to Run (VS Code)

### ✅ Prerequisites

- Java JDK installed  
- VS Code with **Java Extension Pack**

### ▶️ Steps

1. Open the folder `TicTacToe` in VS Code  
2. Inside `src/`, create a file named `TicTacToe.java`
3. Paste the complete Java code into the file  
4. Run the program in one of these two ways:

#### ✅ Option 1: Run Button

- Hover over the `main` method
- Click the **Run ▶️** button

#### ✅ Option 2: Terminal Commands

Open Terminal (`Ctrl + ``) and type:
```bash
cd src
javac TicTacToe.java
java TicTacToe

✅ A GUI window will appear. You can now play the game.

🧠 How It Works
Uses a 3×3 grid of buttons for game board

Keeps track of turns (X or O)

Detects win conditions (rows, columns, diagonals)

Detects draw if all cells are filled

Reset button re-initializes the board

✨ Possible Improvements
Add single-player mode vs AI (Minimax)

Add scoreboard or win count

Add sound effects or themes

Make it mobile/responsive using JavaFX (optional)
