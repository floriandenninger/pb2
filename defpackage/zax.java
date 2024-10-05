package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zax {
    private final Context d;
    public int a = 200;
    public int c = 1;
    public int b = 20;

    public zax(Context context) {
        this.d = context;
    }

    public final zay a() {
        return new zay(this.d, this.a, this.c, this.b);
    }
}
