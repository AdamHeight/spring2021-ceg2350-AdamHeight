Name: Adam Height
Email: Height.4@Wright.edu

Part 1

1. Using an absolute path makes the command runable from anywhere in the tree.
2. alias aws-ssh = 'ssh -i /home/aheight/ceg2350-vmcert ubuntu@54.83.129.27'

Part 2

1. aws-ssh
2. cd /home/ubuntu/spring2021-ceg2350-AdamHeight/Lab03
3. touch input.txt
4. ? There doesn't seem to be a four.
5. sort input.txt
2
2.1
2.2
2.3
4
4.5
4.6
4.7
42.7
43.5
43.7
44.6
46.6
47.4
55.6
62.1
66.6
9.1
9.2
9.3

6. sort input.txt >> output.txt

Part 3

1. #!/bin/bash

read var

sort $var >> sorted.txt

Part 4

1. if [[ "$var" != *.txt ]]; 

then echo "File format not allowed"

exit 0

Part 5

1. sorting-party prompts the user for a file name. It then checks that the file is a txt file. If found, the script will sort the file's content and print the output in a file named "sorted.txt". 
