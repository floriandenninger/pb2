package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfj implements atd {
    private final Context a;
    private final atd b;

    public bfj(Context context) {
        this(context, new ati());
    }

    @Override // defpackage.atd
    public final /* bridge */ /* synthetic */ ate a() {
        return new bfk(this.a, ((ati) this.b).a());
    }

    public bfj(Context context, atd atdVar) {
        this.a = context.getApplicationContext();
        this.b = atdVar;
    }
}
