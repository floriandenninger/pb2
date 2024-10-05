package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aezh {
    public final aezf a;
    public final aeeu b;
    public final aenk c;
    public final boolean d;
    public final int e;

    public aezh(aezf aezfVar, aeeu aeeuVar, int i, boolean z) {
        this(aezfVar, aeeuVar, i, z && aeeuVar.a.length > 0, aenk.a);
    }

    private aezh(aezf aezfVar, aeeu aeeuVar, int i, boolean z, aenk aenkVar) {
        this.a = aezfVar;
        this.b = aeeuVar;
        this.e = i;
        this.d = z;
        this.c = aenkVar;
    }

    public final aezh a(aenk aenkVar) {
        return new aezh(this.a, this.b, this.e, this.d, aenkVar);
    }
}
