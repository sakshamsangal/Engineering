# shell sort
	improved version of insertion sort
	technique used: partitioning.
	distance(gap) apart elements are compared 
	gap keep reducing until gap = 1

# example
	0	1	2	3	4	5	6	7	8	9
	77 	62 	14 	9	30	21 	80 	25 	70 	55

	N = 10 #size

# pass 1:
	input: 
	0	1	2	3	4	5	6	7	8	9
	77 	62 	14 	9	30	21 	80 	25 	70 	55


	procedure:
	gap = floor(N/2)
		= 10 / 2 = 5 

	arrays formed:
	0	1	2	3	4	5	6	7	8	9
	77 					21 	

	0	1	2	3	4	5	6	7	8	9
		62			 	 	80 				

	0	1	2	3	4	5	6	7	8	9
			14 					25

	0	1	2	3	4	5	6	7	8	9
				9 					70 	

	0	1	2	3	4	5	6	7	8	9
					30 					55


	output:
	0	1	2	3	4	5	6	7	8	9
	21 	62 	14 	9	30	77 	80 	25 	70 	55


# pass 2:
	input:
	0	1	2	3	4	5	6	7	8	9
	21 	62 	14 	9	30	77 	80 	25 	70 	55


	procedure:
	gap = gap / 2
		= 2 

	arrays formed:
	0	1	2	3	4	5	6	7	8	9
	21 	 	14 		30	 	80 	 	70 	

	0	1	2	3	4	5	6	7	8	9
	 	62 	 	9		77 	 	25 	 	55


	output:
	0	1	2	3	4	5	6	7	8	9
	14	9	21 	25	30	55 	70 	62 	80	77


# pass 3:
	input:
	0	1	2	3	4	5	6	7	8	9
	14	9	21 	25	30	55 	70 	62 	80	77

	procedure:
	gap = gap / 2
		= 2 / 2 = 1

	0	1	2	3	4	5	6	7	8	9
	14											9

	0	1	2	3	4	5	6	7	8	9
	14	9										21 	

	0	1	2	3	4	5	6	7	8	9
	14	9	9 	21								25	

	0	1	2	3	4	5	6	7	8	9
	14	9	21 	25	30	

	0	1	2	3	4	5	6	7	8	9
	14	9	21 	25	30	55 	

	0	1	2	3	4	5	6	7	8	9
	14	9	21 	25	30	55 	70 	

	0	1	2	3	4	5	6	7	8	9
	14	9	21 	25	30	55 	70 	62 	

	0	1	2	3	4	5	6	7	8	9
	14	9	21 	25	30	55 	70 	62 	80	

	0	1	2	3	4	5	6	7	8	9
	14	9	21 	25	30	55 	70 	62 	80	77













