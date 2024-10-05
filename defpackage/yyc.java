package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyc implements yxx {
    private volatile String X;
    private volatile String a;

    public yyc(Context context, long[][] jArr) {
        if (jArr != null) {
            yyb yybVar = new yyb(jArr[0], jArr[1]);
            yybVar.d();
            File r = yxt.r(context);
            if (r != null) {
                File s = yxt.s(r);
                File q = yxt.q(r);
                yjk.v(s);
                yjk.v(q);
            }
            String[] strArr = {yybVar.a.a(), yybVar.b.a()};
            this.a = strArr[0];
            this.X = strArr[1];
            d(context).edit().putString("com.google.android.libraries.youtube.innertube.request.startup_experiments", this.X).apply();
            return;
        }
        this.X = e(context);
        this.a = this.X;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(String str, yxw yxwVar) {
        try {
            String i = i(str, yxwVar.a);
            return i == null ? ((Long) yxwVar.b).longValue() : Long.parseLong(i);
        } catch (Throwable unused) {
            return ((Long) yxwVar.b).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SharedPreferences.Editor c(SharedPreferences.Editor editor) {
        return editor.remove("com.google.android.libraries.youtube.innertube.request.startup_experiments");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SharedPreferences d(Context context) {
        return context.getSharedPreferences("youtube", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(Context context) {
        return d(context).getString("com.google.android.libraries.youtube.innertube.request.startup_experiments", null);
    }

    static String i(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            int length = str.length() - 2;
            int i = 0;
            while (i <= length) {
                int indexOf = str.indexOf(44, i);
                if (indexOf < 0) {
                    indexOf = str.length();
                }
                int length2 = str2.length() + i;
                if (length2 < indexOf && str.charAt(length2) == '=' && str.regionMatches(i, str2, 0, str2.length())) {
                    return str.substring(length2 + 1, indexOf);
                }
                i = indexOf + 1;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(String str, yxw yxwVar) {
        try {
            String i = i(str, yxwVar.a);
            return i == null ? ((Boolean) yxwVar.b).booleanValue() : Boolean.parseBoolean(i);
        } catch (Throwable unused) {
            return ((Boolean) yxwVar.b).booleanValue();
        }
    }

    @Override // defpackage.yxx
    public final /* synthetic */ int b(yxw yxwVar) {
        return yxu.a(this, yxwVar);
    }

    @Override // defpackage.yxx
    public final long f(yxw yxwVar) {
        return a(k(), yxwVar);
    }

    @Override // defpackage.yxx
    public final synchronized SharedPreferences.Editor g(SharedPreferences.Editor editor, apwy apwyVar, arfd arfdVar) {
        avdj avdjVar = apwyVar.u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        apev apevVar = avdjVar.g;
        if (apevVar == null) {
            apevVar = apev.a;
        }
        avdz avdzVar = arfdVar.y;
        if (avdzVar == null) {
            avdzVar = avdz.a;
        }
        atej atejVar = apwyVar.k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        avdy avdyVar = atejVar.x;
        if (avdyVar == null) {
            avdyVar = avdy.a;
        }
        asvu asvuVar = apwyVar.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        atej atejVar2 = apwyVar.k;
        if (atejVar2 == null) {
            atejVar2 = atej.a;
        }
        aqjf aqjfVar = atejVar2.j;
        if (aqjfVar == null) {
            aqjfVar = aqjf.a;
        }
        yya yyaVar = new yya();
        yyaVar.b(C, avdzVar.b);
        yyaVar.c(D, apevVar.b);
        yyaVar.b(E, apevVar.c);
        yyaVar.b(F, apevVar.d);
        yyaVar.b(I, apevVar.f);
        yyaVar.b(H, apevVar.h);
        yyaVar.c(G, apevVar.g);
        yyaVar.c(f280J, avdjVar.m);
        yyaVar.b(K, avdjVar.n);
        yyaVar.b(L, yyy.c(avdyVar));
        yxw yxwVar = M;
        atax ataxVar = apwyVar.n;
        if (ataxVar == null) {
            ataxVar = atax.a;
        }
        int cM = amkq.cM(ataxVar.ac);
        int i = 1;
        if (cM == 0) {
            cM = 1;
        }
        yyaVar.b(yxwVar, cM - 1);
        yxw yxwVar2 = N;
        aotz aotzVar = apwyVar.i;
        if (aotzVar == null) {
            aotzVar = aotz.a;
        }
        yyaVar.c(yxwVar2, aotzVar.d);
        yyaVar.c(O, asvuVar.cF);
        yyaVar.c(P, asvuVar.E);
        yxw yxwVar3 = Q;
        avdk avdkVar = avdyVar.i;
        if (avdkVar == null) {
            avdkVar = avdk.a;
        }
        yyaVar.b(yxwVar3, avdkVar.m);
        yxw yxwVar4 = R;
        int bM = amkq.bM(avdjVar.s);
        if (bM != 0) {
            i = bM;
        }
        yyaVar.b(yxwVar4, i - 1);
        yyaVar.b(S, aqjfVar.i);
        yxw yxwVar5 = T;
        atij atijVar = apwyVar.g;
        if (atijVar == null) {
            atijVar = atij.a;
        }
        atik atikVar = atijVar.b;
        if (atikVar == null) {
            atikVar = atik.a;
        }
        yyaVar.c(yxwVar5, atikVar.b);
        yyaVar.b(U, avdjVar.u);
        yxw yxwVar6 = V;
        avds avdsVar = avdyVar.o;
        if (avdsVar == null) {
            avdsVar = avds.a;
        }
        avdn avdnVar = avdsVar.b;
        if (avdnVar == null) {
            avdnVar = avdn.a;
        }
        yyaVar.b(yxwVar6, avdnVar.b);
        yxw yxwVar7 = W;
        avds avdsVar2 = avdyVar.o;
        if (avdsVar2 == null) {
            avdsVar2 = avds.a;
        }
        avdu avduVar = avdsVar2.c;
        if (avduVar == null) {
            avduVar = avdu.a;
        }
        yyaVar.b(yxwVar7, avduVar.b);
        this.X = yyaVar.a();
        return editor.putString("com.google.android.libraries.youtube.innertube.request.startup_experiments", this.X);
    }

    @Override // defpackage.yxx
    public final synchronized SharedPreferences.Editor h(SharedPreferences.Editor editor) {
        this.a = null;
        this.X = null;
        return c(editor);
    }

    @Override // defpackage.yxx
    public final synchronized Object j() {
        return new String[]{this.a, this.X};
    }

    final synchronized String k() {
        return this.a;
    }

    @Override // defpackage.yxx
    public final /* synthetic */ void l(int i) {
        int i2 = yxu.a;
    }

    @Override // defpackage.yxx
    public final boolean o(yxw yxwVar) {
        return m(k(), yxwVar);
    }
}
