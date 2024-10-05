package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.libraries.youtube.edit.audioswap.model.TrackSelection;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zlu extends zlt {
    public ajjs a;
    public TrackSelection b;
    private zly c;

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putParcelable("track_selection", this.b);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle != null) {
            this.b = (TrackSelection) bundle.getParcelable("track_selection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ci C = C();
        this.c = new zly(C, this.b.a(C()), ((zle) C).b(), this.a, true);
        View inflate = layoutInflater.inflate(R.layout.audio_swap_track_selection_view, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.audio_swap_track_selection_view);
        zly zlyVar = this.c;
        zlyVar.getClass();
        gridView.setAdapter((ListAdapter) zlyVar);
        return inflate;
    }
}
