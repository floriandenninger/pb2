package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cff implements cgb {
    final /* synthetic */ LottieAnimationView a;
    private final /* synthetic */ int b;

    public cff(LottieAnimationView lottieAnimationView, int i) {
        this.b = i;
        this.a = lottieAnimationView;
    }

    @Override // defpackage.cgb
    public final /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            Throwable th = (Throwable) obj;
            LottieAnimationView lottieAnimationView = this.a;
            int i = lottieAnimationView.c;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            cgb cgbVar = this.a.b;
            if (cgbVar == null) {
                cgbVar = LottieAnimationView.a;
            }
            cgbVar.a(th);
            return;
        }
        this.a.i((cfj) obj);
    }
}
