package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zey {
    public volatile boolean a;
    private final yqi b;

    public zey(Context context) {
        this.a = uon.c(context);
        yqi yqiVar = new yqi();
        this.b = yqiVar;
        yqiVar.c(new yqa() { // from class: zew
            @Override // defpackage.yqa
            public final void c() {
                zey.this.a = false;
            }
        });
        yqiVar.c(new yqb() { // from class: zex
            @Override // defpackage.yqb
            public final void a() {
                zey.this.a = true;
            }
        });
        yqiVar.a((Application) context.getApplicationContext());
    }

    public final void a(yqd yqdVar) {
        this.b.c(yqdVar);
    }

    public final void b(yqd yqdVar) {
        this.b.d(yqdVar);
    }
}
