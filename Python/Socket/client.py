# code the client
import socket


# creating a client socket.
c = socket.socket()
print('socket created for client')

# client will not bind host with port
# this job is for server.


# connect function connects client with server
# it takes 1 tuple as argument:
	#tuple contain 2 things:
		#1. IP address or host whom to connect with
		#2. port number
ip = input('IP address : ')
if ip == '':
	ip = 'localhost'
port=input('choose a Port number : ')

if port == '':
	port_number = 9999
else:
	port_number = int(port)
#c.connect((,9996))
c.connect((ip, port_number))
print('connected with server')

# sending name to server
name=input('enter user name : ')
c.send(bytes(name,'utf-8'))



# data received from client.
	# here 1024 is buffer size

# recv() function receives data from server in bytes
data_recived = c.recv(1024)
# decode() function convert bytes to string
decoded_data = data_recived.decode()
print('data received is : ')
print(decoded_data)


c.close()
