package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acdv extends abog {
    final /* synthetic */ acdw a;
    public final wr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acdv(acdw acdwVar) {
        super(acdwVar.c, acdwVar.j, null, acdwVar.i, acdwVar.q);
        this.a = acdwVar;
        this.l = new acdt(this.b);
    }

    @Override // defpackage.abog
    public final RecyclerView a() {
        return this.a.e;
    }

    @Override // defpackage.abog
    public final RecyclerView b() {
        return null;
    }

    @Override // defpackage.abog
    public final View d() {
        return null;
    }

    @Override // defpackage.abog
    public final ajwf f() {
        acdw acdwVar = this.a;
        if (acdwVar.s == null) {
            acdwVar.n.a();
            acdw acdwVar2 = this.a;
            sqq sqqVar = acdwVar2.v;
            acra acraVar = this.e;
            ajgq ajgqVar = acdwVar2.n;
            ajhd a = ajgqVar.a().a(ajhb.LIVE_CHAT);
            acdw acdwVar3 = this.a;
            acdwVar2.s = new ajzt(sqqVar, acraVar, ajgqVar, a, acdwVar3.o, acdwVar3.p);
        }
        return this.a.s;
    }

    @Override // defpackage.abog, defpackage.abjp
    public final void t(ajng ajngVar, ajol ajolVar) {
        if (this.g == ajngVar) {
            return;
        }
        super.t(ajngVar, ajolVar);
        this.a.e.af(new acdu(this));
    }
}
