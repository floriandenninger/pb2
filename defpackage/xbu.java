package defpackage;

import android.net.Uri;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xbu implements afxe {
    private Integer a;

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        Integer num;
        if (str == null || (num = (Integer) xbr.a.get(str)) == null || num.intValue() != 67 || this.a == null) {
            return null;
        }
        return String.format(Locale.US, "%d", this.a);
    }

    @Override // defpackage.afxe
    public final String b() {
        return "xbu";
    }

    public final void c() {
        this.a = null;
    }

    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }
}
