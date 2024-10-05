package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abrw implements ykl {
    final /* synthetic */ String a;
    final /* synthetic */ ykl b;
    final /* synthetic */ abrx c;

    public abrw(abrx abrxVar, String str, ykl yklVar) {
        this.c = abrxVar;
        this.a = str;
        this.b = yklVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.b.a((Uri) obj, exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        this.c.e(bitmap, this.a);
        this.b.b((Uri) obj, bitmap);
    }
}
