package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class liz implements zfi {
    public final /* synthetic */ VoiceSearchActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ liz(VoiceSearchActivity voiceSearchActivity, int i) {
        this.b = i;
        this.a = voiceSearchActivity;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i;
        String displayName;
        auqc auqcVar;
        int i2 = this.b;
        if (i2 == 0) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            voiceSearchActivity.x.g(voiceSearchActivity.M.getRootView());
            akci a = akcj.a();
            a.b = voiceSearchActivity.getString(R.string.select_voice_language_promo);
            a.a = voiceSearchActivity.N;
            a.h(0.6f);
            voiceSearchActivity.x.c(a.a());
            ynm.n(voiceSearchActivity, voiceSearchActivity.ac.l(), jnh.f, jnh.h);
            return;
        }
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                this.a.o((String) obj);
                return;
            }
            if (i2 == 3) {
                this.a.o("");
                return;
            }
            VoiceSearchActivity voiceSearchActivity2 = this.a;
            String valueOf = String.valueOf(((Throwable) obj).getLocalizedMessage());
            if (valueOf.length() != 0) {
                "Error when creating the voice button: ".concat(valueOf);
            }
            voiceSearchActivity2.M.setVisibility(8);
            return;
        }
        VoiceSearchActivity voiceSearchActivity3 = this.a;
        liw liwVar = (liw) obj;
        voiceSearchActivity3.W = liwVar.b;
        auqe auqeVar = voiceSearchActivity3.W;
        String str = liwVar.a;
        Iterator it = auqeVar.e.iterator();
        loop0: while (true) {
            i = 0;
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
        voiceSearchActivity3.I.setText(displayName);
        voiceSearchActivity3.M.setVisibility(0);
        voiceSearchActivity3.M.setOnClickListener(new liy(voiceSearchActivity3, i3));
        voiceSearchActivity3.p.n(new acqx(acsb.c(95983)));
        ynm.n(voiceSearchActivity3, voiceSearchActivity3.ac.j(), jnh.i, new liz(voiceSearchActivity3, i));
    }
}
