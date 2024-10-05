package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwu implements cwa {
    private final Context a;
    private final Class b;

    public cwu(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.cwa
    public final cvz c(cwg cwgVar) {
        return new cww(this.a, cwgVar.a(File.class, this.b), cwgVar.a(Uri.class, this.b), this.b);
    }

    @Override // defpackage.cwa
    public final void d() {
    }
}
