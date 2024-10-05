package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ljv implements zfi {
    public final /* synthetic */ VoiceSearchHalfPlateV0Activity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljv(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity, int i) {
        this.b = i;
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        String displayName;
        auqc auqcVar;
        int i = this.b;
        if (i == 0) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            String valueOf = String.valueOf(((Throwable) obj).getLocalizedMessage());
            if (valueOf.length() != 0) {
                "Error when creating the voice button: ".concat(valueOf);
            }
            voiceSearchHalfPlateV0Activity.f162J.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.a.o("");
            return;
        }
        int i2 = 3;
        if (i != 2) {
            if (i == 3) {
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                voiceSearchHalfPlateV0Activity2.x.g(voiceSearchHalfPlateV0Activity2.f162J.getRootView());
                akci a = akcj.a();
                a.b = voiceSearchHalfPlateV0Activity2.getString(R.string.select_voice_language_promo);
                a.a = voiceSearchHalfPlateV0Activity2.K;
                a.h(0.6f);
                voiceSearchHalfPlateV0Activity2.x.c(a.a());
                ynm.n(voiceSearchHalfPlateV0Activity2, voiceSearchHalfPlateV0Activity2.Y.l(), jnh.r, jnh.s);
                return;
            }
            this.a.o((String) obj);
            return;
        }
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity3 = this.a;
        liw liwVar = (liw) obj;
        voiceSearchHalfPlateV0Activity3.T = liwVar.b;
        auqe auqeVar = voiceSearchHalfPlateV0Activity3.T;
        String str = liwVar.a;
        Iterator it = auqeVar.e.iterator();
        loop0: while (true) {
            if (it.hasNext()) {
                for (auqd auqdVar : ((auqk) it.next()).c) {
                    if (auqdVar.b == 64166933) {
                        auqcVar = (auqc) auqdVar.c;
                    } else {
                        auqcVar = auqc.a;
                    }
                    if (amkq.e(auqcVar.e, str)) {
                        displayName = auqcVar.c;
                        break loop0;
                    }
                }
            } else {
                List h = amnm.b('-').h(str);
                displayName = new Locale((String) h.get(0), amkq.d((String) h.get(1))).getDisplayName();
                break;
            }
        }
        voiceSearchHalfPlateV0Activity3.F.setText(displayName);
        voiceSearchHalfPlateV0Activity3.f162J.setVisibility(0);
        voiceSearchHalfPlateV0Activity3.f162J.setOnClickListener(new ljx(voiceSearchHalfPlateV0Activity3, 4));
        voiceSearchHalfPlateV0Activity3.p.n(new acqx(acsb.c(95983)));
        ynm.n(voiceSearchHalfPlateV0Activity3, voiceSearchHalfPlateV0Activity3.Y.j(), jnh.q, new ljv(voiceSearchHalfPlateV0Activity3, i2));
    }
}
