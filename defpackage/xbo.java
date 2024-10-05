package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xbo implements afxe {
    private final xlj a;

    public xbo(xlj xljVar) {
        this.a = xljVar;
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        Integer num = (Integer) xbr.a.get(str);
        if (num == null || num.intValue() != 61) {
            return null;
        }
        return this.a.c(uri.getQueryParameter("ai"));
    }

    @Override // defpackage.afxe
    public final String b() {
        return "xbo";
    }
}
