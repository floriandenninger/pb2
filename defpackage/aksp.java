package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksp {
    private final Context a;
    private final zey b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;

    public aksp(Context context, zey zeyVar) {
        this.a = context;
        this.b = zeyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.e = this.f;
        try {
            this.f = uon.c(this.a);
        } catch (Throwable th) {
            String.valueOf(String.valueOf(th)).length();
            int i = akso.a;
        }
        this.c = this.d;
        this.d = this.b.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.c || this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.e || this.f;
    }
}
