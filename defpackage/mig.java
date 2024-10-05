package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class mig extends wr {
    private final LinearLayoutManager a;

    public mig(Context context, LinearLayoutManager linearLayoutManager) {
        super(context);
        this.a = linearLayoutManager;
    }

    @Override // defpackage.wr
    public final PointF d(int i) {
        return this.a.O(i);
    }

    @Override // defpackage.wr
    protected final int k() {
        return -1;
    }

    @Override // defpackage.wr
    protected final int l() {
        return -1;
    }
}
