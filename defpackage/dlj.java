package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dlj {
    public final Resources.Theme a;
    private final Resources b;
    private final Context c;

    public dlj(dhe dheVar) {
        Context context = dheVar.b;
        this.c = context;
        this.b = context.getResources();
        this.a = context.getTheme();
    }

    public final int a(float f) {
        return did.n(f * this.b.getDisplayMetrics().density);
    }

    public final int b(float f) {
        return did.n(f * this.b.getDisplayMetrics().scaledDensity);
    }
}
