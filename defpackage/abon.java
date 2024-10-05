package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abon extends abog {
    private final acqz a;
    private final ajgq l;
    private final sxw m;
    private final azrw n;
    private final View o;
    private RecyclerView p;
    private View q;
    private RecyclerView r;
    private ajwf s;
    private final sqq t;

    public abon(Context context, ajvb ajvbVar, ajoy ajoyVar, acqz acqzVar, sqq sqqVar, ajgq ajgqVar, sxw sxwVar, azrw azrwVar, abiy abiyVar, View view) {
        super(context, ajvbVar, ajoyVar, acqzVar.mM(), abiyVar);
        this.n = azrwVar;
        this.o = view;
        this.a = acqzVar;
        this.t = sqqVar;
        this.l = ajgqVar;
        this.m = sxwVar;
    }

    @Override // defpackage.abog
    public final abor C() {
        return new abor(this.c, (abgk) this.g, this.o);
    }

    @Override // defpackage.abog
    public final RecyclerView a() {
        if (this.p == null) {
            this.p = (RecyclerView) this.o.findViewById(R.id.conversation_list);
        }
        return this.p;
    }

    @Override // defpackage.abog
    public final RecyclerView b() {
        if (this.r == null) {
            this.r = (RecyclerView) this.o.findViewById(R.id.ticker);
        }
        return this.r;
    }

    @Override // defpackage.abog
    public final View d() {
        if (this.q == null) {
            this.q = this.o.findViewById(R.id.more_comments_icon);
        }
        return this.q;
    }

    @Override // defpackage.abog
    public final ajwf f() {
        if (this.s == null) {
            this.l.a();
            sqq sqqVar = this.t;
            acra mM = this.a.mM();
            ajgq ajgqVar = this.l;
            this.s = new ajzt(sqqVar, mM, ajgqVar, ajgqVar.a().a(ajhb.LIVE_CHAT), this.m, this.n);
        }
        return this.s;
    }
}
