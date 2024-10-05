package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yxr {
    public long[] a;
    public long[] b;
    public Boolean c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public ScheduledFuture h;

    public yxr() {
    }

    public yxr(yxs yxsVar) {
        this.a = yxsVar.a;
        this.b = yxsVar.b;
        this.c = Boolean.valueOf(yxsVar.c);
        this.d = Integer.valueOf(yxsVar.d);
        this.e = Integer.valueOf(yxsVar.e);
        this.f = Integer.valueOf(yxsVar.f);
        this.g = Integer.valueOf(yxsVar.g);
        this.h = yxsVar.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        Integer num = this.e;
        if (num == null) {
            throw new IllegalStateException("Property \"shutdownLikely\" has not been set");
        }
        return yxs.b(num.intValue());
    }

    public final int b() {
        Integer num = this.d;
        if (num == null) {
            throw new IllegalStateException("Property \"disposed\" has not been set");
        }
        return num.intValue();
    }

    public final int c() {
        Integer num = this.g;
        if (num == null) {
            throw new IllegalStateException("Property \"serialDelaySec\" has not been set");
        }
        return num.intValue();
    }

    public final void d(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void e(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void f(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void g(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void h(long[] jArr) {
        if (jArr == null) {
            throw new NullPointerException("Null serialized");
        }
        this.b = jArr;
    }

    public final void i(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void j(long[] jArr) {
        if (jArr == null) {
            throw new NullPointerException("Null active");
        }
        this.a = jArr;
    }
}
