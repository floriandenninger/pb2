package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amrq extends amxe {
    private final amru a;

    public amrq(amru amruVar, int i) {
        super(amruVar.size(), i);
        this.a = amruVar;
    }

    @Override // defpackage.amxe
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
