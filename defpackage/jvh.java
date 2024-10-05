package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jvh {
    public final ypa a;
    public final aili b;
    private final azrw c;
    private final agpd d;
    private final agzr e;

    public jvh(aili ailiVar, azrw azrwVar, ypa ypaVar, agpd agpdVar, agzr agzrVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = ailiVar;
        this.c = azrwVar;
        this.a = ypaVar;
        this.d = agpdVar;
        this.e = agzrVar;
    }

    public final anhy a() {
        return this.b.j(jpt.n);
    }

    public final anhy b(String str) {
        if (this.e.l()) {
            try {
                String[] strArr = {fhe.h(str), fhe.v(str), fhe.o(str)};
                for (int i = 0; i < 3; i++) {
                    String str2 = strArr[i];
                    agpd agpdVar = this.d;
                    aone createBuilder = atpq.a.createBuilder();
                    createBuilder.copyOnWrite();
                    atpq atpqVar = (atpq) createBuilder.instance;
                    atpqVar.c = 2;
                    atpqVar.b |= 1;
                    createBuilder.copyOnWrite();
                    atpq atpqVar2 = (atpq) createBuilder.instance;
                    str2.getClass();
                    atpqVar2.b |= 2;
                    atpqVar2.d = str2;
                    agpdVar.d((atpq) createBuilder.build());
                }
            } catch (agpe unused) {
                return anaf.O(null);
            }
        } else {
            ((agof) this.c.get()).a().m().y(str);
        }
        return a();
    }
}
