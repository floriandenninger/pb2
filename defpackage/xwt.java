package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xwt implements TextWatcher {
    final /* synthetic */ TextView a;
    final /* synthetic */ BackstagePollEditorView b;

    public xwt(BackstagePollEditorView backstagePollEditorView, TextView textView) {
        this.b = backstagePollEditorView;
        this.a = textView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.d(editable.toString().length(), this.a);
        xxj xxjVar = this.b.c;
        if (xxjVar != null) {
            xxjVar.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
