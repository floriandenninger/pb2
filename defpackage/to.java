package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class to extends ToggleButton {
    private final sj a;
    private final tk b;

    public to(Context context) {
        this(context, null);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.a();
        }
        tk tkVar = this.b;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    public to(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public to(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yf.d(this, getContext());
        sj sjVar = new sj(this);
        this.a = sjVar;
        sjVar.b(attributeSet, i);
        tk tkVar = new tk(this);
        this.b = tkVar;
        tkVar.g(attributeSet, i);
    }
}
