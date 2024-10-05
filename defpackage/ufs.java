package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ufs extends wv {
    public final AccountParticle t;
    public final ammv u;
    public final ammv v;

    public ufs(AccountParticle accountParticle, tyo tyoVar, ued uedVar, ammv ammvVar, boolean z, ammv ammvVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(accountParticle);
        this.t = accountParticle;
        this.u = ammvVar2;
        this.v = ammvVar;
        AccountParticleDisc accountParticleDisc = accountParticle.j;
        uec uecVar = new uec() { // from class: ufq
            @Override // defpackage.uec
            public final void a() {
                ufs.this.E();
            }
        };
        accountParticle.addOnAttachStateChangeListener(new ufr(this, accountParticleDisc, uecVar));
        if (jw.aj(accountParticle)) {
            accountParticleDisc.c(uecVar);
            E();
        }
        if (z != accountParticleDisc.e) {
            amkq.O(!accountParticleDisc.f(), "setAllowRings is only allowed before calling initialize.");
            accountParticleDisc.e = z;
        }
        accountParticle.j.g(uedVar, tyoVar);
        accountParticle.i = new ufe(accountParticle, tyoVar, ammvVar2, null, null, null, null);
    }

    public final void E() {
        String str;
        if (this.t.j.g == null) {
            this.a.setContentDescription(null);
            return;
        }
        View view = this.a;
        Context context = view.getContext();
        Object[] objArr = new Object[1];
        ufe ufeVar = this.t.i;
        AccountParticleDisc accountParticleDisc = ufeVar.b;
        tyo tyoVar = ufeVar.d;
        Object obj = accountParticleDisc.g;
        if (obj == null) {
            str = "";
        } else {
            String ah = tyo.ah(obj);
            String b = accountParticleDisc.b();
            if (b.isEmpty()) {
                str = ah;
            } else {
                String valueOf = String.valueOf(ah);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + b.length());
                sb.append(valueOf);
                sb.append("\n");
                sb.append(b);
                str = sb.toString();
            }
        }
        ammv ammvVar = ufeVar.c;
        objArr[0] = str;
        view.setContentDescription(context.getString(R.string.og_use_account_a11y_no_period, objArr));
    }
}
