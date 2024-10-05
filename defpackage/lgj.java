package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgj extends ajpc {
    private final Context a;
    private final lgh b;
    private final FrameLayout c;
    private lgf d;
    private lgf e;

    public lgj(Context context, aahd aahdVar, ajjz ajjzVar, akbf akbfVar, ajyg ajygVar, ajut ajutVar, ftn ftnVar, fvf fvfVar, akbd akbdVar, byte[] bArr) {
        this.a = context;
        this.b = new lgh(context, aahdVar, ajjzVar, akbfVar, ajygVar, ajutVar, ftnVar, fvfVar, akbdVar, null);
        this.c = new FrameLayout(context);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        lgf lgfVar = this.d;
        if (lgfVar != null) {
            lgfVar.b(ajosVar);
        }
        lgf lgfVar2 = this.e;
        if (lgfVar2 != null) {
            lgfVar2.b(ajosVar);
        }
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        lgf lgfVar;
        awcw awcwVar = (awcw) obj;
        if (yjk.aa(this.a)) {
            if (this.e == null) {
                this.e = this.b.a(this.c, 2);
            }
            lgfVar = this.e;
        } else {
            if (this.d == null) {
                this.d = this.b.a(this.c, 1);
            }
            lgfVar = this.d;
        }
        this.c.removeAllViews();
        this.c.addView(lgfVar.a);
        lgfVar.oB(ajokVar, awcwVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awcw) obj).n.I();
    }
}
