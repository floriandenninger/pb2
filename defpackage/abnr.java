package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abnr implements TextView.OnEditorActionListener {
    final /* synthetic */ abns a;

    public abnr(abns abnsVar) {
        this.a = abnsVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && (keyEvent == null || keyEvent.getAction() != 0)) {
            return false;
        }
        this.a.C();
        return true;
    }
}
