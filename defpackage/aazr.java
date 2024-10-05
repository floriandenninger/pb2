package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazr implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final /* synthetic */ int f;

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i) {
        this.f = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, byte[] bArr) {
        this.f = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.e = azrwVar3;
        this.d = azrwVar4;
        this.b = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, char[] cArr) {
        this.f = i;
        this.d = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.e = azrwVar4;
        this.c = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, float[] fArr) {
        this.f = i;
        this.c = azrwVar;
        this.e = azrwVar2;
        this.b = azrwVar3;
        this.d = azrwVar4;
        this.a = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, int[] iArr) {
        this.f = i;
        this.e = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
        this.a = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, short[] sArr) {
        this.f = i;
        this.e = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.b = azrwVar4;
        this.a = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, boolean[] zArr) {
        this.f = i;
        this.d = azrwVar;
        this.a = azrwVar2;
        this.e = azrwVar3;
        this.b = azrwVar4;
        this.c = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, byte[][] bArr) {
        this.f = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, char[][] cArr) {
        this.f = i;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.a = azrwVar4;
        this.e = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, float[][] fArr) {
        this.f = i;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.e = azrwVar3;
        this.a = azrwVar4;
        this.b = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, int[][] iArr) {
        this.f = i;
        this.e = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.b = azrwVar4;
        this.d = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, short[][] sArr) {
        this.f = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.e = azrwVar4;
        this.d = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.e = azrwVar4;
        this.b = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.e = azrwVar3;
        this.d = azrwVar4;
        this.b = azrwVar5;
    }

    public aazr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, char[][][] cArr) {
        this.f = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = azrwVar4;
        this.a = azrwVar5;
    }

    public static ajfm A(axpg axpgVar, aaea aaeaVar, syd sydVar, aoae aoaeVar, axpg axpgVar2) {
        return new ajfm(axpgVar, aaeaVar, sydVar, aoaeVar, axpgVar2, null, null);
    }

    public static aazr a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 0);
    }

    public static abfp b(SharedPreferences sharedPreferences, azrw azrwVar, azrw azrwVar2, aacu aacuVar, Executor executor) {
        return new abfp(sharedPreferences, azrwVar, azrwVar2, aacuVar, executor);
    }

    public static ywp c(aadw aadwVar, Context context, String str, anib anibVar, vfg vfgVar) {
        vda a = vdb.a(context);
        a.e("logging");
        a.f("logging_settings.pb");
        Uri a2 = a.a();
        vfe a3 = vff.a();
        a3.f(a2);
        a3.e(awuv.a);
        atfq atfqVar = aadwVar.b().o;
        if (atfqVar == null) {
            atfqVar = atfq.a;
        }
        auie auieVar = atfqVar.g;
        if (auieVar == null) {
            auieVar = auie.a;
        }
        if (auieVar.g) {
            vfk d = vfn.d(context, anibVar);
            d.b();
            d.c = str;
            d.d("interaction_logging_client_side_ve_counter");
            d.e(fkm.s);
            a3.b(d.a());
        }
        vfk d2 = vfn.d(context, anibVar);
        d2.b();
        d2.c = str;
        d2.d("foreground_heartbeat_index", "LastCrashTimestamp", "LastCrashException");
        d2.e(fkm.t);
        a3.b(d2.a());
        return new ywp(agcm.e(vfgVar.a(a3.a())), awuv.a);
    }

    public static aeon d(aknq aknqVar, ysl yslVar, ScheduledExecutorService scheduledExecutorService, afsy afsyVar, acpl acplVar) {
        return new aeon(aknqVar, yslVar, scheduledExecutorService, afsyVar, acplVar);
    }

    public static afps e(Executor executor, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new afps(executor, azrwVar, azrwVar2, azrwVar3, azrwVar4);
    }

    public static ywr f(Context context, String str, anib anibVar, vfg vfgVar, ylr ylrVar) {
        vfk d = vfn.d(context, anibVar);
        d.b();
        d.c = str;
        d.d(ahbw.SUBTITLES_ENABLED, ahbw.SUBTITLES_LANGUAGE_CODE);
        d.e(adgt.h);
        vfn a = d.a();
        vfe a2 = vff.a();
        a2.f(ahbx.v(context));
        a2.e(awwm.a);
        a2.b(a);
        return ylrVar.a(agcm.e(vfgVar.a(a2.a())), awwm.a);
    }

    public static aixc g(axpg axpgVar, aaoz aaozVar, shf shfVar, aypn aypnVar, aadw aadwVar) {
        return new aixc(axpgVar, aaozVar, shfVar, aypnVar, aadwVar);
    }

    public static tbt h(axpg axpgVar, boolean z, ajhe ajheVar) {
        tbt tbtVar = (z && ajheVar.k == 1) ? (tbt) axpgVar.get() : tbt.a;
        ayaw.k(tbtVar);
        return tbtVar;
    }

    public static akqi i(acrt acrtVar, ynx ynxVar, shf shfVar, zgi zgiVar) {
        return new akqi(acrtVar, ynxVar, shfVar, zgiVar);
    }

    public static aazr j(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 1);
    }

    public static aazr k(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 2, (byte[]) null);
    }

    public static aazr l(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 3, (char[]) null);
    }

    public static aazr m(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 4, (short[]) null);
    }

    public static aazr n(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 5, (int[]) null);
    }

    public static aazr o(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 6, (boolean[]) null);
    }

    public static aazr p(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 7, (float[]) null);
    }

    public static aazr q(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 8, (byte[][]) null);
    }

    public static aazr r(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 9, (char[][]) null);
    }

    public static aazr s(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 10, (short[][]) null);
    }

    public static aazr t(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 11, (int[][]) null);
    }

    public static aazr u(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 12, (boolean[][]) null);
    }

    public static aazr v(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 13, (float[][]) null);
    }

    public static aazr w(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 14, (byte[][][]) null);
    }

    public static aazr x(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aazr(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 15, (char[][][]) null);
    }

    public static adxx y(aadw aadwVar, azrw azrwVar, yjk yjkVar, axpg axpgVar, SharedPreferences sharedPreferences) {
        adxx a = advd.a.a(aadwVar, azrwVar, yjkVar, axpgVar, sharedPreferences);
        ayaw.k(a);
        return a;
    }

    public static aifk z(aadw aadwVar, aaea aaeaVar, axzg axzgVar, axzg axzgVar2, axzg axzgVar3) {
        return new aifk(aadwVar, aaeaVar, axzgVar, axzgVar2, axzgVar3, null, null, null, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.f) {
            case 0:
                aarm aarmVar = (aarm) this.a.get();
                ajoy ajoyVar = (ajoy) this.b.get();
                return new aazq(aarmVar, ajoyVar, (ysl) this.d.get(), (aadw) this.e.get(), null, null, null);
            case 1:
                return new aatv((aarm) this.a.get(), (ajoy) this.b.get(), (afsy) this.c.get(), (ysl) this.d.get(), (shf) this.e.get(), null, null, null);
            case 2:
                return new abdd((aarm) this.a.get(), (ajoy) this.c.get(), (afsy) this.e.get(), (ysl) this.d.get(), (abdc) this.b.get(), null, null, null);
            case 3:
                return b((SharedPreferences) this.d.get(), this.a, this.b, (aacu) this.e.get(), (Executor) this.c.get());
            case 4:
                return c((aadw) this.e.get(), (Context) ((axqs) this.c).a, ((yjv) this.d).b(), (anib) this.b.get(), (vfg) this.a.get());
            case 5:
                return y((aadw) this.e.get(), this.d, (yjk) this.b.get(), axqq.a(this.c), (SharedPreferences) this.a.get());
            case 6:
                return d((aknq) this.d.get(), (ysl) this.a.get(), (ScheduledExecutorService) this.e.get(), (afsy) this.b.get(), (acpl) this.c.get());
            case 7:
                return e((Executor) this.c.get(), this.e, this.b, this.d, this.a);
            case 8:
                return z((aadw) this.c.get(), (aaea) this.b.get(), (axzg) this.a.get(), (axzg) this.d.get(), (axzg) this.e.get());
            case 9:
                return f((Context) ((axqs) this.c).a, ((yjv) this.d).b(), (anib) this.b.get(), (vfg) this.a.get(), (ylr) this.e.get());
            case 10:
                return new aisz((Executor) this.c.get(), (yrw) this.b.get(), (zjl) this.a.get(), (shf) this.e.get(), (ylz) this.d.get());
            case 11:
                return new aiwg((Context) ((axqs) this.e).a, (Handler) this.a.get(), this.c, (aivq) this.b.get(), this.d, aipa.c());
            case 12:
                aixc g = g(axqq.a(this.a), (aaoz) this.d.get(), (shf) this.c.get(), (aypn) this.e.get(), (aadw) this.b.get());
                g.w();
                return g;
            case 13:
                return A(axqq.a(this.d), (aaea) this.c.get(), (syd) this.e.get(), (aoae) this.a.get(), axqq.a(this.b));
            case 14:
                axpg a = axqq.a(this.c);
                return h(a, ((Boolean) this.d.get()).booleanValue(), (ajhe) this.b.get());
            default:
                acrt acrtVar = (acrt) this.b.get();
                ynx ynxVar = (ynx) this.c.get();
                return i(acrtVar, ynxVar, (shf) this.e.get(), (zgi) this.a.get());
        }
    }
}
