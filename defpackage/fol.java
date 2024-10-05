package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fol extends EdgeEffect {
    private final EdgeEffect a;

    public fol(Context context, EdgeEffect edgeEffect) {
        super(context);
        this.a = edgeEffect;
    }

    @Override // android.widget.EdgeEffect
    public final void finish() {
        super.finish();
        this.a.finish();
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        this.a.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        this.a.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final float onPullDistance(float f, float f2) {
        this.a.onPullDistance(f, f2);
        return super.onPullDistance(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        this.a.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        this.a.onPull(f, f2);
    }
}
