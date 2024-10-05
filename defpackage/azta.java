package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azta extends azsy {
    private final azsv _context;
    private transient azsq intercepted;

    public azta(azsq azsqVar) {
        this(azsqVar, azsqVar != null ? azsqVar.getContext() : null);
    }

    @Override // defpackage.azsq
    public azsv getContext() {
        azsv azsvVar = this._context;
        azsvVar.getClass();
        return azsvVar;
    }

    public final azsq intercepted() {
        azsq azsqVar = this.intercepted;
        if (azsqVar == null) {
            azsr azsrVar = (azsr) getContext().get(azsr.a);
            azsqVar = azsrVar != null ? azsrVar.a(this) : this;
            this.intercepted = azsqVar;
        }
        return azsqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azsy
    public void releaseIntercepted() {
        azsq azsqVar = this.intercepted;
        if (azsqVar != null && azsqVar != this) {
            azss azssVar = getContext().get(azsr.a);
            azssVar.getClass();
            ((azsr) azssVar).b(azsqVar);
        }
        this.intercepted = azsz.a;
    }

    public azta(azsq azsqVar, azsv azsvVar) {
        super(azsqVar);
        this._context = azsvVar;
    }
}
