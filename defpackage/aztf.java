package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aztf extends azta implements azuk {
    private final int arity;

    public aztf(int i) {
        this(i, null);
    }

    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.azsy
    public String toString() {
        if (getCompletion() == null) {
            int i = azup.a;
            String f = azul.f(this);
            f.getClass();
            return f;
        }
        return super.toString();
    }

    public aztf(int i, azsq azsqVar) {
        super(azsqVar);
        this.arity = i;
    }
}
