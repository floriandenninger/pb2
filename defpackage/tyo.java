package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public /* synthetic */ class tyo {
    public static Drawable a;

    public static String A(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.THREAD_ID");
    }

    public static void B(Intent intent, twu twuVar) {
        String str;
        if (twuVar == null || (str = twuVar.b) == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
    }

    public static void C(Intent intent, String str) {
        if (str != null) {
            intent.putExtra("com.google.android.libraries.notifications.ACTION_ID", str);
        }
    }

    public static void D(Intent intent, int i) {
        intent.putExtra("com.google.android.libraries.notifications.EVENT_TYPE", i);
    }

    public static void E(Intent intent, txb txbVar) {
        String str;
        if (txbVar == null || (str = txbVar.j) == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.GROUP_ID", str);
    }

    public static void F(Intent intent, ucx ucxVar) {
        if (ucxVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE", ucxVar.toByteArray());
        }
    }

    public static void G(Intent intent, aohq aohqVar) {
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", aohqVar.l);
    }

    public static void H(Intent intent, txb txbVar) {
        String str;
        if (txbVar == null || (str = txbVar.a) == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.THREAD_ID", str);
    }

    public static void I(Intent intent, aokw aokwVar) {
        if (aokwVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE", aokwVar.toByteArray());
        }
    }

    public static int J(Intent intent) {
        return intent.getIntExtra("com.google.android.libraries.notifications.EVENT_TYPE", 0);
    }

    public static uio K(Context context, Runnable runnable) {
        Runnable runnable2;
        uiu uiuVar = new uiu();
        amru r = amru.r(context.getResources().getString(R.string.sign_in_cancel));
        if (r != null) {
            uiuVar.a = r;
            if (runnable != null) {
                uiuVar.b = runnable;
                amru amruVar = uiuVar.a;
                if (amruVar == null || (runnable2 = uiuVar.b) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (uiuVar.a == null) {
                        sb.append(" possibleCancelStringList");
                    }
                    if (uiuVar.b == null) {
                        sb.append(" onCancel");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                return new uio(amruVar, runnable2);
            }
            throw new NullPointerException("Null onCancel");
        }
        throw new NullPointerException("Null possibleCancelStringList");
    }

    public static /* synthetic */ void L(View view) {
        Context context = view.getContext();
        amkq.F(W(context) != null, "An Activity Context is required to starts a new Add Account Activity");
        context.startActivity(new Intent(context, (Class<?>) AddAccountActivity.class));
    }

    public static void M(Runnable runnable) {
        if (uqq.n()) {
            runnable.run();
        } else {
            uqq.l(runnable);
        }
    }

    public static boolean N(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || enabledAccessibilityServiceList.isEmpty()) ? false : true;
    }

    public static float O(DisplayMetrics displayMetrics, int i) {
        return i * displayMetrics.density;
    }

    public static int P(DisplayMetrics displayMetrics, int i) {
        return (int) O(displayMetrics, i);
    }

    public static boolean Q(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterialTheme, R.attr.colorPrimaryGoogle});
        boolean z = false;
        try {
            if (obtainStyledAttributes.getBoolean(0, false)) {
                if (obtainStyledAttributes.hasValue(1)) {
                    z = true;
                }
            }
            return z;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable R(Drawable drawable, int i) {
        Drawable c = gl.c(drawable);
        c.mutate().setTint(i);
        return c;
    }

    public static Drawable S(Context context, int i, int i2) {
        return R(nz.b(context, i), i2);
    }

    public static ThreadFactory T() {
        anio anioVar = new anio();
        anioVar.d("OneGoogle #%d");
        anioVar.c(false);
        amkq.K(true, "Thread priority (%s) must be >= %s", 5, 1);
        amkq.K(true, "Thread priority (%s) must be <= %s", 5, 10);
        anioVar.a = 5;
        anioVar.b = pkr.d;
        return anio.b(anioVar);
    }

    public static String U(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        return simpleName.endsWith("Exception") ? simpleName.contains("$") ? simpleName.substring(simpleName.lastIndexOf(36) + 1) : simpleName : th instanceof qnx ? "ApiException" : "ObfuscatedException";
    }

    public static Throwable V(Throwable th, Class cls) {
        if (th == null) {
            return null;
        }
        return th.getClass().equals(cls) ? th : V(th.getCause(), cls);
    }

    public static Activity W(Context context) {
        context.getClass();
        if (!(context instanceof Service) && !(context instanceof Application)) {
            for (int i = 0; i < 1000; i++) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return (Activity) context;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String X(Object obj) {
        return ((ugh) obj).c;
    }

    public static /* synthetic */ String Y(Object obj) {
        return ((ugh) obj).c;
    }

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "PRIORITY_HIGH" : "PRIORITY_NORMAL" : "PRIORITY_UNKNOWN";
    }

    public static /* synthetic */ String aa(Object obj) {
        return ((ugh) obj).b;
    }

    public static /* synthetic */ udy ab(Object obj) {
        ugh ughVar = (ugh) obj;
        akem akemVar = new akem();
        akemVar.a(false);
        akemVar.b(1);
        akemVar.a(ughVar.f);
        akemVar.b(ughVar.h);
        Boolean bool = akemVar.a;
        if (bool == null || akemVar.b == 0) {
            StringBuilder sb = new StringBuilder();
            if (akemVar.a == null) {
                sb.append(" isG1User");
            }
            if (akemVar.b == 0) {
                sb.append(" isUnicornUser");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new udy(bool.booleanValue(), akemVar.b);
    }

    public static String ah(Object obj) {
        String d = ammx.d(aa(obj));
        String d2 = ammx.d(Y(obj));
        if (!d.isEmpty() || !d2.isEmpty()) {
            if (d.isEmpty()) {
                return d2;
            }
            if (d2.isEmpty() || d.equals(d2)) {
                return d;
            }
            StringBuilder sb = new StringBuilder(d.length() + 1 + d2.length());
            sb.append(d);
            sb.append(" ");
            sb.append(d2);
            return sb.toString();
        }
        return X(obj);
    }

    public static /* synthetic */ String ai(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FALSE" : "TRUE" : "UNKNOWN";
    }

    public static /* synthetic */ void aj(int i) {
        if (i == 0) {
            throw null;
        }
    }

    private static String ak(String str, int i) {
        if (i <= 0 || TextUtils.isEmpty(str)) {
            tzk.c("QueryHelper", new Exception(), "Error creating IN clause for number: [%d], column [%s]", Integer.valueOf(i), str);
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IN (");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append("?,");
        }
        sb.append("?)");
        return sb.toString();
    }

    public static int b(Cursor cursor, String str) {
        try {
            return cursor.getColumnIndexOrThrow(str);
        } catch (IllegalArgumentException e) {
            throw new txr(str, e);
        }
    }

    public static amru c(uzh uzhVar, String str, String[] strArr) {
        int length = strArr.length;
        if (length <= 900) {
            uzi b = uzi.b();
            if (!f(uzhVar)) {
                b.d(uzhVar.a, uzhVar.a());
                b.c(" AND ");
            }
            b.d(ak(str, length), strArr);
            return amru.r(b.a());
        }
        amrp f = amru.f();
        int i = 0;
        while (true) {
            int length2 = strArr.length;
            if (i < length2) {
                int i2 = i + 900;
                String[] strArr2 = (String[]) Arrays.copyOfRange(strArr, i, Math.min(i2, length2));
                uzi b2 = uzi.b();
                if (!f(uzhVar)) {
                    b2.d(uzhVar.a, uzhVar.a());
                    b2.c(" AND ");
                }
                b2.d(ak(str, strArr2.length), strArr2);
                f.h(b2.a());
                i = i2;
            } else {
                return f.g();
            }
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        uzi b = uzi.b();
        b.c("ALTER TABLE ");
        b.c(str);
        b.c(" ADD COLUMN ");
        b.c(str2);
        b.c(" ");
        b.c(str3);
        uzh a2 = b.a();
        sQLiteDatabase.execSQL(a2.a, a2.a());
    }

    public static boolean e(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
        Throwable th;
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query(str, null, "0", null, null, null, null);
            try {
                for (String str2 : strArr) {
                    if (cursor.getColumnIndex(str2) < 0) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    }
                }
                if (cursor == null) {
                    return true;
                }
                cursor.close();
                return true;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public static boolean f(uzh uzhVar) {
        return uzhVar == null || uzhVar.a.isEmpty();
    }

    public static aooy g(Cursor cursor, aooy aooyVar, String str) {
        try {
            byte[] blob = cursor.getBlob(b(cursor, str));
            if (blob != null) {
                return aooyVar.toBuilder().mergeFrom(blob).build();
            }
            return null;
        } catch (aoob e) {
            tzk.c("ChimeThreadStorageHelper", e, "Error parsing column %s for notification %s", str, cursor.getString(b(cursor, "thread_id")));
            return null;
        }
    }

    public static List h(Cursor cursor, aooy aooyVar, String str) {
        ucw ucwVar;
        ArrayList arrayList = new ArrayList();
        try {
            byte[] blob = cursor.getBlob(b(cursor, str));
            if (blob != null && (ucwVar = (ucw) ((aone) ucw.a.createBuilder().mergeFrom(blob)).build()) != null) {
                Iterator it = ucwVar.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(aooyVar.toBuilder().mergeFrom(((aols) it.next()).c).build());
                }
            }
        } catch (aoob e) {
            tzk.c("ChimeThreadStorageHelper", e, "Error parsing column %s for notification %s", str, cursor.getString(b(cursor, "thread_id")));
        }
        return arrayList;
    }

    public static int i(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static void j(Context context) {
        try {
            uvi.d(context);
        } catch (IllegalStateException e) {
            p("GnpPhenotypeManager", "PhenotypeContext.setContext was called more than once", e);
        }
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean m(Context context) {
        return aij.c() && context.getApplicationInfo().targetSdkVersion >= 26;
    }

    public static boolean n(Context context) {
        return aij.f() && context.getApplicationInfo().targetSdkVersion > 30;
    }

    public static String o(String str, String str2, Object[] objArr) {
        if (objArr.length != 0) {
            str2 = String.format(null, str2, objArr);
        }
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }

    public static void p(String str, String str2, Object... objArr) {
        if (q(3)) {
            o(str, str2, objArr);
        }
    }

    public static boolean q(int i) {
        return Log.isLoggable("GnpSdk", i);
    }

    public static aokw r(List list) {
        aone createBuilder = aokw.a.createBuilder();
        createBuilder.copyOnWrite();
        aokw aokwVar = (aokw) createBuilder.instance;
        aokwVar.e = 2;
        aokwVar.b |= 4;
        createBuilder.copyOnWrite();
        aokw aokwVar2 = (aokw) createBuilder.instance;
        aokwVar2.c = 4;
        aokwVar2.b |= 1;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                createBuilder.copyOnWrite();
                aokw aokwVar3 = (aokw) createBuilder.instance;
                aokwVar3.f = 2;
                aokwVar3.b |= 8;
                break;
            }
            aokb aokbVar = ((txb) it.next()).d.k;
            if (aokbVar == null) {
                aokbVar = aokb.a;
            }
            if (aokbVar.f) {
                break;
            }
        }
        return (aokw) createBuilder.build();
    }

    public static int s(String str, String str2, int i) {
        if (str2 == null) {
            str2 = "NO_ACTION";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + str2.length());
        sb.append(str);
        sb.append(":e:");
        sb.append(i);
        sb.append(":a:");
        sb.append(str2);
        return sb.toString().hashCode();
    }

    public static String t(String str, String str2) {
        if (str == null) {
            str = "Anonymous";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("::");
        sb.append(str2);
        return sb.toString();
    }

    public static String u(String str, String str2) {
        if (str == null) {
            str = "Anonymous";
        }
        StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("::SUMMARY::");
        sb.append(str2);
        return sb.toString();
    }

    public static aohq v(Intent intent) {
        return aohq.a(intent.getIntExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", 0));
    }

    public static aokw w(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE");
        if (byteArrayExtra != null) {
            try {
                return (aokw) aonm.parseFrom(aokw.a, byteArrayExtra, aomw.b());
            } catch (aoob e) {
                tzk.c("IntentExtrasHelper", e, "Unable to parse ThreadStateUpdate message", new Object[0]);
            }
        }
        return aokw.a;
    }

    public static String x(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.ACCOUNT_NAME");
    }

    public static String y(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
    }

    public static String z(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.GROUP_ID");
    }

    public void ad(amru amruVar) {
    }

    public void ae() {
    }

    public void af(Object obj) {
    }

    @Deprecated
    public void ag(amru amruVar) {
    }
}
