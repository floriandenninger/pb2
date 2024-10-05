package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ainj implements ainl {
    private final ainy a;
    private final aioo b;

    public ainj(ainy ainyVar, aioo aiooVar) {
        this.a = ainyVar;
        this.b = aiooVar;
    }

    @Override // defpackage.ainl, defpackage.ahbd, defpackage.aivk
    public final void a(aims aimsVar) {
        aiwk aiwkVar;
        aion b = this.b.b(aimsVar);
        if (b != null) {
            PlaybackStartDescriptor playbackStartDescriptor = b.a;
            if (!playbackStartDescriptor.a.k || (aiwkVar = this.a.p.a) == null || !aiwkVar.ai(aign.ENDED) || !TextUtils.equals(playbackStartDescriptor.l(), aiwkVar.v())) {
                this.a.m.a(b.a, b.b, b.c);
            } else {
                this.a.B();
            }
        }
    }

    @Override // defpackage.ainl, defpackage.ahbd
    public final boolean b() {
        return this.a.l.d != null;
    }

    @Override // defpackage.ahbd
    public final int c(aims aimsVar) {
        return this.b.g(aimsVar);
    }

    @Override // defpackage.ainl, defpackage.ajar
    public final void d(PlaybackStartDescriptor playbackStartDescriptor) {
        e(playbackStartDescriptor, aigd.a);
    }

    @Override // defpackage.ainl
    public final void e(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        acsx acsxVar;
        aioo aiooVar = this.b;
        final ainy ainyVar = this.a;
        ainyVar.getClass();
        if (aiooVar.d(ainyVar, new amml() { // from class: aini
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                PlaybackStartDescriptor playbackStartDescriptor2 = (PlaybackStartDescriptor) obj;
                aiwk aiwkVar = ainy.this.p.a;
                boolean z = false;
                if (aiwkVar != null && aiwkVar.aj(aign.PLAYBACK_LOADED) && !aiwkVar.ai(aign.ENDED) && TextUtils.equals(playbackStartDescriptor2.l(), aiwkVar.v())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, playbackStartDescriptor, aigdVar)) {
            return;
        }
        if (this.b.f()) {
            this.b.c();
            ainx ainxVar = this.a.m;
            yjk.f();
            aiwk aiwkVar = ainxVar.a.p.a;
            if (aiwkVar != null) {
                aiwkVar.K();
            }
            ainxVar.a.o.b();
            ainxVar.a.n.d();
            ainxVar.a.o.e();
            ainxVar.a.n.k();
            ainxVar.a.p.a();
            ainxVar.a.J();
        }
        this.b.h(playbackStartDescriptor);
        aimk a = this.b.a();
        if (a != null) {
            a.b();
            a.e();
            ainx ainxVar2 = this.a.m;
            yjk.f();
            playbackStartDescriptor.getClass();
            ainxVar2.a.b.d(new ahdc());
            if (aigdVar != null && (acsxVar = aigdVar.b) != null) {
                acsxVar.c("pl_i");
            }
            ahbh ahbhVar = ainxVar2.a.e;
            if (ahbhVar.c.j) {
                ahbhVar.m = 3;
            }
            ahbhVar.e();
            if (!ahbhVar.h()) {
                ((aiki) ahbhVar.j.get()).b(false);
            }
            ainy ainyVar2 = ainxVar2.a;
            ainyVar2.j.a(ainyVar2.f);
            ainxVar2.a.w(aigdVar);
            ainxVar2.a.y();
            aiih aiihVar = ainxVar2.a.n;
            aiihVar.o = playbackStartDescriptor;
            aiihVar.r = playbackStartDescriptor.a.q;
            aiihVar.m = ((aihl) aiihVar.a.get()).a(playbackStartDescriptor);
            ainxVar2.a.n.e();
            if (playbackStartDescriptor.u()) {
                ainxVar2.a.b.f(aiew.NAVIGATION);
            }
            ainxVar2.a.s.b().e = playbackStartDescriptor.s();
            ainxVar2.a.s.b().f = playbackStartDescriptor.r();
            ainxVar2.a.r.e(playbackStartDescriptor, aigdVar);
            ainxVar2.a.d.a();
            return;
        }
        afsi.b(2, 10, "Initializing a PlaybackSequencer in loaderNavigator, but it does not exist");
    }

    @Override // defpackage.ainl
    public final void f(PlaybackServiceState playbackServiceState) {
        g(playbackServiceState, aigd.a);
    }

    @Override // defpackage.ainl
    public final void g(PlaybackServiceState playbackServiceState, aigd aigdVar) {
        acsx acsxVar;
        ainx ainxVar = this.a.m;
        yjk.f();
        ainxVar.a.b.d(new ahdd());
        if (aigdVar != null && (acsxVar = aigdVar.b) != null) {
            acsxVar.c("pl_r");
        }
        ainxVar.a.D();
        PlaybackAudioManager$RestorableState playbackAudioManager$RestorableState = playbackServiceState.e;
        if (playbackAudioManager$RestorableState != null) {
            ainxVar.a.h.i = playbackAudioManager$RestorableState;
        }
        PlaybackModalityState playbackModalityState = playbackServiceState.b;
        if (playbackModalityState != null) {
            aifs aifsVar = ainxVar.a.f;
            aifsVar.g = playbackModalityState.a;
            aifsVar.h = playbackModalityState.b;
            aifsVar.k = playbackModalityState.c;
            aifsVar.l = playbackModalityState.d;
            aifsVar.i = playbackModalityState.i;
            aifsVar.n = playbackModalityState.f;
            aifsVar.o = playbackModalityState.g;
            aifsVar.q = playbackModalityState.h;
            aifsVar.s = playbackModalityState.j;
            aifsVar.t = playbackModalityState.k;
        }
        this.b.c();
        this.b.i(playbackServiceState);
        aimk a = this.b.a();
        if (a != null && playbackServiceState.d != null) {
            a.b();
            OmegaSequencerState omegaSequencerState = (OmegaSequencerState) playbackServiceState.d;
            DirectorSavedState directorSavedState = playbackServiceState.c;
            if (omegaSequencerState != null && ((directorSavedState == null && omegaSequencerState.e != null) || (directorSavedState != null && omegaSequencerState.a != null))) {
                a.e();
            }
            ainx ainxVar2 = this.a.m;
            OmegaSequencerState omegaSequencerState2 = (OmegaSequencerState) playbackServiceState.d;
            DirectorSavedState directorSavedState2 = playbackServiceState.c;
            aiih aiihVar = ainxVar2.a.n;
            omegaSequencerState2.getClass();
            aiihVar.p = omegaSequencerState2.a;
            aiihVar.q = omegaSequencerState2.b;
            aiihVar.n = omegaSequencerState2.d;
            aiihVar.o = omegaSequencerState2.e;
            aiihVar.r = omegaSequencerState2.f;
            aiihVar.m = ((aihl) aiihVar.a.get()).a(omegaSequencerState2.e);
            ainxVar2.a.n.e();
            yjk.f();
            ainy ainyVar = ainxVar2.a;
            ainyVar.j.a(ainyVar.f);
            ainxVar2.a.w(aigdVar);
            ainxVar2.a.y();
            if (directorSavedState2 == null) {
                ainy ainyVar2 = ainxVar2.a;
                ainyVar2.r.e(ainyVar2.n.o, aigdVar);
            } else {
                PlayerResponseModel a2 = ainxVar2.a.n.a();
                if (a2 == null) {
                    return;
                }
                ainxVar2.a.p.b(directorSavedState2, aigdVar);
                if (ainxVar2.a.n.l.b(aigk.VIDEO_WATCH_LOADED)) {
                    ainxVar2.a.q.c();
                    ainxVar2.a.n.g(a2, null, aigdVar.b);
                } else {
                    ainxVar2.a.r.e(directorSavedState2.d, aigdVar);
                }
            }
            ainxVar2.a.d.a();
            ainxVar2.a.A();
            return;
        }
        ainx ainxVar3 = this.a.m;
        ainxVar3.a.b.d(new ahda());
        ainxVar3.a.A();
    }

    @Override // defpackage.ainl
    public final void h(int i) {
        aimk a = this.b.a();
        if (a != null) {
            aimt aimtVar = ((aimg) a).b;
            if (aimtVar instanceof aimq) {
                ((aimq) aimtVar).C(i);
            }
        }
    }

    @Override // defpackage.ainl
    public final void i(boolean z) {
        aimk a = this.b.a();
        if (a == null) {
            return;
        }
        aimt aimtVar = ((aimg) a).b;
        if (aimtVar instanceof aimu) {
            ((aimu) aimtVar).rR(z);
        }
    }

    @Override // defpackage.ainl, defpackage.aivk
    public final boolean j(aims aimsVar) {
        return this.b.e(aimsVar);
    }

    @Override // defpackage.ainl
    public final void k(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, PlayerResponseModel playerResponseModel) {
        if (this.b.f()) {
            aife aifeVar = this.a.l;
            String h = playbackStartDescriptor.h(aifeVar.a);
            aipn aipnVar = aifeVar.b;
            playbackStartDescriptor.getClass();
            synchronized (aipnVar.a) {
                aiwk aiwkVar = aipnVar.a.a;
                if (aiwkVar == null) {
                    return;
                }
                if (ahbx.l(playerResponseModel.q())) {
                    aiwkVar.I(playerResponseModel, playbackStartDescriptor, aigdVar);
                    aifeVar.d = h;
                }
            }
        }
    }
}
