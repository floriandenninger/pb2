package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.apps.youtube.app.offline.controller.OfflineSlimStatusBarConnectivityController;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ont {
    public final ypa a;
    public final zbi b;
    public final kbv c;
    public final azrw d;
    public final azrw e;
    public final azrw f;
    public final azrw g;
    public final jvh h;
    public final azrw i;
    public final azrw j;
    public final acqz k;
    private final ml l;

    public ont(ml mlVar, ypa ypaVar, final azrw azrwVar, zbi zbiVar, kbv kbvVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, jvh jvhVar, azrw azrwVar6, azrw azrwVar7, acqz acqzVar) {
        this.l = mlVar;
        this.a = ypaVar;
        this.b = zbiVar;
        this.c = kbvVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.f = azrwVar4;
        this.g = azrwVar5;
        this.h = jvhVar;
        this.i = azrwVar6;
        this.j = azrwVar7;
        this.k = acqzVar;
        mlVar.getSavedStateRegistry().b("bundle_is_in_offline_mode", new bub() { // from class: ons
            @Override // defpackage.bub
            public final Bundle a() {
                azrw azrwVar8 = azrw.this;
                Bundle bundle = new Bundle(1);
                bundle.putBoolean("is_in_offline_mode", ((rxm) azrwVar8.get()).a);
                return bundle;
            }
        });
    }

    public static /* synthetic */ void b(Throwable th) {
        zga.d("Failed to complete deletion of pending delete video id on startup", th);
    }

    public final void a() {
        if (this.c instanceof OfflineSlimStatusBarConnectivityController) {
            ViewGroup viewGroup = (ViewGroup) this.l.findViewById(R.id.bottom_bar_container);
            ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.global_slim_status_bar_container);
            OfflineSlimStatusBarConnectivityController offlineSlimStatusBarConnectivityController = (OfflineSlimStatusBarConnectivityController) this.c;
            if (offlineSlimStatusBarConnectivityController.c != null || offlineSlimStatusBarConnectivityController.d != null) {
                offlineSlimStatusBarConnectivityController.e = null;
                offlineSlimStatusBarConnectivityController.f = null;
            }
            offlineSlimStatusBarConnectivityController.c = viewGroup;
            offlineSlimStatusBarConnectivityController.d = viewGroup2;
            SlimStatusBar g = offlineSlimStatusBarConnectivityController.g(false);
            SlimStatusBar g2 = offlineSlimStatusBarConnectivityController.g(true);
            jmk jmkVar = offlineSlimStatusBarConnectivityController.b;
            boolean o = offlineSlimStatusBarConnectivityController.a.o();
            jmkVar.d = viewGroup;
            jmkVar.g = g2;
            jmkVar.f = g;
            jmkVar.e = viewGroup2;
            jmkVar.v = jmkVar.a(true);
            jmkVar.w = jmkVar.a(false);
            if (o) {
                jmkVar.h = 0;
            } else {
                jmkVar.h = 2;
            }
            ViewGroup viewGroup3 = jmkVar.d;
            viewGroup3.getClass();
            SlimStatusBar slimStatusBar = jmkVar.f;
            slimStatusBar.getClass();
            jmkVar.e.getClass();
            jmkVar.g.getClass();
            jmkVar.k = jmkVar.d(viewGroup3, slimStatusBar, false, false);
            jmkVar.j = jmkVar.d(jmkVar.d, jmkVar.f, true, false);
            jmkVar.l = jmkVar.g(jmkVar.d, jmkVar.f);
            jmkVar.m = jmkVar.f(false);
            jmkVar.o = jmkVar.d(jmkVar.e, jmkVar.g, false, false);
            jmkVar.n = jmkVar.d(jmkVar.e, jmkVar.g, true, false);
            jmkVar.p = jmkVar.g(jmkVar.e, jmkVar.g);
            jmkVar.q = jmkVar.f(true);
            jmkVar.r = jmkVar.d(jmkVar.d, jmkVar.f, true, true);
            jmkVar.s = jmkVar.d(jmkVar.e, jmkVar.g, true, true);
            jmkVar.t = jmkVar.e(false);
            jmkVar.u = jmkVar.e(true);
            offlineSlimStatusBarConnectivityController.e = g;
            offlineSlimStatusBarConnectivityController.f = g2;
        }
    }
}
