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
public final class vqk extends vqi {
    public aps b;
    public vrp c;
    public tgn d;
    public upp e;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.O.findViewById(R.id.photo_picker_infinite_scroll_toolbar);
        materialToolbar.w(R.string.op3_choose_photo);
        this.c.g(this);
        materialToolbar.r(new View.OnClickListener() { // from class: vqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vqk.this.c.h();
            }
        });
        vql vqlVar = (vql) this.b.a(vql.class);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.O.findViewById(R.id.photo_picker_loading_view);
        this.e.b(M(), (RecyclerView) this.O.findViewById(R.id.photo_picker_recycler_grid), linearProgressIndicator, vqlVar, amlr.a, awze.OBAKE_PAST_PROFILE_PHOTOS_SCREEN);
    }

    @Override // defpackage.vqi, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        if (this.a) {
            return;
        }
        axfq.o(this);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != axxp.d() ? R.layout.photo_picker_infinite_scroll_layout : R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        this.d.a.a(101692).a(inflate);
        return inflate;
    }
}
