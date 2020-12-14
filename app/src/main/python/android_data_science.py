# Here, you make the python program for the app
import numpy as np
from collections import Counter
import matplotlib.pyplot as plt

def dataCalc(x_nums, y_nums):
    x_nums = list(map(int, x_nums.split()))
    mean = np.mean(x_nums)
    median = np.median(x_nums)
    rng = max(x_nums) - min(x_nums)
    c = Counter(x_nums)
    mode = c.most_common(1)
    final_string = 'X Values -> The mean is: ' + str(format(mean, '0.2f')) + '\nThe median is: ' + str(median) + '\nThe range is: ' + str(rng) + '\nThe mode is: ' + str(mode)

    y_nums = list(map(int, y_nums.split()))
    mean = np.mean(y_nums)
    median = np.median(y_nums)
    rng = max(y_nums) - min(y_nums)
    c = Counter(y_nums)
    mode = c.most_common(1)
    final_string += '\n\nY Values -> The mean is: ' + str(format(mean, '0.2f')) + '\nThe median is: ' + str(median) + '\nThe range is: ' + str(rng) + '\nThe mode is: ' + str(mode)

    return final_string