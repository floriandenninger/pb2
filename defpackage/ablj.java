package defpackage;

import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ablj implements Runnable {
    final /* synthetic */ ablm a;

    public ablj(ablm ablmVar) {
        this.a = ablmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText = this.a.j;
        if (editText != null) {
            editText.setSelection(editText.length());
        }
    }
}
