package com.google.android.apps.youtube.app.mdx.tvsignin;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import defpackage.acun;
import defpackage.adsq;
import defpackage.adsv;
import defpackage.adsw;
import defpackage.ci;
import defpackage.shf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxAssistedTvSignInDialogFragmentController extends DialogFragmentController {
    public final adsq a;
    public final SharedPreferences b;
    public final shf c;
    public final int d;
    private final adsw e;

    public MdxAssistedTvSignInDialogFragmentController(ci ciVar, adsw adswVar, adsq adsqVar, SharedPreferences sharedPreferences, acun acunVar, shf shfVar) {
        super(ciVar, "MdxAssistedTvSignInDialogFragmentController");
        this.e = adswVar;
        this.a = adsqVar;
        this.b = sharedPreferences;
        this.d = acunVar.x;
        this.c = shfVar;
    }

    public final void g() {
        adsv g = this.e.g();
        if (g != null) {
            this.a.a(g.b, "canceled");
        }
        this.e.i();
    }
}
