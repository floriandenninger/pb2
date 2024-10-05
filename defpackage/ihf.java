package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ihf extends LinearLayoutManager {
    final /* synthetic */ ihl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihf(ihl ihlVar, Context context) {
        super(ihlVar.r ? 1 : 0);
        this.a = ihlVar;
        ihlVar.C = 117.46f / ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final boolean ad() {
        ihl ihlVar = this.a;
        return (ihlVar.r || ihlVar.q()) ? super.ad() : !this.a.e.b;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final boolean ae() {
        ihl ihlVar = this.a;
        return (!ihlVar.r || ihlVar.q()) ? super.ae() : !this.a.e.b;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final void ao(RecyclerView recyclerView, int i) {
        ihg ihgVar = new ihg(this.a, recyclerView.getContext());
        ihgVar.b = i;
        bd(ihgVar);
    }
}
