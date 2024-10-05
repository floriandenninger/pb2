package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abfm implements axqr {
    private final /* synthetic */ int a;

    public abfm(int i) {
        this.a = i;
    }

    public static abfk a() {
        return new abfk();
    }

    public static Choreographer b() {
        Choreographer choreographer = Choreographer.getInstance();
        ayaw.k(choreographer);
        return choreographer;
    }

    public static acqn c() {
        return new acqn();
    }

    public static acqu d() {
        return new acqu();
    }

    public static acrj e() {
        return new acrj();
    }

    public static adyj f() {
        return new adyj();
    }

    public static ptk g() {
        return new ptk();
    }

    public static axfg h() {
        return new axfg();
    }

    public static aexw i() {
        return new aexw();
    }

    public static afey j() {
        return new afey();
    }

    public static affq k() {
        return new affq();
    }

    public static afgr l() {
        return new afgr(null);
    }

    public static aedn m() {
        return new aedn();
    }

    public static ajun n() {
        return new ajun((byte[]) null, (byte[]) null);
    }

    public static aedn o() {
        return new aedn();
    }

    public static adyu p() {
        return new adyu();
    }

    public static adyu q() {
        return new adyu();
    }

    public static adyu r() {
        return new adyu();
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                return r();
            case 2:
                throw null;
            case 3:
                return c();
            case 4:
                return d();
            case 5:
                return e();
            case 6:
                return new ajun((char[]) null);
            case 7:
                throw null;
            case 8:
                return f();
            case 9:
                return g();
            case 10:
                return h();
            case 11:
                return o();
            case 12:
                return m();
            case 13:
                return q();
            case 14:
                return p();
            case 15:
                return new aemc();
            case 16:
                return new agob(1);
            case 17:
                return i();
            case 18:
                return j();
            case 19:
                return k();
            default:
                return l();
        }
    }
}
