package defpackage;

import android.widget.EdgeEffect;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kot implements Consumer {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ kot(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            case 1:
                return Consumer.CC.$default$andThen(this, consumer);
            case 2:
                return Consumer.CC.$default$andThen(this, consumer);
            case 3:
                return Consumer.CC.$default$andThen(this, consumer);
            case 4:
                return Consumer.CC.$default$andThen(this, consumer);
            case 5:
                return Consumer.CC.$default$andThen(this, consumer);
            case 6:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((fna) obj).m(this.a);
                return;
            case 1:
                ((fna) obj).A(this.a);
                return;
            case 2:
                ((fna) obj).n(this.a);
                return;
            case 3:
                ((fna) obj).u(this.a);
                return;
            case 4:
                ((fna) obj).w(this.a);
                return;
            case 5:
                int i = this.a;
                int i2 = njw.b;
                ((EdgeEffect) obj).onAbsorb(i);
                return;
            case 6:
                ((PivotBar) obj).g(this.a, false, 0);
                return;
            default:
                ((PivotBar) obj).h(this.a);
                return;
        }
    }
}
