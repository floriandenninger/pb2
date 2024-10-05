package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bj implements ain {
    final /* synthetic */ Animator a;
    final /* synthetic */ en b;

    public bj(Animator animator, en enVar) {
        this.a = animator;
        this.b = enVar;
    }

    @Override // defpackage.ain
    public final void a() {
        this.a.end();
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animator from operation ");
            sb.append(this.b);
            sb.append(" has been canceled.");
        }
    }
}
