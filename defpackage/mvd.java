package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvd implements muz {
    public final FrameLayout a;
    public final axpg b;
    public final ajdw c;

    public mvd(ajdw ajdwVar, axpg axpgVar, Context context) {
        this.c = ajdwVar;
        this.b = axpgVar;
        this.a = new FrameLayout(context);
    }

    @Override // defpackage.muz
    public final void b() {
        this.a.removeAllViews();
    }

    @Override // defpackage.muz
    public final View oE() {
        return this.a;
    }
}
