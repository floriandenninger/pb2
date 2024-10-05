package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ffd implements afxe {
    public volatile String a;

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        Integer num = (Integer) xbr.a.get(str);
        if (num != null && num.intValue() == 15) {
            return zhq.h(this.a);
        }
        return null;
    }

    @Override // defpackage.afxe
    public final String b() {
        return "ffd";
    }
}
