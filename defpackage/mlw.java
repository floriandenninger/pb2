package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.ui.inline.SnappyLinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mlw extends SnappyLinearLayoutManager {
    final /* synthetic */ mmb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlw(mmb mmbVar, Context context) {
        super(context);
        this.a = mmbVar;
    }

    @Override // com.google.android.apps.youtube.app.ui.inline.SnappyLinearLayoutManager
    protected final wr c() {
        if (yjk.aa(this.a.a)) {
            return new mma(this.a.a, this);
        }
        return new mlz(this.a.a, this);
    }
}
