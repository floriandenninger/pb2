package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afh extends afo {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f6, code lost:
    
        if (r6 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00fa, code lost:
    
        if (r7 != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    @Override // defpackage.afk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.afb r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afh.b(afb, boolean):void");
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.ar;
            if (i4 >= i) {
                break;
            }
            afk afkVar = this.aq[i4];
            if ((this.b || afkVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && !afkVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !afkVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.ar; i6++) {
            afk afkVar2 = this.aq[i6];
            if (this.b || afkVar2.d()) {
                if (!z2) {
                    int i7 = this.a;
                    if (i7 == 0) {
                        i5 = afkVar2.L(2).a();
                    } else if (i7 == 1) {
                        i5 = afkVar2.L(4).a();
                    } else if (i7 == 2) {
                        i5 = afkVar2.L(3).a();
                    } else if (i7 == 3) {
                        i5 = afkVar2.L(5).a();
                    }
                }
                int i8 = this.a;
                if (i8 == 0) {
                    i5 = Math.min(i5, afkVar2.L(2).a());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, afkVar2.L(4).a());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, afkVar2.L(3).a());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, afkVar2.L(5).a());
                }
                z2 = true;
            }
        }
        int i9 = i5 + this.c;
        int i10 = this.a;
        if (i10 == 0 || i10 == 1) {
            w(i9, i9);
        } else {
            x(i9, i9);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.afk
    public final boolean d() {
        return true;
    }

    @Override // defpackage.afk
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.afk
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.afk
    public final String toString() {
        String str = this.ah;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append("[Barrier] ");
        sb.append(str);
        sb.append(" {");
        String sb2 = sb.toString();
        for (int i = 0; i < this.ar; i++) {
            afk afkVar = this.aq[i];
            if (i > 0) {
                sb2 = String.valueOf(sb2).concat(", ");
            }
            String valueOf = String.valueOf(sb2);
            String valueOf2 = String.valueOf(afkVar.ah);
            sb2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return String.valueOf(sb2).concat("}");
    }
}
