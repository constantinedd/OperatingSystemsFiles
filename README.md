# OperatingSystemsFiles
A collection of files from my OS course


Note on input.data for FCFS.java : The file must be in the following format. 

input.data

3         (number of processes)
0         (this indicates it is not pre-emptive)
3 5 2     (arrival time, burst time, priority)
2 3 1     (arrival time, burst time, priority)
4 6 3     (arrival time, burst time, priority)

Output:

0    5    1         (start time, end time, process number)
5    8    2         (start time, end time, process number)
8    14   3         (start time, end time, process number)
