package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class shr implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final /* synthetic */ int e;

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i) {
        this.e = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[] bArr, byte[] bArr2) {
        this.e = i;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
        this.a = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[] cArr) {
        this.e = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[] cArr, byte[] bArr) {
        this.e = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, float[] fArr) {
        this.e = i;
        this.d = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.b = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, int[] iArr) {
        this.e = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, short[] sArr) {
        this.e = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, boolean[] zArr) {
        this.e = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.c = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[][] bArr) {
        this.e = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[][] cArr) {
        this.e = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.d = azrwVar3;
        this.c = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, float[][] fArr) {
        this.e = i;
        this.d = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, int[][] iArr) {
        this.e = i;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
        this.a = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, short[][] sArr) {
        this.e = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.a = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.d = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.b = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[][][] cArr) {
        this.e = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, float[][][] fArr) {
        this.e = i;
        this.d = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
        this.a = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, int[][][] iArr) {
        this.e = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
        this.d = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, short[][][] sArr) {
        this.e = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.c = azrwVar4;
    }

    public shr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.c = azrwVar4;
    }

    public static shr A(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 17, (boolean[][][]) null);
    }

    public static shr B(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 18, (float[][][]) null);
    }

    public static shr C(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 19, (byte[]) null, (byte[]) null);
    }

    public static shr D(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 20, (char[]) null, (byte[]) null);
    }

    public static wox E(Executor executor, abds abdsVar, abdt abdtVar, whu whuVar) {
        return new wox(executor, abdsVar, abdtVar);
    }

    public static yrn F(azrw azrwVar, Object obj, axzg axzgVar, ayqi ayqiVar) {
        return new yrn(azrwVar, (yrh) obj, axzgVar, ayqiVar, null, null);
    }

    public static wcp G(aifh aifhVar, Context context, aloh alohVar, wkk wkkVar) {
        return new wcp(aifhVar, context, alohVar, wkkVar, null, null, null);
    }

    public static anic a(ammv ammvVar, int i, anic anicVar, sjp sjpVar, ammv ammvVar2) {
        final ThreadFactory threadFactory = (ThreadFactory) ammvVar.e(shu.a(i, pkr.b));
        ThreadFactory k = sgf.k("Blocking", new ThreadFactory() { // from class: shm
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return threadFactory.newThread(new iiz(runnable, 2));
            }
        });
        return sid.a(anaf.C(sil.a(ammvVar2, sgf.m(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), (ThreadFactory) (!sjpVar.a.h() ? amlr.a : ammv.j(new sji((sjq) sjpVar.a.c(), k))).e(k)))), anicVar);
    }

    public static shr b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 0);
    }

    public static svo c(ammv ammvVar, Context context, azrw azrwVar, ammv ammvVar2) {
        svo a = sve.a(ammvVar, context, azrwVar, ammvVar2);
        ayaw.k(a);
        return a;
    }

    public static DebuggerClient d(ammv ammvVar, String str, azrw azrwVar, Context context) {
        DebuggerClient b = sve.b(ammvVar, str, azrwVar, context);
        ayaw.k(b);
        return b;
    }

    public static wov e(azrw azrwVar, azrw azrwVar2, aatv aatvVar, ypa ypaVar) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new xhc(azrwVar));
        return new wov(aatvVar, arrayList, ypaVar);
    }

    public static wvu f(azrw azrwVar, azrw azrwVar2, amsx amsxVar, aaea aaeaVar) {
        return new wvu(azrwVar, azrwVar2, amsxVar, aaeaVar);
    }

    public static wvy g(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, Executor executor) {
        return new wvy(azrwVar, azrwVar2, azrwVar3, executor);
    }

    public static xhf h(Context context, aivs aivsVar, aivq aivqVar, aypn aypnVar) {
        return new xhf(context, aivsVar, aivqVar, aypnVar);
    }

    public static xhk i(aadw aadwVar, afuh afuhVar, afuh afuhVar2, shf shfVar) {
        return new xhk(aadwVar, afuhVar, afuhVar2, shfVar);
    }

    public static yxz j(Context context, Optional optional, azrw azrwVar, yyf yyfVar) {
        return new yxz(context, optional, azrwVar, yyfVar);
    }

    public static aakq k(aahv aahvVar, aais aaisVar, aakn aaknVar, aals aalsVar) {
        return new aakq(aahvVar, aaisVar, aaknVar, aalsVar);
    }

    public static shr l(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 1, (byte[]) null);
    }

    public static shr m(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 2, (char[]) null);
    }

    public static shr n(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 3, (short[]) null);
    }

    public static shr o(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 5, (boolean[]) null);
    }

    public static shr p(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 6, (float[]) null);
    }

    public static shr q(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 7, (byte[][]) null);
    }

    public static shr r(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 8, (char[][]) null);
    }

    public static shr s(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 9, (short[][]) null);
    }

    public static shr t(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 10, (int[][]) null);
    }

    public static shr u(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 11, (boolean[][]) null);
    }

    public static shr v(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 12, (float[][]) null);
    }

    public static shr w(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 13, (byte[][][]) null);
    }

    public static shr x(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 14, (char[][][]) null);
    }

    public static shr y(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 15, (short[][][]) null);
    }

    public static shr z(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new shr(azrwVar, azrwVar2, azrwVar3, azrwVar4, 16, (int[][][]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                return a((ammv) ((axqs) this.a).a, ots.e().intValue(), (anic) this.b.get(), ((sju) this.c).get(), (ammv) ((axqs) this.d).a);
            case 1:
                return new osu((ynn) this.b.get(), (afrw) this.a.get(), (afrz) this.c.get(), ((ykc) this.d).get());
            case 2:
                return c((ammv) this.c.get(), (Context) ((axqs) this.b).a, this.a, (ammv) this.d.get());
            case 3:
                return d((ammv) this.a.get(), ((yjv) this.c).b(), this.b, (Context) ((axqs) this.d).a);
            case 4:
                return G((aifh) this.c.get(), (Context) ((axqs) this.a).a, ((yjw) this.b).get(), (wkk) this.d.get());
            case 5:
                return e(this.b, this.a, (aatv) this.d.get(), (ypa) this.c.get());
            case 6:
                return E((Executor) this.d.get(), (abds) this.a.get(), (abdt) this.c.get(), (whu) this.b.get());
            case 7:
                return f(this.b, this.a, (amsx) this.c.get(), (aaea) this.d.get());
            case 8:
                return g(this.a, this.b, this.d, (Executor) this.c.get());
            case 9:
                return new wwn(this.b, ((axqw) this.c).get(), this.d, (CopyOnWriteArrayList) this.a.get());
            case 10:
                return h((Context) ((axqs) this.d).a, (aivs) this.c.get(), (aivq) this.b.get(), (aypn) this.a.get());
            case 11:
                return i((aadw) this.b.get(), (afuh) this.c.get(), (afuh) this.a.get(), (shf) this.d.get());
            case 12:
                return new xho((xhk) this.d.get(), (afsy) this.a.get(), (Executor) this.b.get(), (afxf) this.c.get());
            case 13:
                return wbs.C((Context) ((axqs) this.d).a, this.a, ((yjv) this.c).b(), (anic) this.b.get());
            case 14:
                return F(this.c, this.b.get(), (axzg) this.a.get(), (ayqi) this.d.get());
            case 15:
                return new yth((ynx) this.b.get(), (Context) ((axqs) this.a).a, (ExecutorService) this.d.get(), (ExecutorService) this.c.get());
            case 16:
                return new ytw(this.b, this.c, this.a, (ynx) this.d.get());
            case 17:
                yxz j = j((Context) ((axqs) this.b).a, (Optional) ((axqs) this.a).a, this.d, (yyf) this.c.get());
                j.c();
                return j;
            case 18:
                return whl.L((Context) ((axqs) this.d).a, ((yjv) this.c).b(), (anib) this.b.get(), (vfg) this.a.get());
            case 19:
                return whl.M((Context) ((axqs) this.d).a, ((yjv) this.c).b(), (anib) this.b.get(), (vfg) this.a.get());
            default:
                return k((aahv) this.b.get(), (aais) this.c.get(), (aakn) this.a.get(), (aals) this.d.get());
        }
    }
}
