package defpackage;

import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class esh extends ajjh {
    final /* synthetic */ esi a;

    public esh(esi esiVar) {
        this.a = esiVar;
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void a(ImageView imageView) {
        this.a.g();
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void b(ImageView imageView) {
        this.a.f.setBackground(null);
        fvd f = this.a.f();
        if (f == null || f.a() == null) {
            return;
        }
        this.a.h.a(this, f.a());
    }
}
