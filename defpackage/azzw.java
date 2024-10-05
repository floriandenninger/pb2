package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azzw {
    public static final baac a = new baac("REMOVE_FROZEN");
    private final int c;
    private final boolean d;
    private final int e;
    private final azvi g;
    private final azvm f = azth.o(null);
    public final azvl b = azth.n(0);

    public azzw(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        this.g = new azvi(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int a(Object obj) {
        azvl azvlVar = this.b;
        while (true) {
            long j = azvlVar.b;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((j & 1152921503533105152L) >> 30);
            int i3 = this.e;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.d && this.g.a(i2 & i3).a != null) {
                int i4 = this.c;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    break;
                }
            } else if (this.b.b(j, ayep.y(j, 1152921503533105152L) | (((i2 + 1) & 1073741823) << 30))) {
                azvm a2 = this.g.a(i2 & i3);
                int i5 = azvn.a;
                a2.a = obj;
                azzw azzwVar = this;
                while ((azzwVar.b.b & 1152921504606846976L) != 0) {
                    azzwVar = azzwVar.c();
                    Object obj2 = azzwVar.g.a(azzwVar.e & i2).a;
                    if ((obj2 instanceof azzv) && ((azzv) obj2).a == i2) {
                        azzwVar.g.a(azzwVar.e & i2).a = obj;
                    } else {
                        azzwVar = null;
                    }
                    if (azzwVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    public final Object b() {
        Object obj;
        azvl azvlVar = this.b;
        while (true) {
            long j = azvlVar.b;
            long j2 = 1152921504606846976L;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.e;
            int i3 = i & i2;
            if ((i2 & ((int) ((1152921503533105152L & j) >> 30))) == i3) {
                return null;
            }
            Object obj2 = this.g.a(i3).a;
            if (obj2 == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj2 instanceof azzv) {
                    return null;
                }
                int i4 = (i + 1) & 1073741823;
                if (this.b.b(j, ayep.z(j, i4))) {
                    azvm a2 = this.g.a(this.e & i);
                    int i5 = azvn.a;
                    a2.a = null;
                    return obj2;
                }
                if (this.d) {
                    azzw azzwVar = this;
                    while (true) {
                        azvl azvlVar2 = azzwVar.b;
                        while (true) {
                            long j3 = azvlVar2.b;
                            int i6 = (int) (j3 & 1073741823);
                            boolean z = azwq.a;
                            if ((j3 & j2) == 0) {
                                if (azzwVar.b.b(j3, ayep.z(j3, i4))) {
                                    azvm a3 = azzwVar.g.a(i6 & azzwVar.e);
                                    int i7 = azvn.a;
                                    obj = null;
                                    a3.a = null;
                                    azzwVar = null;
                                    break;
                                }
                                j2 = 1152921504606846976L;
                            } else {
                                azzwVar = azzwVar.c();
                                obj = null;
                                break;
                            }
                        }
                        if (azzwVar == null) {
                            return obj2;
                        }
                        j2 = 1152921504606846976L;
                    }
                }
            }
        }
    }

    public final boolean d() {
        long j;
        azvl azvlVar = this.b;
        do {
            j = azvlVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!azvlVar.b(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final azzw c() {
        long j;
        azvl azvlVar = this.b;
        while (true) {
            j = azvlVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (azvlVar.b(j, j2)) {
                j = j2;
                break;
            }
        }
        azvm azvmVar = this.f;
        while (true) {
            azzw azzwVar = (azzw) azvmVar.a;
            if (azzwVar != null) {
                return azzwVar;
            }
            azvm azvmVar2 = this.f;
            int i = this.c;
            azzw azzwVar2 = new azzw(i + i, this.d);
            int i2 = (int) (1073741823 & j);
            int i3 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i4 = this.e;
                int i5 = i2 & i4;
                if (i5 != (i4 & i3)) {
                    Object obj = this.g.a(i5).a;
                    if (obj == null) {
                        obj = new azzv(i2);
                    }
                    azvm a2 = azzwVar2.g.a(azzwVar2.e & i2);
                    int i6 = azvn.a;
                    a2.a = obj;
                    i2++;
                }
            }
            azvl azvlVar2 = azzwVar2.b;
            int i7 = azvn.a;
            azvlVar2.b = ayep.y(j, 1152921504606846976L);
            azvmVar2.c(null, azzwVar2);
        }
    }
}
