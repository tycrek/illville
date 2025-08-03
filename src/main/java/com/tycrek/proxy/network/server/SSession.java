package com.tycrek.proxy.network.server;

import io.netty.channel.Channel;
import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.geysermc.mcprotocollib.network.Flag;
import org.geysermc.mcprotocollib.network.ServerSession;
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

public class SSession implements ServerSession {
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
        return ServerSession.super.getFlag(flag);
    }

    @Override
    public <T> T getFlag(Flag<T> flag, T def) {
        return ServerSession.super.getFlag(flag, def);
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
        ServerSession.super.send(packet);
    }

    @Override
    public void send(@NonNull Packet packet, @Nullable Runnable onSent) {

    }

    @Override
    public void disconnect(@NonNull String reason) {
        ServerSession.super.disconnect(reason);
    }

    @Override
    public void disconnect(@NonNull String reason, @Nullable Throwable cause) {
        ServerSession.super.disconnect(reason, cause);
    }

    @Override
    public void disconnect(@NonNull Component reason) {
        ServerSession.super.disconnect(reason);
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
        ServerSession.super.switchInboundState(switcher);
    }

    @Override
    public void switchOutboundState(Runnable switcher) {
        ServerSession.super.switchOutboundState(switcher);
    }
}
