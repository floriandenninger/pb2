package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.os.Parcel;
import android.os.StatFs;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjk {
    public static int a;
    private static int b;

    public static boolean A(int i, int i2, int i3) {
        return i2 <= i && i < i3;
    }

    public static boolean B(int i, int i2) {
        return i2 <= i && i <= 20;
    }

    public static List C(List list) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(null);
        arrayList.addAll(list);
        return arrayList;
    }

    public static zgg D(int i, Deque deque) {
        if (deque.size() == 1) {
            return (zgg) deque.getFirst();
        }
        amrp h = amru.h(deque.size());
        Iterator it = deque.iterator();
        while (it.hasNext()) {
            h.h(((zgf) it.next()).b);
        }
        return new zgh(i, h.g());
    }

    public static void E(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (!file.isDirectory()) {
                F(file);
            } else {
                File file2 = new File(file.getParentFile(), "_cleanup_mv0");
                int i = 0;
                while (file2.exists()) {
                    File parentFile = file.getParentFile();
                    i++;
                    StringBuilder sb = new StringBuilder(22);
                    sb.append("_cleanup_mv");
                    sb.append(i);
                    file2 = new File(parentFile, sb.toString());
                }
                if (true != file2.mkdir()) {
                    file2 = null;
                }
                if (file2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (File file3 : file.listFiles()) {
                        arrayList.add(file3.getAbsolutePath());
                    }
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("mv");
                        arrayList2.addAll(arrayList);
                        arrayList2.add(file2.getAbsolutePath());
                        af(arrayList2);
                    } catch (IOException | InterruptedException unused) {
                        zga.b("Could not move the root to the temp location");
                    }
                    ae(file2.getParentFile());
                }
            }
        } finally {
            ae(file.getParentFile());
        }
    }

    public static void F(File... fileArr) {
        int length;
        if (fileArr == null || (length = fileArr.length) == 0) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(length + 2);
            arrayList.add("rm");
            arrayList.add("-r");
            for (File file : fileArr) {
                arrayList.add(file.getAbsolutePath());
            }
            af(arrayList);
        } catch (IOException | InterruptedException e) {
            String valueOf = String.valueOf(fileArr[0]);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Unable to remove the files: ");
            sb.append(valueOf);
            zga.d(sb.toString(), e);
        }
    }

    public static final long G(File file) {
        if (file != null && file.exists()) {
            try {
                StatFs statFs = new StatFs(file.getAbsolutePath());
                return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            } catch (IllegalArgumentException unused) {
            }
        }
        return 0L;
    }

    public static final long H() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return G(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    public static float I(DisplayMetrics displayMetrics, float f) {
        displayMetrics.getClass();
        return f * displayMetrics.density;
    }

    public static float J(DisplayMetrics displayMetrics, float f) {
        displayMetrics.getClass();
        return (f / displayMetrics.density) + 0.5f;
    }

    public static int K(DisplayMetrics displayMetrics, int i) {
        displayMetrics.getClass();
        double d = i * displayMetrics.density;
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    public static int L(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int M(Context context) {
        context.getClass();
        return P(context.getResources().getDisplayMetrics(), N(context));
    }

    public static int N(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int O(Context context) {
        int ag = ag(context.getApplicationContext());
        if (ag == 0) {
            return 0;
        }
        if (ag < 480) {
            return 1;
        }
        if (ag < 600) {
            return 2;
        }
        return ag < 720 ? 3 : 4;
    }

    public static int P(DisplayMetrics displayMetrics, int i) {
        displayMetrics.getClass();
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public static Bitmap Q(Activity activity) {
        View rootView = activity.getWindow().getDecorView().getRootView();
        boolean isDrawingCacheEnabled = rootView.isDrawingCacheEnabled();
        rootView.setDrawingCacheEnabled(true);
        Bitmap drawingCache = rootView.getDrawingCache();
        if (drawingCache != null) {
            drawingCache = drawingCache.copy(Bitmap.Config.RGB_565, false);
        }
        if (!isDrawingCacheEnabled) {
            rootView.setDrawingCacheEnabled(false);
            rootView.destroyDrawingCache();
        }
        return drawingCache;
    }

    public static Pair R(Context context) {
        DisplayMetrics ah = ah(context);
        return Pair.create(Integer.valueOf(ah.widthPixels), Integer.valueOf(ah.heightPixels));
    }

    public static Pair S(Context context) {
        Pair T = T();
        return T == null ? R(context) : T;
    }

    public static Pair T() {
        String a2 = zhs.a("sys.display-size");
        if (a2 == null) {
            return null;
        }
        String[] split = a2.split("x");
        if (split.length != 2) {
            return null;
        }
        try {
            return Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static void U(Context context) {
        DisplayMetrics ah = ah(context);
        b = Math.min(ah.widthPixels, ah.heightPixels);
        a = Math.max(ah.widthPixels, ah.heightPixels);
    }

    public static boolean V(Context context, int i) {
        if (b == 0) {
            U(context);
        }
        return b >= i;
    }

    public static boolean W(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().touchscreen != 1;
    }

    @Deprecated
    public static boolean X(Context context) {
        int O = O(context);
        return O == 3 || O == 4;
    }

    public static boolean Y(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean Z(Context context) {
        return ag(context) >= 720;
    }

    public static boolean a(aaea aaeaVar) {
        arfd a2 = aaeaVar.a();
        if (a2 == null) {
            return false;
        }
        aqbc aqbcVar = a2.r;
        if (aqbcVar == null) {
            aqbcVar = aqbc.b;
        }
        return aqbcVar.d;
    }

    public static boolean aa(Context context) {
        return ag(context) >= 600;
    }

    public static boolean ab(int i) {
        Pair T = T();
        return (T == null ? 0 : Math.min(((Integer) T.first).intValue(), ((Integer) T.second).intValue())) >= i;
    }

    private static String ac(File file) {
        try {
            return file.exists() ? file.isDirectory() ? "dir" : "file" : "!exist";
        } catch (SecurityException e) {
            return e.getMessage();
        }
    }

    private static boolean ad(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                if (!file2.isDirectory() ? file2.delete() : ad(file2)) {
                    if (z) {
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    private static void ae(File file) {
        if (file == null || file.isFile()) {
            return;
        }
        F(file.listFiles(zfp.a));
    }

    private static void af(List list) {
        Runtime.getRuntime().exec((String[]) list.toArray(new String[list.size()])).waitFor();
    }

    private static int ag(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp;
    }

    private static DisplayMetrics ah(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static File b(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null || str == null) {
            return externalCacheDir;
        }
        File file = new File(externalCacheDir, str);
        file.mkdir();
        return file;
    }

    public static File c(String str, File file) {
        if (file == null || file.isDirectory()) {
            return file;
        }
        String path = file.getPath();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(path).length());
        sb.append(str);
        sb.append(": ");
        sb.append(path);
        sb.append(" is not a directory or does not exist.");
        zga.b(sb.toString());
        return null;
    }

    public static boolean d(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static void e() {
        if (h()) {
            throw new IllegalStateException("In application's main thread");
        }
    }

    public static void f() {
        if (g()) {
            throw new IllegalStateException("Not in application's main thread");
        }
    }

    public static boolean g() {
        return !h();
    }

    public static boolean h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void i(ynf ynfVar, Throwable th) {
        if (th != null) {
            ynfVar.c(th);
        }
    }

    public static int j(yxx yxxVar) {
        long f = yxxVar.f(yxx.U);
        if ((4 & f) != 0) {
            zga.h("ARBITER", "ARBITER_BG_4");
            return 4;
        }
        if ((8 & f) != 0) {
            zga.h("ARBITER", "ARBITER_BG_8");
            return 8;
        }
        if ((f & 16) != 0) {
            zga.h("ARBITER", "ARBITER_BG_12");
            return 12;
        }
        zga.h("ARBITER", "ARBITER_BG_16");
        return 16;
    }

    public static anic k(int i, int i2, String str, Collection collection) {
        yna ynaVar = new yna(i2, str.length() != 0 ? "yt-".concat(str) : new String("yt-"));
        if (collection == null || collection.isEmpty()) {
            return anaf.D(new ync(i, ynaVar));
        }
        ynh ynhVar = new ynh(i, ynaVar);
        ArrayList arrayList = new ArrayList(collection);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ynf ynfVar = (ynf) arrayList.get(i3);
            vak vakVar = ynhVar.b;
            if (!vakVar.a.contains(ynfVar)) {
                vakVar.a.add(ynfVar);
            }
        }
        return anaf.D(ynhVar);
    }

    public static Bundle l(byr byrVar) {
        int length;
        if (byrVar == null) {
            return Bundle.EMPTY;
        }
        byte[] d = byrVar.d("task_extras_key");
        if (d == null || (length = d.length) == 0) {
            return Bundle.EMPTY;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(d, 0, length);
        obtain.setDataPosition(0);
        Bundle bundle = new Bundle();
        bundle.readFromParcel(obtain);
        obtain.recycle();
        return bundle;
    }

    public static void n(bzi bziVar, int i, boolean z, Bundle bundle, aeqp aeqpVar, yle yleVar) {
        byte[] marshall;
        byn bynVar = new byn();
        bynVar.c = i != 1 ? i != 2 ? 1 : 3 : 2;
        bynVar.a = z;
        bziVar.d(bynVar.a());
        Bundle a2 = yleVar.a();
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (a2 != null) {
            bundle2.putAll(a2);
        }
        byr byrVar = null;
        if (bundle2.isEmpty()) {
            marshall = null;
        } else {
            Parcel obtain = Parcel.obtain();
            bundle2.writeToParcel(obtain, 0);
            marshall = obtain.marshall();
            obtain.recycle();
        }
        if (marshall != null) {
            HashMap hashMap = new HashMap();
            bxw.c("task_extras_key", marshall, hashMap);
            byrVar = bxw.a(hashMap);
        }
        if (byrVar != null) {
            bziVar.f(byrVar);
        }
        if (aeqpVar != null) {
            int i2 = aeqpVar.b == 0 ? 1 : 2;
            long j = aeqpVar.a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            bziVar.a = true;
            cda cdaVar = bziVar.c;
            cdaVar.s = i2;
            long millis = timeUnit.toMillis(j);
            if (millis > 18000000) {
                ajbh.X();
                ajbh.W(cda.a, "Backoff delay duration exceeds maximum value", new Throwable[0]);
                millis = 18000000;
            }
            if (millis < 10000) {
                ajbh.X();
                ajbh.W(cda.a, "Backoff delay duration less than minimum value", new Throwable[0]);
                millis = 10000;
            }
            cdaVar.m = millis;
        }
    }

    public static int o() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static Context p(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, zgz.a);
            i = obtainAttributes.getResourceId(0, i);
            obtainAttributes.recycle();
        }
        return i > 0 ? new ContextThemeWrapper(context, i) : context;
    }

    public static final String q() {
        return UUID.randomUUID().toString();
    }

    static void r(zfh zfhVar, String str, Throwable th) {
        if (zfhVar != null) {
            zfhVar.a(str, th);
        }
    }

    public static boolean s(File file) {
        try {
            return file.exists();
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean t(File file, File file2, zfh zfhVar) {
        try {
            if (file.renameTo(file2) || !file.exists()) {
                return true;
            }
            if (file2.exists() && file2.delete() && file.renameTo(file2)) {
                return true;
            }
            String ac = ac(file);
            String ac2 = ac(file2);
            StringBuilder sb = new StringBuilder(String.valueOf(ac).length() + 26 + String.valueOf(ac2).length());
            sb.append("!renameQuietly, src=");
            sb.append(ac);
            sb.append(", dst=");
            sb.append(ac2);
            r(zfhVar, sb.toString(), null);
            return false;
        } catch (SecurityException e) {
            r(zfhVar, "!renameQuietly", e);
            return false;
        }
    }

    public static void u(File file) {
        try {
            if (file.exists() && file.isDirectory()) {
                ad(file);
            }
        } catch (SecurityException unused) {
        }
    }

    public static void v(File file) {
        x(file, null);
    }

    public static OutputStream w(File file) {
        try {
            return new FileOutputStream(file, false);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return new FileOutputStream(file);
        }
    }

    public static void x(File file, zfh zfhVar) {
        try {
            if (file.delete() || !file.exists()) {
                return;
            }
            String valueOf = String.valueOf(ac(file));
            r(zfhVar, valueOf.length() != 0 ? "!deleteQuietly, ".concat(valueOf) : new String("!deleteQuietly, "), null);
        } catch (SecurityException e) {
            r(zfhVar, "!deleteQuietly", e);
        }
    }

    public static float y(float f, float f2, float f3) {
        return (Float.isNaN(f) || f <= f2) ? f2 : Math.min(f, f3);
    }

    public static long z(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static abd m(int i) {
        if (i != 1) {
            return i != 2 ? abd.h() : abd.g();
        }
        return abd.f();
    }
}
