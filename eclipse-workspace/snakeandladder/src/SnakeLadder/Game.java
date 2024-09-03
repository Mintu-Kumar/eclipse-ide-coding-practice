package SnakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
	
	Board board;
	Dice  dice;
	Deque<Player> playerList =  new LinkedList<>();
	Player winner;
	
	Game() {
		initializeGame();
	}
	
	private void initializeGame() {
		board =  new Board(10,5,4);
		dice  =  new Dice(1);
	    winner  =  null;
	    addPlayer();
	}
	
	private void addPlayer() {
		Player player1 =  new Player("p1",0);
		Player player2 =  new Player("p2",0);
		
		playerList.add(player1);
		playerList.add(player2);
	}
	
	public void startGame() {
		
		while(winner == null) {
			Player playerTurn = findPlayerTurn();
			System.out.println("player turn is "+ playerTurn.id+ " current position is:"+ playerTurn.currentPosition);
			
			int diceNumber =  dice.rollDice();
			
			int playerNewPosition = playerTurn.currentPosition+ diceNumber;
			playerNewPosition = jumpCheck(playerNewPosition);
			playerTurn.currentPosition= playerNewPosition;
			
			System.out.println("player turn is "+ playerTurn.id+ " current position is:"+ playerTurn.currentPosition);
			
			if(playerNewPosition >=board.cells.length*board.cells.length-1) {
				winner = playerTurn;
				
			}
		}
		
		System.out.println("The winner is:" + winner.id);
	}
	
	private Player findPlayerTurn() {
		
		Player playerTurns =  playerList.removeFirst();
		playerList.addLast(playerTurns);
		return playerTurns;
	}
	
	private int jumpCheck(int playeNewPosition) {
		if(playeNewPosition>board.cells.length*board.cells.length-1) {
			return playeNewPosition;
		}
		
		Cell cell =  board.getCell(playeNewPosition);
		int a = cell.jump.start ;
		if(cell != null && cell.jump.start == playeNewPosition) {
			String jumpBy =  (cell.jump.start < cell.jump.end)? "ladder" :"snake";
			System.out.println("jump done by:"+ jumpBy);
			return cell.jump.end;
		}
		
		return playeNewPosition;
		
	}

}
