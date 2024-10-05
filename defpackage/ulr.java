package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ulr implements ukk {
    public final ukk a;
    final /* synthetic */ uls b;
    private final ukk c;
    private amyi d;

    public ulr(uls ulsVar, ukk ukkVar, ukk ukkVar2) {
        this.b = ulsVar;
        this.c = ukkVar;
        this.a = ukkVar2;
    }

    private final anhy h(final amml ammlVar) {
        return amkq.k((anhy) ammlVar.apply(this.c), ulh.class, new anfz() { // from class: ulq
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                ulr ulrVar = ulr.this;
                amml ammlVar2 = ammlVar;
                ulrVar.g((ulh) obj);
                return (anhy) ammlVar2.apply(ulrVar.a);
            }
        }, angq.a);
    }

    private final anhy i(final uln ulnVar, final String str, final int i) {
        return amkq.k(ulnVar.a(this.c, str, i), ulh.class, new anfz() { // from class: ulp
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                ulr ulrVar = ulr.this;
                uln ulnVar2 = ulnVar;
                String str2 = str;
                int i2 = i;
                ulrVar.g((ulh) obj);
                return ulnVar2.a(ulrVar.a, str2, i2);
            }
        }, angq.a);
    }

    @Override // defpackage.ukk
    public final anhy a() {
        return h(tur.k);
    }

    @Override // defpackage.ukk
    public final anhy b() {
        return h(tur.l);
    }

    @Override // defpackage.ukk
    public final void c(ufi ufiVar) {
        synchronized (this.b.b) {
            this.b.b.add(ufiVar);
            this.c.c(ufiVar);
        }
    }

    @Override // defpackage.ukk
    public final void d(ufi ufiVar) {
        synchronized (this.b.b) {
            this.b.b.remove(ufiVar);
            this.c.d(ufiVar);
        }
    }

    @Override // defpackage.ukk
    public final anhy e(String str, int i) {
        return i(ulo.b, str, i);
    }

    @Override // defpackage.ukk
    public final anhy f(String str, int i) {
        return i(ulo.a, str, i);
    }

    public final void g(Exception exc) {
        synchronized (this.b.b) {
            if (this.d == null) {
                this.d = amyi.m("OneGoogle");
            }
            ((amyf) ((amyf) ((amyf) this.d.f()).h(exc)).i("com/google/android/libraries/onegoogle/owners/mdi/SafeMdiOwnersProvider$SafeDelegate", "enableSafeDelegate", 191, "SafeMdiOwnersProvider.java")).q("MDI Profile Sync not available on device. Reverting to backup implementation.");
            Iterator it = this.b.b.iterator();
            while (it.hasNext()) {
                this.a.c((ufi) it.next());
            }
            uls ulsVar = this.b;
            ulsVar.a = this.a;
            Iterator it2 = ulsVar.b.iterator();
            while (it2.hasNext()) {
                this.c.d((ufi) it2.next());
            }
            this.b.b.clear();
        }
    }
}
