package defpackage;

import android.graphics.drawable.Animatable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class oa extends of {
    private final Animatable a;

    public oa(Animatable animatable) {
        this.a = animatable;
    }

    @Override // defpackage.of
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.of
    public final void b() {
        this.a.stop();
    }
}
