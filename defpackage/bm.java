package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bm implements ain {
    final /* synthetic */ View a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ bn c;
    final /* synthetic */ en d;

    public bm(View view, ViewGroup viewGroup, bn bnVar, en enVar) {
        this.a = view;
        this.b = viewGroup;
        this.c = bnVar;
        this.d = enVar;
    }

    @Override // defpackage.ain
    public final void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.b();
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(this.d);
            sb.append(" has been cancelled.");
        }
    }
}
