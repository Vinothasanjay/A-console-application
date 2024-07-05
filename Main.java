import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
char[][] board=new char[3][3];
//initialize the board to empty
for(int r=0;r<board.length;r++){
for(int c=0;c<board[r].length;c++){
board[r][c]=' ';
}
}
char player='X';
boolean Gameover=false;
while(!Gameover){
PrintBoard(board);
System.out.println("Player : "+player);
//Get input from player(row,col)
int r=s.nextInt();
int c=s.nextInt();
//Check whether the r,c is empty
if(board[r][c]==' '){
board[r][c]=player;
Gameover=Havewon(board,player);
if(Gameover){
PrintBoard(board);
System.out.println("You won "+ player  );
}
else{
if(player=='X'){
player='O';
}
else{
player='X';
}
}
}
else{
System.out.println("Invalid move");
}
}
}

public static boolean Havewon(char[][] board, char player) {
for (int r = 0; r < board.length; r++) {
if (board[r][0] == player && board[r][1] == player && board[r][2] == player) {
return true; // Check rows
}
}

for (int c = 0; c < board[0].length; c++) {
if (board[0][c] == player && board[1][c] == player && board[2][c] == player) {
return true; // Check columns
}
}

// Check diagonals
if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
return true; // Left diagonal
}
if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
return true; // Right diagonal
}

return false;
}

public static void PrintBoard(char[][] board){
for(int r=0;r<board.length;r++){
for(int c=0;c<board[0].length;c++){
System.out.print(board[r][c]+" | ");
}
System.out.println();

}
}

}
