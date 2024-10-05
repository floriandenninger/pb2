package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fpw implements fpx {
    final /* synthetic */ ImageView a;
    final /* synthetic */ azrw b;

    public fpw(ImageView imageView, azrw azrwVar) {
        this.a = imageView;
        this.b = azrwVar;
    }

    @Override // defpackage.fpx
    public final void a(boolean z) {
        ((zcd) this.b.get()).c(z ? this.a : null);
        if (z) {
            return;
        }
        this.a.setImageDrawable(null);
    }

    @Override // defpackage.fpx
    public final void b(mhn mhnVar) {
        ImageView imageView = this.a;
        mhp mhpVar = mhnVar.a;
        mhpVar.a.k(imageView, mhpVar.b, mhpVar.c);
    }
}
