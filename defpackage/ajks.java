package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajks extends dcd {
    final /* synthetic */ ykl a;
    final /* synthetic */ Uri b;

    public ajks(ykl yklVar, Uri uri) {
        this.a = yklVar;
        this.b = uri;
    }

    @Override // defpackage.dcd, defpackage.dcl
    public final void a(Drawable drawable) {
        ykl yklVar = this.a;
        Uri uri = this.b;
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Load failed: ");
        sb.append(valueOf);
        yklVar.a(uri, new csz(sb.toString()));
    }

    @Override // defpackage.dcl
    public final /* bridge */ /* synthetic */ void b(Object obj, dcs dcsVar) {
        this.a.b(this.b, (Bitmap) obj);
    }

    @Override // defpackage.dcl
    public final void jZ(Drawable drawable) {
    }
}
