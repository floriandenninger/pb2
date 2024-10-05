package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfe extends ajpc {
    private final ajut a;
    private final ajjz b;
    private final aahd c;
    private final ajuw d;
    private final Context e;
    private final ajop f;
    private final FrameLayout g;
    private ajom h;
    private ajom i;

    public lfe(Context context, ajjz ajjzVar, aahd aahdVar, gma gmaVar, ajuw ajuwVar, ajut ajutVar) {
        this.e = context;
        this.f = gmaVar;
        this.b = ajjzVar;
        this.c = aahdVar;
        this.d = ajuwVar;
        this.a = ajutVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        gmaVar.c(frameLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.f).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajom ajomVar = this.h;
        if (ajomVar != null) {
            ajomVar.b(ajosVar);
        }
        ajom ajomVar2 = this.i;
        if (ajomVar2 != null) {
            ajomVar2.b(ajosVar);
        }
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        ajom ajomVar;
        awcl awclVar = (awcl) obj;
        ajok ajokVar2 = new ajok(ajokVar);
        ajokVar2.b = awclVar.n.I();
        this.g.removeAllViews();
        int Q = awxr.Q(awclVar.k);
        if (Q == 0) {
            Q = 1;
        }
        if (Q - 1 != 2) {
            if (this.h == null) {
                this.h = new lfd(this.e, this.b, this.c, new ajpe(), this.a);
            }
            ajomVar = this.h;
        } else {
            if (this.i == null) {
                this.i = new lfc(this.e, this.b, this.c, new ajpe(), this.d, this.a);
            }
            ajomVar = this.i;
        }
        ajomVar.oB(ajokVar, awclVar);
        this.g.addView(ajomVar.a());
        this.f.e(ajokVar2);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awcl) obj).n.I();
    }
}
