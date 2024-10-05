package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aees {
    public static final aeex a = new aeex(3, 2);
    public static final aeex b = new aeex(3, 1);
    public static final aeex c = new aeex(2160, 144);
    public final aeex d;
    public final aeex e;
    public final boolean f;
    public final String g;
    public final int h;
    public final int i;
    public final long j;
    public final int k;
    public final int l;
    public final afkm m;

    public aees(aeex aeexVar, aeex aeexVar2, boolean z, String str) {
        this(aeexVar, aeexVar2, z, str, -1, -2, -1L, Integer.MAX_VALUE, 0);
    }

    public final boolean a() {
        return (this.l & 32) > 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aees)) {
            return false;
        }
        aees aeesVar = (aees) obj;
        return amkq.b(this.d, aeesVar.d) && amkq.b(this.e, aeesVar.e) && amkq.b(this.g, aeesVar.g) && this.f == aeesVar.f;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() + 5363) * 31) + this.e.hashCode()) * 31) + (true != this.f ? 0 : 313);
    }

    public aees(aeex aeexVar, aeex aeexVar2, boolean z, String str, int i, int i2, long j, int i3, int i4) {
        this(aeexVar, aeexVar2, z, str, i, i2, j, i3, i4, null);
    }

    public aees(aeex aeexVar, aeex aeexVar2, boolean z, String str, int i, int i2, long j, int i3, int i4, afkm afkmVar) {
        afki.a(aeexVar);
        this.d = aeexVar;
        afki.a(aeexVar2);
        this.e = aeexVar2;
        this.f = z;
        this.g = str;
        this.h = i;
        this.i = i2;
        this.j = j;
        this.k = i3;
        this.l = i4;
        this.m = afkmVar;
    }
}
