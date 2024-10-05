package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclw {
    public final Handler a;
    public final long b;
    public final long c;
    public final long d;
    public long e = Long.MIN_VALUE;
    public final Runnable f;
    public boolean g;
    public final acny h;

    public aclw(aclv aclvVar, acny acnyVar, Handler handler) {
        aclu acluVar = new aclu(this);
        this.f = acluVar;
        this.h = acnyVar;
        handler.getClass();
        this.a = handler;
        amkq.E(true);
        this.b = TimeUnit.SECONDS.toMillis(1L) / 15;
        long nanos = TimeUnit.SECONDS.toNanos(1L) / 30;
        this.c = nanos;
        this.d = (nanos * 10) / 100;
        aclvVar.a = new aclt(acluVar);
    }

    public final void a() {
        this.g = false;
    }
}
