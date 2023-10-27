import random
import time
import py_compile

start_time = time.perf_counter_ns()

def run_sim(switch_door):
    
    user_choice = int(random.random() * 3 + 1)
    win_door = int(random.random() *  + 1)
    
    return((switch_door and (user_choice != win_door)) or (not switch_door and (user_choice == win_door)))

num_tries = 1000000

num_wins_false = 0
num_losses_false = 0
num_wins_true = 0
num_losses_true = 0

i = 0
while i < num_tries:
    if(run_sim(False)):
        num_wins_false = num_wins_false + 1
    else:
        num_losses_false = num_losses_false + 1
    i+= 1

print("When switching to false:")
print(f"Wins: {num_wins_false} -- Losses: {num_losses_false}")
print(f"Win: {num_wins_false / num_tries * 100}")

i = 0
while i < num_tries:
    if(run_sim(True)):
        num_wins_true = num_wins_true + 1
    else:
        num_losses_true = num_losses_true + 1
    i+= 1
        
print("When switching to true:")
print(f"Wins: {num_wins_true} -- Losses: {num_losses_true}")
print(f"Win: {num_wins_true / num_tries * 100}")

end_time = time.perf_counter_ns()

print(f"Time: {(end_time - start_time) / 1000000}")