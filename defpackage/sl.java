package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sl extends CheckedTextView {
    private static final int[] a = {R.attr.checkMark};
    private final tk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        yh.a(context);
        yf.d(this, getContext());
        tk tkVar = new tk(this);
        this.b = tkVar;
        tkVar.g(attributeSet, R.attr.checkedTextViewStyle);
        tkVar.e();
        yk l = yk.l(getContext(), attributeSet, a, R.attr.checkedTextViewStyle, 0);
        setCheckMarkDrawable(l.h(0));
        l.o();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        tk tkVar = this.b;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jq.d(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(nz.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        tk tkVar = this.b;
        if (tkVar != null) {
            tkVar.h(context, i);
        }
    }
}
