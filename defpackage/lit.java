package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lit implements View.OnClickListener {
    final RadioGroup a;
    final LayoutInflater b;
    final auqk c;
    final /* synthetic */ liv d;

    public lit(liv livVar, LayoutInflater layoutInflater, RadioGroup radioGroup, auqk auqkVar) {
        this.d = livVar;
        this.b = layoutInflater;
        this.a = radioGroup;
        this.c = auqkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.removeAllViews();
        this.d.aK(this.b, this.a, this.c);
    }
}
