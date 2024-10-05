package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afhm {
    private static final Pattern a = Pattern.compile("[0-9a-zA-Z._$]+@[0-9a-f]+$");
    private static final Pattern b = Pattern.compile("[\\.$]");
    private static final Map c;
    private static final amrz d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("IllegalArgument", "IA");
        hashMap.put("IllegalState", "IS");
        hashMap.put("NullPointer", "NP");
        hashMap.put("Execution", "Ex");
        hashMap.put("Network", "N");
        hashMap.put("Exception", "E");
        hashMap.put("VirtualMachine", "VM");
        hashMap.put("Error", "Er");
        hashMap.put("DataSource", "DSo");
        hashMap.put("DataSink", "DSi");
        hashMap.put("Interrupted", "Ir");
        hashMap.put("jdk.internal.reflect.NativeMethodAccessorImpl.invoke", "jdk.refl");
        hashMap.put("sun.reflect.NativeMethodAccessorImpl.invoke", "sun.refl");
        hashMap.put("com.google.android.libraries.youtube", "yt");
        hashMap.put("com.google.common.util", "cgcu");
        hashMap.put("com.google.android.exoplayer", "exo");
        hashMap.put("concurrent.AbstractFuture", "cAF");
        hashMap.put("java.util.concurrent.Future", "Futu");
        hashMap.put("native_", "n_");
        hashMap.put("android.media.MediaCodec", "MC");
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("org.chromium.net.impl", "ocni");
        hashMap2.put("NetworkExceptionImpl", "NEI");
        hashMap2.put("Exception in CronetUrlRequest: ", "");
        hashMap2.put("net::ERR_INTERNET_DISCONNECTED", "NetDisc");
        hashMap2.put("ErrorCode", "code");
        hashMap2.put("Internal", "int");
        d = amrz.j(hashMap2);
    }

    public static String a(Throwable th) {
        return b(th, false);
    }

    public static String b(Throwable th, boolean z) {
        return f(th, z, 0);
    }

    public static String c() {
        return j("s." + h(new Exception(), 1, 30, "-"));
    }

    public static String d(String str) {
        if (str == null) {
            return "";
        }
        String bM = adyu.bM(str);
        if (a.matcher(bM).matches()) {
            bM = bM.substring(0, bM.lastIndexOf(64));
        }
        return j(bM);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return j(str);
    }

    public static String f(Throwable th, boolean z, int i) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("e.");
        sb.append(i(th.getClass().getSimpleName()));
        sb.append(";s.");
        sb.append(h(th, 0, 3, ":"));
        while (th.getCause() != null && th.getCause() != th && i > 0) {
            th = th.getCause();
            sb.append(";ce.");
            sb.append(i(th.getClass().getSimpleName()));
            sb.append(";cs.");
            sb.append(h(th, 0, 2, ":"));
            i--;
        }
        String message = th.getMessage();
        if (z && message != null && message.length() > 0) {
            amxd listIterator = d.entrySet().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                String str = (String) entry.getKey();
                if (message.contains(str)) {
                    message = message.replace(str, (CharSequence) entry.getValue());
                }
            }
            String bM = adyu.bM(message);
            sb.append(";m.");
            sb.append(bM);
        }
        return j(sb.toString());
    }

    private static String g(String... strArr) {
        return TextUtils.join(".", strArr);
    }

    private static String h(Throwable th, int i, int i2, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int min = Math.min(i2, length);
        while (i < min) {
            StackTraceElement stackTraceElement = stackTrace[i];
            String g = g(stackTraceElement.getClassName(), stackTraceElement.getMethodName());
            String num = Integer.toString(stackTraceElement.getLineNumber());
            String[] split = b.split(i(g));
            for (int i3 = 0; i3 < split.length; i3++) {
                if (split[i3].length() > 4) {
                    split[i3] = split[i3].substring(0, 4);
                }
            }
            sb.append(g(split));
            sb.append(".");
            sb.append(num);
            if (i != min - 1) {
                sb.append(str);
            }
            i++;
        }
        return sb.toString();
    }

    private static String i(String str) {
        for (Map.Entry entry : c.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str.contains(str2)) {
                str = str.replace(str2, (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    private static String j(String str) {
        return str.length() <= 500 ? str : str.substring(0, 500);
    }
}
