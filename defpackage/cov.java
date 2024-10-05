package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cov {
    public final cow a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ coy d;

    public cov(coy coyVar, cow cowVar) {
        this.d = coyVar;
        this.a = cowVar;
        this.b = cowVar.e ? null : new boolean[coyVar.d];
    }

    public final void a() {
        this.d.b(this, false);
    }

    public final void b() {
        if (this.c) {
            return;
        }
        try {
            a();
        } catch (IOException unused) {
        }
    }
}
