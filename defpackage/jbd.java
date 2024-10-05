package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jbd extends aboi {
    final /* synthetic */ jbe a;
    private View l;
    private View m;
    private View n;
    private RecyclerView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbd(jbe jbeVar, ajvb ajvbVar, ajoy ajoyVar, acra acraVar, abiy abiyVar) {
        super(jbeVar.b, ajvbVar, ajoyVar, acraVar, abiyVar);
        this.a = jbeVar;
    }

    @Override // defpackage.abog
    public final RecyclerView a() {
        return this.a.h;
    }

    @Override // defpackage.aboi, defpackage.abog
    public final RecyclerView b() {
        if (this.o == null) {
            RecyclerView recyclerView = (RecyclerView) this.a.i.findViewById(R.id.ticker);
            this.o = recyclerView;
            if (recyclerView != null) {
                recyclerView.ae(null);
            }
        }
        return this.o;
    }

    @Override // defpackage.aboi
    public final View c() {
        if (this.n == null) {
            this.n = this.a.i.findViewById(R.id.live_chat_banner_container);
        }
        return this.n;
    }

    @Override // defpackage.abog
    public final View d() {
        if (this.l == null) {
            this.l = this.a.i.findViewById(R.id.more_comments_icon_container);
        }
        return this.l;
    }

    @Override // defpackage.aboi
    protected final View e() {
        if (this.m == null) {
            this.m = this.a.i.findViewById(R.id.more_comments_icon);
        }
        return this.m;
    }

    @Override // defpackage.abog
    public final ajwf f() {
        jbe jbeVar = this.a;
        if (jbeVar.k == null) {
            jbeVar.c.a();
            jbe jbeVar2 = this.a;
            sqq sqqVar = jbeVar2.m;
            acra acraVar = ((abht) jbeVar2.a.get()).p;
            ajgq ajgqVar = this.a.c;
            ajhd a = ajgqVar.a().a(ajhb.LIVE_CHAT);
            jbe jbeVar3 = this.a;
            jbeVar2.k = new ajzt(sqqVar, acraVar, ajgqVar, a, jbeVar3.d, jbeVar3.e);
        }
        return this.a.k;
    }
}
