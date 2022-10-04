import java.util.Scanner;

public class ticTacToe {
    private players player1,player2;
    private board board;
    public static void main(String[] args) {
        ticTacToe t = new ticTacToe();
        t.startGame();
    }
    public void startGame(){
        Scanner sc = new Scanner(System.in);
        player1 = takeInput(1);
        player2 = takeInput(2);
        while(player1.getSymbol() == player2.getSymbol()){
            System.out.println("Symbol already taken !!");
            char symbol = sc.next().charAt(0);
            player2.setSymbol(symbol);
        }
        clearScreen();
        board = new board(player1.getSymbol(), player2.getSymbol());
        boolean player1Turn = true;
        int status = board.incomplete;
        while(status == board.incomplete || status == board.invalid){
            if(player1Turn){
                System.out.println("Player 1 - "+player1.getName()+"'s turn");
                System.out.println("Enter x: ");
                int x = sc.nextInt();
                System.out.println("Enter y: ");
                int y = sc.nextInt();
                status = board.move(player1.getSymbol(),x,y);
                if(status == board.invalid){
                    System.out.println("Invalid Move!! Enter again");
                }else{
                    player1Turn = false;
                    board.print();
                }
            }else{
                System.out.println("Player 2 - "+player2.getName()+"'s turn");
                System.out.println("Enter x: ");
                int x = sc.nextInt();
                System.out.println("Enter y: ");
                int y = sc.nextInt();
                status = board.move(player2.getSymbol(),x,y);
                if(status == board.invalid){
                    System.out.println("Invalid Move!! Enter again");
                }else{
                    player1Turn = true;
                    board.print();
                }
            }
            if(status == board.player1Wins){
                System.out.println("Player 1 - "+player1.getName()+" wins!!");
            }else if(status == board.player2Wins){
                System.out.println("Player 2 - "+player2.getName()+" wins!!");
            }else if(status == board.draw){
                System.out.println("Match Draw!!");
            }
        }
        sc.close();
    }
    private players takeInput(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player "+num+" name: ");
        String name = sc.nextLine();
        System.out.println("Enter player "+num+" symbol: ");
        char symbol = sc.next().charAt(0);
        players p = new players(name,symbol);
        return p;
    }
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
class players {
    private String name;
    private char symbol;
    public players(String name,char symbol){
        setName(name);
        setSymbol(symbol);
    }
    public void setName(String name){
        if(!name.isEmpty()){
            this.name =name;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setSymbol(char symbol){
        if(symbol!='\0'){
            this.symbol = symbol;
        }
    }
    public char getSymbol(){
        return this.symbol;
    }
}
class board {
    private char board[][];
    private int boardSize=3;
    private char p1Symbol;
    private int count;
    public static final int player1Wins = 1;
    public static final int player2Wins = 2;
    public static final int draw = 3;
    public static final int incomplete = 4;
    public static final int invalid = 5;
    public board(char p1Symbol,char p2Symbol){
        board = new char[3][3];
        for(int i = 0; i<boardSize ; i++){
            for(int j = 0; j <boardSize ; j++){
                board[i][j] =' ';
            }
        }
        this.p1Symbol = p1Symbol;
    }
    public int move(char symbol, int x, int y){
        if(x<0 || x>= boardSize || y<0 ||y>=boardSize || board[x][y] != ' '){
            return invalid;
        }
        board[x][y] = symbol;
        count++;
        if(board[x][0]==board[x][1] && board[x][0] == board[x][2]){
            return symbol == p1Symbol ? player1Wins:player2Wins;
        }
        if(board[0][y]==board[1][y] && board[0][y] == board[2][y]){
            return symbol == p1Symbol ? player1Wins:player2Wins;
        }
        if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[0][0] == board[2][2]){
            return symbol == p1Symbol ? player1Wins:player2Wins;
        }
        if(board[0][2]!=' ' && board[0][2]==board[1][1] && board[0][2] == board[2][0]){
            return symbol == p1Symbol ? player1Wins:player2Wins;
        }
        if(count == boardSize*boardSize){
            return draw;
        }
        return incomplete;
    }
    public void print(){
        System.out.println("---------------");
        for(int i =0 ; i<boardSize ; i++){
            for(int j = 0; j<boardSize ; j++){
                System.out.print("| "+board[i][j]+" |");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
}
