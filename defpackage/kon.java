package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kon implements Consumer {
    public final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public /* synthetic */ kon(View view, int i) {
        this.b = i;
        this.a = view;
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
            ((fna) obj).t(this.a);
        } else if (i == 1) {
            ((fna) obj).g(this.a);
        } else {
            TextView textView = (TextView) obj;
            textView.setMaxWidth(this.a.getLayoutParams().width);
            yny.z(textView, yny.x(-2), ViewGroup.LayoutParams.class);
        }
    }
}
