package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahvi implements aioa {
    final /* synthetic */ ahvm a;

    public ahvi(ahvm ahvmVar) {
        this.a = ahvmVar;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.V().E(ayqr.a()).Y(new ayrs() { // from class: ahvh
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahvi ahviVar = ahvi.this;
                PlayerResponseModel c = ((ahel) obj).a().c();
                if (c == null) {
                    return;
                }
                ahviVar.a.C = c.d.d("PLAYER_IS_CONTENT_INTERSTITIAL_KEY");
                ahviVar.a.B = c.d.d("PLAYER_CONTENT_INTERSTITIAL_IS_PREROLL_KEY");
                ahviVar.a.e();
            }
        }, ahfo.q)};
    }
}
