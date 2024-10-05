package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akha extends ic {
    final /* synthetic */ akhg b;

    public akha(akhg akhgVar) {
        this.b = akhgVar;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        RecyclerView recyclerView = this.b.ak;
        if (Build.VERSION.SDK_INT >= 22) {
            ksVar.b.setTraversalAfter(recyclerView);
        }
    }
}
