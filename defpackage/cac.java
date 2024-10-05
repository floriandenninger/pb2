package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cac extends btt {
    public cac() {
        super(8, 9);
    }

    @Override // defpackage.btt
    public final void a(buo buoVar) {
        buoVar.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
