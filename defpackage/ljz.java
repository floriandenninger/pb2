package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ljz implements akfm {
    final /* synthetic */ VoiceSearchHalfPlateV0Activity a;

    public ljz(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity) {
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // defpackage.akfm
    public final /* synthetic */ void a(amkk amkkVar) {
    }

    @Override // defpackage.akfm
    public final void b() {
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
        if (voiceSearchHalfPlateV0Activity.h || voiceSearchHalfPlateV0Activity.I) {
            return;
        }
        if (voiceSearchHalfPlateV0Activity.c.b != 1) {
            voiceSearchHalfPlateV0Activity.i(voiceSearchHalfPlateV0Activity.g);
        }
        this.a.l();
    }

    @Override // defpackage.akfm
    public final void c(Throwable th) {
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
        if (voiceSearchHalfPlateV0Activity.c.b != 1) {
            voiceSearchHalfPlateV0Activity.i(voiceSearchHalfPlateV0Activity.g);
        }
        if (th.getMessage() != null) {
            String format = String.format(Locale.US, "%s (YtConnectionType = %d)", th.getMessage(), Integer.valueOf(this.a.t.a()));
            afsi.c(2, 32, format, th);
            String valueOf = String.valueOf(format);
            zga.d(valueOf.length() != 0 ? "VoiceSearchHalfPlateV0Activity error: ".concat(valueOf) : new String("VoiceSearchHalfPlateV0Activity error: "), th);
        }
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
        if (voiceSearchHalfPlateV0Activity2.h) {
            voiceSearchHalfPlateV0Activity2.j();
        }
    }

    @Override // defpackage.akfm
    public final void d(aomf aomfVar) {
        aomf aomfVar2;
        try {
            awzg awzgVar = (awzg) aonm.parseFrom(awzg.a, aomfVar);
            aarr aarrVar = this.a.s;
            if (awzgVar.b == 1) {
                aomfVar2 = (aomf) awzgVar.c;
            } else {
                aomfVar2 = aomf.b;
            }
            arjb arjbVar = (arjb) aarrVar.a(aomfVar2.I(), arjb.a);
            if (arjbVar != null) {
                if ((arjbVar.b & 4) != 0 && arjbVar.f.size() <= 0) {
                    this.a.p.n(new acqx(arjbVar.c.I()));
                }
                if ((arjbVar.b & 128) != 0) {
                    if (evr.I(this.a.o) && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                        this.a.n.u("voz_rqf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                    }
                    VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
                    byte[] I = aomfVar.I();
                    Intent intent = voiceSearchHalfPlateV0Activity.getIntent();
                    intent.putExtra("RecognizedText", I);
                    intent.putExtra("AssistantCsn", voiceSearchHalfPlateV0Activity.p.k());
                    intent.putExtra("SearchboxStats", voiceSearchHalfPlateV0Activity.N);
                    voiceSearchHalfPlateV0Activity.setResult(-1, intent);
                    voiceSearchHalfPlateV0Activity.i(voiceSearchHalfPlateV0Activity.e);
                    voiceSearchHalfPlateV0Activity.h();
                    return;
                }
                if (arjbVar.f.size() > 0) {
                    VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
                    voiceSearchHalfPlateV0Activity2.L = arjbVar.f;
                    voiceSearchHalfPlateV0Activity2.g();
                    this.a.E.setVisibility(0);
                    if (evr.I(this.a.o) && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                        this.a.n.u("voz_vt", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                        return;
                    }
                    return;
                }
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity3 = this.a;
                if (voiceSearchHalfPlateV0Activity3.c.b != 1) {
                    voiceSearchHalfPlateV0Activity3.i(voiceSearchHalfPlateV0Activity3.g);
                }
                this.a.j();
            }
        } catch (aoob unused) {
        }
    }
}
