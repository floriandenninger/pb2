package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qar {
    public static int a(dvc dvcVar) {
        dvc dvcVar2 = dvc.INVALID_REQUEST;
        int ordinal = dvcVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            return ordinal != 2 ? 0 : 2;
        }
        return 3;
    }

    public static void b(AdRequestParcel adRequestParcel) {
        List list = adRequestParcel.e;
        if (list != null) {
            new HashSet(list);
        }
        new Date(adRequestParcel.b);
        int i = adRequestParcel.d;
        Location location = adRequestParcel.k;
    }

    public static Object c(Context context, String str, qbj qbjVar) {
        try {
            try {
                return qbjVar.a(qvu.e(context, qvu.a, "com.google.android.gms.ads.dynamite").d(str));
            } catch (Exception e) {
                throw new qbk(e);
            }
        } catch (Exception e2) {
            throw new qbk(e2);
        }
    }

    public static boolean d(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            if (obj instanceof Bundle) {
                if (!(obj2 instanceof Bundle) || !d((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                    return false;
                }
                for (int i = 0; i < length; i++) {
                    if (!j(Array.get(obj, i), Array.get(obj2, i))) {
                        return false;
                    }
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static void f(String str) {
        try {
            String valueOf = String.valueOf(str);
            qbi.b(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                pvy.c();
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setUseCaches(false);
                int i = qbh.a;
                qbh.a();
                new ArrayList();
                qbh.a();
                int responseCode = httpURLConnection.getResponseCode();
                qbh.a();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(str);
                    qbi.f(sb.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            qbi.f(sb2.toString());
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            qbi.f(sb3.toString());
        } catch (RuntimeException e3) {
            e = e3;
            String message3 = e.getMessage();
            StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb22.append("Error while pinging URL: ");
            sb22.append(str);
            sb22.append(". ");
            sb22.append(message3);
            qbi.f(sb22.toString());
        }
    }

    public static rvm g(String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
            if (sb.length() > 1) {
                sb.append(",");
            }
            sb.append(str);
        }
        sb.append("] ");
        return new rvm(sb.toString());
    }

    public static rpt h(qoi qoiVar, qsz qszVar) {
        rpv rpvVar = new rpv();
        qoiVar.e(new qsy(qoiVar, rpvVar, qszVar));
        return rpvVar.a;
    }

    public static void i(qoi qoiVar) {
        h(qoiVar, new rri(1));
    }

    public static boolean j(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String k(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void l(String str, Object obj, List list) {
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }

    public static void n(Status status, rpv rpvVar) {
        o(status, null, rpvVar);
    }

    public static void o(Status status, Object obj, rpv rpvVar) {
        if (status.c()) {
            rpvVar.b(obj);
        } else {
            rpvVar.a(new qnx(status));
        }
    }

    public static boolean p(Status status, Object obj, rpv rpvVar) {
        if (status.c()) {
            return rpvVar.d(obj);
        }
        return rpvVar.c(new qnx(status));
    }

    public static qqj q(Object obj, String str) {
        qip.az(obj, "Listener must not be null");
        qip.az(str, "Listener type must not be null");
        qip.ay(str, "Listener type must not be empty");
        return new qqj(obj, str);
    }

    public static qql r(Object obj, Looper looper, String str) {
        qip.az(obj, "Listener must not be null");
        qip.az(looper, "Looper must not be null");
        qip.az(str, "Listener type must not be null");
        return new qql(looper, obj, str);
    }

    @Deprecated
    public qnv s(Context context, Looper looper, qrz qrzVar, Object obj, qod qodVar, qoe qoeVar) {
        return t(context, looper, qrzVar, obj, qodVar, qoeVar);
    }

    public qnv t(Context context, Looper looper, qrz qrzVar, Object obj, qpj qpjVar, qqp qqpVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public static qnx m(Status status) {
        return status.i != null ? new qok(status) : new qnx(status);
    }
}
