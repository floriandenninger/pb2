package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hbj implements aaha {
    private final SfvAudioItemPlaybackController a;

    public hbj(SfvAudioItemPlaybackController sfvAudioItemPlaybackController) {
        this.a = sfvAudioItemPlaybackController;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        amkq.E(apxfVar.pY(SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand));
        amkq.E(1 == (((SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand) apxfVar.pX(SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand)).b & 1));
        final SfvAudioItemPlaybackController sfvAudioItemPlaybackController = this.a;
        SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand = (SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand) apxfVar.pX(SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand);
        final aomf aomfVar = apxfVar.c;
        if (!sfvAudioItemPlaybackController.k.h() || !sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.g.equals(sfvAudioItemPlaybackController.k.c())) {
            sfvAudioItemPlaybackController.n = sfvAudioItemPlaybackController.i.d(asmn.LATENCY_ACTION_SHORTS_AUDIO_PICKER_PLAYBACK);
            sfvAudioItemPlaybackController.n.e();
            sfvAudioItemPlaybackController.b.x(sfvAudioItemPlaybackController.e.d, sfvAudioItemPlaybackController.f);
            aong aongVar = (aong) apxf.a.createBuilder();
            aonk aonkVar = WatchEndpointOuterClass.watchEndpoint;
            aone createBuilder = awdp.a.createBuilder();
            String str = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.c;
            createBuilder.copyOnWrite();
            awdp awdpVar = (awdp) createBuilder.instance;
            str.getClass();
            awdpVar.b = 1 | awdpVar.b;
            awdpVar.d = str;
            String str2 = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.d;
            createBuilder.copyOnWrite();
            awdp awdpVar2 = (awdp) createBuilder.instance;
            str2.getClass();
            awdpVar2.b |= 512;
            awdpVar2.l = str2;
            aongVar.e(aonkVar, (awdp) createBuilder.build());
            apxf apxfVar2 = (apxf) aongVar.build();
            aifz d = PlaybackStartDescriptor.d();
            d.a = apxfVar2;
            d.d();
            final PlaybackStartDescriptor a = d.a();
            if ((sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.b & 4) != 0) {
                apxf apxfVar3 = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.f;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                if (apxfVar3.pY(arbr.b)) {
                    aaxn aaxnVar = sfvAudioItemPlaybackController.o;
                    apxf apxfVar4 = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.f;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                    ynm.k(aaxnVar.r(apxfVar4, sfvAudioItemPlaybackController.g), sfvAudioItemPlaybackController.h, new ynk() { // from class: hbk
                        @Override // defpackage.zfi
                        /* renamed from: b */
                        public final void a(Throwable th) {
                            SfvAudioItemPlaybackController sfvAudioItemPlaybackController2 = SfvAudioItemPlaybackController.this;
                            aomf aomfVar2 = aomfVar;
                            PlaybackStartDescriptor playbackStartDescriptor = a;
                            afsi.b(2, 24, "GetShortsSourceVideo returns error");
                            sfvAudioItemPlaybackController2.h(aomfVar2, null);
                            sfvAudioItemPlaybackController2.c.d(playbackStartDescriptor);
                        }
                    }, new ynl() { // from class: hbl
                        @Override // defpackage.ynl, defpackage.zfi
                        public final void a(Object obj) {
                            SfvAudioItemPlaybackController sfvAudioItemPlaybackController2 = SfvAudioItemPlaybackController.this;
                            PlaybackStartDescriptor playbackStartDescriptor = a;
                            aomf aomfVar2 = aomfVar;
                            autf autfVar = ((arsm) obj).d;
                            if (autfVar == null) {
                                autfVar = autf.a;
                            }
                            sfvAudioItemPlaybackController2.m = autfVar;
                            aifz e = playbackStartDescriptor.e();
                            aute auteVar = sfvAudioItemPlaybackController2.m.c;
                            if (auteVar == null) {
                                auteVar = aute.a;
                            }
                            e.k = auteVar.c;
                            PlaybackStartDescriptor a2 = e.a();
                            sfvAudioItemPlaybackController2.h(aomfVar2, sfvAudioItemPlaybackController2.m);
                            sfvAudioItemPlaybackController2.c.d(a2);
                        }
                    });
                    sfvAudioItemPlaybackController.l = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
                    sfvAudioItemPlaybackController.j = ammv.j(sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.c);
                    sfvAudioItemPlaybackController.k = ammv.j(sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.g);
                    sfvAudioItemPlaybackController.g(sfvAudioItemPlaybackController.j, sfvAudioItemPlaybackController.k, aurg.SFV_AUDIO_ITEM_PLAYBACK_STATE_BUFFERING).S(ggc.h, ggk.q);
                    return;
                }
            }
            sfvAudioItemPlaybackController.h(aomfVar, null);
            ainl ainlVar = sfvAudioItemPlaybackController.c;
            aifz d2 = PlaybackStartDescriptor.d();
            d2.a = apxfVar2;
            d2.d();
            ainlVar.d(d2.a());
            sfvAudioItemPlaybackController.l = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
            sfvAudioItemPlaybackController.j = ammv.j(sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.c);
            sfvAudioItemPlaybackController.k = ammv.j(sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.g);
            sfvAudioItemPlaybackController.g(sfvAudioItemPlaybackController.j, sfvAudioItemPlaybackController.k, aurg.SFV_AUDIO_ITEM_PLAYBACK_STATE_BUFFERING).S(ggc.h, ggk.q);
            return;
        }
        if (sfvAudioItemPlaybackController.b.d()) {
            sfvAudioItemPlaybackController.i();
            return;
        }
        autf autfVar = sfvAudioItemPlaybackController.m;
        if (autfVar != null && (1 & autfVar.b) != 0) {
            ainy ainyVar = sfvAudioItemPlaybackController.b;
            aute auteVar = autfVar.c;
            if (auteVar == null) {
                auteVar = aute.a;
            }
            ainyVar.U(auteVar.c);
        } else {
            SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand2 = sfvAudioItemPlaybackController.l;
            if (sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand2 == null || sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand2.e.isEmpty()) {
                sfvAudioItemPlaybackController.b.U(0L);
            } else {
                sfvAudioItemPlaybackController.b.U(((aurf) sfvAudioItemPlaybackController.l.e.get(0)).b);
            }
        }
        sfvAudioItemPlaybackController.b.b();
    }
}
