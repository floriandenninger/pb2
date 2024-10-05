package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aejz implements aeku {
    private final List a;
    private final long b;
    private boolean c;

    aejz() {
        this(0L);
    }

    @Override // defpackage.aeku
    public final synchronized int a(long j, int i, byte[] bArr, int i2) {
        aejy aejyVar;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                aejyVar = null;
                break;
            }
            aejyVar = (aejy) it.next();
            if (aejyVar.a.b(j)) {
                break;
            }
        }
        if (aejyVar == null) {
            return 0;
        }
        return aejyVar.b.a(j - aejyVar.a.a, i, bArr, i2);
    }

    @Override // defpackage.aeku
    public final synchronized long b() {
        return this.b;
    }

    @Override // defpackage.aeku
    public final synchronized void c() {
        this.c = true;
    }

    @Override // defpackage.aeku
    public final synchronized void d(byte[] bArr, int i, int i2, aelt aeltVar) {
        aejy aejyVar;
        if (aeltVar == aelu.a) {
            aejyVar = (aejy) this.a.get(0);
        } else {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    long j = aeltVar.a;
                    aejyVar = new aejy(aelt.a(j, j), new aekc(this.b));
                    this.a.add(aejyVar);
                    break;
                } else {
                    aejy aejyVar2 = (aejy) it.next();
                    if (aejyVar2.a.b == aeltVar.a) {
                        aejyVar = aejyVar2;
                        break;
                    }
                }
            }
        }
        aejyVar.b.d(bArr, i, i2, aeltVar);
        aelt aeltVar2 = aejyVar.a;
        aejyVar.a = aelt.a(aeltVar2.a, aeltVar2.b + i2);
    }

    @Override // defpackage.aeku
    public final synchronized boolean e(long j) {
        boolean z;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((aejy) it.next()).a.b(j)) {
                z = true;
                break;
            }
        }
        return z;
    }

    @Override // defpackage.aeku
    public final synchronized boolean f() {
        return this.c;
    }

    public aejz(long j) {
        this.c = false;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = j;
        arrayList.add(new aejy(aelt.a(0L, 0L), new aekc(j)));
    }
}
