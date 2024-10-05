package org.chromium.base;

/* compiled from: PG */
@FunctionalInterface
/* loaded from: classes4.dex */
public interface Callback {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public abstract class Helper {
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.a();
        }

        static void onIntResultFromNative(Callback callback, int i) {
            callback.a();
        }

        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.a();
        }

        static void onTimeResultFromNative(Callback callback, long j) {
            callback.a();
        }

        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }

    void a();
}
