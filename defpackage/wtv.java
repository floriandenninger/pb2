package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wtv implements axqr {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public wtv(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public wtv(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public wtv(azrw azrwVar, azrw azrwVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public wtv(azrw azrwVar, azrw azrwVar2, int i, float[] fArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public wtv(azrw azrwVar, azrw azrwVar2, int i, int[] iArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public wtv(azrw azrwVar, azrw azrwVar2, int i, short[] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public wtv(azrw azrwVar, azrw azrwVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public static wtv A(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 17, (boolean[]) null);
    }

    public static wtv B(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 18);
    }

    public static wtv C(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 19);
    }

    public static wtv D(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 20, (float[]) null);
    }

    public static wtu E(azrw azrwVar, whu whuVar) {
        return new wtu(azrwVar, whuVar, null, null);
    }

    public static wxx F(azrw azrwVar, whu whuVar) {
        return new wxx(azrwVar);
    }

    public static wyk G(azrw azrwVar, whu whuVar) {
        return new wyk(azrwVar);
    }

    public static whu H() {
        return new whu();
    }

    public static yfl I(azrw azrwVar, azrw azrwVar2) {
        return new yfl(azrwVar, azrwVar2, (short[]) null);
    }

    public static wtv a(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 0);
    }

    public static wyc b(azrw azrwVar, zez zezVar) {
        return new wyc(azrwVar, zezVar);
    }

    public static wys c(aaea aaeaVar, wym wymVar) {
        return new wys(aaeaVar, wymVar);
    }

    public static wyx d(Context context, Executor executor) {
        return new wyx(context, executor);
    }

    public static SharedPreferences e(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        ayaw.k(sharedPreferences);
        return sharedPreferences;
    }

    public static zaw f(azrw azrwVar, ammv ammvVar) {
        return (zaw) ammvVar.d(new uqa(azrwVar, 2));
    }

    public static ylf g(azrw azrwVar, yle yleVar) {
        return new ylf(azrwVar, yleVar);
    }

    public static anic h(ammv ammvVar, anic anicVar) {
        if (ammvVar.h()) {
            anicVar = anaf.D((ScheduledExecutorService) ammvVar.c());
        }
        ayaw.k(anicVar);
        return anicVar;
    }

    public static ymr i(azrw azrwVar) {
        ymr ymrVar = new ymr((ynf) azrwVar.get());
        Logger.getLogger(anaf.E(qmq.c).getClass().getName()).addHandler(ymrVar);
        return ymrVar;
    }

    public static wsh j(azrw azrwVar, azrw azrwVar2) {
        return new wsh(azrwVar, azrwVar2, 2);
    }

    public static wtv k(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 1);
    }

    public static wtv l(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 2);
    }

    public static wtv m(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 3, (byte[]) null);
    }

    public static wtv n(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 4);
    }

    public static wtv o(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 5);
    }

    public static wtv p(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 6);
    }

    public static wtv q(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 7);
    }

    public static wtv r(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 8, (char[]) null);
    }

    public static wtv s(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 9);
    }

    public static wtv t(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 10);
    }

    public static wtv u(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 11);
    }

    public static wtv v(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 12);
    }

    public static wtv w(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 13, (short[]) null);
    }

    public static wtv x(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 14);
    }

    public static wtv y(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 15);
    }

    public static wtv z(azrw azrwVar, azrw azrwVar2) {
        return new wtv(azrwVar, azrwVar2, 16, (int[]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return E(this.a, (whu) this.b.get());
            case 1:
                return j(this.a, this.b);
            case 2:
                return new wxr(this.a, (amrz) this.b.get());
            case 3:
                azrw azrwVar = this.b;
                azrw azrwVar2 = this.a;
                amrw h = amrz.h();
                h.g(apae.SLOT_TYPE_BELOW_PLAYER, azrwVar2);
                h.g(apae.SLOT_TYPE_IN_PLAYER, umy.f);
                h.g(apae.SLOT_TYPE_LOCKSCREEN, umy.g);
                h.g(apae.SLOT_TYPE_FIXED_FOOTER, umy.h);
                h.g(apae.SLOT_TYPE_FORECASTING, umy.i);
                h.g(apae.SLOT_TYPE_PLAYER_BYTES, azrwVar);
                return h.c();
            case 4:
                return new yfl(this.a, this.b, (short[]) null);
            case 5:
                return I(this.a, this.b);
            case 6:
                return new wxr(this.a, (amrz) this.b.get());
            case 7:
                return F(this.a, (whu) this.b.get());
            case 8:
                return b(this.b, ((zfa) this.a).get());
            case 9:
                return new wyj(this.a, this.b);
            case 10:
                return G(this.a, (whu) this.b.get());
            case 11:
                return c((aaea) this.a.get(), (wym) this.b.get());
            case 12:
                return H();
            case 13:
                return d((Context) ((axqs) this.b).a, (Executor) this.a.get());
            case 14:
                return new wzp((aloh) this.a.get(), (Executor) this.b.get(), null, null, null);
            case 15:
                return e((Context) ((axqs) this.a).a, ((yjv) this.b).b());
            case 16:
                return f(this.b, (ammv) ((axqs) this.a).a);
            case 17:
                return g(this.b, (yle) this.a.get());
            case 18:
                return h((ammv) ((axqs) this.a).a, (anic) this.b.get());
            case 19:
                return i(this.b);
            default:
                return new ypa((Executor) this.b.get(), (shf) this.a.get());
        }
    }
}
