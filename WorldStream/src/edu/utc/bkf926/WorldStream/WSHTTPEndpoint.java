package edu.utc.bkf926.WorldStream;

import com.sun.net.httpserver.*;

import java.io.IOException;
import java.net.InetSocketAddress;

public class WSHTTPEndpoint {
	
	static HttpServer server;

	public static void startServer() throws IOException{
		server = HttpServer.create(new InetSocketAddress(8000), 0);
		//create HTTP contexts for stream, download file, and world management
		server.setExecutor(null);
		server.start();
	}
	
}
