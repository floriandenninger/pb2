package defpackage;

import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kg extends kh {
    final WindowInsets.Builder a;

    public kg() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.kh
    public final ko a() {
        ko q = ko.q(this.a.build());
        q.u(null);
        return q;
    }

    @Override // defpackage.kh
    public final void b(fn fnVar) {
        this.a.setStableInsets(fnVar.a());
    }

    @Override // defpackage.kh
    public final void c(fn fnVar) {
        this.a.setSystemWindowInsets(fnVar.a());
    }

    public kg(ko koVar) {
        super(koVar);
        WindowInsets.Builder builder;
        WindowInsets s = koVar.s();
        if (s != null) {
            builder = new WindowInsets.Builder(s);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
