package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class npx extends FrameLayout {
    final /* synthetic */ npy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npx(Context context, npy npyVar) {
        super(context);
        this.a = npyVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.a();
    }
}
