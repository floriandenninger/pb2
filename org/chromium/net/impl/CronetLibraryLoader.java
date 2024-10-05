package org.chromium.net.impl;

import J.N;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import defpackage.ayeq;
import defpackage.badx;
import defpackage.bage;
import defpackage.bagg;
import defpackage.baik;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CronetLibraryLoader {
    private static final String b = "cronet.95.0.4621.2";
    private static final String c = "CronetLibraryLoader";
    private static volatile boolean f;
    private static final Object a = new Object();
    private static final HandlerThread d = new HandlerThread("CronetInit");
    private static volatile boolean e = false;
    private static final ConditionVariable g = new ConditionVariable();

    public static void a(Context context, bage bageVar) {
        synchronized (a) {
            if (!f) {
                ayeq.a = context;
                HandlerThread handlerThread = d;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                c(new bagg());
            }
            if (!e) {
                if (bageVar.b() != null) {
                    bageVar.b().loadLibrary(b);
                } else {
                    System.loadLibrary(b);
                }
                if (!"95.0.4621.2".equals(N.M6xubM8G())) {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", "95.0.4621.2", N.M6xubM8G()));
                }
                badx.e(c, "Cronet version: %s, arch: %s", "95.0.4621.2", System.getProperty("os.arch"));
                e = true;
                g.open();
            }
        }
    }

    public static void b() {
        if (f) {
            return;
        }
        NetworkChangeNotifier.init();
        NetworkChangeNotifier.registerToReceiveNotificationsAlways();
        g.block();
        N.MROCxiBo();
        f = true;
    }

    public static void c(Runnable runnable) {
        HandlerThread handlerThread = d;
        if (handlerThread.getLooper() != Looper.myLooper()) {
            new Handler(handlerThread.getLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    private static void ensureInitializedFromNative() {
        synchronized (a) {
            e = true;
            g.open();
        }
        a(ayeq.a, null);
    }

    private static String getDefaultUserAgent() {
        return baik.a(ayeq.a);
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }
}
