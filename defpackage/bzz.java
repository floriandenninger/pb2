package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bzz extends btt {
    public bzz() {
        super(4, 5);
    }

    @Override // defpackage.btt
    public final void a(buo buoVar) {
        buoVar.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        buoVar.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
