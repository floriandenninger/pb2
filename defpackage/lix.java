package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lix implements Runnable {
    public final /* synthetic */ VoiceSearchActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ lix(VoiceSearchActivity voiceSearchActivity, int i) {
        this.b = i;
        this.a = voiceSearchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            if (voiceSearchActivity.isFinishing() || voiceSearchActivity.S == null) {
                return;
            }
            dn k = voiceSearchActivity.j.k();
            k.m(voiceSearchActivity.S);
            k.a();
            voiceSearchActivity.S.c = null;
            voiceSearchActivity.S = null;
            voiceSearchActivity.n();
            voiceSearchActivity.P.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.a.recreate();
            return;
        }
        if (i == 2) {
            VoiceSearchActivity voiceSearchActivity2 = this.a;
            if (voiceSearchActivity2.h) {
                voiceSearchActivity2.i(voiceSearchActivity2.g);
            }
            voiceSearchActivity2.k();
            return;
        }
        VoiceSearchActivity voiceSearchActivity3 = this.a;
        if (voiceSearchActivity3.isFinishing() || voiceSearchActivity3.k == null) {
            return;
        }
        dn k2 = voiceSearchActivity3.j.k();
        k2.m(voiceSearchActivity3.k);
        k2.a();
        voiceSearchActivity3.k.aG(null);
        voiceSearchActivity3.k = null;
    }
}
