package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class caa extends btt {
    public caa() {
        super(6, 7);
    }

    @Override // defpackage.btt
    public final void a(buo buoVar) {
        buoVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    }
}
