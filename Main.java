import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
static Scanner input= new Scanner(System.in);
   public static int placement;
   
   
  public static char[][] board={
                 {' ','|',' ','|',' '},
                 {'-','-','-','-','-'},
                  {' ','|',' ','|',' '},
                  {'-','-','-','-','-'},
                  {' ','|',' ','|',' '},
                     
             };
  public static int i=0;
   
     
    public static void main(String[] args){
        while(i<1){
   boardgame();
           System.out.println("WELCOME TO THE TICTACTOE GAME! ENTER YOUR PLACEMENT FROM 1 TO 9:");
           System.out.println("PLAYER 1 TURN:");
        placement=input.nextInt();
        Turngamep1();
        System.out.println("Awesome!Player 2 TURN:");
        placement=input.nextInt();
        Turngamep2();
        System.out.println("PLAYER 1 TURN NOW:");
        placement=input.nextInt();
        Turngamep1r3();
        System.out.println("ALRIGHT PLAYER 2 TURN :");
        placement=input.nextInt();
        Turngamep2r4();
        System.out.println("Awesome Player 1 TURN:");
        placement=input.nextInt();
        Turngamep1r5();
        
        checkwinnerp1();
        if(i==1){
            break;
        }
        
        System.out.println("AMAZING!Player 2 TURN:");
        placement=input.nextInt();
        Turngamep2r6();
        checkwinnerp2();
        if(i==1){
            break;
        }
        System.out.println("ALRIGHT!PLAYER 1 TURN :");
        placement=input.nextInt();
        Turngamep1r7();
        checkwinnerp1();
        if(i==1){
            break;
        }
        System.out.println("COOL!PlAYER 2 TURN :");
        placement=input.nextInt();
        Turngamep2r8();
        checkwinnerp2();
        if(i==1){
            break;
        }
        System.out.println("LAST TURN BY PLAYER 1 :");
        placement=input.nextInt();
        Turngamep1r9();
        checkwinnerp11();if(i==1){
            break;
        }
        
        }
    }
    
     public static void boardgame(){
             
     for(char[] row:board){
         for(char data:row){
             System.out.print(data);
         }
         System.out.println();
     }
     
     
                     }
     
     public static void Turngamep1(){
         
         switch(placement){
             case 1:
                 board[0][0]='X';
                 boardgame();
                 break;
         case 2:
                 board[0][2]='X';
                 boardgame();
                 break;
                 
         case 3:
                 board[0][4]='X';
                 boardgame();
                 break;        
        case 4:
                 board[2][0]='X';
                 boardgame();
                 break;         
         case 5:
                 board[2][2]='X';
                 boardgame();
                 break;
         case 6:
                 board[2][4]='X';
                 boardgame();
                 break;
          case 7:
                 board[4][0]='X';
                 boardgame();
                 break;   
           case 8:
                 board[4][2]='X';
                 boardgame();
                 break; 
           case 9:
                 board[4][4]='X';
                 boardgame();
                 break;     
           default:
               break;
         
     }
     
     
     
     
     
     
     
     
     
     
     
     
     }
     public static void Turngamep2(){
         
         switch(placement){
             case 1:
                 board[0][0]='O';
                 boardgame();
                 break;
         case 2:
                 board[0][2]='O';
                 boardgame();
                 break;
                 
         case 3:
                 board[0][4]='O';
                 boardgame();
                 break;        
        case 4:
                 board[2][0]='O';
                 boardgame();
                 break;         
         case 5:
                 board[2][2]='O';
                 boardgame();
                 break;
         case 6:
                 board[2][4]='O';
                 boardgame();
                 break;
          case 7:
                 board[4][0]='O';
                 boardgame();
                 break;   
           case 8:
                 board[4][2]='O';
                 boardgame();
                 break; 
           case 9:
                 board[4][4]='O';
                 boardgame();
                 break;     
           default:
               break;
         
     }
}
 public static void Turngamep1r3(){
         
         switch(placement){
             case 1:
                 board[0][0]='X';
                 boardgame();
                 break;
         case 2:
                 board[0][2]='X';
                 boardgame();
                 break;
                 
         case 3:
                 board[0][4]='X';
                 boardgame();
                 break;        
        case 4:
                 board[2][0]='X';
                 boardgame();
                 break;         
         case 5:
                 board[2][2]='X';
                 boardgame();
                 break;
         case 6:
                 board[2][4]='X';
                 boardgame();
                 break;
          case 7:
                 board[4][0]='X';
                 boardgame();
                 break;   
           case 8:
                 board[4][2]='X';
                 boardgame();
                 break; 
           case 9:
                 board[4][4]='X';
                 boardgame();
                 break;     
           default:
               break;
         
     }    
     
     
     
     
}
 public static void Turngamep2r4(){
         
         switch(placement){
             case 1:
                 board[0][0]='O';
                 boardgame();
                 break;
         case 2:
                 board[0][2]='O';
                 boardgame();
                 break;
                 
         case 3:
                 board[0][4]='O';
                 boardgame();
                 break;        
        case 4:
                 board[2][0]='O';
                 boardgame();
                 break;         
         case 5:
                 board[2][2]='O';
                 boardgame();
                 break;
         case 6:
                 board[2][4]='O';
                 boardgame();
                 break;
          case 7:
                 board[4][0]='O';
                 boardgame();
                 break;   
           case 8:
                 board[4][2]='O';
                 boardgame();
                 break; 
           case 9:
                 board[4][4]='O';
                 boardgame();
                 break;     
           default:
               break;
         
     }
}
 public static void Turngamep1r5(){
         
         switch(placement){
             case 1:
                 board[0][0]='X';
                 boardgame();
                 break;
         case 2:
                 board[0][2]='X';
                 boardgame();
                 break;
                 
         case 3:
                 board[0][4]='X';
                 boardgame();
                 break;        
        case 4:
                 board[2][0]='X';
                 boardgame();
                 break;         
         case 5:
                 board[2][2]='X';
                 boardgame();
                 break;
         case 6:
                 board[2][4]='X';
                 boardgame();
                 break;
          case 7:
                 board[4][0]='X';
                 boardgame();
                 break;   
           case 8:
                 board[4][2]='X';
                 boardgame();
                 break; 
           case 9:
                 board[4][4]='X';
                 boardgame();
                 break;     
           default:
               break;
         
     }    
     
     
     
     
}
  public static void Turngamep2r6(){
         
         switch(placement){
             case 1:
                 board[0][0]='O';
                 boardgame();
                 break;
         case 2:
                 board[0][2]='O';
                 boardgame();
                 break;
                 
         case 3:
                 board[0][4]='O';
                 boardgame();
                 break;        
        case 4:
                 board[2][0]='O';
                 boardgame();
                 break;         
         case 5:
                 board[2][2]='O';
                 boardgame();
                 break;
         case 6:
                 board[2][4]='O';
                 boardgame();
                 break;
          case 7:
                 board[4][0]='O';
                 boardgame();
                 break;   
           case 8:
                 board[4][2]='O';
                 boardgame();
                 break; 
           case 9:
                 board[4][4]='O';
                 boardgame();
                 break;     
           default:
               break;
         
     }
}
   public static void Turngamep1r7(){
         
         switch(placement){
             case 1:
                 board[0][0]='X';
                 boardgame();
                 break;
         case 2:
                 board[0][2]='X';
                 boardgame();
                 break;
                 
         case 3:
                 board[0][4]='X';
                 boardgame();
                 break;        
        case 4:
                 board[2][0]='X';
                 boardgame();
                 break;         
         case 5:
                 board[2][2]='X';
                 boardgame();
                 break;
         case 6:
                 board[2][4]='X';
                 boardgame();
                 break;
          case 7:
                 board[4][0]='X';
                 boardgame();
                 break;   
           case 8:
                 board[4][2]='X';
                 boardgame();
                 break; 
           case 9:
                 board[4][4]='X';
                 boardgame();
                 break;     
           default:
               break;
         
     }    
     
     
     
     
}
    public static void Turngamep2r8(){
         
         switch(placement){
             case 1:
                 board[0][0]='O';
                 boardgame();
                 break;
         case 2:
                 board[0][2]='O';
                 boardgame();
                 break;
                 
         case 3:
                 board[0][4]='O';
                 boardgame();
                 break;        
        case 4:
                 board[2][0]='O';
                 boardgame();
                 break;         
         case 5:
                 board[2][2]='O';
                 boardgame();
                 break;
         case 6:
                 board[2][4]='O';
                 boardgame();
                 break;
          case 7:
                 board[4][0]='O';
                 boardgame();
                 break;   
           case 8:
                 board[4][2]='O';
                 boardgame();
                 break; 
           case 9:
                 board[4][4]='O';
                 boardgame();
                 break;     
           default:
               break;
         
     }
}
       public static void Turngamep1r9(){
         
         switch(placement){
             case 1:
                 board[0][0]='X';
                 boardgame();
                 break;
         case 2:
                 board[0][2]='X';
                 boardgame();
                 break;
                 
         case 3:
                 board[0][4]='X';
                 boardgame();
                 break;        
        case 4:
                 board[2][0]='X';
                 boardgame();
                 break;         
         case 5:
                 board[2][2]='X';
                 boardgame();
                 break;
         case 6:
                 board[2][4]='X';
                 boardgame();
                 break;
          case 7:
                 board[4][0]='X';
                 boardgame();
                 break;   
           case 8:
                 board[4][2]='X';
                 boardgame();
                 break; 
           case 9:
                 board[4][4]='X';
                 boardgame();
                 break;     
           default:
               break;
         
     }    
     
     
     
     
}
       
       
       
       
           public static void checkwinnerp1(){
               if(board[0][0]=='X'&& board [0][2]=='X'&& board[0][4]=='X'){
                   System.out.println("PLAYER 1 WINS!!!!");
                   i++;
               } 
               
                   else if(board[2][0]=='X'&& board [2][2]=='X'&& board[2][4]=='X'){
                           System.out.println("PLAYER 1 WINS!!!!");i++;}
                   else if(board[4][0]=='X'&& board [4][2]=='X'&& board[4][4]=='X'){
                       System.out.println("Player 1 wins!!!!");i++;
                           }
               else if(board[0][0]=='X'&& board [2][0]=='X'&& board[4][0]=='X'){
                       System.out.println("Player 1 wins!!!!");i++;
                           }
               else if(board[0][2]=='X'&& board [2][2]=='X'&& board[4][2]=='X'){
                       System.out.println("Player 1 wins!!!!");i++;
                           }
               else if(board[0][4]=='X'&& board [2][4]=='X'&& board[4][4]=='X'){
                       System.out.println("Player 1 wins!!!!");i++;
                           }
               else if(board[0][0]=='X'&& board [2][2]=='X'&& board[4][4]=='X'){
                       System.out.println("Player 1 wins!!!!");i++;
                           }
               else if(board[0][4]=='X'&& board [2][2]=='X'&& board[4][0]=='X'){
                       System.out.println("Player 1 wins!!!!");i++;
                           }
               
               
               
               }
               
               public static void checkwinnerp2(){
               if(board[0][0]=='O'&& board [0][2]=='O'&& board[0][4]=='O'){
                   System.out.println("PLAYER 1 WINS!!!!");i++;} 
               
                   else if(board[2][0]=='O'&& board [2][2]=='O'&& board[2][4]=='O'){
                           System.out.println("PLAYER 2 WINS!!!!");i++;}
                   else if(board[4][0]=='O'&& board [4][2]=='O'&& board[4][4]=='O'){
                       System.out.println("Player 2 wins!!!!");i++;
                           }
               else if(board[0][0]=='O'&& board [2][0]=='O'&& board[4][0]=='O'){
                       System.out.println("Player 2 wins!!!!");i++;
                           }
               else if(board[0][2]=='O'&& board [2][2]=='O'&& board[4][2]=='O'){
                       System.out.println("Player 2 wins!!!!");i++;
                           }
               else if(board[0][4]=='O'&& board [2][4]=='O'&& board[4][4]=='O'){
                       System.out.println("Player 2 wins!!!!");i++;
                           }
               else if(board[0][0]=='O'&& board [2][2]=='O'&& board[4][4]=='O'){
                       System.out.println("Player 2 wins!!!!");i++;
                           }
               else if(board[0][4]=='O'&& board [2][2]=='O'&& board[4][0]=='O'){
                       System.out.println("Player 2 wins!!!!");i++;
                           }
               
                   
               
               
           }
               public static void checkwinnerp11(){
               if(board[0][0]=='X'&& board [0][2]=='X'&& board[0][4]=='X'){
                   System.out.println("PLAYER 1 WINS!!!!");
                   
               } 
               
                   else if(board[2][0]=='X'&& board [2][2]=='X'&& board[2][4]=='X'){
                           System.out.println("PLAYER 1 WINS!!!!");}
                   else if(board[4][0]=='X'&& board [4][2]=='X'&& board[4][4]=='X'){
                       System.out.println("Player 1 wins!!!!");
                           }
               else if(board[0][0]=='X'&& board [2][0]=='X'&& board[4][0]=='X'){
                       System.out.println("Player 1 wins!!!!");
                           }
               else if(board[0][2]=='X'&& board [2][2]=='X'&& board[4][2]=='X'){
                       System.out.println("Player 1 wins!!!!");
                           }
               else if(board[0][4]=='X'&& board [2][4]=='X'&& board[4][4]=='X'){
                       System.out.println("Player 1 wins!!!!");
                           }
               else if(board[0][0]=='X'&& board [2][2]=='X'&& board[4][4]=='X'){
                       System.out.println("Player 1 wins!!!!");
                           }
               else if(board[0][4]=='X'&& board [2][2]=='X'&& board[4][0]=='X'){
                       System.out.println("Player 1 wins!!!!");
                           }
               else{
                   System.out.println("NO ONE WINS!!!! IT IS A DRAW!!!");i++;
               }
               
               
               }
}
