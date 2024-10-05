package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class szr implements axqr {
    private final /* synthetic */ int a;

    public szr(int i) {
        this.a = i;
    }

    public static swy a(ammv ammvVar) {
        return (swy) ammvVar.e(swy.a);
    }

    public static JSEnvironment b(ammv ammvVar) {
        return (JSEnvironment) ammvVar.e(new szv());
    }

    public static syd c(ammv ammvVar, ammv ammvVar2, axpg axpgVar) {
        syd sydVar;
        if (!((Boolean) ammvVar2.e(false)).booleanValue()) {
            sydVar = (syd) ammvVar.e(new tag());
        } else if (ammvVar.h()) {
            HashSet hashSet = new HashSet();
            hashSet.add((syd) axpgVar.get());
            hashSet.add((syd) ammvVar.c());
            sydVar = new slm(hashSet);
        } else {
            sydVar = (syd) axpgVar.get();
        }
        dhz.a = new tba(sydVar);
        ayaw.k(sydVar);
        return sydVar;
    }

    public static PerformOnceCommandController d() {
        PerformOnceCommandController performOnceCommandController = taj.a;
        ayaw.k(performOnceCommandController);
        return performOnceCommandController;
    }

    public static ayqi e(ammv ammvVar) {
        return (ayqi) ammvVar.e(azre.c());
    }

    public static szl f(ammv ammvVar, syd sydVar) {
        szl szlVar;
        if (ammvVar.h()) {
            szlVar = (szl) ammvVar.c();
        } else {
            if (rwh.b == null) {
                rwh.b = new szs(sydVar);
            }
            szlVar = rwh.b;
        }
        ayaw.k(szlVar);
        return szlVar;
    }

    public static amnp g() {
        return amnp.d(amlo.a);
    }

    public static why h(Context context, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, acqz acqzVar) {
        return new why(context, ajjzVar, ajutVar, aahdVar, acqzVar);
    }

    public static wlu i(Activity activity, Map map) {
        azrw azrwVar = (azrw) map.get(activity.getClass());
        activity.getClass().getName();
        azrwVar.getClass();
        wlu wluVar = (wlu) azrwVar.get();
        ayaw.k(wluVar);
        return wluVar;
    }

    public static CopyOnWriteArrayList j() {
        return new CopyOnWriteArrayList();
    }

    public static wpx k() {
        return new wpx();
    }

    public static wqg l() {
        return new wqg();
    }

    public static wug m() {
        return new wug();
    }

    public static wuk n() {
        return new wuk();
    }

    public static wvl o() {
        return new wvl(1);
    }

    public static wuq p() {
        return new wuq(1);
    }

    public static whp q(Activity activity, aftn aftnVar, ajjz ajjzVar, ysy ysyVar, afsy afsyVar, azrw azrwVar, zbi zbiVar, wkk wkkVar, wiz wizVar, aatg aatgVar, akpq akpqVar, ajut ajutVar, acqz acqzVar) {
        return new whp(activity, aftnVar, ajjzVar, ysyVar, afsyVar, azrwVar, zbiVar, wkkVar, wizVar, aatgVar, akpqVar, ajutVar, acqzVar, null);
    }

    public static ajun r() {
        return new ajun((byte[]) null, (short[]) null);
    }

    public static aoae s() {
        return new aoae((short[]) null, (byte[]) null, (byte[]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                return new zhr(1);
            case 7:
                return new aoae((boolean[]) null);
            case 8:
                throw null;
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                throw null;
            case 12:
                return j();
            case 13:
                return s();
            case 14:
                return r();
            case 15:
                return k();
            case 16:
                return l();
            case 17:
                return m();
            case 18:
                return o();
            case 19:
                return p();
            default:
                return n();
        }
    }
}
