package com.google.android.apps.youtube.app.common.dialog;

import com.google.android.youtube.R;
import defpackage.any;
import defpackage.aoe;
import defpackage.aok;
import defpackage.bv;
import defpackage.ci;
import defpackage.dn;
import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class DialogFragmentController implements any {
    private final String a;
    private final ci b;
    private boolean c;
    private bv d;
    private int e = 1;
    public bv i;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogFragmentController(ci ciVar, String str) {
        ciVar.getClass();
        this.b = ciVar;
        zhq.m(str);
        this.a = str;
    }

    private final void g() {
        this.b.getLifecycle().b(this);
        this.c = !(this.b.getLifecycle().a() == aoe.RESUMED);
    }

    public final bv i() {
        bv bvVar = this.i;
        return bvVar != null ? bvVar : (bv) this.b.getSupportFragmentManager().f(this.a);
    }

    public final void j(bv bvVar) {
        g();
        if (this.c) {
            this.e = 2;
            this.d = bvVar;
        } else if (this.i == null) {
            this.d = null;
            this.i = bvVar;
            dn k = this.b.getSupportFragmentManager().k();
            k.z(R.anim.bottom_translate_in, 0);
            k.r(bvVar, this.a);
            k.a();
            bvVar.X.b(new any() { // from class: com.google.android.apps.youtube.app.common.dialog.DialogFragmentController.1
                @Override // defpackage.aoa
                public final /* synthetic */ void lc(aok aokVar) {
                }

                @Override // defpackage.any, defpackage.aoa
                public final /* synthetic */ void lg(aok aokVar) {
                }

                @Override // defpackage.any, defpackage.aoa
                public final void lh(aok aokVar) {
                    DialogFragmentController.this.i = null;
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
            });
        }
    }

    public final void k() {
        if (this.c) {
            this.e = 16;
            return;
        }
        bv i = i();
        this.i = i;
        if (i != null) {
            dn k = this.b.getSupportFragmentManager().k();
            k.z(R.anim.bottom_translate_in, R.anim.bottom_translate_out);
            k.m(i);
            k.a();
            this.i = null;
        }
        this.b.getLifecycle().c(this);
    }

    public final void l() {
        if (this.c) {
            this.e = 8;
            return;
        }
        bv i = i();
        this.i = i;
        if (i == null || !i.av()) {
            return;
        }
        bv bvVar = this.i;
        dn k = this.b.getSupportFragmentManager().k();
        k.z(0, R.anim.bottom_translate_out);
        k.l(bvVar);
        k.a();
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        this.c = true;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    public final void m() {
        this.i = null;
    }

    public void n() {
        g();
        if (this.c) {
            this.e = 4;
            return;
        }
        bv i = i();
        this.i = i;
        if (i == null || i.av()) {
            return;
        }
        bv bvVar = this.i;
        dn k = this.b.getSupportFragmentManager().k();
        k.z(R.anim.bottom_translate_in, 0);
        k.n(bvVar);
        k.a();
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        this.c = false;
        int i = this.e;
        if (i == 2) {
            bv bvVar = this.d;
            if (bvVar != null) {
                j(bvVar);
            }
        } else if (i == 4) {
            n();
        } else if (i == 8) {
            l();
        } else if (i == 16) {
            k();
        }
        this.e = 1;
    }
}
