package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjj {
    public static int a;
    public static volatile Boolean b;
    private static String c;

    public static long A(long j) {
        return j / 1048576;
    }

    public static void B(int i, int i2) {
        String format;
        if (i < 0 || i > i2) {
            if (i < 0) {
                format = String.format("index (%s) must not be negative", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                format = String.format("index (%s) must not be greater than size (%s)", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(format);
        }
    }

    public static ViewGroup C(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().findViewById(R.id.interstitials_container);
        return viewGroup == null ? (ViewGroup) activity.getWindow().getDecorView() : viewGroup;
    }

    public static void D(SwipeLayout swipeLayout, List list) {
        swipeLayout.getClass();
        list.getClass();
        if (swipeLayout.g == null && list.isEmpty()) {
            return;
        }
        if (!(swipeLayout.g instanceof LinearLayout)) {
            LinearLayout linearLayout = new LinearLayout(swipeLayout.getContext());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            swipeLayout.k(linearLayout);
        }
        LinearLayout linearLayout2 = (LinearLayout) swipeLayout.g;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linearLayout2.addView((View) it.next(), new LinearLayout.LayoutParams(-2, -1));
            }
        }
        swipeLayout.h = !list.isEmpty();
    }

    public static double a(awhn awhnVar) {
        double c2 = c(awhnVar);
        Double.isNaN(c2);
        return c2 / 1000000.0d;
    }

    public static double b(awhn awhnVar) {
        if ((awhnVar.b & 32) == 0) {
            return 0.0d;
        }
        awhm awhmVar = awhnVar.h;
        if (awhmVar == null) {
            awhmVar = awhm.a;
        }
        double d = awhmVar.d;
        Double.isNaN(d);
        return d / 1000000.0d;
    }

    public static long c(awhn awhnVar) {
        return ((Long) awhnVar.pX(awho.c)).longValue();
    }

    public static awhl d(awhn awhnVar) {
        if ((awhnVar.b & 128) == 0) {
            return null;
        }
        awhi awhiVar = awhnVar.j;
        if (awhiVar == null) {
            awhiVar = awhi.a;
        }
        awhl awhlVar = awhiVar.e;
        return awhlVar == null ? awhl.a : awhlVar;
    }

    public static void e(aong aongVar) {
        if (aongVar.pY(awho.b) && ((Boolean) aongVar.pX(awho.b)).booleanValue()) {
            return;
        }
        aongVar.e(awho.b, true);
        awhm awhmVar = ((awhn) aongVar.instance).h;
        if (awhmVar == null) {
            awhmVar = awhm.a;
        }
        f(aongVar, awhmVar.b);
    }

    public static void f(aong aongVar, long j) {
        e(aongVar);
        awhn awhnVar = (awhn) aongVar.instance;
        if ((awhnVar.b & 32) != 0) {
            awhm awhmVar = awhnVar.h;
            if (awhmVar == null) {
                awhmVar = awhm.a;
            }
            long j2 = awhmVar.d;
            double floor = Math.floor(j / j2);
            double d = j2;
            Double.isNaN(d);
            long j3 = (long) (floor * d);
            aonk aonkVar = awho.c;
            awhm awhmVar2 = ((awhn) aongVar.instance).h;
            if (awhmVar2 == null) {
                awhmVar2 = awhm.a;
            }
            long j4 = awhmVar2.e;
            awhm awhmVar3 = ((awhn) aongVar.instance).h;
            if (awhmVar3 == null) {
                awhmVar3 = awhm.a;
            }
            aongVar.e(aonkVar, Long.valueOf(Math.max(j4, Math.min(awhmVar3.f, j3))));
            aongVar.e(awho.b, true);
        }
    }

    public static final bv g(asfw asfwVar) {
        yij yijVar = new yij();
        Bundle bundle = new Bundle();
        bundle.putByteArray("transaction_response", asfwVar.toByteArray());
        yijVar.af(bundle);
        return yijVar;
    }

    public static boolean h(int i) {
        return i == 1;
    }

    public static final bv i(avmv avmvVar) {
        avmvVar.getClass();
        ygn ygnVar = new ygn();
        Bundle bundle = new Bundle();
        bundle.putByteArray("UnlimitedFamilyMessageInterstitialRenderer", avmvVar.toByteArray());
        ygnVar.af(bundle);
        return ygnVar;
    }

    public static CharSequence j(awhq awhqVar) {
        return ajcq.k(" ", awhqVar.b.size() != 0 ? ajcq.p((aqyg[]) awhqVar.b.toArray(new aqyg[0])) : null);
    }

    public static String k(Context context) {
        long j;
        if (c == null) {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                j = rsb.h(contentResolver, 0L);
            } catch (SecurityException unused) {
                j = 0;
            }
            if (j != 0) {
                c = String.valueOf(j);
            } else {
                String string = Settings.Secure.getString(contentResolver, "android_id");
                if (string != null) {
                    c = string;
                } else {
                    c = String.valueOf(j);
                }
            }
        }
        return c;
    }

    public static Activity l(Context context) {
        for (int i = 0; i < 10000; i++) {
            context.getClass();
            if (!(context instanceof Service)) {
                if (!(context instanceof Application)) {
                    if (!(context instanceof Activity)) {
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            String valueOf = String.valueOf(context.getClass().getSimpleName());
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown Context type: ".concat(valueOf) : new String("Unknown Context type: "));
                        }
                    } else {
                        return (Activity) context;
                    }
                } else {
                    throw new IllegalArgumentException("Cannot get a singular Activity from an Application");
                }
            } else {
                throw new IllegalArgumentException("Cannot get an Activity from a Service");
            }
        }
        throw new IllegalStateException("Possible Context wrapper loop - chain of wrappers larger than 10000");
    }

    public static Application m(Context context) {
        for (int i = 0; i < 10000; i++) {
            context.getClass();
            if (!(context instanceof Application)) {
                if (!(context instanceof Service)) {
                    if (!(context instanceof Activity)) {
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = context.getApplicationContext();
                        }
                    } else {
                        return ((Activity) context).getApplication();
                    }
                } else {
                    return ((Service) context).getApplication();
                }
            } else {
                return (Application) context;
            }
        }
        throw new IllegalStateException("Possible Context wrapper loop - chain of wrappers larger than 10000");
    }

    public static ammv n(Context context) {
        for (int i = 0; i < 10000; i++) {
            if (context == null) {
                return amlr.a;
            }
            if (!(context instanceof Service) && !(context instanceof Application)) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        return amlr.a;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return ammv.j((Activity) context);
                }
            }
            return amlr.a;
        }
        return amlr.a;
    }

    public static Object o(Object obj, Class cls) {
        Object q = q(obj);
        if (q == null) {
            throw new IllegalArgumentException(String.format("%s does not extend %s or %s", obj.getClass().getCanonicalName(), edc.class.getCanonicalName(), axqk.class.getCanonicalName()));
        }
        return cls.cast(q);
    }

    public static Object p(Context context, Class cls) {
        return o(m(context), cls);
    }

    public static Object q(Object obj) {
        if (obj instanceof edc) {
            return ((edc) obj).a();
        }
        if (obj instanceof axqk) {
            return ((axqk) obj).lM();
        }
        return null;
    }

    public static Object r(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return (obj3 != null || map.containsKey(obj)) ? obj3 : obj2;
    }

    public static Object s(Map map, Object obj) {
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public static Object t(Map map, Object obj, Object obj2) {
        Object s = s(map, obj);
        return obj2.getClass().isInstance(s) ? s : obj2;
    }

    public static Object u(Map map, Object obj, Class cls) {
        Object s = s(map, obj);
        if (cls.isInstance(s)) {
            return cls.cast(s);
        }
        return null;
    }

    public static Set v(Map map, Object obj) {
        if (!map.containsKey(obj)) {
            return new HashSet();
        }
        return (Set) map.get(obj);
    }

    public static void w(Map map, Object obj, Object obj2) {
        Set set = (Set) map.get(obj);
        if (set == null) {
            set = new HashSet();
            map.put(obj, set);
        }
        set.add(obj2);
    }

    public static boolean x(Map map, Object obj, Object obj2) {
        if (!map.containsKey(obj) || !((Set) map.get(obj)).contains(obj2)) {
            return false;
        }
        ((Set) map.get(obj)).remove(obj2);
        return true;
    }

    public static Object[] y(Object[] objArr, Object... objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static void z(Map map, Object obj) {
        if (map.containsKey(obj)) {
            Set set = (Set) map.get(obj);
            if (set == null || set.isEmpty()) {
                map.remove(obj);
            }
        }
    }
}
