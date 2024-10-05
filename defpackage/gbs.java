package defpackage;

import android.util.Pair;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gbs implements ayrs {
    public final /* synthetic */ HatsController a;
    private final /* synthetic */ int b;

    public /* synthetic */ gbs(HatsController hatsController, int i) {
        this.b = i;
        this.a = hatsController;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        avbs avbsVar;
        if (this.b == 0) {
            HatsController hatsController = this.a;
            ahds ahdsVar = (ahds) obj;
            if (hatsController.b == null) {
                hatsController.e = ahdsVar;
                return;
            }
            xaf xafVar = xaf.AD_INTERRUPT_ACQUIRED;
            aigj aigjVar = aigj.PLAYBACK_PENDING;
            int ordinal = ahdsVar.b().ordinal();
            if (ordinal == 5) {
                gcu gcuVar = hatsController.b;
                gcuVar.getClass();
                if (HatsController.l(gcuVar.e)) {
                    gcu gcuVar2 = hatsController.b;
                    gcuVar2.getClass();
                    hatsController.i(gcuVar2.d(ahdsVar.d()));
                    return;
                }
                return;
            }
            if (ordinal != 7) {
                return;
            }
            gcu gcuVar3 = hatsController.b;
            gcuVar3.getClass();
            avci avciVar = gcuVar3.e.c;
            if (avciVar == null) {
                avciVar = avci.a;
            }
            for (avbr avbrVar : avciVar.l) {
                if (avbrVar.b == 1) {
                    avbt b = avbt.b(((avbq) avbrVar.c).b);
                    if (b == null) {
                        b = avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                    }
                    if (b == avbt.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PLAYBACK_FINISH) {
                        gcu gcuVar4 = hatsController.b;
                        gcuVar4.getClass();
                        hatsController.i(gcuVar4.d(ahdsVar.d()));
                        return;
                    }
                }
            }
            return;
        }
        HatsController hatsController2 = this.a;
        Pair pair = (Pair) obj;
        if (hatsController2.b == null) {
            return;
        }
        PlayerResponseModel c = ((ajbl) pair.first).c();
        boolean z = c != null && c.C();
        aheg ahegVar = (aheg) pair.second;
        aheg ahegVar2 = hatsController2.d;
        if (ahegVar2 != null) {
            String i = ahegVar2.i();
            if (i != null && i.equals(ahegVar.i())) {
                long g = ahegVar.g() - ahegVar2.g();
                if (g > 0 && g < 5000) {
                    hatsController2.f += g;
                }
            }
        } else {
            hatsController2.f = 0L;
        }
        hatsController2.d = ahegVar;
        gcu gcuVar5 = hatsController2.b;
        gcuVar5.getClass();
        avcn avcnVar = gcuVar5.e;
        float f = ((float) ahegVar.f()) / 1000.0f;
        avci avciVar2 = avcnVar.c;
        if (avciVar2 == null) {
            avciVar2 = avci.a;
        }
        float f2 = Float.MAX_VALUE;
        for (avbr avbrVar2 : avciVar2.l) {
            if (avbrVar2.b == 2) {
                int i2 = ((avbs) avbrVar2.c).b;
                if (i2 > 0) {
                    f2 = Math.min(i2, f2);
                }
                if (avbrVar2.b == 2) {
                    avbsVar = (avbs) avbrVar2.c;
                } else {
                    avbsVar = avbs.a;
                }
                float f3 = avbsVar.c;
                if (!z && f3 > 0.0f && f > 0.0f) {
                    f2 = Math.min(f3 * f, f2);
                }
            }
        }
        if (f2 >= Float.MAX_VALUE) {
            f2 = 0.0f;
        }
        if (f2 <= 0.0f || ((float) hatsController2.f) / 1000.0f <= f2) {
            return;
        }
        gcu gcuVar6 = hatsController2.b;
        gcuVar6.getClass();
        hatsController2.i(gcuVar6.d(ahegVar.i()));
    }
}
