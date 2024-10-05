package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class oeg extends oeh {
    public oeg(oel oelVar, View view) {
        super(oelVar, view);
    }

    @Override // defpackage.oeh, defpackage.oea
    public final Rect b() {
        return h(this.d.d(1));
    }

    @Override // defpackage.oeh, defpackage.oea
    public final Rect c() {
        return h(this.d.c());
    }

    public abstract Rect h(obp obpVar);
}
