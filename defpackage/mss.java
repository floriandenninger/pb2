package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mss extends ajpc {
    final RecyclerView a;
    private final Context b;
    private final ajop c;
    private final hai d;
    private final ajpd e;
    private final ajox f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [ajos, java.lang.Object] */
    public mss(Context context, gma gmaVar, ajvb ajvbVar, ajoy ajoyVar) {
        this.b = context;
        this.c = gmaVar;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.reels_grid, (ViewGroup) null);
        this.a = recyclerView;
        ajpd ajpdVar = new ajpd();
        this.e = ajpdVar;
        recyclerView.af(new GridLayoutManager(g(), null));
        ajox a = ajoyVar.a(ajvbVar.get());
        this.f = a;
        a.h(ajpdVar);
        recyclerView.ac(a);
        hai haiVar = new hai();
        this.d = haiVar;
        a.rU(haiVar);
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: msq
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                mss.this.f();
            }
        });
        gmaVar.c(recyclerView);
        recyclerView.setFocusable(false);
    }

    private final int g() {
        return this.b.getResources().getInteger(R.integer.reel_grid_column_count);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.c).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.clear();
        this.d.b();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aujr aujrVar = (aujr) obj;
        f();
        this.f.rU(new ajnw(ajokVar.a));
        final Object c = ajokVar.c("sectionListController");
        if (c != null) {
            this.f.rU(new ajol() { // from class: msr
                @Override // defpackage.ajol
                public final void a(ajok ajokVar2, ajng ajngVar, int i) {
                    ajokVar2.f("sectionListController", c);
                }
            });
        }
        this.e.clear();
        ArrayList arrayList = new ArrayList();
        for (aulq aulqVar : aujrVar.b) {
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = aulqVar.pY(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) ? (ReelItemRendererOuterClass$ReelItemRenderer) aulqVar.pX(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) : null;
            if (reelItemRendererOuterClass$ReelItemRenderer != null) {
                this.e.add(reelItemRendererOuterClass$ReelItemRenderer);
                apxf apxfVar = reelItemRendererOuterClass$ReelItemRenderer.m;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    apxf apxfVar2 = reelItemRendererOuterClass$ReelItemRenderer.m;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    arrayList.add(apxfVar2);
                }
            }
        }
        this.d.a = new ReelToReelList(Collections.unmodifiableList(arrayList));
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aujr) obj).c.I();
    }

    public final void f() {
        int g = g();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.a.n;
        if (gridLayoutManager.b != g) {
            gridLayoutManager.q(g);
            this.a.af(gridLayoutManager);
        }
    }

    @Override // defpackage.ajpc
    protected final boolean l() {
        return true;
    }
}
