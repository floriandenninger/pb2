package com.google.android.libraries.performance.primes.metrics.crash;

import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import defpackage.ammv;
import defpackage.amna;
import defpackage.amxh;
import defpackage.amxj;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aosj;
import defpackage.azrw;
import defpackage.bach;
import defpackage.uqg;
import defpackage.uqk;
import defpackage.uql;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NativeCrashHandlerImpl implements uql {
    private static final amxj c = amxj.l("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl");
    final CountDownLatch a = new CountDownLatch(1);
    final CountDownLatch b = new CountDownLatch(1);
    private boolean d;
    private final ammv e;

    public NativeCrashHandlerImpl(ammv ammvVar) {
        this.e = ammvVar;
    }

    private static native ByteBuffer awaitSignal();

    static native void doDiscardNativeCrashes();

    private static native boolean initializeSignalHandler();

    private static native void unblockSignalHandler();

    @Override // defpackage.uql
    public final synchronized void a(final uqg uqgVar) {
        if (this.d) {
            return;
        }
        this.d = true;
        Thread thread = new Thread(new Runnable() { // from class: uqm
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandlerImpl.this.b(uqgVar);
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    public final /* synthetic */ void b(uqg uqgVar) {
        if (!((Boolean) ((azrw) ((amna) this.e).a).get()).booleanValue()) {
            this.b.countDown();
            return;
        }
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler()) {
                ((amxh) ((amxh) c.g()).i("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "lambda$initialize$0", 62, "NativeCrashHandlerImpl.java")).q("unable to initialize signal handler");
                return;
            }
            try {
                this.a.countDown();
                ByteBuffer awaitSignal = awaitSignal();
                aosj aosjVar = null;
                if (awaitSignal != null) {
                    try {
                        aosjVar = (aosj) aonm.parseFrom(aosj.a, awaitSignal, aomw.a());
                    } catch (Throwable unused) {
                    }
                }
                aone h = ((uqk) uqgVar).h();
                h.copyOnWrite();
                bach bachVar = (bach) h.instance;
                bach bachVar2 = bach.a;
                bachVar.g = 5;
                bachVar.b |= 16;
                if (aosjVar != null) {
                    h.copyOnWrite();
                    bach bachVar3 = (bach) h.instance;
                    bachVar3.j = aosjVar;
                    bachVar3.b |= 512;
                }
                ((uqk) uqgVar).g((bach) h.build());
            } finally {
                unblockSignalHandler();
            }
        } catch (UnsatisfiedLinkError e) {
            ((amxh) ((amxh) ((amxh) c.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "lambda$initialize$0", ':', "NativeCrashHandlerImpl.java")).q("unable to load native_crash_handler_jni");
        }
    }
}
