package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgf {
    public static volatile aych a;

    public static awmt A(LottieAnimationView lottieAnimationView) {
        aone createBuilder = awmt.a.createBuilder();
        boolean o = lottieAnimationView.o();
        createBuilder.copyOnWrite();
        awmt awmtVar = (awmt) createBuilder.instance;
        awmtVar.c |= 1;
        awmtVar.d = o;
        float c = lottieAnimationView.d.c();
        createBuilder.copyOnWrite();
        awmt awmtVar2 = (awmt) createBuilder.instance;
        awmtVar2.c |= 2;
        awmtVar2.e = c;
        return (awmt) createBuilder.build();
    }

    public static awpu B(LottieAnimationView lottieAnimationView) {
        return C(null, A(lottieAnimationView));
    }

    public static awpu C(awpu awpuVar, awmt awmtVar) {
        aong aongVar;
        if (awpuVar != null) {
            aongVar = (aong) awpu.a.createBuilder(awpuVar);
        } else {
            aongVar = (aong) awpu.a.createBuilder();
        }
        aongVar.e(awmt.b, awmtVar);
        return (awpu) aongVar.build();
    }

    public static void D() {
        aoes.c("elements", new String[0]);
    }

    public static int E(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static View F(bv bvVar) {
        amkq.F(bvVar.d != null, "Wrap OnShowListener with SyntheticDialogs#whileDialogExists");
        return bvVar.d.getWindow().findViewById(R.id.content);
    }

    public static tga G() {
        amkq.E(true);
        aonk aonkVar = tin.a;
        aone createBuilder = tim.a.createBuilder();
        createBuilder.copyOnWrite();
        tim timVar = (tim) createBuilder.instance;
        timVar.b = 1 | timVar.b;
        timVar.c = "obake_android";
        return tga.a(aonkVar, (tim) createBuilder.build());
    }

    public static tga H(long j) {
        aonk aonkVar = tih.a;
        aone createBuilder = thq.a.createBuilder();
        createBuilder.copyOnWrite();
        thq thqVar = (thq) createBuilder.instance;
        thqVar.b |= 1;
        thqVar.c = j;
        return tga.b(aonkVar, (thq) createBuilder.build());
    }

    public static andp I(thg thgVar, boolean z) {
        List b = thgVar.b();
        for (int i = !z ? 1 : 0; i < b.size(); i++) {
            tgf tgfVar = (tgf) b.get(i);
            ando andoVar = tgfVar.d;
            if (andoVar == null) {
                andoVar = ando.a;
            }
            if ((andoVar.b & 2048) != 0) {
                ando andoVar2 = tgfVar.d;
                if (andoVar2 == null) {
                    andoVar2 = ando.a;
                }
                andp andpVar = andoVar2.e;
                return andpVar == null ? andp.a : andpVar;
            }
        }
        return null;
    }

    public static anhy J() {
        return anaf.O(null);
    }

    public static anhy K() {
        return anaf.O(aomt.a);
    }

    public static anhy L() {
        return anaf.O(null);
    }

    public static tgf M(thg thgVar) {
        return (tgf) thgVar.b().get(r1.size() - 1);
    }

    public static tgf N(thg thgVar) {
        return (tgf) thgVar.b().get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void O(tgb tgbVar, List list) {
        while (tgbVar != null) {
            tgb tgbVar2 = tgbVar;
            tgf a2 = tgbVar2.a();
            if (a2 != null) {
                ando andoVar = a2.d;
                if (andoVar == null) {
                    andoVar = ando.a;
                }
                amkq.O((andoVar.b & 8) != 0, "Instrumented view has no VE ID.");
                list.add(a2);
            }
            Object c = tgbVar2.a.c();
            if (c == 0) {
                amkq.Q(tgbVar2.a.n() || a2.pY(tin.a), "Activity's content root (android.R.id.content) must be annotated with a VE. CVE root was: %s", tgbVar);
                return;
            }
            tgbVar = c;
        }
    }

    public static int P(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static tga Q(String str) {
        amkq.E(str.contains("@"));
        aonk aonkVar = tgq.a;
        aone createBuilder = tgp.a.createBuilder();
        createBuilder.copyOnWrite();
        tgp tgpVar = (tgp) createBuilder.instance;
        tgpVar.d = 1;
        tgpVar.b |= 2;
        createBuilder.copyOnWrite();
        tgp tgpVar2 = (tgp) createBuilder.instance;
        str.getClass();
        tgpVar2.b = 1 | tgpVar2.b;
        tgpVar2.c = str;
        return tga.a(aonkVar, (tgp) createBuilder.build());
    }

    public static tga R(int i) {
        amkq.E(i >= 0);
        aonk aonkVar = thd.a;
        aone createBuilder = thf.a.createBuilder();
        createBuilder.copyOnWrite();
        thf thfVar = (thf) createBuilder.instance;
        thfVar.b = 1 | thfVar.b;
        thfVar.c = i;
        return tga.b(aonkVar, (thf) createBuilder.build());
    }

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static sgw b(Iterable iterable) {
        return new sgz(iterable);
    }

    public static Set c(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        int length = clsArr.length;
        for (int i = 0; i < 14; i++) {
            for (Field field : clsArr[i].getDeclaredFields()) {
                if (field.isAnnotationPresent(cls) && field.getType().equals(String.class)) {
                    try {
                        hashSet.add((String) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
        }
        return hashSet;
    }

    public static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int e(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static final StrictMode.ThreadPolicy f() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static anic g(anic anicVar) {
        return new sig(anicVar);
    }

    public static int h(ammv ammvVar) {
        return ((Integer) ammvVar.e(4)).intValue();
    }

    public static int i() {
        return Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
    }

    public static ExecutorService j(int i, boolean z, sjp sjpVar, ThreadFactory threadFactory) {
        ammv j = !sjpVar.a.h() ? amlr.a : ammv.j(new sjo(threadFactory));
        if (j.h()) {
            threadFactory = (ThreadFactory) j.c();
        }
        ThreadFactory threadFactory2 = threadFactory;
        if (z) {
            final sin sinVar = new sin(i, threadFactory2);
            return j.h() ? sjpVar.a((sjo) j.c(), sinVar, new sjj() { // from class: shi
                @Override // defpackage.sjj
                public final int a() {
                    return sin.this.b.get();
                }
            }) : sinVar;
        }
        final ThreadPoolExecutor m = m(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory2);
        return j.h() ? sjpVar.a((sjo) j.c(), m, new sjj() { // from class: shj
            @Override // defpackage.sjj
            public final int a() {
                return m.getQueue().size();
            }
        }) : m;
    }

    public static ThreadFactory k(String str, ThreadFactory threadFactory) {
        anio anioVar = new anio();
        anioVar.c(true);
        anioVar.d(str.concat(" Thread #%d"));
        anioVar.b = threadFactory;
        return anio.b(anioVar);
    }

    public static ThreadFactory l(final StrictMode.ThreadPolicy threadPolicy, final ThreadFactory threadFactory) {
        return new ThreadFactory() { // from class: shn
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                ThreadFactory threadFactory2 = threadFactory;
                final StrictMode.ThreadPolicy threadPolicy2 = threadPolicy;
                return threadFactory2.newThread(new Runnable() { // from class: shk
                    @Override // java.lang.Runnable
                    public final void run() {
                        StrictMode.ThreadPolicy threadPolicy3 = threadPolicy2;
                        Runnable runnable2 = runnable;
                        StrictMode.setThreadPolicy(threadPolicy3);
                        runnable2.run();
                    }
                });
            }
        };
    }

    public static ThreadPoolExecutor m(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        return new shp(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }

    public static Uri n(String str) {
        Uri parse = Uri.parse(str);
        return ammx.e(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : parse;
    }

    public static ImageView.ScaleType o(int i) {
        return i != 2 ? i != 3 ? i != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.CENTER_INSIDE;
    }

    public static boolean p(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        return (context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null && p(baseContext);
    }

    public static con q(Context context, aoam aoamVar, aoam aoamVar2, aoam aoamVar3, int i, int i2) {
        cxu cxuVar;
        if (p(context)) {
            return null;
        }
        con d = (aoamVar.aa() != 0 || aoamVar.aC() == null) ? null : cnv.c(context).d(new BitmapDrawable(context.getResources(), Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
        if (d == null) {
            axov ad = rwh.ad(aoamVar, i, i2);
            d = (ad == null || TextUtils.isEmpty(ad.m())) ? null : cnv.c(context).c().f(n(ad.m()));
        }
        if (d == null) {
            int c = swc.c(context, aoamVar);
            d = c == 0 ? null : cnv.c(context).e(Integer.valueOf(c));
        }
        if (d == null) {
            ammv u = u(aoamVar);
            d = u.h() ? cnv.c(context).g((byte[]) u.c()) : null;
        }
        if (d == null) {
            if (aoamVar3 == null) {
                return null;
            }
            d = cnv.c(context).f(null);
        }
        if (aoamVar.Y() == 4) {
            ((con) d.u(csk.b)).E(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        } else {
            if (aoamVar.Y() == 2) {
                cxuVar = cxu.b;
            } else {
                cxuVar = cxu.c;
            }
            d.w(cxuVar);
        }
        if (aoamVar2 != null) {
            int c2 = swc.c(context, aoamVar2);
            if (c2 != 0) {
                d.F(c2);
            } else {
                ammv u2 = u(aoamVar2);
                if (u2.h()) {
                    d.G(s(context, (byte[]) u2.c()));
                }
            }
        }
        if (aoamVar3 != null) {
            int c3 = swc.c(context, aoamVar3);
            if (c3 != 0) {
                d.x(c3);
            } else {
                ammv u3 = u(aoamVar3);
                if (u3.h()) {
                    d.y(s(context, (byte[]) u3.c()));
                }
            }
        }
        return d;
    }

    public static void r(Drawable drawable, aoam aoamVar) {
        if (aoamVar.aa() != 0) {
            if (aoamVar.ab(0).aK() == null || aoamVar.ab(0).aK().r() == 0) {
                return;
            }
            drawable.setColorFilter(aoamVar.ab(0).aK() != null ? (int) aoamVar.ab(0).aK().r() : 0, PorterDuff.Mode.SRC_IN);
        }
    }

    public static Drawable s(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static ammv t(awpf awpfVar) {
        for (int i = 0; i < awpfVar.c.size(); i++) {
            awph awphVar = (awph) awpfVar.c.get(i);
            if (awphVar.c == 2) {
                return ammv.j(((aomf) awphVar.d).I());
            }
        }
        return amlr.a;
    }

    public static ammv u(aoam aoamVar) {
        for (int i = 0; i < aoamVar.aa(); i++) {
            axov ab = aoamVar.ab(i);
            int b = ab.b(6);
            if (b != 0 && ab.d(b) != 0) {
                ByteBuffer i2 = ab.i(6);
                byte[] bArr = new byte[i2.remaining()];
                i2.get(bArr);
                return ammv.j(bArr);
            }
        }
        return amlr.a;
    }

    public static aypy v(sui suiVar, int i, amrz amrzVar, sxd sxdVar, aypy aypyVar) {
        if (!amrzVar.isEmpty()) {
            try {
                amrw h = amrz.h();
                HashMap hashMap = new HashMap();
                aomk O = aomk.O(suiVar.a);
                while (!O.E()) {
                    int n = O.n();
                    int a2 = aoqp.a(n);
                    if (aoqp.b(n) == 2) {
                        hashMap.put(Integer.valueOf(a2), O.H());
                    } else {
                        O.G(n);
                    }
                }
                amxd listIterator = amrzVar.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    String str = (String) entry.getKey();
                    byte[] bArr = (byte[]) hashMap.get(Integer.valueOf(((Integer) entry.getValue()).intValue()));
                    if (bArr == null) {
                        bArr = syc.a;
                    }
                    h.g(str, bArr);
                }
                amrz c = h.c();
                amsx<String> keySet = amrzVar.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                for (String str2 : keySet) {
                    fjx fjxVar = new fjx(str2, 10);
                    if (aypyVar == null || !"/environment".equals(str2)) {
                        arrayList.add(sxdVar.a(str2).Y(fjxVar));
                    } else {
                        arrayList.add(aypyVar.Y(suj.b).Y(fjxVar));
                    }
                }
                return aypy.l(arrayList, new sup(c, 1)).Y(new suh(i, amrzVar, suiVar));
            } catch (IOException e) {
                throw new syf("Failed to process default model", e);
            }
        }
        return azrh.aN(suiVar.b(i));
    }

    public static int w(int i) {
        if (i != 1) {
            return i != 3 ? 1 : 0;
        }
        return 2;
    }

    public static void x(sxc sxcVar) {
        awpj c = sxcVar.c();
        syg b = sxcVar.b();
        if (b == null || c == null) {
            return;
        }
        b.a(c, 3);
    }

    public static void y(View view, sww swwVar, awnw awnwVar, syb sybVar, sxs sxsVar, awpq awpqVar) {
        sws a2 = swu.a();
        a2.a = view;
        a2.h = sybVar;
        a2.f = sxsVar;
        if (awpqVar != null) {
            aone createBuilder = awpt.a.createBuilder();
            createBuilder.copyOnWrite();
            awpt awptVar = (awpt) createBuilder.instance;
            awptVar.d = awpqVar;
            awptVar.c |= 1;
            awpt awptVar2 = (awpt) createBuilder.build();
            aong aongVar = (aong) awpu.a.createBuilder();
            aongVar.e(awpt.b, awptVar2);
            a2.e = (awpu) aongVar.build();
        }
        swwVar.b(awnwVar, a2.a()).Q();
    }

    public static axpe z(axot axotVar, Boolean bool) {
        int b;
        aoaj aoajVar = new aoaj(0);
        axoh axohVar = new axoh();
        int b2 = axotVar.b(8);
        axoh axohVar2 = null;
        if (b2 != 0) {
            axohVar.f(axotVar.a(b2 + axotVar.a), axotVar.b);
        } else {
            axohVar = null;
        }
        int a2 = szz.a(aoajVar, axohVar);
        axoh axohVar3 = new axoh();
        int b3 = axotVar.b(10);
        if (b3 != 0) {
            axohVar3.f(axotVar.a(b3 + axotVar.a), axotVar.b);
        } else {
            axohVar3 = null;
        }
        int a3 = szz.a(aoajVar, axohVar3);
        axoh axohVar4 = new axoh();
        int b4 = axotVar.b(4);
        if (b4 != 0) {
            axohVar4.f(axotVar.a(b4 + axotVar.a), axotVar.b);
            axohVar2 = axohVar4;
        }
        int a4 = szz.a(aoajVar, axohVar2);
        long j = 0;
        if (!bool.booleanValue() && (b = axotVar.b(6)) != 0) {
            j = 4294967295L & axotVar.b.getInt(b + axotVar.a);
        }
        aoajVar.k(axpe.aI(aoajVar, a4, j, a2, a3));
        return axpe.aM(aoajVar.f());
    }
}
