# coding the server
import socket

'''
socket function of socket module is used to create
sockets it takes 2 parameters 
1 type of socket:
	IPv4
	IPv6
2. type of Network:
	TCP
	UDP
by default these parameters are set to IPv4 and TCP.
'''

s = socket.socket()
print('socket created')

# bind the socket with a IP address and port number
## remember bind() takes tuple as an argument
port=input('choose a Port number : ')

if port == '':
	port_number = 9999
else:
	port_number = int(port)
s.bind(('localhost',port_number))
print('local host bound with port : '+str(port_number))
'''
port number range (0 to 65535)
is usually all the port number in 1000s are busy..
'''

number_of_clients=3
# waiting for clients to request
s.listen(1)
print('waiting for the clients')
counter = 0
while True:
	counter += 1
	'''
	accept() function accepts request by the client
	and return 2 things 
	1. connection
	2. address of client
	'''
	c, address= s.accept()
	# recieving Data from client
	client_s_name = c.recv(1024).decode()
	print(str(counter)+'. connected to '+str(address),client_s_name)


	# send()bfunction to send message to clients:
		# bytes() function convert string to bytes form.
			# we can only send message in byte form.
			# and we also have to mention the format i.e. (utf-8) format
	c.send(bytes('welcome to server '+client_s_name,'utf-8'))
	print('	welcome message sent to the ',client_s_name)
	
	# finally it is important
	# to close socket after all stuff
	# using close() function.
	c.close()
	
	
	
	
	
# Port number of client will be generated automatically.
