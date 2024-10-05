package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class knr implements Consumer {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ knr(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i == 0) {
            return Consumer.CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return Consumer.CC.$default$andThen(this, consumer);
        }
        if (i != 2) {
            return i != 3 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        TimelineMarker[] m;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                int i2 = ivj.cs;
                ((gej) obj).a = this.a;
                return;
            } else if (i == 2) {
                ((fna) obj).p(this.a);
                return;
            } else if (i == 3) {
                ((fna) obj).setClickable(this.a);
                return;
            } else {
                ((fna) obj).s(this.a);
                return;
            }
        }
        boolean z = this.a;
        aica aicaVar = (aica) obj;
        if (aicaVar.i == null) {
            return;
        }
        aibx aibxVar = aicaVar.d;
        if (!aibxVar.c || (m = aibxVar.a.m(ahyo.CHAPTER)) == null || m.length == 0) {
            aicaVar.i.f(z);
            if (z) {
                aicaVar.a.u(new acqx(acsb.c(28244)), null);
                return;
            } else {
                aicaVar.a.q(new acqx(acsb.c(28244)), null);
                return;
            }
        }
        aicaVar.i.g(z, 1);
    }
}
