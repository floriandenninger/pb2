package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cws implements cwa {
    private final Context a;
    private final /* synthetic */ int b;

    public cws(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.cwa
    public final void d() {
    }

    @Override // defpackage.cwa
    public final cvz c(cwg cwgVar) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? new cwt(this.a, 2, (char[]) null) : new cwt(this.a, 1, (byte[]) null);
        }
        return new cwt(this.a, 0);
    }
}
