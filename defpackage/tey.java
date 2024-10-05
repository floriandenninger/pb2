package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tey extends tdx {
    private static final Map s;
    private static final Map t;
    private static final Map u;
    private static final Map v;
    private int A;
    private final tfc[] B;
    private final List C;
    public tez h;
    public long i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public double o;
    public int p;
    public int q;
    public int r;
    private boolean w;
    private boolean x;
    private boolean y;
    private final Set z;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("atos", rwh.K(tdu.AUDIBLE_TOS));
        linkedHashMap.put("avt", rwh.L(tdu.AUDIBLE_TOS, hashSet));
        linkedHashMap.put("davs", rwh.G(tdu.AUDIBLE_VISIBLE_TIME_DELTA));
        linkedHashMap.put("dafvs", rwh.G(tdu.AUDIBLE_FULLY_VISIBLE_TIME_DELTA));
        linkedHashMap.put("dav", rwh.G(tdu.AUDIBLE_VIEWABLE_TIME_DELTA));
        linkedHashMap.put("ss", rwh.J(tdu.SCREEN_SHARE, tdr.b));
        linkedHashMap.put("ssb", rwh.M(tdu.SCREEN_SHARE_BUCKETS, null, true));
        linkedHashMap.put("t", rwh.G(tdu.TIMESTAMP));
        s = Collections.unmodifiableMap(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("c", rwh.J(tdu.COVERAGE, tdr.b));
        linkedHashMap2.put("ss", rwh.J(tdu.SCREEN_SHARE, tdr.b));
        linkedHashMap2.put("a", rwh.J(tdu.VOLUME, tdr.c));
        linkedHashMap2.put("dur", rwh.G(tdu.DURATION));
        linkedHashMap2.put("p", rwh.K(tdu.POSITION));
        linkedHashMap2.put("gmm", rwh.G(tdu.GROUPM_MEASURABLE_VERSION));
        linkedHashMap2.put("gdr", rwh.G(tdu.GROUPM_DURATION_REACHED));
        linkedHashMap2.put("t", rwh.G(tdu.TIMESTAMP));
        HashSet hashSet2 = new HashSet();
        hashSet2.add(0);
        hashSet2.add(2);
        hashSet2.add(4);
        linkedHashMap2.put("at", rwh.G(tdu.AUDIBLE_TIME));
        linkedHashMap2.put("atos", rwh.L(tdu.AUDIBLE_TOS, hashSet2));
        linkedHashMap2.put("tos", rwh.I(tdu.TOS, hashSet2));
        linkedHashMap2.put("mtos", rwh.L(tdu.MAX_CONSECUTIVE_TOS, hashSet2));
        linkedHashMap2.put("vsv", rwh.H("a5"));
        t = Collections.unmodifiableMap(linkedHashMap2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(0);
        hashSet3.add(2);
        hashSet3.add(4);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("a", rwh.J(tdu.VOLUME, tdr.c));
        linkedHashMap3.put("tos", rwh.I(tdu.TOS, hashSet3));
        linkedHashMap3.put("at", rwh.G(tdu.AUDIBLE_TIME));
        linkedHashMap3.put("c", rwh.J(tdu.COVERAGE, tdr.b));
        linkedHashMap3.put("mtos", rwh.L(tdu.MAX_CONSECUTIVE_TOS, hashSet3));
        linkedHashMap3.put("dur", rwh.G(tdu.DURATION));
        linkedHashMap3.put("fs", rwh.G(tdu.FULLSCREEN));
        linkedHashMap3.put("p", rwh.K(tdu.POSITION));
        linkedHashMap3.put("vpt", rwh.G(tdu.PLAY_TIME));
        linkedHashMap3.put("vsv", rwh.H("ias_a2"));
        linkedHashMap3.put("gmm", rwh.G(tdu.GROUPM_MEASURABLE_VERSION));
        linkedHashMap3.put("gdr", rwh.G(tdu.GROUPM_DURATION_REACHED));
        linkedHashMap3.put("t", rwh.G(tdu.TIMESTAMP));
        u = Collections.unmodifiableMap(linkedHashMap3);
        HashSet hashSet4 = new HashSet();
        hashSet4.add(0);
        hashSet4.add(2);
        hashSet4.add(4);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("tos", rwh.I(tdu.TOS, hashSet4));
        linkedHashMap4.put("at", rwh.G(tdu.AUDIBLE_TIME));
        linkedHashMap4.put("c", rwh.J(tdu.COVERAGE, tdr.b));
        linkedHashMap4.put("mtos", rwh.L(tdu.MAX_CONSECUTIVE_TOS, hashSet4));
        linkedHashMap4.put("p", rwh.K(tdu.POSITION));
        linkedHashMap4.put("vpt", rwh.G(tdu.PLAY_TIME));
        linkedHashMap4.put("vsv", rwh.H("dv_a4"));
        linkedHashMap4.put("gmm", rwh.G(tdu.GROUPM_MEASURABLE_VERSION));
        linkedHashMap4.put("gdr", rwh.G(tdu.GROUPM_DURATION_REACHED));
        linkedHashMap4.put("t", rwh.G(tdu.TIMESTAMP));
        linkedHashMap4.put("mv", rwh.J(tdu.MAX_VOLUME, tdr.b));
        linkedHashMap4.put("qmpt", rwh.L(tdu.QUARTILE_MAX_CONSECUTIVE_TOS, hashSet4));
        linkedHashMap4.put("qvs", new tep(tdu.QUARTILE_MIN_COVERAGE, new int[]{100, 50, 0}));
        linkedHashMap4.put("qmv", rwh.J(tdu.QUARTILE_MAX_VOLUME, tdr.b));
        linkedHashMap4.put("qa", rwh.G(tdu.QUARTILE_AUDIBLE_SINCE_START));
        linkedHashMap4.put("a", rwh.J(tdu.VOLUME, tdr.c));
        v = Collections.unmodifiableMap(linkedHashMap4);
    }

    public tey(tez tezVar, baof baofVar, byte[] bArr) {
        super(new tfc(baofVar.b));
        this.k = -1L;
        this.A = 1;
        this.B = new tfc[4];
        this.C = new ArrayList();
        this.r = 2;
        this.z = EnumSet.noneOf(tfa.class);
        this.h = tezVar;
    }

    public static final tdt q(tfa tfaVar, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sv", rwh.H("85"));
        linkedHashMap.put("cb", rwh.H("a"));
        linkedHashMap.put("sdk", rwh.G(tdu.SDK));
        linkedHashMap.put("gmm", rwh.G(tdu.GROUPM_MEASURABLE_VERSION));
        linkedHashMap.put("a", rwh.J(tdu.VOLUME, tdr.c));
        linkedHashMap.put("nv", rwh.J(tdu.MIN_VOLUME, tdr.c));
        linkedHashMap.put("mv", rwh.J(tdu.MAX_VOLUME, tdr.c));
        linkedHashMap.put("c", rwh.J(tdu.COVERAGE, tdr.b));
        linkedHashMap.put("nc", rwh.J(tdu.MIN_COVERAGE, tdr.b));
        linkedHashMap.put("mc", rwh.J(tdu.MAX_COVERAGE, tdr.b));
        linkedHashMap.put("tos", rwh.K(tdu.TOS));
        linkedHashMap.put("mtos", rwh.K(tdu.MAX_CONSECUTIVE_TOS));
        linkedHashMap.put("amtos", rwh.K(tdu.AUDIBLE_MTOS));
        linkedHashMap.put("p", rwh.K(tdu.POSITION));
        linkedHashMap.put("cp", rwh.K(tdu.CONTAINER_POSITION));
        linkedHashMap.put("bs", rwh.K(tdu.VIEWPORT_SIZE));
        linkedHashMap.put("ps", rwh.K(tdu.APP_SIZE));
        linkedHashMap.put("scs", rwh.K(tdu.SCREEN_SIZE));
        linkedHashMap.put("at", rwh.G(tdu.AUDIBLE_TIME));
        linkedHashMap.put("as", rwh.G(tdu.AUDIBLE_SINCE_START));
        linkedHashMap.put("dur", rwh.G(tdu.DURATION));
        linkedHashMap.put("vmtime", rwh.G(tdu.CURRENT_MEDIA_TIME));
        linkedHashMap.put("dvs", rwh.G(tdu.VISIBLE_TIME_DELTA));
        linkedHashMap.put("dfvs", rwh.G(tdu.FULLY_VISIBLE_TIME_DELTA));
        linkedHashMap.put("dtos", rwh.G(tdu.TOS_DELTA));
        linkedHashMap.put("dtoss", rwh.G(tdu.TOS_DELTA_SEQUENCE));
        linkedHashMap.put("std", rwh.G(tdu.GROUPM_VIEWABLE));
        linkedHashMap.put("tcm", rwh.G(tdu.TIME_CALCULATION_MODE));
        linkedHashMap.put("bt", rwh.G(tdu.BUFFERING_TIME));
        linkedHashMap.put("pst", rwh.G(tdu.PLAYBACK_STARTED_TIME));
        linkedHashMap.put("nmt", rwh.G(tdu.NEGATIVE_MEDIA_TIME));
        linkedHashMap.put("ft", rwh.G(tdu.FULLSCREEN_TIME));
        linkedHashMap.put("dat", rwh.G(tdu.AUDIBLE_TIME_DELTA));
        linkedHashMap.put("dft", rwh.G(tdu.FULLSCREEN_TIME_DELTA));
        linkedHashMap.put("is", rwh.G(tdu.INSTANTANEOUS_STATE));
        linkedHashMap.put("i0", rwh.G(tdu.INSTANTANEOUS_STATE_AT_START));
        linkedHashMap.put("i1", rwh.G(tdu.INSTANTANEOUS_STATE_AT_Q1));
        linkedHashMap.put("i2", rwh.G(tdu.INSTANTANEOUS_STATE_AT_Q2));
        linkedHashMap.put("i3", rwh.G(tdu.INSTANTANEOUS_STATE_AT_Q3));
        linkedHashMap.put("ic", rwh.G(tdu.IMPRESSION_COUNTING_STATE));
        linkedHashMap.put("cs", rwh.G(tdu.CUMULATIVE_STATE));
        linkedHashMap.put("vpt", rwh.G(tdu.PLAY_TIME));
        linkedHashMap.put("dvpt", rwh.G(tdu.PLAY_TIME_DELTA));
        linkedHashMap.put("lte", rwh.H("1"));
        linkedHashMap.put("avms", rwh.H("nl"));
        if (tfaVar != null && (tfaVar.a() || tfaVar.b())) {
            linkedHashMap.put("qmt", rwh.K(tdu.QUARTILE_MAX_CONSECUTIVE_TOS));
            linkedHashMap.put("qnc", rwh.J(tdu.QUARTILE_MIN_COVERAGE, tdr.b));
            linkedHashMap.put("qmv", rwh.J(tdu.QUARTILE_MAX_VOLUME, tdr.c));
            linkedHashMap.put("qnv", rwh.J(tdu.QUARTILE_MIN_VOLUME, tdr.c));
        }
        if (tfaVar != null && tfaVar.b()) {
            linkedHashMap.put("c0", rwh.N(tdu.EXPOSURE_STATE_AT_START, tdr.b));
            linkedHashMap.put("c1", rwh.N(tdu.EXPOSURE_STATE_AT_Q1, tdr.b));
            linkedHashMap.put("c2", rwh.N(tdu.EXPOSURE_STATE_AT_Q2, tdr.b));
            linkedHashMap.put("c3", rwh.N(tdu.EXPOSURE_STATE_AT_Q3, tdr.b));
            linkedHashMap.put("a0", rwh.N(tdu.VOLUME_STATE_AT_START, tdr.c));
            linkedHashMap.put("a1", rwh.N(tdu.VOLUME_STATE_AT_Q1, tdr.c));
            linkedHashMap.put("a2", rwh.N(tdu.VOLUME_STATE_AT_Q2, tdr.c));
            linkedHashMap.put("a3", rwh.N(tdu.VOLUME_STATE_AT_Q3, tdr.c));
            linkedHashMap.put("ss0", rwh.N(tdu.SCREEN_SHARE_STATE_AT_START, tdr.b));
            linkedHashMap.put("ss1", rwh.N(tdu.SCREEN_SHARE_STATE_AT_Q1, tdr.b));
            linkedHashMap.put("ss2", rwh.N(tdu.SCREEN_SHARE_STATE_AT_Q2, tdr.b));
            linkedHashMap.put("ss3", rwh.N(tdu.SCREEN_SHARE_STATE_AT_Q3, tdr.b));
            linkedHashMap.put("p0", rwh.K(tdu.POSITION_AT_START));
            linkedHashMap.put("p1", rwh.K(tdu.POSITION_AT_Q1));
            linkedHashMap.put("p2", rwh.K(tdu.POSITION_AT_Q2));
            linkedHashMap.put("p3", rwh.K(tdu.POSITION_AT_Q3));
            linkedHashMap.put("cp0", rwh.K(tdu.CONTAINER_POSITION_AT_START));
            linkedHashMap.put("cp1", rwh.K(tdu.CONTAINER_POSITION_AT_Q1));
            linkedHashMap.put("cp2", rwh.K(tdu.CONTAINER_POSITION_AT_Q2));
            linkedHashMap.put("cp3", rwh.K(tdu.CONTAINER_POSITION_AT_Q3));
            amsx t2 = amsx.t(0, 2, 4);
            linkedHashMap.put("mtos1", rwh.M(tdu.MAX_CONSECUTIVE_TOS_AT_Q1, t2, false));
            linkedHashMap.put("mtos2", rwh.M(tdu.MAX_CONSECUTIVE_TOS_AT_Q2, t2, false));
            linkedHashMap.put("mtos3", rwh.M(tdu.MAX_CONSECUTIVE_TOS_AT_Q3, t2, false));
        }
        linkedHashMap.put("psm", rwh.G(tdu.PER_SECOND_MEASURABLE));
        linkedHashMap.put("psv", rwh.G(tdu.PER_SECOND_VIEWABLE));
        linkedHashMap.put("psfv", rwh.G(tdu.PER_SECOND_FULLY_VIEWABLE));
        linkedHashMap.put("psa", rwh.G(tdu.PER_SECOND_AUDIBLE));
        String S = rwh.S(map, Collections.unmodifiableMap(linkedHashMap), null, null);
        String S2 = rwh.S(map, s, null, null);
        String S3 = rwh.S(map, t, "h", "kArwaWEsTs");
        String S4 = rwh.S(map, u, "h", "b96YPMzfnx");
        String S5 = rwh.S(map, v, "h", "yb8Wev6QDg");
        tds a = tdt.a();
        a.a = S;
        a.b = S3;
        a.c = S2;
        a.d = S4;
        a.e = S5;
        return a.a();
    }

    @Override // defpackage.tdx
    public final boolean f() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final tdt i(tfa tfaVar) {
        boolean z = false;
        if (!this.z.contains(tfaVar) && this.h.b(tfaVar).contains("VIEWABILITY")) {
            z = true;
        }
        Map k = k(z);
        if (tfaVar == tfa.GROUPM_VIEWABLE_IMPRESSION) {
            k.put(tdu.GROUPM_VIEWABLE, "csm");
        }
        return q(tfaVar, k);
    }

    public final tfc j() {
        tfc[] tfcVarArr = this.B;
        int i = this.A - 1;
        if (tfcVarArr[i] == null) {
            tfcVarArr[i] = new tfc();
        }
        return this.B[this.A - 1];
    }

    public final Map k(boolean z) {
        Map c = c();
        c.put(tdu.GROUPM_MEASURABLE_VERSION, 4);
        c.put(tdu.VOLUME, Double.valueOf(this.o));
        c.put(tdu.DURATION, Integer.valueOf(this.p));
        c.put(tdu.CURRENT_MEDIA_TIME, Integer.valueOf(this.q));
        c.put(tdu.TIME_CALCULATION_MODE, Integer.valueOf(this.r - 1));
        c.put(tdu.BUFFERING_TIME, Long.valueOf(this.i));
        c.put(tdu.FULLSCREEN, Boolean.valueOf(this.n));
        c.put(tdu.PLAYBACK_STARTED_TIME, Long.valueOf(this.k));
        c.put(tdu.NEGATIVE_MEDIA_TIME, Long.valueOf(this.j));
        c.put(tdu.MIN_VOLUME, Double.valueOf(((tfc) this.e).g));
        c.put(tdu.MAX_VOLUME, Double.valueOf(((tfc) this.e).h));
        c.put(tdu.AUDIBLE_TOS, ((tfc) this.e).u.i(1, true));
        c.put(tdu.AUDIBLE_MTOS, ((tfc) this.e).u.i(2, false));
        c.put(tdu.AUDIBLE_TIME, Long.valueOf(((tfc) this.e).k.b(1)));
        c.put(tdu.AUDIBLE_SINCE_START, Boolean.valueOf(((tfc) this.e).h()));
        c.put(tdu.QUARTILE_AUDIBLE_SINCE_START, Boolean.valueOf(((tfc) this.e).h()));
        c.put(tdu.PLAY_TIME, Long.valueOf(((tfc) this.e).f()));
        c.put(tdu.FULLSCREEN_TIME, Long.valueOf(((tfc) this.e).i));
        c.put(tdu.GROUPM_DURATION_REACHED, Boolean.valueOf(((tfc) this.e).i()));
        c.put(tdu.INSTANTANEOUS_STATE, Integer.valueOf(((tfc) this.e).q.a()));
        if (this.C.size() > 0) {
            tex texVar = (tex) this.C.get(0);
            c.put(tdu.INSTANTANEOUS_STATE_AT_START, texVar.d);
            c.put(tdu.EXPOSURE_STATE_AT_START, new Double[]{Double.valueOf(texVar.a)});
            c.put(tdu.VOLUME_STATE_AT_START, new Double[]{Double.valueOf(texVar.b)});
            c.put(tdu.SCREEN_SHARE_STATE_AT_START, new Double[]{Double.valueOf(texVar.c)});
            c.put(tdu.POSITION_AT_START, texVar.f());
            Integer[] e = texVar.e();
            if (e != null && !Arrays.equals(e, texVar.f())) {
                c.put(tdu.CONTAINER_POSITION_AT_START, e);
            }
        }
        if (this.C.size() >= 2) {
            tex texVar2 = (tex) this.C.get(1);
            c.put(tdu.INSTANTANEOUS_STATE_AT_Q1, texVar2.d);
            c.put(tdu.EXPOSURE_STATE_AT_Q1, texVar2.b());
            c.put(tdu.VOLUME_STATE_AT_Q1, texVar2.d());
            c.put(tdu.SCREEN_SHARE_STATE_AT_Q1, texVar2.c());
            c.put(tdu.POSITION_AT_Q1, texVar2.f());
            c.put(tdu.MAX_CONSECUTIVE_TOS_AT_Q1, texVar2.e);
            Integer[] e2 = texVar2.e();
            if (e2 != null && !Arrays.equals(e2, texVar2.f())) {
                c.put(tdu.CONTAINER_POSITION_AT_Q1, e2);
            }
        }
        if (this.C.size() >= 3) {
            tex texVar3 = (tex) this.C.get(2);
            c.put(tdu.INSTANTANEOUS_STATE_AT_Q2, texVar3.d);
            c.put(tdu.EXPOSURE_STATE_AT_Q2, texVar3.b());
            c.put(tdu.VOLUME_STATE_AT_Q2, texVar3.d());
            c.put(tdu.SCREEN_SHARE_STATE_AT_Q2, texVar3.c());
            c.put(tdu.POSITION_AT_Q2, texVar3.f());
            c.put(tdu.MAX_CONSECUTIVE_TOS_AT_Q2, texVar3.e);
            Integer[] e3 = texVar3.e();
            if (e3 != null && !Arrays.equals(e3, texVar3.f())) {
                c.put(tdu.CONTAINER_POSITION_AT_Q2, e3);
            }
        }
        if (this.C.size() >= 4) {
            tex texVar4 = (tex) this.C.get(3);
            c.put(tdu.INSTANTANEOUS_STATE_AT_Q3, texVar4.d);
            c.put(tdu.EXPOSURE_STATE_AT_Q3, texVar4.b());
            c.put(tdu.VOLUME_STATE_AT_Q3, texVar4.d());
            c.put(tdu.SCREEN_SHARE_STATE_AT_Q3, texVar4.c());
            c.put(tdu.POSITION_AT_Q3, texVar4.f());
            c.put(tdu.MAX_CONSECUTIVE_TOS_AT_Q3, texVar4.e);
            Integer[] e4 = texVar4.e();
            if (e4 != null && !Arrays.equals(e4, texVar4.f())) {
                c.put(tdu.CONTAINER_POSITION_AT_Q3, e4);
            }
        }
        tdu tduVar = tdu.CUMULATIVE_STATE;
        Iterator it = ((tfc) this.e).q.b.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((ted) it.next()).p;
        }
        c.put(tduVar, Integer.valueOf(i));
        if (z) {
            if (((tfc) this.e).c()) {
                c.put(tdu.TOS_DELTA, Integer.valueOf((int) ((tfc) this.e).l.a()));
                tdu tduVar2 = tdu.TOS_DELTA_SEQUENCE;
                tfc tfcVar = (tfc) this.e;
                int i2 = tfcVar.o;
                tfcVar.o = i2 + 1;
                c.put(tduVar2, Integer.valueOf(i2));
                c.put(tdu.AUDIBLE_VIEWABLE_TIME_DELTA, Integer.valueOf((int) ((tfc) this.e).n.a()));
            }
            c.put(tdu.VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tfc) this.e).e.d(teg.HALF.f)));
            c.put(tdu.FULLY_VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tfc) this.e).e.d(teg.FULL.f)));
            c.put(tdu.AUDIBLE_VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tfc) this.e).u.d(teg.HALF.f)));
            c.put(tdu.AUDIBLE_FULLY_VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tfc) this.e).u.d(teg.FULL.f)));
            tdu tduVar3 = tdu.IMPRESSION_COUNTING_STATE;
            tee teeVar = ((tfc) this.e).q;
            int i3 = 0;
            for (ted tedVar : teeVar.b.keySet()) {
                if (!((Boolean) teeVar.b.get(tedVar)).booleanValue()) {
                    i3 |= tedVar.o;
                    teeVar.b.put((EnumMap) tedVar, (ted) true);
                }
            }
            c.put(tduVar3, Integer.valueOf(i3));
            ((tfc) this.e).u.h();
            ((tfc) this.e).e.h();
            c.put(tdu.AUDIBLE_TIME_DELTA, Integer.valueOf((int) ((tfc) this.e).k.a()));
            c.put(tdu.PLAY_TIME_DELTA, Integer.valueOf((int) ((tfc) this.e).j.a()));
            tdu tduVar4 = tdu.FULLSCREEN_TIME_DELTA;
            tfc tfcVar2 = (tfc) this.e;
            int i4 = tfcVar2.m;
            tfcVar2.m = 0;
            c.put(tduVar4, Integer.valueOf(i4));
        }
        c.put(tdu.QUARTILE_MAX_CONSECUTIVE_TOS, j().d());
        c.put(tdu.QUARTILE_MIN_COVERAGE, Double.valueOf(j().a));
        c.put(tdu.QUARTILE_MAX_VOLUME, Double.valueOf(j().h));
        c.put(tdu.QUARTILE_AUDIBLE_SINCE_START, Boolean.valueOf(j().h()));
        c.put(tdu.QUARTILE_MIN_VOLUME, Double.valueOf(j().g));
        c.put(tdu.PER_SECOND_MEASURABLE, Integer.valueOf(((tfc) this.e).r.b));
        c.put(tdu.PER_SECOND_VIEWABLE, Integer.valueOf(((tfc) this.e).r.a));
        c.put(tdu.PER_SECOND_FULLY_VIEWABLE, Integer.valueOf(((tfc) this.e).s.a));
        c.put(tdu.PER_SECOND_AUDIBLE, Integer.valueOf(((tfc) this.e).t.a));
        return c;
    }

    public final void l() {
        if (this.w) {
            return;
        }
        this.h.d(i(tfa.MEASURABLE_IMPRESSION));
        this.w = true;
    }

    public final void m() {
        if (g() && !this.x) {
            this.h.e(i(tfa.VIEWABLE_IMPRESSION));
            this.z.add(tfa.VIEWABLE_IMPRESSION);
            this.x = true;
        }
        tfc tfcVar = (tfc) this.e;
        if (!tfcVar.j(tfcVar.u.e(1, teg.FULL.f)) || this.y) {
            return;
        }
        this.h.c(i(tfa.GROUPM_VIEWABLE_IMPRESSION));
        this.z.add(tfa.GROUPM_VIEWABLE_IMPRESSION);
        this.y = true;
    }

    public final void n(tfa tfaVar) {
        this.z.add(tfaVar);
    }

    public final void o(tfa tfaVar) {
        if (tfaVar.u < 0) {
            return;
        }
        for (int size = this.C.size(); size <= tfaVar.u; size++) {
            this.C.add(tex.a().a());
        }
        tdy tdyVar = this.f;
        if (tdyVar == null) {
            return;
        }
        tfc j = j();
        tew a = tex.a();
        a.b(tdyVar.a);
        a.k(this.o);
        a.j(tdyVar.b);
        a.a = tdyVar.c;
        a.b = tdyVar.d;
        a.c = Integer.valueOf(((tfc) this.e).q.a());
        if (!tfaVar.equals(tfa.START)) {
            a.f(j.a);
            a.c(j.b);
            a.h(j.g);
            a.e(j.h);
            a.g(j.c);
            a.d(j.d);
            a.i(amru.p(j.e(false)));
        } else {
            a.f(tdyVar.a);
            a.c(tdyVar.a);
            a.h(this.o);
            a.e(this.o);
            a.g(tdyVar.b);
            a.d(tdyVar.b);
        }
        this.C.set(tfaVar.u, a.a());
    }

    public final void p(int i) {
        if (i <= 0 || i > 4) {
            return;
        }
        this.A = i;
    }

    public final void r() {
        this.m = true;
    }
}
