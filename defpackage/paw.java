package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class paw extends pbb {
    final int a;
    final long b;
    final List c;

    public paw(pas pasVar, long j, long j2, int i, long j3, List list) {
        super(pasVar, j, j2);
        this.a = i;
        this.b = j3;
        this.c = list;
    }

    public abstract int a(long j);

    public final long b(int i) {
        List list = this.c;
        return pgz.i(list != null ? ((paz) list.get(i - this.a)).a - this.h : (i - this.a) * this.b, 1000000L, this.g);
    }

    public abstract pas c(pav pavVar, int i);

    public boolean d() {
        return this.c != null;
    }
}
