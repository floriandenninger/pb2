package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izb implements abca {
    private final aasy a;

    public izb(aasy aasyVar) {
        this.a = aasyVar;
    }

    @Override // defpackage.abca
    public final void b(abbz abbzVar) {
        amru a = this.a.a();
        int i = ((amvj) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            abbzVar.u.add(Integer.valueOf(((Integer) a.get(i2)).intValue()));
        }
    }
}
