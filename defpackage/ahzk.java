package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahzk implements Runnable, aiad {
    private final aiaf a;
    private final PlaybackStartDescriptor b;
    private final aiap c;
    private final aes d;
    private final ajoy e;

    public ahzk(aiaf aiafVar, ajoy ajoyVar, aes aesVar, PlaybackStartDescriptor playbackStartDescriptor, aiap aiapVar, byte[] bArr, byte[] bArr2) {
        this.a = aiafVar;
        this.e = ajoyVar;
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
        if (!ahbx.l(playerResponseModel.q())) {
            this.d.d(new IllegalArgumentException("Prefetch not playable."));
        }
        ajoy ajoyVar = this.e;
        aes aesVar = this.d;
        aiap aiapVar = this.c;
        aeeo aeeoVar = (aeeo) ajoyVar.a.get();
        aeeoVar.getClass();
        ahzj ahzjVar = new ahzj(aeeoVar, aesVar, aiapVar);
        yjk.e();
        ahzjVar.a.a(playerResponseModel, playerResponseModel.c().F(), ahzjVar.b.a, ahzjVar);
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
        this.a.a(this.b, this.c.b, this);
    }
}
