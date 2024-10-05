package com.google.android.libraries.stitch.sslguard;

import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SslGuardContextImpl extends SSLContextSpi {
    @Override // javax.net.ssl.SSLContextSpi
    public final SSLEngine engineCreateSSLEngine() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLEngine engineCreateSSLEngine(String str, int i) {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final /* bridge */ /* synthetic */ SSLSessionContext engineGetClientSessionContext() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final /* bridge */ /* synthetic */ SSLSessionContext engineGetServerSessionContext() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLServerSocketFactory engineGetServerSocketFactory() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLSocketFactory engineGetSocketFactory() {
        return new SslGuardSocketFactory();
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
    }
}
