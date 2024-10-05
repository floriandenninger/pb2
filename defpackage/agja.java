package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agja implements yom {
    private final HashMap a = new HashMap();

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.yom
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str8 = "media_status";
        String str9 = "last_refresh_timestamp";
        String str10 = "last_playback_timestamp";
        String str11 = "size";
        String str12 = "owner";
        String str13 = "author";
        sQLiteDatabase2.execSQL("CREATE TABLE playlistsV2 (id TEXT PRMARY KEY,offline_playlist_data_proto BLOB,placeholder INTEGER,channel_id TEXT,size INTEGER,preferred_stream_quality INTEGER,saved_timestamp INTEGER)");
        String c = yoj.c("playlists", agin.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 22);
        String str14 = "SELECT ";
        sb.append("SELECT ");
        sb.append(c);
        sb.append(" FROM playlists");
        Cursor rawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
        while (true) {
            try {
                str = "title";
                str2 = "saved_timestamp";
                str3 = str8;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                ContentValues contentValues = new ContentValues();
                String str15 = str9;
                String string = rawQuery.getString(rawQuery.getColumnIndex("id"));
                String str16 = str10;
                String string2 = rawQuery.getString(rawQuery.getColumnIndex(str13));
                String str17 = str12;
                String h = yoj.h(rawQuery, rawQuery.getColumnIndex(str13));
                String str18 = str13;
                aone createBuilder = atos.a.createBuilder();
                createBuilder.copyOnWrite();
                String str19 = str14;
                atos atosVar = (atos) createBuilder.instance;
                h.getClass();
                atosVar.b |= 1;
                atosVar.c = h;
                createBuilder.copyOnWrite();
                atos atosVar2 = (atos) createBuilder.instance;
                h.getClass();
                atosVar2.b |= 4;
                atosVar2.e = h;
                avgg avggVar = avgg.a;
                createBuilder.copyOnWrite();
                atos atosVar3 = (atos) createBuilder.instance;
                avggVar.getClass();
                atosVar3.d = avggVar;
                atosVar3.b |= 2;
                atos atosVar4 = (atos) createBuilder.build();
                aone createBuilder2 = atqa.a.createBuilder();
                String h2 = yoj.h(rawQuery, rawQuery.getColumnIndex("id"));
                createBuilder2.copyOnWrite();
                String str20 = str11;
                atqa atqaVar = (atqa) createBuilder2.instance;
                h2.getClass();
                atqaVar.b |= 1;
                atqaVar.c = h2;
                String h3 = yoj.h(rawQuery, rawQuery.getColumnIndex("title"));
                createBuilder2.copyOnWrite();
                atqa atqaVar2 = (atqa) createBuilder2.instance;
                h3.getClass();
                atqaVar2.b |= 8;
                atqaVar2.g = h3;
                long j = rawQuery.getLong(rawQuery.getColumnIndex("updated_date")) / 1000;
                createBuilder2.copyOnWrite();
                atqa atqaVar3 = (atqa) createBuilder2.instance;
                atqaVar3.b |= 32;
                atqaVar3.i = j;
                avgg avggVar2 = avgg.a;
                createBuilder2.copyOnWrite();
                atqa atqaVar4 = (atqa) createBuilder2.instance;
                avggVar2.getClass();
                atqaVar4.d = avggVar2;
                atqaVar4.b |= 2;
                String h4 = yoj.h(rawQuery, rawQuery.getColumnIndex("content_uri"));
                createBuilder2.copyOnWrite();
                atqa atqaVar5 = (atqa) createBuilder2.instance;
                h4.getClass();
                atqaVar5.b |= 16;
                atqaVar5.h = h4;
                aone createBuilder3 = atot.a.createBuilder();
                createBuilder3.copyOnWrite();
                atot atotVar = (atot) createBuilder3.instance;
                atosVar4.getClass();
                atotVar.c = atosVar4;
                atotVar.b |= 1;
                createBuilder2.copyOnWrite();
                atqa atqaVar6 = (atqa) createBuilder2.instance;
                atot atotVar2 = (atot) createBuilder3.build();
                atotVar2.getClass();
                atqaVar6.e = atotVar2;
                atqaVar6.b |= 4;
                atqa atqaVar7 = (atqa) createBuilder2.build();
                HashMap hashMap = this.a;
                atot atotVar3 = atqaVar7.e;
                if (atotVar3 == null) {
                    atotVar3 = atot.a;
                }
                hashMap.put(h, atotVar3);
                if (string == null || string2 == null || atqaVar7 == null) {
                    str7 = str20;
                    contentValues = null;
                } else {
                    contentValues.put("id", string);
                    contentValues.put("channel_id", string2);
                    contentValues.put("offline_playlist_data_proto", atqaVar7.toByteArray());
                    contentValues.put("placeholder", Boolean.valueOf(yoj.g(rawQuery, rawQuery.getColumnIndex("placeholder"), false)));
                    contentValues.put("saved_timestamp", Long.valueOf(rawQuery.getLong(rawQuery.getColumnIndex("saved_timestamp"))));
                    contentValues.put("preferred_stream_quality", Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("preferred_stream_quality"))));
                    str7 = str20;
                    contentValues.put(str7, Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(str7))));
                }
                if (contentValues != null) {
                    sQLiteDatabase.insertOrThrow("playlistsV2", null, contentValues);
                    str11 = str7;
                    sQLiteDatabase2 = sQLiteDatabase;
                    str8 = str3;
                    str9 = str15;
                    str10 = str16;
                    str12 = str17;
                    str14 = str19;
                    str13 = str18;
                } else {
                    str11 = str7;
                    str8 = str3;
                    str9 = str15;
                    str10 = str16;
                    str12 = str17;
                    str14 = str19;
                    str13 = str18;
                    sQLiteDatabase2 = sQLiteDatabase;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String str21 = str9;
        String str22 = str10;
        String str23 = str12;
        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase2;
        rawQuery.close();
        sQLiteDatabase3.execSQL("DROP TABLE playlists");
        sQLiteDatabase3.execSQL("CREATE TABLE videosV2 (id TEXT PRIMARY KEY,offline_video_data_proto BLOB,deleted INTEGER,channel_id TEXT,refresh_token TEXT,saved_timestamp INTEGER,last_refresh_timestamp INTEGER,last_playback_timestamp INTEGER,media_status INTEGER,preferred_stream_quality INTEGER,player_response_proto BLOB)");
        String c2 = yoj.c("videos", agiq.a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 19);
        sb2.append(str14);
        sb2.append(c2);
        sb2.append(" FROM videos");
        rawQuery = sQLiteDatabase3.rawQuery(sb2.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                ContentValues contentValues2 = new ContentValues();
                String string3 = rawQuery.getString(rawQuery.getColumnIndex("id"));
                String str24 = str23;
                String string4 = rawQuery.getString(rawQuery.getColumnIndex(str24));
                aone createBuilder4 = atqx.a.createBuilder();
                String h5 = yoj.h(rawQuery, rawQuery.getColumnIndex("id"));
                createBuilder4.copyOnWrite();
                atqx atqxVar = (atqx) createBuilder4.instance;
                h5.getClass();
                atqxVar.b |= 1;
                atqxVar.c = h5;
                String h6 = yoj.h(rawQuery, rawQuery.getColumnIndex(str));
                createBuilder4.copyOnWrite();
                atqx atqxVar2 = (atqx) createBuilder4.instance;
                h6.getClass();
                atqxVar2.b |= 8;
                atqxVar2.f = h6;
                aqyg g = ajcq.g(yoj.h(rawQuery, rawQuery.getColumnIndex("description")));
                createBuilder4.copyOnWrite();
                atqx atqxVar3 = (atqx) createBuilder4.instance;
                g.getClass();
                atqxVar3.k = g;
                atqxVar3.b |= 512;
                String str25 = str2;
                String i = zhq.i(rawQuery.getInt(rawQuery.getColumnIndex("duration")));
                createBuilder4.copyOnWrite();
                atqx atqxVar4 = (atqx) createBuilder4.instance;
                i.getClass();
                atqxVar4.b |= 16;
                atqxVar4.g = i;
                String valueOf = String.valueOf(rawQuery.getLong(rawQuery.getColumnIndex("likes_count")));
                createBuilder4.copyOnWrite();
                atqx atqxVar5 = (atqx) createBuilder4.instance;
                valueOf.getClass();
                atqxVar5.b |= 2048;
                atqxVar5.m = valueOf;
                String valueOf2 = String.valueOf(rawQuery.getLong(rawQuery.getColumnIndex("dislikes_count")));
                createBuilder4.copyOnWrite();
                atqx atqxVar6 = (atqx) createBuilder4.instance;
                valueOf2.getClass();
                atqxVar6.b |= 4096;
                atqxVar6.n = valueOf2;
                long j2 = rawQuery.getLong(rawQuery.getColumnIndex("upload_date")) / 1000;
                createBuilder4.copyOnWrite();
                atqx atqxVar7 = (atqx) createBuilder4.instance;
                String str26 = str;
                atqxVar7.b |= 32;
                atqxVar7.h = j2;
                avgg avggVar3 = avgg.a;
                createBuilder4.copyOnWrite();
                atqx atqxVar8 = (atqx) createBuilder4.instance;
                avggVar3.getClass();
                atqxVar8.d = avggVar3;
                atqxVar8.b |= 2;
                String h7 = yoj.h(rawQuery, rawQuery.getColumnIndex("watch_uri"));
                createBuilder4.copyOnWrite();
                atqx atqxVar9 = (atqx) createBuilder4.instance;
                h7.getClass();
                atqxVar9.b |= 256;
                atqxVar9.j = h7;
                aone createBuilder5 = atos.a.createBuilder();
                String h8 = yoj.h(rawQuery, rawQuery.getColumnIndex(str24));
                createBuilder5.copyOnWrite();
                atos atosVar5 = (atos) createBuilder5.instance;
                h8.getClass();
                atosVar5.b |= 1;
                atosVar5.c = h8;
                String h9 = yoj.h(rawQuery, rawQuery.getColumnIndex("owner_display_name"));
                createBuilder5.copyOnWrite();
                atos atosVar6 = (atos) createBuilder5.instance;
                h9.getClass();
                atosVar6.b |= 4;
                atosVar6.e = h9;
                avgg avggVar4 = avgg.a;
                createBuilder5.copyOnWrite();
                atos atosVar7 = (atos) createBuilder5.instance;
                avggVar4.getClass();
                atosVar7.d = avggVar4;
                atosVar7.b |= 2;
                atos atosVar8 = (atos) createBuilder5.build();
                aone createBuilder6 = atot.a.createBuilder();
                createBuilder6.copyOnWrite();
                atot atotVar4 = (atot) createBuilder6.instance;
                atosVar8.getClass();
                atotVar4.c = atosVar8;
                atotVar4.b |= 1;
                createBuilder4.copyOnWrite();
                atqx atqxVar10 = (atqx) createBuilder4.instance;
                atot atotVar5 = (atot) createBuilder6.build();
                atotVar5.getClass();
                atqxVar10.e = atotVar5;
                atqxVar10.b |= 4;
                HashMap hashMap2 = this.a;
                atot atotVar6 = ((atqx) createBuilder4.instance).e;
                if (atotVar6 == null) {
                    atotVar6 = atot.a;
                }
                atos atosVar9 = atotVar6.c;
                if (atosVar9 == null) {
                    atosVar9 = atos.a;
                }
                String str27 = atosVar9.c;
                atot atotVar7 = ((atqx) createBuilder4.instance).e;
                if (atotVar7 == null) {
                    atotVar7 = atot.a;
                }
                hashMap2.put(str27, atotVar7);
                long j3 = rawQuery.getLong(rawQuery.getColumnIndex("view_count"));
                createBuilder4.copyOnWrite();
                atqx atqxVar11 = (atqx) createBuilder4.instance;
                atqxVar11.b |= 64;
                atqxVar11.i = j3;
                String valueOf3 = String.valueOf(j3);
                createBuilder4.copyOnWrite();
                atqx atqxVar12 = (atqx) createBuilder4.instance;
                valueOf3.getClass();
                atqxVar12.b |= 1024;
                atqxVar12.l = valueOf3;
                atqx atqxVar13 = (atqx) createBuilder4.build();
                if (string3 == null || string4 == null || atqxVar13 == null) {
                    str4 = str3;
                    str5 = str21;
                    str6 = str22;
                    contentValues2 = null;
                } else {
                    contentValues2.put("id", string3);
                    contentValues2.put("channel_id", string4);
                    contentValues2.put("offline_video_data_proto", atqxVar13.toByteArray());
                    contentValues2.put("deleted", Boolean.valueOf(TextUtils.equals(rawQuery.getString(rawQuery.getColumnIndex("state")), "OFFLINE_DELETED")));
                    str6 = str22;
                    contentValues2.put(str6, Long.valueOf(rawQuery.getLong(rawQuery.getColumnIndex(str6))));
                    contentValues2.put(str25, Long.valueOf(rawQuery.getLong(rawQuery.getColumnIndex(str25))));
                    str5 = str21;
                    contentValues2.put(str5, Long.valueOf(rawQuery.getLong(rawQuery.getColumnIndex(str5))));
                    str4 = str3;
                    contentValues2.put(str4, Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(str4))));
                    contentValues2.put("preferred_stream_quality", Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("preferred_stream_quality"))));
                    contentValues2.put("player_response_proto", rawQuery.getBlob(rawQuery.getColumnIndex("player_response_proto")));
                    contentValues2.put("refresh_token", rawQuery.getString(rawQuery.getColumnIndex("refresh_token")));
                }
                if (contentValues2 != null) {
                    sQLiteDatabase3.insertOrThrow("videosV2", null, contentValues2);
                }
                str22 = str6;
                str21 = str5;
                str3 = str4;
                str2 = str25;
                str = str26;
                str23 = str24;
            } finally {
                rawQuery.close();
            }
        }
        rawQuery.close();
        sQLiteDatabase3.execSQL("DROP TABLE videos");
        sQLiteDatabase3.execSQL("CREATE TABLE channels (id TEXT PRMARY KEY,offline_channel_data_proto BLOB)");
        for (Map.Entry entry : this.a.entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("id", (String) entry.getKey());
            contentValues3.put("offline_channel_data_proto", ((atot) entry.getValue()).toByteArray());
            sQLiteDatabase3.insertOrThrow("channels", null, contentValues3);
        }
    }
}
