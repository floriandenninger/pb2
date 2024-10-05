package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lka implements akfn {
    final /* synthetic */ VoiceSearchHalfPlateV0Activity a;

    public lka(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity) {
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // defpackage.akfn
    public final void a(int i) {
        if (i > 0) {
            if (evr.I(this.a.o) && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
                if (!voiceSearchHalfPlateV0Activity.G) {
                    voiceSearchHalfPlateV0Activity.G = true;
                    voiceSearchHalfPlateV0Activity.n.u("voz_ss", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                }
            }
            this.a.c.b(i);
        }
    }

    @Override // defpackage.akfn
    public final void b() {
        if (evr.I(this.a.o) && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            voiceSearchHalfPlateV0Activity.H = true;
            voiceSearchHalfPlateV0Activity.n.u("voz_mf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
        voiceSearchHalfPlateV0Activity2.h = false;
        akfo akfoVar = voiceSearchHalfPlateV0Activity2.i;
        if (akfoVar != null) {
            akfoVar.d();
        }
        voiceSearchHalfPlateV0Activity2.c.setEnabled(false);
        voiceSearchHalfPlateV0Activity2.c.e();
    }

    @Override // defpackage.akfn
    public final void c() {
        this.a.d.setVisibility(0);
        this.a.C.setVisibility(0);
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
                this.a.I = true;
            }
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            if (voiceSearchHalfPlateV0Activity.c.b != 1) {
                voiceSearchHalfPlateV0Activity.E.setVisibility(8);
                this.a.D.setVisibility(8);
            }
            if (amktVar.c >= 0.8d) {
                this.a.C.setText("");
                this.a.d.setText(amktVar.b);
                if (evr.I(this.a.o) && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
                    if (!voiceSearchHalfPlateV0Activity2.H) {
                        voiceSearchHalfPlateV0Activity2.n.u("voz_sf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                    }
                }
            } else {
                this.a.C.setText(amktVar.b);
            }
        }
    }
}
