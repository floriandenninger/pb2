package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiae implements Runnable {
    final /* synthetic */ aiaf a;
    private final PlaybackStartDescriptor b;
    private final aigh c;
    private final aiad d;
    private final long e;
    private final afkm f;

    public aiae(aiaf aiafVar, PlaybackStartDescriptor playbackStartDescriptor, aigh aighVar, aiad aiadVar, long j, afkm afkmVar) {
        this.a = aiafVar;
        this.b = playbackStartDescriptor;
        this.c = aighVar;
        this.d = aiadVar;
        this.e = j;
        this.f = afkmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yjk.e();
        aihs aihsVar = this.a.b;
        PlaybackStartDescriptor playbackStartDescriptor = this.b;
        atww b = this.c.b();
        long j = this.e;
        afkm afkmVar = this.f;
        aijr b2 = aihsVar.e.b(playbackStartDescriptor.l(), playbackStartDescriptor.y(), playbackStartDescriptor.j(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), -1, aihsVar.g, playbackStartDescriptor.h(aihsVar.l), null, true);
        b2.Q = b;
        b2.G = playbackStartDescriptor.s();
        b2.H = playbackStartDescriptor.r();
        b2.f55J = playbackStartDescriptor.u();
        aifk aifkVar = aihsVar.j;
        aaox aaoxVar = null;
        if (aifkVar != null && aifkVar.h()) {
            aaoxVar = aaox.h(aihsVar.i, playbackStartDescriptor.f(), playbackStartDescriptor.h(aihsVar.l), playbackStartDescriptor.c(), afkmVar, playbackStartDescriptor.z());
        }
        if (aaoxVar != null && !TextUtils.isEmpty(playbackStartDescriptor.l())) {
            aaoxVar.i();
            aaoxVar.f(playbackStartDescriptor.l());
            if (j >= 0) {
                int i = (int) j;
                aaoxVar.l = i;
                aaoxVar.k = i;
            }
        }
        anhy c = aihsVar.c(playbackStartDescriptor.l(), null, b2, aaoxVar, false, false, null);
        this.d.c(2);
        try {
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) c.get();
            this.d.c(3);
            this.d.b(playerResponseModel);
        } catch (InterruptedException | ExecutionException unused) {
            this.d.c(4);
        }
    }
}
