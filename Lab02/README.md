Name: Adam Height
Email: Height.4@Wright.edu

sudo git clone https://github.com/WSU-kduncan/spring2021-ceg2350-AdamHeight.git

Part 1.

1. mkdir DirA 	 mkdir "Directory B"
2. The space requires the name to be enclosed in quotation marks for Linux to recognize it. Naming things without spaces is better practice in Linux.
3. mv Directory\ B/ DirB

Part 2.

1. touch test.txt
2. vim text.txt	 	a	:wq!

Part 3.

1. cp test.txt .hidden.txt
2. cp test.txt .hidden.txt
3. ls without flags does not show .hidden.txt. The -a flag is required to see the hidden file.

Part 4.

1. Current permissions are 664. Owner and Group are both "ubuntu".
2. sudo cp test.txt su-test.txt
3. Permissions are 644. Owner and group are root.
4. The user currently only has read permissions and cannot write to the file. Sudo can be used to write to the file, or the user can su to root.
5. sudo chown ubuntu su-test.txt

Part 5.

1. ln creates a hard link to a file.
2. ln test.txt hard.txt
3. Yes, the inode numbers of hard linked files are the same, because they are the same file.
4. ln -s hard.txt sym.txt
5. No, symbolic links are merely pointers, and therefore seperate files. They will not have the same info as what they point to.
6. rm test.txt. Yes, both other files are still usable.
7. rm hard.txt. No, the symbolic link no longer works because the file it pointed to is no longer there.
8. Yes, sym.txt can be used again after creating a new hard.txt. This works because the link works be file name, not by inode info.
9. Mv hard.txt /home/ubuntu/Lab02/DirB/hard.txt No, the symbolic link will not work after the move because it links to /home/ubuntu/Lab02/DirA/hard.txt, and that file no longer exists.
10. rm sym.txt
11. ln /home/ubuntu/Lab02/DirB/hard.txt newsym.txt

Part 6.

1.	git init -b main
	git add .
	git commit -m "First commit"
	git remote add origin https://github.com:AdamHeight/Lab02.git
	git push origin main
I forgot to set up SSH keys before running this, so I had to troubleshoot for a while before I figured out why I couldn't push the project.
