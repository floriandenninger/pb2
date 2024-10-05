package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Optional;
import j$.util.function.Supplier;
import java.security.SecureRandom;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ytd implements axqr {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public ytd(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, float[] fArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, int[] iArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, short[] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, float[][] fArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, boolean[][] zArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, byte[][][] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, char[][][] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, int[][][] iArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public ytd(azrw azrwVar, azrw azrwVar2, int i, short[][][] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public static ytd A(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 12, (int[][]) null);
    }

    public static ytd B(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 13, (boolean[][]) null);
    }

    public static ytd C(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 14, (float[][]) null);
    }

    public static ytd D(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 15, (byte[][][]) null);
    }

    public static ytd E(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 16);
    }

    public static ytd F(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 17, (char[][][]) null);
    }

    public static ytd G(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 18, (short[][][]) null);
    }

    public static ytd H(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 19, (int[][][]) null);
    }

    public static yrw a(azrw azrwVar, ammv ammvVar) {
        return (yrw) ammvVar.e((yrw) azrwVar.get());
    }

    public static ytd b(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 0);
    }

    public static yrw c(ysc yscVar, yry yryVar) {
        return yscVar.a(yryVar);
    }

    public static String d(Context context, ammv ammvVar) {
        String ab;
        if (ammvVar.h()) {
            ab = (String) ((amnv) ammvVar.c()).get();
        } else {
            ab = wbs.ab(context, zgx.c(context), null);
        }
        ayaw.k(ab);
        return ab;
    }

    public static yvw e(Executor executor, azrw azrwVar) {
        return new yvw(executor, azrwVar);
    }

    public static vfg f(Executor executor, vcw vcwVar) {
        vfh vfhVar = new vfh();
        vfhVar.a = executor;
        vfhVar.b = vcwVar;
        vfhVar.b(vgk.a);
        return vfhVar.a();
    }

    public static SecureRandom g(final zfu zfuVar, Optional optional) {
        SecureRandom secureRandom = (SecureRandom) optional.orElseGet(new Supplier() { // from class: zha
            @Override // j$.util.function.Supplier
            public final Object get() {
                try {
                    zfu.this.a();
                } catch (IllegalStateException unused) {
                }
                return new SecureRandom();
            }
        });
        ayaw.k(secureRandom);
        return secureRandom;
    }

    public static Set h(aaea aaeaVar, azrw azrwVar) {
        Set r;
        atfr atfrVar = aaeaVar.a().f;
        if (atfrVar == null) {
            atfrVar = atfr.a;
        }
        if (!atfrVar.e) {
            atfr atfrVar2 = aaeaVar.a().f;
            if (atfrVar2 == null) {
                atfrVar2 = atfr.a;
            }
            if (!atfrVar2.f) {
                r = amvs.a;
                ayaw.k(r);
                return r;
            }
        }
        r = amsx.r((afvb) azrwVar.get());
        ayaw.k(r);
        return r;
    }

    public static aafp i(ynx ynxVar, azrw azrwVar) {
        return new aafp(ynxVar, azrwVar);
    }

    public static ttu j(shf shfVar, anib anibVar) {
        return new ttu(shfVar, anibVar);
    }

    public static tme k(Context context, tko tkoVar) {
        return new ttx(context, tkoVar);
    }

    public static aals l(azrw azrwVar) {
        aals aalsVar = (aals) azrwVar.get();
        ayaw.k(aalsVar);
        return aalsVar;
    }

    public static aakn m(azrw azrwVar, aahv aahvVar) {
        return new aakn(azrwVar, aahvVar);
    }

    public static aako n(aakq aakqVar, aals aalsVar) {
        return new aako(aakqVar, aalsVar);
    }

    public static aapo o(Executor executor, afsm afsmVar) {
        return new aapo(executor, afsmVar);
    }

    public static ytd p(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 1, (byte[]) null);
    }

    public static ytd q(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 2, (char[]) null);
    }

    public static ytd r(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 3, (short[]) null);
    }

    public static ytd s(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 4, (int[]) null);
    }

    public static ytd t(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 5, (boolean[]) null);
    }

    public static ytd u(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 6);
    }

    public static ytd v(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 7, (float[]) null);
    }

    public static ytd w(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 8);
    }

    public static ytd x(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 9, (byte[][]) null);
    }

    public static ytd y(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 10, (char[][]) null);
    }

    public static ytd z(azrw azrwVar, azrw azrwVar2) {
        return new ytd(azrwVar, azrwVar2, 11, (short[][]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return a(this.a, (ammv) ((axqs) this.b).a);
            case 1:
                return c((ysc) this.b.get(), (yry) this.a.get());
            case 2:
                return d((Context) ((axqs) this.b).a, (ammv) this.a.get());
            case 3:
                return e((Executor) this.b.get(), this.a);
            case 4:
                return f((Executor) this.b.get(), (vcw) this.a.get());
            case 5:
                shf shfVar = (shf) this.b.get();
                return new zfm(shfVar, xuq.g());
            case 6:
                return g((zfu) this.a.get(), (Optional) ((axqs) this.b).a);
            case 7:
                return h((aaea) this.b.get(), this.a);
            case 8:
                return ((ylr) this.b.get()).b(this.a);
            case 9:
                return i((ynx) this.b.get(), this.a);
            case 10:
                return whl.K((Context) ((axqs) this.b).a, (vfg) this.a.get());
            case 11:
                return j((shf) this.b.get(), (anib) this.a.get());
            case 12:
                return k((Context) ((axqs) this.b).a, (tko) this.a.get());
            case 13:
                return l(this.a);
            case 14:
                return new aaip((aadw) this.b.get(), (acpk) this.a.get());
            case 15:
                return m(this.b, (aahv) this.a.get());
            case 16:
                return n((aakq) this.a.get(), (aals) this.b.get());
            case 17:
                return new aalp((shf) this.b.get(), (aaea) this.a.get());
            case 18:
                azrw azrwVar = this.b;
                return new amea(azrwVar, amvo.b);
            case 19:
                return o((Executor) this.b.get(), (afsm) this.a.get());
            default:
                return new aasj((SharedPreferences) this.a.get(), (afsy) this.b.get());
        }
    }
}
