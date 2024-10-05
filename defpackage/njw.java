package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EdgeEffect;
import j$.util.function.Consumer;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class njw extends EdgeEffect {
    public static final /* synthetic */ int b = 0;
    public final WeakHashMap a;

    public njw(Context context) {
        super(context);
        this.a = new WeakHashMap();
    }

    private final void a(Consumer consumer) {
        for (Map.Entry entry : this.a.entrySet()) {
            View view = (View) entry.getKey();
            EdgeEffect edgeEffect = (EdgeEffect) ((WeakReference) entry.getValue()).get();
            if (edgeEffect != null) {
                consumer.accept(edgeEffect);
                view.invalidate();
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public final void finish() {
        super.finish();
        a(iwu.g);
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        a(new kot(i, 5));
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        a(new kss(f, 2));
    }

    @Override // android.widget.EdgeEffect
    public final float onPullDistance(float f, float f2) {
        a(new njv(f, f2, 0));
        return super.onPullDistance(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        a(iwu.h);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        a(new njv(f, f2, 1));
    }
}
