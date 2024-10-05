package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class affe {
    private boolean a;
    private final Context b;

    public affe(Context context) {
        this.b = context;
    }

    public final synchronized void a() {
        if (this.a) {
            return;
        }
        yny.g(this.b, "elements");
        this.a = true;
    }
}
