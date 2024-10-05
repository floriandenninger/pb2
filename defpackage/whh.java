package defpackage;

import android.content.res.ColorStateList;
import android.widget.TextView;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class whh implements Consumer {
    public final /* synthetic */ TextView a;
    private final /* synthetic */ int b;

    public /* synthetic */ whh(TextView textView, int i) {
        this.b = i;
        this.a = textView;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.setTextColor((ColorStateList) obj);
        } else if (i != 1) {
            this.a.setTextColor((ColorStateList) obj);
        } else {
            this.a.setTextColor((ColorStateList) obj);
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
