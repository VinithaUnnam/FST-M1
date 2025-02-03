def get_player_move(player):
    while True:
        move = input(f"Player {player}, enter your move (Rock, Paper, Scissors): ").lower()
        if move in ['rock', 'paper', 'scissors']:
            return move
        else:
            print("Invalid move! Please enter 'Rock', 'Paper', or 'Scissors'.")
def determine_winner(player1_move, player2_move):
    if player1_move == player2_move:
        return "It's a tie!"
    elif (player1_move == 'rock' and player2_move == 'scissors') or \
         (player1_move == 'scissors' and player2_move == 'paper') or \
         (player1_move == 'paper' and player2_move == 'rock'):
        return "Player 1 wins!"
    else:
        return "Player 2 wins!"
def play_game():
    print("Welcome to Rock, Paper, Scissors!")
    player1_move = get_player_move(1)
    player2_move = get_player_move(2)
    result = determine_winner(player1_move, player2_move)
    print(f"\nPlayer 1 chose {player1_move.capitalize()}.")
    print(f"Player 2 chose {player2_move.capitalize()}.")
    print(result)
if __name__ == "__main__":
    play_game()
