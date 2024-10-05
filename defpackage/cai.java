package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cai extends btm {
    final /* synthetic */ WorkDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cai(WorkDatabase_Impl workDatabase_Impl) {
        super(12);
        this.b = workDatabase_Impl;
    }

    @Override // defpackage.btm
    public final void a() {
        List list = this.b.d;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
            }
        }
    }

    @Override // defpackage.btm
    public final void b(buo buoVar) {
        buoVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        buoVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        buoVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        buoVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        buoVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        buoVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        buoVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        buoVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        buoVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        buoVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        buoVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        buoVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        buoVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        buoVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        buoVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    @Override // defpackage.btm
    public final void c(buo buoVar) {
        buoVar.g("DROP TABLE IF EXISTS `Dependency`");
        buoVar.g("DROP TABLE IF EXISTS `WorkSpec`");
        buoVar.g("DROP TABLE IF EXISTS `WorkTag`");
        buoVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
        buoVar.g("DROP TABLE IF EXISTS `WorkName`");
        buoVar.g("DROP TABLE IF EXISTS `WorkProgress`");
        buoVar.g("DROP TABLE IF EXISTS `Preference`");
        List list = this.b.d;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
            }
        }
    }

    @Override // defpackage.btm
    public final void d(buo buoVar) {
        this.b.g = buoVar;
        buoVar.g("PRAGMA foreign_keys = ON");
        this.b.o(buoVar);
        List list = this.b.d;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((jq) this.b.d.get(i)).e(buoVar);
            }
        }
    }

    @Override // defpackage.btm
    public final void e(buo buoVar) {
        jr.f(buoVar);
    }

    @Override // defpackage.btm
    public final dwh f(buo buoVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new btu("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new btu("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new btv("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new btv("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new btx("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new btx("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        bty btyVar = new bty("Dependency", hashMap, hashSet, hashSet2);
        bty a = bty.a(buoVar, "Dependency");
        if (!btyVar.equals(a)) {
            return new dwh(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + btyVar + "\n Found:\n" + a);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new btu("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new btu("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new btu("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new btu("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new btu("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new btu("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new btu("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new btu("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new btu("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new btu("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new btu("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new btu("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_start_time", new btu("period_start_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new btu("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new btu("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new btu("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new btu("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_type", new btu("required_network_type", "INTEGER", false, 0, null, 1));
        hashMap2.put("requires_charging", new btu("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new btu("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new btu("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new btu("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new btu("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new btu("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new btu("content_uri_triggers", "BLOB", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new btx("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new btx("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        bty btyVar2 = new bty("WorkSpec", hashMap2, hashSet3, hashSet4);
        bty a2 = bty.a(buoVar, "WorkSpec");
        if (!btyVar2.equals(a2)) {
            return new dwh(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + btyVar2 + "\n Found:\n" + a2);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new btu("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new btu("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new btv("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new btx("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        bty btyVar3 = new bty("WorkTag", hashMap3, hashSet5, hashSet6);
        bty a3 = bty.a(buoVar, "WorkTag");
        if (!btyVar3.equals(a3)) {
            return new dwh(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + btyVar3 + "\n Found:\n" + a3);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new btu("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("system_id", new btu("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new btv("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        bty btyVar4 = new bty("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        bty a4 = bty.a(buoVar, "SystemIdInfo");
        if (!btyVar4.equals(a4)) {
            return new dwh(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + btyVar4 + "\n Found:\n" + a4);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new btu("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new btu("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new btv("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new btx("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        bty btyVar5 = new bty("WorkName", hashMap5, hashSet8, hashSet9);
        bty a5 = bty.a(buoVar, "WorkName");
        if (!btyVar5.equals(a5)) {
            return new dwh(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + btyVar5 + "\n Found:\n" + a5);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new btu("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new btu("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new btv("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        bty btyVar6 = new bty("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        bty a6 = bty.a(buoVar, "WorkProgress");
        if (!btyVar6.equals(a6)) {
            return new dwh(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + btyVar6 + "\n Found:\n" + a6);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new btu("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new btu("long_value", "INTEGER", false, 0, null, 1));
        bty btyVar7 = new bty("Preference", hashMap7, new HashSet(0), new HashSet(0));
        bty a7 = bty.a(buoVar, "Preference");
        if (!btyVar7.equals(a7)) {
            return new dwh(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + btyVar7 + "\n Found:\n" + a7);
        }
        return new dwh(true, (String) null);
    }
}
