package com.google.apps.tiktok.tracing.contrib.androidx;

import defpackage.amjw;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TracedDefaultLifecycleObserver implements any {
    private final any a;

    public TracedDefaultLifecycleObserver(any anyVar) {
        amkq.O(true, "Yo dawg.");
        this.a = anyVar;
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        amjw.f();
        amjw.j();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        amjw.f();
        try {
            this.a.lg(aokVar);
            amjw.j();
        } catch (Throwable th) {
            try {
                amjw.j();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        amjw.f();
        try {
            this.a.lh(aokVar);
            amjw.j();
        } catch (Throwable th) {
            try {
                amjw.j();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        amjw.f();
        try {
            this.a.nu(aokVar);
            amjw.j();
        } catch (Throwable th) {
            try {
                amjw.j();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        amjw.f();
        amjw.j();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        amjw.f();
        try {
            this.a.ot(aokVar);
            amjw.j();
        } catch (Throwable th) {
            try {
                amjw.j();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
