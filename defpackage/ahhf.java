package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhf {
    public final Handler a;
    public final ahhi b;
    public final Runnable c;

    public ahhf(ahhi ahhiVar, ahjl ahjlVar, Handler handler, ahkv ahkvVar, ahkm ahkmVar, String str) {
        this.a = handler;
        ahhi ahhiVar2 = new ahhi();
        this.b = ahhiVar2;
        ahjo a = ahjlVar.a(ahkvVar, 0.0f, 0.0f);
        a.B(true, true);
        a.y(str);
        a.z(-1);
        a.o();
        ahku a2 = ahku.a(1.0f, 1.0f, ahku.c);
        ahgd ahgdVar = new ahgd(a2, ahkvVar.clone(), ahgd.s(new float[]{0.0f, 0.0f, 0.0f, 0.5f}, a2.f), ahkmVar.a.a());
        ahgdVar.t();
        ahgdVar.o();
        a.g(new ahhd(ahgdVar));
        ahhiVar2.n(ahgdVar);
        ahhiVar2.n(a);
        ahhiVar.n(ahhiVar2);
        ahhiVar2.l = true;
        this.c = new ahhe(this);
    }
}
