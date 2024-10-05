package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gik extends gif {
    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.startup_loading_view, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.progressbar);
        findViewById.postDelayed(new hgc(findViewById, 1), 1000L);
        return inflate;
    }
}
