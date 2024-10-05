package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbn extends wo {
    private final zbd a;
    private final boolean b;

    public zbn(RecyclerView recyclerView) {
        this(recyclerView, false);
    }

    @Override // defpackage.wo, defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && !recyclerView.canScrollHorizontally(-1)) {
            return false;
        }
        this.a.a(motionEvent);
        return false;
    }

    public zbn(RecyclerView recyclerView, boolean z) {
        this.b = z;
        recyclerView.getClass();
        this.a = new zbd(recyclerView);
    }
}
