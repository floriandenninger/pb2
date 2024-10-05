package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.backup.Backup;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yny {

    @Backup
    public static final String UPLOAD_NETWORK_POLICY = "upload_policy";

    @Backup
    public static final String VIDEO_QUALITY_PROMO_LAST_DISPLAYED = "video_quality_promo_last_displayed";
    public static volatile boolean a;

    public static void A(View view, azrw azrwVar, zhh zhhVar, Class cls) {
        view.getClass();
        azrwVar.getClass();
        zhhVar.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) azrwVar.get();
            layoutParams2.getClass();
            view.getContext();
            C(D(cls, layoutParams2), zhhVar);
            view.setLayoutParams(layoutParams2);
            return;
        }
        view.getContext();
        if (C(D(cls, layoutParams), zhhVar) || a) {
            view.setLayoutParams(layoutParams);
        }
    }

    public static void B(View view, int i, int i2) {
        A(view, new zhb(i, i2, 0), y(i, i2), ViewGroup.LayoutParams.class);
    }

    public static boolean C(ViewGroup.LayoutParams layoutParams, zhh zhhVar) {
        if (layoutParams == null) {
            return false;
        }
        return zhhVar.a(layoutParams);
    }

    public static ViewGroup.LayoutParams D(Class cls, ViewGroup.LayoutParams layoutParams) {
        try {
            return (ViewGroup.LayoutParams) cls.cast(layoutParams);
        } catch (ClassCastException e) {
            zga.f("SafeLayoutParams", String.format("Error casting %s", layoutParams), e);
            return null;
        }
    }

    public static final zhh E(ArrayDeque arrayDeque) {
        return new zhd(arrayDeque);
    }

    public static aomf F(aomf aomfVar, int i) {
        amkq.F(true, "fieldNumber must be > 0");
        aomk l = aomfVar.l();
        while (!l.E()) {
            try {
                int n = l.n();
                int a2 = aoqp.a(n);
                int b = aoqp.b(n);
                if (i != a2 || b != 2) {
                    l.G(n);
                } else {
                    aomfVar = l.x();
                    return aomfVar;
                }
            } catch (IOException unused) {
                String valueOf = String.valueOf(aomfVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Error while getting field ");
                sb.append(i);
                sb.append(" from ");
                sb.append(valueOf);
                zga.l(sb.toString());
                return null;
            }
        }
        return null;
    }

    public static aomf G(byte[] bArr, int i) {
        bArr.getClass();
        aomk O = aomk.O(bArr);
        while (true) {
            try {
                if (O.E()) {
                    break;
                }
                int n = O.n();
                if (i != aoqp.a(n)) {
                    O.G(n);
                } else if (aoqp.b(n) == 2) {
                    return O.x();
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Error while getting field ");
                sb.append(i);
                sb.append(": ");
                sb.append(valueOf);
                zga.l(sb.toString());
                return null;
            }
        }
        amkq.F(true, "fieldNumber must be > 0");
        return null;
    }

    public static aonm H(Parcel parcel, aonm aonmVar) {
        Object n;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            n = null;
        } else {
            try {
                n = aonmVar.getParserForType().n(createByteArray, aomw.b());
            } catch (aoob e) {
                throw new IllegalArgumentException(e);
            }
        }
        return n != null ? (aonm) n : aonmVar;
    }

    public static void I(aooy aooyVar, Parcel parcel) {
        parcel.writeByteArray(aooyVar.toByteArray());
    }

    public static boolean J(Parcel parcel) {
        return parcel.readInt() > 0;
    }

    public static String K(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String L(String str, String str2) {
        boolean z;
        zhq.m(str2);
        if (!badf.c(str) && !badf.c("%s")) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int indexOf = str.toString().indexOf("%s".toString(), i);
                if (indexOf == -1) {
                    break;
                }
                i2++;
                i = indexOf + "%s".length();
            }
            if (i2 == 1) {
                z = true;
                amkq.E(z);
                return K(str, str2);
            }
        }
        z = false;
        amkq.E(z);
        return K(str, str2);
    }

    public static int M() {
        return Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }

    public static int N(int i, int i2) {
        return i | (i2 << 6);
    }

    public static int O(int i) {
        return i & ((int) P(6));
    }

    static long P(int i) {
        return (1 << i) - 1;
    }

    static long Q(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static long R(int i) {
        return P(i >> 6);
    }

    public static long S(long j, int i) {
        return (j >> O(i)) & R(i);
    }

    public static long T(long j, int i, long j2, long j3, long j4) {
        return U(j, i, (Q(j2, j3, (R(i) * j4) + j3) - j3) / j4);
    }

    public static long U(long j, int i, long j2) {
        int O = O(i);
        long R = R(i);
        return (j & ((R << O) ^ (-1))) | ((Q(j2, 0L, R) & R) << O);
    }

    public static apdx a(apwy apwyVar) {
        apdn apdnVar = apwyVar.d;
        if (apdnVar == null) {
            apdnVar = apdn.a;
        }
        apdp apdpVar = apdnVar.e;
        if (apdpVar == null) {
            apdpVar = apdp.a;
        }
        if ((apdpVar.b & 1) != 0) {
            apdp apdpVar2 = apdnVar.e;
            if (apdpVar2 == null) {
                apdpVar2 = apdp.a;
            }
            apdx apdxVar = apdpVar2.c;
            return apdxVar == null ? apdx.a : apdxVar;
        }
        aone createBuilder = apdx.a.createBuilder();
        createBuilder.copyOnWrite();
        apdx apdxVar2 = (apdx) createBuilder.instance;
        apdxVar2.c = 2;
        apdxVar2.b |= 1;
        createBuilder.copyOnWrite();
        apdx apdxVar3 = (apdx) createBuilder.instance;
        apdxVar3.b |= 64;
        apdxVar3.f = true;
        createBuilder.copyOnWrite();
        apdx apdxVar4 = (apdx) createBuilder.instance;
        aony aonyVar = apdxVar4.g;
        if (!aonyVar.c()) {
            apdxVar4.g = aonm.mutableCopy(aonyVar);
        }
        apdxVar4.g.add("https://youtubei.googleapis.com/generate_204");
        aone createBuilder2 = apdw.a.createBuilder();
        createBuilder2.copyOnWrite();
        apdw apdwVar = (apdw) createBuilder2.instance;
        apdwVar.b |= 1;
        apdwVar.c = true;
        apdw apdwVar2 = (apdw) createBuilder2.build();
        createBuilder.copyOnWrite();
        apdx apdxVar5 = (apdx) createBuilder.instance;
        apdwVar2.getClass();
        apdxVar5.i = apdwVar2;
        apdxVar5.b |= 512;
        return (apdx) createBuilder.build();
    }

    public static void b(SQLiteOpenHelper sQLiteOpenHelper, long j) {
        if (Build.VERSION.SDK_INT >= 27) {
            sQLiteOpenHelper.setIdleConnectionTimeout(j);
        }
    }

    public static boolean c(cnq cnqVar) {
        return (cnqVar instanceof cnp) || (cnqVar instanceof cng);
    }

    public static ysl d(ysn ysnVar, cnd cndVar, ysm ysmVar, String str) {
        return ysnVar.b(cndVar, ysmVar, new ruj(3, (byte[]) null), null, str);
    }

    public static zic e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (zgx.a.d == null) {
                zgx.a.d = new zic(packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            }
            return zgx.a.d;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("PackageManager did not find our package name!", e);
        }
    }

    public static void f(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            context.startService(intent);
        } else {
            context.startForegroundService(intent);
        }
    }

    public static void g(Context context, String str) {
        String c = zgx.c(context);
        HashSet hashSet = new HashSet();
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (esv.M(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        esv.P("Beginning load of %s...", str);
        esv.Q(context, str, c, hashSet);
    }

    public static zhh h(zhh... zhhVarArr) {
        return new zhd(Arrays.asList(zhhVarArr));
    }

    public static zhh i(int i) {
        return new zhk(i, -1);
    }

    public static zhh j(int i, int i2) {
        return new zhk(i, i2);
    }

    public static zhh k(int i) {
        return new zhf(i, 1, (byte[]) null);
    }

    public static zhh l(ahe aheVar) {
        return new zhe(aheVar);
    }

    public static zhh m(int i) {
        return new zhf(i, 0);
    }

    public static zhh n(int i) {
        return new zhm(i, 1);
    }

    public static zhh o(int i) {
        return new zhf(i, 2, (char[]) null);
    }

    public static zhh p(int i) {
        return new zhf(i, 3);
    }

    public static zhh q(int i) {
        return new zhf(i, 4, (short[]) null);
    }

    public static zhh r(int i) {
        return new zhf(i, 5, (int[]) null);
    }

    public static zhh s(int i, int i2, int i3, int i4) {
        return new zhj(i, i2, i3, i4);
    }

    public static zhh t(int i) {
        return new zhk(i, 0);
    }

    public static zhh u(int i) {
        return new zhf(i, 6, (boolean[]) null);
    }

    public static zhh v(int i) {
        return new zhf(i, 7, (float[]) null);
    }

    public static zhh w(float f) {
        return new zhi(f);
    }

    public static zhh x(int i) {
        return new zhm(i, 0);
    }

    public static zhh y(int i, int i2) {
        return h(x(i), n(i2));
    }

    public static void z(final View view, zhh zhhVar, final Class cls) {
        if (view.getLayoutParams() == null) {
            return;
        }
        A(view, new azrw() { // from class: zhc
            @Override // defpackage.azrw
            public final Object get() {
                Class cls2 = cls;
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                view2.getContext();
                return yny.D(cls2, layoutParams);
            }
        }, zhhVar, cls);
    }
}
