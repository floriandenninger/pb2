package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class liy implements View.OnClickListener {
    public final /* synthetic */ VoiceSearchActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ liy(VoiceSearchActivity voiceSearchActivity, int i) {
        this.b = i;
        this.a = voiceSearchActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            voiceSearchActivity.F.setVisibility(4);
            voiceSearchActivity.G.setVisibility(8);
            if (voiceSearchActivity.h) {
                voiceSearchActivity.p.I(3, new acqx(acsb.c(62943)), null);
                voiceSearchActivity.i(voiceSearchActivity.f);
                voiceSearchActivity.U = true;
                voiceSearchActivity.j();
                return;
            }
            voiceSearchActivity.m();
            return;
        }
        if (i != 1) {
            VoiceSearchActivity voiceSearchActivity2 = this.a;
            voiceSearchActivity2.j();
            voiceSearchActivity2.F.setVisibility(8);
            voiceSearchActivity2.E.setVisibility(8);
            liv aH = liv.aH(voiceSearchActivity2.W, voiceSearchActivity2.p);
            voiceSearchActivity2.p.I(3, new acqx(acsb.c(95983)), null);
            dn k = voiceSearchActivity2.j.k();
            k.r(aH, "VOICE_LANGUAGE_SELECTOR_FRAGMENT");
            k.a();
            return;
        }
        VoiceSearchActivity voiceSearchActivity3 = this.a;
        voiceSearchActivity3.onBackPressed();
        voiceSearchActivity3.h();
    }
}
