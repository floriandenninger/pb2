package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mbg implements ayrs {
    public final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public /* synthetic */ mbg(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            whu.I(this.a, !((Boolean) obj).booleanValue());
            return;
        }
        if (i == 1) {
            this.a.setAlpha(((Float) obj).floatValue());
            return;
        }
        if (i == 2) {
            whu.I(this.a, !((Boolean) obj).booleanValue());
        } else if (i == 3) {
            this.a.setContentDescription((CharSequence) obj);
        } else {
            oba.q(new yzr(this.a), ((Float) obj).floatValue());
        }
    }
}
