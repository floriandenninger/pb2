package defpackage;

import android.content.res.Configuration;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gjy implements fxh {
    public final gjp a;
    public final Handler b;
    public final Runnable c = new Runnable() { // from class: gjx
        @Override // java.lang.Runnable
        public final void run() {
            gjy gjyVar = gjy.this;
            Integer num = gjyVar.e;
            if (num == null) {
                return;
            }
            gjyVar.b(num.intValue());
        }
    };
    public boolean d;
    public Integer e;

    public gjy(gjp gjpVar, Handler handler) {
        this.a = gjpVar;
        this.b = handler;
    }

    public final int a() {
        return this.a.a();
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
        if (this.d) {
            Handler handler = this.b;
            handler.getClass();
            Runnable runnable = this.c;
            runnable.getClass();
            handler.post(runnable);
            return;
        }
        this.a.d(i);
    }

    @Override // defpackage.fxh
    public final void e(Configuration configuration) {
        this.a.e(configuration);
    }
}
