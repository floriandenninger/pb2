package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwl extends ykv {
    private final aenl a;
    private final axpg c;
    private final aduq d;
    private final affa e;
    private final azrw f;
    private final axzg g;

    public adwl(aenl aenlVar, axpg axpgVar, aduq aduqVar, azrw azrwVar, affa affaVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.a = aenlVar;
        this.c = axpgVar;
        this.d = aduqVar;
        this.f = azrwVar;
        this.e = affaVar;
        this.g = axzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ykv
    protected final void a() {
        Boolean bool;
        this.a.n();
        afgb afgbVar = (afgb) this.c.get();
        ((affu) afgbVar.a.get()).b();
        afgbVar.e();
        aduq aduqVar = this.d;
        aduqVar.a.i(aduqVar);
        aduqVar.b.g(aduqVar);
        aqvj aqvjVar = this.g.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45358005L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45358005L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45358005L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            this.e.b().get();
        }
        ((amnv) this.f.get()).get();
    }
}
