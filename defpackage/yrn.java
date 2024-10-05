package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yrn {
    public final azqw a = azqv.ap().av();
    public final azqw b = azqv.ap().av();
    public final azqw c = azqv.ap().av();
    public final azqw d = azqv.ap().av();
    public final azqw e = azqv.aq(0).av();
    public final azqw f = azqv.ap().av();
    public final yrh g;
    public final ayqj h;
    private final azrw i;
    private yro j;

    public yrn(azrw azrwVar, yrh yrhVar, final axzg axzgVar, ayqi ayqiVar, byte[] bArr, byte[] bArr2) {
        this.i = azrwVar;
        this.g = yrhVar;
        axzgVar.getClass();
        final byte[] bArr3 = null;
        this.h = ayqj.C(new Callable(bArr3, bArr3) { // from class: yrj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aqvj aqvjVar = axzg.this.b.b().C;
                if (aqvjVar == null) {
                    aqvjVar = aqvj.a;
                }
                if (aqvjVar.a(45356834L)) {
                    aoot aootVar = aqvjVar.b;
                    if (!aootVar.containsKey(45356834L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar = (aqvk) aootVar.get(45356834L);
                    return Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
                }
                return false;
            }
        }).I(ayqiVar).m();
    }

    public final aypn a() {
        return this.f.G().J().y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i) {
        yro yroVar = this.j;
        if (yroVar == null || z != yroVar.a()) {
            this.j = new yro(z);
            ((ypa) this.i.get()).f(this.j);
        }
        this.h.Z(new aytn(new ayrs() { // from class: yrk
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                yrn yrnVar = yrn.this;
                boolean z5 = z;
                boolean z6 = z2;
                boolean z7 = z3;
                boolean z8 = z4;
                int i2 = i;
                if (((Boolean) obj).booleanValue()) {
                    yrnVar.f.c(new yrm(z5, z6, z7, z8, i2));
                    return;
                }
                yrnVar.b.c(Boolean.valueOf(z6));
                yrnVar.c.c(Boolean.valueOf(z7));
                yrnVar.d.c(Boolean.valueOf(z8));
                yrnVar.e.c(Integer.valueOf(i2));
            }
        }, zxi.b));
    }
}
