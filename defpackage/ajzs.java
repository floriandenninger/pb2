package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajzs implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ syu a;
    final /* synthetic */ RecyclerView b;
    private boolean c = true;

    public ajzs(syu syuVar, RecyclerView recyclerView) {
        this.a = syuVar;
        this.b = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.c && this.a.c()) {
            this.c = false;
            this.b.post(new Runnable() { // from class: ajzr
                @Override // java.lang.Runnable
                public final void run() {
                    ajzs ajzsVar = ajzs.this;
                    ajzsVar.b.getViewTreeObserver().removeOnDrawListener(ajzsVar);
                }
            });
            this.a.b(this.b, 0, this.b.getHeight());
        }
    }
}
