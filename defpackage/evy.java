package defpackage;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import j$.util.function.Function;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class evy implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ evy u = new evy(20);
    public static final /* synthetic */ evy t = new evy(19);
    public static final /* synthetic */ evy s = new evy(18);
    public static final /* synthetic */ evy r = new evy(17);
    public static final /* synthetic */ evy q = new evy(16);
    public static final /* synthetic */ evy p = new evy(15);
    public static final /* synthetic */ evy o = new evy(14);
    public static final /* synthetic */ evy n = new evy(13);
    public static final /* synthetic */ evy m = new evy(12);
    public static final /* synthetic */ evy l = new evy(11);
    public static final /* synthetic */ evy k = new evy(10);
    public static final /* synthetic */ evy j = new evy(9);
    public static final /* synthetic */ evy i = new evy(8);
    public static final /* synthetic */ evy h = new evy(7);
    public static final /* synthetic */ evy g = new evy(6);
    public static final /* synthetic */ evy f = new evy(5);
    public static final /* synthetic */ evy e = new evy(4);
    public static final /* synthetic */ evy d = new evy(3);
    public static final /* synthetic */ evy c = new evy(2);
    public static final /* synthetic */ evy b = new evy(1);
    public static final /* synthetic */ evy a = new evy(0);

    private /* synthetic */ evy(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return aacj.a(obj);
            case 1:
                return ((ammv) obj).c();
            case 2:
                return ((iiq) obj).o();
            case 3:
                return ((aqoq) obj).getSmartDownloadsOptInBannerVisibility();
            case 4:
                return (aiml) ((azrw) obj).get();
            case 5:
                return ((mkb) obj).a.h().Y(gpd.j);
            case 6:
                return ((ViewStub) obj).inflate();
            case 7:
                return (apkd[]) ((List) obj).toArray(new apkd[0]);
            case 8:
                return Boolean.valueOf(((FloatingActionButton) obj).getVisibility() != 0);
            case 9:
                arfr b2 = arfr.b(((arfs) obj).c);
                return b2 == null ? arfr.UNKNOWN : b2;
            case 10:
                return Boolean.valueOf(((ObjectAnimator) obj).isRunning());
            case 11:
                return ((gfb) obj).e();
            case 12:
                return ((gfb) obj).c();
            case 13:
                View view = ((gnc) obj).a;
                return null;
            case 14:
                return ((gfb) obj).d();
            case 15:
                return Integer.valueOf(((Bundle) obj).getInt("activePaneKey"));
            case 16:
                return ((Bundle) obj).getSparseParcelableArray("panes");
            case 17:
                return ((Bundle) obj).getIntegerArrayList("tabBackStack");
            case 18:
                return ((Pane) obj).b;
            case 19:
                return ((Pane) obj).c;
            default:
                return ((Pane) obj).d;
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                return Function.CC.$default$andThen(this, function);
            case 1:
                return Function.CC.$default$andThen(this, function);
            case 2:
                return Function.CC.$default$andThen(this, function);
            case 3:
                return Function.CC.$default$andThen(this, function);
            case 4:
                return Function.CC.$default$andThen(this, function);
            case 5:
                return Function.CC.$default$andThen(this, function);
            case 6:
                return Function.CC.$default$andThen(this, function);
            case 7:
                return Function.CC.$default$andThen(this, function);
            case 8:
                return Function.CC.$default$andThen(this, function);
            case 9:
                return Function.CC.$default$andThen(this, function);
            case 10:
                return Function.CC.$default$andThen(this, function);
            case 11:
                return Function.CC.$default$andThen(this, function);
            case 12:
                return Function.CC.$default$andThen(this, function);
            case 13:
                return Function.CC.$default$andThen(this, function);
            case 14:
                return Function.CC.$default$andThen(this, function);
            case 15:
                return Function.CC.$default$andThen(this, function);
            case 16:
                return Function.CC.$default$andThen(this, function);
            case 17:
                return Function.CC.$default$andThen(this, function);
            case 18:
                return Function.CC.$default$andThen(this, function);
            case 19:
                return Function.CC.$default$andThen(this, function);
            default:
                return Function.CC.$default$andThen(this, function);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return Function.CC.$default$compose(this, function);
            case 1:
                return Function.CC.$default$compose(this, function);
            case 2:
                return Function.CC.$default$compose(this, function);
            case 3:
                return Function.CC.$default$compose(this, function);
            case 4:
                return Function.CC.$default$compose(this, function);
            case 5:
                return Function.CC.$default$compose(this, function);
            case 6:
                return Function.CC.$default$compose(this, function);
            case 7:
                return Function.CC.$default$compose(this, function);
            case 8:
                return Function.CC.$default$compose(this, function);
            case 9:
                return Function.CC.$default$compose(this, function);
            case 10:
                return Function.CC.$default$compose(this, function);
            case 11:
                return Function.CC.$default$compose(this, function);
            case 12:
                return Function.CC.$default$compose(this, function);
            case 13:
                return Function.CC.$default$compose(this, function);
            case 14:
                return Function.CC.$default$compose(this, function);
            case 15:
                return Function.CC.$default$compose(this, function);
            case 16:
                return Function.CC.$default$compose(this, function);
            case 17:
                return Function.CC.$default$compose(this, function);
            case 18:
                return Function.CC.$default$compose(this, function);
            case 19:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }
}
