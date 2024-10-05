package defpackage;

import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahrf extends aixi {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahrf(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, long j) {
        super(j, Long.MAX_VALUE, 1, 1, null);
        this.a = creatorEndscreenOverlayPresenter;
    }

    @Override // defpackage.aixi
    public final void b(boolean z, boolean z2, boolean z3) {
        for (ahrq ahrqVar : this.a.h) {
            CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.a;
            ajjz ajjzVar = creatorEndscreenOverlayPresenter.b;
            int width = creatorEndscreenOverlayPresenter.g.getWidth();
            this.a.g.getHeight();
            aqte aqteVar = ahrqVar.b;
            int i = (int) (width * aqteVar.i);
            int i2 = (int) (i / aqteVar.k);
            avgg avggVar = aqteVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.n(avggVar, i, i2);
        }
    }
}
