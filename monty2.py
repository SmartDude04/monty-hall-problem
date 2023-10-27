import random
# You must run "pip install numpy to get this to work!"
# "pip uninstall numpy" when done
import numpy as np
import time

start_time = time.perf_counter_ns()

def run_sim(switch_door, num_tries):
    user_choices = np.random.randint(1, 4, num_tries)
    win_doors = np.random.randint(1, 4, num_tries)

    if switch_door:
        return np.sum(user_choices != win_doors)
    else:
        return np.sum(user_choices == win_doors)

num_tries = 1000000

num_wins_false = run_sim(False, num_tries)
num_losses_false = num_tries - num_wins_false

num_wins_true = run_sim(True, num_tries)
num_losses_true = num_tries - num_wins_true

print("When switching to false:")
print(f"Wins: {num_wins_false} -- Losses: {num_losses_false}")
print(f"Win: {num_wins_false / num_tries * 100}")

print("When switching to true:")
print(f"Wins: {num_wins_true} -- Losses: {num_losses_true}")
print(f"Win: {num_wins_true / num_tries * 100}")

end_time = time.perf_counter_ns()

print(f"Time: {(end_time - start_time) / 1000000}")