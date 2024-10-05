package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ljc implements akfn {
    final /* synthetic */ VoiceSearchActivity a;

    public ljc(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    @Override // defpackage.akfn
    public final void a(int i) {
        if (i > 0) {
            if (evr.I(this.a.o) && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                VoiceSearchActivity voiceSearchActivity = this.a;
                if (!voiceSearchActivity.f160J) {
                    voiceSearchActivity.f160J = true;
                    voiceSearchActivity.n.u("voz_ss", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                }
            }
            this.a.c.b(i);
        }
    }

    @Override // defpackage.akfn
    public final void b() {
        if (evr.I(this.a.o) && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            voiceSearchActivity.K = true;
            voiceSearchActivity.n.u("voz_mf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        VoiceSearchActivity voiceSearchActivity2 = this.a;
        voiceSearchActivity2.h = false;
        akfo akfoVar = voiceSearchActivity2.i;
        if (akfoVar != null) {
            akfoVar.d();
        }
        voiceSearchActivity2.c.setEnabled(false);
        voiceSearchActivity2.c.e();
        if (voiceSearchActivity2.p()) {
            voiceSearchActivity2.R.animate().alpha(0.0f).setDuration(200L).setInterpolator(voiceSearchActivity2.X);
        }
    }

    @Override // defpackage.akfn
    public final void c() {
        this.a.d.setVisibility(0);
        this.a.D.setVisibility(0);
        this.a.c.c();
    }

    @Override // defpackage.akfn
    public final void d(List list) {
        if (!this.a.l && !list.isEmpty() && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.a.n.u("voz_ftr", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
            this.a.l = true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amkt amktVar = (amkt) it.next();
            if (amktVar.c == 1.0d) {
                this.a.L = true;
            }
            VoiceSearchActivity voiceSearchActivity = this.a;
            if (voiceSearchActivity.c.b != 1) {
                voiceSearchActivity.H.setVisibility(8);
                this.a.E.setVisibility(8);
            }
            if (amktVar.c >= 0.8d) {
                this.a.D.setText("");
                this.a.d.setText(amktVar.b);
                if (evr.I(this.a.o) && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    VoiceSearchActivity voiceSearchActivity2 = this.a;
                    if (!voiceSearchActivity2.K) {
                        voiceSearchActivity2.n.u("voz_sf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                    }
                }
            } else {
                this.a.D.setText(amktVar.b);
            }
        }
    }
}
