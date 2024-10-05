package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xij implements ykl {
    final /* synthetic */ xik a;

    public xij(xik xikVar) {
        this.a = xikVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Couldn't retrieve thumbnail from [uri=");
        sb.append(valueOf);
        sb.append("]");
        zga.d(sb.toString(), exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        krq krqVar = (krq) this.a.a;
        krqVar.e.setImageBitmap(bitmap);
        krqVar.e.setVisibility(bitmap != null ? 0 : 4);
        if (TextUtils.isEmpty(krqVar.q)) {
            return;
        }
        krqVar.e.setContentDescription(krqVar.q);
    }
}
