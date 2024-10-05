package defpackage;

import android.text.Editable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almm implements View.OnClickListener {
    final /* synthetic */ almq a;

    public almm(almq almqVar) {
        this.a = almqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text = this.a.k.a.getText();
        if (text != null) {
            text.clear();
        }
        this.a.k.h();
    }
}
