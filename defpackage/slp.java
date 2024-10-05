package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class slp extends syd {
    @Override // defpackage.syd
    public final void a(int i, String str, sxc sxcVar, Throwable th) {
        int i2 = i + (-1) != 11 ? 6 : 5;
        String C = awxr.C(i);
        String stackTraceString = Log.getStackTraceString(th);
        StringBuilder sb = new StringBuilder(C.length() + 2 + String.valueOf(str).length() + String.valueOf(stackTraceString).length());
        sb.append(C);
        sb.append(" ");
        sb.append(str);
        sb.append('\n');
        sb.append(stackTraceString);
        Log.println(i2, "ElementsErrorLogger", sb.toString());
    }
}
