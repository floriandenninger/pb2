package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aeww implements aewj {
    public final Handler a;
    public final aewj b;
    protected final Handler c;

    public aeww(Handler handler, aewj aewjVar, Handler handler2) {
        this.a = handler;
        this.b = aewjVar;
        this.c = handler2;
    }

    public final void a(final String str, final afgj afgjVar) {
        this.a.post(new Runnable() { // from class: aewv
            @Override // java.lang.Runnable
            public final void run() {
                aeww aewwVar = aeww.this;
                ((aevd) aewwVar.b).b.i(str, afgjVar);
            }
        });
    }
}
