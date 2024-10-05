package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wpq implements afxe {
    final /* synthetic */ Map a;

    public wpq(Map map) {
        this.a = map;
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        return (String) this.a.get(str);
    }

    @Override // defpackage.afxe
    public final String b() {
        return "";
    }
}
