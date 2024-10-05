package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uwm {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public uwm(Context context, uwn uwnVar) {
        String str;
        if (uwnVar.c) {
            String str2 = uwnVar.b;
            String packageName = context.getPackageName();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(packageName).length());
            sb.append(str2);
            sb.append("#");
            sb.append(packageName);
            str = sb.toString();
        } else {
            str = uwnVar.b;
        }
        this.a = str;
        int H = aobq.H(uwnVar.d);
        this.f = H != 0 ? H : 1;
        this.b = uwnVar.g;
        this.c = uwnVar.e;
        this.d = uwnVar.f;
        this.e = uwnVar.c;
    }
}
