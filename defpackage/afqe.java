package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afqe implements axqr {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public afqe(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public afqe(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public afqe(azrw azrwVar, azrw azrwVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public afqe(azrw azrwVar, azrw azrwVar2, int i, float[] fArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public afqe(azrw azrwVar, azrw azrwVar2, int i, int[] iArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public afqe(azrw azrwVar, azrw azrwVar2, int i, short[] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public afqe(azrw azrwVar, azrw azrwVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public afqe(azrw azrwVar, azrw azrwVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public afqe(azrw azrwVar, azrw azrwVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public afqe(azrw azrwVar, azrw azrwVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public static aikm A(aivq aivqVar, aivo aivoVar) {
        return new aikm(aivqVar, aivoVar, 1);
    }

    public static afqe B(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 14);
    }

    public static afqe C(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 15);
    }

    public static afqe D(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 16);
    }

    public static afqe E(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 17, (byte[][]) null);
    }

    public static afqe F(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 18);
    }

    public static afqe G(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 19, (char[][]) null);
    }

    public static afqe H(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 20, (short[][]) null);
    }

    public static List I(afgr afgrVar, afgr afgrVar2) {
        amru s = amru.s(afgrVar, afgrVar2);
        ayaw.k(s);
        return s;
    }

    public static afqd a(ynx ynxVar, Context context) {
        return new afqd(ynxVar, context);
    }

    public static afqe b(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 0);
    }

    public static ysl c(ysn ysnVar, ysm ysmVar) {
        ysl a = ysnVar.a(new cns(), ysmVar, "netRequest-noncaching");
        ayaw.k(a);
        return a;
    }

    public static ywr d(Context context, azrw azrwVar) {
        vfg vfgVar = (vfg) azrwVar.get();
        vda a = vdb.a(context);
        a.e("net");
        a.f("prodnet.pb");
        Uri a2 = a.a();
        vfe a3 = vff.a();
        a3.f(a2);
        a3.e(awwb.a);
        return new ywp(agcm.e(vfgVar.a(a3.a())), awwb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ajbh] */
    public static ajbh e(aixc aixcVar, aadw aadwVar) {
        aixc aixcVar2 = aixcVar;
        if (aifk.H(aadwVar)) {
            aixcVar2 = new ajbh();
        }
        ayaw.k(aixcVar2);
        return aixcVar2;
    }

    public static acsx f(acsy acsyVar, aifk aifkVar) {
        acsx acszVar;
        if (aifkVar.y()) {
            acszVar = acsyVar.d(asmn.LATENCY_ACTION_WATCH);
            aone createBuilder = asmb.a.createBuilder();
            aone createBuilder2 = asmd.a.createBuilder();
            createBuilder2.copyOnWrite();
            asmd asmdVar = (asmd) createBuilder2.instance;
            asmdVar.d = 12;
            asmdVar.b |= 8;
            asmd asmdVar2 = (asmd) createBuilder2.build();
            createBuilder.copyOnWrite();
            asmb asmbVar = (asmb) createBuilder.instance;
            asmdVar2.getClass();
            asmbVar.w = asmdVar2;
            asmbVar.c |= 524288;
            createBuilder.copyOnWrite();
            asmb asmbVar2 = (asmb) createBuilder.instance;
            asmbVar2.b |= 16;
            asmbVar2.h = "warm";
            acszVar.a((asmb) createBuilder.build());
        } else {
            acszVar = new acsz();
        }
        ayaw.k(acszVar);
        return acszVar;
    }

    public static acsx g(acsy acsyVar, aifk aifkVar) {
        acsx acszVar;
        if (aifkVar.y()) {
            acszVar = acsyVar.d(asmn.LATENCY_ACTION_WATCH);
            aone createBuilder = asmb.a.createBuilder();
            aone createBuilder2 = asmd.a.createBuilder();
            createBuilder2.copyOnWrite();
            asmd asmdVar = (asmd) createBuilder2.instance;
            asmdVar.d = 12;
            asmdVar.b |= 8;
            asmd asmdVar2 = (asmd) createBuilder2.build();
            createBuilder.copyOnWrite();
            asmb asmbVar = (asmb) createBuilder.instance;
            asmdVar2.getClass();
            asmbVar.w = asmdVar2;
            asmbVar.c |= 524288;
            createBuilder.copyOnWrite();
            asmb asmbVar2 = (asmb) createBuilder.instance;
            asmbVar2.b |= 16;
            asmbVar2.h = "warm";
            acszVar.a((asmb) createBuilder.build());
        } else {
            acszVar = new acsz();
        }
        ayaw.k(acszVar);
        return acszVar;
    }

    public static hn h(final aiwg aiwgVar, Executor executor) {
        hn hnVar;
        if (yjk.h()) {
            hnVar = aiwgVar.a();
        } else {
            try {
                aiwgVar.getClass();
                hnVar = (hn) anaf.S(new Callable() { // from class: ahan
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return aiwg.this.a();
                    }
                }, executor).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        ayaw.k(hnVar);
        return hnVar;
    }

    public static anhy i(Context context, Executor executor) {
        return anaf.S(new sfk(context, 5), executor);
    }

    public static ahui j(Context context) {
        return new ahui(context);
    }

    public static aikk k(aivq aivqVar, aivo aivoVar) {
        return new aikk(aivqVar, aivoVar);
    }

    public static aikm l(aivq aivqVar, aivo aivoVar) {
        return new aikm(aivqVar, aivoVar, 0);
    }

    public static ainj m(ainy ainyVar, aioo aiooVar) {
        return new ainj(ainyVar, aiooVar);
    }

    public static ahaz n(adxl adxlVar, aifs aifsVar) {
        return new ahaz(adxlVar, aifsVar);
    }

    public static afqe o(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 1, (byte[]) null);
    }

    public static afqe p(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 2, (char[]) null);
    }

    public static afqe q(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 4, (short[]) null);
    }

    public static afqe r(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 5);
    }

    public static afqe s(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 6);
    }

    public static afqe t(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 7);
    }

    public static afqe u(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 8);
    }

    public static afqe v(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 9);
    }

    public static afqe w(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 10, (int[]) null);
    }

    public static afqe x(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 11, (boolean[]) null);
    }

    public static afqe y(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 12, (float[]) null);
    }

    public static afqe z(azrw azrwVar, azrw azrwVar2) {
        return new afqe(azrwVar, azrwVar2, 13);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return a((ynx) this.a.get(), (Context) ((axqs) this.b).a);
            case 1:
                return c((ysn) this.b.get(), (ysm) this.a.get());
            case 2:
                return d((Context) ((axqs) this.b).a, this.a);
            case 3:
                return new afxk((SharedPreferences) this.a.get(), (afsy) this.b.get());
            case 4:
                return I((afgr) this.b.get(), (afgr) this.a.get());
            case 5:
                return e((aixc) this.a.get(), (aadw) this.b.get());
            case 6:
                return ahbj.e((zbw) this.a.get(), (ahbv) ((axqs) this.b).a);
            case 7:
                return f((acsy) this.a.get(), (aifk) this.b.get());
            case 8:
                return g((acsy) this.a.get(), (aifk) this.b.get());
            case 9:
                return h((aiwg) this.a.get(), (Executor) this.b.get());
            case 10:
                return i((Context) ((axqs) this.b).a, (Executor) this.a.get());
            case 11:
                Context context = (Context) ((axqs) this.b).a;
                return j(context);
            case 12:
                return new aiha((aypn) this.b.get(), (aypn) this.a.get());
            case 13:
                return new aiik((aifw) this.a.get(), (aigv) this.b.get());
            case 14:
                return A((aivq) this.a.get(), (aivo) this.b.get());
            case 15:
                return k((aivq) this.a.get(), (aivo) this.b.get());
            case 16:
                return l((aivq) this.a.get(), (aivo) this.b.get());
            case 17:
                return new aild((Context) ((axqs) this.b).a, (aifs) this.a.get());
            case 18:
                return new aimc(((aimd) this.a).get(), ((aimh) this.b).get(), null);
            case 19:
                return m((ainy) this.b.get(), (aioo) this.a.get());
            default:
                return n((adxl) this.b.get(), (aifs) this.a.get());
        }
    }
}
