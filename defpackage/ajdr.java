package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdr extends syd {
    private final sye a;

    public ajdr(sye syeVar) {
        this.a = syeVar;
    }

    static String e(String str) {
        if (str == null) {
            return "Unknown Template";
        }
        for (String str2 : amnm.d("[ '\"(),;|]").f(str)) {
            if (str2.endsWith(".eml")) {
                return str2;
            }
        }
        return "Unknown Template";
    }

    private static int f(int i) {
        return i + (-1) != 11 ? 2 : 1;
    }

    @Override // defpackage.syd
    public final void a(int i, String str, sxc sxcVar, Throwable th) {
        String str2;
        if (sxcVar != null) {
            StringBuilder sb = sxcVar.m;
            str2 = sb != null ? sb.toString() : "Unknown Template";
        } else {
            str2 = null;
        }
        if (th == null) {
            if (amnu.a(str2)) {
                str2 = e(str);
            }
            afsi.b(f(i), 23, str);
            this.a.a(i, str, str2);
            return;
        }
        String C = awxr.C(i);
        StringBuilder sb2 = new StringBuilder(C.length() + 1 + String.valueOf(str).length());
        sb2.append(C);
        sb2.append(" ");
        sb2.append(str);
        afsi.c(f(i), 23, sb2.toString(), th);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(": ");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            sb3.append(th2);
            sb3.append(" ");
        }
        Log.getStackTraceString(th);
        String sb4 = sb3.toString();
        if (amnu.a(str2)) {
            str2 = e(sb4);
        }
        this.a.a(i, sb4, str2);
    }
}
