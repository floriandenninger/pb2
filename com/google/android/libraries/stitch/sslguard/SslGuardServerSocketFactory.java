package com.google.android.libraries.stitch.sslguard;

import android.util.Log;
import defpackage.vci;
import defpackage.vck;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SslGuardServerSocketFactory extends SSLServerSocketFactory {
    private static final String a = SslGuardSocketFactory.class.getSimpleName();
    private static vck b;

    public static void a(vck vckVar) {
        if (vckVar == null) {
            throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
        }
        b = vckVar;
    }

    private static final SSLServerSocketFactory b() {
        try {
            return SSLContext.getInstance("Default").getServerSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static final SSLServerSocketFactory c() {
        int i = vci.a.c;
        b.a(vci.a);
        SSLServerSocketFactory b2 = b();
        if (!(b2 instanceof SslGuardServerSocketFactory)) {
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

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) {
        return c().createServerSocket(i);
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return c().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return c().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) {
        return c().createServerSocket(i, i2);
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return c().createServerSocket(i, i2, inetAddress);
    }
}
