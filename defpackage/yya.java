package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yya {
    final StringBuilder a = new StringBuilder();

    private final void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.a.length() > 0) {
            this.a.append(',');
        }
        StringBuilder sb = this.a;
        sb.append(str);
        sb.append('=');
        sb.append(str2);
    }

    public final String a() {
        if (this.a.length() > 0) {
            return this.a.toString();
        }
        return null;
    }

    public final void b(yxw yxwVar, long j) {
        if (((Long) yxwVar.b).longValue() == j) {
            return;
        }
        d(yxwVar.a, Long.toString(j));
    }

    public final void c(yxw yxwVar, boolean z) {
        if (((Boolean) yxwVar.b).booleanValue() == z) {
            return;
        }
        d(yxwVar.a, Boolean.toString(z));
    }
}
