package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawj implements axqr {
    private final azrw a;
    private final /* synthetic */ int b;

    public aawj(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public static aawj A(azrw azrwVar) {
        return new aawj(azrwVar, 15);
    }

    public static aawj B(azrw azrwVar) {
        return new aawj(azrwVar, 16);
    }

    public static aawj C(azrw azrwVar) {
        return new aawj(azrwVar, 17);
    }

    public static aawj D(azrw azrwVar) {
        return new aawj(azrwVar, 18);
    }

    public static aawj E(azrw azrwVar) {
        return new aawj(azrwVar, 19);
    }

    public static aawj F(azrw azrwVar) {
        return new aawj(azrwVar, 20);
    }

    public static aarm G(abom abomVar) {
        return abomVar.a(gzp.t, true);
    }

    public static acpk H(acpl acplVar) {
        return new acpk(acplVar);
    }

    public static ywx I(zzw zzwVar) {
        return zzwVar.a(aard.q, abea.q, awuv.a);
    }

    public static aawj a(azrw azrwVar) {
        return new aawj(azrwVar, 0);
    }

    public static aasi b(aary aaryVar) {
        return new aasi(aaryVar);
    }

    public static acpk c(acpl acplVar) {
        return new acpk(acplVar);
    }

    public static CronetEngine d(Object obj) {
        return ((aduw) obj).a(false);
    }

    public static CronetEngine e(Object obj) {
        return ((aduw) obj).a(true);
    }

    public static amnv f(aemv aemvVar) {
        return new advv(aemvVar, 0);
    }

    public static amnv g(aemv aemvVar) {
        return new advv(aemvVar, 2);
    }

    public static aeig h(shf shfVar) {
        return new aeig(shfVar);
    }

    public static adyc i(afhf afhfVar) {
        return new adyc(afhfVar);
    }

    public static ywr j(ywp ywpVar) {
        return new aedt(ywpVar, awvr.a);
    }

    public static aefy k(aenf aenfVar) {
        return new aefy(aenfVar);
    }

    public static affs l(Context context) {
        return new affs(context);
    }

    public static String m(afqc afqcVar) {
        String c = afqcVar.c();
        ayaw.k(c);
        return c;
    }

    public static aawj n(azrw azrwVar) {
        return new aawj(azrwVar, 2);
    }

    public static aawj o(azrw azrwVar) {
        return new aawj(azrwVar, 3);
    }

    public static aawj p(azrw azrwVar) {
        return new aawj(azrwVar, 4);
    }

    public static aawj q(azrw azrwVar) {
        return new aawj(azrwVar, 5);
    }

    public static aawj r(azrw azrwVar) {
        return new aawj(azrwVar, 6);
    }

    public static aawj s(azrw azrwVar) {
        return new aawj(azrwVar, 7);
    }

    public static aawj t(azrw azrwVar) {
        return new aawj(azrwVar, 8);
    }

    public static aawj u(azrw azrwVar) {
        return new aawj(azrwVar, 9);
    }

    public static aawj v(azrw azrwVar) {
        return new aawj(azrwVar, 10);
    }

    public static aawj w(azrw azrwVar) {
        return new aawj(azrwVar, 11);
    }

    public static aawj x(azrw azrwVar) {
        return new aawj(azrwVar, 12);
    }

    public static aawj y(azrw azrwVar) {
        return new aawj(azrwVar, 13);
    }

    public static aawj z(azrw azrwVar) {
        return new aawj(azrwVar, 14);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return new aawi(this.a);
            case 1:
                return b((aary) this.a.get());
            case 2:
                return G(((aaro) this.a).get());
            case 3:
                return new aawm((aaxn) this.a.get(), null, null, null);
            case 4:
                return new acpa((SharedPreferences) this.a.get());
            case 5:
                return I(((ywy) this.a).get());
            case 6:
                return H((acpl) this.a.get());
            case 7:
                return c((acpl) this.a.get());
            case 8:
                return d(this.a.get());
            case 9:
                return e(this.a.get());
            case 10:
                return f((aemv) this.a.get());
            case 11:
                return g((aemv) this.a.get());
            case 12:
                return h((shf) this.a.get());
            case 13:
                return i(((adwd) this.a).b());
            case 14:
                return rqe.a((Context) ((axqs) this.a).a);
            case 15:
                return j(((aedu) this.a).get());
            case 16:
                return k((aenf) this.a.get());
            case 17:
                return new aejn((afhs) this.a.get());
            case 18:
                return new affe((Context) ((axqs) this.a).a);
            case 19:
                return l((Context) ((axqs) this.a).a);
            default:
                return m(((afpu) this.a).get());
        }
    }
}
