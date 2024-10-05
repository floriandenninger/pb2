package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahid extends ahin {
    private final azrw c;

    public ahid(azrw azrwVar, ahky ahkyVar, ahla ahlaVar) {
        super(ahkyVar, ahlaVar);
        this.c = azrwVar;
    }

    @Override // defpackage.ahin
    protected final ahny g() {
        return (ahny) this.c.get();
    }
}
