package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.RingView;
import com.google.android.libraries.onegoogle.account.disc.RoundBorderImageView;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ufe {
    public final TextView a;
    public final AccountParticleDisc b;
    public final ammv c;
    public final tyo d;
    private final TextView e;
    private final TextView f;

    public ufe(uff uffVar, tyo tyoVar, ammv ammvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = uffVar.h();
        this.e = uffVar.f();
        this.f = uffVar.g();
        this.a = uffVar.e();
        tyoVar.getClass();
        this.d = tyoVar;
        this.c = ammvVar;
    }

    private static String b(String str) {
        return str.replace('-', (char) 8209);
    }

    private static String c(String str) {
        if (str != null) {
            return ammx.b(str.trim());
        }
        return null;
    }

    public final void a(final Object obj) {
        String c = c(tyo.aa(obj));
        String c2 = c(tyo.Y(obj));
        if (c == null) {
            c = c2;
        }
        if (true == uqq.p(c, c2)) {
            c2 = null;
        }
        c.getClass();
        this.e.setText(b(c));
        if (c2 != null) {
            this.f.setText(b(c2));
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        if (this.a != null) {
            this.f.getVisibility();
            this.a.setVisibility(8);
        }
        final AccountParticleDisc accountParticleDisc = this.b;
        tyo.M(new Runnable() { // from class: ueb
            @Override // java.lang.Runnable
            public final void run() {
                ammv ammvVar;
                uet uetVar;
                AccountParticleDisc accountParticleDisc2 = AccountParticleDisc.this;
                Object obj2 = obj;
                amkq.O(accountParticleDisc2.f(), "initialize must be called first");
                Object obj3 = accountParticleDisc2.g;
                if (obj2 == null || obj3 == null ? obj2 != obj3 : !tyo.X(obj2).equals(tyo.X(obj3))) {
                    accountParticleDisc2.e();
                }
                accountParticleDisc2.g = obj2;
                uez uezVar = accountParticleDisc2.c;
                uqq.j();
                for (ueu ueuVar : uezVar.a) {
                    Object obj4 = uezVar.b;
                    if (obj4 != null) {
                        ueuVar.a(obj4).a.remove(uezVar.c);
                    }
                    uezVar.a(ueuVar, obj2);
                }
                uezVar.b = obj2;
                uqq.j();
                if (accountParticleDisc2.e) {
                    uez uezVar2 = accountParticleDisc2.c;
                    uqq.j();
                    if (uezVar2.b != null) {
                        Iterator it = uezVar2.a.iterator();
                        while (it.hasNext()) {
                            Object obj5 = ((ueu) it.next()).a(uezVar2.b).b;
                            if (obj5 != null) {
                                ammvVar = ammv.j(obj5);
                                break;
                            }
                        }
                    }
                }
                ammvVar = amlr.a;
                accountParticleDisc2.h = ammvVar;
                ufd ufdVar = accountParticleDisc2.d;
                if (ufdVar != null) {
                    ammv ammvVar2 = accountParticleDisc2.h;
                    uqq.j();
                    RingView ringView = ufdVar.a;
                    if (ammvVar2.h()) {
                        uetVar = new uet(new ufa(new ufb(ufdVar.a.getResources())));
                    } else {
                        uetVar = null;
                    }
                    ringView.setImageDrawable(uetVar);
                    uqq.j();
                }
                RoundBorderImageView roundBorderImageView = accountParticleDisc2.a;
                uqq.j();
                if (obj2 == null) {
                    roundBorderImageView.a();
                } else {
                    roundBorderImageView.b = accountParticleDisc2.a() - 2;
                    roundBorderImageView.b();
                }
                ued uedVar = accountParticleDisc2.f;
                uqq.j();
                Context context = roundBorderImageView.getContext();
                int i = 1;
                if (!uer.c.getAndSet(true)) {
                    context.getApplicationContext().registerComponentCallbacks(uer.d);
                }
                uer uerVar = (uer) uedVar;
                uix uixVar = uerVar.f;
                Executor executor = uerVar.e;
                tyo tyoVar = uerVar.g;
                ueq ueqVar = new ueq(obj2, uixVar, roundBorderImageView, executor);
                uer.a(roundBorderImageView, ueqVar);
                uerVar.e.execute(new uem(ueqVar, i));
                Iterator it2 = accountParticleDisc2.b.iterator();
                while (it2.hasNext()) {
                    ((uec) it2.next()).a();
                }
            }
        });
    }
}
