package com.tycrek.proxy.network.client;

import io.netty.channel.Channel;
import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.geysermc.mcprotocollib.network.ClientSession;
import org.geysermc.mcprotocollib.network.Flag;
import org.geysermc.mcprotocollib.network.ProxyInfo;
import org.geysermc.mcprotocollib.network.compression.CompressionConfig;
import org.geysermc.mcprotocollib.network.crypt.EncryptionConfig;
import org.geysermc.mcprotocollib.network.event.session.SessionEvent;
import org.geysermc.mcprotocollib.network.event.session.SessionListener;
import org.geysermc.mcprotocollib.network.packet.Packet;
import org.geysermc.mcprotocollib.protocol.MinecraftProtocol;

import java.net.SocketAddress;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

public class CSession implements ClientSession {
    @Override
    public void connect() {
        ClientSession.super.connect();
    }

    @Override
    public void connect(boolean wait) {
        
    }

    @Override
    public @Nullable ProxyInfo getProxy() {
        return null;
    }

    @Override
    public SocketAddress getLocalAddress() {
        return null;
    }

    @Override
    public SocketAddress getRemoteAddress() {
        return null;
    }

    @Override
    public MinecraftProtocol getPacketProtocol() {
        return null;
    }

    @Override
    public Map<String, Object> getFlags() {
        return Map.of();
    }

    @Override
    public boolean hasFlag(Flag<?> flag) {
        return false;
    }

    @Override
    public <T> T getFlag(Flag<T> flag) {
        return ClientSession.super.getFlag(flag);
    }

    @Override
    public <T> T getFlag(Flag<T> flag, T def) {
        return ClientSession.super.getFlag(flag, def);
    }

    @Override
    public <T> T getFlagSupplied(Flag<T> flag, Supplier<T> defSupplier) {
        return null;
    }

    @Override
    public <T> void setFlag(Flag<T> flag, T value) {

    }

    @Override
    public void setFlags(Map<String, Object> flags) {

    }

    @Override
    public List<SessionListener> getListeners() {
        return List.of();
    }

    @Override
    public void addListener(SessionListener listener) {

    }

    @Override
    public void removeListener(SessionListener listener) {

    }

    @Override
    public void callEvent(SessionEvent event) {

    }

    @Override
    public void callPacketReceived(Packet packet) {

    }

    @Override
    public void callPacketSent(Packet packet) {

    }

    @Override
    public void setCompression(@Nullable CompressionConfig compressionConfig) {

    }

    @Override
    public void setEncryption(@Nullable EncryptionConfig encryptionConfig) {

    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public void send(@NonNull Packet packet) {
        ClientSession.super.send(packet);
    }

    @Override
    public void send(@NonNull Packet packet, @Nullable Runnable onSent) {

    }

    @Override
    public void disconnect(@NonNull String reason) {
        ClientSession.super.disconnect(reason);
    }

    @Override
    public void disconnect(@NonNull String reason, @Nullable Throwable cause) {
        ClientSession.super.disconnect(reason, cause);
    }

    @Override
    public void disconnect(@NonNull Component reason) {
        ClientSession.super.disconnect(reason);
    }

    @Override
    public void disconnect(@NonNull Component reason, @Nullable Throwable cause) {

    }

    @Override
    public void setAutoRead(boolean autoRead) {

    }

    @Override
    public Channel getChannel() {
        return null;
    }

    @Override
    public Executor getPacketHandlerExecutor() {
        return null;
    }

    @Override
    public void switchInboundState(Runnable switcher) {
        ClientSession.super.switchInboundState(switcher);
    }

    @Override
    public void switchOutboundState(Runnable switcher) {
        ClientSession.super.switchOutboundState(switcher);
    }
}
