package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pel {
    public final pcn a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public long f;
    public long g;
    public boolean h;
    private final SparseArray j = new SparseArray();
    private final SparseArray k = new SparseArray();
    public final opn i = new opn();

    public pel(pcn pcnVar) {
        this.a = pcnVar;
        b();
    }

    public final void a(pgu pguVar) {
        this.j.append(pguVar.a, pguVar);
    }

    public final void b() {
        this.e = false;
    }

    public final void c(dsm dsmVar) {
        this.k.append(dsmVar.c, dsmVar);
    }
}
