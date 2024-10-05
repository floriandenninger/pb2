package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ljf implements Runnable {
    public final /* synthetic */ VoiceSearchActivityV2 a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljf(VoiceSearchActivityV2 voiceSearchActivityV2, int i) {
        this.b = i;
        this.a = voiceSearchActivityV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            VoiceSearchActivityV2 voiceSearchActivityV2 = this.a;
            if (voiceSearchActivityV2.isFinishing() || voiceSearchActivityV2.m == null) {
                return;
            }
            dn k = voiceSearchActivityV2.c.k();
            k.m(voiceSearchActivityV2.m);
            k.a();
            voiceSearchActivityV2.m.c = null;
            voiceSearchActivityV2.m = null;
            voiceSearchActivityV2.i();
            voiceSearchActivityV2.l.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.a.recreate();
            return;
        }
        VoiceSearchActivityV2 voiceSearchActivityV22 = this.a;
        if (voiceSearchActivityV22.isFinishing() || voiceSearchActivityV22.d == null) {
            return;
        }
        dn k2 = voiceSearchActivityV22.c.k();
        k2.m(voiceSearchActivityV22.d);
        k2.a();
        voiceSearchActivityV22.d.aG(null);
        voiceSearchActivityV22.d = null;
    }
}
