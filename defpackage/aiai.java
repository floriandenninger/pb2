package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiai implements Runnable {
    final /* synthetic */ aiak a;

    public aiai(aiak aiakVar) {
        this.a = aiakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yjk.e();
        aiak aiakVar = this.a;
        aypn h = aiakVar.j.G().a.h(ahbw.e(1));
        final aiaj aiajVar = this.a.h;
        aiajVar.getClass();
        aiakVar.k = h.Y(new ayrs() { // from class: aiag
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aiaj.this.a((ahef) obj);
            }
        }, ahwx.n);
        aiad aiadVar = aiaf.a;
        if (this.a.l != null) {
            aiadVar = new aiah(this);
        }
        aiak aiakVar2 = this.a;
        aiaf aiafVar = aiakVar2.c;
        aifz d = PlaybackStartDescriptor.d();
        d.a = aiakVar2.d;
        d.f = aiakVar2.f;
        d.e = aiakVar2.g;
        PlaybackStartDescriptor a = d.a();
        aiak aiakVar3 = this.a;
        aigg a2 = aigh.a();
        int i = aiakVar3.e;
        if (i > 0) {
            a2.b = 7;
            a2.b(i);
        } else {
            a2.b = 8;
        }
        aiafVar.a(a, a2.a(), aiadVar);
    }
}
