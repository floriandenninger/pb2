package defpackage;

import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class admx implements adqo {
    final /* synthetic */ adnd a;

    public admx(adnd adndVar) {
        this.a = adndVar;
    }

    public static final String c(JSONObject jSONObject) {
        String str = adle.a.b;
        if (jSONObject.has("videoId")) {
            return jSONObject.optString("videoId", str);
        }
        return jSONObject.optString("video_id", str);
    }

    private final void d(JSONObject jSONObject) {
        adlf adlfVar;
        if (this.a.N == null || !jSONObject.has("adState")) {
            return;
        }
        adnd adndVar = this.a;
        int i = jSONObject.getInt("adState");
        if (i == adlf.UNSTARTED.o) {
            adlfVar = adlf.AD_UNSTARTED;
        } else if (i == adlf.ENDED.o) {
            adlfVar = adlf.AD_ENDED;
        } else if (i == adlf.AD_SKIPPED.o) {
            adlfVar = adlf.AD_SKIPPED;
        } else if (i == adlf.PLAYING.o) {
            adlfVar = adlf.AD_PLAYING;
        } else if (i == adlf.PAUSED.o) {
            adlfVar = adlf.AD_PAUSED;
        } else if (i == adlf.BUFFERING.o) {
            adlfVar = adlf.AD_BUFFERING;
        } else {
            String str = adlf.n;
            StringBuilder sb = new StringBuilder(47);
            sb.append("YouTube MDx: invalid ad state code ");
            sb.append(i);
            sb.append(".");
            zga.c(str, sb.toString());
            adlfVar = adlf.AD_UNSTARTED;
        }
        adndVar.aC(adlfVar);
    }

    private final void e(JSONObject jSONObject) {
        if (this.a.N != null) {
            jSONObject.optInt("podPosition", 0);
            jSONObject.optInt("podLength", 0);
            jSONObject.optLong("podRemainingTime", 0L);
            this.a.i.d();
        }
    }

    private final void f(JSONObject jSONObject) {
        if (this.a.N == null || !jSONObject.has("currentTime")) {
            return;
        }
        this.a.V = TimeUnit.SECONDS.toMillis(jSONObject.getInt("currentTime"));
        adnd adndVar = this.a;
        adndVar.U = adndVar.i.d();
        this.a.aD = 0L;
    }

    private final void g(JSONObject jSONObject) {
        if (jSONObject.has("currentTime")) {
            this.a.V = jSONObject.getInt("currentTime") * 1000;
        } else if (jSONObject.has("current_time")) {
            this.a.V = jSONObject.getInt("current_time") * 1000;
        } else {
            this.a.V = 0L;
        }
        this.a.aa = jSONObject.has("liveIngestionTime");
        adnd adndVar = this.a;
        if (adndVar.aa) {
            adndVar.W = jSONObject.optInt("seekableEndTime", 0) * 1000;
        } else {
            adndVar.W = jSONObject.optInt("duration", 0) * 1000;
        }
        if (this.a.aa && jSONObject.has("seekableStartTime")) {
            this.a.X = jSONObject.getInt("seekableStartTime") * 1000;
        } else {
            this.a.X = -1L;
        }
        if (jSONObject.has("liveIngestionTime")) {
            this.a.Y = jSONObject.getInt("liveIngestionTime") * 1000;
        } else {
            this.a.Y = -1L;
        }
        adnd adndVar2 = this.a;
        adndVar2.U = adndVar2.i.d();
        this.a.aD = 0L;
    }

    private final void h(JSONObject jSONObject) {
        adlf adlfVar;
        adnd adndVar = this.a;
        int optInt = jSONObject.optInt("state", adlf.UNSTARTED.o);
        adlf[] values = adlf.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                adlfVar = adlf.UNSTARTED;
                break;
            }
            adlfVar = values[i];
            if (adlfVar.o == optInt) {
                break;
            } else {
                i++;
            }
        }
        adndVar.aC(adlfVar);
    }

    private static final int i(JSONObject jSONObject) {
        return jSONObject.optInt("currentIndex", adle.a.f);
    }

    private static final String j(JSONObject jSONObject) {
        return jSONObject.optString("listId", adle.a.e);
    }

    final adle a(JSONObject jSONObject) {
        if (this.a.F.i(c(jSONObject))) {
            adld c = adle.c();
            c.d(j(jSONObject));
            c.f(c(jSONObject));
            c.e(adle.a(i(jSONObject)));
            adle adleVar = this.a.F;
            c.b = adleVar.g;
            c.c = adleVar.h;
            c.b(adleVar.c);
            String.format("Parsing Playback results in MdxPlaybackDescriptor=%s", c.a());
            return c.a();
        }
        adld c2 = adle.c();
        c2.d(j(jSONObject));
        c2.f(c(jSONObject));
        c2.e(adle.a(i(jSONObject)));
        c2.b = jSONObject.has("params") ? jSONObject.getString("params") : null;
        c2.c = jSONObject.has("playerParams") ? jSONObject.getString("playerParams") : null;
        return c2.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0340, code lost:
    
        if (r2.equals("multiUserNotAllowed") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02c9, code lost:
    
        if (r3.equals("UNSUPPORTED") != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0358  */
    @Override // defpackage.adqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.adqz r20) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admx.b(adqz):void");
    }
}
