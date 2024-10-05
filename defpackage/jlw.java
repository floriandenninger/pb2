package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jlw implements View.OnClickListener {
    public final /* synthetic */ jlz a;
    private final /* synthetic */ int b;

    public /* synthetic */ jlw(jlz jlzVar, int i) {
        this.b = i;
        this.a = jlzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            jlz jlzVar = this.a;
            kyo kyoVar = jlzVar.a;
            String str = jlzVar.f;
            agng agngVar = jlzVar.m;
            amkq.u(agngVar);
            kyoVar.d(str, agngVar.b);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                jlz jlzVar2 = this.a;
                jlzVar2.b.f(jlzVar2.f, agyg.a(false));
                return;
            } else {
                this.a.r.performClick();
                return;
            }
        }
        jlz jlzVar3 = this.a;
        kyo kyoVar2 = jlzVar3.a;
        asno asnoVar = jlzVar3.o ? asno.INDIFFERENT : asno.LIKE;
        String str2 = jlzVar3.f;
        amkq.u(str2);
        kyoVar2.b(asnoVar, str2);
    }
}
