package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cos implements Cloneable {
    public dct a = dcq.b;

    public static cos b(int i) {
        cos cosVar = new cos();
        cosVar.c(new dcu(i));
        return cosVar;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cos clone() {
        try {
            return (cos) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c(dct dctVar) {
        did.ap(dctVar);
        this.a = dctVar;
    }
}
