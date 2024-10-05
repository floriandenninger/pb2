package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ys extends kc {
    final /* synthetic */ int a;
    final /* synthetic */ yt b;
    private boolean c = false;

    public ys(yt ytVar, int i) {
        this.b = ytVar;
        this.a = i;
    }

    @Override // defpackage.kc, defpackage.kb
    public final void a(View view) {
        if (this.c) {
            return;
        }
        this.b.a.setVisibility(this.a);
    }

    @Override // defpackage.kc, defpackage.kb
    public final void b() {
        this.c = true;
    }

    @Override // defpackage.kc, defpackage.kb
    public final void c() {
        this.b.a.setVisibility(0);
    }
}
