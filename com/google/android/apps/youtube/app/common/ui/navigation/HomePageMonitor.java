package com.google.android.apps.youtube.app.common.ui.navigation;

import com.google.android.apps.youtube.app.common.ui.navigation.HomePageMonitor;
import defpackage.abey;
import defpackage.any;
import defpackage.aok;
import defpackage.apng;
import defpackage.apni;
import defpackage.apnj;
import defpackage.apnk;
import defpackage.aver;
import defpackage.axzg;
import defpackage.aypy;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.eng;
import defpackage.fiv;
import defpackage.gii;
import defpackage.gje;
import defpackage.obr;
import defpackage.yqw;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HomePageMonitor implements any {
    public final abey a;
    public final axzg b;
    private final aypy c;
    private ayqx d;

    public HomePageMonitor(axzg axzgVar, gje gjeVar, obr obrVar, yqw yqwVar, abey abeyVar, byte[] bArr, byte[] bArr2) {
        this.b = axzgVar;
        this.a = abeyVar;
        this.c = aypy.o(gjeVar.h().Y(fiv.o), yqwVar.b(), obrVar.a.U().Y(fiv.p), gii.a);
    }

    public static void g(abey abeyVar) {
        apng a = apni.a();
        apnj a2 = apnk.a();
        aver averVar = aver.SCREEN_HOME_FEED;
        a2.copyOnWrite();
        ((apnk) a2.instance).f(averVar);
        a.copyOnWrite();
        ((apni) a.instance).g((apnk) a2.build());
        abeyVar.a((apni) a.build());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        if (this.b.u().booleanValue()) {
            this.d = this.c.aF().L(eng.s).ax(new ayrs() { // from class: gih
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    HomePageMonitor.g(HomePageMonitor.this.a);
                }
            });
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        Object obj = this.d;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
