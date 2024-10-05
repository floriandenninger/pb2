package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiou implements aiif, aipm {
    public final ypa a;
    public final aiow b;
    public final aiih c;
    public final aipn d;
    public final aipd e;
    public final aifk f;
    public final aimx g;
    private final banw h;
    private final aigv i;

    public aiou(banw banwVar, aimx aimxVar, ypa ypaVar, aigv aigvVar, aiow aiowVar, aiih aiihVar, aipn aipnVar, aipd aipdVar, aifk aifkVar) {
        this.h = banwVar;
        this.g = aimxVar;
        this.a = ypaVar;
        this.i = aigvVar;
        this.b = aiowVar;
        this.c = aiihVar;
        this.e = aipdVar;
        this.d = aipnVar;
        this.f = aifkVar;
        ypaVar.a(this, aifa.class, new aiot(this));
        aiihVar.f = this;
    }

    @Override // defpackage.aiif
    public final void a(WatchNextResponseModel watchNextResponseModel) {
        this.h.c(new ahei(watchNextResponseModel));
        aiwk aiwkVar = this.e.a;
        if (aiwkVar != null) {
            aiwkVar.s().aF().c(new ahei(watchNextResponseModel));
        }
    }

    @Override // defpackage.aipm
    public final void b(aapj aapjVar) {
        this.c.g(aapjVar.a, null, null);
    }

    public final aiiy c() {
        return new aios(this);
    }

    public final void d(final int i) {
        final aihk aihkVar;
        PlayerResponseModel playerResponseModel;
        PlaybackStartDescriptor playbackStartDescriptor;
        atyt i2;
        aiwk aiwkVar;
        this.b.c();
        final aiih aiihVar = this.c;
        String str = null;
        final String u = (!aiihVar.l.b(aigk.VIDEO_LOADING) || (aiwkVar = this.e.a) == null) ? null : aiwkVar.u();
        aiiy c = c();
        PlayerResponseModel playerResponseModel2 = aiihVar.p;
        if (aiihVar.n(playerResponseModel2, "currentPlayerResponse") || playerResponseModel2 == null || (aihkVar = aiihVar.m) == null || aiihVar.g != null) {
            return;
        }
        String str2 = (playerResponseModel2.q() == null || (i2 = ahbx.i(playerResponseModel2.q())) == null || (i2.b & 2) == 0) ? null : i2.d;
        if (!aiihVar.l.b(aigk.VIDEO_WATCH_LOADED) && str2 == null) {
            aiihVar.d();
            aiihVar.h(u, c);
            return;
        }
        final ykn c2 = ykn.c(new aiie(aiihVar, playerResponseModel2));
        aiihVar.g = c2;
        PlaybackStartDescriptor playbackStartDescriptor2 = aiihVar.o;
        if (playbackStartDescriptor2 != null) {
            aifz e = playbackStartDescriptor2.e();
            if (str2 != null) {
                e.o = str2;
            }
            String l = playbackStartDescriptor2.l();
            if (aiihVar.l.b(aigk.VIDEO_WATCH_LOADED)) {
                if (!aiihVar.n(aiihVar.n, "lastFullyLoadedStartDescriptor") && (playbackStartDescriptor = aiihVar.n) != null) {
                    str = playbackStartDescriptor.l();
                }
            } else if (!aiihVar.l.b(aigk.VIDEO_PLAYBACK_LOADED)) {
                PlaybackStartDescriptor playbackStartDescriptor3 = aiihVar.o;
                if (playbackStartDescriptor3 != null) {
                    str = playbackStartDescriptor3.l();
                }
            } else if (!aiihVar.n(aiihVar.a(), "currentPlayerResponse") && (playerResponseModel = aiihVar.p) != null) {
                str = playerResponseModel.y();
            }
            if (!TextUtils.isEmpty(l) && str != null) {
                e.n = str;
            }
            final PlaybackStartDescriptor a = e.a();
            aiihVar.d.execute(new Runnable() { // from class: aihu
                @Override // java.lang.Runnable
                public final void run() {
                    aiih.this.f(aihkVar, a, u, i, c2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        if (playbackStartDescriptor == null) {
            afsi.b(2, 10, "Playbackservice#startRequest called without PlaybackStartDescriptor");
            return;
        }
        this.e.c(playbackStartDescriptor, aigdVar);
        this.i.e(!playbackStartDescriptor.x());
        aiwk aiwkVar = this.e.a;
        String u = aiwkVar != null ? aiwkVar.u() : null;
        this.b.c();
        this.c.i(playbackStartDescriptor, u, c(), aigdVar);
    }

    @Override // defpackage.aipm
    public final void f() {
        d(-1);
    }
}
