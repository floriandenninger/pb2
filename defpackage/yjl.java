package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yjl implements View.OnClickListener {
    final /* synthetic */ yjp a;

    public yjl(yjp yjpVar) {
        this.a = yjpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yjp yjpVar = this.a;
        awhn a = yjpVar.ar.a();
        if (a == null || yjpVar.as) {
            return;
        }
        yjpVar.aJ(true);
        ydn ydnVar = yjpVar.ao;
        String str = a.k;
        long c = yjj.c(a);
        byte[] I = yjpVar.ap.c.I();
        abei b = yjpVar.ai.b();
        b.e(str);
        b.b = c;
        b.m(I);
        ydnVar.g(b);
    }
}
