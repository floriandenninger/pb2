package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agep implements agsj {
    private final azrw a;

    public agep(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.agsj
    public final int a(String str, int i) {
        yjk.e();
        Cursor query = ((agis) this.a.get()).b.a().query("hashes", new String[]{"merkle_level"}, "video_id = ? AND itag = ?", new String[]{str, Integer.toString(i)}, null, null, "merkle_level DESC", "1");
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("merkle_level");
            if (query.moveToNext()) {
                return query.getInt(columnIndexOrThrow);
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    @Override // defpackage.agsj
    public final agne b(String str, int i, int i2) {
        yjk.e();
        Cursor query = ((agis) this.a.get()).b.a().query("hashes", agis.a, "video_id = ? AND itag = ? AND merkle_level = ?", new String[]{str, Integer.toString(i), Integer.toString(i2)}, null, null, "block_index DESC", "1");
        try {
            if (query.moveToNext()) {
                query.getClass();
                return aedn.T(query, query.getColumnIndexOrThrow("video_id"), query.getColumnIndexOrThrow("itag"), query.getColumnIndexOrThrow("storage_id"), query.getColumnIndexOrThrow("merkle_level"), query.getColumnIndexOrThrow("block_index"), query.getColumnIndexOrThrow("digest"), query.getColumnIndexOrThrow("hash_state"), query.getColumnIndexOrThrow("matches_bytes_on_disk"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    @Override // defpackage.agsj
    public final agne c(String str, int i, int i2, int i3) {
        yjk.e();
        Cursor query = ((agis) this.a.get()).b.a().query("hashes", agis.a, "video_id = ? AND itag = ? AND merkle_level = ? AND block_index = ?", new String[]{str, Integer.toString(i), Integer.toString(i2), Integer.toString(i3)}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                query.getClass();
                return aedn.T(query, query.getColumnIndexOrThrow("video_id"), query.getColumnIndexOrThrow("itag"), query.getColumnIndexOrThrow("storage_id"), query.getColumnIndexOrThrow("merkle_level"), query.getColumnIndexOrThrow("block_index"), query.getColumnIndexOrThrow("digest"), query.getColumnIndexOrThrow("hash_state"), query.getColumnIndexOrThrow("matches_bytes_on_disk"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    @Override // defpackage.agsj
    public final void d(agne agneVar) {
        yjk.e();
        agis agisVar = (agis) this.a.get();
        agisVar.b.a().replaceOrThrow("hashes", null, agisVar.a(agneVar));
    }

    @Override // defpackage.agsj
    public final void e(List list) {
        yjk.e();
        agis agisVar = (agis) this.a.get();
        SQLiteDatabase a = agisVar.b.a();
        a.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a.replaceOrThrow("hashes", null, agisVar.a((agne) it.next()));
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    @Override // defpackage.agsj
    public final void f(String str, int i) {
        yjk.e();
        ((agis) this.a.get()).b.a().delete("hashes", "video_id = ? AND itag = ? AND merkle_level = ? AND block_index BETWEEN ? AND ?", new String[]{str, String.valueOf(i), "0", "0", "2147483646"});
    }

    @Override // defpackage.agsj
    public final List g(String str, int i, int i2, int i3) {
        yjk.e();
        Cursor query = ((agis) this.a.get()).b.a().query("hashes", agis.a, "video_id = ? AND itag = ? AND merkle_level = ? AND block_index BETWEEN ? AND ?", new String[]{str, Integer.toString(i), Integer.toString(0), Integer.toString(i2), Integer.toString(i3 - 1)}, null, null, "block_index", null);
        try {
            query.getClass();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("video_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("itag");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("storage_id");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("merkle_level");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("block_index");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("digest");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("hash_state");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("matches_bytes_on_disk");
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                arrayList.add(aedn.T(query, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, columnIndexOrThrow7, columnIndexOrThrow8));
            }
            return arrayList;
        } finally {
            query.close();
        }
    }
}
