package defpackage;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.yoga.YogaEdge;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rwh {
    public static szl b;

    public rwh() {
    }

    public rwh(Context context) {
        context.getPackageName();
        AccountManager.get(context);
    }

    public static List A(List list, sbo sboVar) {
        if (list instanceof RandomAccess) {
            return new sbr(list, sboVar);
        }
        return new sbq(list, sboVar);
    }

    public static sba C(String str, List list, List list2) {
        Double valueOf;
        sbt.c(list.size() == list2.size(), "domains and measures must be the same length");
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (number == null || (number instanceof Double)) {
                arrayList.add((Double) number);
            } else {
                arrayList.add(Double.valueOf(number.doubleValue()));
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Double valueOf2 = Double.valueOf(Double.NEGATIVE_INFINITY);
        Iterator it2 = list.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            Number number2 = (Number) it2.next();
            if (number2 instanceof Double) {
                valueOf = (Double) number2;
            } else {
                valueOf = Double.valueOf(number2.doubleValue());
            }
            arrayList2.add(valueOf);
            z &= valueOf.doubleValue() > valueOf2.doubleValue();
            valueOf2 = valueOf;
        }
        if (!z) {
            ArrayList z2 = z(arrayList2.size());
            for (int i = 0; i < arrayList2.size(); i++) {
                z2.add(new sbl((Double) arrayList2.get(i), (Double) arrayList.get(i)));
            }
            sba sbaVar = new sba(str, z2);
            sbd.c(sbaVar);
            Log.w("Aplos.SeriesFactory", String.format("Numeric Series %s is not in domain order. Presort this series for increases performance.", sbaVar.b));
            Collections.sort(sbaVar.a, new sbk(sbaVar.c(sax.c)));
            return sbaVar;
        }
        sba sbaVar2 = new sba(str, new sbi(new sbj(arrayList, arrayList2), arrayList2.size()));
        sbd.c(sbaVar2);
        return sbaVar2;
    }

    public static sba D(String str, List list, List list2) {
        sbt.c(list.size() == list2.size(), "domains and measures must be the same length");
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (number == null || (number instanceof Double)) {
                arrayList.add((Double) number);
            } else {
                arrayList.add(Double.valueOf(number.doubleValue()));
            }
        }
        sba sbaVar = new sba(str, new sbi(new sbe(arrayList, list), list.size()));
        sbaVar.f(sax.d, new sbc(2));
        sbaVar.f(sax.a, new sbc(3));
        return sbaVar;
    }

    public static sba E(String str) {
        return new sba(str, x());
    }

    public static int F(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static tej G(tdu tduVar) {
        return new tem(tduVar);
    }

    public static tej H(String str) {
        return new tel(str);
    }

    public static tej I(tdu tduVar, Set set) {
        return new teo(tduVar, set, 0);
    }

    public static tej J(tdu tduVar, DecimalFormat decimalFormat) {
        return new ten(tduVar, decimalFormat, 1);
    }

    public static tej K(tdu tduVar) {
        return L(tduVar, null);
    }

    public static tej L(tdu tduVar, Set set) {
        return new teo(tduVar, set, 1);
    }

    public static tej M(final tdu tduVar, final Set set, final boolean z) {
        return new tej() { // from class: tek
            @Override // defpackage.tej
            public final String a(Map map) {
                tdu tduVar2 = tdu.this;
                Set set2 = set;
                boolean z2 = z;
                Iterable<Number> P = rwh.P(map.get(tduVar2));
                if (set2 != null) {
                    P = rwh.O(P, set2, z2);
                }
                if (P == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (Number number : P) {
                    if (number.longValue() != 0) {
                        sb.append(number);
                    }
                    sb.append(",");
                }
                return sb.substring(0, sb.length() - 1);
            }
        };
    }

    public static tej N(tdu tduVar, DecimalFormat decimalFormat) {
        return new ten(tduVar, decimalFormat, 0);
    }

    public static amru O(Iterable iterable, Set set, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (iterable == null) {
            return null;
        }
        int i = 0;
        if (z) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                if (set.contains(Integer.valueOf(i))) {
                    arrayList.add(number);
                }
                i++;
            }
        } else {
            Iterator it2 = iterable.iterator();
            long j = 0;
            while (it2.hasNext()) {
                Number number2 = (Number) it2.next();
                if (set.contains(Integer.valueOf(i))) {
                    arrayList.add(Long.valueOf(j + number2.longValue()));
                    j = 0;
                } else {
                    j += number2.longValue();
                }
                i++;
            }
        }
        return amru.o(arrayList);
    }

    public static Iterable P(Object obj) {
        if (obj instanceof Object[]) {
            return Arrays.asList((Number[]) obj);
        }
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        return null;
    }

    public static Activity R(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String S(Map map, Map map2, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : map2.keySet()) {
            String a = ((tej) map2.get(str3)).a(map);
            if (a != null) {
                arrayList.add(String.format("%s=%s", str3, a));
            }
        }
        String join = TextUtils.join("&", arrayList);
        if (str == null) {
            return join;
        }
        String valueOf = String.valueOf(join);
        String valueOf2 = String.valueOf(str2);
        String bu = bu(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (bu == null) {
            return join;
        }
        String valueOf3 = String.valueOf(join);
        String valueOf4 = String.valueOf(String.format("&%s=%s", str, bu.substring(bu.length() - 8)));
        return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
    }

    public static int T(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
            default:
                return 0;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
        }
    }

    public static void U() {
        V(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }

    public static void V(boolean z, String str) {
        if (z) {
            return;
        }
        bv(new IllegalStateException(str));
    }

    public static void W(Object obj) {
        if (obj == null) {
            bv(new NullPointerException());
        }
    }

    public static tcu X(Context context) {
        return new tcu(qzt.a(context));
    }

    public static anhy Y(rpt rptVar) {
        final SettableFuture f = SettableFuture.f();
        rptVar.m(angq.a, new rpi() { // from class: tcp
            @Override // defpackage.rpi
            public final void a(rpt rptVar2) {
                SettableFuture settableFuture = SettableFuture.this;
                if (((rpx) rptVar2).c) {
                    settableFuture.cancel(false);
                    return;
                }
                if (rptVar2.k()) {
                    settableFuture.o(rptVar2.g());
                    return;
                }
                Exception f2 = rptVar2.f();
                if (f2 != null) {
                    settableFuture.e(f2);
                    return;
                }
                throw new IllegalStateException();
            }
        });
        return f;
    }

    public static Intent Z(anyx anyxVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("google://lens"));
        intent.setPackage(("userdebug".equals(Build.TYPE) && vcq.b()) ? "com.google.android.apps.search.lens.standalone" : "com.google.android.googlequicksearchbox");
        anyxVar.a.putLong("start_activity_time_nanos", SystemClock.elapsedRealtimeNanos());
        intent.putExtra("lens_activity_params", anyxVar.a);
        if (anyxVar.a.containsKey("handover_session_id") && anyxVar.l() != 0) {
            intent.putExtra("handover-session-id", anyxVar.l());
        }
        return intent;
    }

    public static String aA(tlg tlgVar, Context context, tme tmeVar) {
        tpr tprVar = tpr.NEW_FILE_KEY;
        int ordinal = bf(context, tmeVar).ordinal();
        if (ordinal == 0) {
            return aB(tlgVar);
        }
        if (ordinal == 1) {
            return aD(tlgVar);
        }
        if (ordinal == 2) {
            return aC(tlgVar);
        }
        return aB(tlgVar);
    }

    public static String aB(tlg tlgVar) {
        StringBuilder sb = new StringBuilder(tlgVar.c);
        sb.append("|");
        sb.append(tlgVar.d);
        sb.append("|");
        sb.append(tlgVar.e);
        sb.append("|");
        int bp = bp(tlgVar.f);
        if (bp == 0) {
            bp = 1;
        }
        sb.append(bp - 1);
        return sb.toString();
    }

    public static String aC(tlg tlgVar) {
        StringBuilder sb = new StringBuilder(tlgVar.e);
        sb.append("|");
        int bp = bp(tlgVar.f);
        if (bp == 0) {
            bp = 1;
        }
        sb.append(bp - 1);
        return sb.toString();
    }

    public static String aD(tlg tlgVar) {
        String str;
        StringBuilder sb = new StringBuilder(tlgVar.c);
        sb.append("|");
        sb.append(tlgVar.d);
        sb.append("|");
        sb.append(tlgVar.e);
        sb.append("|");
        int bp = bp(tlgVar.f);
        if (bp == 0) {
            bp = 1;
        }
        sb.append(bp - 1);
        sb.append("|");
        if ((tlgVar.b & 16) != 0) {
            awzo awzoVar = tlgVar.g;
            if (awzoVar == null) {
                awzoVar = awzo.a;
            }
            str = au(awzoVar);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public static ByteBuffer aE(Iterable iterable) {
        String format;
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (iterable.iterator().hasNext()) {
            j += ((aooy) r1.next()).getSerializedSize() + 12;
            i2++;
        }
        if (i2 != 0) {
            try {
                ByteBuffer allocate = ByteBuffer.allocate((int) j);
                byte[] array = allocate.array();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    aooy aooyVar = (aooy) it.next();
                    int serializedSize = aooyVar.getSerializedSize();
                    try {
                        allocate.putInt(serializedSize);
                        int i3 = i + 4;
                        try {
                            aooyVar.writeTo(aomp.am(array, i3, serializedSize));
                        } catch (IOException e) {
                            Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                        }
                        try {
                            allocate.put(array, i3, serializedSize);
                            int i4 = i3 + serializedSize;
                            CRC32 crc32 = new CRC32();
                            crc32.update(array, i4 - serializedSize, serializedSize);
                            allocate.putLong(crc32.getValue());
                            i = i4 + 8;
                        } catch (BufferOverflowException e2) {
                            by(e2);
                            return null;
                        }
                    } catch (BufferOverflowException e3) {
                        by(e3);
                        return null;
                    }
                }
                return allocate;
            } catch (IllegalArgumentException e4) {
                Object[] objArr = new Object[1];
                if (j > 1073741824) {
                    Locale locale = Locale.US;
                    double d = j;
                    Double.isNaN(d);
                    format = String.format(locale, "%.2fGB", Double.valueOf(d / 1.073741824E9d));
                } else if (j > 1048576) {
                    Locale locale2 = Locale.US;
                    double d2 = j;
                    Double.isNaN(d2);
                    format = String.format(locale2, "%.2fMB", Double.valueOf(d2 / 1048576.0d));
                } else if (j > 1024) {
                    Locale locale3 = Locale.US;
                    double d3 = j;
                    Double.isNaN(d3);
                    format = String.format(locale3, "%.2fKB", Double.valueOf(d3 / 1024.0d));
                } else {
                    format = String.format(Locale.US, "%d Bytes", Long.valueOf(j));
                }
                objArr[0] = format;
                Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", objArr), e4);
                return null;
            }
        }
        return ByteBuffer.allocate(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6 A[LOOP:0: B:2:0x0019->B:20:0x00c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List aF(java.nio.ByteBuffer r16, java.lang.Class r17, defpackage.aopf r18) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwh.aF(java.nio.ByteBuffer, java.lang.Class, aopf):java.util.List");
    }

    public static tld aG(String str) {
        try {
            return (tld) as(str, tld.a.getParserForType());
        } catch (aoob e) {
            String valueOf = String.valueOf(str);
            throw new ttk(valueOf.length() != 0 ? "Failed to deserialize key:".concat(valueOf) : new String("Failed to deserialize key:"), e);
        }
    }

    public static File aH(Context context, ammv ammvVar) {
        String str = "gms_icing_mdd_garbage_file";
        if (ammvVar != null && ammvVar.h()) {
            String str2 = (String) ammvVar.c();
            str = str2.length() != 0 ? "gms_icing_mdd_garbage_file".concat(str2) : new String("gms_icing_mdd_garbage_file");
        }
        return new File(context.getFilesDir(), str);
    }

    public static String aI(tld tldVar) {
        return Base64.encodeToString(tldVar.toByteArray(), 3);
    }

    public static vez aJ(Context context, anib anibVar, tss tssVar, akbd akbdVar) {
        vfk d = vfn.d(context, anibVar);
        d.c = "gms_icing_mdd_groups";
        d.c();
        d.f = bz(akbdVar);
        d.e(new ttl(tssVar, 1));
        return d.a();
    }

    public static vez aK(Context context, anib anibVar, tss tssVar, akbd akbdVar) {
        vfk d = vfn.d(context, anibVar);
        d.c = "gms_icing_mdd_shared_files";
        d.c();
        d.f = bz(akbdVar);
        d.e(new ttl(tssVar, 0));
        return d.a();
    }

    public static long aL(tkv tkvVar) {
        if (tkvVar.k == 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(tkvVar.k);
    }

    public static Uri aM(Context context, ammv ammvVar, tkt tktVar, tkv tkvVar) {
        Uri.Builder buildUpon = aN(context, ammvVar, tkvVar).buildUpon();
        if (!tktVar.p.isEmpty()) {
            for (String str : tktVar.p.split("/", -1)) {
                if (!str.isEmpty()) {
                    buildUpon.appendPath(str);
                }
            }
        } else {
            String str2 = tktVar.d;
            buildUpon.appendPath(str2.substring(str2.lastIndexOf("/") + 1));
        }
        return buildUpon.build();
    }

    public static Uri aN(Context context, ammv ammvVar, tkv tkvVar) {
        int bp = bp(tkvVar.i);
        if (bp == 0) {
            bp = 1;
        }
        return aV(context, ammvVar).buildUpon().appendPath("links").build().buildUpon().appendPath(aZ(bp)).build().buildUpon().appendPath(tkvVar.d).build();
    }

    public static tkv aO(tkv tkvVar, long j) {
        tku tkuVar = tkvVar.c;
        if (tkuVar == null) {
            tkuVar = tku.a;
        }
        aone builder = tkuVar.toBuilder();
        builder.copyOnWrite();
        tku tkuVar2 = (tku) builder.instance;
        tkuVar2.b |= 1;
        tkuVar2.c = j;
        tku tkuVar3 = (tku) builder.build();
        aone builder2 = tkvVar.toBuilder();
        builder2.copyOnWrite();
        tkv tkvVar2 = (tkv) builder2.instance;
        tkuVar3.getClass();
        tkvVar2.c = tkuVar3;
        tkvVar2.b |= 1;
        return (tkv) builder2.build();
    }

    public static String aP(tkt tktVar) {
        return aR(tktVar) ? tktVar.i : tktVar.g;
    }

    public static void aQ(Context context, ammv ammvVar, tkv tkvVar, vcw vcwVar) {
        Uri aN = aN(context, ammvVar, tkvVar);
        if (vcwVar.h(aN)) {
        }
    }

    public static boolean aR(tkt tktVar) {
        if ((tktVar.b & 32) == 0) {
            return false;
        }
        awzo awzoVar = tktVar.h;
        if (awzoVar == null) {
            awzoVar = awzo.a;
        }
        Iterator it = awzoVar.b.iterator();
        while (it.hasNext()) {
            if (((awzn) it.next()).b == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean aS(long j, shf shfVar) {
        return j <= shfVar.c();
    }

    public static boolean aT(tkv tkvVar) {
        if (!tkvVar.m) {
            return false;
        }
        Iterator it = tkvVar.n.iterator();
        while (it.hasNext()) {
            int br = br(((tkt) it.next()).m);
            if (br != 0 && br == 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean aU(tkt tktVar) {
        return tktVar.d.startsWith("file");
    }

    public static Uri aV(Context context, ammv ammvVar) {
        vda a = vdb.a(context);
        a.e((ammvVar == null || !ammvVar.h()) ? "datadownload" : (String) ammvVar.c());
        if (ammvVar != null && ammvVar.h()) {
            a.f("datadownload");
        }
        return a.a();
    }

    public static Uri aW(Context context, String str) {
        vdc a = vdd.a(context);
        a.a = str;
        return a.a();
    }

    public static String aX(String str, ammv ammvVar) {
        if (ammvVar != null && ammvVar.h()) {
            String str2 = (String) ammvVar.c();
            str = str2.length() != 0 ? str.concat(str2) : new String(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3);
        sb.append(str);
        sb.append(".pb");
        return sb.toString();
    }

    public static String aZ(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public";
    }

    public static boolean aa(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        return (resources == null || (configuration = resources.getConfiguration()) == null || configuration.getLayoutDirection() != 1) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aooy, java.lang.Object] */
    public static aooy ab(ByteBuffer byteBuffer, aopf aopfVar, aomw aomwVar) {
        aomk N = aomk.N(byteBuffer);
        ?? l = aopfVar.l(N, aomwVar);
        try {
            N.B(0);
            return l;
        } catch (aoob e) {
            throw e;
        }
    }

    public static aooy ac(ByteBuffer byteBuffer, aopf aopfVar) {
        return ab(byteBuffer, aopfVar, aomw.b());
    }

    public static axov ad(aoam aoamVar, int i, int i2) {
        amkq.E(i >= 0);
        amkq.E(i2 >= 0);
        axov axovVar = null;
        if (aoamVar != null && aoamVar.aa() != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < aoamVar.aa(); i4++) {
                axov ab = aoamVar.ab(i4);
                if (ab != null) {
                    int aJ = i - ((int) ab.aJ());
                    int aI = i2 - ((int) ab.aI());
                    int i5 = (aJ * aJ) + (aI * aI);
                    if (axovVar == null || i5 < i3) {
                        axovVar = ab;
                        i3 = i5;
                    }
                }
            }
        }
        return axovVar;
    }

    public static float ae(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static int af(float f, DisplayMetrics displayMetrics) {
        return did.n(TypedValue.applyDimension(1, f, displayMetrics));
    }

    public static int ag(Resources resources, aoak aoakVar) {
        if (aoakVar == null || aoakVar.c() != 1 || aoakVar.b() <= 0.0f) {
            return -1;
        }
        return af(aoakVar.b(), resources.getDisplayMetrics());
    }

    public static void ah(aoam aoamVar, szp szpVar) {
        aoak aoakVar = new aoak();
        bx(aoamVar.t(aoakVar) != null, YogaEdge.ALL, aoakVar, szpVar);
        bx(aoamVar.z(aoakVar) != null, YogaEdge.HORIZONTAL, aoakVar, szpVar);
        bx(aoamVar.J(aoakVar) != null, YogaEdge.VERTICAL, aoakVar, szpVar);
        bx(aoamVar.F(aoakVar) != null, YogaEdge.START, aoakVar, szpVar);
        bx(aoamVar.x(aoakVar) != null, YogaEdge.END, aoakVar, szpVar);
        bx(aoamVar.H(aoakVar) != null, YogaEdge.TOP, aoakVar, szpVar);
        bx(aoamVar.D(aoakVar) != null, YogaEdge.RIGHT, aoakVar, szpVar);
        bx(aoamVar.v(aoakVar) != null, YogaEdge.BOTTOM, aoakVar, szpVar);
        bx(aoamVar.B(aoakVar) != null, YogaEdge.LEFT, aoakVar, szpVar);
    }

    public static void ai(sxr sxrVar, View view) {
        sxrVar.d(view);
    }

    public static vtg aj(int i, int i2, int[] iArr) {
        return ak(i, i2, iArr, false);
    }

    public static vtg ak(int i, int i2, int[] iArr, boolean z) {
        int i3 = (i + i2) - 1;
        if (z) {
            i3++;
        }
        int i4 = 0;
        if (z && i == 0) {
            i = 0;
        } else {
            i4 = bw(iArr, i);
        }
        if (i2 > 0) {
            i2 += bw(iArr, i3) - i4;
        }
        return new vtg(i + i4, i2, null);
    }

    public static Map al(swo swoVar, amsj amsjVar) {
        sxv sxvVar;
        HashMap hashMap = null;
        if (swoVar.b() && (sxvVar = (sxv) amsjVar.v(sxv.class)) != null) {
            hashMap = new HashMap();
            String str = sxvVar.a;
            if (str != null) {
                hashMap.put("CellLogId", str);
            }
            String str2 = sxvVar.c;
            if (str2 != null) {
                hashMap.put("CELL_NODE_ID", str2);
            }
        }
        return hashMap;
    }

    public static /* synthetic */ String am(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "INVALID_ENCODING" : "UNKNOWN_OPTION" : "MALFORMED";
    }

    public static alwc an(aodx aodxVar) {
        if (aodxVar.b.isEmpty()) {
            return null;
        }
        alvz alvzVar = ((aody) aodxVar.b.get(0)).b;
        if (alvzVar == null) {
            alvzVar = alvz.a;
        }
        aony<alwc> aonyVar = alvzVar.c;
        if (aonyVar.isEmpty()) {
            return null;
        }
        for (alwc alwcVar : aonyVar) {
            if ((alwcVar.b & 1) != 0) {
                alwa alwaVar = alwcVar.c;
                if (alwaVar == null) {
                    alwaVar = alwa.a;
                }
                if (alwaVar.b) {
                    return alwcVar;
                }
            }
        }
        return (alwc) aonyVar.get(0);
    }

    public static void ao(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static boolean ap(Context context) {
        uvr.g(context);
        return axxj.a.get().a();
    }

    public static int aq(int i) {
        if (i == 0) {
            return 1;
        }
        switch (i) {
            case 950:
                return 951;
            case 951:
                return 952;
            case 952:
                return 953;
            default:
                switch (i) {
                    case 1001:
                        return 1002;
                    case 1002:
                        return 1003;
                    case 1003:
                        return 1004;
                    case 1004:
                        return 1005;
                    case 1005:
                        return 1006;
                    default:
                        return 0;
                }
        }
    }

    public static SharedPreferences ar(Context context, String str, ammv ammvVar) {
        if (ammvVar != null && ammvVar.h()) {
            String str2 = (String) ammvVar.c();
            str = str2.length() != 0 ? str.concat(str2) : new String(str);
        }
        return context.getSharedPreferences(str, 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [aooy, java.lang.Object] */
    public static aooy as(String str, aopf aopfVar) {
        try {
            return aopfVar.n(Base64.decode(str, 3), aomw.a());
        } catch (IllegalArgumentException e) {
            throw new aoob("Unable to decode to byte array", new IOException(e));
        }
    }

    public static aooy at(SharedPreferences sharedPreferences, String str, aopf aopfVar) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return as(string, aopfVar);
        } catch (aoob unused) {
            return null;
        }
    }

    public static String au(aooy aooyVar) {
        return Base64.encodeToString(aooyVar.toByteArray(), 3);
    }

    public static void av(SharedPreferences.Editor editor, String str) {
        editor.remove(str);
    }

    public static void aw(SharedPreferences.Editor editor, String str, aooy aooyVar) {
        editor.putString(str, au(aooyVar));
    }

    public static boolean ax(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean ay(SharedPreferences sharedPreferences, String str, aooy aooyVar) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        aw(edit, str, aooyVar);
        return edit.commit();
    }

    public static tlg az(String str, Context context, tme tmeVar) {
        aone aoneVar;
        List h = amnm.c("|").h(str);
        tpr tprVar = tpr.NEW_FILE_KEY;
        int ordinal = bf(context, tmeVar).ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (h.size() != 2) {
                    String valueOf = String.valueOf(str);
                    throw new ttn(valueOf.length() != 0 ? "Bad-format serializedFileKey = s".concat(valueOf) : new String("Bad-format serializedFileKey = s"));
                }
                aoneVar = tlg.a.createBuilder();
                String str2 = (String) h.get(0);
                aoneVar.copyOnWrite();
                tlg tlgVar = (tlg) aoneVar.instance;
                str2.getClass();
                tlgVar.b |= 4;
                tlgVar.e = str2;
                int bp = bp(Integer.parseInt((String) h.get(1)));
                aoneVar.copyOnWrite();
                tlg tlgVar2 = (tlg) aoneVar.instance;
                int i = bp - 1;
                if (bp == 0) {
                    throw null;
                }
                tlgVar2.f = i;
                tlgVar2.b |= 8;
            } else {
                if (h.size() != 4) {
                    String valueOf2 = String.valueOf(str);
                    throw new ttn(valueOf2.length() != 0 ? "Bad-format serializedFileKey = ".concat(valueOf2) : new String("Bad-format serializedFileKey = "));
                }
                aoneVar = tlg.a.createBuilder();
                String str3 = (String) h.get(0);
                aoneVar.copyOnWrite();
                tlg tlgVar3 = (tlg) aoneVar.instance;
                str3.getClass();
                tlgVar3.b |= 1;
                tlgVar3.c = str3;
                int parseInt = Integer.parseInt((String) h.get(1));
                aoneVar.copyOnWrite();
                tlg tlgVar4 = (tlg) aoneVar.instance;
                tlgVar4.b |= 2;
                tlgVar4.d = parseInt;
                String str4 = (String) h.get(2);
                aoneVar.copyOnWrite();
                tlg tlgVar5 = (tlg) aoneVar.instance;
                str4.getClass();
                tlgVar5.b |= 4;
                tlgVar5.e = str4;
                int bp2 = bp(Integer.parseInt((String) h.get(3)));
                aoneVar.copyOnWrite();
                tlg tlgVar6 = (tlg) aoneVar.instance;
                int i2 = bp2 - 1;
                if (bp2 == 0) {
                    throw null;
                }
                tlgVar6.f = i2;
                tlgVar6.b |= 8;
            }
        } else {
            if (h.size() != 5) {
                String valueOf3 = String.valueOf(str);
                throw new ttn(valueOf3.length() != 0 ? "Bad-format serializedFileKey = ".concat(valueOf3) : new String("Bad-format serializedFileKey = "));
            }
            aone createBuilder = tlg.a.createBuilder();
            String str5 = (String) h.get(0);
            createBuilder.copyOnWrite();
            tlg tlgVar7 = (tlg) createBuilder.instance;
            str5.getClass();
            tlgVar7.b |= 1;
            tlgVar7.c = str5;
            int parseInt2 = Integer.parseInt((String) h.get(1));
            createBuilder.copyOnWrite();
            tlg tlgVar8 = (tlg) createBuilder.instance;
            tlgVar8.b |= 2;
            tlgVar8.d = parseInt2;
            String str6 = (String) h.get(2);
            createBuilder.copyOnWrite();
            tlg tlgVar9 = (tlg) createBuilder.instance;
            str6.getClass();
            tlgVar9.b |= 4;
            tlgVar9.e = str6;
            int bp3 = bp(Integer.parseInt((String) h.get(3)));
            createBuilder.copyOnWrite();
            tlg tlgVar10 = (tlg) createBuilder.instance;
            int i3 = bp3 - 1;
            if (bp3 == 0) {
                throw null;
            }
            tlgVar10.f = i3;
            tlgVar10.b |= 8;
            if (h.get(4) != null && !((String) h.get(4)).isEmpty()) {
                try {
                    awzo awzoVar = (awzo) as((String) h.get(4), awzo.a.getParserForType());
                    createBuilder.copyOnWrite();
                    tlg tlgVar11 = (tlg) createBuilder.instance;
                    awzoVar.getClass();
                    tlgVar11.g = awzoVar;
                    tlgVar11.b |= 16;
                } catch (aoob e) {
                    String valueOf4 = String.valueOf(str);
                    throw new ttn(valueOf4.length() != 0 ? "Failed to deserialize key:".concat(valueOf4) : new String("Failed to deserialize key:"), e);
                }
            }
            aoneVar = createBuilder;
        }
        return (tlg) aoneVar.build();
    }

    public static void ba(Context context, String str, Uri uri, tkv tkvVar, tkt tktVar, vcw vcwVar, boolean z) {
        String str2;
        str2 = "";
        int i = 0;
        try {
            Uri aW = aW(context, str);
            InputStream inputStream = (InputStream) vcwVar.c(uri, veg.b());
            try {
                OutputStream outputStream = (OutputStream) vcwVar.c(aW, veh.b());
                try {
                    anbt.g(inputStream, outputStream);
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        } catch (vdj unused3) {
            tsx.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", tktVar.c, tkvVar.d);
            str2 = String.format("System limit exceeded for file %s, group %s", tktVar.c, tkvVar.d);
            i = 25;
        } catch (vdo unused4) {
            tsx.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", tktVar.c, tkvVar.d);
            str2 = String.format("Malformed blob Uri for file %s, group %s", tktVar.c, tkvVar.d);
            i = 17;
        } catch (vds e) {
            str2 = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
            String str3 = tktVar.c;
            String str4 = tkvVar.d;
            int i2 = tsx.a;
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? "UnsupportedFileStorageOperation was thrown: ".concat(valueOf) : new String("UnsupportedFileStorageOperation was thrown: ");
            i = 24;
        } catch (IOException unused5) {
            tsx.e("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", tktVar.c, tkvVar.d);
            int i3 = true != z ? 21 : 22;
            str2 = String.format("Error while copying file %s, group %s, to the shared blob storage", tktVar.c, tkvVar.d);
            i = i3;
        }
        if (i != 0) {
            throw new tti(i, str2);
        }
    }

    public static boolean bb(Context context, String str, tkv tkvVar, tkt tktVar, vcw vcwVar) {
        String str2;
        boolean z;
        str2 = "";
        int i = 0;
        try {
            z = vcwVar.h(aW(context, str));
        } catch (vdo unused) {
            tsx.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", tktVar.c, tkvVar.d);
            str2 = String.format("Malformed blob Uri for file %s, group %s", tktVar.c, tkvVar.d);
            z = false;
            i = 17;
        } catch (vds e) {
            str2 = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
            String str3 = tktVar.c;
            String str4 = tkvVar.d;
            int i2 = tsx.a;
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? "UnsupportedFileStorageOperation was thrown: ".concat(valueOf) : new String("UnsupportedFileStorageOperation was thrown: ");
            z = false;
            i = 24;
        } catch (IOException unused2) {
            tsx.e("%s: Failed to check existence in the shared storage for file %s, file group %s", "AndroidSharingUtil", tktVar.c, tkvVar.d);
            str2 = String.format("Error while checking if file %s, group %s, exists in the shared blob storage.", tktVar.c, tkvVar.d);
            z = false;
            i = 19;
        }
        if (i == 0) {
            return z;
        }
        throw new tti(i, str2);
    }

    public static Uri bc(Uri uri) {
        String uri2 = uri.toString();
        return Uri.parse(uri2.substring(0, uri2.lastIndexOf("_")));
    }

    public static String bd(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    public static tlg be(tkt tktVar, int i) {
        aone createBuilder = tlg.a.createBuilder();
        String str = tktVar.d;
        createBuilder.copyOnWrite();
        tlg tlgVar = (tlg) createBuilder.instance;
        str.getClass();
        tlgVar.b |= 1;
        tlgVar.c = str;
        int i2 = tktVar.e;
        createBuilder.copyOnWrite();
        tlg tlgVar2 = (tlg) createBuilder.instance;
        tlgVar2.b |= 2;
        tlgVar2.d = i2;
        String aP = aP(tktVar);
        createBuilder.copyOnWrite();
        tlg tlgVar3 = (tlg) createBuilder.instance;
        aP.getClass();
        tlgVar3.b |= 4;
        tlgVar3.e = aP;
        createBuilder.copyOnWrite();
        tlg tlgVar4 = (tlg) createBuilder.instance;
        tlgVar4.f = i - 1;
        tlgVar4.b |= 8;
        if ((tktVar.b & 32) != 0) {
            awzo awzoVar = tktVar.h;
            if (awzoVar == null) {
                awzoVar = awzo.a;
            }
            createBuilder.copyOnWrite();
            tlg tlgVar5 = (tlg) createBuilder.instance;
            awzoVar.getClass();
            tlgVar5.g = awzoVar;
            tlgVar5.b |= 16;
        }
        return (tlg) createBuilder.build();
    }

    public static tpr bf(Context context, tme tmeVar) {
        int i = context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", tpr.NEW_FILE_KEY.d);
        try {
            return tpr.a(i);
        } catch (IllegalArgumentException e) {
            tmeVar.a(e, "FileKey version metadata corrupted with unknown version: %d", Integer.valueOf(i));
            context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
            return tpr.USE_CHECKSUM_ONLY;
        }
    }

    public static boolean bg(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean bh(Context context, tpr tprVar) {
        tprVar.name();
        int i = tsx.a;
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", tprVar.d).commit();
    }

    public static void bi(Context context) {
        int i = tsx.a;
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    public static boolean bj(awzo awzoVar) {
        try {
            veo.a(awzoVar);
            return true;
        } catch (IllegalArgumentException e) {
            tsx.j(e, "Invalid transform specification");
            return false;
        }
    }

    public static amnv bk(Context context, Executor executor, vcw vcwVar, axpg axpgVar, ammv ammvVar, ammv ammvVar2, tko tkoVar) {
        return new tmx(executor, tkoVar, axpgVar, context, ammvVar2, vcwVar, ammvVar);
    }

    public static int bl(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bm(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bn(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int bo(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int bp(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bq(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int br(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int bs(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int bt(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    private static String bu(String str) {
        try {
            return new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
        } catch (ArithmeticException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static void bv(RuntimeException runtimeException) {
        Log.e("Preconditions", "Precondition broken. Build is not strict; continuing...", runtimeException);
    }

    private static int bw(int[] iArr, int i) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch >= 0) {
            while (binarySearch < iArr.length - 1) {
                int i2 = binarySearch + 1;
                if (iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
        }
        return binarySearch >= 0 ? binarySearch + 1 : (-binarySearch) - 1;
    }

    private static void bx(boolean z, YogaEdge yogaEdge, aoak aoakVar, szp szpVar) {
        if (z) {
            szpVar.a(yogaEdge, aoakVar);
        }
    }

    private static void by(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }

    private static amnv bz(final akbd akbdVar) {
        final byte[] bArr = null;
        return new amnv(bArr) { // from class: ttm
            @Override // defpackage.amnv
            public final Object get() {
                return Boolean.valueOf(akbd.this.e() != tkr.PROTOSTORE_ONLY);
            }
        };
    }

    public static void e(View view, rwg... rwgVarArr) {
        if (view.getLayerType() == 1) {
            return;
        }
        for (rwg rwgVar : rwgVarArr) {
            if (!rwgVar.a()) {
                String name = rwgVar.name();
                String simpleName = view.getClass().getSimpleName();
                String.valueOf(name).length();
                String.valueOf(simpleName).length();
                view.setLayerType(1, null);
                return;
            }
        }
    }

    public static boolean f(View view, rwg... rwgVarArr) {
        if (view.getLayerType() != 1) {
            for (int i = 0; i <= 0; i++) {
                if (!rwgVarArr[i].a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static float g(float f) {
        return Math.min(5.0f, Math.abs(f) / 3.0f);
    }

    public static void h(long j, ryq ryqVar, SortedMap sortedMap) {
        sbt.a(true, "timeResolution must positive");
        sbt.g(ryqVar, "timeFormatter can not be null");
        sortedMap.put(Long.valueOf(j), ryqVar);
    }

    public static amyi k() {
        return amyi.m("GAL");
    }

    public static rsj l(Throwable th) {
        Status.Code code;
        Status m = m(th);
        if (m == null || ((code = m.getCode()) != Status.Code.DEADLINE_EXCEEDED && code != Status.Code.UNAVAILABLE)) {
            return new rsj(1, "An error occurred in gRPC call", th);
        }
        return new rsj(2, "Network error", th);
    }

    public static Status m(Throwable th) {
        Throwable n = n(th);
        if (n instanceof StatusException) {
            return ((StatusException) n).a;
        }
        if (n instanceof aydd) {
            return ((aydd) n).a;
        }
        return null;
    }

    public static Throwable n(Throwable th) {
        if (th == null) {
            return null;
        }
        return ((th instanceof ExecutionException) || (th instanceof aniv)) ? n(th.getCause()) : th;
    }

    public static HashSet o() {
        return new HashSet();
    }

    public static HashSet p(Collection collection) {
        return new HashSet(collection);
    }

    public static HashSet q(int i) {
        return new HashSet(s(i));
    }

    public static LinkedHashSet r() {
        return new LinkedHashSet();
    }

    static int s(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i > 1073741823) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    public static HashMap t() {
        return new HashMap();
    }

    public static HashMap u(int i) {
        sbt.a(i >= 0, "expectedSize should be greater than or equal to 0");
        return new HashMap(s(i));
    }

    public static LinkedHashMap v() {
        return new LinkedHashMap();
    }

    public static TreeMap w() {
        return new TreeMap();
    }

    public static ArrayList x() {
        return new ArrayList();
    }

    public static ArrayList y(Collection collection) {
        return new ArrayList(collection);
    }

    public static ArrayList z(int i) {
        return new ArrayList(i);
    }

    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    public void b() {
    }

    public boolean c() {
        return false;
    }

    public void d(Map map, rzk rzkVar) {
    }

    public void i() {
    }

    public void j(List list) {
    }

    public rwh(amnv amnvVar, tuj tujVar) {
        tujVar.getClass();
        amkq.x(amnvVar);
    }

    public static Uri aY(Context context, int i, String str, String str2, tme tmeVar, ammv ammvVar, boolean z) {
        try {
            if (!z) {
                return aV(context, ammvVar).buildUpon().appendPath(aZ(i)).build().buildUpon().appendPath(str).build();
            }
            return aW(context, str2);
        } catch (Exception e) {
            tsx.f(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            tmeVar.a(e, "Unable to create mobstore uri for file", new Object[0]);
            return null;
        }
    }

    public static void B(sba sbaVar, saw sawVar, sba sbaVar2, saw sawVar2) {
        Double valueOf = Double.valueOf(0.0d);
        if (sbaVar2 != null) {
            saw c = sbaVar2.c(sax.a);
            saw d = sbaVar2.d(sax.b, valueOf);
            HashMap t = t();
            int i = -1;
            for (Object obj : sbaVar2.a) {
                i++;
                Object a = sawVar2.a(obj, i, sbaVar2);
                Double d2 = (Double) c.a(obj, i, sbaVar2);
                Double d3 = (Double) d.a(obj, i, sbaVar2);
                t.put(a, Double.valueOf(d2 != null ? d2.doubleValue() + d3.doubleValue() : d3.doubleValue()));
            }
            sbaVar.f(sax.b, new sbm(sawVar, t));
            return;
        }
        sbaVar.g(sax.b, valueOf);
    }
}
