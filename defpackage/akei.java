package defpackage;

import android.text.TextUtils;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akei {
    public static final int[] a;
    public static final int b;
    public int c;
    public boolean d;
    public String e;
    public List f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public boolean l;
    public int m;
    public String n;
    public int o = 1;
    private long p;
    private int q;
    private int r;
    private Set s;
    private final shf t;

    static {
        int[] iArr = {0, 1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
        a = iArr;
        b = iArr[19] + 1;
    }

    public akei(shf shfVar) {
        this.t = shfVar;
    }

    private final int h(int i) {
        int size = this.f == null ? -1 : r0.size() - 1;
        if (i < -1 || i > size) {
            return -1;
        }
        return i;
    }

    public final asas a(String str) {
        int i;
        Integer num;
        akej akejVar = new akej();
        akejVar.a(-1);
        akejVar.f(-1);
        akejVar.b(0);
        akejVar.c(-1);
        akejVar.e(-1);
        akejVar.i(0);
        akejVar.h(0);
        akejVar.l(1);
        akejVar.d(amvs.a);
        akejVar.k(false);
        akejVar.g(0);
        akejVar.j(0);
        akejVar.p = null;
        akejVar.o = null;
        if (!TextUtils.isEmpty(this.n)) {
            akejVar.p = this.n;
        }
        if (str != null) {
            akejVar.a = str;
            akejVar.b = this.e;
            akejVar.a(h(this.h));
            akejVar.f(h(this.g));
            if (this.d) {
                i = this.c > 1 ? 3 : 1;
            } else {
                i = this.c > 0 ? 2 : 0;
            }
            akejVar.b(i);
            akejVar.e = this.f;
            akejVar.c(this.q);
            akejVar.e(this.r);
            akejVar.i((int) (this.t.d() - this.p));
            akejVar.l(this.o);
            akejVar.d(this.s);
            akejVar.g(this.j);
            akejVar.j(this.i);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr = this.k;
                if (i2 >= iArr.length) {
                    break;
                }
                long j = iArr[i2];
                if (j == 0) {
                    i3++;
                } else {
                    if (sb.length() > 0) {
                        sb.append("j");
                    }
                    if (i3 == 1) {
                        sb.append("0j");
                    } else if (i3 > 1) {
                        sb.append(i2);
                        sb.append("-");
                    }
                    sb.append(j);
                    i3 = 0;
                }
                i2++;
            }
            akejVar.o = sb.toString();
            akejVar.k(this.l);
            akejVar.h(this.m);
            String str2 = akejVar.a;
            if (str2 == null || (num = akejVar.c) == null || akejVar.d == null || akejVar.f == null || akejVar.g == null || akejVar.h == null || akejVar.i == null || akejVar.j == null || akejVar.k == null || akejVar.q == 0 || akejVar.l == null || akejVar.m == null || akejVar.n == null) {
                StringBuilder sb2 = new StringBuilder();
                if (akejVar.a == null) {
                    sb2.append(" clientName");
                }
                if (akejVar.c == null) {
                    sb2.append(" assistedQueryIndex");
                }
                if (akejVar.d == null) {
                    sb2.append(" lastVisibleSuggestionIndex");
                }
                if (akejVar.f == null) {
                    sb2.append(" experimentTriggered");
                }
                if (akejVar.g == null) {
                    sb2.append(" firstEditTimeMillis");
                }
                if (akejVar.h == null) {
                    sb2.append(" lastEditTimeMillis");
                }
                if (akejVar.i == null) {
                    sb2.append(" sessionDurationMillis");
                }
                if (akejVar.j == null) {
                    sb2.append(" zeroPrefixSuggestionsEnabled");
                }
                if (akejVar.k == null) {
                    sb2.append(" numZeroPrefixSuggestionsShown");
                }
                if (akejVar.q == 0) {
                    sb2.append(" searchMethod");
                }
                if (akejVar.l == null) {
                    sb2.append(" inputMethods");
                }
                if (akejVar.m == null) {
                    sb2.append(" maxRoundTripTimeMsec");
                }
                if (akejVar.n == null) {
                    sb2.append(" totalRoundTripTimeMsec");
                }
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb3.append("Missing required properties:");
                sb3.append(valueOf);
                throw new IllegalStateException(sb3.toString());
            }
            akek akekVar = new akek(str2, akejVar.b, num.intValue(), akejVar.d.intValue(), akejVar.e, akejVar.f.intValue(), akejVar.g.intValue(), akejVar.h.intValue(), akejVar.i.intValue(), akejVar.j.booleanValue(), akejVar.k.intValue(), akejVar.q, akejVar.l, akejVar.m.intValue(), akejVar.n.intValue(), akejVar.o, akejVar.p);
            zhq.m(akekVar.a);
            aone createBuilder = asas.a.createBuilder();
            String str3 = akekVar.a;
            createBuilder.copyOnWrite();
            asas asasVar = (asas) createBuilder.instance;
            str3.getClass();
            asasVar.b |= 4;
            asasVar.e = str3;
            String str4 = akekVar.b;
            if (str4 != null) {
                createBuilder.copyOnWrite();
                asas asasVar2 = (asas) createBuilder.instance;
                asasVar2.b |= 64;
                asasVar2.i = str4;
            }
            List list = akekVar.e;
            if (list != null && !list.isEmpty()) {
                int i4 = akekVar.c;
                if (i4 >= 0) {
                    asar a2 = akek.a((akef) akekVar.e.get(i4), akekVar.c);
                    createBuilder.copyOnWrite();
                    asas asasVar3 = (asas) createBuilder.instance;
                    a2.getClass();
                    asasVar3.j = a2;
                    asasVar3.b |= 256;
                }
                if (akekVar.d >= 0) {
                    for (int i5 = 0; i5 <= akekVar.d; i5++) {
                        asar a3 = akek.a((akef) akekVar.e.get(i5), i5);
                        createBuilder.copyOnWrite();
                        asas asasVar4 = (asas) createBuilder.instance;
                        a3.getClass();
                        aony aonyVar = asasVar4.k;
                        if (!aonyVar.c()) {
                            asasVar4.k = aonm.mutableCopy(aonyVar);
                        }
                        asasVar4.k.add(a3);
                    }
                }
            }
            if (akekVar.f != 0) {
                aone createBuilder2 = asao.a.createBuilder();
                int i6 = akekVar.f;
                createBuilder2.copyOnWrite();
                asao asaoVar = (asao) createBuilder2.instance;
                asaoVar.b |= 4;
                asaoVar.c = i6;
                createBuilder.copyOnWrite();
                asas asasVar5 = (asas) createBuilder.instance;
                asao asaoVar2 = (asao) createBuilder2.build();
                asaoVar2.getClass();
                asasVar5.h = asaoVar2;
                asasVar5.b |= 32;
            }
            int i7 = akekVar.g;
            if (i7 >= 0) {
                createBuilder.copyOnWrite();
                asas asasVar6 = (asas) createBuilder.instance;
                asasVar6.b |= 16384;
                asasVar6.o = i7;
            }
            int i8 = akekVar.h;
            if (i8 >= 0) {
                createBuilder.copyOnWrite();
                asas asasVar7 = (asas) createBuilder.instance;
                asasVar7.b |= 32768;
                asasVar7.p = i8;
            }
            int i9 = akekVar.i;
            createBuilder.copyOnWrite();
            asas asasVar8 = (asas) createBuilder.instance;
            asasVar8.b |= 8192;
            asasVar8.n = i9;
            boolean z = akekVar.j;
            createBuilder.copyOnWrite();
            asas asasVar9 = (asas) createBuilder.instance;
            asasVar9.b |= 512;
            asasVar9.l = z;
            int i10 = akekVar.k;
            createBuilder.copyOnWrite();
            asas asasVar10 = (asas) createBuilder.instance;
            asasVar10.b |= 1024;
            asasVar10.m = i10;
            createBuilder.copyOnWrite();
            asas asasVar11 = (asas) createBuilder.instance;
            asasVar11.c = 4;
            asasVar11.b |= 1;
            createBuilder.copyOnWrite();
            asas asasVar12 = (asas) createBuilder.instance;
            asasVar12.d = 1;
            asasVar12.b |= 2;
            int i11 = akekVar.q;
            createBuilder.copyOnWrite();
            asas asasVar13 = (asas) createBuilder.instance;
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            asasVar13.f = i12;
            asasVar13.b |= 16;
            Set set = akekVar.l;
            createBuilder.copyOnWrite();
            asas asasVar14 = (asas) createBuilder.instance;
            aonu aonuVar = asasVar14.g;
            if (!aonuVar.c()) {
                asasVar14.g = aonm.mutableCopy(aonuVar);
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                asasVar14.g.g(((asap) it.next()).k);
            }
            int i13 = akekVar.m;
            createBuilder.copyOnWrite();
            asas asasVar15 = (asas) createBuilder.instance;
            asasVar15.b |= 262144;
            asasVar15.q = i13;
            int i14 = akekVar.n;
            createBuilder.copyOnWrite();
            asas asasVar16 = (asas) createBuilder.instance;
            asasVar16.b |= 524288;
            asasVar16.r = i14;
            String str5 = akekVar.o;
            if (str5 != null) {
                createBuilder.copyOnWrite();
                asas asasVar17 = (asas) createBuilder.instance;
                asasVar17.b |= 1048576;
                asasVar17.s = str5;
            }
            String str6 = akekVar.p;
            if (str6 != null) {
                createBuilder.copyOnWrite();
                asas asasVar18 = (asas) createBuilder.instance;
                asasVar18.b |= 4194304;
                asasVar18.t = str6;
            }
            return (asas) createBuilder.build();
        }
        throw new NullPointerException("Null clientName");
    }

    public final void b(String str) {
        this.o = 2;
        this.e = str;
    }

    public final void c() {
        int d = (int) (this.t.d() - this.p);
        if (this.q == -1) {
            this.q = d;
        }
        this.r = d;
    }

    public final void d() {
        this.s.add(asap.KEYBOARD);
        c();
    }

    public final void e() {
        this.s.add(asap.QUERY_BUILDER);
        c();
    }

    public final void f() {
        this.o = 16;
        this.s.add(asap.SPEECH);
    }

    public final void g() {
        this.c = 0;
        this.d = false;
        this.p = this.t.d();
        this.q = -1;
        this.r = -1;
        this.o = 1;
        this.s = EnumSet.noneOf(asap.class);
        this.g = -1;
        this.h = -1;
        this.i = 0;
        this.j = 0;
        this.k = new int[b + 1];
        this.l = false;
    }
}
