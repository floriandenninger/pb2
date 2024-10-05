package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oqs implements ayrs {
    public final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public /* synthetic */ oqs(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.addView((View) obj);
        } else {
            nrz.c(((Boolean) obj).booleanValue(), false, this.a);
        }
    }
}
