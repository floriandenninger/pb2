package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aash implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final /* synthetic */ int e;

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i) {
        this.e = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.b = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[] cArr) {
        this.e = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, float[] fArr) {
        this.e = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, int[] iArr) {
        this.e = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, short[] sArr) {
        this.e = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[][] bArr) {
        this.e = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.b = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[][] cArr) {
        this.e = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.c = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, float[][] fArr) {
        this.e = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, int[][] iArr) {
        this.e = i;
        this.b = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.a = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, short[][] sArr) {
        this.e = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.a = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
        this.b = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.d = azrwVar3;
        this.a = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[][][] cArr) {
        this.e = i;
        this.d = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.b = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, float[][][] fArr) {
        this.e = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, int[][][] iArr) {
        this.e = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.b = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, short[][][] sArr) {
        this.e = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
    }

    public aash(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
        this.b = azrwVar4;
    }

    public static aash A(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 18, (int[][][]) null);
    }

    public static aash B(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 19, (boolean[][][]) null);
    }

    public static aash C(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 20, (float[][][]) null);
    }

    public static abfq D(Object obj, Object obj2, Object obj3, ajbh ajbhVar) {
        return new abfq((abfj) obj, (abfp) obj2, ajbhVar, null, null);
    }

    public static afkg E(ywr ywrVar, aypn aypnVar, aaea aaeaVar, axzg axzgVar) {
        return new afkg(ywrVar, aypnVar, aaeaVar, axzgVar, null, null);
    }

    public static aayb F(aarm aarmVar, ajoy ajoyVar, ysl yslVar) {
        return new aayb(aarmVar, ajoyVar, yslVar, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public static aash a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 0);
    }

    public static aaqr b(amnv amnvVar) {
        return new aaqr(amnvVar);
    }

    public static abfj c(SharedPreferences sharedPreferences, azrw azrwVar, azrw azrwVar2, Executor executor) {
        return new abfj(sharedPreferences, azrwVar, azrwVar2, executor);
    }

    public static aeeo d(aeei aeeiVar, aeeq aeeqVar, Executor executor, aeet aeetVar) {
        return new aeeo(aeeiVar, aeeqVar, executor, aeetVar);
    }

    public static aenj e(azrw azrwVar, ysy ysyVar, aaoz aaozVar) {
        return new aenj(azrwVar, ysyVar, aaozVar);
    }

    public static aeot f(ywr ywrVar, ScheduledExecutorService scheduledExecutorService, aaea aaeaVar, acpl acplVar) {
        return new aeot(ywrVar, scheduledExecutorService, aaeaVar, acplVar);
    }

    public static afrr g(afqd afqdVar, afsc afscVar, afsd afsdVar) {
        return new afrr(afqdVar, afscVar, afsdVar);
    }

    public static afsc h(afqd afqdVar, shf shfVar, yoi yoiVar, ynn ynnVar) {
        return new afsc(afqdVar, shfVar, yoiVar, ynnVar);
    }

    public static List i(aikb aikbVar, aikb aikbVar2, aikb aikbVar3, aikb aikbVar4) {
        amru u = amru.u(aikbVar, aikbVar2, aikbVar3, aikbVar4);
        ayaw.k(u);
        return u;
    }

    public static ahca j(afhz afhzVar) {
        return new ahca(afhzVar);
    }

    public static BandaidConnectionOpenerController k(aeie aeieVar, ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        return new BandaidConnectionOpenerController(aeieVar, ypaVar, aiocVar, aadwVar);
    }

    public static aash l(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar6, 1);
    }

    public static aash m(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 3, (char[]) null);
    }

    public static aash n(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 5, (int[]) null);
    }

    public static aash o(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 6, (boolean[]) null);
    }

    public static aash p(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 7);
    }

    public static aash q(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 8, (float[]) null);
    }

    public static aash r(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 9, (byte[][]) null);
    }

    public static aash s(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 10, (char[][]) null);
    }

    public static aash t(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 11, (short[][]) null);
    }

    public static aash u(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 12, (int[][]) null);
    }

    public static aash v(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 13, (boolean[][]) null);
    }

    public static aash w(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 14, (float[][]) null);
    }

    public static aash x(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 15, (byte[][][]) null);
    }

    public static aash y(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 16, (char[][][]) null);
    }

    public static aash z(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aash(azrwVar, azrwVar2, azrwVar3, azrwVar4, 17, (short[][][]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                return new aasg((aloh) this.a.get(), (ScheduledExecutorService) this.b.get(), (shf) this.c.get(), (aaea) this.d.get(), null, null);
            case 1:
                return b(((wmr) this.d).b());
            case 2:
                return new aatg((aarm) this.a.get(), ((aath) this.d).get(), (ysl) this.c.get(), (aadw) this.b.get(), null, null, null);
            case 3:
                aarm aarmVar = (aarm) this.a.get();
                ajoy ajoyVar = (ajoy) this.d.get();
                return new aayb(aarmVar, ajoyVar, (ysl) this.c.get(), (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 4:
                aarm aarmVar2 = (aarm) this.a.get();
                ajoy ajoyVar2 = (ajoy) this.d.get();
                return F(aarmVar2, ajoyVar2, (ysl) this.c.get());
            case 5:
                return new aaxn((aarm) this.a.get(), (ajoy) this.d.get(), (afsy) this.b.get(), (ysl) this.c.get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
            case 6:
                return new aaxn((aarm) this.a.get(), (ajoy) this.d.get(), (afsy) this.b.get(), (ysl) this.c.get(), null, null, null);
            case 7:
                return new aaxw((aarm) this.a.get(), (ajoy) this.b.get(), ((aacc) this.c).get(), ((aacb) this.d).get(), null, null, null);
            case 8:
                return new abab((aarm) this.a.get(), (ajoy) this.d.get(), (afsy) this.b.get(), (ysl) this.c.get(), null, null, null);
            case 9:
                return c((SharedPreferences) this.c.get(), this.a, this.d, (Executor) this.b.get());
            case 10:
                return D(this.b.get(), this.a.get(), this.d.get(), (ajbh) this.c.get());
            case 11:
                return d((aeei) this.b.get(), (aeeq) this.c.get(), (Executor) this.d.get(), (aeet) this.a.get());
            case 12:
                azrw azrwVar = this.b;
                ysy ysyVar = (ysy) this.d.get();
                aaoz aaozVar = (aaoz) this.c.get();
                return e(azrwVar, ysyVar, aaozVar);
            case 13:
                return new aenv((ysy) this.d.get(), (ywr) this.c.get(), (ScheduledExecutorService) this.a.get(), (aaea) this.b.get());
            case 14:
                return f((ywr) this.c.get(), (ScheduledExecutorService) this.b.get(), (aaea) this.a.get(), (acpl) this.d.get());
            case 15:
                return E((ywr) this.c.get(), (aypn) this.b.get(), (aaea) this.d.get(), (axzg) this.a.get());
            case 16:
                afqd afqdVar = (afqd) this.d.get();
                afsc afscVar = (afsc) this.a.get();
                afsd afsdVar = (afsd) this.c.get();
                return g(afqdVar, afscVar, afsdVar);
            case 17:
                return h((afqd) this.c.get(), (shf) this.b.get(), (yoi) this.a.get(), (ynn) this.d.get());
            case 18:
                return i((aikb) this.c.get(), (aikb) this.a.get(), (aikb) this.d.get(), (aikb) this.b.get());
            case 19:
                ahca j = j((afhz) this.d.get());
                j.b((aypn) this.c.get(), (aypn) this.a.get(), (aypn) this.b.get());
                return j;
            default:
                return k((aeie) this.b.get(), (ypa) this.a.get(), (aioc) this.c.get(), (aadw) this.d.get());
        }
    }
}
