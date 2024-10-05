package defpackage;

import android.animation.Animator;
import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aicq {
    public Animator.AnimatorListener a;
    private Duration b;
    private amru c;
    private amru d;

    public final aicr a() {
        amru amruVar;
        amru amruVar2;
        Duration duration = this.b;
        if (duration == null || (amruVar = this.c) == null || (amruVar2 = this.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" delayBetweenAnimationsInSequence");
            }
            if (this.c == null) {
                sb.append(" views");
            }
            if (this.d == null) {
                sb.append(" animationSteps");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aicr(duration, amruVar, amruVar2, this.a);
    }

    public final void b(List list) {
        this.d = amru.o(list);
    }

    public final void c(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null delayBetweenAnimationsInSequence");
        }
        this.b = duration;
    }

    public final void d(List list) {
        this.c = amru.o(list);
    }
}
