package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmv extends axna {
    final String a;

    public axmv(String str) {
        this.a = str;
    }

    @Override // defpackage.axna
    public final void a(String str) {
        String.valueOf(this.a).length();
        String.valueOf(str).length();
    }

    @Override // defpackage.axna
    public final void b(String str) {
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.e("isoparser", sb.toString());
    }

    @Override // defpackage.axna
    public final void c(String str) {
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.w("isoparser", sb.toString());
    }
}
