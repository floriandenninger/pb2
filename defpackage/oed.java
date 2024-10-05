package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oed extends oeg {
    public oed(oel oelVar, View view) {
        super(oelVar, view);
    }

    @Override // defpackage.oeg
    public final Rect h(obp obpVar) {
        Rect r = obpVar.r();
        return new Rect(r.left, obpVar.t().top, r.right, r.bottom);
    }
}
