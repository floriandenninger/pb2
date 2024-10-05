package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cad extends btt {
    public cad() {
        super(11, 12);
    }

    @Override // defpackage.btt
    public final void a(buo buoVar) {
        buoVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
