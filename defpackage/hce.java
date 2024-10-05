package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hce implements View.OnClickListener {
    public final /* synthetic */ ReelBrowseFragmentToolbarController a;
    private final /* synthetic */ int b;

    public /* synthetic */ hce(ReelBrowseFragmentToolbarController reelBrowseFragmentToolbarController, int i) {
        this.b = i;
        this.a = reelBrowseFragmentToolbarController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.g();
            return;
        }
        if (i == 1) {
            this.a.g();
        } else if (i != 2) {
            this.a.g();
        } else {
            this.a.g();
        }
    }
}
