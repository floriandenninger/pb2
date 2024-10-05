package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ageo implements agsh {
    public final azrw a;
    public final agft b;
    private final azrw c;
    private final Executor d;

    public ageo(azrw azrwVar, Executor executor, azrw azrwVar2, agft agftVar) {
        this.c = azrwVar;
        executor.getClass();
        this.d = executor;
        this.a = azrwVar2;
        this.b = agftVar;
    }

    @Override // defpackage.agsh
    public final int a(String str, String str2) {
        aghz c;
        yjk.e();
        if (this.b.z() && (c = ((agil) this.a.get()).h.c(str, str2)) != null) {
            return c.g;
        }
        return 0;
    }

    @Override // defpackage.agsh
    public final int b(String str) {
        aghx a;
        yjk.e();
        if (this.b.z() && (a = ((agil) this.a.get()).i.a(str)) != null) {
            return a.a;
        }
        return 0;
    }

    @Override // defpackage.agsh
    public final InstreamAdImpl c(String str, String str2) {
        String str3;
        yjk.e();
        if (!this.b.z()) {
            return null;
        }
        agil agilVar = (agil) this.a.get();
        str.getClass();
        str2.getClass();
        zhq.m(str);
        try {
            aghz c = agilVar.h.c(str, str2);
            if (c != null && (str3 = c.c) != null) {
                agnn J2 = agilVar.J(str3, null);
                agnm agnmVar = J2 != null ? J2.a : null;
                if (agnmVar == null || !agnmVar.i()) {
                    return null;
                }
            }
            Cursor query = agilVar.h.b.a().query("ads", new String[]{"vast"}, "original_video_id=? AND ad_break_id=?", new String[]{str, str2}, null, null, null, null);
            try {
                if (!query.moveToNext()) {
                    return null;
                }
                InstreamAdImpl instreamAdImpl = (InstreamAdImpl) InstreamAdImpl.a.f(new JSONObject(wbs.ac(query.getBlob(0))));
                query.close();
                return instreamAdImpl;
            } finally {
                query.close();
            }
        } catch (IOException | JSONException e) {
            StringBuilder sb = new StringBuilder(str.length() + 45);
            sb.append("[Offline] Error loading ad [originalVideoId=");
            sb.append(str);
            sb.append("]");
            zga.d(sb.toString(), e);
            return null;
        }
    }

    @Override // defpackage.agsh
    public final agnf d(String str) {
        yjk.e();
        if (!this.b.z()) {
            return null;
        }
        aghx a = ((agil) this.a.get()).i.a(str);
        return a == null ? agnf.DELETED : a.b;
    }

    @Override // defpackage.agsh
    public final List e(String str) {
        List i;
        yjk.e();
        if (!this.b.z()) {
            return amru.q();
        }
        agil agilVar = (agil) this.a.get();
        str.getClass();
        zhq.m(str);
        try {
            Cursor query = agilVar.m.a.a().query("adbreaks", new String[]{"adbreaks"}, "original_video_id=?", new String[]{str}, null, null, null, null);
            try {
                if (query.getCount() <= 0) {
                    i = Collections.emptyList();
                } else {
                    query.moveToNext();
                    i = InstreamAdBreak.b.i(new JSONArray(wbs.ac(query.getBlob(0))));
                }
                return i;
            } finally {
                query.close();
            }
        } catch (IOException | JSONException e) {
            StringBuilder sb = new StringBuilder(str.length() + 52);
            sb.append("[Offline] Error loading ad breaks [originalVideoId=");
            sb.append(str);
            sb.append("]");
            zga.d(sb.toString(), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.agsh
    public final Map f() {
        ArrayList<agia> arrayList;
        if (!this.b.z()) {
            return amvo.b;
        }
        aghd aghdVar = (aghd) this.c.get();
        SQLiteDatabase a = aghdVar.d.h.b.a();
        String d = yoj.d("ads", agib.a);
        String d2 = yoj.d("ad_videos", aghy.a);
        int i = 1;
        String c = yoj.c("ads", "ad_video_id");
        String c2 = yoj.c("ad_videos", "ad_video_id");
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 44 + String.valueOf(d2).length() + String.valueOf(c).length() + String.valueOf(c2).length());
        sb.append("SELECT ");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(" FROM ads LEFT JOIN ad_videos ON ");
        sb.append(c);
        sb.append(" = ");
        sb.append(c2);
        Cursor rawQuery = a.rawQuery(sb.toString(), null);
        try {
            if (rawQuery.getCount() <= 0) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    aghz a2 = aghz.a("ads", rawQuery);
                    aghx a3 = aghx.a("ad_videos", rawQuery);
                    if (a2 != null) {
                        arrayList.add(new agia(a2, a3));
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (agia agiaVar : arrayList) {
                String str = agiaVar.a.a;
                aone createBuilder = arxs.a.createBuilder();
                agkb agkbVar = agkb.EMPTY;
                int ordinal = agiaVar.a.d.ordinal();
                if (ordinal == 0) {
                    createBuilder.copyOnWrite();
                    arxs arxsVar = (arxs) createBuilder.instance;
                    arxsVar.c = 0;
                    arxsVar.b |= 1;
                    createBuilder.copyOnWrite();
                    arxs arxsVar2 = (arxs) createBuilder.instance;
                    arxsVar2.b |= 8;
                    arxsVar2.f = 0;
                } else if (ordinal == i) {
                    createBuilder.copyOnWrite();
                    arxs arxsVar3 = (arxs) createBuilder.instance;
                    arxsVar3.c = 2;
                    arxsVar3.b |= 1;
                    long max = Math.max(0L, TimeUnit.MILLISECONDS.toSeconds(agiaVar.a.e - aghdVar.c.c()));
                    createBuilder.copyOnWrite();
                    arxs arxsVar4 = (arxs) createBuilder.instance;
                    arxsVar4.b |= 8;
                    arxsVar4.f = (int) max;
                    aghz aghzVar = agiaVar.a;
                    int max2 = Math.max(0, aghzVar.f - aghzVar.g);
                    createBuilder.copyOnWrite();
                    arxs arxsVar5 = (arxs) createBuilder.instance;
                    arxsVar5.b |= 4;
                    arxsVar5.e = max2;
                } else if (ordinal == 2) {
                    String str2 = agiaVar.a.b;
                    if (str2 == null) {
                        createBuilder.copyOnWrite();
                        arxs arxsVar6 = (arxs) createBuilder.instance;
                        arxsVar6.c = 0;
                        arxsVar6.b |= i;
                        createBuilder.copyOnWrite();
                        arxs arxsVar7 = (arxs) createBuilder.instance;
                        arxsVar7.b |= 8;
                        arxsVar7.f = 0;
                    } else {
                        aghx aghxVar = agiaVar.b;
                        if (aghxVar == null || aghxVar.b != agnf.COMPLETE) {
                            createBuilder.copyOnWrite();
                            arxs arxsVar8 = (arxs) createBuilder.instance;
                            arxsVar8.c = 3;
                            arxsVar8.b |= i;
                        } else {
                            createBuilder.copyOnWrite();
                            arxs arxsVar9 = (arxs) createBuilder.instance;
                            arxsVar9.c = 4;
                            arxsVar9.b |= i;
                        }
                        aghx aghxVar2 = agiaVar.b;
                        int i2 = aghxVar2 != null ? aghxVar2.a : 0;
                        long max3 = Math.max(0L, TimeUnit.MILLISECONDS.toSeconds(agiaVar.a.e - aghdVar.c.c()));
                        createBuilder.copyOnWrite();
                        arxs arxsVar10 = (arxs) createBuilder.instance;
                        arxsVar10.b |= 8;
                        arxsVar10.f = (int) max3;
                        createBuilder.copyOnWrite();
                        arxs arxsVar11 = (arxs) createBuilder.instance;
                        arxsVar11.b |= 2;
                        arxsVar11.d = str2;
                        aghz aghzVar2 = agiaVar.a;
                        int max4 = Math.max(0, aghzVar2.f - Math.max(i2, aghzVar2.g));
                        createBuilder.copyOnWrite();
                        arxs arxsVar12 = (arxs) createBuilder.instance;
                        arxsVar12.b |= 4;
                        arxsVar12.e = max4;
                    }
                }
                aone createBuilder2 = arxt.a.createBuilder();
                createBuilder2.copyOnWrite();
                arxt arxtVar = (arxt) createBuilder2.instance;
                arxs arxsVar13 = (arxs) createBuilder.build();
                arxsVar13.getClass();
                aony aonyVar = arxtVar.b;
                if (!aonyVar.c()) {
                    arxtVar.b = aonm.mutableCopy(aonyVar);
                }
                arxtVar.b.add(arxsVar13);
                arxt arxtVar2 = (arxt) createBuilder2.build();
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(str, list);
                }
                list.add(arxtVar2);
                i = 1;
            }
            return hashMap;
        } finally {
            rawQuery.close();
        }
    }

    @Override // defpackage.agsh
    public final void g(final String str, final String str2) {
        this.d.execute(new Runnable() { // from class: agen
            @Override // java.lang.Runnable
            public final void run() {
                ageo ageoVar = ageo.this;
                String str3 = str;
                String str4 = str2;
                if (ageoVar.b.z()) {
                    ((agil) ageoVar.a.get()).h.b.a().execSQL("UPDATE ads SET vast_playback_count = vast_playback_count + 1 WHERE original_video_id = ? AND ad_break_id = ?", new Object[]{str3, str4});
                }
            }
        });
    }

    @Override // defpackage.agsh
    public final void h(String str) {
        str.getClass();
        this.d.execute(new agem(this, str, 1));
    }

    @Override // defpackage.agsh
    public final void i(String str) {
        this.d.execute(new agem(this, str, 0));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0314 A[Catch: IOException -> 0x034f, TRY_LEAVE, TryCatch #7 {IOException -> 0x034f, blocks: (B:59:0x030b, B:61:0x0314, B:69:0x034b, B:70:0x034e, B:82:0x0343), top: B:25:0x01bc }] */
    @Override // defpackage.agsh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j(java.lang.String r31, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r32) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ageo.j(java.lang.String, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel):java.lang.String");
    }
}
