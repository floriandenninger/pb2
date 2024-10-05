package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfp extends rhg {
    public char a;
    public long b;
    public final rfn c;
    public final rfn d;
    public final rfn e;
    public final rfn f;
    public final rfn g;
    public final rfn h;
    public final rfn i;
    public final rfn j;
    public final rfn k;
    private String l;

    public rfp(rgt rgtVar) {
        super(rgtVar);
        this.a = (char) 0;
        this.b = -1L;
        this.c = new rfn(this, 6, false, false);
        this.d = new rfn(this, 6, true, false);
        this.e = new rfn(this, 6, false, true);
        this.f = new rfn(this, 5, false, false);
        this.g = new rfn(this, 5, true, false);
        this.h = new rfn(this, 5, false, true);
        this.i = new rfn(this, 4, false, false);
        this.j = new rfn(this, 3, false, false);
        this.k = new rfn(this, 2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new rfo(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String c = c(z, obj);
        String c2 = c(z, obj2);
        String c3 = c(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(c)) {
            sb.append(str2);
            sb.append(c);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(c2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(c2);
        }
        if (!TextUtils.isEmpty(c3)) {
            sb.append(str3);
            sb.append(c3);
        }
        return sb.toString();
    }

    static String c(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String i2 = i(rgt.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && i(className).equals(i2)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb2.toString();
        }
        if (obj instanceof rfo) {
            return ((rfo) obj).a;
        }
        return z ? "-" : String.valueOf(obj);
    }

    private static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final void e(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && h(i)) {
            g(i, b(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        qip.an(str);
        rgr rgrVar = this.w.i;
        if (rgrVar == null) {
            g(6, "Scheduler not set. Not logging error/warn");
        } else if (!rgrVar.m()) {
            g(6, "Scheduler not initialized. Not logging error/warn");
        } else {
            rgrVar.g(new rfm(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        }
    }

    @Override // defpackage.rhg
    protected final boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(int i, String str) {
        Log.println(i, d(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h(int i) {
        return Log.isLoggable(d(), i);
    }

    protected final String d() {
        String str;
        synchronized (this) {
            if (this.l == null) {
                String str2 = this.w.d;
                if (str2 != null) {
                    this.l = str2;
                } else {
                    this.l = J().l();
                }
            }
            qip.an(this.l);
            str = this.l;
        }
        return str;
    }
}
