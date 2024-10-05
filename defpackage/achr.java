package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class achr extends abog {
    final /* synthetic */ acht a;
    private RecyclerView l;
    private ajwf m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public achr(acht achtVar, ajvb ajvbVar) {
        super(achtVar.ak, ajvbVar, achtVar.d, achtVar.c, achtVar.ah);
        this.a = achtVar;
    }

    @Override // defpackage.abog
    public final RecyclerView a() {
        return this.a.al;
    }

    @Override // defpackage.abog
    public final RecyclerView b() {
        if (!this.a.as.i().C) {
            return null;
        }
        if (this.l == null) {
            this.l = (RecyclerView) this.a.ak.findViewById(R.id.ticker);
        }
        return this.l;
    }

    @Override // defpackage.abog
    public final View d() {
        return this.a.am;
    }

    @Override // defpackage.abog
    public final ajwf f() {
        if (this.m == null) {
            this.a.ae.a();
            acht achtVar = this.a;
            sqq sqqVar = achtVar.ar;
            acra acraVar = this.e;
            ajgq ajgqVar = achtVar.ae;
            ajhd a = ajgqVar.a().a(ajhb.LIVE_CHAT);
            acht achtVar2 = this.a;
            this.m = new ajzt(sqqVar, acraVar, ajgqVar, a, achtVar2.af, achtVar2.ag);
        }
        return this.m;
    }
}
