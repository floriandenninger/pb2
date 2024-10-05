package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alek extends axac {
    private final alad a;

    public alek(alad aladVar) {
        super(aladVar);
        this.a = aladVar;
    }

    @Override // defpackage.axac, defpackage.awzu
    public final synchronized long a() {
        if (this.a.b()) {
            return this.a.a();
        }
        return super.a();
    }
}
