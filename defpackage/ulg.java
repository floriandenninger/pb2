package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ulg implements ukk {
    private final tuh a;
    private final uke b;
    private final tue c = new ule(this);
    private final List d = new ArrayList();
    private final ukw e;
    private final ulm f;
    private final ulj g;

    public ulg(Context context, tuh tuhVar, uke ukeVar, ujn ujnVar, ukv ukvVar) {
        context.getClass();
        tuhVar.getClass();
        this.a = tuhVar;
        this.b = ukeVar;
        this.e = ukvVar.a(context, ukeVar, new OnAccountsUpdateListener() { // from class: ulc
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                ulg ulgVar = ulg.this;
                ulgVar.i();
                for (Account account : accountArr) {
                    ulgVar.h(account);
                }
            }
        });
        this.f = new ulm(context, tuhVar, ukeVar, ujnVar);
        this.g = new ulj(tuhVar);
    }

    public static anhy g(anhy anhyVar) {
        return amkq.m(anhyVar, tur.h, angq.a);
    }

    @Override // defpackage.ukk
    public final anhy a() {
        return this.f.a(tur.f);
    }

    @Override // defpackage.ukk
    public final anhy b() {
        return this.f.a(tur.g);
    }

    @Override // defpackage.ukk
    public final void c(ufi ufiVar) {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                this.e.a();
                amkq.o(this.b.a(), new ulf(this), angq.a);
            }
            this.d.add(ufiVar);
        }
    }

    @Override // defpackage.ukk
    public final void d(ufi ufiVar) {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                return;
            }
            this.d.remove(ufiVar);
            if (this.d.isEmpty()) {
                this.e.b();
            }
        }
    }

    @Override // defpackage.ukk
    public final anhy e(String str, int i) {
        return this.g.a(uld.b, str, i);
    }

    @Override // defpackage.ukk
    public final anhy f(String str, int i) {
        return this.g.a(uld.a, str, i);
    }

    public final void h(Account account) {
        tug a = this.a.a(account);
        a.f(this.c);
        a.e(this.c, angq.a);
    }

    public final void i() {
        synchronized (this.d) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((ufi) it.next()).a();
            }
        }
    }
}
