package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agzr {
    public final aaea a;
    public final zgd b = zgd.b(aghu.class.getName(), new amnv() { // from class: agzq
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.amnv
        public final Object get() {
            Long l;
            aqvj aqvjVar = agzr.this.e.a.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45359483L)) {
                aoot aootVar = aqvjVar.b;
                if (!aootVar.containsKey(45359483L)) {
                    throw new IllegalArgumentException();
                }
                aqvk aqvkVar = (aqvk) aootVar.get(45359483L);
                l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
            } else {
                l = 0L;
            }
            int intValue = l.intValue();
            aghu[] values = aghu.values();
            return (intValue < 0 || intValue >= values.length) ? aghu.DISABLED : values[intValue];
        }
    });
    public final aadw c;

    @Deprecated
    public final axzg d;
    public final axzf e;

    public agzr(aaea aaeaVar, aadw aadwVar, axzg axzgVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = aaeaVar;
        this.c = aadwVar;
        this.d = axzgVar;
        this.e = axzfVar;
    }

    public static boolean d(aaea aaeaVar) {
        if (aaeaVar == null || aaeaVar.a() == null || (aaeaVar.a().b & 512) == 0) {
            return false;
        }
        atph atphVar = aaeaVar.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        return atphVar.q;
    }

    public static boolean g(aaea aaeaVar) {
        if (aaeaVar == null || aaeaVar.a() == null || (aaeaVar.a().b & 512) == 0) {
            return false;
        }
        atph atphVar = aaeaVar.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        return atphVar.t;
    }

    public static boolean i(aaea aaeaVar) {
        if (aaeaVar == null || aaeaVar.a() == null || (aaeaVar.a().b & 512) == 0) {
            return false;
        }
        atph atphVar = aaeaVar.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        return atphVar.v;
    }

    public static atoy n(aadw aadwVar) {
        if (aadwVar == null || aadwVar.b() == null) {
            return null;
        }
        atoy atoyVar = aadwVar.b().m;
        return atoyVar == null ? atoy.a : atoyVar;
    }

    public static boolean o(aadw aadwVar) {
        atoy n = n(aadwVar);
        return n != null && n.f;
    }

    public final long a() {
        atph atphVar = this.a.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        return atphVar.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        Boolean bool;
        aqvj aqvjVar = this.d.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45353261L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353261L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353261L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean c() {
        atph atphVar = this.a.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        return atphVar.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        Boolean bool;
        aqvj aqvjVar = this.d.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45356807L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45356807L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45356807L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean f() {
        atph atphVar = this.a.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        return atphVar.w;
    }

    public final boolean h() {
        atph atphVar = this.a.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        return atphVar.H;
    }

    public final boolean j() {
        atph atphVar = this.a.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        return atphVar.E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        Boolean bool;
        aqvj aqvjVar = this.d.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45354129L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45354129L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45354129L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean l() {
        atph atphVar = this.a.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        return atphVar.r;
    }

    public final boolean m() {
        atoy atoyVar = this.c.b().m;
        if (atoyVar == null) {
            atoyVar = atoy.a;
        }
        return atoyVar.j;
    }
}
