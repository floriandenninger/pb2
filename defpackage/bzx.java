package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bzx extends btt {
    public bzx() {
        super(1, 2);
    }

    @Override // defpackage.btt
    public final void a(buo buoVar) {
        buoVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        buoVar.g("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
        buoVar.g("DROP TABLE IF EXISTS alarmInfo");
        buoVar.g("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
    }
}
