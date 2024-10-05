package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class oeh extends oea {
    private final View a;
    final oel d;

    public oeh(oel oelVar, View view) {
        this.d = oelVar;
        this.a = view;
    }

    @Override // defpackage.oea
    public final float a() {
        return this.d.c().l();
    }

    @Override // defpackage.oea
    public Rect b() {
        return this.d.d(1).r();
    }

    @Override // defpackage.oea
    public Rect c() {
        return this.d.c().r();
    }

    @Override // defpackage.oea
    public View d() {
        return this.a;
    }

    @Override // defpackage.oea
    public boolean g() {
        return this.d.n();
    }
}
