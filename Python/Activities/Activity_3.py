
# Take input from both players
player1 = input("Player 1 (Rock/Paper/Scissors): ").lower()
player2 = input("Player 2 (Rock/Paper/Scissors): ").lower()

# Check for tie
if player1 == player2:
    print("It's a tie!")

# Player 1 winning conditions
elif (player1 == "rock" and player2 == "scissors") or \
     (player1 == "scissors" and player2 == "paper") or \
     (player1 == "paper" and player2 == "rock"):
    print("Player 1 wins!")

# Player 2 winning conditions
elif (player2 == "rock" and player1 == "scissors") or \
     (player2 == "scissors" and player1 == "paper") or \
     (player2 == "paper" and player1 == "rock"):
    print("Player 2 wins!")

# Invalid input handling
else:
    print("Invalid choice! Please enter Rock, Paper, or Scissors.")
