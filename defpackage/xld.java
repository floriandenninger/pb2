package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xld implements Runnable {
    final /* synthetic */ MediaAd a;
    final /* synthetic */ ykm b;
    final /* synthetic */ xle c;

    public xld(xle xleVar, MediaAd mediaAd, ykm ykmVar) {
        this.c = xleVar;
        this.a = mediaAd;
        this.b = ykmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (TextUtils.isEmpty(((RemoteVideoAd) this.a).c)) {
            this.b.b(this.a.m, null);
            return;
        }
        aihs a = this.c.a.a(this.a);
        try {
            xle xleVar = this.c;
            aifz d = PlaybackStartDescriptor.d();
            d.a = aigp.f(((RemoteVideoAd) this.a).c, "", -1, 0.0f);
            xleVar.c = a.b(d.a(), this.a.m, -1, null, false, aigd.a);
            this.b.b(this.a.m, (PlayerResponseModel) this.c.c.get(2L, TimeUnit.SECONDS));
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            this.c.c.cancel(true);
            this.b.a(this.a.m, new ExecutionException("Failed to get adPlayerResponse for mdx", e));
        }
    }
}
