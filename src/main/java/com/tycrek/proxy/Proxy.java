package com.tycrek.proxy;

import com.tycrek.proxy.network.client.CSession;
import com.tycrek.proxy.network.server.SListener;
import com.tycrek.proxy.network.server.SServer;

public class Proxy {
    private SServer server;
    private CSession client;
    
    public void startMaybe() {
        server.addListener(new SListener());
        server.bind();
    }
}
