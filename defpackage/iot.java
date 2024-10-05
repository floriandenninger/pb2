package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.youtube.app.extensions.social.controller.MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iot implements TextWatcher {
    final /* synthetic */ iox a;

    public iot(iox ioxVar) {
        this.a = ioxVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int selectionStart;
        iox ioxVar = this.a;
        if (ioxVar.l != null || !ioxVar.f() || (selectionStart = ioxVar.b.getSelectionStart()) <= 0 || "@﹫＠+﹢＋".indexOf(ioxVar.b.getText().charAt(selectionStart - 1)) == -1 || ioxVar.o >= 10) {
            if (ioxVar.l == null) {
                return;
            }
            if (ioxVar.f()) {
                Editable text = ioxVar.b.getText();
                int selectionStart2 = ioxVar.b.getSelectionStart();
                boolean z = false;
                boolean z2 = selectionStart2 > 0 && text.charAt(selectionStart2 + (-1)) == ' ';
                if (selectionStart2 >= 2 && text.charAt(selectionStart2 - 2) == ' ') {
                    z = true;
                }
                if (((!ioxVar.n && !z) || !z2) && text.getSpanStart(ioxVar.l) < text.getSpanEnd(ioxVar.l)) {
                    Editable text2 = ioxVar.b.getText();
                    ioxVar.h.d(text2.subSequence(text2.getSpanStart(ioxVar.l) + 1, text2.getSpanEnd(ioxVar.l)).toString());
                    return;
                }
            }
            ioxVar.b();
            return;
        }
        int selectionStart3 = ioxVar.b.getSelectionStart();
        ioxVar.l = new MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan();
        ioxVar.b.getText().setSpan(ioxVar.l, selectionStart3 - 1, selectionStart3, 34);
        ioxVar.h.e();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() <= 0 || i >= charSequence.length() || i < 0 || charSequence.charAt(i) != '\n') {
            return;
        }
        this.a.b();
    }
}
