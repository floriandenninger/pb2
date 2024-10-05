package defpackage;

import com.google.android.libraries.notifications.data.impl.room.ChimePerAccountRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class txs extends btm {
    final /* synthetic */ ChimePerAccountRoomDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txs(ChimePerAccountRoomDatabase_Impl chimePerAccountRoomDatabase_Impl) {
        super(1);
        this.b = chimePerAccountRoomDatabase_Impl;
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
        buoVar.g("CREATE TABLE IF NOT EXISTS `chime_thread_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT, `last_updated_version` INTEGER NOT NULL, `read_state` INTEGER, `deletion_status` INTEGER, `count_behavior` INTEGER, `system_tray_behavior` INTEGER, `modified_timestamp` INTEGER NOT NULL)");
        buoVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        buoVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ea4ce6093b9d29b56181718d906e0024')");
    }

    @Override // defpackage.btm
    public final void c(buo buoVar) {
        buoVar.g("DROP TABLE IF EXISTS `chime_thread_states`");
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
        HashMap hashMap = new HashMap(8);
        hashMap.put("id", new btu("id", "INTEGER", true, 1, null, 1));
        hashMap.put("thread_id", new btu("thread_id", "TEXT", false, 0, null, 1));
        hashMap.put("last_updated_version", new btu("last_updated_version", "INTEGER", true, 0, null, 1));
        hashMap.put("read_state", new btu("read_state", "INTEGER", false, 0, null, 1));
        hashMap.put("deletion_status", new btu("deletion_status", "INTEGER", false, 0, null, 1));
        hashMap.put("count_behavior", new btu("count_behavior", "INTEGER", false, 0, null, 1));
        hashMap.put("system_tray_behavior", new btu("system_tray_behavior", "INTEGER", false, 0, null, 1));
        hashMap.put("modified_timestamp", new btu("modified_timestamp", "INTEGER", true, 0, null, 1));
        bty btyVar = new bty("chime_thread_states", hashMap, new HashSet(0), new HashSet(0));
        bty a = bty.a(buoVar, "chime_thread_states");
        if (!btyVar.equals(a)) {
            String valueOf = String.valueOf(btyVar);
            String valueOf2 = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 107 + String.valueOf(valueOf2).length());
            sb.append("chime_thread_states(com.google.android.libraries.notifications.data.ChimeThreadState).\n Expected:\n");
            sb.append(valueOf);
            sb.append("\n Found:\n");
            sb.append(valueOf2);
            return new dwh(false, sb.toString());
        }
        return new dwh(true, (String) null);
    }
}
