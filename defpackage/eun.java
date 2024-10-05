package defpackage;

import android.content.Context;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eun {
    public boolean a;

    public eun() {
        this.a = false;
    }

    public eun(Context context) {
    }

    public eun(byte[] bArr) {
    }

    public eun(char[] cArr) {
    }

    public final synchronized void a() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        if (j > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + elapsedRealtime;
            if (j2 < elapsedRealtime) {
                a();
            } else {
                while (!this.a && elapsedRealtime < j2) {
                    wait(j2 - elapsedRealtime);
                    elapsedRealtime = SystemClock.elapsedRealtime();
                }
            }
            return this.a;
        }
        return this.a;
    }

    public final synchronized boolean d() {
        return this.a;
    }

    public final synchronized boolean e() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public final synchronized void f() {
        this.a = false;
    }
}
