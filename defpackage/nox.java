package defpackage;

import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nox implements ayrs {
    public final /* synthetic */ RelativeLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ nox(RelativeLayout relativeLayout, int i) {
        this.b = i;
        this.a = relativeLayout;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b != 0) {
            this.a.setTranslationY(((Integer) obj).intValue());
        } else {
            this.a.setTranslationY(((Integer) obj).intValue());
        }
    }
}
