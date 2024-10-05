package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ljx implements View.OnClickListener {
    public final /* synthetic */ VoiceSearchHalfPlateV0Activity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljx(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity, int i) {
        this.b = i;
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            if (voiceSearchHalfPlateV0Activity.h) {
                voiceSearchHalfPlateV0Activity.p.I(3, new acqx(acsb.c(62943)), null);
                voiceSearchHalfPlateV0Activity.i(voiceSearchHalfPlateV0Activity.f);
                voiceSearchHalfPlateV0Activity.R = true;
                voiceSearchHalfPlateV0Activity.j();
                return;
            }
            voiceSearchHalfPlateV0Activity.m();
            return;
        }
        if (i == 1) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
            voiceSearchHalfPlateV0Activity2.p.I(3, new acqx(acsb.c(88272)), null);
            Intent intent = voiceSearchHalfPlateV0Activity2.getIntent();
            intent.putExtra("AssistantCsn", voiceSearchHalfPlateV0Activity2.p.k());
            intent.putExtra("DO_NOT_OPEN_KEYBOARD", true);
            voiceSearchHalfPlateV0Activity2.setResult(1, intent);
            voiceSearchHalfPlateV0Activity2.h();
            return;
        }
        if (i == 2) {
            this.a.onBackPressed();
            return;
        }
        if (i == 3) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity3 = this.a;
            if (voiceSearchHalfPlateV0Activity3.O != null) {
                voiceSearchHalfPlateV0Activity3.p.I(3, new acqx(acsb.c(116555)), null);
                Intent intent2 = voiceSearchHalfPlateV0Activity3.getIntent();
                intent2.putExtra("ABOVE_HALF_PLATE_CLICK_LOCATION", voiceSearchHalfPlateV0Activity3.O);
                voiceSearchHalfPlateV0Activity3.setResult(-1, intent2);
                voiceSearchHalfPlateV0Activity3.h();
                return;
            }
            return;
        }
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity4 = this.a;
        voiceSearchHalfPlateV0Activity4.j();
        voiceSearchHalfPlateV0Activity4.D.setVisibility(8);
        liv aH = liv.aH(voiceSearchHalfPlateV0Activity4.T, voiceSearchHalfPlateV0Activity4.p);
        voiceSearchHalfPlateV0Activity4.p.I(3, new acqx(acsb.c(95983)), null);
        dn k = voiceSearchHalfPlateV0Activity4.j.k();
        k.r(aH, "VOICE_LANGUAGE_SELECTOR_FRAGMENT");
        k.a();
    }
}
