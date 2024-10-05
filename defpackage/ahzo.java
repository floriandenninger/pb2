package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzo implements Runnable, aiad {
    private final aiaf a;
    private final PlaybackStartDescriptor b;
    private final aiap c;
    private final aes d;

    public ahzo(aiaf aiafVar, aes aesVar, PlaybackStartDescriptor playbackStartDescriptor, aiap aiapVar) {
        this.a = aiafVar;
        this.d = aesVar;
        this.b = playbackStartDescriptor;
        this.c = aiapVar;
    }

    @Override // defpackage.aiad
    public final /* synthetic */ void a(Throwable th) {
    }

    @Override // defpackage.aiad
    public final void b(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            this.d.d(new IllegalArgumentException("Empty prefetch response."));
        }
        if (ahbx.l(playerResponseModel.q())) {
            return;
        }
        this.d.d(new IllegalArgumentException("Prefetch not playable."));
    }

    @Override // defpackage.aiad
    public final void c(int i) {
        if (i == 4) {
            this.d.d(new IllegalArgumentException("Prefetch failed."));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        yjk.e();
        aiaf aiafVar = this.a;
        PlaybackStartDescriptor playbackStartDescriptor = this.b;
        aiap aiapVar = this.c;
        aiafVar.b(playbackStartDescriptor, aiapVar.b, this, aiapVar.a, null);
    }
}
