package defpackage;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qla extends qkf {
    public static final String e = qko.c("com.google.cast.media");
    final qld A;
    final qld B;
    public final qld C;
    public rpv D;
    public qjj E;
    public long f;
    public MediaStatus g;
    public Long h;
    public int i;
    public final qld j;
    public final qld k;
    public final qld l;
    final qld m;
    public final qld n;
    public final qld o;
    public final qld p;
    public final qld q;
    final qld r;
    final qld s;
    final qld t;
    final qld u;
    final qld v;
    final qld w;
    public final qld x;
    public final qld y;
    public final qld z;

    public qla() {
        super(e);
        this.i = -1;
        qld qldVar = new qld(86400000L);
        this.j = qldVar;
        qld qldVar2 = new qld(86400000L);
        this.k = qldVar2;
        qld qldVar3 = new qld(86400000L);
        this.l = qldVar3;
        qld qldVar4 = new qld(86400000L);
        this.m = qldVar4;
        qld qldVar5 = new qld(10000L);
        this.n = qldVar5;
        qld qldVar6 = new qld(86400000L);
        this.o = qldVar6;
        qld qldVar7 = new qld(86400000L);
        this.p = qldVar7;
        qld qldVar8 = new qld(86400000L);
        this.q = qldVar8;
        qld qldVar9 = new qld(86400000L);
        this.r = qldVar9;
        qld qldVar10 = new qld(86400000L);
        this.s = qldVar10;
        qld qldVar11 = new qld(86400000L);
        this.t = qldVar11;
        qld qldVar12 = new qld(86400000L);
        this.u = qldVar12;
        qld qldVar13 = new qld(86400000L);
        this.v = qldVar13;
        qld qldVar14 = new qld(86400000L);
        this.w = qldVar14;
        qld qldVar15 = new qld(86400000L);
        this.x = qldVar15;
        qld qldVar16 = new qld(86400000L);
        this.z = qldVar16;
        this.y = new qld(86400000L);
        qld qldVar17 = new qld(86400000L);
        this.A = qldVar17;
        qld qldVar18 = new qld(86400000L);
        this.B = qldVar18;
        qld qldVar19 = new qld(86400000L);
        this.C = qldVar19;
        d(qldVar);
        d(qldVar2);
        d(qldVar3);
        d(qldVar4);
        d(qldVar5);
        d(qldVar6);
        d(qldVar7);
        d(qldVar8);
        d(qldVar9);
        d(qldVar10);
        d(qldVar11);
        d(qldVar12);
        d(qldVar13);
        d(qldVar14);
        d(qldVar15);
        d(qldVar16);
        d(qldVar16);
        d(qldVar17);
        d(qldVar18);
        d(qldVar19);
        q();
    }

    public static int[] n(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public static pse p(JSONObject jSONObject) {
        MediaError.a(jSONObject);
        pse pseVar = new pse();
        qko.h(jSONObject, "customData");
        return pseVar;
    }

    private final void q() {
        this.f = 0L;
        this.g = null;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((qld) it.next()).d(2002);
        }
    }

    @Override // defpackage.qkf
    public final void b() {
        synchronized (this.d) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((qld) it.next()).d(2002);
            }
        }
        q();
    }

    public final long e(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        double d2 = elapsedRealtime;
        Double.isNaN(d2);
        long j3 = j + ((long) (d2 * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public final long f() {
        MediaStatus mediaStatus = this.g;
        if (mediaStatus != null) {
            return mediaStatus.b;
        }
        throw new qkz();
    }

    public final long g() {
        MediaInfo h = h();
        if (h != null) {
            return h.e;
        }
        return 0L;
    }

    public final MediaInfo h() {
        MediaStatus mediaStatus = this.g;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.a;
    }

    public final void i(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.a.d(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    public final void j() {
        qjj qjjVar = this.E;
        if (qjjVar != null) {
            Iterator it = qjjVar.a.c.iterator();
            while (it.hasNext()) {
                ((qjd) it.next()).b();
            }
            for (qip qipVar : qjjVar.a.d) {
            }
        }
    }

    public final void k() {
        qjj qjjVar = this.E;
        if (qjjVar != null) {
            Iterator it = qjjVar.a.c.iterator();
            while (it.hasNext()) {
                ((qjd) it.next()).c();
            }
            for (qip qipVar : qjjVar.a.d) {
            }
        }
    }

    public final void l() {
        qjj qjjVar = this.E;
        if (qjjVar != null) {
            Iterator it = qjjVar.a.c.iterator();
            while (it.hasNext()) {
                ((qjd) it.next()).d();
            }
            for (qip qipVar : qjjVar.a.d) {
            }
        }
    }

    public final void m() {
        qjj qjjVar = this.E;
        if (qjjVar != null) {
            qjk qjkVar = qjjVar.a;
            Iterator it = qjkVar.e.values().iterator();
            if (!it.hasNext()) {
                Iterator it2 = qjjVar.a.c.iterator();
                while (it2.hasNext()) {
                    ((qjd) it2.next()).f();
                }
                Iterator it3 = qjjVar.a.d.iterator();
                while (it3.hasNext()) {
                    ((qip) it3.next()).h();
                }
                return;
            }
            if (qjkVar.m()) {
                throw null;
            }
            if (qjkVar.m()) {
                throw null;
            }
            throw null;
        }
    }

    public final void o(qlb qlbVar, int i) {
        JSONObject jSONObject = new JSONObject();
        long a = a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", f());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.i;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        c(jSONObject.toString(), a);
        this.u.a(a, new qky(this, qlbVar, 0));
    }
}
