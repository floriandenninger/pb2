package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.youtube.R;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnb extends Handler {
    final /* synthetic */ adnd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adnb(adnd adndVar, Looper looper) {
        super(looper);
        this.a = adndVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 3) {
            if (this.a.ac()) {
                int a = this.a.j.a();
                if (a == 2 || a == 1) {
                    this.a.j.j(true);
                }
                String valueOf = String.valueOf(this.a.x.e);
                if (valueOf.length() != 0) {
                    "Connecting to ".concat(valueOf);
                }
                adnd adndVar = this.a;
                adfw ao = adndVar.ao(adndVar.x);
                if (ao == null || !(ao.i() || ao.b.isPresent())) {
                    String str = adnd.a;
                    String valueOf2 = String.valueOf(this.a.x.e);
                    zga.c(str, valueOf2.length() != 0 ? "Couldn't obtain token for ".concat(valueOf2) : new String("Couldn't obtain token for "));
                    this.a.aP(atbi.MDX_SESSION_DISCONNECT_REASON_CLOUD_NO_LOUNGE_TOKEN, Optional.empty());
                    return;
                }
                adnd adndVar2 = this.a;
                int i2 = adndVar2.w.aq.i;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 != 3) {
                    adndVar2.ao.e(11);
                }
                adnd adndVar3 = this.a;
                adndVar3.as(ao, adndVar3.F);
                return;
            }
            return;
        }
        if (i == 4) {
            if (this.a.aG()) {
                return;
            }
            String valueOf3 = String.valueOf(this.a.x.e);
            if (valueOf3.length() != 0) {
                "Disconnecting from ".concat(valueOf3);
            }
            boolean z = ((ansv) message.obj).a;
            if (z && !this.a.ae()) {
                adnd adndVar4 = this.a;
                if (adndVar4.t) {
                    whu.L(this.a.e, adndVar4.e.getString(R.string.shared_queue_disconnect_toast), 1);
                }
            }
            adnd adndVar5 = this.a;
            adndVar5.ar(adndVar5.e, z);
            final boolean z2 = z && this.a.ae();
            this.a.aD(2);
            this.a.o.c("c_d");
            this.a.g.d(new acxv());
            this.a.p.c("mdx_off");
            this.a.az();
            if (this.a.w.aq.i == 4) {
                return;
            }
            final ConditionVariable conditionVariable = new ConditionVariable();
            yjk.e();
            this.a.f.post(new Runnable() { // from class: adna
                @Override // java.lang.Runnable
                public final void run() {
                    adnb adnbVar = adnb.this;
                    boolean z3 = z2;
                    ConditionVariable conditionVariable2 = conditionVariable;
                    adnbVar.a.w.ax(z3);
                    conditionVariable2.open();
                }
            });
            conditionVariable.block();
            return;
        }
        if (i != 5) {
            if (i != 6) {
                return;
            }
            adnd adndVar6 = this.a;
            adndVar6.K = 2;
            adndVar6.ar(adndVar6.e, false);
            this.a.az();
            return;
        }
        if (this.a.aG() || this.a.aH()) {
            return;
        }
        this.a.aD(3);
        String valueOf4 = String.valueOf(this.a.x.e);
        if (valueOf4.length() != 0) {
            "Received gracefulReconnect from ".concat(valueOf4);
        }
        adnd adndVar7 = this.a;
        adndVar7.ar(adndVar7.e, false);
        this.a.j.g();
        String valueOf5 = String.valueOf(this.a.x.e);
        if (valueOf5.length() != 0) {
            "Reconnecting to ".concat(valueOf5);
        }
        adnd adndVar8 = this.a;
        adfw ao2 = adndVar8.ao(adndVar8.x);
        if (ao2 == null || !ao2.i()) {
            String str2 = adnd.a;
            String valueOf6 = String.valueOf(this.a.x.e);
            zga.c(str2, valueOf6.length() != 0 ? "Couldn't obtain token for ".concat(valueOf6) : new String("Couldn't obtain token for "));
            this.a.aP(atbi.MDX_SESSION_DISCONNECT_REASON_CLOUD_NO_LOUNGE_TOKEN, Optional.empty());
            return;
        }
        adnd adndVar9 = this.a;
        adndVar9.as(ao2, adndVar9.F);
    }
}
