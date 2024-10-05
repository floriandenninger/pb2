package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jxv implements View.OnClickListener {
    public final /* synthetic */ jyb a;
    private final /* synthetic */ int b;

    public /* synthetic */ jxv(jyb jybVar, int i) {
        this.b = i;
        this.a = jybVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            this.a.n.performClick();
            return;
        }
        jyb jybVar = this.a;
        jwb jwbVar = jybVar.h;
        String str = jybVar.u;
        zhq.m(str);
        jwbVar.a(str);
    }
}
