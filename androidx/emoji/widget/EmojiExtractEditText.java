package androidx.emoji.widget;

import android.R;
import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.ajbh;
import defpackage.amg;
import defpackage.ami;
import defpackage.aml;
import defpackage.gn;
import defpackage.jm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiExtractEditText extends ExtractEditText {
    private amg a;
    private boolean b;

    public EmojiExtractEditText(Context context) {
        super(context);
        b(null, 0, 0);
    }

    private final amg a() {
        if (this.a == null) {
            this.a = new amg(this);
        }
        return this.a;
    }

    private final void b(AttributeSet attributeSet, int i, int i2) {
        if (this.b) {
            return;
        }
        this.b = true;
        int i3 = new ajbh(this, attributeSet, i, i2).i;
        amg a = a();
        gn.f(i3, "maxEmojiCount should be greater than 0");
        a.a.b.a = i3;
        setKeyListener(super.getKeyListener());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        amg a = a();
        if (onCreateInputConnection == null) {
            return null;
        }
        return onCreateInputConnection instanceof ami ? onCreateInputConnection : new ami(a.a.a, onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            a();
            if (!(keyListener instanceof aml)) {
                keyListener = new aml(keyListener);
            }
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, R.attr.editTextStyle, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(attributeSet, i, i2);
    }
}
