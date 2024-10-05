package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bso {
    final int a;
    final int b;
    final String c;

    public bso(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.B;
        this.b = preference.C;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bso)) {
            return false;
        }
        bso bsoVar = (bso) obj;
        return this.a == bsoVar.a && this.b == bsoVar.b && TextUtils.equals(this.c, bsoVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
