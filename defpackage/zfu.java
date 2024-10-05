package defpackage;

import android.os.Looper;
import com.google.android.libraries.stitch.sslguard.SslGuardServerSocketFactory;
import com.google.android.libraries.stitch.sslguard.SslGuardSocketFactory;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.Security;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zfu {
    public static volatile boolean a = false;
    private static boolean d = false;
    public final Executor b;
    public final azrw c;
    private final boolean e;
    private final aloh f;
    private final aloh g;

    public zfu(boolean z, azrw azrwVar, Executor executor, aloh alohVar, aloh alohVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = z;
        this.c = azrwVar;
        this.b = executor;
        this.g = alohVar;
        this.f = alohVar2;
    }

    public final void a() {
        if (a) {
            return;
        }
        synchronized (zfu.class) {
            if (a) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    zga.b("Blocking main thread on ProviderInstaller.");
                }
                if (this.e && !d) {
                    final amnv x = amkq.x(new amnv() { // from class: zfr
                        @Override // defpackage.amnv
                        public final Object get() {
                            return ((CronetEngine) zfu.this.c.get()).createURLStreamHandlerFactory();
                        }
                    });
                    URL.setURLStreamHandlerFactory(new URLStreamHandlerFactory() { // from class: zft
                        @Override // java.net.URLStreamHandlerFactory
                        public final URLStreamHandler createURLStreamHandler(String str) {
                            return ((URLStreamHandlerFactory) amnv.this.get()).createURLStreamHandler(str);
                        }
                    });
                    d = true;
                }
                if (this.e) {
                    aloh alohVar = this.f;
                    vch vchVar = new vch(new vcj());
                    vci vciVar = new vci(alohVar.a);
                    synchronized (vch.a) {
                        if (vci.a != null) {
                            int i = vci.a.c;
                        } else {
                            vci.a = vciVar;
                            if (vch.b == null) {
                                vch.b = new vcl();
                            }
                            if (Security.insertProviderAt(vch.b, 1) == 1) {
                                SslGuardSocketFactory.a(vchVar.c);
                                SslGuardServerSocketFactory.a(vchVar.c);
                                vch.b();
                                vch.a();
                            } else {
                                throw new RuntimeException("Failed to install SslGuard with top priority.");
                            }
                        }
                    }
                } else {
                    rok.a(this.g.a);
                }
                a = true;
            } catch (qnk | qnl e) {
                zga.n("ProviderInstaller failed.", e);
                a = true;
            }
        }
    }
}
