package com.kodilla.rps;

import java.util.Scanner;

public class RpsGame {
    private int pointsToWin;
    private RpsPlayer player1;
    private RpsPlayer player2;
    private int roundCnt = 0;
    private Scanner scanner = new Scanner(System.in);

    public RpsGame() {
    }

    public void run(){
        while (true){
            //Inicjalizacja parametrów gry
            this.init();

            //Pętla rozgrywki
            boolean endGame = false;
            while(!endGame){    //Rozgrywka trwa dopóki nie ma zwycięzcy lub gracz wybierze opcję x lub n
                //Pokaż możliwości wyboru
                this.showMenu();

                //Ewaluacja wyboru gracza
                String selection = scanner.next();
                switch (selection) {
                    //Gracz wybrał kamień, papier lub nożyce
                    case "1", "2", "3":
                        //Numer rundy
                        roundCnt++;
                        System.out.println("Runda: " + roundCnt);
                        //Wybory graczy
                        int player1Selection = Integer.valueOf(selection);
                        int player2Selection = player2.shuffle();
                        showMove(player1, player1Selection);
                        showMove(player2, player2Selection);
                        //Sprawdź kto wygrał tę rundę
                        this.evaluate(player1Selection,player2Selection);
                        //Pokaż aktualny wynik
                        this.showScore();

                        if(this.hasWinner()){
                            while(!endGame) {
                                this.showEndMenu();
                                String endSelection = scanner.next();
                                switch (endSelection.toLowerCase()) {
                                    //Zakończ grę
                                    case "x":
                                        if (this.exit()) {
                                            return;
                                        }
                                        ;
                                        break;

                                    //Rozpocznij grę od nowa
                                    case "n":
                                        endGame = this.newGame();
                                        break;

                                    //Nieprawidłowy wybór
                                    default:
                                        System.out.println("Nie rozpoznano polecenia, spróbuj ponownie.");
                                        break;
                                }
                            }
                        };
                        break;

                    //Zakończ grę
                    case "x":
                        if(this.exit()){return;};
                        break;

                    //Rozpocznij grę od nowa
                    case "n":
                        endGame = this.newGame();
                        break;

                    //Nieprawidłowy wybór
                    default:
                        System.out.println("Nie rozpoznano polecenia, spróbuj ponownie.");
                        break;
                }
            }
        }
    }

    private void init(){
        roundCnt = 0;
        System.out.println("Gra - papier kamień nożyce");

        System.out.println("Podaj imię gracza: ");
        this.player1 = new RpsPlayer(scanner.next(), 0);
        System.out.println("Gracz: " + this.player1);

        this.player2 = new RpsPlayer("Komputer", 1);
        System.out.println("Komputer: " + this.player2);

        System.out.println("Podaj wymaganą ilość punktów do zwycięstwa: ");
        this.pointsToWin = scanner.nextInt();
    }

    //Menu
    private void showMenu(){
        System.out.println("Ruch gracza: ");
        System.out.println("1: Kamień");
        System.out.println("2: Papier");
        System.out.println("3: Nożyce");
        System.out.println("x: Zakończ");
        System.out.println("n: Nowa gra");
    }

    //EndMenu
    private void showEndMenu(){
        System.out.println("x: Zakończ");
        System.out.println("n: Nowa gra");
    }

    //Ewaluacja wyniku rundy
    private void evaluate(int player1Selection, int player2Selection){
        //Remis
        if (player1Selection == player2Selection){
            System.out.println("Remis!");
            return;
        }

        //Wygrana jednego z graczy
        switch (player1Selection) {
            case 1:
                if (player2Selection == 2){player2.addPoint();} else {player1.addPoint();}
                break;
            case 2:
                if (player2Selection == 1){player1.addPoint();} else {player2.addPoint();}
                break;
            case 3:
                if (player2Selection == 1){player2.addPoint();} else {player1.addPoint();}
                break;
        }
    }

    public boolean hasWinner(){
        if ((player1.getScore() >= this.pointsToWin) || (player2.getScore() >= this.pointsToWin)){
            if (player1.getScore() > player2.getScore()){
                System.out.println("Wygrał " + player1.getName() + "!");
            } else {
                System.out.println("Wygrał " + player2.getName() + "!");
            }
            return true;
        } else {
            return false;
        }
    }

    //Rozpocznij grę od nowa
    private boolean newGame(){
        System.out.println("Czy chcesz rozpocząć grę od nowa? y/n");
        String selection = scanner.next();
        if (selection.toLowerCase().equals("y")){
            System.out.println("Rozpoczynam nową grę...");
            return true;
        } else {
            return false;
        }
    }

    //Zakończ grę
    private boolean exit(){
        System.out.println("Czy chcesz zakończyć grę? y/n");
        String selection = scanner.next();
        if (selection.toLowerCase().equals("y")){
            System.out.println("Kończymy grę...");
            return true;
        } else {
            return false;
        }
    }

    //Pokaż ruch gracza
    private void showMove(RpsPlayer player, int move){
        switch (move) {
            case 1:
                System.out.println(player.getName() + ": Kamień");
                break;
            case 2:
                System.out.println(player.getName() + ": Papier");
                break;
            case 3:
                System.out.println(player.getName() + ": Nożyce");
                break;
        }
    }

    //Pokaż wynik
    private void showScore(){
        System.out.println(player1.getName() + " " + player1.getScore() + ":" + player2.getScore() + " " + player2.getName() + "\n");
    }

}
