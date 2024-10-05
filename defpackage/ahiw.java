package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahiw extends HandlerThread {
    public Handler a;
    public final List b;
    public long c;
    public long d;
    public ahjq e;
    public long f;
    public boolean g;
    public final Runnable h;
    public volatile boolean i;
    public long j;
    public long k;
    public long l;
    public final Handler m;
    public final afgr n;

    public ahiw(Handler handler, afgr afgrVar) {
        super("ahiw");
        this.b = new ArrayList();
        this.c = -1L;
        this.d = 0L;
        this.e = null;
        this.f = 0L;
        this.g = false;
        this.i = false;
        this.j = 0L;
        this.k = System.currentTimeMillis();
        this.l = -1L;
        this.m = handler;
        this.n = afgrVar;
        this.h = new ahit(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(byte[] bArr, byte b) {
        int i = 0;
        byte b2 = b;
        while (true) {
            byte b3 = bArr[i];
            if (b3 == b || i >= 256) {
                break;
            }
            bArr[i] = b2;
            i++;
            b2 = b3;
        }
        bArr[i] = b2;
        return (byte) i;
    }

    public final void b(byte[] bArr, long j) {
        long j2 = this.c;
        if (j2 == -1) {
            this.c = j;
            j2 = j;
        }
        this.d = j - j2;
        this.b.add(bArr);
    }

    public final void c(long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.postDelayed(this.h, j);
        }
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        super.start();
        this.a = new Handler(getLooper());
        c(30000L);
    }
}
