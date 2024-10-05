package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agjb implements yom {
    private final agmm a;

    public agjb(agmm agmmVar) {
        this.a = agmmVar;
    }

    @Override // defpackage.yom
    public final void a(SQLiteDatabase sQLiteDatabase) {
        avgg avggVar;
        agmm agmmVar = this.a;
        if (agmmVar == null) {
            return;
        }
        agmo agmoVar = new agmo(agmmVar.a, agmmVar.b);
        try {
            Cursor query = sQLiteDatabase.query("videosV2", agju.a, null, null, null, null, null, null);
            try {
                query.getClass();
                List<agnp> P = aedn.P(query, agmmVar, null, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_video_data_proto"), query.getColumnIndexOrThrow("deleted"), query.getColumnIndexOrThrow("channel_id"), query.getColumnIndex("video_id"));
                query.close();
                List asList = Arrays.asList(240, 480);
                for (agnp agnpVar : P) {
                    File file = new File(agmoVar.a(agnpVar.f()), "thumb_small.jpg");
                    File file2 = new File(agmoVar.a(agnpVar.f()), "thumb_large.jpg");
                    avgg avggVar2 = agnpVar.e.d;
                    if (avggVar2 == null) {
                        avggVar2 = avgg.a;
                    }
                    aami aamiVar = new aami(ahbj.j(avggVar2, asList));
                    if (file.exists() && !aamiVar.a.isEmpty()) {
                        File m = agmmVar.m(agnpVar.f(), aamiVar.d().a());
                        anaf.t(m);
                        anaf.s(file, m);
                        if (file2.exists() && aamiVar.a.size() > 1) {
                            File m2 = agmmVar.m(agnpVar.f(), aamiVar.a().a());
                            anaf.t(m2);
                            anaf.s(file2, m2);
                        }
                    }
                    file.delete();
                    file2.delete();
                }
                query = sQLiteDatabase.query("playlistsV2", agio.a, null, null, null, null, null, null);
                try {
                    List<agng> S = aedn.S(query, agmmVar, null, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_playlist_data_proto"), query.getColumnIndexOrThrow("placeholder"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("channel_id"));
                    query.close();
                    for (agng agngVar : S) {
                        String str = agngVar.a;
                        if (agmoVar.c == null) {
                            agmoVar.c = new File(agmoVar.a, "playlists");
                        }
                        File file3 = new File(new File(agmoVar.c, str), "thumb.jpg");
                        atqa atqaVar = agngVar.l;
                        if (atqaVar != null) {
                            avggVar = atqaVar.d;
                            if (avggVar == null) {
                                avggVar = avgg.a;
                            }
                        } else {
                            avggVar = null;
                        }
                        aami aamiVar2 = new aami(ahbj.j(avggVar, Collections.singletonList(480)));
                        if (file3.exists() && !aamiVar2.a.isEmpty()) {
                            File i = agmmVar.i(agngVar.a, aamiVar2.d().a());
                            anaf.t(i);
                            anaf.s(file3, i);
                        }
                        file3.delete();
                    }
                    query = sQLiteDatabase.query("channels", agim.a, null, null, null, null, null, null);
                    try {
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
                        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("offline_channel_data_proto");
                        ArrayList<agnb> arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            agnb U = aedn.U(query, agmmVar, columnIndexOrThrow, columnIndexOrThrow2);
                            if (U != null) {
                                arrayList.add(U);
                            }
                        }
                        query.close();
                        for (agnb agnbVar : arrayList) {
                            String str2 = agnbVar.a;
                            if (agmoVar.b == null) {
                                agmoVar.b = new File(agmoVar.a, "channels");
                            }
                            File file4 = new File(agmoVar.b, str2.concat(".jpg"));
                            atos atosVar = agnbVar.d.c;
                            if (atosVar == null) {
                                atosVar = atos.a;
                            }
                            avgg avggVar3 = atosVar.d;
                            if (avggVar3 == null) {
                                avggVar3 = avgg.a;
                            }
                            aami aamiVar3 = new aami(ahbj.j(avggVar3, Collections.singletonList(240)));
                            if (file4.exists() && !aamiVar3.a.isEmpty()) {
                                File f = agmmVar.f(agnbVar.a, aamiVar3.d().a());
                                anaf.t(f);
                                anaf.s(file4, f);
                            }
                            file4.delete();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            zga.d("FileStore migration failed.", e);
        }
    }
}
