package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agii {
    public final agmm a;
    private final agid b;
    private final agjv c;
    private final agiv d;
    private final azrs e;
    private final agil f;

    public agii(agmm agmmVar, agid agidVar, agjv agjvVar, agiv agivVar, agjl agjlVar, agil agilVar, azrs azrsVar) {
        this.a = agmmVar;
        this.b = agidVar;
        this.c = agjvVar;
        this.d = agivVar;
        this.f = agilVar;
        this.e = azrsVar;
        agidVar.b.add(new agie(this));
        agjvVar.e(new agih(this));
        agivVar.j(new agif(this));
        agjlVar.g(new agig(this));
    }

    public final void a(String str) {
        Cursor rawQuery = this.c.a.a().rawQuery("SELECT COUNT(*) FROM videosV2 WHERE channel_id=?", new String[]{str});
        try {
            rawQuery.moveToFirst();
            if (rawQuery.getInt(0) == 0) {
                rawQuery = this.d.a.a().rawQuery("SELECT COUNT(*) FROM playlistsV13 WHERE channel_id=?", new String[]{str});
                try {
                    rawQuery.moveToFirst();
                    if (rawQuery.getInt(0) == 0) {
                        try {
                            agid agidVar = this.b;
                            long delete = agidVar.a.a().delete("channelsV13", "id = ?", new String[]{str});
                            if (delete != 1) {
                                StringBuilder sb = new StringBuilder(49);
                                sb.append("Delete channel affected ");
                                sb.append(delete);
                                sb.append(" rows");
                                throw new SQLException(sb.toString());
                            }
                            Iterator it = agidVar.b.iterator();
                            while (it.hasNext()) {
                                agmm.x(((agie) it.next()).a.a.e(str));
                            }
                        } catch (SQLException e) {
                            zga.d("[Offline] Error deleting channel", e);
                        }
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    public final void b(Collection collection) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            agnp agnpVar = (agnp) it.next();
            String f = agnpVar.f();
            if (hashSet.add(f)) {
                agil agilVar = this.f;
                agnpVar.getClass();
                String f2 = agnpVar.f();
                if (!agilVar.e.m(f2) && !agilVar.e.n(f2) && (yoj.a(agilVar.f.a.a(), "video_list_videos", "video_list_id IS NOT NULL AND video_id = ?", new String[]{f2}) <= 0 || agilVar.f.j(f2))) {
                    agilVar.w(agnpVar);
                    if (!agilVar.h(f2)) {
                        agilVar.b.c(f2, false);
                    }
                    arrayList.add(f);
                }
            }
        }
        if (arrayList.size() > 0) {
            this.e.c(new agkz(arrayList));
        }
    }
}
