package defpackage;

import android.view.View;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alnb implements View.OnClickListener {
    final /* synthetic */ alnf a;

    public alnb(alnf alnfVar) {
        this.a = alnfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        alnf alnfVar = this.a;
        alnfVar.e((AutoCompleteTextView) alnfVar.k.a);
    }
}
