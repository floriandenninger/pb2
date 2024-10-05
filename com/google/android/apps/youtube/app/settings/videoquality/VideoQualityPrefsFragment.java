package com.google.android.apps.youtube.app.settings.videoquality;

import com.google.android.youtube.R;
import defpackage.aaea;
import defpackage.acsb;
import defpackage.amml;
import defpackage.atcl;
import defpackage.atcm;
import defpackage.bsu;
import defpackage.evr;
import defpackage.loc;
import defpackage.lqy;
import defpackage.lra;
import defpackage.lrd;
import defpackage.ynm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoQualityPrefsFragment extends lqy {
    public lrd c;
    public aaea d;

    @Override // defpackage.ce
    public final void V() {
        final lrd lrdVar = this.c;
        if (lrdVar.i) {
            ynm.m(lrdVar.c.b(new amml() { // from class: lrb
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    lrd lrdVar2 = lrd.this;
                    aone builder = ((awvr) obj).toBuilder();
                    long c = lrdVar2.d.c();
                    builder.copyOnWrite();
                    awvr awvrVar = (awvr) builder.instance;
                    awvrVar.b |= 64;
                    awvrVar.o = c;
                    return (awvr) builder.build();
                }
            }), lra.a);
        }
        if (lrdVar.h) {
            lrdVar.g.t();
        }
        lrdVar.e.qc();
        super.V();
    }

    @Override // defpackage.bsk
    public final void aH() {
        p(true != evr.ad(this.d) ? R.xml.videoquality_prefs : R.xml.videoquality_nonbeta_prefs);
        C().setTitle(R.string.persistent_settings_video_quality_title);
        lrd lrdVar = this.c;
        bsu bsuVar = this.a;
        atcl atclVar = lrdVar.f.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        boolean z = atcmVar.f;
        lrdVar.h = z;
        if (z) {
            lrdVar.g.d(acsb.b(93926), null, null);
        }
        lrdVar.b(bsuVar, lrd.a, loc.e);
        lrdVar.b(bsuVar, lrd.b, loc.f);
    }
}
