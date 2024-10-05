package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbk extends bbf {
    public static final Object b = new Object();
    public final Object c;
    private final Object e;

    public bbk(pou pouVar, Object obj, Object obj2) {
        super(pouVar);
        this.e = obj;
        this.c = obj2;
    }

    public static bbk l(pou pouVar, Object obj, Object obj2) {
        return new bbk(pouVar, obj, obj2);
    }

    @Override // defpackage.bbf, defpackage.pou
    public final pos a(int i, pos posVar, boolean z) {
        this.a.a(i, posVar, z);
        if (pts.R(posVar.b, this.c) && z) {
            posVar.b = b;
        }
        return posVar;
    }

    @Override // defpackage.bbf, defpackage.pou
    public final pot b(int i, pot potVar, long j) {
        this.a.b(i, potVar, j);
        if (pts.R(potVar.b, this.e)) {
            potVar.b = pot.a;
        }
        return potVar;
    }

    @Override // defpackage.bbf, defpackage.pou
    public final int d(Object obj) {
        Object obj2;
        pou pouVar = this.a;
        if (b.equals(obj) && (obj2 = this.c) != null) {
            obj = obj2;
        }
        return pouVar.d(obj);
    }

    @Override // defpackage.bbf, defpackage.pou
    public final Object i(int i) {
        Object i2 = this.a.i(i);
        return pts.R(i2, this.c) ? b : i2;
    }

    public final bbk k(pou pouVar) {
        return new bbk(pouVar, this.e, this.c);
    }
}
