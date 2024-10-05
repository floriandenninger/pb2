package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lpv extends ajpc {
    private final FrameLayout a;
    private final ajos b;
    private final ViewGroup c;
    private ajom d;

    public lpv(Context context, ajos ajosVar, ViewGroup viewGroup) {
        this.b = ajosVar;
        this.c = viewGroup;
        this.a = new FrameLayout(context);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajom ajomVar = this.d;
        if (ajomVar != null) {
            ajomVar.b(ajosVar);
            this.a.removeAllViews();
        }
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        this.a.removeAllViews();
        lqg a = lqg.a((aupu) obj);
        ajom r = ahbw.r(this.b, a, this.c);
        this.d = r;
        if (r != null) {
            r.oB(ajokVar, a);
            if (this.d.a() != null) {
                this.a.addView(this.d.a());
            }
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aupu) obj).p.I();
    }
}
