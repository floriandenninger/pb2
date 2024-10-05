package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kft implements kel {
    final /* synthetic */ kfw a;

    public kft(kfw kfwVar) {
        this.a = kfwVar;
    }

    @Override // defpackage.kel
    public final void a() {
        kfw kfwVar = this.a;
        if (kfwVar.d) {
            kfwVar.b.c(kfwVar.a);
            return;
        }
        akbz akbzVar = kfwVar.c;
        gcm d = gcq.d();
        d.f(true);
        d.k(this.a.a.getString(R.string.video_quality_unavailable_announcement));
        d.d(0);
        akbzVar.o(d.b());
    }
}
