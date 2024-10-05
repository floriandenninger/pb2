package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eto extends ajpc {
    public final Context a;
    public final ajjz b;
    public final gma c;
    public final ajuw d;
    public final ftn e;
    public final ajoy f;
    public final fvf g;
    private final FrameLayout h;
    private ajom i;
    private ajom j;

    public eto(Context context, ajjz ajjzVar, gma gmaVar, ajoy ajoyVar, ajuw ajuwVar, ftn ftnVar, fvf fvfVar, byte[] bArr, byte[] bArr2) {
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
        this.f = ajoyVar;
        this.d = ajuwVar;
        this.e = ftnVar;
        this.g = fvfVar;
        this.c = gmaVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        gmaVar.c(frameLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        ajom ajomVar;
        arcl arclVar = (arcl) obj;
        if (fav.h(ajokVar)) {
            if (this.j == null) {
                this.j = new etm(this);
            }
            ajomVar = this.j;
        } else {
            if (this.i == null) {
                this.i = new etn(this);
            }
            ajomVar = this.i;
        }
        if (this.h != ajomVar.a().getParent()) {
            this.h.removeAllViews();
            this.h.addView(ajomVar.a());
        }
        ajomVar.oB(ajokVar, arclVar);
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arcl) obj).m.I();
    }
}
