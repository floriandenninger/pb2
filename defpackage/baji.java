package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baji extends bajj {
    private static final long serialVersionUID = -9937958251642L;
    private final byte A;
    public final transient bajr a;
    public final transient bajr b;

    public baji(String str, byte b, bajr bajrVar, bajr bajrVar2) {
        super(str);
        this.A = b;
        this.a = bajrVar;
        this.b = bajrVar2;
    }

    private Object readResolve() {
        switch (this.A) {
            case 1:
                return bajj.c;
            case 2:
                return bajj.d;
            case 3:
                return bajj.e;
            case 4:
                return bajj.f;
            case 5:
                return bajj.g;
            case 6:
                return bajj.h;
            case 7:
                return bajj.i;
            case 8:
                return bajj.j;
            case 9:
                return bajj.k;
            case 10:
                return bajj.l;
            case 11:
                return bajj.m;
            case 12:
                return bajj.n;
            case 13:
                return bajj.o;
            case 14:
                return bajj.p;
            case 15:
                return bajj.q;
            case 16:
                return bajj.r;
            case 17:
                return bajj.s;
            case 18:
                return bajj.t;
            case 19:
                return bajj.u;
            case 20:
                return bajj.v;
            case 21:
                return bajj.w;
            case 22:
                return bajj.x;
            default:
                return bajj.y;
        }
    }

    @Override // defpackage.bajj
    public final bajh a(bajf bajfVar) {
        bajf d = bajk.d(bajfVar);
        switch (this.A) {
            case 1:
                return d.i();
            case 2:
                return d.y();
            case 3:
                return d.c();
            case 4:
                return d.x();
            case 5:
                return d.w();
            case 6:
                return d.h();
            case 7:
                return d.q();
            case 8:
                return d.f();
            case 9:
                return d.v();
            case 10:
                return d.u();
            case 11:
                return d.t();
            case 12:
                return d.g();
            case 13:
                return d.j();
            case 14:
                return d.l();
            case 15:
                return d.e();
            case 16:
                return d.d();
            case 17:
                return d.k();
            case 18:
                return d.o();
            case 19:
                return d.p();
            case 20:
                return d.r();
            case 21:
                return d.s();
            case 22:
                return d.m();
            default:
                return d.n();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof baji) && this.A == ((baji) obj).A;
    }

    public final int hashCode() {
        return 1 << this.A;
    }
}
