package com.bilgeadam.melih.sockets.hw20211019;

public class PortAndIpClass {
    private int port;
    private String ip; //127.0.0.1 / localhost

    public PortAndIpClass(int port) {
        this.port = port;
    }

    public PortAndIpClass(int port, String ip) {
        this.port = port;
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }
}
