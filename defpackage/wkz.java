package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputEditText;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkz extends InputConnectionWrapper {
    final /* synthetic */ CodeInputEditText a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkz(CodeInputEditText codeInputEditText, InputConnection inputConnection) {
        super(inputConnection, true);
        this.a = codeInputEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        CodeInputEditText codeInputEditText;
        wla wlaVar;
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && (wlaVar = (codeInputEditText = this.a).a) != null) {
            wlaVar.a(codeInputEditText);
        }
        return super.sendKeyEvent(keyEvent);
    }
}
