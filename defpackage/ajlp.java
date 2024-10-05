package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajlp implements ajjn {
    private final ajll a;
    private final ajln b;

    public ajlp(int i) {
        ajlh ajlhVar = new ajlh();
        ajli ajliVar = new ajli();
        cuk cukVar = new cuk(i);
        this.a = new ajll(cukVar, ajliVar, ajlhVar);
        this.b = new ajln(cukVar, ajlhVar);
    }

    @Override // defpackage.ajjn
    public final ylz a() {
        return this.b;
    }

    @Override // defpackage.ajjn
    public final ylz b() {
        return this.a;
    }

    @Override // defpackage.ajjn
    public final void c() {
        this.a.a.i();
    }

    @Override // defpackage.ajjn
    public final void d(Uri uri) {
        ajll ajllVar = this.a;
        if (uri == null) {
            return;
        }
        ajllVar.g((ctd) ajllVar.a.h((cqi) ajllVar.b.c(uri)));
    }
}
