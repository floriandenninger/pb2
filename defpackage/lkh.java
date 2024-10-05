package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lkh implements zed {
    public final /* synthetic */ GeneralPrefsFragment a;
    private final /* synthetic */ int b;

    public /* synthetic */ lkh(GeneralPrefsFragment generalPrefsFragment, int i) {
        this.b = i;
        this.a = generalPrefsFragment;
    }

    @Override // defpackage.zed
    public final void a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.af.b();
                return;
            }
            if (i == 2) {
                GeneralPrefsFragment generalPrefsFragment = this.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                acra mM = generalPrefsFragment.ai.mM();
                mM.D(new acqx(acsb.c(85011)));
                mM.D(new acqx(acsb.c(85010)));
                if (booleanValue) {
                    mM.I(3, new acqx(acsb.c(85010)), null);
                    return;
                } else {
                    mM.I(3, new acqx(acsb.c(85011)), null);
                    return;
                }
            }
            GeneralPrefsFragment generalPrefsFragment2 = this.a;
            Handler handler = generalPrefsFragment2.aq;
            final ci C = generalPrefsFragment2.C();
            C.getClass();
            handler.postAtFrontOfQueue(new Runnable() { // from class: lkk
                @Override // java.lang.Runnable
                public final void run() {
                    ci.this.recreate();
                }
            });
            return;
        }
        GeneralPrefsFragment generalPrefsFragment3 = this.a;
        if (!((Boolean) obj).booleanValue() && evr.bC(generalPrefsFragment3.al) && (((gnh) generalPrefsFragment3.al.c()).b & 16) != 0) {
            acqz acqzVar = generalPrefsFragment3.ai;
            gng gngVar = gng.LIGHT;
            aone createBuilder = ashj.a.createBuilder();
            createBuilder.copyOnWrite();
            ashj ashjVar = (ashj) createBuilder.instance;
            ashjVar.b |= 1;
            ashjVar.c = false;
            boolean z = gngVar == gng.DARK;
            createBuilder.copyOnWrite();
            ashj ashjVar2 = (ashj) createBuilder.instance;
            ashjVar2.b = 2 | ashjVar2.b;
            ashjVar2.d = z;
            ashj ashjVar3 = (ashj) createBuilder.build();
            aone createBuilder2 = asht.a.createBuilder();
            createBuilder2.copyOnWrite();
            asht ashtVar = (asht) createBuilder2.instance;
            ashjVar3.getClass();
            ashtVar.r = ashjVar3;
            ashtVar.c |= 4;
            acqzVar.mM().w(new acqx(acrb.BATTERY_SAVER_AUTO_SWITCH_THEME_ACTION), (asht) createBuilder2.build());
        }
        Handler handler2 = generalPrefsFragment3.aq;
        final ci C2 = generalPrefsFragment3.C();
        C2.getClass();
        handler2.postAtFrontOfQueue(new Runnable() { // from class: lkk
            @Override // java.lang.Runnable
            public final void run() {
                ci.this.recreate();
            }
        });
    }
}
