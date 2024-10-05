package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vcy {
    public final Context a;
    public vei b;
    public final vdn c = new vdn();

    public vcy(Context context) {
        vls.k(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }

    public final vcz a() {
        return new vcz(this);
    }
}
