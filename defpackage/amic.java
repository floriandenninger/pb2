package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amic extends amhg {
    public static final UUID c = UUID.randomUUID();

    private amic(amic amicVar, String str, amip amipVar) {
        super(str, amicVar, amipVar);
    }

    @Override // defpackage.amir
    public final amir f(String str, amip amipVar) {
        return new amic(this, str, amipVar);
    }

    @Override // defpackage.amir
    public final void g(boolean z) {
    }

    public amic(String str, UUID uuid, amip amipVar) {
        super(str, uuid, amipVar);
    }
}
