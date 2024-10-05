package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.youtube.R;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gfd implements Consumer {
    private final /* synthetic */ int v;
    public static final /* synthetic */ gfd u = new gfd(20);
    public static final /* synthetic */ gfd t = new gfd(19);
    public static final /* synthetic */ gfd s = new gfd(18);
    public static final /* synthetic */ gfd r = new gfd(17);
    public static final /* synthetic */ gfd q = new gfd(16);
    public static final /* synthetic */ gfd p = new gfd(15);
    public static final /* synthetic */ gfd o = new gfd(14);
    public static final /* synthetic */ gfd n = new gfd(13);
    public static final /* synthetic */ gfd m = new gfd(12);
    public static final /* synthetic */ gfd l = new gfd(11);
    public static final /* synthetic */ gfd k = new gfd(10);
    public static final /* synthetic */ gfd j = new gfd(9);
    public static final /* synthetic */ gfd i = new gfd(8);
    public static final /* synthetic */ gfd h = new gfd(7);
    public static final /* synthetic */ gfd g = new gfd(6);
    public static final /* synthetic */ gfd f = new gfd(5);
    public static final /* synthetic */ gfd e = new gfd(4);
    public static final /* synthetic */ gfd d = new gfd(3);
    public static final /* synthetic */ gfd c = new gfd(2);
    public static final /* synthetic */ gfd b = new gfd(1);
    public static final /* synthetic */ gfd a = new gfd(0);

    private /* synthetic */ gfd(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.v) {
            case 0:
                ((gfk) obj).b();
                return;
            case 1:
                ((aivy) obj).a();
                return;
            case 2:
                ((gfl) obj).b();
                return;
            case 3:
                ((gfl) obj).f(null);
                return;
            case 4:
                ((FloatingActionButton) obj).setVisibility(0);
                return;
            case 5:
                ((FloatingActionButton) obj).setVisibility(8);
                return;
            case 6:
                ((PaneBackStack) obj).f();
                return;
            case 7:
                ((gir) obj).aW();
                return;
            case 8:
                ((gja) obj).a();
                return;
            case 9:
                ((hax) obj).d();
                return;
            case 10:
                ((iiq) obj).s();
                return;
            case 11:
                int i2 = ijo.bC;
                ((fla) obj).e(fkw.REEL);
                return;
            case 12:
                ((iha) obj).a();
                return;
            case 13:
                ((iha) obj).a();
                return;
            case 14:
                int i3 = ivj.cs;
                ((View) obj).sendAccessibilityEvent(32);
                return;
            case 15:
                SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) obj;
                int i4 = ivj.cs;
                CharSequence text = specificNetworkErrorViewLoadingFrameLayout.a.getResources().getText(R.string.no_results_found);
                fgx fgxVar = specificNetworkErrorViewLoadingFrameLayout.b;
                fgxVar.getClass();
                fgxVar.e(text);
                specificNetworkErrorViewLoadingFrameLayout.h(4);
                return;
            case 16:
                int i5 = ivj.cs;
                ((SpecificNetworkErrorViewLoadingFrameLayout) obj).f();
                return;
            case 17:
                Cfor cfor = (Cfor) obj;
                if (!cfor.a.isEnabled() || cfor.a.b) {
                    return;
                }
                cfor.c(2);
                cfor.a();
                return;
            case 18:
                ((nky) obj).e();
                return;
            case 19:
                ((nky) obj).g();
                return;
            default:
                ((ajmi) obj).b();
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.v) {
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
}
