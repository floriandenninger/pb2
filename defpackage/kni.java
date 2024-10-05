package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kni {
    public final boolean a;
    public final int b;
    public final int c;
    public int d;
    private final ywr e;

    /* JADX WARN: Multi-variable type inference failed */
    public kni(ywr ywrVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        Boolean bool;
        Long l;
        Long l2;
        this.e = ywrVar;
        aqvj aqvjVar = axzgVar.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45357559L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45357559L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45357559L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        this.a = booleanValue;
        aqvj aqvjVar2 = axzgVar.b.b().C;
        aqvjVar2 = aqvjVar2 == null ? aqvj.a : aqvjVar2;
        if (aqvjVar2.a(45357558L)) {
            aoot aootVar2 = aqvjVar2.b;
            if (!aootVar2.containsKey(45357558L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar2 = (aqvk) aootVar2.get(45357558L);
            l = Long.valueOf(aqvkVar2.b == 2 ? ((Long) aqvkVar2.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        int intValue = l.intValue();
        this.b = intValue;
        aqvj aqvjVar3 = axzgVar.b.b().C;
        aqvjVar3 = aqvjVar3 == null ? aqvj.a : aqvjVar3;
        if (aqvjVar3.a(45357557L)) {
            aoot aootVar3 = aqvjVar3.b;
            if (!aootVar3.containsKey(45357557L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar3 = (aqvk) aootVar3.get(45357557L);
            l2 = Long.valueOf(aqvkVar3.b == 2 ? ((Long) aqvkVar3.c).longValue() : 0L);
        } else {
            l2 = 0L;
        }
        int intValue2 = l2.intValue();
        this.c = intValue2;
        if (booleanValue) {
            return;
        }
        if (intValue == 0 && intValue2 == 0) {
            return;
        }
        ywrVar.d().G().A(khe.h).n().X(new ayrs() { // from class: knh
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kni.this.d = ((Integer) obj).intValue();
            }
        });
    }

    public final void a() {
        ynm.m(this.e.b(kfq.i), jun.n);
    }
}
