package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wpu {
    public final Executor a;
    private final Executor b;

    public wpu(Executor executor, Executor executor2) {
        this.b = executor;
        this.a = executor2;
    }

    public final void a(final PlayerResponseModel playerResponseModel, final String str, aixh aixhVar, final long j) {
        final ajbv e = aixhVar.e();
        if (e == null) {
            throw new wnw("Null playback timeline for Ad queue");
        }
        this.b.execute(new Runnable() { // from class: wpt
            @Override // java.lang.Runnable
            public final void run() {
                wpu wpuVar = wpu.this;
                ajbv ajbvVar = e;
                String str2 = str;
                PlayerResponseModel playerResponseModel2 = playerResponseModel;
                long j2 = j;
                ajbvVar.e(str2);
                ajbvVar.C(j2, j2, null, ajbvVar.m(playerResponseModel2, str2, 1));
                wpuVar.a.execute(new wth(ajbvVar, 1));
            }
        });
    }
}
