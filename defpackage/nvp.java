package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nvp implements Consumer {
    private final /* synthetic */ int k;
    public static final /* synthetic */ nvp j = new nvp(11);
    public static final /* synthetic */ nvp i = new nvp(10);
    public static final /* synthetic */ nvp h = new nvp(8);
    public static final /* synthetic */ nvp g = new nvp(6);
    public static final /* synthetic */ nvp f = new nvp(5);
    public static final /* synthetic */ nvp e = new nvp(4);
    public static final /* synthetic */ nvp d = new nvp(3);
    public static final /* synthetic */ nvp c = new nvp(2);
    public static final /* synthetic */ nvp b = new nvp(1);
    public static final /* synthetic */ nvp a = new nvp(0);

    public /* synthetic */ nvp(int i2) {
        this.k = i2;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.k) {
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
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.k) {
            case 0:
                ((nvk) obj).s();
                return;
            case 1:
                ((nvk) obj).lo();
                return;
            case 2:
                ((PivotBar) obj).lf();
                return;
            case 3:
                ((PivotBar) obj).m(-1, false);
                return;
            case 4:
                ((PivotBar) obj).setVisibility(8);
                return;
            case 5:
                ((PivotBar) obj).c = true;
                return;
            case 6:
                ((View) obj).clearAnimation();
                return;
            case 7:
                int i2 = yzm.g;
                return;
            case 8:
                ((acyp) obj).b();
                return;
            case 9:
                afsi.c(2, 27, "Error found with DfeStackSampler Polling", (Throwable) obj);
                return;
            case 10:
                afsi.c(2, 27, "Error found with AppProfiler", (Throwable) obj);
                return;
            default:
                return;
        }
    }
}
