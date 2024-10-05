package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kks implements View.OnClickListener {
    public final /* synthetic */ kkv a;
    private final /* synthetic */ int b;

    public /* synthetic */ kks(kkv kkvVar, int i) {
        this.b = i;
        this.a = kkvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xhy f;
        xjk xjkVar;
        if (this.b == 0) {
            xla xlaVar = this.a.k;
            if (xlaVar == null || (f = ((xhz) xlaVar).f()) == null || (xjkVar = ((wpc) f).e) == null) {
                return;
            }
            xjkVar.e();
            return;
        }
        xla xlaVar2 = this.a.k;
        xlaVar2.getClass();
        xlaVar2.d();
    }
}
