package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajib extends ImageView {
    public boolean a;
    public syj b;
    public syd c;
    public aoam d;

    public ajib(Context context) {
        super(context);
        this.d = null;
        this.b = null;
        this.a = false;
    }

    private final Drawable d(Drawable drawable, aoam aoamVar) {
        drawable.setAutoMirrored(aoamVar.ad());
        int r = (aoamVar.aa() <= 0 || aoamVar.ab(0).aK() == null) ? 0 : (int) aoamVar.ab(0).aK().r();
        if (r != 0) {
            drawable.mutate().setColorFilter(r, PorterDuff.Mode.SRC_IN);
        }
        if (!this.a) {
            return drawable;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), drawable});
        transitionDrawable.startTransition(getResources().getInteger(R.integer.config_shortAnimTime));
        return transitionDrawable;
    }

    public final void a() {
        super.setImageDrawable(null);
        this.b = null;
        this.d = null;
        this.a = false;
    }

    public final void b(Bitmap bitmap, aoam aoamVar) {
        syj syjVar;
        Drawable drawable = null;
        if (bitmap == null) {
            super.setImageDrawable(null);
            return;
        }
        ImageView.ScaleType j = ahbn.j(aoamVar.Y());
        aoam aC = aoamVar.aC();
        if (j == ImageView.ScaleType.CENTER_INSIDE) {
            j = ImageView.ScaleType.FIT_CENTER;
        }
        if (aC != null && (syjVar = this.b) != null) {
            drawable = syjVar.a(aC, bitmap, j);
        }
        if (drawable == null) {
            drawable = new slo(bitmap, j, this.c);
        }
        super.setImageDrawable(d(drawable, aoamVar));
    }

    public final void c(Drawable drawable, aoam aoamVar) {
        if (drawable == null) {
            super.setImageDrawable(null);
            return;
        }
        if (drawable instanceof BitmapDrawable) {
            b(((BitmapDrawable) drawable).getBitmap(), aoamVar);
            return;
        }
        if (drawable instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
            if (aoamVar.aC() != null && aoamVar.aC().T() == 154604025) {
                frameSequenceDrawable.setCornerRadius((int) rwh.ae(axoj.aJ(aoamVar.aC().V()).aI(), getContext().getResources().getDisplayMetrics()));
            }
        }
        setScaleType(ahbn.j(aoamVar.Y()));
        super.setImageDrawable(d(drawable, aoamVar));
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        aoam aoamVar = this.d;
        if (aoamVar == null && bitmap == null) {
            super.setImageBitmap(null);
        } else if (aoamVar == null) {
            this.c.b(28, "YouTubeImageView.setImage() was not called");
        } else {
            b(bitmap, aoamVar);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        aoam aoamVar = this.d;
        if (aoamVar == null && drawable == null) {
            super.setImageDrawable(null);
        } else if (aoamVar == null) {
            this.c.b(28, "YouTubeImageView.setImage() was not called");
        } else {
            c(drawable, aoamVar);
        }
    }
}
