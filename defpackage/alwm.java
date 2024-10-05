package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class alwm implements amcg {
    final /* synthetic */ alwr a;

    public alwm(alwr alwrVar) {
        this.a = alwrVar;
    }

    @Override // defpackage.amcg
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        Throwable alwyVar;
        alws alwsVar = (alws) ((ProtoParsers$ParcelableProto) obj).a(alws.a, this.a.i);
        if (alwsVar.equals(this.a.l)) {
            this.a.g();
            ActivityAccountState activityAccountState = this.a.c;
            boolean z = th instanceof alwv;
            if (z) {
                alwyVar = (alwv) th;
            } else {
                alwyVar = new alwy(th);
            }
            activityAccountState.m(alwyVar);
            if ((alwsVar.b & 2) != 0) {
                AccountId b = AccountId.b(alwsVar.d);
                if (!z) {
                    ((amxh) ((amxh) ((amxh) alwr.a.f()).h(th)).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 174, "AccountControllerImpl.java")).s("Failed to use %s.", b);
                } else {
                    ((amxh) ((amxh) ((amxh) alwr.a.e()).h(th)).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 171, "AccountControllerImpl.java")).s("Failed to use %s.", b);
                }
            }
            this.a.j();
        }
    }

    @Override // defpackage.amcg
    public final /* synthetic */ void b(Object obj, Object obj2) {
        AccountId accountId;
        AccountActionResult accountActionResult = (AccountActionResult) obj2;
        alws alwsVar = (alws) ((ProtoParsers$ParcelableProto) obj).a(alws.a, this.a.i);
        if (alwsVar.equals(this.a.l)) {
            if ((alwsVar.b & 2) != 0) {
                amkq.N(accountActionResult.a.a() == alwsVar.d);
                accountId = AccountId.b(alwsVar.d);
            } else {
                if (accountActionResult.d != null) {
                    if (!this.a.c.j()) {
                        this.a.c.n();
                    }
                    Intent intent = accountActionResult.d;
                    if (this.a.c.j()) {
                        alxb.a(intent, AccountId.b(this.a.c.g()));
                    }
                    this.a.b.c().b(intent);
                    return;
                }
                if (accountActionResult.c == null) {
                    this.a.c.m(new alwz());
                    this.a.g();
                    this.a.j();
                    return;
                }
                accountId = accountActionResult.a;
            }
            ValidationResult validationResult = accountActionResult.c;
            validationResult.getClass();
            if (validationResult.c()) {
                ActivityAccountState activityAccountState = this.a.c;
                AccountId accountId2 = accountActionResult.a;
                alym alymVar = accountActionResult.b;
                if (activityAccountState.k(accountId2.a(), alymVar, 2)) {
                    activityAccountState.a.b(accountId2, alymVar);
                    alxt alxtVar = activityAccountState.a;
                    amkq.N(alymVar != null);
                    amkq.N(!alymVar.equals(alym.a));
                    amkq.N((alymVar.b & 256) != 0);
                    amil l = amjw.l("onAccountReady");
                    try {
                        String str = alymVar.i;
                        alxq alxqVar = new alxq(new alxr(accountId2));
                        amxd listIterator = ((amvs) alxtVar.a).listIterator();
                        while (listIterator.hasNext()) {
                            ((alxs) listIterator.next()).a(alxqVar);
                        }
                        Iterator it = alxtVar.b.iterator();
                        while (it.hasNext()) {
                            ((alxs) it.next()).a(alxqVar);
                        }
                        l.close();
                        activityAccountState.i();
                        activityAccountState.a.a(accountId2, alymVar);
                    } catch (Throwable th) {
                        try {
                            l.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                }
                this.a.g();
            } else {
                if (validationResult.b()) {
                    this.a.c.n();
                }
                Intent a = validationResult.a();
                alxb.a(a, accountId);
                a.putExtra("$tiktok$for_requirement_activity", true);
                a.putExtra("$tiktok$canRestartAccountSelector", this.a.k.b);
                a.addFlags(65536);
                this.a.b.b().b(a);
            }
            this.a.j();
        }
    }
}
