Name: Adam Height
Email: Height.4@Wright.edu

Part 1:

1. Python 3.6.9
2. curl -O https://repo.anaconda.com/archive/Anaconda3-2020.11-Linux-x86_64.sh
3. sha256sum Anaconda3-2020.11-Linux-x86_64.sh
	cf2ff493f11eaad5d09ce2b4feaa5ea90db5174303d5b3fe030e16d29aeef7de  Anaconda3-2020.11-Linux-x86_64.sh
4. tail -n +589 Anaconda3-2020.11-Linux-x86_64.sh | md5sum -
	a8f71d57955d4618ab3c1b02b963f667  - Yes, it matches.
5. bash Anaconda3-2020.11-Linux-x86_64.sh
6. /home/ubuntu/anaconda3
7. bashrc
8. Code to start Anaconda has been added. This includes adding the Anaconda folder to the PATH.
9. This is only fun when starting the shell, or when called.
10. source ~/.bashrc
11. 3.8.5

Part 2:

1. du -sh /home/ubuntu	3.8G
2. -c: create	-v: verbose	-f: designate file	-z: use gzip	-x: extract
3. tar -cvf lab10.tar space spring2021-ceg2350-AdamHeight
4. 560M
5. It is not human readable. I think that's machine code?
6. gzip lab10.tar
7. 559M, it is smaller. Not a lot, because I was actually using the space.
8. 2573ea5ee3c12645f40a84a16d014801	924511fa5724d9b92dfd3c0db21f0c682ec7d02d64ded24b628e8d10d9a269db
9. sftp -i /home/aheight/ceg2350-vmcert ubuntu@54.83.129.27
10. lcd /home/aheight	get lab10.tar.gz
11. They are the same as in number 8.
12. tar zxf lab10.tar.gz
13. Different machine, different key.

Part 3:

1. I'm just rawdogging the SSH command.
2. ssh-keygen
3. /home/aheight/.ssh
4. Public keys end in ".pub".
5. ssh -i /home/aheight/ceg2350-vmcert ubuntu@54.83.129.27
7. sftp put rsa token, then cat token >> authorized keys
8. ssh ubuntu@54.83.129.27

