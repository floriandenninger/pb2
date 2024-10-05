package defpackage;

import android.content.Intent;
import j$.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afyj implements Supplier {
    public final /* synthetic */ Intent a;
    private final /* synthetic */ int b;

    public /* synthetic */ afyj(Intent intent, int i) {
        this.b = i;
        this.a = intent;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return this.b != 0 ? ucz.a(amru.r(this.a)) : ucz.a(amru.r(this.a));
    }
}
