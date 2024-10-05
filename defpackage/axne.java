package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axne extends ayqp implements View.OnClickListener {
    private final View a;
    private final ayqd b;

    public axne(View view, ayqd ayqdVar) {
        this.a = view;
        this.b = ayqdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayqp
    public final void a() {
        this.a.setOnClickListener(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (e()) {
            return;
        }
        this.b.c(axnd.a);
    }
}
