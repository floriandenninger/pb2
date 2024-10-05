package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ammk implements amml {
    private transient ammk a;

    protected abstract Object a(Object obj);

    @Override // defpackage.amml
    @Deprecated
    public final Object apply(Object obj) {
        return d(obj);
    }

    protected abstract Object b(Object obj);

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a = a(obj);
        a.getClass();
        return a;
    }

    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = b(obj);
        b.getClass();
        return b;
    }

    public final ammk e() {
        ammk ammkVar = this.a;
        if (ammkVar != null) {
            return ammkVar;
        }
        ammj ammjVar = new ammj(this);
        this.a = ammjVar;
        return ammjVar;
    }
}
