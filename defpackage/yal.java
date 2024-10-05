package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yal {
    public final ajmu a;
    public ajok b;
    private final Map c = new WeakHashMap();

    public yal(ajmu ajmuVar) {
        this.a = ajmuVar;
    }

    static final Uri l(String str) {
        return ajmu.g(1, "comment", str, "creator_heart_button");
    }

    static final Uri m(String str) {
        return ajmu.g(1, "comment", str, "like_button");
    }

    public static final Uri n(String str) {
        return ajmu.g(1, "comment", str, "poll_renderer");
    }

    public static final Uri o(String str) {
        return ajmu.g(1, "comment", str, "poll_status");
    }

    private static final Uri p(String str) {
        return ajmu.g(1, "comment", str, "dislike_button");
    }

    public final apmp a(String str, apxj apxjVar, boolean z) {
        apmp apmpVar;
        apmh apmhVar = apxjVar.d;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 2) != 0) {
            apmh apmhVar2 = apxjVar.d;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmpVar = apmhVar2.d;
            if (apmpVar == null) {
                apmpVar = apmp.a;
            }
        } else {
            apmpVar = null;
        }
        return (apmp) e(p(str), apmpVar, apmp.class, apxjVar.h, z);
    }

    public final apmp b(String str, apxj apxjVar, boolean z) {
        apmp apmpVar;
        apmh apmhVar = apxjVar.c;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 2) != 0) {
            apmh apmhVar2 = apxjVar.c;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmpVar = apmhVar2.d;
            if (apmpVar == null) {
                apmpVar = apmp.a;
            }
        } else {
            apmpVar = null;
        }
        return (apmp) e(m(str), apmpVar, apmp.class, apxjVar.h, z);
    }

    public final apyk c(apyv apyvVar, boolean z) {
        audq audqVar;
        apjn apjnVar = apyvVar.B;
        if (apjnVar == null) {
            apjnVar = apjn.a;
        }
        if (apjnVar.b == 99391126) {
            apjn apjnVar2 = apyvVar.B;
            if (apjnVar2 == null) {
                apjnVar2 = apjn.a;
            }
            if (apjnVar2.b == 99391126) {
                audqVar = (audq) apjnVar2.c;
            } else {
                audqVar = audq.a;
            }
        } else {
            audqVar = null;
        }
        if (audqVar != null) {
            apyk b = apyk.b(apyvVar.H);
            if (b == null) {
                b = apyk.COMMENT_POLL_STATUS_UNKNOWN;
            }
            if (b != apyk.COMMENT_POLL_STATUS_UNKNOWN) {
                Uri o = o(apyvVar.i);
                apyk b2 = apyk.b(apyvVar.H);
                if (b2 == null) {
                    b2 = apyk.COMMENT_POLL_STATUS_UNKNOWN;
                }
                return (apyk) e(o, b2, apyk.class, audqVar.k, z);
            }
        }
        apyk b3 = apyk.b(apyvVar.H);
        return b3 == null ? apyk.COMMENT_POLL_STATUS_UNKNOWN : b3;
    }

    public final aqhh d(String str, apxj apxjVar, boolean z) {
        aqhh aqhhVar;
        aqhi aqhiVar = apxjVar.f;
        if (aqhiVar == null) {
            aqhiVar = aqhi.a;
        }
        if ((aqhiVar.b & 1) != 0) {
            aqhi aqhiVar2 = apxjVar.f;
            if (aqhiVar2 == null) {
                aqhiVar2 = aqhi.a;
            }
            aqhhVar = aqhiVar2.c;
            if (aqhhVar == null) {
                aqhhVar = aqhh.a;
            }
        } else {
            aqhhVar = null;
        }
        return (aqhh) e(l(str), aqhhVar, aqhh.class, apxjVar.h, z);
    }

    public final Object e(Uri uri, Object obj, Class cls, long j, boolean z) {
        if (obj != null && j != 0) {
            yaj yajVar = (yaj) this.a.b(uri);
            if (yajVar != null && yajVar.b >= j) {
                return cls.cast(yajVar.a);
            }
            if ((yajVar == null && z) || (yajVar != null && yajVar.b < j)) {
                this.a.d(uri, new yaj(obj, j));
            }
        }
        return obj;
    }

    public final void f(Uri uri, yak yakVar) {
        yai yaiVar = new yai(this, yakVar);
        this.a.h(uri, yaiVar);
        this.c.put(yakVar, yaiVar);
    }

    public final void g(yak yakVar) {
        ajmt ajmtVar = (ajmt) this.c.remove(yakVar);
        if (ajmtVar != null) {
            this.a.e(ajmtVar);
        }
    }

    public final void h(String str, long j, apmp apmpVar, apmp apmpVar2) {
        if (j == 0) {
            return;
        }
        if (apmpVar != null) {
            this.a.c(m(str), new yaj(apmpVar, j));
        }
        if (apmpVar2 != null) {
            this.a.c(p(str), new yaj(apmpVar2, j));
        }
    }

    public final void i(String str, long j, aqhh aqhhVar) {
        if (j == 0 || aqhhVar == null) {
            return;
        }
        this.a.c(l(str), new yaj(aqhhVar, j));
    }

    public final void j(String str, audq audqVar) {
        if (audqVar == null || audqVar.k == 0) {
            return;
        }
        this.a.c(n(str), new yaj(audqVar, audqVar.k));
    }

    public final void k(String str, long j, apyk apykVar) {
        if (j == 0 || apykVar == apyk.COMMENT_POLL_STATUS_UNKNOWN) {
            return;
        }
        this.a.c(o(str), new yaj(apykVar, j));
    }
}
