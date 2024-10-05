package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bakp extends bakm {
    public static final bajh A;
    public static final bajh B;
    public static final bajh C;
    public static final bajh D;
    public static final bajh E;
    public static final bajp n;
    public static final bajp o;
    public static final bajp p;
    public static final bajp q;
    public static final bajp r;
    public static final bajp s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final bajp t;
    public static final bajh u;
    public static final bajh v;
    public static final bajh w;
    public static final bajh x;
    public static final bajh y;
    public static final bajh z;
    public final int F;
    private final transient aeqp[] G;

    static {
        bajp bajpVar = balr.a;
        n = bajpVar;
        balv balvVar = new balv(bajr.k, 1000L);
        o = balvVar;
        balv balvVar2 = new balv(bajr.j, 60000L);
        p = balvVar2;
        balv balvVar3 = new balv(bajr.i, 3600000L);
        q = balvVar3;
        balv balvVar4 = new balv(bajr.h, 43200000L);
        r = balvVar4;
        balv balvVar5 = new balv(bajr.g, 86400000L);
        s = balvVar5;
        t = new balv(bajr.f, 604800000L);
        u = new balt(bajj.y, bajpVar, balvVar);
        v = new balt(bajj.x, bajpVar, balvVar5);
        w = new balt(bajj.w, balvVar, balvVar2);
        x = new balt(bajj.v, balvVar, balvVar5);
        y = new balt(bajj.u, balvVar2, balvVar3);
        z = new balt(bajj.t, balvVar2, balvVar5);
        balt baltVar = new balt(bajj.s, balvVar3, balvVar5);
        A = baltVar;
        balt baltVar2 = new balt(bajj.p, balvVar3, balvVar4);
        B = baltVar2;
        C = new bama(baltVar, bajj.r);
        D = new bama(baltVar2, bajj.q);
        E = new bako();
    }

    public bakp(bajf bajfVar, int i) {
        super(bajfVar, null);
        this.G = new aeqp[1024];
        this.F = i;
    }

    @Override // defpackage.bakm
    protected void N(bakl baklVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O(long j, int i, int i2) {
        return ((int) ((j - (ae(i) + ac(i, i2))) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int P(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Q(long j, int i) {
        return ((int) ((j - ae(i)) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int R(long j) {
        int Z = Z(j);
        return S(Z, U(j, Z));
    }

    public abstract int S(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int T(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public abstract int U(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int V(long j) {
        return W(j, Z(j));
    }

    final int W(long j, int i) {
        long ab = ab(i);
        if (j < ab) {
            return X(i - 1);
        }
        if (j >= ab(i + 1)) {
            return 1;
        }
        return ((int) ((j - ab) / 604800000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int X(int i) {
        return (int) ((ab(i + 1) - ab(i)) / 604800000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Y(long j) {
        int Z = Z(j);
        int W = W(j, Z);
        if (W == 1) {
            return Z(j + 604800000);
        }
        return W > 51 ? Z(j - 1209600000) : Z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Z(long j) {
        long j2 = (j >> 1) + 31083597720000L;
        if (j2 < 0) {
            j2 -= 15778475999L;
        }
        int i = (int) (j2 / 15778476000L);
        long ae = ae(i);
        long j3 = j - ae;
        if (j3 < 0) {
            return i - 1;
        }
        if (j3 >= 31536000000L) {
            return ae + (true == ai(i) ? 31622400000L : 31536000000L) > j ? i : i + 1;
        }
        return i;
    }

    public abstract long aa(int i);

    final long ab(int i) {
        long ae = ae(i);
        return P(ae) > 8 - this.F ? ae + ((8 - r8) * 86400000) : ae - ((r8 - 1) * 86400000);
    }

    public abstract long ac(int i, int i2);

    public abstract long ad(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ae(int i) {
        int i2 = i & 1023;
        aeqp aeqpVar = this.G[i2];
        if (aeqpVar == null || aeqpVar.b != i) {
            aeqpVar = new aeqp(i, aa(i), (char[]) null);
            this.G[i2] = aeqpVar;
        }
        return aeqpVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long af(int i, int i2, int i3) {
        return ae(i) + ac(i, i2) + ((i3 - 1) * 86400000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ag(int i, int i2) {
        return ae(i) + ac(i, i2);
    }

    public abstract long ah(long j, int i);

    public abstract boolean ai(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bakp bakpVar = (bakp) obj;
            if (this.F == bakpVar.F && z().equals(bakpVar.z())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + z().hashCode() + this.F;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        bajn z2 = z();
        if (z2 != null) {
            sb.append(z2.c);
        }
        if (this.F != 4) {
            sb.append(",mdfw=");
            sb.append(this.F);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.bakm, defpackage.bajf
    public final bajn z() {
        bajf bajfVar = this.a;
        return bajfVar != null ? bajfVar.z() : bajn.a;
    }
}
