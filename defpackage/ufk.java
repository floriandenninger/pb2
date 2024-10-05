package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.onegoogle.accountmanagement.AccountsModelUpdater;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ufk implements anhh {
    final /* synthetic */ AccountsModelUpdater a;

    public ufk(AccountsModelUpdater accountsModelUpdater) {
        this.a = accountsModelUpdater;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Object obj2;
        boolean aV;
        udz udzVar;
        String str;
        String str2;
        amru amruVar = (amru) obj;
        uin uinVar = (uin) this.a.b;
        ufn ufnVar = uinVar.a;
        String.format(Locale.US, "setAvailableAccounts() %d -> %d.", Integer.valueOf(((amvj) ufnVar.d()).c), Integer.valueOf(amruVar.size()));
        amrp amrpVar = new amrp();
        Iterator it = amruVar.iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                String Y = tyo.Y(next);
                String aa = tyo.aa(next);
                str = ((ugh) next).d;
                String str3 = ((ugh) next).e;
                str2 = ((ugh) next).g;
                obj2 = new udz(next, Y, aa, str, str3, str2, tyo.ab(next));
            }
            amrpVar.h(obj2);
        }
        amru g = amrpVar.g();
        synchronized (ufnVar.b) {
            aV = amkq.aV(ufnVar.e, g);
        }
        if (aV) {
            ufnVar.f();
        } else {
            HashMap hashMap = new HashMap();
            int i = ((amvj) g).c;
            for (int i2 = 0; i2 < i; i2++) {
                udz udzVar2 = (udz) g.get(i2);
                hashMap.put(tyo.X(udzVar2.a), udzVar2);
            }
            synchronized (ufnVar.b) {
                ufnVar.d();
                Map map = ufnVar.c;
                ufm ufmVar = ufm.a;
                if (!ufmVar.b) {
                    if (ufmVar.c != -1) {
                        if (SystemClock.elapsedRealtime() - ufmVar.c >= 5000) {
                        }
                    }
                    udzVar = (udz) obj2;
                    ufnVar.e = g;
                    ufnVar.c.clear();
                    ufnVar.c.putAll(hashMap);
                }
                if (hashMap.size() == map.size() + 1) {
                    HashMap hashMap2 = new HashMap(hashMap);
                    hashMap2.keySet().removeAll(map.keySet());
                    if (hashMap2.size() == 1) {
                        obj2 = amkq.bk(hashMap2.values());
                    }
                }
                udzVar = (udz) obj2;
                ufnVar.e = g;
                ufnVar.c.clear();
                ufnVar.c.putAll(hashMap);
            }
            ufnVar.f();
            Iterator it2 = ufnVar.a.iterator();
            while (it2.hasNext()) {
                tyo tyoVar = (tyo) it2.next();
                amru d = ufnVar.d();
                tyoVar.ag(d);
                tyoVar.ad(d);
            }
            if (udzVar != null) {
                ufnVar.g(udzVar.a);
                uhs uhsVar = ufnVar.g;
                if (uhsVar != null) {
                    final Object obj3 = udzVar.a;
                    final ExpressSignInLayout expressSignInLayout = uhsVar.a;
                    final uim uimVar = uhsVar.b;
                    if (amruVar.size() == 1) {
                        tyo.M(new Runnable() { // from class: uhl
                            @Override // java.lang.Runnable
                            public final void run() {
                                ExpressSignInLayout.this.f(uimVar, obj3);
                            }
                        });
                    }
                }
                ufm ufmVar2 = ufm.a;
                ufmVar2.c = -1L;
                ufmVar2.b = false;
            } else {
                udz udzVar3 = ufnVar.f;
                if (udzVar3 != null) {
                    ufnVar.g(ufn.e((udz) hashMap.get(tyo.X(udzVar3.a))));
                }
            }
        }
        if (!amruVar.isEmpty() && uinVar.a.a() == null) {
            Object obj4 = amruVar.get(0);
            obj4.getClass();
            uinVar.a.g(obj4);
        }
        amruVar.isEmpty();
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        Log.e(AccountsModelUpdater.a, "Failed to load owners", th);
    }
}
