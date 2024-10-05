package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajbp implements axqr {
    private final /* synthetic */ int a;

    public ajbp(int i) {
        this.a = i;
    }

    public static aixl a() {
        return new aixl();
    }

    public static ajap b() {
        return new ajap();
    }

    public static ajjv c() {
        ajjv ajjvVar = ajjv.a;
        ayaw.k(ajjvVar);
        return ajjvVar;
    }

    public static akno d() {
        return new akno();
    }

    public static akqn e() {
        return new akqn();
    }

    public static Boolean f() {
        return true;
    }

    public static ames g(ammv ammvVar, ames amesVar) {
        if (ammvVar.h()) {
            return new ames(ammvVar);
        }
        amesVar.getClass();
        return amesVar;
    }

    public static anev h() {
        aneu aneuVar = aneu.a;
        ayaw.k(aneuVar);
        return aneuVar;
    }

    public static Application i(axqi axqiVar) {
        Application m = axfq.m(axqiVar.a);
        ayaw.k(m);
        return m;
    }

    public static ahbl j() {
        return new ahbl();
    }

    public static akbc k() {
        return new akbc();
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                return b();
            case 2:
                return j();
            case 3:
                return ajgj.e();
            case 4:
                return ajgj.z();
            case 5:
                return c();
            case 6:
                return d();
            case 7:
                return k();
            case 8:
                return e();
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                return h();
            default:
                throw null;
        }
    }
}
