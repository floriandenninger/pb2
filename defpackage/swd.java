package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class swd extends dcd {
    private final ImageView.ScaleType a;
    private final syd b;
    private final spc d;
    private final aoam e;

    public swd(aoam aoamVar, spc spcVar, int i, int i2, ImageView.ScaleType scaleType, syd sydVar) {
        super(i, i2);
        this.e = aoamVar;
        this.d = spcVar;
        this.a = scaleType;
        this.b = sydVar;
    }

    @Override // defpackage.dcd, defpackage.dcl
    public final void a(Drawable drawable) {
        if (drawable != null) {
            this.d.b(drawable);
        }
    }

    @Override // defpackage.dcl
    public final /* bridge */ /* synthetic */ void b(Object obj, dcs dcsVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            ImageView.ScaleType scaleType = this.a;
            if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            drawable = new slo(((BitmapDrawable) drawable).getBitmap(), scaleType, this.b);
        }
        sgf.r(drawable, this.e);
        this.d.b(drawable);
    }

    @Override // defpackage.dcl
    public final void jZ(Drawable drawable) {
        if (drawable != null) {
            this.d.b(drawable);
        }
    }
}
