package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class txl extends SQLiteOpenHelper {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public txl(android.content.Context r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "_threads.notifications.db"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 0
            r0 = 21
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txl.<init>(android.content.Context, long):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        tzk.e("ChimeThreadSQLiteHelper", "Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0));");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = i;
        tzk.e("ChimeThreadSQLiteHelper", "Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i3 < 6) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
            sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0));");
            return;
        }
        if (i3 == 6) {
            tyo.d(sQLiteDatabase, "threads", "expiration_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 7) {
                return;
            } else {
                i3 = 7;
            }
        }
        if (i3 == 7) {
            tyo.d(sQLiteDatabase, "threads", "locally_removed", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 8) {
                return;
            } else {
                i3 = 8;
            }
        }
        if (i3 < 12) {
            tyo.d(sQLiteDatabase, "threads", "storage_mode", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 12) {
                return;
            } else {
                i3 = 12;
            }
        }
        if (i3 < 14) {
            tyo.d(sQLiteDatabase, "threads", "payload_type", "TEXT");
            if (i2 <= 14) {
                return;
            } else {
                i3 = 14;
            }
        }
        if (i3 == 14) {
            tyo.d(sQLiteDatabase, "threads", "thread_stored_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 15) {
                return;
            } else {
                i3 = 15;
            }
        }
        if (i3 == 15) {
            tyo.d(sQLiteDatabase, "threads", "creation_id", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 16) {
                return;
            } else {
                i3 = 16;
            }
        }
        if (i3 == 16) {
            tyo.d(sQLiteDatabase, "threads", "actions", "BLOB");
            if (i2 <= 17) {
                return;
            } else {
                i3 = 17;
            }
        }
        if (i3 == 17) {
            if (!tyo.e(sQLiteDatabase, "threads", "_id", "thread_id", "read_state", "count_behavior", "system_tray_behavior", "last_updated__version", "last_notification_version", "creation_id", "notification_metadata", "actions", "rendered_message", "payload_type", "payload", "update_thread_state_token", "group_id", "expiration_timestamp", "thread_stored_timestamp", "locally_removed", "storage_mode")) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
                sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0));");
                return;
            } else if (i2 <= 18) {
                return;
            } else {
                i3 = 18;
            }
        }
        if (i3 == 18) {
            tyo.d(sQLiteDatabase, "threads", "reference", "INTEGER NOT NULL DEFAULT(0)");
            sQLiteDatabase.execSQL("UPDATE threads SET reference = 1");
            if (i2 <= 19) {
                return;
            } else {
                i3 = 19;
            }
        }
        if (i3 == 19) {
            sQLiteDatabase.execSQL(String.format(Locale.US, "UPDATE %s SET %s = 0 WHERE %s != 0", "threads", "reference", "locally_removed"));
            if (i2 <= 20) {
                return;
            }
        } else if (i3 != 20) {
            return;
        }
        tyo.d(sQLiteDatabase, "threads", "deletion_status", "INTEGER NOT NULL DEFAULT(0)");
        sQLiteDatabase.execSQL("UPDATE threads SET deletion_status = ?", new String[]{"1"});
    }
}
