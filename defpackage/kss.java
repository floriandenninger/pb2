package defpackage;

import android.widget.EdgeEffect;
import android.widget.TextView;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kss implements Consumer {
    public final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public /* synthetic */ kss(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((TextView) ((yzr) obj).b).setAlpha(this.a);
        } else if (i == 1) {
            ((fna) obj).setAlpha(this.a);
        } else {
            float f = this.a;
            int i2 = njw.b;
            ((EdgeEffect) obj).onPull(f);
        }
    }
}
