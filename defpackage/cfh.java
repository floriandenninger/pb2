package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfh implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ LottieAnimationView b;

    public cfh(LottieAnimationView lottieAnimationView, String str) {
        this.b = lottieAnimationView;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        LottieAnimationView lottieAnimationView = this.b;
        boolean z = lottieAnimationView.e;
        Context context = lottieAnimationView.getContext();
        return z ? cfq.a(context, this.a) : cfq.b(context, this.a, null);
    }
}
