package defpackage;

import android.widget.TextView;
import j$.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class whr implements IntConsumer {
    public final /* synthetic */ TextView a;
    private final /* synthetic */ int b;

    public /* synthetic */ whr(TextView textView, int i) {
        this.b = i;
        this.a = textView;
    }

    @Override // j$.util.function.IntConsumer
    public final void accept(int i) {
        if (this.b != 0) {
            jm.s(this.a, i);
        } else {
            jm.s(this.a, i);
        }
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return this.b != 0 ? IntConsumer.CC.$default$andThen(this, intConsumer) : IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
