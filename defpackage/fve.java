package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fve implements View.OnClickListener {
    public final ImageView a;
    private final ajut b;
    private final akbu c;
    private avae d;
    private acra e;
    private final SubscriptionNotificationOptionsDialogFragmentControllerImpl f;
    private final aoae g;

    public fve(SubscriptionNotificationOptionsDialogFragmentControllerImpl subscriptionNotificationOptionsDialogFragmentControllerImpl, ajut ajutVar, akbu akbuVar, aoae aoaeVar, ImageView imageView, byte[] bArr) {
        this.f = subscriptionNotificationOptionsDialogFragmentControllerImpl;
        this.b = ajutVar;
        this.c = akbuVar;
        this.g = aoaeVar;
        this.a = imageView;
        imageView.setOnClickListener(this);
    }

    public final void a() {
        this.a.setVisibility(8);
    }

    public final void c() {
        arej arejVar;
        if (this.d == null) {
            return;
        }
        this.a.setVisibility(0);
        avae avaeVar = this.d;
        if ((avaeVar.b & 128) != 0) {
            akbu akbuVar = this.c;
            avad avadVar = avaeVar.j;
            if (avadVar == null) {
                avadVar = avad.a;
            }
            if (avadVar.b == 102716411) {
                arejVar = (arej) avadVar.c;
            } else {
                arejVar = arej.a;
            }
            ImageView imageView = this.a;
            avad avadVar2 = this.d.j;
            if (avadVar2 == null) {
                avadVar2 = avad.a;
            }
            akbuVar.b(arejVar, imageView, avadVar2, this.e);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        avae avaeVar = this.d;
        if (avaeVar != null) {
            acra acraVar = this.e;
            if (acraVar != null && (avaeVar.b & 4) != 0) {
                acraVar.I(3, new acqx(avaeVar.e), null);
            }
            this.f.g(this.d);
        }
    }

    public final void b(avae avaeVar, acra acraVar) {
        this.d = avaeVar;
        this.e = acraVar;
        if (avaeVar == null || (avaeVar.b & 16) == 0) {
            a();
            return;
        }
        if (acraVar != null) {
            acraVar.u(new acqx(avaeVar.e), null);
        }
        ImageView imageView = this.a;
        ajut ajutVar = this.b;
        arfs arfsVar = avaeVar.g;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        imageView.setImageResource(ajutVar.a(b));
        aott aottVar = avaeVar.k;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((aottVar.b & 1) == 0) {
            this.a.setContentDescription(null);
        } else {
            ImageView imageView2 = this.a;
            aott aottVar2 = avaeVar.k;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar = aottVar2.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            imageView2.setContentDescription(aotsVar.c);
        }
        c();
        this.g.c(avaeVar, this.a);
    }
}
