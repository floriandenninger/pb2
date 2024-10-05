package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aopk implements aoov {
    public final aooy a;
    public final String b;
    public final Object[] c;
    private final int d;

    public aopk(aooy aooyVar, String str, Object[] objArr) {
        this.a = aooyVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // defpackage.aoov
    public final aooy a() {
        return this.a;
    }

    @Override // defpackage.aoov
    public final aoph b() {
        return (this.d & 1) == 1 ? aoph.PROTO2 : aoph.PROTO3;
    }

    @Override // defpackage.aoov
    public final boolean c() {
        return (this.d & 2) == 2;
    }
}
