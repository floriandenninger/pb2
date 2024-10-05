package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.watch.engagementpanel.MainAppEngagementPanelDataProvider;
import defpackage.any;
import defpackage.aok;
import defpackage.ayrs;
import defpackage.fgq;
import defpackage.nqg;
import defpackage.nqp;
import defpackage.nqy;
import defpackage.ntd;
import defpackage.nun;
import defpackage.oba;
import defpackage.sxd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainAppEngagementPanelDataProvider implements any, nun {
    public nqp a;
    private final Context b;
    private final sxd c;
    private final nqy d;
    private final fgq e;
    private String f;
    private ViewTreeObserver.OnPreDrawListener g;

    public MainAppEngagementPanelDataProvider(Context context, sxd sxdVar, nqy nqyVar, fgq fgqVar) {
        this.b = context;
        this.c = sxdVar;
        this.d = nqyVar;
        this.e = fgqVar;
    }

    @Override // defpackage.nun
    public final void g(nqg nqgVar) {
        String str = null;
        if (nqgVar != null && nqgVar.l() != null) {
            str = oba.i(nqgVar.l());
        }
        View a = this.a.a();
        if (a != null) {
            this.g = new ntd(this, a, str);
            a.getViewTreeObserver().addOnPreDrawListener(this.g);
        }
        h(str);
        this.f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r6) {
        /*
            r5 = this;
            sxd r0 = r5.c
            asvz r1 = defpackage.asvz.a
            aone r1 = r1.createBuilder()
            fgq r2 = r5.e
            fhg r2 = r2.g()
            boolean r2 = r2.j()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L19
            if (r6 != 0) goto L25
            r6 = 0
        L19:
            java.lang.String r2 = r5.f
            if (r2 == 0) goto L20
            r1.aw(r2, r4)
        L20:
            if (r6 == 0) goto L25
            r1.aw(r6, r3)
        L25:
            nqp r6 = r5.a
            android.view.View r6 = r6.a()
            android.content.Context r2 = r5.b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r6 != 0) goto L38
            goto L3c
        L38:
            int r4 = r6.getHeight()
        L3c:
            int r6 = defpackage.yjk.P(r2, r4)
            r1.copyOnWrite()
            aonm r2 = r1.instance
            asvz r2 = (defpackage.asvz) r2
            int r4 = r2.b
            r3 = r3 | r4
            r2.b = r3
            float r6 = (float) r6
            r2.c = r6
            aonm r6 = r1.build()
            asvz r6 = (defpackage.asvz) r6
            byte[] r6 = r6.toByteArray()
            java.lang.String r1 = "/youtube/app/engagement_panel"
            r0.b(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.engagementpanel.MainAppEngagementPanelDataProvider.h(java.lang.String):void");
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.d.b().ax(new ayrs() { // from class: ntc
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                MainAppEngagementPanelDataProvider mainAppEngagementPanelDataProvider = MainAppEngagementPanelDataProvider.this;
                nqp nqpVar = (nqp) obj;
                nqp nqpVar2 = mainAppEngagementPanelDataProvider.a;
                if (nqpVar2 != null) {
                    nqpVar2.g().b(mainAppEngagementPanelDataProvider);
                }
                mainAppEngagementPanelDataProvider.a = nqpVar;
                mainAppEngagementPanelDataProvider.a.g().a(mainAppEngagementPanelDataProvider);
            }
        });
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.a.g().b(this);
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
