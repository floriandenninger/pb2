package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class sk extends CheckBox {
    private final sm a;
    private final sj b;
    private final tk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        yh.a(context);
        yf.d(this, getContext());
        sm smVar = new sm(this);
        this.a = smVar;
        smVar.a(attributeSet, R.attr.checkboxStyle);
        sj sjVar = new sj(this);
        this.b = sjVar;
        sjVar.b(attributeSet, R.attr.checkboxStyle);
        tk tkVar = new tk(this);
        this.c = tkVar;
        tkVar.g(attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        sj sjVar = this.b;
        if (sjVar != null) {
            sjVar.a();
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        sj sjVar = this.b;
        if (sjVar != null) {
            sjVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        sj sjVar = this.b;
        if (sjVar != null) {
            sjVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(nz.b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        sm smVar = this.a;
        if (smVar != null) {
            smVar.b();
        }
    }
}
