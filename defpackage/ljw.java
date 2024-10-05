package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ljw implements Runnable {
    public final /* synthetic */ VoiceSearchHalfPlateV0Activity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljw(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity, int i) {
        this.b = i;
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            if (voiceSearchHalfPlateV0Activity.isFinishing() || voiceSearchHalfPlateV0Activity.m == null) {
                return;
            }
            dn k = voiceSearchHalfPlateV0Activity.j.k();
            k.m(voiceSearchHalfPlateV0Activity.m);
            k.a();
            voiceSearchHalfPlateV0Activity.m.c = null;
            voiceSearchHalfPlateV0Activity.m = null;
            voiceSearchHalfPlateV0Activity.n();
            voiceSearchHalfPlateV0Activity.M.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.a.recreate();
            return;
        }
        if (i == 2) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
            if (voiceSearchHalfPlateV0Activity2.h) {
                voiceSearchHalfPlateV0Activity2.i(voiceSearchHalfPlateV0Activity2.g);
            }
            voiceSearchHalfPlateV0Activity2.k();
            return;
        }
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity3 = this.a;
        if (voiceSearchHalfPlateV0Activity3.isFinishing() || voiceSearchHalfPlateV0Activity3.k == null) {
            return;
        }
        dn k2 = voiceSearchHalfPlateV0Activity3.j.k();
        k2.m(voiceSearchHalfPlateV0Activity3.k);
        k2.a();
        voiceSearchHalfPlateV0Activity3.k.aG(null);
        voiceSearchHalfPlateV0Activity3.k = null;
    }
}
