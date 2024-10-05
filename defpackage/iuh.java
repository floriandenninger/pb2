package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iuh implements Consumer {
    public final /* synthetic */ ivj a;
    private final /* synthetic */ int b;

    public /* synthetic */ iuh(ivj ivjVar, int i) {
        this.b = i;
        this.a = ivjVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                this.a.bi((cnq) obj);
                return;
            case 1:
                ((View) obj).setAccessibilityPaneTitle(this.a.af);
                return;
            case 2:
                ivj ivjVar = this.a;
                SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) obj;
                acra acraVar = ivjVar.bT;
                FrameLayout frameLayout = specificNetworkErrorViewLoadingFrameLayout.d;
                if (frameLayout != null) {
                    specificNetworkErrorViewLoadingFrameLayout.removeView(frameLayout);
                    specificNetworkErrorViewLoadingFrameLayout.c();
                    fgu fguVar = specificNetworkErrorViewLoadingFrameLayout.e;
                    fguVar.getClass();
                    fguVar.a(acraVar);
                    FrameLayout frameLayout2 = specificNetworkErrorViewLoadingFrameLayout.d;
                    frameLayout2.getClass();
                    frameLayout2.setVisibility(0);
                }
                specificNetworkErrorViewLoadingFrameLayout.i(new ivg(ivjVar));
                return;
            case 3:
                ((gej) obj).b = yjk.L(this.a.qW()) * 5;
                return;
            case 4:
                ivj ivjVar2 = this.a;
                ((gej) obj).a((apxf) ivjVar2.bP.get(), ivjVar2.q(), ivjVar2.aV, ivjVar2.bq, ivjVar2.qR(), yjk.L(ivjVar2.qW()));
                return;
            case 5:
                this.a.aF((iuz) obj);
                return;
            case 6:
                ivj ivjVar3 = this.a;
                nky nkyVar = (nky) obj;
                nkyVar.b = ivjVar3;
                nkyVar.c = ivjVar3;
                nkyVar.d = ivjVar3;
                if (ivjVar3.X.b.a(aoe.STARTED)) {
                    nkyVar.e();
                    return;
                }
                return;
            case 7:
                this.a.mM().u((acqx) obj, null);
                return;
            default:
                ivj ivjVar4 = this.a;
                ivjVar4.aA = new fzr((CharSequence) Optional.ofNullable(ivjVar4.af).orElse(""), (amsx) obj);
                ivjVar4.aZ(ivjVar4.aB);
                return;
        }
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
            case 7:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }
}
