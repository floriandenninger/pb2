package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nsx extends wr {
    public boolean a;
    private final int n;
    private final int o;

    public nsx(Context context, int i, int i2) {
        super(context);
        this.n = i;
        this.o = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr
    public final int b(int i) {
        return this.o;
    }

    @Override // defpackage.wr
    public final int i(View view, int i) {
        return super.i(view, i) - this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr
    public final int j(int i) {
        return this.o >> 1;
    }

    @Override // defpackage.wr
    protected final int l() {
        return this.a ? 1 : -1;
    }

    public final void n() {
        super.f();
    }
}
