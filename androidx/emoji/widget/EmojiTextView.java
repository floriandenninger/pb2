package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import defpackage.amk;
import defpackage.amm;
import defpackage.amn;
import defpackage.hm;
import defpackage.jm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiTextView extends TextView {
    private amn a;
    private boolean b;

    public EmojiTextView(Context context) {
        super(context);
        b();
    }

    private final amn a() {
        if (this.a == null) {
            this.a = new amn(this);
        }
        return this.a;
    }

    private final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        a().a.d();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        hm hmVar = a().a;
        if (z) {
            hmVar.d();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        hm hmVar = a().a;
        int length = inputFilterArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (inputFilterArr[i] instanceof amk) {
                    break;
                } else {
                    i++;
                }
            } else {
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = ((amm) hmVar).a;
                inputFilterArr = inputFilterArr2;
                break;
            }
        }
        super.setFilters(inputFilterArr);
    }

    public EmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
