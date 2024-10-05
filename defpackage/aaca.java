package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ByteStore;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaca implements axqr {
    private final azrw a;
    private final /* synthetic */ int b;

    public aaca(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public static aaca A(azrw azrwVar) {
        return new aaca(azrwVar, 19);
    }

    public static aaca B(azrw azrwVar) {
        return new aaca(azrwVar, 20);
    }

    public static aarm C(abom abomVar) {
        return abomVar.a(gzp.s, false);
    }

    public static aarm D(abom abomVar) {
        return abomVar.a(gzp.r, false);
    }

    public static aafr E(acpk acpkVar) {
        return new aafr(acpkVar);
    }

    public static amea F(azrw azrwVar) {
        return new amea(azrwVar, (byte[]) null);
    }

    public static aloh G(Context context) {
        return new aloh(context, (char[]) null);
    }

    public static tko H(axzf axzfVar) {
        return new aagi(axzfVar, null, null, null);
    }

    public static whu I() {
        return new whu(null, null);
    }

    public static aaca a(azrw azrwVar) {
        return new aaca(azrwVar, 0);
    }

    public static aact b(aacs aacsVar) {
        return new aact(aacsVar);
    }

    public static aadw c(aabt aabtVar) {
        aadw c = aabtVar.c();
        ayaw.k(c);
        return c;
    }

    public static aaea d(aabt aabtVar) {
        aaea a = aabtVar.a();
        ayaw.k(a);
        return a;
    }

    public static aarh e(aabt aabtVar) {
        aarh b = aabtVar.b();
        ayaw.k(b);
        return b;
    }

    public static aafr f(acpk acpkVar) {
        return new aafr(acpkVar);
    }

    public static amru g(Set set) {
        amru o = amru.o(set);
        ayaw.k(o);
        return o;
    }

    public static ttw h(Context context) {
        return new ttw(context);
    }

    public static ByteStore i(aahx aahxVar) {
        ByteStore byteStore = aahxVar.d().c.a;
        ayaw.k(byteStore);
        return byteStore;
    }

    public static aary j(cnd cndVar) {
        return new aary(cndVar);
    }

    public static aaca k(azrw azrwVar) {
        return new aaca(azrwVar, 1);
    }

    public static aaca l(azrw azrwVar) {
        return new aaca(azrwVar, 3);
    }

    public static aaca m(azrw azrwVar) {
        return new aaca(azrwVar, 4);
    }

    public static aaca n(azrw azrwVar) {
        return new aaca(azrwVar, 5);
    }

    public static aaca o(azrw azrwVar) {
        return new aaca(azrwVar, 6);
    }

    public static aaca p(azrw azrwVar) {
        return new aaca(azrwVar, 7);
    }

    public static aaca q(azrw azrwVar) {
        return new aaca(azrwVar, 8);
    }

    public static aaca r(azrw azrwVar) {
        return new aaca(azrwVar, 9);
    }

    public static aaca s(azrw azrwVar) {
        return new aaca(azrwVar, 10);
    }

    public static aaca t(azrw azrwVar) {
        return new aaca(azrwVar, 11);
    }

    public static aaca u(azrw azrwVar) {
        return new aaca(azrwVar, 12);
    }

    public static aaca v(azrw azrwVar) {
        return new aaca(azrwVar, 13);
    }

    public static aaca w(azrw azrwVar) {
        return new aaca(azrwVar, 14);
    }

    public static aaca x(azrw azrwVar) {
        return new aaca(azrwVar, 15);
    }

    public static aaca y(azrw azrwVar) {
        return new aaca(azrwVar, 16);
    }

    public static aaca z(azrw azrwVar) {
        return new aaca(azrwVar, 17);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return C(((aaro) this.a).get());
            case 1:
                return D(((aaro) this.a).get());
            case 2:
                return b((aacs) this.a.get());
            case 3:
                return c((aabt) this.a.get());
            case 4:
                return d((aabt) this.a.get());
            case 5:
                return e((aabt) this.a.get());
            case 6:
                return E((acpk) this.a.get());
            case 7:
                return f((acpk) this.a.get());
            case 8:
                return H((axzf) this.a.get());
            case 9:
                return g(((axqw) this.a).get());
            case 10:
                return h((Context) ((axqs) this.a).a);
            case 11:
                return i((aahx) this.a.get());
            case 12:
                return F(this.a);
            case 13:
                return I();
            case 14:
                return new aalr((shf) this.a.get());
            case 15:
                return new aalu((Map) ((axqs) this.a).a);
            case 16:
                return new aaoz(this.a);
            case 17:
                return new aaqt((shf) this.a.get());
            case 18:
                return j((cnd) this.a.get());
            case 19:
                return new aasd((Context) ((axqs) this.a).a);
            default:
                return G((Context) ((axqs) this.a).a);
        }
    }
}
