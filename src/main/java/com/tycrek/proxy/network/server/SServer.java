package com.tycrek.proxy.network.server;

import org.geysermc.mcprotocollib.network.Flag;
import org.geysermc.mcprotocollib.network.Server;
import org.geysermc.mcprotocollib.network.Session;
import org.geysermc.mcprotocollib.network.event.server.ServerListener;
import org.geysermc.mcprotocollib.network.server.AbstractServer;
import org.geysermc.mcprotocollib.protocol.MinecraftProtocol;

import java.net.SocketAddress;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class SServer implements Server {
    @Override
    public SocketAddress getBindAddress() {
        return null;
    }

    @Override
    public Supplier<? extends MinecraftProtocol> getPacketProtocol() {
        return null;
    }

    @Override
    public boolean isListening() {
        return false;
    }

    @Override
    public Map<String, Object> getGlobalFlags() {
        return Map.of();
    }

    @Override
    public boolean hasGlobalFlag(Flag<?> flag) {
        return false;
    }

    @Override
    public <T> T getGlobalFlag(Flag<T> flag) {
        return Server.super.getGlobalFlag(flag);
    }

    @Override
    public <T> T getGlobalFlag(Flag<T> flag, T def) {
        return Server.super.getGlobalFlag(flag, def);
    }

    @Override
    public <T> T getGlobalFlagSupplied(Flag<T> flag, Supplier<T> defSupplier) {
        return null;
    }

    @Override
    public <T> void setGlobalFlag(Flag<T> flag, T value) {

    }

    @Override
    public List<ServerListener> getListeners() {
        return List.of();
    }

    @Override
    public void addListener(ServerListener listener) {

    }

    @Override
    public void removeListener(ServerListener listener) {

    }

    @Override
    public List<Session> getSessions() {
        return List.of();
    }

    @Override
    public AbstractServer bind() {
        return null;
    }

    @Override
    public AbstractServer bind(boolean wait) {
        return null;
    }

    @Override
    public AbstractServer bind(boolean wait, Runnable callback) {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void close(boolean wait) {

    }

    @Override
    public void close(boolean wait, Runnable callback) {

    }
}
