public class setupChessBoard{
	public static void main(String[] args){
		
		ChessBoard game = new ChessBoard();
		
		game.printBoard();
		
		
		int count = 15;
		char nonPawn[] = {'R','N','B','Q','K','B','N','R'};
		String position[] ={"a1","b1","c1","d1","e1","f1","g1","h1"};
	
		
		ChessPiece[] black = new ChessPiece[count];
		
		for(int i = 0;i<count; i++){
			black[i] = new ChessPiece();
			if(i<=7){
				black[i].makePiece("b",nonPawn[i],position[i]);
			}
			else{			
				black[i].makePiece("b",'P',"a2");
			}
		}
		
		ChessPiece[] white = new ChessPiece[count];
		
		for(int i = 0;i<count; i++){
			white[i] = new ChessPiece();
			if(i<=7){
				white[i].makePiece("w",nonPawn[i],position[i]);
			}
			else{			
				white[i].makePiece("w",'P',"a1");
			}
		}
		
		for(int i = 0;i<count; i++){
			System.out.print(black[i].printInfo());
			System.out.print(" ");
		
		}
		System.out.print("\n");
		for(int i = 0;i<count; i++){
			System.out.print(white[i].printInfo());
			System.out.print(" ");
			
		}
		
	}
	
	}

