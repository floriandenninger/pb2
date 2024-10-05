package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bme {
    public final bjc a;
    public final byte[] d;
    public int e;
    public long f;
    public boolean g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public final boolean b = false;
    public final boolean c = false;
    private final SparseArray n = new SparseArray();
    private final SparseArray o = new SparseArray();
    public final jg m = new jg();

    public bme(bjc bjcVar) {
        this.a = bjcVar;
        byte[] bArr = new byte[128];
        this.d = bArr;
        new pti(bArr, 0, 0);
        b();
    }

    public final void a(pta ptaVar) {
        this.n.append(ptaVar.d, ptaVar);
    }

    public final void b() {
        this.g = false;
        this.i = false;
    }

    public final void c(dsm dsmVar) {
        this.o.append(dsmVar.c, dsmVar);
    }
}
