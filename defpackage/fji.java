package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fji {
    private final azrw a;
    private final azrw b;
    private final axzg c;

    public fji(azrw azrwVar, azrw azrwVar2, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = axzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        Long l;
        Boolean bool;
        aqvj aqvjVar = this.c.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45356841L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45356841L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45356841L);
            l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        long longValue = l.longValue();
        aqvj aqvjVar2 = this.c.b.b().C;
        if (aqvjVar2 == null) {
            aqvjVar2 = aqvj.a;
        }
        if (aqvjVar2.a(45356840L)) {
            aoot aootVar2 = aqvjVar2.b;
            if (!aootVar2.containsKey(45356840L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar2 = (aqvk) aootVar2.get(45356840L);
            bool = Boolean.valueOf(aqvkVar2.b == 1 ? ((Boolean) aqvkVar2.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue() && ((agzz) this.a.get()).c() && ((long) ((fjs) this.b.get()).a()) >= longValue;
    }
}
