package com.wurq.dex.monitorapp.java_websocket.handshake;

public interface ClientHandshakeBuilder extends HandshakeBuilder, ClientHandshake {
	public void setResourceDescriptor(String resourceDescriptor);
}
