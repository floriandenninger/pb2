package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xbx implements afxe {
    private final int a;
    private final int b;

    public xbx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        Integer num = (Integer) xbr.a.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 22) {
            return Integer.toString(this.a);
        }
        if (intValue != 23) {
            return null;
        }
        return Integer.toString(this.b);
    }

    @Override // defpackage.afxe
    public final String b() {
        return "xbx";
    }
}
