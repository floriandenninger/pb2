package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oei extends oea {
    private final oel a;
    private final fyz b;

    public oei(oel oelVar, fyz fyzVar) {
        this.a = oelVar;
        this.b = fyzVar;
    }

    @Override // defpackage.oea
    public final float a() {
        return this.a.c().q();
    }

    @Override // defpackage.oea
    public final Rect b() {
        return this.a.d(1).u();
    }

    @Override // defpackage.oea
    public final Rect c() {
        return this.a.c().u();
    }

    @Override // defpackage.oea
    public final View d() {
        return ((fxu) this.b).a;
    }

    @Override // defpackage.oea
    public final boolean g() {
        return this.b.d() && this.a.q() && yjk.aa(e().getContext());
    }
}
