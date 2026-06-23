
while True:
    # Get inputs from players
    player1 = input("Player 1 (Rock/Paper/Scissors): ").lower()
    player2 = input("Player 2 (Rock/Paper/Scissors): ").lower()

    # Game logic
    if player1 == player2:
        print("It's a tie!")

    elif (player1 == "rock" and player2 == "scissors") or \
         (player1 == "scissors" and player2 == "paper") or \
         (player1 == "paper" and player2 == "rock"):
        print("Player 1 wins!")

    elif (player2 == "rock" and player1 == "scissors") or \
         (player2 == "scissors" and player1 == "paper") or \
         (player2 == "paper" and player1 == "rock"):
        print("Player 2 wins!")

    else:
        print("Invalid choice! Please enter Rock, Paper, or Scissors.")

    # Ask if users want to play again
    play_again = input("Do you want to play again? (Yes/No): ").lower()

    if play_again != "yes":
        print("Thanks for playing!")
        break
