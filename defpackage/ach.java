package defpackage;

import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricPrompt;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.security.Signature;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ach {
    public static BiometricPrompt.CryptoObject a(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    public static BiometricPrompt.CryptoObject b(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    public static BiometricPrompt.CryptoObject c(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }

    public static Signature d(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }

    public static Cipher e(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    public static Mac f(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    public static final float g(adq adqVar) {
        return ((adr) adqVar.a).a;
    }

    public static final void h(adq adqVar, float f) {
        Drawable drawable = adqVar.a;
        boolean c = adqVar.c();
        boolean b = adqVar.b();
        adr adrVar = (adr) drawable;
        if (f != adrVar.b || adrVar.c != c || adrVar.d != b) {
            adrVar.b = f;
            adrVar.c = c;
            adrVar.d = b;
            adrVar.b(null);
            adrVar.invalidateSelf();
        }
        if (adqVar.c()) {
            float f2 = ((adr) adqVar.a).b;
            float g = g(adqVar);
            int ceil = (int) Math.ceil(ads.a(f2, g, adqVar.b()));
            int ceil2 = (int) Math.ceil(ads.b(f2, g, adqVar.b()));
            adqVar.a(ceil, ceil2, ceil, ceil2);
            return;
        }
        adqVar.a(0, 0, 0, 0);
    }

    public static /* synthetic */ String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static long j(String str) {
        String str2;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                String str3 = cnr.a;
                return 0L;
            }
            Object[] objArr = {str};
            String str4 = cnr.a;
            String format = String.format(Locale.US, "Unable to parse dateStr: %s, falling back to 0", objArr);
            StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
            int i = 2;
            while (true) {
                if (i >= stackTrace.length) {
                    str2 = "<unknown>";
                    break;
                }
                if (!stackTrace[i].getClassName().equals(cnr.b)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                    String methodName = stackTrace[i].getMethodName();
                    StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                    sb.append(substring2);
                    sb.append(".");
                    sb.append(methodName);
                    str2 = sb.toString();
                    break;
                }
                i++;
            }
            Log.e(str4, String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format), e);
            return 0L;
        }
    }

    public static cnc k(cnh cnhVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = cnhVar.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long j6 = str != null ? j(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        long j7 = str3 != null ? j(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long j8 = str4 != null ? j(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (j6 <= 0 || j7 < j6) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (j7 - j6);
                j3 = j4;
            }
        }
        cnc cncVar = new cnc();
        cncVar.a = cnhVar.b;
        cncVar.b = str5;
        cncVar.f = j4;
        cncVar.e = j3;
        cncVar.c = j6;
        cncVar.d = j8;
        cncVar.g = map;
        List list = cnhVar.d;
        return cncVar;
    }

    public static String l(Map map) {
        return m(map, "ISO-8859-1");
    }

    public static String m(Map map, String str) {
        String str2;
        if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }
}
