package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.libraries.youtube.edit.audioswap.model.CategorySelection;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zlk extends zls {
    public ajjs a;
    public CategorySelection b;
    private zlo c;

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putParcelable("category_selection", this.b);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle != null) {
            this.b = (CategorySelection) bundle.getParcelable("category_selection");
        }
        this.c = new zlo(C(), this.b.b, this.a);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.audio_swap_category_selection_view, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.audio_swap_category_selection_view);
        zlo zloVar = this.c;
        zloVar.getClass();
        gridView.setAdapter((ListAdapter) zloVar);
        return inflate;
    }
}
