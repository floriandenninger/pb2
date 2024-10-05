package defpackage;

import android.content.Context;
import android.util.Pair;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ytb implements axqr {
    private final azrw a;
    private final /* synthetic */ int b;

    public ytb(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public static ytb A(azrw azrwVar) {
        return new ytb(azrwVar, 16);
    }

    public static ytb B(azrw azrwVar) {
        return new ytb(azrwVar, 17);
    }

    public static ytb C(azrw azrwVar) {
        return new ytb(azrwVar, 19);
    }

    public static ytb D(azrw azrwVar) {
        return new ytb(azrwVar, 20);
    }

    public static ajoy E(azrw azrwVar) {
        return new ajoy(azrwVar, (char[]) null, (byte[]) null, (char[]) null);
    }

    public static ytb a(azrw azrwVar) {
        return new ytb(azrwVar, 0);
    }

    public static aypn b(yrn yrnVar) {
        return yrnVar.h.f(new yrl(yrnVar, 0));
    }

    public static aypn c(yrn yrnVar) {
        return yrnVar.h.f(new yrl(yrnVar, 1));
    }

    public static yta d(ammv ammvVar) {
        return (yta) ammvVar.e(yta.a);
    }

    public static yvq e(ammv ammvVar) {
        return (yvq) ammvVar.e(yvq.a);
    }

    public static ExperimentalCronetEngine f(CronetEngine cronetEngine) {
        if (!(cronetEngine instanceof ExperimentalCronetEngine)) {
            throw new IllegalStateException("Could not create ExperimentalCronetEngine");
        }
        ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) cronetEngine;
        ayaw.k(experimentalCronetEngine);
        return experimentalCronetEngine;
    }

    public static ywq g(Set set) {
        return new ywq(set);
    }

    public static zey h(Context context) {
        return new zey(context);
    }

    public static Integer i(Context context) {
        Pair T;
        int i = 720;
        if (!yjk.V(context, 720) && !yjk.X(context)) {
            i = 480;
        } else if (yjk.V(context, 1080) || yjk.ab(1080)) {
            if (yjk.V(context, 1440) || yjk.ab(1440)) {
                if (!yjk.V(context, 2160) && !yjk.ab(2160)) {
                    if (yjk.a == 0) {
                        yjk.U(context);
                    }
                    if (yjk.a < 3840 && ((T = yjk.T()) == null || Math.max(((Integer) T.first).intValue(), ((Integer) T.second).intValue()) < 3840)) {
                        i = 1440;
                    }
                }
                i = 2160;
            } else {
                i = 1080;
            }
        }
        return Integer.valueOf(i);
    }

    public static zfy j(Context context, String str) {
        return new zfy(context, str);
    }

    public static cnd k(aabx aabxVar) {
        return new afpl(aabxVar.a);
    }

    public static ytb l(azrw azrwVar) {
        return new ytb(azrwVar, 1);
    }

    public static ytb m(azrw azrwVar) {
        return new ytb(azrwVar, 2);
    }

    public static ytb n(azrw azrwVar) {
        return new ytb(azrwVar, 3);
    }

    public static ytb o(azrw azrwVar) {
        return new ytb(azrwVar, 4);
    }

    public static ytb p(azrw azrwVar) {
        return new ytb(azrwVar, 5);
    }

    public static ytb q(azrw azrwVar) {
        return new ytb(azrwVar, 6);
    }

    public static ytb r(azrw azrwVar) {
        return new ytb(azrwVar, 7);
    }

    public static ytb s(azrw azrwVar) {
        return new ytb(azrwVar, 8);
    }

    public static ytb t(azrw azrwVar) {
        return new ytb(azrwVar, 9);
    }

    public static ytb u(azrw azrwVar) {
        return new ytb(azrwVar, 10);
    }

    public static ytb v(azrw azrwVar) {
        return new ytb(azrwVar, 11);
    }

    public static ytb w(azrw azrwVar) {
        return new ytb(azrwVar, 12);
    }

    public static ytb x(azrw azrwVar) {
        return new ytb(azrwVar, 13);
    }

    public static ytb y(azrw azrwVar) {
        return new ytb(azrwVar, 14);
    }

    public static ytb z(azrw azrwVar) {
        return new ytb(azrwVar, 15);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return b((yrn) this.a.get());
            case 1:
                return c((yrn) this.a.get());
            case 2:
                return d((ammv) ((axqs) this.a).a);
            case 3:
                return e((ammv) ((axqs) this.a).a);
            case 4:
                return f((CronetEngine) this.a.get());
            case 5:
                return new ytx((String) this.a.get());
            case 6:
                return new yug((String) this.a.get());
            case 7:
                return whl.l((Context) ((axqs) this.a).a);
            case 8:
                return g((Set) ((axqs) this.a).a);
            case 9:
                return new zbw((shf) this.a.get());
            case 10:
                return h((Context) ((axqs) this.a).a);
            case 11:
                return new aloh((Context) ((axqs) this.a).a, (char[]) null);
            case 12:
                return i((Context) ((axqs) this.a).a);
            case 13:
                return new aloh((Context) ((axqs) this.a).a, (char[]) null);
            case 14:
                return j((Context) ((axqs) this.a).a, "android_embedded_player");
            case 15:
                return new ajkn(axqq.a(this.a), (byte[]) null);
            case 16:
                return new zia((zhz) this.a.get());
            case 17:
                return new zhz((Context) ((axqs) this.a).a);
            case 18:
                return amsx.r(((vzs) this.a).a());
            case 19:
                return k((aabx) ((axqs) this.a).a);
            default:
                return E(this.a);
        }
    }
}
