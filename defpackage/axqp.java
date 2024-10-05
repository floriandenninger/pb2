package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqp implements axqr {
    private azrw a;

    public static void a(azrw azrwVar, azrw azrwVar2) {
        azrwVar2.getClass();
        axqp axqpVar = (axqp) azrwVar;
        if (axqpVar.a != null) {
            throw new IllegalStateException();
        }
        axqpVar.a = azrwVar2;
    }

    @Override // defpackage.azrw
    public final Object get() {
        azrw azrwVar = this.a;
        if (azrwVar == null) {
            throw new IllegalStateException();
        }
        return azrwVar.get();
    }
}
