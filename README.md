# Sudoku Board (APCS)

Henry Li, APCS Period 1, 4/12/2026

*This project is solely for APCS! Please ignore if you are not APCS! There's other cool repos here too!*

#### Description and Explanation

A project for APCS, the Sudoku Board generator that exists in the `Main.java` file uses a form of backtracking in order to create Sudoku Boards really quickly! To be specific, it goes through every cell of the board, and tests if a number "fits", that being it aligns with the rules of a sudoku board (no row repeats, no column repeats, and no 3x3 box repeats). If not, any board following that "branch" is invalid (because adding more numbers to an invalid board doesn't fix it). Yes, this uses recursion! If the "branch is bad", it sends it back to where it works, where it can continue "fitting numbers". After going through it enough times, all cells get filled and the board is displayed!

[Here's](https://www.youtube.com/watch?v=VlD6sf6PCgw) the video the assignment asked for!

#### How to Run

1. Clone, have some form of java, run `Main.java`
2. Enjoy a solved sudoku board!

#### Files

- [`Main.java`](</Main.java>)
- [`README.md`](</README.md>) (optional)
- [`design-document.pdf`](</design-document.pdf>) (optional)
