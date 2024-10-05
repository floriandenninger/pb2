package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xbn implements afxe {
    private final xbm a;

    public xbn(xbm xbmVar) {
        this.a = xbmVar;
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        Integer num = (Integer) xbr.a.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 4) {
            return Integer.toString(this.a.c());
        }
        if (intValue == 10) {
            return true != this.a.e() ? "0" : "1";
        }
        if (intValue == 24) {
            return Integer.toString(this.a.a());
        }
        if (intValue == 16) {
            return Integer.toString(this.a.b());
        }
        if (intValue != 17) {
            return null;
        }
        String str2 = this.a.b;
        return str2 != null ? str2 : "";
    }

    @Override // defpackage.afxe
    public final String b() {
        return "xbn";
    }
}
