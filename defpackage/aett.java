package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aett {
    public final amnv a;
    public final amnv b;
    public final aetw c;
    public final Handler d;
    public boolean e;
    public Runnable f;

    public aett(Handler handler, aetw aetwVar, amnv amnvVar, amnv amnvVar2) {
        this.d = handler;
        this.c = aetwVar;
        this.a = amnvVar;
        this.b = amnvVar2;
    }

    public final void a() {
        Runnable runnable = this.f;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.f = null;
        }
        if (this.e) {
            return;
        }
        this.e = true;
        this.d.postDelayed(new aets(this, 1), 1000L);
    }
}
