package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hyy implements ykl {
    final /* synthetic */ ImageView a;
    final /* synthetic */ zpx b;
    final /* synthetic */ hza c;

    public hyy(hza hzaVar, ImageView imageView, zpx zpxVar) {
        this.c = hzaVar;
        this.a = imageView;
        this.b = zpxVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        hza hzaVar = this.c;
        Bitmap A = wcy.A(hzaVar.d, hzaVar.h);
        wcy.C(this.c.d, A, this.b);
        A.recycle();
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.a.setImageBitmap((Bitmap) obj2);
        hza hzaVar = this.c;
        Bitmap A = wcy.A(hzaVar.d, hzaVar.h);
        wcy.C(this.c.d, A, this.b);
        A.recycle();
    }
}
