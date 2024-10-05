package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahxy implements ykl {
    final /* synthetic */ ahxz a;

    public ahxy(ahxz ahxzVar) {
        this.a = ahxzVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zga.n("Failed to load playerview thumbnail", exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ahxz ahxzVar = this.a;
        ahxzVar.b = (Bitmap) obj2;
        ahxzVar.a.b(ahxzVar.b);
    }
}
