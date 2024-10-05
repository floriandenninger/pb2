package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amxg extends amxp implements amxz {
    /* JADX INFO: Access modifiers changed from: protected */
    public amxg(Level level) {
        super(level);
    }

    @Override // defpackage.amxp
    protected final anav a() {
        return anat.a;
    }

    @Override // defpackage.amxp
    protected final boolean b(amxt amxtVar) {
        int a;
        int i;
        amyt j = j();
        int b = j.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b) {
                break;
            }
            if (j.c(i2).a != "eye3tag") {
                i2++;
            } else if (j.d(amxn.a) == null && j.d(amxn.g) == null) {
                n(amxn.g, amye.SMALL);
            }
        }
        amxo amxoVar = this.c;
        if (amxoVar != null) {
            if (amxtVar != null) {
                Integer num = (Integer) amxoVar.d(amxn.b);
                amxw amxwVar = (amxw) this.c.d(amxn.c);
                amxo amxoVar2 = this.c;
                fy fyVar = amxx.d;
                Object obj = fyVar.h.get(amxtVar);
                if (obj == null) {
                    obj = new amxx();
                    Object putIfAbsent = fyVar.h.putIfAbsent(amxtVar, obj);
                    if (putIfAbsent != null) {
                        obj = putIfAbsent;
                    } else {
                        int i3 = amxoVar2.b;
                        amxu amxuVar = null;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (amxn.d.equals(amxoVar2.c(i4))) {
                                Object e = amxoVar2.e(i4);
                                if (e instanceof amya) {
                                    if (amxuVar == null) {
                                        amxuVar = new amxu(fyVar, amxtVar, null);
                                    }
                                    ((amya) e).a();
                                }
                            }
                        }
                    }
                }
                amxx amxxVar = (amxx) obj;
                if (num != null) {
                    if (amxxVar.a.getAndIncrement() % num.intValue() != 0) {
                        return false;
                    }
                }
                if (amxwVar != null) {
                    long j2 = this.b;
                    long j3 = amxxVar.b.get();
                    long nanos = amxwVar.a.toNanos(5000L) + j3;
                    if (nanos < 0 || ((j2 < nanos && j3 != 0) || !amxxVar.b.compareAndSet(j3, j2))) {
                        amxxVar.c.incrementAndGet();
                        return false;
                    }
                    amxwVar.b = amxxVar.c.getAndSet(0);
                }
            }
            amye amyeVar = (amye) this.c.d(amxn.g);
            if (amyeVar != null) {
                amyc amycVar = amxn.g;
                amxo amxoVar3 = this.c;
                if (amxoVar3 != null && (a = amxoVar3.a(amycVar)) >= 0) {
                    int i5 = a + a;
                    int i6 = i5 + 2;
                    while (true) {
                        i = amxoVar3.b;
                        if (i6 >= i + i) {
                            break;
                        }
                        Object obj2 = amxoVar3.a[i6];
                        if (!obj2.equals(amycVar)) {
                            Object[] objArr = amxoVar3.a;
                            objArr[i5] = obj2;
                            objArr[i5 + 1] = objArr[i6 + 1];
                            i5 += 2;
                        }
                        i6 += 2;
                    }
                    amxoVar3.b = i - ((i6 - i5) >> 1);
                    while (i5 < i6) {
                        amxoVar3.a[i5] = null;
                        i5++;
                    }
                }
                n(amxn.a, new amxv((Throwable) j().d(amxn.a), amyeVar, anay.b(amxp.class, amyeVar.f)));
            }
        }
        return true;
    }
}
