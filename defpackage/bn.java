package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bn extends bo {
    private final boolean c;
    private boolean d;
    private cj e;

    public bn(en enVar, aio aioVar, boolean z) {
        super(enVar, aioVar);
        this.d = false;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cj a(Context context) {
        if (this.d) {
            return this.e;
        }
        en enVar = this.a;
        cj e = d.e(context, enVar.a, enVar.e == 2, this.c);
        this.e = e;
        this.d = true;
        return e;
    }
}
