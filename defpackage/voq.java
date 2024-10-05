package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class voq extends vor {
    public aps a;
    public vrp b;
    public tgn c;
    public akht d;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.O.findViewById(R.id.photo_picker_infinite_scroll_toolbar);
        materialToolbar.w(R.string.op3_picker_browse_face_groups_title);
        this.b.g(this);
        materialToolbar.r(new View.OnClickListener() { // from class: vop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                voq.this.b.h();
            }
        });
        vot votVar = (vot) this.a.a(vot.class);
        RecyclerView recyclerView = (RecyclerView) this.O.findViewById(R.id.photo_picker_recycler_grid);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.O.findViewById(R.id.photo_picker_loading_view);
        akht akhtVar = this.d;
        aok M = M();
        ajyw ajywVar = (ajyw) akhtVar.b.get();
        vrp vrpVar = (vrp) akhtVar.d.get();
        vrpVar.getClass();
        vlx vlxVar = (vlx) akhtVar.c.get();
        vlxVar.getClass();
        ajoy ajoyVar = (ajoy) akhtVar.a.get();
        ajoyVar.getClass();
        ajoy ajoyVar2 = (ajoy) akhtVar.e.get();
        recyclerView.getClass();
        linearProgressIndicator.getClass();
        new vkn(ajywVar, vrpVar, vlxVar, ajoyVar, ajoyVar2, M, recyclerView, linearProgressIndicator, votVar, null, null, null, null, null);
    }

    @Override // defpackage.vor, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        if (this.e) {
            return;
        }
        axfq.o(this);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != axxp.d() ? R.layout.photo_picker_infinite_scroll_layout : R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        if (axxp.d()) {
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.photo_picker_recycler_grid);
            int dimensionPixelSize = qX().getDimensionPixelSize(R.dimen.photo_picker_cluster_horizontal_padding);
            recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        this.c.a.a(89733).a(inflate);
        return inflate;
    }
}
