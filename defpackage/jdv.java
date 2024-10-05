package defpackage;

import android.view.View;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jdv implements View.OnClickListener {
    public final /* synthetic */ jea a;
    private final /* synthetic */ int b;

    public /* synthetic */ jdv(jea jeaVar, int i) {
        this.b = i;
        this.a = jeaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            jea jeaVar = this.a;
            jeaVar.aa.I(3, new acqx(acrb.MEDIA_ROUTE_DISCONNECT_BUTTON), null);
            if (jeaVar.Y.m()) {
                jeaVar.Z.K();
            }
            jeaVar.dismiss();
            return;
        }
        if (i == 1) {
            jea jeaVar2 = this.a;
            jeaVar2.aa.I(3, new acqx(acrb.CAST_DIALOG_CLOSE_BUTTON), null);
            jeaVar2.dismiss();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                jea jeaVar3 = this.a;
                jeaVar3.aa.I(3, new acqx(acrb.VOICE_SEARCH_IN_CAST_DIALOG), null);
                jeaVar3.B(2);
                return;
            } else {
                jea jeaVar4 = this.a;
                jeaVar4.aa.I(3, new acqx(acrb.SMART_REMOTE_DPAD_IN_CAST_DIALOG), null);
                jeaVar4.B(4);
                return;
            }
        }
        jea jeaVar5 = this.a;
        jeaVar5.aa.I(3, new acqx(acsb.c(132424)), null);
        jeaVar5.ab.j(new jdz(jeaVar5), Duration.ofSeconds(10L));
        jeaVar5.ad.setVisibility(4);
        jeaVar5.af.setVisibility(0);
        jeaVar5.af.performAccessibilityAction(64, null);
        final adsw adswVar = jeaVar5.ab;
        adswVar.getClass();
        jeaVar5.ag = new Runnable() { // from class: jdx
            @Override // java.lang.Runnable
            public final void run() {
                adsw.this.h();
            }
        };
    }
}
