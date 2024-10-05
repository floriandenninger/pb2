package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aywb extends aypn {
    final banv[] b;
    final Iterable c;
    final ayrv d;
    final int e;

    public aywb(Iterable iterable, ayrv ayrvVar, int i) {
        this.b = null;
        this.c = iterable;
        this.d = ayrvVar;
        this.e = i;
    }

    public aywb(banv[] banvVarArr, ayrv ayrvVar, int i) {
        this.b = banvVarArr;
        this.c = null;
        this.d = ayrvVar;
        this.e = i;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        int length;
        banv[] banvVarArr = this.b;
        if (banvVarArr == null) {
            banvVarArr = new banv[8];
            try {
                Iterator it = this.c.iterator();
                aysw.b(it, "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            banv banvVar = (banv) it.next();
                            aysw.b(banvVar, "The publisher returned by the iterator is null");
                            if (length == banvVarArr.length) {
                                banv[] banvVarArr2 = new banv[(length >> 2) + length];
                                System.arraycopy(banvVarArr, 0, banvVarArr2, 0, length);
                                banvVarArr = banvVarArr2;
                            }
                            banvVarArr[length] = banvVar;
                            length++;
                        } catch (Throwable th) {
                            aynu.c(th);
                            azpy.f(th, banwVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        aynu.c(th2);
                        azpy.f(th2, banwVar);
                        return;
                    }
                }
            } catch (Throwable th3) {
                aynu.c(th3);
                azpy.f(th3, banwVar);
                return;
            }
        } else {
            length = banvVarArr.length;
        }
        if (length == 0) {
            azpy.b(banwVar);
            return;
        }
        if (length == 1) {
            banvVarArr[0].ab(new ayyx(banwVar, new aywa(this)));
            return;
        }
        ayvy ayvyVar = new ayvy(banwVar, this.d, length, this.e);
        banwVar.f(ayvyVar);
        ayvz[] ayvzVarArr = ayvyVar.c;
        for (int i = 0; i < length && !ayvyVar.k && !ayvyVar.i; i++) {
            banvVarArr[i].ab(ayvzVarArr[i]);
        }
    }
}
