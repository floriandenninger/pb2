package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajzw implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ajzy a;
    private final WeakReference b;

    public ajzw(ajzy ajzyVar, RecyclerView recyclerView) {
        this.a = ajzyVar;
        this.b = new WeakReference(recyclerView);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView = (RecyclerView) this.b.get();
        if (recyclerView == null) {
            return true;
        }
        this.a.c(recyclerView);
        return true;
    }
}
