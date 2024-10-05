package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ghz implements Consumer {
    public final /* synthetic */ gie a;
    private final /* synthetic */ int b;

    public /* synthetic */ ghz(gie gieVar, int i) {
        this.b = i;
        this.a = gieVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            final String str = (String) obj;
            final abbx abbxVar = ((gjh) this.a.b.get()).a;
            abbxVar.c.execute(new Runnable() { // from class: abbw
                @Override // java.lang.Runnable
                public final void run() {
                    abbx abbxVar2 = abbx.this;
                    abbxVar2.a.e(str);
                }
            });
        } else {
            Pane pane = (Pane) obj;
            this.a.a.put(pane.a, pane);
        }
    }
}
