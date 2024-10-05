package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tuz implements tuh {
    public final vey a;
    public final trp b;
    private final Object c = new Object();
    private final Map d = new HashMap();
    private final Context e;
    private final Executor f;
    private final vcw g;
    private final vfg h;
    private final tuj i;
    private final shf j;
    private final String k;

    public tuz(Context context, Executor executor, String str, vcw vcwVar, vfg vfgVar, trp trpVar, tuj tujVar, shf shfVar, vey veyVar, byte[] bArr) {
        this.e = context;
        this.f = executor;
        this.g = vcwVar;
        this.h = vfgVar;
        this.b = trpVar;
        this.i = tujVar;
        this.j = shfVar;
        this.k = str;
        this.a = veyVar;
    }

    @Override // defpackage.tuh
    public final tug a(final Account account) {
        tug tugVar;
        synchronized (this.c) {
            if (!this.d.containsKey(account)) {
                Map map = this.d;
                vda a = vdb.a(this.e);
                a.a = "com.google.android.gms";
                a.d("managed");
                a.e("mdisync");
                a.c(account);
                a.f("profilesync/public/profile_info.pb");
                Uri a2 = a.a();
                vfg vfgVar = this.h;
                vfe a3 = vff.a();
                a3.h(new vfp(this.a));
                a3.e(tvb.a);
                a3.f(a2);
                agcm agcmVar = new agcm(vfgVar.a(a3.a()));
                tvd tvdVar = new tvd(this.f, this.g);
                final AtomicReference atomicReference = new AtomicReference(new tve() { // from class: tut
                    @Override // defpackage.tve
                    public final void i() {
                    }
                });
                final AtomicReference atomicReference2 = new AtomicReference(new tvf() { // from class: tuu
                    @Override // defpackage.tvf
                    public final void j() {
                    }
                });
                final int i = 1;
                amnv amnvVar = new amnv() { // from class: tux
                    @Override // defpackage.amnv
                    public final Object get() {
                        return i != 0 ? (tve) atomicReference.get() : (tvf) atomicReference.get();
                    }
                };
                final int i2 = 0;
                amnv amnvVar2 = new amnv() { // from class: tux
                    @Override // defpackage.amnv
                    public final Object get() {
                        return i2 != 0 ? (tve) atomicReference2.get() : (tvf) atomicReference2.get();
                    }
                };
                tvj tvjVar = new tvj(this.e, new rbx(this.e, new rbt(account)), this.k, amnvVar, amnvVar2);
                tua.a(this.e.getApplicationContext(), this.k);
                shf shfVar = this.j;
                account.toString();
                this.i.b();
                new tjy(shfVar);
                new amnv() { // from class: tuw
                    @Override // defpackage.amnv
                    public final Object get() {
                        new qlm(tuz.this.b.a, "MDI_SYNC_COMPONENTS_GAIA", account.name);
                        return new rwh();
                    }
                };
                final trp trpVar = this.b;
                final byte[] bArr = null;
                amnv amnvVar3 = new amnv(bArr) { // from class: tuv
                    @Override // defpackage.amnv
                    public final Object get() {
                        new qlm(trp.this.a, "MDI_SYNC_COMPONENTS_VERBOSE", null);
                        return new rwh();
                    }
                };
                new Random();
                tuj tujVar = this.i;
                tua.a(this.e.getApplicationContext(), this.k);
                new rwh(amnvVar3, tujVar);
                tus tusVar = new tus(tvjVar, tvdVar, agcmVar, this.i, null, null);
                if (this.i.a(this.e)) {
                    tusVar.e(new tuy(this, a2), angq.a);
                }
                atomicReference.set(tusVar);
                atomicReference2.set(tusVar);
                map.put(account, tusVar);
            }
            tugVar = (tug) this.d.get(account);
        }
        return tugVar;
    }
}
