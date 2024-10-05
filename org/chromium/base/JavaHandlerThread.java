package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import defpackage.badt;
import defpackage.badu;
import defpackage.badv;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class JavaHandlerThread {
    public final HandlerThread a;
    public Throwable b;

    public JavaHandlerThread(String str, int i) {
        this.a = new HandlerThread(str, i);
    }

    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    private Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }

    private boolean isAlive() {
        return this.a.isAlive();
    }

    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.a.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.a.setUncaughtExceptionHandler(new badv(this));
    }

    private void quitThreadSafely(long j) {
        new Handler(this.a.getLooper()).post(new badu(this, j));
        this.a.getLooper().quitSafely();
    }

    private void startAndInitialize(long j, long j2) {
        if (this.a.getState() == Thread.State.NEW) {
            this.a.start();
        }
        new Handler(this.a.getLooper()).post(new badt(j, j2));
    }
}
