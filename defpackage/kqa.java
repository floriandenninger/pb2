package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kqa extends ahus implements fnp, ahxw {
    public Bitmap a;
    private final flx b;
    private final ajjz c;
    private final ajjv d;
    private kpz e;
    private boolean f;

    public kqa(Context context, ajjz ajjzVar, flx flxVar, aaea aaeaVar) {
        super(context);
        this.b = flxVar;
        this.c = ajjzVar;
        ajju b = ajjv.b.b();
        b.c(false);
        aswb aswbVar = aaeaVar.a().e;
        if ((aswbVar == null ? aswb.a : aswbVar).aC) {
            b.e = 2;
        } else {
            aswb aswbVar2 = aaeaVar.a().e;
            if ((aswbVar2 == null ? aswb.a : aswbVar2).aD) {
                b.e = 3;
            }
        }
        this.d = b.a();
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-16777216);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    @Override // defpackage.ahxw
    public final void b(Bitmap bitmap) {
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new aivh(-1, -1, false);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        ((ImageView) ld()).setBackgroundColor(true != this.f ? -16777216 : 0);
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            ajjz ajjzVar = this.c;
            flx flxVar = this.b;
            ImageView imageView = (ImageView) ld();
            kpz kpzVar = this.e;
            fkc.f(ajjzVar, flxVar, imageView, kpzVar != null ? kpzVar.a : null, kpzVar != null ? kpzVar.b : null, this.d);
            return;
        }
        ((ImageView) ld()).setImageBitmap(this.a);
    }

    public final void k(kpz kpzVar) {
        Bitmap bitmap = this.a;
        if ((bitmap == null || bitmap.isRecycled()) && !amkq.b(this.e, kpzVar)) {
            this.e = kpzVar;
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.a = 0;
        kU.b = 0;
        kU.f = true;
        kU.g = true;
        kU.b();
        kU.a();
        kU.e = false;
        return kU;
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return !fhgVar.g();
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        this.f = fhgVar.c();
        Y();
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.e != null;
    }

    @Override // defpackage.ahxw
    public final void nw() {
        this.a = null;
        k(null);
    }
}
