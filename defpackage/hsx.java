package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hsx implements hxg {
    final /* synthetic */ hsy a;
    private final View b;

    public hsx(hsy hsyVar, View view) {
        this.a = hsyVar;
        this.b = view;
    }

    @Override // defpackage.hxg
    public final float a() {
        int i;
        if (!this.a.d()) {
            return 0.0f;
        }
        hsy hsyVar = this.a;
        if (hsyVar.s) {
            i = hsyVar.c.a();
        } else if (hsyVar.t) {
            i = hsyVar.d.a();
        } else {
            zga.b("getChooseFilterOpenHeight: No open ChooseFilterViews");
            i = 0;
        }
        hsy hsyVar2 = this.a;
        if (hsyVar2.a) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hsyVar2.g.getLayoutParams();
            r2 = hsyVar2.m - ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + ((hsyVar2.g.getHeight() - hsyVar2.l) / 2));
        }
        return -(i + r2);
    }

    @Override // defpackage.hxg
    public final float b() {
        return this.b.getTranslationY();
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.b;
    }

    @Override // defpackage.hxg
    public final void e() {
    }

    @Override // defpackage.hxg
    public final void f() {
    }
}
