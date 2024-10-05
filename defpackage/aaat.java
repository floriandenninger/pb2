package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaat implements View.OnClickListener {
    final /* synthetic */ aaay a;

    public aaat(aaay aaayVar) {
        this.a = aaayVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.a();
        this.a.f(true);
    }
}
