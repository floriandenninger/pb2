package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ibd implements ykl {
    final /* synthetic */ ImageView a;
    final /* synthetic */ View b;
    final /* synthetic */ axdj c;
    final /* synthetic */ ici d;
    final /* synthetic */ ibe e;

    public ibd(ibe ibeVar, ImageView imageView, View view, axdj axdjVar, ici iciVar) {
        this.e = ibeVar;
        this.a = imageView;
        this.b = view;
        this.c = axdjVar;
        this.d = iciVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.e.e(this.a);
        ibe ibeVar = this.e;
        etx.aq(ibeVar.c, ibeVar.p, this.b, this.c, this.d);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.a.setImageBitmap((Bitmap) obj2);
        ibe ibeVar = this.e;
        etx.aq(ibeVar.c, ibeVar.p, this.b, this.c, this.d);
    }
}
