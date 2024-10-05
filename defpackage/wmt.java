package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wmt {
    public View a;
    private final tdq b;

    public wmt(tdq tdqVar) {
        this.b = tdqVar;
    }

    public final wmv a(baof baofVar) {
        View view = this.a;
        if (view != null) {
            return new wmv(this.b, view, baofVar, null);
        }
        if (baofVar.c) {
            return new wmv(baofVar, null);
        }
        return null;
    }
}
