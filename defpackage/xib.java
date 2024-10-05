package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xib implements ykl {
    final /* synthetic */ xic a;

    public xib(xic xicVar) {
        this.a = xicVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zga.n("Failed to load playerview thumbnail", exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        xic xicVar = this.a;
        xicVar.b = (Bitmap) obj2;
        xicVar.a.b(xicVar.b);
    }
}
