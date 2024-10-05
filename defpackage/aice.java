package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.TextView;
import j$.time.Duration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aice {
    public aicr b;
    public aicr c;
    public final View d;
    public final aicg e;
    public boolean f;
    public TextView g;
    public boolean h;
    public yzr i;
    private static final Duration j = Duration.ofMillis(200);
    private static final Duration k = Duration.ofMillis(200);
    private static final Duration l = Duration.ofMillis(200);
    public static final Duration a = Duration.ofSeconds(1);

    public aice(View view, aicg aicgVar) {
        this.d = view;
        this.e = aicgVar;
    }

    public final aicr a(int i, int i2, int i3) {
        aicq a2 = aicr.a();
        a2.c(j);
        Duration duration = l;
        a2.b(amru.t(aicp.a(0.0f, 1.0f, duration), aicp.a(1.0f, 1.0f, k), aicp.a(1.0f, 0.0f, duration)));
        a2.d(amru.t(this.d.findViewById(i), this.d.findViewById(i2), this.d.findViewById(i3)));
        a2.a = new aicd(this);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.f) {
            AnimatorSet animatorSet = this.b.a;
            if (animatorSet == null || !animatorSet.isStarted()) {
                this.b.c();
                this.c.c();
            }
        }
    }
}
