package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class si extends AutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final sj b;
    private final tk c;

    public si(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jq.d(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
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

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.o(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(nz.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.h(context, i);
        }
    }

    public si(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.youtube.R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yh.a(context);
        yf.d(this, getContext());
        yk l = yk.l(getContext(), attributeSet, a, i, 0);
        if (l.q(0)) {
            setDropDownBackgroundDrawable(l.h(0));
        }
        l.o();
        sj sjVar = new sj(this);
        this.b = sjVar;
        sjVar.b(attributeSet, i);
        tk tkVar = new tk(this);
        this.c = tkVar;
        tkVar.g(attributeSet, i);
        tkVar.e();
    }
}
