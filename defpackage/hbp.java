package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hbp implements aioa {
    final /* synthetic */ SfvAudioItemPlaybackController a;

    public hbp(SfvAudioItemPlaybackController sfvAudioItemPlaybackController) {
        this.a = sfvAudioItemPlaybackController;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        aypn m = aiocVar.G().i.G().m(50L, TimeUnit.MILLISECONDS, this.a.d);
        ayrv ayrvVar = new ayrv() { // from class: hbo
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                hbp hbpVar = hbp.this;
                switch (((ahej) obj).a()) {
                    case 2:
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController = hbpVar.a;
                        return sfvAudioItemPlaybackController.g(sfvAudioItemPlaybackController.j, sfvAudioItemPlaybackController.k, aurg.SFV_AUDIO_ITEM_PLAYBACK_STATE_PLAYING);
                    case 3:
                    case 6:
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController2 = hbpVar.a;
                        return sfvAudioItemPlaybackController2.g(sfvAudioItemPlaybackController2.j, sfvAudioItemPlaybackController2.k, aurg.SFV_AUDIO_ITEM_PLAYBACK_STATE_PAUSED);
                    case 4:
                    case 7:
                    case 8:
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController3 = hbpVar.a;
                        return sfvAudioItemPlaybackController3.g(sfvAudioItemPlaybackController3.j, sfvAudioItemPlaybackController3.k, aurg.SFV_AUDIO_ITEM_PLAYBACK_STATE_STOPPED);
                    case 5:
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController4 = hbpVar.a;
                        return sfvAudioItemPlaybackController4.g(sfvAudioItemPlaybackController4.j, sfvAudioItemPlaybackController4.k, aurg.SFV_AUDIO_ITEM_PLAYBACK_STATE_BUFFERING);
                    default:
                        return ayph.f();
                }
            }
        };
        aysw.c(Integer.MAX_VALUE, "maxConcurrency");
        ayxt ayxtVar = new ayxt(m, ayrvVar);
        ayrv ayrvVar2 = aynu.p;
        return new ayqx[]{ayxtVar.S(ggc.i, ggk.r), aiocVar.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: hbn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                hbr hbrVar;
                long j;
                long j2;
                long j3;
                long j4;
                hbp hbpVar = hbp.this;
                if (((ahdv) obj).c() != aigk.VIDEO_PLAYBACK_LOADED || hbpVar.a.b.n() == null || hbpVar.a.b.n().d() == null) {
                    return;
                }
                aixm d = hbpVar.a.b.n().d();
                SfvAudioItemPlaybackController sfvAudioItemPlaybackController = hbpVar.a;
                autf autfVar = sfvAudioItemPlaybackController.m;
                if (autfVar != null && (autfVar.b & 1) != 0) {
                    aute auteVar = autfVar.c;
                    if (auteVar == null) {
                        auteVar = aute.a;
                    }
                    aoms aomsVar = auteVar.d;
                    if (aomsVar == null) {
                        aomsVar = aoms.a;
                    }
                    if (aoqx.a(aomsVar) > 0) {
                        j3 = auteVar.c;
                        aoms aomsVar2 = auteVar.d;
                        if (aomsVar2 == null) {
                            aomsVar2 = aoms.a;
                        }
                        j4 = aoqx.a(aomsVar2);
                    } else {
                        j3 = auteVar.c;
                        j4 = SfvAudioItemPlaybackController.a;
                    }
                    hbrVar = new hbr(sfvAudioItemPlaybackController, auteVar.c, j3 + j4);
                } else {
                    SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand = sfvAudioItemPlaybackController.l;
                    if (sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand == null || sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.e.isEmpty()) {
                        hbrVar = new hbr(sfvAudioItemPlaybackController, 0L, SfvAudioItemPlaybackController.a);
                    } else {
                        aurf aurfVar = (aurf) sfvAudioItemPlaybackController.l.e.get(0);
                        aoms aomsVar3 = aurfVar.c;
                        if (aomsVar3 == null) {
                            aomsVar3 = aoms.a;
                        }
                        if (aoqx.a(aomsVar3) > 0) {
                            j = aurfVar.b;
                            aoms aomsVar4 = aurfVar.c;
                            if (aomsVar4 == null) {
                                aomsVar4 = aoms.a;
                            }
                            j2 = aoqx.a(aomsVar4);
                        } else {
                            j = aurfVar.b;
                            j2 = SfvAudioItemPlaybackController.a;
                        }
                        hbrVar = new hbr(sfvAudioItemPlaybackController, aurfVar.b, j + j2);
                    }
                }
                d.c(hbrVar);
            }
        }, ggk.r)};
    }
}
