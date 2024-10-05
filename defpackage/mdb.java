package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdb {
    public final int a;
    private final mda b;

    public mdb(mda mdaVar, int i) {
        this.b = mdaVar;
        this.a = i;
    }

    public final int a() {
        mda mdaVar = this.b;
        return ((Integer) mdaVar.a.get(this.a)).intValue();
    }
}
