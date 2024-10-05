package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bx extends cl {
    final /* synthetic */ ce a;

    public bx(ce ceVar) {
        this.a = ceVar;
    }

    @Override // defpackage.cl
    public final View a(int i) {
        View view = this.a.O;
        if (view == null) {
            throw new IllegalStateException("Fragment " + this.a + " does not have a view");
        }
        return view.findViewById(i);
    }

    @Override // defpackage.cl
    public final boolean b() {
        return this.a.O != null;
    }
}
