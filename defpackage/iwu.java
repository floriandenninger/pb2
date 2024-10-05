package defpackage;

import android.view.View;
import android.widget.EdgeEffect;
import j$.util.function.Consumer;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iwu implements Consumer {
    private final /* synthetic */ int t;
    public static final /* synthetic */ iwu s = new iwu(20);
    public static final /* synthetic */ iwu r = new iwu(19);
    public static final /* synthetic */ iwu q = new iwu(18);
    public static final /* synthetic */ iwu p = new iwu(17);
    public static final /* synthetic */ iwu o = new iwu(16);
    public static final /* synthetic */ iwu n = new iwu(15);
    public static final /* synthetic */ iwu m = new iwu(14);
    public static final /* synthetic */ iwu l = new iwu(13);
    public static final /* synthetic */ iwu k = new iwu(12);
    public static final /* synthetic */ iwu j = new iwu(11);
    public static final /* synthetic */ iwu i = new iwu(10);
    public static final /* synthetic */ iwu h = new iwu(9);
    public static final /* synthetic */ iwu g = new iwu(8);
    public static final /* synthetic */ iwu f = new iwu(7);
    public static final /* synthetic */ iwu e = new iwu(5);
    public static final /* synthetic */ iwu d = new iwu(4);
    public static final /* synthetic */ iwu c = new iwu(2);
    public static final /* synthetic */ iwu b = new iwu(1);
    public static final /* synthetic */ iwu a = new iwu(0);

    public /* synthetic */ iwu(int i2) {
        this.t = i2;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.t) {
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
            case 7:
                return Consumer.CC.$default$andThen(this, consumer);
            case 8:
                return Consumer.CC.$default$andThen(this, consumer);
            case 9:
                return Consumer.CC.$default$andThen(this, consumer);
            case 10:
                return Consumer.CC.$default$andThen(this, consumer);
            case 11:
                return Consumer.CC.$default$andThen(this, consumer);
            case 12:
                return Consumer.CC.$default$andThen(this, consumer);
            case 13:
                return Consumer.CC.$default$andThen(this, consumer);
            case 14:
                return Consumer.CC.$default$andThen(this, consumer);
            case 15:
                return Consumer.CC.$default$andThen(this, consumer);
            case 16:
                return Consumer.CC.$default$andThen(this, consumer);
            case 17:
                return Consumer.CC.$default$andThen(this, consumer);
            case 18:
                return Consumer.CC.$default$andThen(this, consumer);
            case 19:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.t) {
            case 0:
                whu.C(((View) obj).findFocus());
                return;
            case 1:
                int i2 = ivj.cs;
                ((ScheduledFuture) obj).cancel(true);
                return;
            case 2:
                ((kdj) obj).a(null);
                return;
            case 3:
                ((fna) obj).kP();
                return;
            case 4:
                ((fna) obj).h();
                return;
            case 5:
                ((fna) obj).l();
                return;
            case 6:
                ((fna) obj).sendAccessibilityEvent(4);
                return;
            case 7:
                ((lu) obj).j(true);
                return;
            case 8:
                ((EdgeEffect) obj).finish();
                return;
            case 9:
                ((EdgeEffect) obj).onRelease();
                return;
            case 10:
                ((nlm) obj).bg();
                return;
            case 11:
                ((nlo) obj).bh();
                return;
            case 12:
                ((nlo) obj).bh();
                return;
            case 13:
                ((nlo) obj).bh();
                return;
            case 14:
                ((nlo) obj).bh();
                return;
            case 15:
                ((nvg) obj).lo();
                return;
            case 16:
                ((nvg) obj).q();
                return;
            case 17:
                ((nvg) obj).r();
                return;
            case 18:
                return;
            case 19:
                ((nvk) obj).oT();
                return;
            default:
                ((nvk) obj).q();
                return;
        }
    }
}
