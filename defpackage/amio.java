package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amio extends amip implements amin {
    public static final amip a = new amio(null, new aeg(0)).e();

    public amio(amip amipVar, aeg aegVar) {
        super(amipVar, aegVar);
    }

    @Override // defpackage.amin
    public final void a(amkq amkqVar, Object obj) {
        amkq.O(!this.c, "Can't mutate after handing to trace");
        obj.getClass();
        amkq.O(!h(amkqVar), "Key already present");
        this.b.put(amkqVar, obj);
    }
}
