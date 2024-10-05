package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjl {
    public final agik a;
    public final agjv b;
    public final shf c;
    public final List d = new ArrayList();
    private final azrw e;
    private final agid f;

    public agjl(agik agikVar, azrw azrwVar, agid agidVar, agjv agjvVar, shf shfVar) {
        this.a = agikVar;
        this.e = azrwVar;
        this.f = agidVar;
        this.b = agjvVar;
        this.c = shfVar;
    }

    public static ContentValues p(bagd bagdVar, shf shfVar, atrg atrgVar) {
        ContentValues contentValues = new ContentValues();
        long c = shfVar.c();
        contentValues.put("id", bagdVar.a);
        contentValues.put("type", Integer.valueOf(bagdVar.b));
        contentValues.put("size", Integer.valueOf(bagdVar.c));
        atrgVar.getClass();
        contentValues.put("selection_strategy", Integer.valueOf(atrgVar.e));
        contentValues.put("last_update_timestamp", Long.valueOf(c));
        return contentValues;
    }

    public final int a(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
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

    public final agnp b(String str, String str2) {
        SQLiteDatabase a = this.a.a();
        String c = yoj.c("videosV2", agju.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 205);
        sb.append("SELECT video_list_videos.video_id,");
        sb.append(c);
        sb.append(" FROM video_list_videos LEFT OUTER JOIN videosV2 ON video_list_videos.video_id = videosV2.id WHERE video_list_videos.video_list_id = ? AND video_list_videos.video_id = ?  ");
        Cursor rawQuery = a.rawQuery(sb.toString(), new String[]{str, str2});
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return null;
            }
            agmm agmmVar = (agmm) this.e.get();
            agid agidVar = this.f;
            rawQuery.getClass();
            agmmVar.getClass();
            return aedn.O(rawQuery, agmmVar, agidVar, rawQuery.getColumnIndexOrThrow("id"), rawQuery.getColumnIndexOrThrow("offline_video_data_proto"), rawQuery.getColumnIndexOrThrow("deleted"), rawQuery.getColumnIndexOrThrow("channel_id"), rawQuery.getColumnIndex("video_id"));
        } finally {
            rawQuery.close();
        }
    }

    public final atrg c(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"selection_strategy"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                atrg a = atrg.a(query.getInt(0));
                if (a == null) {
                    a = atrg.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
                }
                return a;
            }
            return atrg.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
        } finally {
            query.close();
        }
    }

    public final atrx d(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"format_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return atrx.b(query.getInt(0));
            }
            return atrx.UNKNOWN_FORMAT_TYPE;
        } finally {
            query.close();
        }
    }

    public final List e() {
        Cursor query = this.a.a().query("video_listsV13", agjk.a, null, null, null, null, "saved_timestamp DESC", null);
        try {
            return aedn.N(query, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("type"));
        } finally {
            query.close();
        }
    }

    public final List f(String str) {
        SQLiteDatabase a = this.a.a();
        String c = yoj.c("videosV2", agju.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 219);
        sb.append("SELECT video_list_videos.video_id,");
        sb.append(c);
        sb.append(" FROM video_list_videos LEFT OUTER JOIN videosV2 ON video_list_videos.video_id = videosV2.id WHERE video_list_videos.video_list_id = ? ORDER BY video_list_videos.index_in_video_list ASC");
        Cursor rawQuery = a.rawQuery(sb.toString(), new String[]{str});
        try {
            agmm agmmVar = (agmm) this.e.get();
            agid agidVar = this.f;
            rawQuery.getClass();
            agmmVar.getClass();
            return aedn.P(rawQuery, agmmVar, agidVar, rawQuery.getColumnIndexOrThrow("id"), rawQuery.getColumnIndexOrThrow("offline_video_data_proto"), rawQuery.getColumnIndexOrThrow("deleted"), rawQuery.getColumnIndexOrThrow("channel_id"), rawQuery.getColumnIndex("video_id"));
        } finally {
            rawQuery.close();
        }
    }

    public final void g(agjj agjjVar) {
        this.d.add(agjjVar);
    }

    public final void h(String str, String str2) {
        agnp b = b(str, str2);
        if (b == null) {
            return;
        }
        this.a.a().delete("video_list_videos", "video_list_id = ? AND video_id = ? ", new String[]{str, str2});
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agjj) it.next()).a(new ArrayList(amru.r(b)));
        }
    }

    public final void i(String str, String str2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_list_id", str);
        contentValues.put("video_id", str2);
        contentValues.put("index_in_video_list", Integer.valueOf(i));
        contentValues.put("saved_timestamp", Long.valueOf(this.c.c()));
        this.a.a().insertOrThrow("video_list_videos", null, contentValues);
    }

    public final boolean j(String str) {
        Cursor query = this.a.a().query("video_list_videos", new String[]{"video_list_id"}, "video_id = ?", new String[]{str}, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string) && string.startsWith("offline_candidate_video_list_")) {
                    return true;
                }
            } finally {
                query.close();
            }
        }
        return false;
    }

    public final byte[] k(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"tracking_params"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return query.getBlob(0);
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final int l(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"video_list_offline_request_source"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            int bQ = query.moveToNext() ? anaf.bQ(query.getInt(0)) : 0;
            return bQ != 0 ? bQ : 1;
        } finally {
            query.close();
        }
    }

    public final bagd m(String str) {
        Cursor query = this.a.a().query("video_listsV13", agjk.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return aedn.Q(query, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("type"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final void n(bagd bagdVar, List list) {
        String str = bagdVar.a;
        this.a.a().delete("final_video_list_video_ids", "video_list_id = ?", new String[]{str});
        for (int i = 0; i < list.size(); i++) {
            String str2 = (String) list.get(i);
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_list_id", str);
            contentValues.put("video_id", str2);
            contentValues.put("index_in_video_list", Integer.valueOf(i));
            contentValues.put("saved_timestamp", Long.valueOf(this.c.c()));
            this.a.a().insertOrThrow("final_video_list_video_ids", null, contentValues);
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agjj) it.next()).b(bagdVar, list);
        }
    }

    public final void o(bagd bagdVar) {
        long update = this.a.a().update("video_listsV13", p(bagdVar, this.c, c(bagdVar.a)), "id = ?", new String[]{bagdVar.a});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Update video list affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }

    public final void q(bagd bagdVar, List list, agnf agnfVar, atrx atrxVar, int i, int i2, byte[] bArr) {
        String str = bagdVar.a;
        Collection M = aedn.M(f(str), list);
        this.a.a().delete("video_list_videos", "video_list_id = ?", new String[]{str});
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agjj) it.next()).a(M);
        }
        HashSet hashSet = new HashSet();
        int a = ahab.a(atrxVar, 360);
        for (int i3 = 0; i3 < list.size(); i3++) {
            agnp agnpVar = (agnp) list.get(i3);
            String f = agnpVar.f();
            i(str, f, i3);
            if (!this.b.l(f)) {
                this.b.n(agnpVar, agnfVar, agno.OFFLINE_IMMEDIATELY, a, null, i, i2, this.c.c(), bArr);
                hashSet.add(f);
            }
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((agjj) it2.next()).c(bagdVar, list, hashSet, atrxVar, i2, bArr, agnfVar, agno.OFFLINE_IMMEDIATELY);
        }
    }
}
