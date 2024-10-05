package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfg implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ LottieAnimationView b;

    public cfg(LottieAnimationView lottieAnimationView, int i) {
        this.b = lottieAnimationView;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        LottieAnimationView lottieAnimationView = this.b;
        boolean z = lottieAnimationView.e;
        Context context = lottieAnimationView.getContext();
        if (!z) {
            return cfq.f(context, this.a, null);
        }
        int i = this.a;
        return cfq.f(context, i, cfq.n(context, i));
    }
}
