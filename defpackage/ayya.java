package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayya extends ayyb {
    private static final long serialVersionUID = 2587302975077663557L;
    final banw a;

    public ayya(banw banwVar, Object[] objArr) {
        super(objArr);
        this.a = banwVar;
    }

    @Override // defpackage.ayyb
    public final void b() {
        Object[] objArr = this.b;
        int length = objArr.length;
        banw banwVar = this.a;
        for (int i = this.c; i != length; i++) {
            if (this.d) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                banwVar.c(obj);
            } else {
                StringBuilder sb = new StringBuilder(40);
                sb.append("The element at index ");
                sb.append(i);
                sb.append(" is null");
                banwVar.b(new NullPointerException(sb.toString()));
                return;
            }
        }
        if (this.d) {
            return;
        }
        banwVar.sh();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r10.c = r2;
        r11 = addAndGet(-r6);
     */
    @Override // defpackage.ayyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r11) {
        /*
            r10 = this;
            java.lang.Object[] r0 = r10.b
            int r1 = r0.length
            int r2 = r10.c
            banw r3 = r10.a
            r4 = 0
        L9:
            r6 = r4
        La:
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 == 0) goto L43
            if (r2 == r1) goto L43
            boolean r8 = r10.d
            if (r8 == 0) goto L15
            return
        L15:
            r8 = r0[r2]
            if (r8 != 0) goto L3a
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r0 = 40
            r12.<init>(r0)
            java.lang.String r0 = "The element at index "
            r12.append(r0)
            r12.append(r2)
            java.lang.String r0 = " is null"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            r3.b(r11)
            return
        L3a:
            r3.c(r8)
            r8 = 1
            long r6 = r6 + r8
            int r2 = r2 + 1
            goto La
        L43:
            if (r2 != r1) goto L4d
            boolean r11 = r10.d
            if (r11 != 0) goto L4c
            r3.sh()
        L4c:
            return
        L4d:
            long r11 = r10.get()
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 != 0) goto La
            r10.c = r2
            long r11 = -r6
            long r11 = r10.addAndGet(r11)
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 == 0) goto L61
            goto L9
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayya.f(long):void");
    }
}
