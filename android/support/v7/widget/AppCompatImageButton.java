package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.youtube.R;
import defpackage.sj;
import defpackage.sq;
import defpackage.yf;
import defpackage.yh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    private final sj a;
    private final sq b;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.a();
        }
        sq sqVar = this.b;
        if (sqVar != null) {
            sqVar.a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.b.d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        sq sqVar = this.b;
        if (sqVar != null) {
            sqVar.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        sq sqVar = this.b;
        if (sqVar != null) {
            sqVar.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.b.c(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        sq sqVar = this.b;
        if (sqVar != null) {
            sqVar.a();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yh.a(context);
        yf.d(this, getContext());
        sj sjVar = new sj(this);
        this.a = sjVar;
        sjVar.b(attributeSet, i);
        sq sqVar = new sq(this);
        this.b = sqVar;
        sqVar.b(attributeSet, i);
    }
}
