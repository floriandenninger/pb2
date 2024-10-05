package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agiv {
    public final agik a;
    public final shf b;
    public final agjv c;
    public final agzr d;
    public final List e = new ArrayList();
    private final azrw f;
    private final agid g;

    public agiv(agik agikVar, azrw azrwVar, shf shfVar, agid agidVar, agjv agjvVar, agzr agzrVar) {
        this.a = agikVar;
        this.f = azrwVar;
        this.b = shfVar;
        this.g = agidVar;
        this.c = agjvVar;
        this.d = agzrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ContentValues e(agng agngVar, shf shfVar) {
        byte[] byteArray;
        ContentValues contentValues = new ContentValues();
        atqa atqaVar = agngVar.l;
        agnb agnbVar = agngVar.c;
        if (atqaVar != null) {
            byteArray = atqaVar.toByteArray();
        } else {
            byteArray = atqa.a.toByteArray();
        }
        contentValues.put("id", agngVar.a);
        contentValues.put("offline_playlist_data_proto", byteArray);
        contentValues.put("size", Integer.valueOf(agngVar.f));
        contentValues.put("saved_timestamp", Long.valueOf(shfVar.c()));
        contentValues.put("placeholder", Boolean.valueOf(agngVar.h));
        if (agnbVar != null) {
            contentValues.put("channel_id", agnbVar.a);
        }
        return contentValues;
    }

    public final int a(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"offline_source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return query.getInt(0);
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    public final int b(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"preferred_stream_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return query.getInt(0);
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    public final long c(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"playlist_added_timestamp_millis"}, "id = ?", new String[]{str}, null, null, null);
        try {
            if (query.moveToNext()) {
                return query.getLong(0);
            }
            query.close();
            return 0L;
        } finally {
            query.close();
        }
    }

    public final long d(String str) {
        Cursor rawQuery = this.a.a().rawQuery("SELECT saved_timestamp FROM playlistsV13 WHERE id=?", new String[]{str});
        try {
            if (rawQuery.moveToNext()) {
                return rawQuery.getLong(0);
            }
            rawQuery.close();
            return 0L;
        } finally {
            rawQuery.close();
        }
    }

    public final agng f(String str) {
        Cursor query = this.a.a().query("playlistsV13", agiu.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return aedn.R(query, (agmm) this.f.get(), this.g, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_playlist_data_proto"), query.getColumnIndexOrThrow("placeholder"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("channel_id"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final List g() {
        Cursor query = this.a.a().query("playlistsV13", agiu.a, null, null, null, null, "saved_timestamp DESC", null);
        try {
            try {
                return aedn.S(query, (agmm) this.f.get(), this.g, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_playlist_data_proto"), query.getColumnIndexOrThrow("placeholder"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("channel_id"));
            } catch (SQLiteException e) {
                afsi.c(2, 28, "Issue with playlists store", e);
                throw e;
            }
        } finally {
            query.close();
        }
    }

    public final List h() {
        SQLiteDatabase a = this.a.a();
        String c = yoj.c("videosV2", agju.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 174);
        sb.append("SELECT ");
        sb.append(c);
        sb.append(" FROM videosV2 INNER JOIN playlist_video ON videosV2.id = playlist_video.video_id WHERE playlist_video.playlist_id IS NULL ORDER BY playlist_video.saved_timestamp DESC");
        Cursor rawQuery = a.rawQuery(sb.toString(), null);
        try {
            agmm agmmVar = (agmm) this.f.get();
            agid agidVar = this.g;
            rawQuery.getClass();
            agmmVar.getClass();
            return aedn.P(rawQuery, agmmVar, agidVar, rawQuery.getColumnIndexOrThrow("id"), rawQuery.getColumnIndexOrThrow("offline_video_data_proto"), rawQuery.getColumnIndexOrThrow("deleted"), rawQuery.getColumnIndexOrThrow("channel_id"), rawQuery.getColumnIndex("video_id"));
        } finally {
            rawQuery.close();
        }
    }

    public final List i(String str) {
        SQLiteDatabase a = this.a.a();
        String c = yoj.c("videosV2", agju.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 200);
        sb.append("SELECT playlist_video.video_id,");
        sb.append(c);
        sb.append(" FROM playlist_video LEFT OUTER JOIN videosV2 ON playlist_video.video_id = videosV2.id WHERE playlist_video.playlist_id = ? ORDER BY playlist_video.index_in_playlist ASC");
        Cursor rawQuery = a.rawQuery(sb.toString(), new String[]{str});
        try {
            agmm agmmVar = (agmm) this.f.get();
            agid agidVar = this.g;
            rawQuery.getClass();
            agmmVar.getClass();
            return aedn.P(rawQuery, agmmVar, agidVar, rawQuery.getColumnIndexOrThrow("id"), rawQuery.getColumnIndexOrThrow("offline_video_data_proto"), rawQuery.getColumnIndexOrThrow("deleted"), rawQuery.getColumnIndexOrThrow("channel_id"), rawQuery.getColumnIndex("video_id"));
        } finally {
            rawQuery.close();
        }
    }

    public final void j(agit agitVar) {
        this.e.add(agitVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(String str) {
        this.a.a().delete("playlist_video", "playlist_id IS NULL AND video_id = ?", new String[]{str});
    }

    public final void l(String str) {
        Cursor rawQuery = this.a.a().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id IS NULL AND video_id =?", new String[]{str});
        try {
            if (rawQuery.getCount() > 0) {
                return;
            }
            rawQuery.close();
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("playlist_id");
            contentValues.put("video_id", str);
            contentValues.put("saved_timestamp", Long.valueOf(this.b.c()));
            this.a.a().insertOrThrow("playlist_video", null, contentValues);
        } finally {
            rawQuery.close();
        }
    }

    public final boolean m(String str) {
        return yoj.a(this.a.a(), "playlist_video", "playlist_id IS NULL AND video_id = ?", new String[]{str}) > 0;
    }

    public final boolean n(String str) {
        return yoj.a(this.a.a(), "playlist_video", "playlist_id IS NOT NULL AND video_id = ?", new String[]{str}) > 0;
    }

    public final int o(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"playlist_offline_request_source"}, "id = ?", new String[]{str}, null, null, null);
        try {
            int bQ = query.moveToNext() ? anaf.bQ(query.getInt(0)) : 0;
            return bQ != 0 ? bQ : 1;
        } finally {
            query.close();
        }
    }
}
