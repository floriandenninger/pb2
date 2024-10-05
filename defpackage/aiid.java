package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiid implements aiiy {
    final /* synthetic */ aiiy a;
    final /* synthetic */ acsx b;
    final /* synthetic */ aiih c;

    public aiid(aiih aiihVar, aiiy aiiyVar, acsx acsxVar) {
        this.c = aiihVar;
        this.a = aiiyVar;
        this.b = acsxVar;
    }

    @Override // defpackage.aiiy
    public final void a(int i) {
        if (this.c.p == null) {
            boolean z = this.c.q != null;
            boolean z2 = this.c.r;
            StringBuilder sb = new StringBuilder(171);
            sb.append("About to send VIDEO_WATCH_LOADED but do not have a currentPlayerResponse. WatchNext set: ");
            sb.append(z);
            sb.append(", initialShouldJoinWatchNextResponseOfSequence: ");
            sb.append(z2);
            sb.append(", requestPlayback: ");
            sb.append(aiih.m(i));
            zga.b(sb.toString());
        } else {
            this.c.l(aigk.VIDEO_WATCH_LOADED);
        }
        this.a.a(i);
    }

    @Override // defpackage.aiiy
    public final void b(aigr aigrVar) {
        this.a.b(aigrVar);
    }

    @Override // defpackage.aiiy
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.aiiy
    public final void d(PlayerResponseModel playerResponseModel) {
        this.a.d(playerResponseModel);
        aiih aiihVar = this.c;
        aiihVar.g(playerResponseModel, aiihVar.o, this.b);
    }

    @Override // defpackage.aiiy
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.aiiy
    public final void f(aigr aigrVar) {
        this.a.f(aigrVar);
    }

    @Override // defpackage.aiiy
    public final void g(WatchNextResponseModel watchNextResponseModel) {
        this.a.g(watchNextResponseModel);
        aiih aiihVar = this.c;
        aiihVar.q = watchNextResponseModel;
        PlaybackStartDescriptor playbackStartDescriptor = aiihVar.o;
        if (playbackStartDescriptor == null) {
            return;
        }
        if (TextUtils.isEmpty(playbackStartDescriptor.l())) {
            aifz e = playbackStartDescriptor.e();
            e.n = watchNextResponseModel.b;
            aiihVar.o = e.a();
        }
        aifz d = PlaybackStartDescriptor.d();
        d.a = watchNextResponseModel.c;
        aiihVar.n = d.a();
        aiif aiifVar = aiihVar.f;
        if (aiifVar != null) {
            aiifVar.a(watchNextResponseModel);
        }
    }
}
