package com.google.android.libraries.youtube.comment.endpoint;

import android.text.TextUtils;
import com.google.android.libraries.youtube.comment.endpoint.ChangeCommentsMarkersVisibilityCommandHelper;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.azrw;
import defpackage.oqu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ChangeCommentsMarkersVisibilityCommandHelper implements any {
    public final azrw a;
    public boolean b;
    public String c;
    private final aioc d;
    private final ayqw e = new ayqw();

    public ChangeCommentsMarkersVisibilityCommandHelper(azrw azrwVar, aioc aiocVar) {
        this.a = azrwVar;
        this.d = aiocVar;
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
        this.e.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.e.d(this.d.V().E(ayqr.a()).Y(new ayrs() { // from class: xqn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ChangeCommentsMarkersVisibilityCommandHelper changeCommentsMarkersVisibilityCommandHelper = ChangeCommentsMarkersVisibilityCommandHelper.this;
                ahel ahelVar = (ahel) obj;
                if (ahelVar.a() == null) {
                    return;
                }
                String Z = ahelVar.a().Z();
                if (TextUtils.equals(changeCommentsMarkersVisibilityCommandHelper.c, Z)) {
                    return;
                }
                changeCommentsMarkersVisibilityCommandHelper.c = Z;
                changeCommentsMarkersVisibilityCommandHelper.b = false;
            }
        }, oqu.s));
    }
}
