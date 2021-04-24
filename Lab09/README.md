Name: Adam Height
Email: Height.4@Wright.edu

Part 1:

1. Intel(R) Ethernet Connection (7) I219-V
2. 04-92-26-C3-7E-51
3. DESKTOP-O944G35
4. 192.168.0.2
5. 255.255.255.0
6. 192.168.0.1
7. Public
8. eth0
9. 16:d4:f0:e8:84:cd
10. ip-10-0-0-25
11. 10.0.0.25
12. 255.255.255.0
13. 10.0.0.1
14. 54.83.129.27
15. 54.83.129.27

Part 2:

1. pip install jupyterlab
2. curl: (7) Failed to connect to localhost port 8888: Connection refused
3. [I 03:29:27.449 NotebookApp] Writing notebook server cookie secret to /home/ubuntu/.local/share/jupyter/runtime/notebook_cookie_secret
[I 03:29:27.707 NotebookApp] Serving notebooks from local directory: /home/ubuntu/spring2021-ceg2350-AdamHeight
[I 03:29:27.708 NotebookApp] Jupyter Notebook 6.3.0 is running at:
[I 03:29:27.708 NotebookApp] http://localhost:8888/?token=e210fbbcc996e26b64e458ef9c13edcc06d1166aaba66a69
[I 03:29:27.708 NotebookApp]  or http://127.0.0.1:8888/?token=e210fbbcc996e26b64e458ef9c13edcc06d1166aaba66a69
[I 03:29:27.708 NotebookApp] Use Control-C to stop this server and shut down all kernels (twice to skip confirmation).
[C 03:29:27.712 NotebookApp]

    To access the notebook, open this file in a browser:
        file:///home/ubuntu/.local/share/jupyter/runtime/nbserver-9487-open.html
    Or copy and paste one of these URLs:
        http://localhost:8888/?token=e210fbbcc996e26b64e458ef9c13edcc06d1166aaba66a69
     or http://127.0.0.1:8888/?token=e210fbbcc996e26b64e458ef9c13edcc06d1166aaba66a69
5. c3e59e3bfc09334235efaf2c6a4ae3d11f83550d2298792e
6. -N - Do not execute a remote command	-f - Push SSH to background	-i - Specifies non-standard ID file	-L - Declares port forwarding

Part 3:

1. apt install python3-pip	pip install http
3. sudo lsof -i -P -n | grep LISTEN

sshd        848            root    3u  IPv4  20704      0t0  TCP *:22 (LISTEN)
sshd        848            root    4u  IPv6  20715      0t0  TCP *:22 (LISTEN)
systemd-r  2013 systemd-resolve   13u  IPv4 235581      0t0  TCP 127.0.0.53:53 (LISTEN)
python3   15317          ubuntu    3u  IPv4 811867      0t0  TCP *:4444 (LISTEN)
4. sudo kill -9 15317
