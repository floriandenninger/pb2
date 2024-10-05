package com.google.android.apps.youtube.app.common.ui.navigation;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneFragmentOrientationLocker;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqx;
import defpackage.ayrm;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.fiv;
import defpackage.gji;
import defpackage.gjr;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaneFragmentOrientationLocker implements any {
    public final gjr a;
    public Object b;
    private final gji c;
    private ayqx d;

    public PaneFragmentOrientationLocker(gji gjiVar, gjr gjrVar) {
        this.c = gjiVar;
        this.a = gjrVar;
    }

    public final void g() {
        Object obj = this.b;
        if (obj != null) {
            this.a.d(obj);
            this.b = null;
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        Object obj = this.d;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.d = null;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        Object obj = this.d;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        this.d = this.c.b().aj(fiv.q).B().C(new ayrm() { // from class: gis
            @Override // defpackage.ayrm
            public final void a() {
                PaneFragmentOrientationLocker.this.g();
            }
        }).ax(new ayrs() { // from class: git
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                final PaneFragmentOrientationLocker paneFragmentOrientationLocker = PaneFragmentOrientationLocker.this;
                paneFragmentOrientationLocker.g();
                ((Optional) obj2).ifPresent(new Consumer() { // from class: giu
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj3) {
                        PaneFragmentOrientationLocker paneFragmentOrientationLocker2 = PaneFragmentOrientationLocker.this;
                        paneFragmentOrientationLocker2.b = paneFragmentOrientationLocker2.a.c(((gjq) obj3).d);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }
}
