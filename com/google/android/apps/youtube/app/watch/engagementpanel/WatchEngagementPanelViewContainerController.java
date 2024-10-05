package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.content.Context;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.axpg;
import defpackage.aypy;
import defpackage.ayqw;
import defpackage.gpg;
import defpackage.nva;
import defpackage.nvd;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchEngagementPanelViewContainerController implements any {
    public aypy a;
    public final Context b;
    public final axpg c;
    public final aaea d;
    public final nvd e;
    public final gpg f;
    public final aioc g;
    public nva i;
    public final aadw j;
    private final ArrayDeque k = new ArrayDeque();
    public final ayqw h = new ayqw();

    public WatchEngagementPanelViewContainerController(Context context, axpg axpgVar, aadw aadwVar, aaea aaeaVar, nvd nvdVar, gpg gpgVar, aioc aiocVar) {
        this.b = context;
        this.j = aadwVar;
        this.d = aaeaVar;
        this.c = axpgVar;
        this.e = nvdVar;
        this.f = gpgVar;
        this.g = aiocVar;
    }

    public final void g(String str) {
        if (this.k.size() == 8) {
            this.k.removeFirst();
        }
        this.k.addLast(str);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.h.c();
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
