package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agix implements yom {
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.Map] */
    @Override // defpackage.yom
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = "type";
        String str2 = "preferred_stream_quality";
        String str3 = "offline_channel_data_proto";
        String str4 = "last_update_timestamp";
        sQLiteDatabase.execSQL("CREATE TABLE playlistsV13 (id TEXT PRIMARY KEY,offline_playlist_data_proto BLOB,placeholder INTEGER,channel_id TEXT,size INTEGER,preferred_stream_quality INTEGER,saved_timestamp INTEGER,player_response_tracking_params BLOB DEFAULT NULL)");
        HashMap hashMap = new HashMap();
        String c = yoj.c("playlistsV2", agio.b);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 24);
        String str5 = "SELECT ";
        sb.append("SELECT ");
        sb.append(c);
        sb.append(" FROM playlistsV2");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("id");
                String str6 = str;
                int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("channel_id");
                String str7 = str4;
                int columnIndexOrThrow3 = rawQuery.getColumnIndexOrThrow("offline_playlist_data_proto");
                String str8 = str3;
                int columnIndexOrThrow4 = rawQuery.getColumnIndexOrThrow("placeholder");
                String str9 = str5;
                int columnIndexOrThrow5 = rawQuery.getColumnIndexOrThrow("player_response_tracking_params");
                int columnIndexOrThrow6 = rawQuery.getColumnIndexOrThrow("size");
                ?? r20 = hashMap;
                int columnIndexOrThrow7 = rawQuery.getColumnIndexOrThrow("saved_timestamp");
                int columnIndexOrThrow8 = rawQuery.getColumnIndexOrThrow(str2);
                String str10 = str2;
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", rawQuery.getString(columnIndexOrThrow));
                contentValues.put("channel_id", rawQuery.getString(columnIndexOrThrow2));
                contentValues.put("offline_playlist_data_proto", rawQuery.getBlob(columnIndexOrThrow3));
                contentValues.put("placeholder", Integer.valueOf(rawQuery.getInt(columnIndexOrThrow4)));
                contentValues.put("player_response_tracking_params", rawQuery.getBlob(columnIndexOrThrow5));
                contentValues.put("size", Integer.valueOf(rawQuery.getInt(columnIndexOrThrow6)));
                contentValues.put("saved_timestamp", Long.valueOf(rawQuery.getLong(columnIndexOrThrow7)));
                contentValues.put(str10, Integer.valueOf(rawQuery.getInt(columnIndexOrThrow8)));
                String asString = contentValues.getAsString("id");
                if (r20.containsKey(asString)) {
                    try {
                        aone builder = ((atqa) aonm.parseFrom(atqa.a, contentValues.getAsByteArray("offline_playlist_data_proto"), aomw.b())).toBuilder();
                        builder.copyOnWrite();
                        atqa atqaVar = (atqa) builder.instance;
                        atqaVar.b |= 32;
                        atqaVar.i = 0L;
                        contentValues.put("offline_playlist_data_proto", ((atqa) builder.build()).toByteArray());
                    } catch (aoob e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 64);
                        sb2.append("OfflineSchemaMigration13 duplicated playlist has invalid proto: ");
                        sb2.append(valueOf);
                        zga.b(sb2.toString());
                    }
                }
                agjc.c(r20, asString, contentValues);
                str2 = str10;
                hashMap = r20;
                str = str6;
                str4 = str7;
                str3 = str8;
                str5 = str9;
            } catch (Throwable th) {
                throw th;
            }
        }
        String str11 = str;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        rawQuery.close();
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            sQLiteDatabase.insertOrThrow("playlistsV13", null, (ContentValues) it.next());
        }
        sQLiteDatabase.execSQL("DROP TABLE playlistsV2");
        sQLiteDatabase.execSQL("CREATE TABLE channelsV13 (id TEXT PRIMARY KEY,offline_channel_data_proto BLOB)");
        HashMap hashMap2 = new HashMap();
        String c2 = yoj.c("channels", agim.a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 21);
        sb3.append(str14);
        sb3.append(c2);
        sb3.append(" FROM channels");
        rawQuery = sQLiteDatabase.rawQuery(sb3.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                int columnIndexOrThrow9 = rawQuery.getColumnIndexOrThrow("id");
                String str15 = str12;
                int columnIndexOrThrow10 = rawQuery.getColumnIndexOrThrow(str15);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("id", rawQuery.getString(columnIndexOrThrow9));
                contentValues2.put(str15, rawQuery.getBlob(columnIndexOrThrow10));
                String asString2 = contentValues2.getAsString("id");
                if (!hashMap2.containsKey(asString2)) {
                    agjc.c(hashMap2, asString2, contentValues2);
                }
                str12 = str15;
            } finally {
            }
        }
        rawQuery.close();
        Iterator it2 = hashMap2.values().iterator();
        while (it2.hasNext()) {
            sQLiteDatabase.insertOrThrow("channelsV13", null, (ContentValues) it2.next());
        }
        sQLiteDatabase.execSQL("DROP TABLE channels");
        sQLiteDatabase.execSQL("CREATE TABLE video_listsV13 (id TEXT PRIMARY KEY,size INTEGER,type INTEGER,saved_timestamp INTEGER,last_update_timestamp INTEGER)");
        HashMap hashMap3 = new HashMap();
        String c3 = yoj.c("video_lists", agip.a);
        StringBuilder sb4 = new StringBuilder(String.valueOf(c3).length() + 24);
        sb4.append(str14);
        sb4.append(c3);
        sb4.append(" FROM video_lists");
        rawQuery = sQLiteDatabase.rawQuery(sb4.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                int columnIndexOrThrow11 = rawQuery.getColumnIndexOrThrow("id");
                String str16 = str13;
                int columnIndexOrThrow12 = rawQuery.getColumnIndexOrThrow(str16);
                int columnIndexOrThrow13 = rawQuery.getColumnIndexOrThrow("size");
                String str17 = str11;
                int columnIndexOrThrow14 = rawQuery.getColumnIndexOrThrow(str17);
                int columnIndexOrThrow15 = rawQuery.getColumnIndexOrThrow("saved_timestamp");
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("id", rawQuery.getString(columnIndexOrThrow11));
                contentValues3.put(str16, Long.valueOf(rawQuery.getLong(columnIndexOrThrow12)));
                contentValues3.put("size", Integer.valueOf(rawQuery.getInt(columnIndexOrThrow13)));
                contentValues3.put(str17, Integer.valueOf(rawQuery.getInt(columnIndexOrThrow14)));
                contentValues3.put("saved_timestamp", Long.valueOf(rawQuery.getLong(columnIndexOrThrow15)));
                String asString3 = contentValues3.getAsString("id");
                if (hashMap3.containsKey(asString3)) {
                    contentValues3.put(str16, (Integer) 0);
                }
                agjc.c(hashMap3, asString3, contentValues3);
                str13 = str16;
                str11 = str17;
            } finally {
            }
        }
        rawQuery.close();
        Iterator it3 = hashMap3.values().iterator();
        while (it3.hasNext()) {
            sQLiteDatabase.insertOrThrow("video_listsV13", null, (ContentValues) it3.next());
        }
        sQLiteDatabase.execSQL("DROP TABLE video_lists");
    }
}
