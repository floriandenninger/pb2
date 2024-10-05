package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.subtitles.model.AutoValue_SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agil {
    private static final atrx n = atrx.SD;
    public final agmm a;
    public final agjf b;
    public final agid c;
    public final agjv d;
    public final agiv e;
    protected final agjl f;
    protected final agjh g;
    public final agib h;
    public final aghy i;
    protected final shf j;
    public final List k = new ArrayList();
    public final agjs l;
    public final agjg m;
    private final agzr o;

    public agil(agmm agmmVar, agjf agjfVar, agid agidVar, agjv agjvVar, agiv agivVar, agjl agjlVar, agjh agjhVar, agjg agjgVar, agib agibVar, aghy aghyVar, agjs agjsVar, shf shfVar, agzr agzrVar, byte[] bArr) {
        this.a = agmmVar;
        this.b = agjfVar;
        this.c = agidVar;
        this.d = agjvVar;
        this.e = agivVar;
        this.f = agjlVar;
        this.g = agjhVar;
        this.m = agjgVar;
        this.h = agibVar;
        this.i = aghyVar;
        this.j = shfVar;
        this.l = agjsVar;
        this.o = agzrVar;
    }

    private final synchronized void aj(agnp agnpVar) {
        if (agnpVar.c) {
            return;
        }
        this.e.k(agnpVar.f());
        ak(agnpVar);
        if (this.d.l(agnpVar.f())) {
            N(agnpVar.f());
            this.d.g(agnpVar);
        }
    }

    private final synchronized void ak(agnp agnpVar) {
        int i;
        if (agnpVar.c) {
            return;
        }
        for (String str : this.l.g(agnpVar.f())) {
            List f = this.f.f(str);
            Iterator it = f.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((agnp) it.next()).f().equals(agnpVar.f())) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                Cursor query = this.f.a.a().query("final_video_list_video_ids", agji.a, "video_list_id = ?", new String[]{str}, null, null, "index_in_video_list ASC", null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(query.getString(query.getColumnIndexOrThrow("video_id")));
                    }
                    query.close();
                    bagd m = this.f.m(str);
                    if (m != null) {
                        int i2 = m.b;
                        bagd bagdVar = new bagd(m, f.size(), (byte[]) null);
                        this.f.o(bagdVar);
                        agjl agjlVar = this.f;
                        agnf agnfVar = i2 == 2 ? agnf.METADATA_ONLY : agnf.ACTIVE;
                        atrx d = this.f.d(str);
                        query = this.f.a.a().query("video_listsV13", new String[]{"offline_audio_quality"}, "id = ?", new String[]{str}, null, null, null, null);
                        try {
                            if (query.moveToNext()) {
                                int bZ = anaf.bZ(query.getInt(0));
                                int i3 = bZ != 0 ? bZ : 1;
                                query.close();
                                i = i3;
                            } else {
                                query.close();
                                i = 1;
                            }
                            agjlVar.q(bagdVar, f, agnfVar, d, i, this.f.a(str), this.f.k(str));
                            if (!arrayList.isEmpty()) {
                                arrayList.removeAll(Collections.singleton(agnpVar.f()));
                                this.f.n(bagdVar, arrayList);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = f.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((agnp) it2.next()).f());
                            }
                            int l = this.f.l(str);
                            if (i2 == 2) {
                                arrayList = null;
                            }
                            this.l.u(bagdVar, arrayList2, arrayList, l);
                        } finally {
                        }
                    } else {
                        continue;
                    }
                } finally {
                }
            }
        }
    }

    private final boolean al(String str) {
        zhq.m(str);
        return this.d.m(str);
    }

    public final void A(String str, agnf agnfVar) {
        if (this.i.b(str)) {
            this.i.b.a().execSQL("UPDATE ad_videos SET status = ? WHERE ad_video_id = ?", new Object[]{Integer.valueOf(agnfVar.q), str});
        }
    }

    public final void B(Set set, String str) {
        Set<String> hashSet;
        Cursor query = this.h.b.a().query("ads", new String[]{"ad_video_id"}, "original_video_id=? AND ad_video_id IS NOT NULL AND ad_break_id LIKE ?", new String[]{str, ".CONTENT_INTERSTITIAL.%"}, null, null, null, null);
        try {
            if (query.getCount() <= 0) {
                hashSet = Collections.emptySet();
            } else {
                hashSet = new HashSet();
                while (query.moveToNext()) {
                    hashSet.add(query.getString(0));
                }
            }
            HashSet<String> hashSet2 = new HashSet(set);
            hashSet2.removeAll(hashSet);
            hashSet.removeAll(set);
            SQLiteDatabase k = k();
            k.beginTransaction();
            try {
                for (String str2 : hashSet) {
                    this.h.b.a().delete("ads", "original_video_id=? AND ad_video_id=? AND ad_break_id LIKE ?", new String[]{str, str2, ".CONTENT_INTERSTITIAL.%"});
                    if (this.h.b(str2) == 0 && !al(str2)) {
                        M(str2, false);
                    }
                }
                for (String str3 : hashSet2) {
                    agib agibVar = this.h;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("original_video_id", str);
                    String valueOf = String.valueOf(str3);
                    contentValues.put("ad_break_id", valueOf.length() != 0 ? ".CONTENT_INTERSTITIAL.".concat(valueOf) : new String(".CONTENT_INTERSTITIAL."));
                    contentValues.put("ad_video_id", str3);
                    agibVar.b.a().insert("ads", null, contentValues);
                }
                k.setTransactionSuccessful();
            } finally {
                k.endTransaction();
            }
        } finally {
            query.close();
        }
    }

    public final synchronized boolean C(String str) {
        return L(str) != null;
    }

    public final synchronized boolean D(String str, int i) {
        zhq.m(str);
        SQLiteDatabase k = k();
        k.beginTransaction();
        try {
            boolean j = this.f.j(str);
            agnp d = this.d.d(str);
            if (d != null) {
                if (i == 1) {
                    aj(d);
                } else if (i == 2) {
                    this.e.k(str);
                    if (!j) {
                        ak(d);
                    }
                    agnf agnfVar = this.e.n(str) ? agnf.DELETED : j ? agnf.METADATA_ONLY : null;
                    if (agnfVar != null) {
                        agjv agjvVar = this.d;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("media_status", Integer.valueOf(agnfVar.q));
                        contentValues.putNull("player_response_proto");
                        contentValues.putNull("refresh_token");
                        contentValues.putNull("saved_timestamp");
                        contentValues.putNull("streams_timestamp");
                        contentValues.putNull("last_refresh_timestamp");
                        contentValues.putNull("last_playback_timestamp");
                        contentValues.putNull("video_added_timestamp");
                        long update = agjvVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
                        if (update != 1) {
                            StringBuilder sb = new StringBuilder(73);
                            sb.append("Update video offline_playability_state affected ");
                            sb.append(update);
                            sb.append(" rows");
                            throw new SQLException(sb.toString());
                        }
                    } else {
                        aj(d);
                    }
                } else {
                    if (this.f.j(str) || this.e.m(str) || this.e.n(str) || !this.d.l(str)) {
                        return true;
                    }
                    aj(d);
                }
            }
            if (!h(str)) {
                M(str, false);
            }
            if (!this.e.m(str)) {
                if (j) {
                    agka c = this.l.c();
                    synchronized (c.k) {
                        str.getClass();
                        synchronized (c.k) {
                            zhq.m(str);
                            c.e.remove(str);
                            agjy agjyVar = (agjy) c.b.get(str);
                            if (agjyVar != null) {
                                agjyVar.g();
                                c.l.b(agjyVar);
                            }
                        }
                        agjy agjyVar2 = (agjy) c.b.get(str);
                        if (agjyVar2 != null) {
                            agjyVar2.j(agnf.METADATA_ONLY);
                        }
                    }
                } else {
                    this.l.n(str);
                }
            }
            if (this.l.f().isEmpty()) {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    agfp agfpVar = ((agfo) it.next()).a;
                    agfpVar.e.a(agfpVar.G);
                }
            }
            k.setTransactionSuccessful();
            return true;
        } catch (SQLException e) {
            zga.d("[Offline] Error deleting video", e);
            return false;
        } finally {
            k.endTransaction();
        }
    }

    public final synchronized boolean E(String str) {
        return P(str);
    }

    public final boolean F(String str, List list) {
        zhq.m(str);
        list.getClass();
        SQLiteDatabase k = k();
        k.beginTransaction();
        try {
            if (!this.d.m(str)) {
                k.endTransaction();
                return false;
            }
            SQLiteDatabase a = this.m.a.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("adbreaks", wbs.ag(afrd.k(list).toString()));
            contentValues.put("original_video_id", str);
            a.insert("adbreaks", null, contentValues);
            k.setTransactionSuccessful();
            k.endTransaction();
            return true;
        } catch (Throwable th) {
            k.endTransaction();
            throw th;
        }
    }

    public final synchronized boolean G(String str, PlayerResponseModel playerResponseModel, long j, boolean z, aapf aapfVar) {
        aryv aryvVar;
        PlayerResponseModel playerResponseModel2;
        playerResponseModel.getClass();
        agjy q = this.l.q(str);
        if (q == null) {
            return false;
        }
        try {
            agzr agzrVar = this.o;
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayrz.c((AtomicReference) agzrVar.d.a.a.Y(akuo.n).B().as(false).V(new lgx(atomicBoolean, 10)));
            if (atomicBoolean.get()) {
                aong aongVar = (aong) playerResponseModel.a.toBuilder();
                aongVar.copyOnWrite();
                ((aryr) aongVar.instance).m = aryr.emptyProtobufList();
                playerResponseModel2 = new PlayerResponseModel((aryr) aongVar.build(), playerResponseModel.b, aapfVar);
            } else {
                aong aongVar2 = (aong) playerResponseModel.a.toBuilder();
                aryr aryrVar = (aryr) aongVar2.instance;
                if ((aryrVar.b & 16) != 0) {
                    aryv aryvVar2 = aryrVar.h;
                    if (aryvVar2 == null) {
                        aryvVar2 = aryv.a;
                    }
                    aone builder = aryvVar2.toBuilder();
                    builder.copyOnWrite();
                    ((aryv) builder.instance).e = aryv.emptyProtobufList();
                    builder.copyOnWrite();
                    ((aryv) builder.instance).d = aryv.emptyProtobufList();
                    aryvVar = (aryv) builder.build();
                } else {
                    aryvVar = null;
                }
                if (aryvVar != null) {
                    aongVar2.copyOnWrite();
                    aryr aryrVar2 = (aryr) aongVar2.instance;
                    aryrVar2.h = aryvVar;
                    aryrVar2.b |= 16;
                } else {
                    aongVar2.copyOnWrite();
                    aryr aryrVar3 = (aryr) aongVar2.instance;
                    aryrVar3.h = null;
                    aryrVar3.b &= -17;
                }
                aongVar2.copyOnWrite();
                ((aryr) aongVar2.instance).m = aryr.emptyProtobufList();
                playerResponseModel2 = new PlayerResponseModel((aryr) aongVar2.build(), playerResponseModel.b, aapfVar);
            }
            PlayerResponseModel playerResponseModel3 = playerResponseModel2;
            this.d.f(playerResponseModel3);
            long a = z ? j : q.a();
            this.d.k(str, playerResponseModel3, a, j);
            q.k(playerResponseModel3, a, j);
            for (agfo agfoVar : this.k) {
                atqq r = playerResponseModel3.r();
                if (r != null) {
                    long j2 = r.f;
                    long r2 = ((agsg) agfoVar.a.d.get()).r(agfoVar.a.G);
                    if (j2 > 0 && (r2 == 0 || j2 < r2)) {
                        agfp agfpVar = agfoVar.a;
                        agfpVar.e.f(agfpVar.G, j2);
                    }
                    ((agms) agfoVar.a.m.get()).a();
                }
            }
            return true;
        } catch (SQLException e) {
            zga.d("[Offline] Error inserting player response", e);
            return false;
        }
    }

    public final boolean H(agnp agnpVar) {
        try {
            this.d.j(agnpVar);
            agka c = this.l.c();
            synchronized (c.k) {
                agjy agjyVar = (agjy) c.b.get(agnpVar.f());
                if (agjyVar != null) {
                    agjyVar.l(agnpVar);
                }
            }
            return true;
        } catch (SQLException e) {
            zga.d("[Offline] Error updating single video", e);
            return false;
        }
    }

    public final synchronized boolean I(String str, WatchNextResponseModel watchNextResponseModel) {
        zhq.m(str);
        try {
            agjv agjvVar = this.d;
            ContentValues contentValues = new ContentValues();
            contentValues.put("watch_next_proto", watchNextResponseModel.a.toByteArray());
            int update = agjvVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update != 1) {
                StringBuilder sb = new StringBuilder(49);
                sb.append("Update video watch next affected ");
                sb.append(update);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
        } catch (SQLException e) {
            zga.d("[Offline] Error inserting watch next response", e);
            return false;
        }
        return true;
    }

    public final agnn J(String str, aghh aghhVar) {
        zhq.m(str);
        agjm b = this.l.b(str);
        if (b == null) {
            return null;
        }
        return b.h(aghhVar);
    }

    public final void K(String str) {
        zhq.m(str);
        try {
            agjv agjvVar = this.d;
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("player_response_proto");
            contentValues.putNull("refresh_token");
            contentValues.putNull("last_refresh_timestamp");
            contentValues.putNull("streams_timestamp");
            long update = agjvVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                agka c = this.l.c();
                synchronized (c.k) {
                    zhq.m(str);
                    agjy agjyVar = (agjy) c.b.get(str);
                    if (agjyVar != null) {
                        agjyVar.f();
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Update video affected ");
            sb.append(update);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        } catch (SQLException e) {
            zga.d("[Offline] Error updating single video", e);
        }
    }

    public final synchronized List L(String str) {
        SQLiteDatabase k;
        List list;
        try {
            zhq.m(str);
            k = k();
            k.beginTransaction();
            agiv agivVar = this.e;
            agng f = agivVar.f(str);
            long delete = agivVar.a.a().delete("playlistsV13", "id = ?", new String[]{str});
            if (delete != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Delete playlist affected ");
                sb.append(delete);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
            if (f == null) {
                list = amru.q();
            } else {
                Iterator it = agivVar.e.iterator();
                while (it.hasNext()) {
                    ((agit) it.next()).a(f);
                }
                String str2 = f.a;
                List i = agivVar.i(str2);
                agivVar.a.a().delete("playlist_video", "playlist_id = ?", new String[]{str2});
                agzr agzrVar = agivVar.d;
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                ayrz.c((AtomicReference) agzrVar.d.a.a.Y(akuo.o).B().as(false).V(new lgx(atomicBoolean, 10)));
                if (atomicBoolean.get()) {
                    Collections.reverse(i);
                }
                Iterator it2 = agivVar.e.iterator();
                while (it2.hasNext()) {
                    ((agit) it2.next()).b(i);
                }
                list = i;
            }
            k.setTransactionSuccessful();
        } catch (SQLException e) {
            zga.d("[Offline] Error deleting playlist", e);
            return null;
        } finally {
            k.endTransaction();
        }
        return list;
    }

    public final synchronized void M(String str, boolean z) {
        zhq.m(str);
        try {
            this.b.c(str, z);
            this.l.m(str);
        } catch (SQLException e) {
            zga.d("[Offline] Error deleting streams", e);
        }
    }

    public final void N(String str) {
        str.getClass();
        try {
            this.g.a(str);
        } catch (SQLException e) {
            zga.d("[Offline] Error deleting subtitle tracks", e);
        }
    }

    public final void O(agnb agnbVar) {
        try {
            this.c.c(agnbVar);
        } catch (SQLException e) {
            zga.d("[Offline] Error inserting channel", e);
        }
    }

    public final synchronized boolean P(String str) {
        zhq.m(str);
        agjy q = this.l.q(str);
        if (q == null || this.l.c().h(str) || q.b() == agnf.DELETED) {
            return false;
        }
        try {
            this.e.l(str);
            this.l.h(str);
            return true;
        } catch (SQLException e) {
            zga.d("[Offline] Error inserting existing video as single video", e);
            return false;
        }
    }

    public final void Q(SubtitleTrack subtitleTrack) {
        try {
            SQLiteDatabase a = this.g.b.a();
            zhq.m(((AutoValue_SubtitleTrack) subtitleTrack).c);
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_id", ((AutoValue_SubtitleTrack) subtitleTrack).b);
            contentValues.put("language_code", ((AutoValue_SubtitleTrack) subtitleTrack).a);
            contentValues.put("subtitles_path", ((AutoValue_SubtitleTrack) subtitleTrack).c);
            contentValues.put("track_vss_id", ((AutoValue_SubtitleTrack) subtitleTrack).d);
            contentValues.put("user_visible_track_name", subtitleTrack.toString());
            if (a.insert("subtitles_v5", null, contentValues) != -1) {
            } else {
                throw new SQLException("Error inserting subtitle track");
            }
        } catch (SQLException e) {
            zga.d("[Offline] Error inserting subtitle tracks", e);
        }
    }

    public final synchronized void R(String str, agnf agnfVar, atrx atrxVar, String str2, int i, byte[] bArr) {
        zhq.m(str);
        agnfVar.getClass();
        if (this.l.q(str) != null) {
            return;
        }
        agnp c = c(str);
        if (c == null) {
            return;
        }
        try {
            this.d.i(str, agnfVar);
            agjv agjvVar = this.d;
            int a = ahab.a(atrxVar, 360);
            ContentValues contentValues = new ContentValues();
            contentValues.put("preferred_stream_quality", Integer.valueOf(a));
            long update = agjvVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                agjv agjvVar2 = this.d;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("audio_track_id", str2);
                long update2 = agjvVar2.a.a().update("videosV2", contentValues2, "id = ?", new String[]{str});
                if (update2 == 1) {
                    long a2 = this.d.a(str);
                    if (a2 == 0) {
                        a2 = this.j.c();
                        this.d.h(str, a2);
                    }
                    this.l.t(c, atrxVar, i, bArr, agnfVar, agno.OFFLINE_IMMEDIATELY, a2);
                    return;
                }
                StringBuilder sb = new StringBuilder(56);
                sb.append("Update audio track id affected ");
                sb.append(update2);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("Update video preferred_stream_quality affected ");
            sb2.append(update);
            sb2.append(" rows");
            throw new SQLException(sb2.toString());
        } catch (SQLException e) {
            zga.d("[Offline] Error undeleting video", e);
        }
    }

    public final void S(agnb agnbVar) {
        try {
            this.c.d(agnbVar);
        } catch (SQLException e) {
            zga.d("[Offline] Error updating channel", e);
        }
    }

    public final synchronized void T(String str, long j) {
        zhq.m(str);
        agjy q = this.l.q(str);
        if (q == null) {
            return;
        }
        try {
            agjv agjvVar = this.d;
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_playback_position_timestamp", Long.valueOf(j));
            long update = agjvVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                q.h(j);
                return;
            }
            StringBuilder sb = new StringBuilder(81);
            sb.append("Update video last_playback_position_in_seconds affected ");
            sb.append(update);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        } catch (SQLException e) {
            zga.d("[Offline] Error updating last playback position timestamp", e);
        }
    }

    public final synchronized void U(String str, long j) {
        zhq.m(str);
        agjy q = this.l.q(str);
        if (q == null) {
            return;
        }
        try {
            agjv agjvVar = this.d;
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_playback_timestamp", Long.valueOf(j));
            long update = agjvVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                q.i(j);
                return;
            }
            StringBuilder sb = new StringBuilder(71);
            sb.append("Update video last_playback_timestamp affected ");
            sb.append(update);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        } catch (SQLException e) {
            zga.d("[Offline] Error updating last playback timestamp", e);
        }
    }

    public final synchronized void V(String str, agnf agnfVar) {
        zhq.m(str);
        agnfVar.getClass();
        agjy q = this.l.q(str);
        if (q == null || q.b() == agnfVar) {
            return;
        }
        try {
            this.d.i(str, agnfVar);
            q.j(agnfVar);
            agka c = this.l.c();
            synchronized (c.k) {
                Iterator it = c.c(str).iterator();
                while (it.hasNext()) {
                    agjw i = c.i((String) it.next());
                    if (i != null) {
                        synchronized (i.c.k) {
                            i.b = null;
                        }
                    }
                }
            }
        } catch (SQLException e) {
            zga.d("[Offline] Error updating media status", e);
        }
    }

    public final synchronized void W(String str, agnz agnzVar) {
        zhq.m(str);
        agnzVar.getClass();
        agjy q = this.l.q(str);
        if (q == null) {
            return;
        }
        synchronized (q.g.k) {
            q.d = agnzVar;
            q.f = null;
        }
    }

    public final void X(String str) {
        zhq.m(str);
        agjw p = this.l.p(str);
        if (p == null) {
            return;
        }
        try {
            agiv agivVar = this.e;
            ContentValues contentValues = new ContentValues();
            contentValues.put("playlist_client_last_invalidation_timestamp", (Long) 0L);
            long update = agivVar.a.a().update("playlistsV13", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                synchronized (p.c.k) {
                    p.b = null;
                }
            } else {
                StringBuilder sb = new StringBuilder(71);
                sb.append("Update playlist client invalidation timestamp ");
                sb.append(update);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
        } catch (SQLException e) {
            zga.d("[Offline] Error updating playlist client invalidation timestamp", e);
        }
    }

    public final synchronized void Y(String str, int i, String str2) {
        zhq.m(str);
        agjm b = this.l.b(str);
        if (b == null) {
            return;
        }
        agnm b2 = b.b(i);
        if (b2 == null) {
            return;
        }
        agnl d = b2.d();
        d.e = str2;
        ai(d.a());
    }

    public final void Z(String str, agno agnoVar) {
        agno agnoVar2;
        zhq.m(str);
        agnoVar.getClass();
        agjy q = this.l.q(str);
        if (q != null) {
            synchronized (q.g.k) {
                agnoVar2 = q.e;
            }
            if (agnoVar2 == agnoVar) {
                return;
            }
            try {
                agjv agjvVar = this.d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("stream_transfer_condition", Integer.valueOf(agnoVar.g));
                long update = agjvVar.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
                if (update == 1) {
                    synchronized (q.g.k) {
                        q.e = agnoVar;
                        q.f = null;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder(73);
                sb.append("Update video stream transfer condition affected ");
                sb.append(update);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            } catch (SQLException e) {
                zga.d("[Offline] Error updating stream transfer condition", e);
            }
        }
    }

    public final long a(String str) {
        return this.d.a(str);
    }

    public final void aa(String str, long j) {
        zhq.m(str);
        agjy q = this.l.q(str);
        if (q == null) {
            return;
        }
        try {
            this.d.h(str, j);
            synchronized (q.g.k) {
                q.c = j;
                q.f = null;
            }
        } catch (SQLException e) {
            zga.d("[Offline] Error updating video added timestamp", e);
        }
    }

    public final synchronized boolean ab(agng agngVar, atrx atrxVar, int i, int i2, byte[] bArr, long j, int i3) {
        try {
            agiv agivVar = this.e;
            int a = ahab.a(atrxVar, 360);
            ContentValues e = agiv.e(agngVar, agivVar.b);
            e.put("preferred_stream_quality", Integer.valueOf(a));
            e.put("offline_audio_quality", Integer.valueOf(i - 1));
            e.put("offline_source_ve_type", Integer.valueOf(i2));
            if (bArr != null) {
                e.put("player_response_tracking_params", bArr);
            }
            e.put("playlist_added_timestamp_millis", Long.valueOf(j));
            e.put("playlist_offline_request_source", Integer.valueOf(i3 - 1));
            e.put("playlist_client_last_invalidation_timestamp", (Long) 0L);
            agivVar.a.a().insertOrThrow("playlistsV13", null, e);
            int size = this.l.d().size();
            this.l.s(agngVar, new ArrayList(), atrxVar, i2, j, this.e.d(agngVar.a), i3);
            if (size == 0 && this.l.d().size() == 1) {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    agfp agfpVar = ((agfo) it.next()).a;
                    agfpVar.f.e(agfpVar.G);
                }
            }
        } catch (SQLException e2) {
            zga.d("[Offline] Error inserting playlist", e2);
            return false;
        }
        return true;
    }

    public final synchronized boolean ac(agnp agnpVar, atrx atrxVar, String str, int i, agno agnoVar, int i2, byte[] bArr, agnf agnfVar) {
        return ad(agnpVar, atrxVar, str, i, agnoVar, i2, bArr, agnfVar);
    }

    public final synchronized boolean ad(agnp agnpVar, atrx atrxVar, String str, int i, agno agnoVar, int i2, byte[] bArr, agnf agnfVar) {
        SQLiteDatabase k = k();
        k.beginTransaction();
        long c = this.j.c();
        try {
            try {
                this.d.n(agnpVar, agnfVar, agnoVar, ahab.a(atrxVar, 360), str, i, i2, c, bArr);
                this.e.l(agnpVar.f());
                k.setTransactionSuccessful();
                k.endTransaction();
                this.l.t(agnpVar, atrxVar, i2, bArr, agnfVar, agnoVar, c);
                this.l.h(agnpVar.f());
            } catch (SQLException e) {
                zga.d("[Offline] Error inserting single video or playlist video into database", e);
                k.endTransaction();
                return false;
            }
        } catch (Throwable th) {
            k.endTransaction();
            throw th;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r7.c(r6) == defpackage.agnf.METADATA_ONLY) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ae(defpackage.agng r28, java.util.List r29, defpackage.atrx r30, int r31, java.util.Set r32, defpackage.agno r33, int r34, byte[] r35) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agil.ae(agng, java.util.List, atrx, int, java.util.Set, agno, int, byte[]):boolean");
    }

    public final synchronized void af(String str, int i) {
        zhq.m(str);
        agjm b = this.l.b(str);
        if (b == null) {
            return;
        }
        try {
            agjf agjfVar = this.b;
            long delete = agjfVar.c.a().delete("streams", "video_id = ? AND itag = ?", new String[]{str, Integer.toString(i)});
            if (delete != 1) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Delete stream affected ");
                sb.append(delete);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
            agjfVar.d.b.a().delete("hashes", "video_id = ? AND itag = ?", new String[]{str, String.valueOf(i)});
            b.e(i);
            if (b.c() == null && b.a() == null) {
                this.l.m(str);
            }
        } catch (SQLException e) {
            zga.d("[Offline] Error deleting stream", e);
        }
    }

    public final synchronized void ag(agnm agnmVar) {
        try {
            agjf agjfVar = this.b;
            agjfVar.c.a().insertOrThrow("streams", null, agjfVar.a(agnmVar));
            this.l.k(agnmVar);
        } catch (SQLiteConstraintException unused) {
            zga.b("[Offline] Failed insert due to constraint failure, attempting update");
            ai(agnmVar);
        } catch (SQLException e) {
            zga.d("[Offline] Error inserting stream", e);
        }
    }

    public final synchronized void ah(String str, int i, long j) {
        zhq.m(str);
        agjm b = this.l.b(str);
        if (b == null) {
            return;
        }
        agnm b2 = b.b(i);
        if (b2 != null && j >= b2.d) {
            agnl d = b2.d();
            d.c(j);
            ai(d.a());
        }
    }

    public final synchronized void ai(agnm agnmVar) {
        try {
            agjf agjfVar = this.b;
            long update = agjfVar.c.a().update("streams", agjfVar.a(agnmVar), "video_id = ? AND itag = ?", new String[]{agnmVar.g(), Integer.toString(agnmVar.a())});
            if (update == 1) {
                agjs agjsVar = this.l;
                agjm a = agjsVar.c().a(agnmVar.g());
                if (a == null) {
                    zga.l("Stream to be updated was missing from cache. Inserting instead.");
                    agjsVar.k(agnmVar);
                    return;
                }
                for (agfo agfoVar : agjsVar.g) {
                    a.d();
                }
                a.g(agnmVar);
                agjsVar.c().g(agnmVar);
                return;
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Update stream bytes_transferred affected ");
            sb.append(update);
            sb.append(" rows");
            throw new SQLException(sb.toString());
        } catch (SQLException e) {
            zga.d("[Offline] Error updating stream", e);
        }
    }

    public final agnb b(String str) {
        zhq.m(str);
        return this.c.b(str);
    }

    public final agnp c(String str) {
        zhq.m(str);
        return this.d.d(str);
    }

    public final atrx d(String str) {
        zhq.m(str);
        atrx b = ahab.b(this.e.b(str));
        return b == atrx.UNKNOWN_FORMAT_TYPE ? n : b;
    }

    public final atrx e(String str) {
        int i;
        zhq.m(str);
        Cursor query = this.d.a.a().query("videosV2", new String[]{"preferred_stream_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                i = query.getInt(0);
            } else {
                query.close();
                i = -1;
            }
            atrx b = ahab.b(i);
            return b == atrx.UNKNOWN_FORMAT_TYPE ? n : b;
        } finally {
            query.close();
        }
    }

    public final List f() {
        return this.e.g();
    }

    public final List g(String str) {
        zhq.m(str);
        Cursor query = this.g.b.a().query("subtitles_v5", agjh.a, "video_id = ?", new String[]{str}, null, null, null, null);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("video_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("language_code");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("subtitles_path");
            int columnIndex = query.getColumnIndex("track_vss_id");
            int columnIndex2 = query.getColumnIndex("user_visible_track_name");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow2);
                String string2 = query.getString(columnIndexOrThrow);
                String string3 = query.getString(columnIndexOrThrow3);
                String string4 = query.getString(columnIndex);
                String string5 = query.getString(columnIndex2);
                string2.getClass();
                string3.getClass();
                aiuh m = SubtitleTrack.m();
                m.e(string);
                m.j(string2);
                m.k(string4);
                m.i("");
                m.b = string5;
                m.f("");
                m.h("");
                m.b(0);
                m.g("");
                m.c(true);
                m.a = string3;
                arrayList.add(m.a());
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    public final boolean h(String str) {
        zhq.m(str);
        return this.h.b(str) > 0;
    }

    public final byte[] i(String str) {
        zhq.m(str);
        Cursor query = this.d.a.a().query("videosV2", new String[]{"player_response_tracking_params"}, "id = ?", new String[]{str}, null, null, null, null);
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

    public final int j(String str) {
        zhq.m(str);
        agni n2 = n(str);
        if (n2 == null) {
            return 0;
        }
        return n2.d;
    }

    public final SQLiteDatabase k() {
        return this.l.a();
    }

    public final Pair l(String str) {
        SQLiteDatabase k = k();
        k.beginTransaction();
        try {
            zhq.m(str);
            agng f = this.e.f(str);
            if (f == null) {
                return null;
            }
            zhq.m(str);
            List i = this.e.i(str);
            k.setTransactionSuccessful();
            return new Pair(f, i);
        } catch (SQLException unused) {
            return null;
        } finally {
            k.endTransaction();
        }
    }

    public final PlayerResponseModel m(String str) {
        PlayerResponseModel playerResponseModel;
        zhq.m(str);
        agjy q = this.l.q(str);
        if (q == null) {
            return null;
        }
        synchronized (q.g.k) {
            playerResponseModel = q.a;
        }
        return playerResponseModel;
    }

    public final agni n(String str) {
        zhq.m(str);
        agjw p = this.l.p(str);
        if (p != null) {
            return p.b();
        }
        return null;
    }

    public final agns o(String str) {
        zhq.m(str);
        agjz r = this.l.r(str);
        if (r != null) {
            return r.a();
        }
        return null;
    }

    public final agnv p(String str) {
        zhq.m(str);
        agjy q = this.l.q(str);
        if (q == null) {
            return null;
        }
        return q.e();
    }

    public final synchronized List q(String str) {
        ArrayList arrayList;
        zhq.m(str);
        arrayList = new ArrayList();
        Cursor rawQuery = this.e.a.a().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id = ? ORDER BY index_in_playlist ASC", new String[]{str});
        try {
            ArrayList<String> arrayList2 = new ArrayList();
            while (rawQuery.moveToNext()) {
                arrayList2.add(rawQuery.getString(0));
            }
            rawQuery.close();
            for (String str2 : arrayList2) {
                agnv p = p(str2);
                if (p != null && p.E()) {
                    V(str2, agnf.ACTIVE);
                    arrayList.add(str2);
                }
            }
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        return arrayList;
    }

    public final List r() {
        ArrayList arrayList;
        agka c = this.l.c();
        synchronized (c.k) {
            arrayList = new ArrayList();
            Iterator it = c.l.iterator();
            while (it.hasNext()) {
                arrayList.add(((agjy) it.next()).e());
            }
        }
        return arrayList;
    }

    public final List s() {
        return this.l.f();
    }

    public final Set t(String str) {
        zhq.m(str);
        return this.l.c().c(str);
    }

    public final void u(String str, Set set) {
        Set<String> hashSet;
        Set<String> hashSet2;
        str.getClass();
        set.getClass();
        SQLiteDatabase k = k();
        k.beginTransaction();
        try {
            Cursor query = this.h.b.a().query("ads", new String[]{"ad_video_id"}, "original_video_id=? AND ad_video_id IS NOT NULL AND ad_break_id NOT LIKE ?", new String[]{str, ".CONTENT_INTERSTITIAL.%"}, null, null, null, null);
            try {
                if (query.getCount() <= 0) {
                    hashSet = Collections.emptySet();
                } else {
                    hashSet = new HashSet();
                    while (query.moveToNext()) {
                        hashSet.add(query.getString(0));
                    }
                }
                for (String str2 : hashSet) {
                    if (this.h.b(str2) <= 1) {
                        this.i.b.a().delete("ad_videos", "ad_video_id=?", new String[]{str2});
                        if (!al(str2)) {
                            M(str2, set.contains(str2));
                        }
                    }
                }
                query = this.h.b.a().query("ads", new String[]{"ad_intro_video_id"}, "original_video_id=? AND ad_intro_video_id IS NOT NULL AND ad_break_id NOT LIKE ?", new String[]{str, ".CONTENT_INTERSTITIAL.%"}, null, null, null, null);
                try {
                    if (query.getCount() <= 0) {
                        hashSet2 = amvs.a;
                    } else {
                        hashSet2 = new HashSet();
                        while (query.moveToNext()) {
                            hashSet2.add(query.getString(0));
                        }
                    }
                    for (String str3 : hashSet2) {
                        if (this.h.a("SELECT COUNT(DISTINCT ad_video_id) FROM ads WHERE ad_intro_video_id=?", new String[]{str3}) <= 1 && !al(str3)) {
                            M(str3, set.contains(str3));
                        }
                    }
                    this.h.b.a().delete("ads", "original_video_id=? AND ad_break_id NOT LIKE ?", new String[]{str, ".CONTENT_INTERSTITIAL.%"});
                    this.m.a.a().delete("adbreaks", "original_video_id=?", new String[]{str});
                    k.setTransactionSuccessful();
                } finally {
                }
            } finally {
            }
        } finally {
            k.endTransaction();
        }
    }

    public final void v(String str) {
        u(str, amvs.a);
        B(amvs.a, str);
    }

    public final void w(agnp agnpVar) {
        if (agnpVar.c) {
            return;
        }
        try {
            this.g.a(agnpVar.f());
            this.d.g(agnpVar);
        } catch (SQLException e) {
            zga.d("[Offline] Error cleaning up video", e);
        }
    }

    public final void x(String str) {
        agjy q = this.l.q(str);
        if (q != null) {
            agnp c = c(str);
            if (c != null) {
                q.l(c);
            } else {
                this.l.n(str);
            }
        }
    }

    public final void y() {
        agjs agjsVar = this.l;
        agjsVar.a.execute(new agjo(agjsVar));
    }

    public final synchronized void z(String str) {
        PlayerResponseModel playerResponseModel;
        long j;
        zhq.m(str);
        agjy q = this.l.q(str);
        if (q == null) {
            return;
        }
        Cursor query = this.d.a.a().query("videosV2", new String[]{"player_response_proto"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                query.getClass();
                PlayerResponseModel L = aedn.L(query, query.getColumnIndexOrThrow("player_response_proto"));
                query.close();
                playerResponseModel = L;
            } else {
                playerResponseModel = null;
            }
            if (playerResponseModel == null) {
                return;
            }
            long a = q.a();
            synchronized (q.g.k) {
                j = q.b;
            }
            this.d.f(playerResponseModel);
            this.d.k(str, playerResponseModel, a, j);
            q.k(playerResponseModel, a, j);
        } finally {
            query.close();
        }
    }
}
