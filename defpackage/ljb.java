package defpackage;

import android.content.Intent;
import android.media.AudioTrack;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ljb implements akfm {
    final /* synthetic */ VoiceSearchActivity a;

    public ljb(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    @Override // defpackage.akfm
    public final void a(amkk amkkVar) {
        if (this.a.ab.g().booleanValue()) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            final akfb akfbVar = voiceSearchActivity.z;
            final aomf aomfVar = amkkVar.b;
            if (akfbVar.b == null) {
                try {
                    akfbVar.b = new AudioTrack(3, 16000, 4, 2, 2048, 1);
                } catch (IllegalArgumentException unused) {
                    akfbVar.b = null;
                }
                if (akfbVar.b()) {
                    akfbVar.b.play();
                }
            }
            ynm.o(voiceSearchActivity, anaf.T(new anfy() { // from class: akfa
                @Override // defpackage.anfy
                public final anhy a() {
                    akfb akfbVar2 = akfb.this;
                    aomf aomfVar2 = aomfVar;
                    if (akfbVar2.b()) {
                        yjk.e();
                        int d = aomfVar2.d();
                        int i = 0;
                        while (i < d) {
                            int write = akfbVar2.b.write(aomfVar2.I(), i, d);
                            if (write <= 0) {
                                break;
                            }
                            i += write;
                        }
                    }
                    return anhv.a;
                }
            }, akfbVar.a), jnh.k, jnh.m);
        }
    }

    @Override // defpackage.akfm
    public final void b() {
        if (this.a.ab.g().booleanValue()) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            ynm.o(voiceSearchActivity, voiceSearchActivity.z.a(), jnh.l, jnh.n);
        }
        VoiceSearchActivity voiceSearchActivity2 = this.a;
        if (voiceSearchActivity2.h || voiceSearchActivity2.L) {
            return;
        }
        if (voiceSearchActivity2.c.b != 1) {
            voiceSearchActivity2.i(voiceSearchActivity2.g);
        }
        this.a.l();
    }

    @Override // defpackage.akfm
    public final void c(Throwable th) {
        VoiceSearchActivity voiceSearchActivity = this.a;
        if (voiceSearchActivity.c.b != 1) {
            voiceSearchActivity.i(voiceSearchActivity.g);
        }
        if (th.getMessage() != null) {
            String format = String.format("%s (YtConnectionType = %d)", th.getMessage(), Integer.valueOf(this.a.t.a()));
            afsi.c(2, 32, format, th);
            String valueOf = String.valueOf(format);
            zga.d(valueOf.length() != 0 ? "VoiceSearchActivity error: ".concat(valueOf) : new String("VoiceSearchActivity error: "), th);
        }
        VoiceSearchActivity voiceSearchActivity2 = this.a;
        if (voiceSearchActivity2.h) {
            voiceSearchActivity2.j();
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
                    VoiceSearchActivity voiceSearchActivity = this.a;
                    byte[] I = aomfVar.I();
                    Intent intent = voiceSearchActivity.getIntent();
                    intent.putExtra("RecognizedText", I);
                    intent.putExtra("AssistantCsn", voiceSearchActivity.p.k());
                    intent.putExtra("SearchboxStats", voiceSearchActivity.Q);
                    voiceSearchActivity.setResult(-1, intent);
                    voiceSearchActivity.i(voiceSearchActivity.e);
                    voiceSearchActivity.h();
                    return;
                }
                if (arjbVar.f.size() > 0) {
                    VoiceSearchActivity voiceSearchActivity2 = this.a;
                    voiceSearchActivity2.O = arjbVar.f;
                    voiceSearchActivity2.g();
                    this.a.H.setVisibility(0);
                    if (evr.I(this.a.o) && this.a.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                        this.a.n.u("voz_vt", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                        return;
                    }
                    return;
                }
                VoiceSearchActivity voiceSearchActivity3 = this.a;
                if (voiceSearchActivity3.c.b != 1) {
                    voiceSearchActivity3.i(voiceSearchActivity3.g);
                }
                this.a.j();
            }
        } catch (aoob unused) {
        }
    }
}
