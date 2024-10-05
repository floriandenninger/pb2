package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjv {
    public final agik a;
    public final shf b;
    private final azrw c;
    private final agid d;
    private final List e = new ArrayList();

    public agjv(agik agikVar, azrw azrwVar, shf shfVar, agid agidVar) {
        this.a = agikVar;
        this.c = azrwVar;
        this.b = shfVar;
        this.d = agidVar;
    }

    static ContentValues b(agnp agnpVar) {
        ContentValues contentValues = new ContentValues();
        if (agnpVar != null) {
            contentValues.put("id", agnpVar.f());
            contentValues.put("offline_video_data_proto", agnpVar.e.toByteArray());
            contentValues.put("deleted", Boolean.valueOf(agnpVar.c));
            agnb agnbVar = agnpVar.a;
            if (agnbVar != null) {
                contentValues.put("channel_id", agnbVar.a);
            }
        }
        return contentValues;
    }

    public final long a(String str) {
        Cursor query = this.a.a().query("videosV2", new String[]{"video_added_timestamp"}, "id = ?", new String[]{str}, null, null, null, null);
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

    public final agnf c(String str) {
        Cursor rawQuery = this.a.a().rawQuery("SELECT media_status FROM videosV2 WHERE id = ?", new String[]{str});
        try {
            if (rawQuery.moveToNext()) {
                return agnf.a(rawQuery.getInt(0));
            }
            rawQuery.close();
            return null;
        } finally {
            rawQuery.close();
        }
    }

    public final agnp d(String str) {
        Cursor query = this.a.a().query("videosV2", agju.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (!query.moveToNext()) {
                query.close();
                return null;
            }
            agmm agmmVar = (agmm) this.c.get();
            agid agidVar = this.d;
            query.getClass();
            agmmVar.getClass();
            return aedn.O(query, agmmVar, agidVar, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_video_data_proto"), query.getColumnIndexOrThrow("deleted"), query.getColumnIndexOrThrow("channel_id"), query.getColumnIndex("video_id"));
        } finally {
            query.close();
        }
    }

    public final void e(agjt agjtVar) {
        this.e.add(agjtVar);
    }

    public final void f(PlayerResponseModel playerResponseModel) {
        aami aamiVar;
        String y = playerResponseModel.y();
        agnp d = d(y);
        if (d != null && (aamiVar = d.b) != null && !aamiVar.a.isEmpty()) {
            aami d2 = ((agmm) this.c.get()).d(y, aamiVar);
            if (!d2.a.isEmpty()) {
                playerResponseModel.A(d2);
            }
        }
        playerResponseModel.A(((agmm) this.c.get()).d(y, playerResponseModel.b()));
    }

    public final void g(agnp agnpVar) {
        long delete = this.a.a().delete("videosV2", "id = ?", new String[]{agnpVar.f()});
        if (delete != 1) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("Delete video affected ");
            sb.append(delete);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((agjt) it.next()).a(agnpVar);
        }
    }

    public final void h(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_added_timestamp", Long.valueOf(j));
        long update = this.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(69);
        sb.append("Update video video_added_timestamp affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final void i(String str, agnf agnfVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_status", Integer.valueOf(agnfVar.q));
        long update = this.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Update video media status affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final void j(agnp agnpVar) {
        ContentValues b = b(agnpVar);
        b.put("metadata_timestamp", Long.valueOf(this.b.c()));
        long update = this.a.a().update("videosV2", b, "id = ?", new String[]{agnpVar.f()});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Update video affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final void k(String str, PlayerResponseModel playerResponseModel, long j, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("player_response_proto", playerResponseModel.H());
        atqq r = playerResponseModel.r();
        String str2 = null;
        if (r != null && (r.b & 1) != 0) {
            str2 = r.e;
        }
        if (str2 != null) {
            contentValues.put("refresh_token", str2);
        } else {
            contentValues.putNull("refresh_token");
        }
        contentValues.put("saved_timestamp", Long.valueOf(j));
        contentValues.put("last_refresh_timestamp", Long.valueOf(j2));
        contentValues.put("streams_timestamp", Long.valueOf(this.b.c()));
        long update = this.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(69);
        sb.append("Update video player_response_proto affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final boolean l(String str) {
        return yoj.a(this.a.a(), "videosV2", "id = ?", new String[]{str}) > 0;
    }

    public final boolean m(String str) {
        return yoj.a(this.a.a(), "videosV2", "id = ? AND media_status != ?", new String[]{str, Integer.toString(agnf.DELETED.q)}) > 0;
    }

    public final void n(agnp agnpVar, agnf agnfVar, agno agnoVar, int i, String str, int i2, int i3, long j, byte[] bArr) {
        ContentValues b = b(agnpVar);
        b.put("metadata_timestamp", Long.valueOf(this.b.c()));
        b.put("media_status", Integer.valueOf(agnfVar.q));
        b.put("stream_transfer_condition", Integer.valueOf(agnoVar.g));
        b.put("preferred_stream_quality", Integer.valueOf(i));
        b.put("offline_audio_quality", Integer.valueOf(i2 - 1));
        b.put("video_added_timestamp", Long.valueOf(j));
        b.put("offline_source_ve_type", Integer.valueOf(i3));
        if (str != null) {
            b.put("audio_track_id", str);
        }
        if (bArr != null) {
            b.put("player_response_tracking_params", bArr);
        }
        this.a.a().insertOrThrow("videosV2", null, b);
    }
}
