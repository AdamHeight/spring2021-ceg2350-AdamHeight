Name: Adam Height
Email: Height.4@Wright.edu

Part 1.

1. sudo apt install wamerican
2. The package installed to /usr/share/dict/words
3. -c is the count flag, -i is the ignore case flag, and -E is the extended regular expression flag.
4. grep -ci ^[aeiou] words	18032
   grep -ci cat words		961
   grep -ci [^0-9a-zA-Z] words	29223
   grep -ciE m\{1,\} words	21028

Part 2.

1. touch marco, touch polo
2. 	#!/bin/sh
	echo "This is from *"
3. export PATH=$PATH:/home/ubuntu/spring2021-ceg2350-AdamHeight/Lab04/scripts/*
4. cwd=$(pwd)
   echo "$cwd" > /home/ubuntu...scripts/reference
5. FILE="/home/ubuntu/...scripts/reference"
   echo "cd $FILE"

Part 3.

1. When "marco" is run, it prints a message that confirms it ran, and then saves the path to the current directory in a file.
When "polo" is ran, it prints a confirmation message and then gives the command to go to where the "marco" script was last ran.
