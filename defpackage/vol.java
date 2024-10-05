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
public final class vol extends vom {
    public aps a;
    public vrp b;
    public tgn c;
    public upp d;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.O.findViewById(R.id.photo_picker_infinite_scroll_toolbar);
        materialToolbar.w(R.string.op3_choose_photo);
        this.b.g(this);
        materialToolbar.r(new View.OnClickListener() { // from class: vok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vol.this.b.h();
            }
        });
        aocu aocuVar = (aocu) amkq.ck(this.m, "clusterKey", aocu.a, aomw.b());
        final voo vooVar = (voo) this.a.a(voo.class);
        String str = aocuVar.c;
        if (!vooVar.c.h()) {
            vooVar.c = ammv.j(str);
            vooVar.a.n(vooVar.b.a(str).e, new aox() { // from class: von
                @Override // defpackage.aox
                public final void a(Object obj) {
                    voo.this.a.j((vnb) obj);
                }
            });
        }
        this.d.b(M(), (RecyclerView) this.O.findViewById(R.id.photo_picker_recycler_grid), (LinearProgressIndicator) this.O.findViewById(R.id.photo_picker_loading_view), vooVar, ammv.j(aocuVar), awze.OBAKE_MORE_CLUSTER_PHOTOS_SCREEN);
    }

    @Override // defpackage.vom, defpackage.ce
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
        this.c.a.a(89734).a(inflate);
        return inflate;
    }
}
