package defpackage;

import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mhj implements Runnable {
    public final /* synthetic */ ScrollSelectionController a;
    private final /* synthetic */ int b;

    public /* synthetic */ mhj(ScrollSelectionController scrollSelectionController, int i) {
        this.b = i;
        this.a = scrollSelectionController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.l();
        } else {
            this.a.l();
        }
    }
}
