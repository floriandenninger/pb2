package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtt {
    private final azrw a;
    private final fka b;
    private final jup c;
    private final axzg d;

    public jtt(azrw azrwVar, fka fkaVar, jup jupVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = azrwVar;
        this.b = fkaVar;
        this.c = jupVar;
        this.d = axzgVar;
    }

    public final atox a(boolean z) {
        agna b;
        aone createBuilder = atox.a.createBuilder();
        long d = ((agsm) this.a.get()).d();
        createBuilder.copyOnWrite();
        atox atoxVar = (atox) createBuilder.instance;
        atoxVar.b |= 2;
        atoxVar.d = d;
        agej b2 = ((agof) ((agsm) this.a.get()).c.get()).a().b();
        long j = 0;
        if (b2 != null && (b = b2.b()) != null) {
            j = b.a();
        }
        createBuilder.copyOnWrite();
        atox atoxVar2 = (atox) createBuilder.instance;
        atoxVar2.b |= 1;
        atoxVar2.c = j;
        if (this.d.z()) {
            long j2 = ((fkg) this.b.a.c()).m;
            createBuilder.copyOnWrite();
            atox atoxVar3 = (atox) createBuilder.instance;
            atoxVar3.b |= 4;
            atoxVar3.e = j2;
        }
        if (z) {
            atrx u = this.c.u();
            createBuilder.copyOnWrite();
            atox atoxVar4 = (atox) createBuilder.instance;
            atoxVar4.f = u.k;
            atoxVar4.b |= 8;
        }
        return (atox) createBuilder.build();
    }
}
