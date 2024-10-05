package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class snd implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final /* synthetic */ int f;

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i) {
        this.f = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, byte[] bArr) {
        this.f = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.b = azrwVar4;
        this.e = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.e = azrwVar4;
        this.c = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, char[] cArr) {
        this.f = i;
        this.e = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
        this.c = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, char[] cArr, byte[] bArr) {
        this.f = i;
        this.e = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.a = azrwVar4;
        this.c = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, float[] fArr) {
        this.f = i;
        this.b = azrwVar;
        this.e = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.a = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, int[] iArr) {
        this.f = i;
        this.e = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
        this.c = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, short[] sArr) {
        this.f = i;
        this.a = azrwVar;
        this.e = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
        this.d = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, boolean[] zArr) {
        this.f = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.e = azrwVar3;
        this.d = azrwVar4;
        this.b = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, byte[][] bArr) {
        this.f = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.b = azrwVar4;
        this.c = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, char[][] cArr) {
        this.f = i;
        this.a = azrwVar;
        this.e = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.b = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, float[][] fArr) {
        this.f = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.e = azrwVar4;
        this.d = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, int[][] iArr) {
        this.f = i;
        this.e = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.a = azrwVar4;
        this.b = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, short[][] sArr) {
        this.f = i;
        this.e = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.b = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.e = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
        this.b = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.e = azrwVar;
        this.b = azrwVar2;
        this.d = azrwVar3;
        this.c = azrwVar4;
        this.a = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, char[][][] cArr) {
        this.f = i;
        this.e = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.b = azrwVar4;
        this.a = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, float[][][] fArr) {
        this.f = i;
        this.a = azrwVar;
        this.e = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.b = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, int[][][] iArr) {
        this.f = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.e = azrwVar3;
        this.b = azrwVar4;
        this.d = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, short[][][] sArr) {
        this.f = i;
        this.e = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.c = azrwVar4;
        this.b = azrwVar5;
    }

    public snd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.b = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.e = azrwVar4;
        this.a = azrwVar5;
    }

    public static wsc A(azrw azrwVar, azrw azrwVar2, Executor executor, Executor executor2, whu whuVar) {
        return new wsc(azrwVar, azrwVar2, executor, executor2, whuVar, null, null);
    }

    public static wyg B(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, whu whuVar) {
        return new wyg(azrwVar, azrwVar2, azrwVar3);
    }

    public static wxs C(azrw azrwVar, azrw azrwVar2, whu whuVar, yfl yflVar, wwm wwmVar) {
        return new wxs(azrwVar, azrwVar2, yflVar, wwmVar, null);
    }

    public static wyq D(shf shfVar, ajoy ajoyVar, wpm wpmVar, azrw azrwVar, whu whuVar) {
        return new wyq(shfVar, ajoyVar, wpmVar, azrwVar, null, null, null, null);
    }

    public static snd a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 0);
    }

    public static JSEnvironment b(boolean z, tbt tbtVar, axpg axpgVar, azrw azrwVar, Map map) {
        return new snh(z, tbtVar, (sng) axpgVar.get(), azrwVar, map);
    }

    public static anic c(ammv ammvVar, anic anicVar, int i, int i2, sjp sjpVar, ammv ammvVar2, ammv ammvVar3) {
        return sid.a(anaf.C(sil.a(ammvVar3, sgf.j(i, ((Boolean) ammvVar2.e(false)).booleanValue(), sjpVar, sgf.k("Lite", sgf.l(sgf.f(), (ThreadFactory) ammvVar.e(shu.a(i2, pkr.b))))))), anicVar);
    }

    public static Set d(woy woyVar, wps wpsVar, wxt wxtVar, wwb wwbVar, wyk wykVar) {
        return new LinkedHashSet(Arrays.asList(woyVar, wpsVar, wxtVar, wwbVar, wykVar));
    }

    public static wuc e(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, Executor executor) {
        return new wuc(azrwVar, azrwVar2, azrwVar3, azrwVar4, executor);
    }

    public static yno f(yxx yxxVar, ScheduledExecutorService scheduledExecutorService, Executor executor, azrw azrwVar, azrw azrwVar2) {
        return new yno(yxxVar, scheduledExecutorService, executor, azrwVar, azrwVar2);
    }

    public static yrv g(yvu yvuVar, ConnectivityManager connectivityManager, azrw azrwVar, Object obj) {
        return new yrv(yvuVar, connectivityManager, azrwVar, (yrh) obj);
    }

    public static aafl h(Context context, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, anib anibVar) {
        return new aafl(context, azrwVar, azrwVar2, azrwVar3, anibVar);
    }

    public static snd i(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 1, (byte[]) null);
    }

    public static snd j(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 5, (boolean[]) null);
    }

    public static snd k(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 6, (float[]) null);
    }

    public static snd l(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new snd(azrwVar, azrwVar2, azrwVar4, azrwVar5, azrwVar6, 7, (byte[][]) null);
    }

    public static snd m(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 8, (char[][]) null);
    }

    public static snd n(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 9, (short[][]) null);
    }

    public static snd o(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 10, (int[][]) null);
    }

    public static snd p(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 11, (boolean[][]) null);
    }

    public static snd q(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 12, (float[][]) null);
    }

    public static snd r(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 13, (byte[][][]) null);
    }

    public static snd s(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 14, (char[][][]) null);
    }

    public static snd t(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 15, (short[][][]) null);
    }

    public static snd u(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 16, (int[][][]) null);
    }

    public static snd v(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 17, (boolean[][][]) null);
    }

    public static snd w(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 18, (float[][][]) null);
    }

    public static snd x(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 19, (byte[]) null, (byte[]) null);
    }

    public static snd y(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new snd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, 20, (char[]) null, (byte[]) null);
    }

    public static wps z(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, whu whuVar) {
        return new wps(azrwVar, azrwVar2, azrwVar3, azrwVar4);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.f) {
            case 0:
                return b(((Boolean) this.a.get()).booleanValue(), (tbt) this.b.get(), axqq.a(this.c), this.d, ((axqt) this.e).get());
            case 1:
                return c((ammv) ((axqs) this.c).a, (anic) this.a.get(), ots.g().intValue(), ots.f().intValue(), ((sju) this.d).get(), (ammv) ((axqs) this.b).a, (ammv) ((axqs) this.e).a);
            case 2:
                return new tqq(((trq) this.e).get(), (tme) this.b.get(), (vgz) this.a.get(), (Executor) this.d.get(), (tko) this.c.get());
            case 3:
                ((trq) this.a).get();
                return new tqi((shf) this.e.get(), (tme) this.b.get(), (vgz) this.c.get(), (Executor) this.d.get());
            case 4:
                return new tqq(((trq) this.e).get(), (tme) this.b.get(), (vgz) this.a.get(), (Executor) this.d.get(), (tko) this.c.get());
            case 5:
                return d((woy) this.a.get(), (wps) this.c.get(), (wxt) this.e.get(), (wwb) this.d.get(), (wyk) this.b.get());
            case 6:
                return z(this.b, this.e, this.c, this.d, (whu) this.a.get());
            case 7:
                return A(this.a, this.d, (Executor) this.e.get(), (Executor) this.b.get(), (whu) this.c.get());
            case 8:
                return e(this.a, this.e, this.c, this.d, (Executor) this.b.get());
            case 9:
                azrw azrwVar = this.e;
                azrw azrwVar2 = this.a;
                azrw azrwVar3 = this.c;
                azrw azrwVar4 = this.d;
                azrw azrwVar5 = this.b;
                amrw h = amrz.h();
                h.g(apae.SLOT_TYPE_BELOW_PLAYER, azrwVar);
                h.g(apae.SLOT_TYPE_IN_PLAYER, azrwVar3);
                h.g(apae.SLOT_TYPE_LOCKSCREEN, azrwVar4);
                h.g(apae.SLOT_TYPE_FIXED_FOOTER, azrwVar3);
                h.g(apae.SLOT_TYPE_FORECASTING, azrwVar2);
                h.g(apae.SLOT_TYPE_PLAYER_BYTES, azrwVar5);
                return h.c();
            case 10:
                azrw azrwVar6 = this.e;
                azrw azrwVar7 = this.c;
                azrw azrwVar8 = this.d;
                azrw azrwVar9 = this.a;
                azrw azrwVar10 = this.b;
                amrw h2 = amrz.h();
                h2.g(apae.SLOT_TYPE_BELOW_PLAYER, azrwVar6);
                h2.g(apae.SLOT_TYPE_IN_PLAYER, azrwVar7);
                h2.g(apae.SLOT_TYPE_LOCKSCREEN, azrwVar8);
                h2.g(apae.SLOT_TYPE_FORECASTING, azrwVar9);
                h2.g(apae.SLOT_TYPE_PLAYER_BYTES, azrwVar10);
                return h2.c();
            case 11:
                return C(this.e, this.c, (whu) this.a.get(), (yfl) this.d.get(), (wwm) this.b.get());
            case 12:
                azrw azrwVar11 = this.a;
                azrw azrwVar12 = this.b;
                azrw azrwVar13 = this.c;
                azrw azrwVar14 = this.e;
                return new wxv(azrwVar11, azrwVar12, azrwVar13, azrwVar14);
            case 13:
                azrw azrwVar15 = this.e;
                azrw azrwVar16 = this.b;
                azrw azrwVar17 = this.d;
                return B(azrwVar15, azrwVar16, azrwVar17, (whu) this.a.get());
            case 14:
                return D((shf) this.e.get(), (ajoy) this.d.get(), (wpm) this.c.get(), this.b, (whu) this.a.get());
            case 15:
                return new xbt((wni) ((axqs) this.e).a, (shf) this.a.get(), (zbw) this.d.get(), (ysy) this.c.get(), (aloh) this.b.get(), null, null);
            case 16:
                return f((yxx) this.c.get(), (ScheduledExecutorService) this.a.get(), (Executor) this.e.get(), this.b, this.d);
            case 17:
                yvu yvuVar = (yvu) this.b.get();
                ConnectivityManager connectivityManager = ((amdb) this.d).get();
                azrw azrwVar18 = this.c;
                return g(yvuVar, connectivityManager, azrwVar18, this.a.get());
            case 18:
                boolean booleanValue = xuq.c().booleanValue();
                azrw azrwVar19 = this.a;
                return new zfu(booleanValue, azrwVar19, (Executor) this.c.get(), (aloh) this.d.get(), ((zfv) this.b).get(), null, null, null);
            case 19:
                return new aabt((SharedPreferences) this.b.get(), (shf) this.a.get(), this.d, (yxx) this.e.get(), (Context) ((axqs) this.c).a);
            default:
                return h((Context) ((axqs) this.e).a, this.d, this.b, this.a, (anib) this.c.get());
        }
    }
}
