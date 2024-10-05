package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpm extends ajpc {
    final ajpd a;
    public apxf b;
    private final ViewGroup c;
    private final View d;
    private final RecyclerView e;
    private final ajox f;
    private mwy g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ajos, java.lang.Object] */
    public mpm(ajvb ajvbVar, aahd aahdVar, ajoy ajoyVar, ViewGroup viewGroup) {
        this.c = viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.drawer_results);
        this.e = recyclerView;
        recyclerView.af(new LinearLayoutManager(0));
        ajox a = ajoyVar.a(ajvbVar.get());
        this.f = a;
        recyclerView.ac(a);
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        a.h(ajpdVar);
        View findViewById = viewGroup.findViewById(R.id.all_channels);
        this.d = findViewById;
        findViewById.setOnClickListener(new mpl(this, aahdVar));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b = null;
        this.a.clear();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        auok auokVar = (auok) obj;
        auokVar.getClass();
        if ((auokVar.c & 32) != 0) {
            apxfVar = auokVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        this.b = apxfVar;
        whu.I(this.d, apxfVar != null);
        if (this.g == null) {
            mwy mwyVar = new mwy(ajokVar, 1);
            this.g = mwyVar;
            this.f.rU(mwyVar);
        }
        this.a.clear();
        for (auom auomVar : auokVar.g) {
            if (auomVar.b == 105604662) {
                auoi auoiVar = (auoi) auomVar.c;
                if (!auoiVar.o) {
                    this.a.add(auoiVar);
                }
            }
        }
        this.a.l();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auok) obj).h.I();
    }

    @Override // defpackage.ajpc
    protected final boolean l() {
        return true;
    }
}
