package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agiz implements yom {
    private final /* synthetic */ int a;

    public agiz(int i) {
        this.a = i;
    }

    @Override // defpackage.yom
    public final void a(SQLiteDatabase sQLiteDatabase) {
        switch (this.a) {
            case 0:
                sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN playlist_added_timestamp_millis INTEGER DEFAULT 0");
                return;
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN video_added_timestamp INTEGER DEFAULT 0");
                return;
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN storage_id TEXT DEFAULT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN expired_stream INTEGER DEFAULT 0");
                return;
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN playlist_offline_request_source INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN video_list_offline_request_source INTEGER DEFAULT 0");
                return;
            case 4:
                sQLiteDatabase.execSQL("CREATE TABLE hashes (video_id TEXT,itag INTEGER,storage_id TEXT,merkle_level INTEGER,block_index INTEGER,digest BLOB,hash_state BLOB,matches_bytes_on_disk INTEGER, PRIMARY KEY (video_id, itag, merkle_level, block_index))");
                return;
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE subtitles ADD COLUMN track_vss_id TEXT NOT NULL DEFAULT '-'");
                return;
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN offline_audio_quality INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN offline_audio_quality INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN offline_audio_quality INTEGER DEFAULT 0");
                return;
            case 7:
                sQLiteDatabase.execSQL("CREATE TABLE subscriptionsV31 (id TEXT PRIMARY KEY,display_state INTEGER DEFAULT 0,should_sync_to_server BOOLEAN,client_modified_timestamp INTEGER,click_tracking_params BLOB DEFAULT NULL)");
                return;
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE drm ADD COLUMN drm_params TEXT ");
                return;
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN last_playback_position_timestamp INTEGER DEFAULT 0");
                return;
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN ytb_uri TEXT DEFAULT NULL");
                return;
            case 11:
                amsv amsvVar = new amsv();
                Cursor query = sQLiteDatabase.query("streams", new String[]{"video_id", "itag", "external_yt_file_path"}, "external_yt_file_path IS NOT NULL", null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(query.getColumnIndex("video_id"));
                        int i = query.getInt(query.getColumnIndex("itag"));
                        String string2 = query.getString(query.getColumnIndex("external_yt_file_path"));
                        if (!TextUtils.isEmpty(string2)) {
                            Uri fromFile = Uri.fromFile(new File(string2));
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("video_id", string);
                            contentValues.put("itag", Integer.valueOf(i));
                            contentValues.put("ytb_uri", fromFile.toString());
                            amsvVar.c(contentValues);
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
                amxd listIterator = amsvVar.g().listIterator();
                while (listIterator.hasNext()) {
                    ContentValues contentValues2 = (ContentValues) listIterator.next();
                    String[] strArr = {contentValues2.getAsString("video_id"), contentValues2.getAsString("itag")};
                    contentValues2.remove("video_id");
                    contentValues2.remove("itag");
                    int update = sQLiteDatabase.update("streams", contentValues2, "video_id = ? AND itag = ?", strArr);
                    if (update != 1) {
                        zga.e("Unexpected number of rows affected (%d) when populating streams URI column for (%s, %s)", new Object[]{Integer.valueOf(update), strArr[0], strArr[1]});
                    }
                }
                return;
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN playlist_client_last_invalidation_timestamp INTEGER DEFAULT 0");
                return;
            case 13:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN audio_track_id TEXT DEFAULT NULL");
                return;
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE videos ADD COLUMN preferred_stream_quality INTEGER NOT NULL DEFAULT 360");
                sQLiteDatabase.execSQL("ALTER TABLE playlists ADD COLUMN preferred_stream_quality INTEGER NOT NULL DEFAULT 360");
                return;
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE playlists ADD COLUMN placeholder INTEGER NOT NULL DEFAULT 0");
                return;
            case 16:
                sQLiteDatabase.execSQL("CREATE TABLE subtitles_v5 (video_id STRING,language_code STRING,subtitles_path STRING,track_vss_id STRING,user_visible_track_name STRING)");
                sQLiteDatabase.execSQL("CREATE INDEX idx_subtitles_video_id_v5 ON subtitles_v5 (video_id ASC)");
                sQLiteDatabase.execSQL("INSERT INTO subtitles_v5(video_id,language_code,subtitles_path,track_vss_id,user_visible_track_name) SELECT video_id,language_code,subtitles_path,track_vss_id, (language_name || ' - ' || track_name) FROM subtitles WHERE (track_name IS NOT NULL AND track_name <> '' AND track_name != language_name)");
                sQLiteDatabase.execSQL("INSERT INTO subtitles_v5(video_id,language_code,subtitles_path,track_vss_id,user_visible_track_name) SELECT video_id,language_code,subtitles_path,track_vss_id,language_name FROM subtitles WHERE NOT (track_name IS NOT NULL AND track_name <> '' AND track_name != language_name)");
                sQLiteDatabase.execSQL("DROP TABLE subtitles");
                return;
            case 17:
                sQLiteDatabase.execSQL("CREATE TABLE drm (video_id TEXT,key_set_id BLOB,mimetype STRING,pssh_data BLOB,license_server_url STRING,last_updated_timestamp INTEGER,last_update_gls_authorized_formats STRING,last_update_sdk_version INTEGER,last_update_attempt_timestamp INTEGER,last_update_attempt_http_code INTEGER,last_update_attempt_gls_code INTEGER, PRIMARY KEY (video_id))");
                sQLiteDatabase.execSQL("CREATE INDEX idx_drm_video_id ON drm (video_id)");
                return;
            default:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN player_response_tracking_params BLOB DEFAULT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE playlistsV2 ADD COLUMN player_response_tracking_params BLOB DEFAULT NULL");
                return;
        }
    }
}
