package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xok implements Runnable {
    public final /* synthetic */ Animator a;
    private final /* synthetic */ int b;

    public /* synthetic */ xok(Animator animator, int i) {
        this.b = i;
        this.a = animator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.start();
        } else {
            this.a.start();
        }
    }
}
