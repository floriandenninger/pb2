package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.accountlinking.LinkResponse;
import com.google.android.youtube.R;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rqr {
    public static ansv a;

    public rqr() {
    }

    public rqr(byte[] bArr) {
    }

    @Deprecated
    public static rpt a(Executor executor, Callable callable) {
        qip.az(executor, "Executor must not be null");
        qip.az(callable, "Callback must not be null");
        rpx rpxVar = new rpx();
        executor.execute(new rpy(rpxVar, callable));
        return rpxVar;
    }

    public static rpt b(Exception exc) {
        rpx rpxVar = new rpx();
        rpxVar.s(exc);
        return rpxVar;
    }

    public static rpt c(Object obj) {
        rpx rpxVar = new rpx();
        rpxVar.t(obj);
        return rpxVar;
    }

    public static Object d(rpt rptVar) {
        qip.at();
        if (rptVar.j()) {
            return w(rptVar);
        }
        rpz rpzVar = new rpz();
        x(rptVar, rpzVar);
        rpzVar.a.await();
        return w(rptVar);
    }

    public static Object e(rpt rptVar, long j, TimeUnit timeUnit) {
        qip.at();
        qip.az(timeUnit, "TimeUnit must not be null");
        if (rptVar.j()) {
            return w(rptVar);
        }
        rpz rpzVar = new rpz();
        x(rptVar, rpzVar);
        if (!rpzVar.a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return w(rptVar);
    }

    public static ruf f(Context context, String str, int i) {
        return new rue(context, str, i);
    }

    public static rsw g(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("error_type", Integer.valueOf(i));
        bundle.putString("message", str);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return new rsw(-2, intent);
    }

    public static rsw h(String str) {
        Intent intent = new Intent();
        intent.putExtra("link_response", new LinkResponse(true, str));
        return new rsw(-1, intent);
    }

    public static boolean i(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void j(String str, Throwable th) {
        String k = k();
        if (Log.isLoggable(k, 5)) {
            Log.w(k, str, th);
        }
    }

    public static String k() {
        return Build.VERSION.SDK_INT < 26 ? "PeopleClient".substring(0, Math.min(12, 23)) : "PeopleClient";
    }

    public static int l(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        Set<String> keySet = bundle.keySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(bundle.get(it.next()));
        }
        return Arrays.hashCode(new Object[]{keySet, linkedHashSet});
    }

    public static boolean m(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null) != (bundle2 == null) || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!(obj2 instanceof Bundle) || !m((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                    return false;
                }
                for (int i = 0; i < length; i++) {
                    if (!qar.j(Array.get(obj, i), Array.get(obj2, i))) {
                        return false;
                    }
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public static int n(int i) {
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

    public static int o(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int p(int i) {
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

    public static String q(Context context, String str) {
        qip.an(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = u(context);
        }
        return v("google_app_id", resources, str);
    }

    public static String r(String str, String[] strArr, String[] strArr2) {
        qip.an(strArr);
        qip.an(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static Object s(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }

    public static void t(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static String u(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String v(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }

    private static Object w(rpt rptVar) {
        if (rptVar.k()) {
            return rptVar.g();
        }
        if (rptVar.i()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(rptVar.f());
    }

    private static void x(rpt rptVar, rpz rpzVar) {
        rptVar.p(rpw.b, rpzVar);
        rptVar.o(rpw.b, rpzVar);
        rptVar.l(rpw.b, rpzVar);
    }

    public void onDone() {
    }

    public void onMissing(rql rqlVar) {
    }

    public void onNewItem(int i, Object obj) {
    }

    public void onUpdate(rql rqlVar, Object obj) {
    }
}
