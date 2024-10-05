package com.google.android.libraries.stitch.sslguard;

import android.util.Log;
import defpackage.vci;
import defpackage.vck;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SslGuardSocketFactory extends SSLSocketFactory {
    private static final String a = "SslGuardSocketFactory";
    private static vck b;

    public static void a(vck vckVar) {
        if (vckVar == null) {
            throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
        }
        b = vckVar;
    }

    private static final SSLSocketFactory b() {
        try {
            return SSLContext.getInstance("Default").getSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static final SSLSocketFactory c() {
        int i = vci.a.c;
        b.a(vci.a);
        SSLSocketFactory b2 = b();
        if (!(b2 instanceof SslGuardSocketFactory)) {
            return b2;
        }
        String str = "[";
        for (Provider provider : Security.getProviders()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(provider.toString());
            String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            if (provider.stringPropertyNames().contains("SSLContext.Default")) {
                str = String.valueOf(concat).concat("(true), ");
            } else {
                str = String.valueOf(concat).concat("(false), ");
            }
        }
        Log.e(a, String.valueOf(str).concat("]"));
        throw new RuntimeException("Unable to find a default SSL provider.");
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return c().createSocket();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return c().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return c().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return c().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return c().createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return c().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return c().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return c().createSocket(socket, str, i, z);
    }
}
