package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wcz implements yom {
    private final /* synthetic */ int a;

    public wcz(int i) {
        this.a = i;
    }

    @Override // defpackage.yom
    public final void a(SQLiteDatabase sQLiteDatabase) {
        switch (this.a) {
            case 0:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN id TEXT");
                return;
            case 1:
                sQLiteDatabase.execSQL("CREATE TABLE identity (account TEXT,gaia_id TEXT,profile_display_name TEXT,profile_display_email TEXT,profile_thumbnail_uri TEXT, PRIMARY KEY (account,gaia_id) ON CONFLICT REPLACE)");
                return;
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN profile_account_name_proto BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN profile_account_photo_thumbnails_proto BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN profile_mobile_banner_thumbnails_proto BLOB");
                return;
            case 3:
                sQLiteDatabase.execSQL("CREATE TABLE identity_temp(id TEXT PRIMARY KEY,account TEXT,page_id TEXT)");
                sQLiteDatabase.execSQL("CREATE TABLE profile(id TEXT PRIMARY KEY,profile_display_name TEXT,profile_display_email TEXT,profile_thumbnail_uri TEXT,profile_account_name_proto BLOB,profile_account_photo_thumbnails_proto BLOB,profile_mobile_banner_thumbnails_proto BLOB,FOREIGN KEY(id) REFERENCES identity(id));");
                sQLiteDatabase.execSQL("INSERT OR IGNORE INTO identity_temp(id, account, page_id) SELECT id, account, gaia_id FROM identity");
                sQLiteDatabase.execSQL("INSERT OR IGNORE INTO profile(id, profile_display_name, profile_display_email, profile_thumbnail_uri, profile_account_name_proto, profile_account_photo_thumbnails_proto, profile_mobile_banner_thumbnails_proto) SELECT id, profile_display_name, profile_display_email, profile_thumbnail_uri, profile_account_name_proto, profile_account_photo_thumbnails_proto, profile_mobile_banner_thumbnails_proto FROM identity");
                sQLiteDatabase.execSQL("DROP TABLE identity");
                sQLiteDatabase.execSQL("ALTER TABLE identity_temp RENAME TO identity");
                return;
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_persona INTEGER DEFAULT 0");
                return;
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN datasync_id TEXT");
                return;
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_unicorn INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_griffin INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_teenacorn INTEGER DEFAULT 0");
                return;
            case 7:
                int i = agno.OFFLINE_IMMEDIATELY.g;
                StringBuilder sb = new StringBuilder(85);
                sb.append("ALTER TABLE videosV2 ADD COLUMN stream_transfer_condition INTEGER DEFAULT ");
                sb.append(i);
                sQLiteDatabase.execSQL(sb.toString());
                return;
            case 8:
                sQLiteDatabase.execSQL("CREATE TABLE channelSubscriptions (channel_id TEXT PRIMARY KEY,preferred_stream_quality INTEGER,channel_offlineability_proto BLOB,channel_video_option_proto BLOB,saved_time INTEGER,last_check_time INTEGER)");
                return;
            case 9:
                sQLiteDatabase.execSQL("CREATE TABLE video_lists (id TEXT PRMARY KEY,size INTEGER,type INTEGER,saved_timestamp INTEGER,last_update_timestamp INTEGER)");
                sQLiteDatabase.execSQL("CREATE TABLE video_list_videos (video_list_id TEXT,video_id TEXT,index_in_video_list INTEGER,saved_timestamp INTEGER)");
                sQLiteDatabase.execSQL("CREATE INDEX idx_video_list_video_id ON video_list_videos (video_id ASC)");
                return;
            case 10:
                sQLiteDatabase.execSQL("CREATE TABLE final_video_list_video_ids (video_list_id TEXT,video_id TEXT,index_in_video_list INTEGER,saved_timestamp INTEGER)");
                sQLiteDatabase.execSQL("CREATE INDEX idx_final_video_list_id ON final_video_list_video_ids (video_id ASC)");
                return;
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN offline_source_ve_type INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN offline_source_ve_type INTEGER DEFAULT 0");
                return;
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN selection_strategy INTEGER DEFAULT 0");
                return;
            case 13:
                sQLiteDatabase.execSQL("DROP TABLE channelSubscriptions");
                return;
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN format_type INTEGER DEFAULT 0");
                int i2 = agno.OFFLINE_IMMEDIATELY.g;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("ALTER TABLE video_listsV13 ADD COLUMN stream_transfer_condition INTEGER DEFAULT ");
                sb2.append(i2);
                sQLiteDatabase.execSQL(sb2.toString());
                sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN source_ve_type INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN tracking_params BLOB DEFAULT NULL");
                return;
            case 15:
                sQLiteDatabase.execSQL("CREATE TABLE streams (video_id TEXT,itag INTEGER,format_stream_proto BLOB,duration_millis INTEGER,audio_only INTEGER,bytes_total INTEGER, bytes_transferred INTEGER, PRIMARY KEY (video_id, itag))");
                sQLiteDatabase.execSQL("CREATE TABLE videos (id TEXT PRIMARY KEY,watch_uri TEXT,title TEXT,duration INTEGER,view_count INTEGER,likes_count INTEGER,dislikes_count INTEGER,owner TEXT,owner_display_name TEXT,owner_uri TEXT,upload_date INTEGER,published_date INTEGER,tags TEXT,description TEXT,subtitle_tracks_uri TEXT,state TEXT,refresh_token TEXT,saved_timestamp INTEGER,last_refresh_timestamp INTEGER,last_playback_timestamp INTEGER,media_status INTEGER,player_response_proto BLOB)");
                sQLiteDatabase.execSQL("CREATE TABLE playlists (id TEXT PRMARY KEY,title TEXT,summary TEXT,author TEXT,updated_date INTEGER,content_uri TEXT,size INTEGER,saved_timestamp INTEGER)");
                sQLiteDatabase.execSQL("CREATE TABLE playlist_video (playlist_id STRING,video_id STRING,index_in_playlist INTEGER,saved_timestamp INTEGER)");
                sQLiteDatabase.execSQL("CREATE INDEX idx_playlists_video_id ON playlist_video (video_id ASC)");
                sQLiteDatabase.execSQL("CREATE TABLE subtitles (video_id STRING,language_code STRING,source_language_code STRING,language_name STRING,track_name STRING,format INTEGER,subtitles_path STRING)");
                sQLiteDatabase.execSQL("CREATE INDEX idx_subtitles_video_id ON subtitles (video_id ASC)");
                sQLiteDatabase.execSQL("CREATE TABLE adbreaks (original_video_id TEXT PRIMARY KEY,adbreaks BLOB)");
                sQLiteDatabase.execSQL("CREATE TABLE ads (original_video_id TEXT,ad_break_id TEXT,ad_video_id TEXT,vast_type INTEGER,expiry_timestamp INTEGER,asset_frequency_cap INTEGER,vast_playback_count INTEGER DEFAULT 0,vast BLOB,PRIMARY KEY (original_video_id, ad_break_id))");
                sQLiteDatabase.execSQL("CREATE INDEX idx_ad_video_id_original_video_id ON ads (ad_video_id ASC,original_video_id ASC)");
                sQLiteDatabase.execSQL("CREATE TABLE ad_videos (ad_video_id TEXT PRIMARY KEY,playback_count INTEGER,status INTEGER)");
                return;
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE ads ADD COLUMN ad_intro_video_id TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE ads ADD COLUMN ad_intro_player_response BLOB DEFAULT NULL");
                return;
            case 17:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN watch_next_proto BLOB DEFAULT NULL");
                return;
            case 18:
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN stream_status INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN stream_status_timestamp INTEGER DEFAULT 0");
                return;
            case 19:
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN transfer_added_timestamp INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN transfer_completed_timestamp INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN transfer_started_timestamp INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN storage_format INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN wrapped_key BLOB DEFAULT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN disco_key_iv BLOB DEFAULT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN disco_key BLOB DEFAULT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN disco_nonce_text BLOB DEFAULT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN encryption_key_type INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN video_preview_proto BLOB DEFAULT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN download_attempts INTEGER DEFAULT 0");
                return;
            default:
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN external_yt_file_path TEXT DEFAULT NULL");
                return;
        }
    }
}
