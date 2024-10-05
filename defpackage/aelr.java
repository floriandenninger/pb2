package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelr {
    public final aeln a;
    public ovx b;
    public ByteBuffer d;
    public ByteBuffer e;
    public ovr c = null;
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();

    public aelr(aeln aelnVar) {
        this.a = aelnVar;
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        if (min == 0) {
            return;
        }
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer2.put(slice);
    }

    public final void b(byte[] bArr, Integer num, boolean z, boolean z2) {
        byte[] c;
        int i;
        ovo ovoVar = (ovo) this.f.get(num);
        if (ovoVar != null) {
            if (ovoVar.j && z) {
                return;
            }
            int u = oba.u(ovoVar.i);
            if (u != 0 && u == 3) {
                try {
                    c = anbt.c(new GZIPInputStream(new ByteArrayInputStream(bArr)));
                } catch (IOException unused) {
                    throw new aelo(107, "info.gzip");
                }
            } else {
                c = bArr;
            }
            Long l = (Long) this.g.get(num);
            if (l == null) {
                throw new aelo(107, "info.null-byterange");
            }
            aelt a = aelt.a(l.longValue(), l.longValue() + c.length);
            this.g.put(num, Long.valueOf(a.b));
            aelu aeluVar = new aelu(c, ovoVar.d, ovoVar.e, ovoVar.f, (ovoVar.b & 512) != 0 ? ovoVar.k : -1L, z2, z, ovoVar.g, ovoVar.l, a);
            if (ovoVar.j) {
                aeln aelnVar = this.a;
                synchronized (aelnVar) {
                    ((aeis) aelnVar).g(aeluVar.c);
                    ((aeis) aelnVar).a.c(aeluVar);
                    if (aeluVar.g) {
                        aelz.g("Encrypted init segment.");
                        return;
                    }
                    if (aaoq.c().contains(Integer.valueOf(aeluVar.d))) {
                        ((aeis) aelnVar).n.aj();
                        i = 2;
                    } else if (aaoq.b().contains(Integer.valueOf(aeluVar.d))) {
                        ((aeis) aelnVar).n.J();
                        i = 1;
                    } else {
                        int i2 = aeluVar.d;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid init segment received: ");
                        sb.append(i2);
                        aelz.g(sb.toString());
                        return;
                    }
                    aeks aeksVar = ((aeis) aelnVar).a;
                    aekd aekdVar = new aekd(aeluVar, i);
                    if (aekdVar.b - 1 != 0) {
                        aeksVar.j.b(aekdVar);
                        return;
                    } else {
                        aeksVar.i.b(aekdVar);
                        return;
                    }
                }
            }
            this.a.l(aeluVar);
            return;
        }
        throw new aelo(101, "info.null-media-header");
    }

    public final void c(ovr ovrVar, byte[] bArr) {
        boolean z;
        atsf atsfVar;
        aypz aypzVar;
        ovx ovxVar = ovx.UNKNOWN;
        int t = oba.t(ovrVar.c);
        if (t == 0) {
            t = 9;
        }
        int i = t - 1;
        final int i2 = 0;
        final int i3 = 1;
        if (i == 0) {
            ovp ovpVar = ovrVar.i;
            if (ovpVar == null) {
                ovpVar = ovp.a;
            }
            if ((ovpVar.b & 1) != 0) {
                ovp ovpVar2 = ovrVar.i;
                if (ovpVar2 == null) {
                    ovpVar2 = ovp.a;
                }
                if ((ovpVar2.b & 2) != 0) {
                    ovp ovpVar3 = ovrVar.i;
                    if (ovpVar3 == null) {
                        ovpVar3 = ovp.a;
                    }
                    if (ovpVar3.c.d() != 0) {
                        aeln aelnVar = this.a;
                        aomf x = aomf.x(bArr);
                        ovp ovpVar4 = ovrVar.i;
                        if (ovpVar4 == null) {
                            ovpVar4 = ovp.a;
                        }
                        aomf aomfVar = ovpVar4.c;
                        ovp ovpVar5 = ovrVar.i;
                        if (ovpVar5 == null) {
                            ovpVar5 = ovp.a;
                        }
                        aomf aomfVar2 = ovpVar5.d;
                        ovp ovpVar6 = ovrVar.i;
                        if (ovpVar6 == null) {
                            ovpVar6 = ovp.a;
                        }
                        int au = aobq.au(ovpVar6.e);
                        if (au == 0) {
                            au = 1;
                        }
                        synchronized (aelnVar) {
                            if (((aeis) aelnVar).j) {
                                aelz.g("Multiple player responses received.");
                                z = false;
                            } else {
                                ((aeis) aelnVar).n.Y();
                                ((aeis) aelnVar).j = true;
                                z = true;
                            }
                        }
                        aeis aeisVar = (aeis) aelnVar;
                        aypz aypzVar2 = aeisVar.k;
                        if (aypzVar2 != null) {
                            aypzVar2.d(aeip.a(x, aomfVar, aomfVar2, au));
                        }
                        if (z) {
                            if (aeisVar.g == null) {
                                aeisVar.m.c("response", new IllegalStateException("Received PlayerResponse for a media-only Onesie request."));
                                return;
                            }
                            anht q = anht.q(anaf.O(aeip.a(x, aomfVar, aomfVar2, au)));
                            final aeiz aeizVar = aeisVar.g;
                            aeizVar.getClass();
                            anhy i4 = anfq.i(q, new anfz() { // from class: aeij
                                @Override // defpackage.anfz
                                public final anhy a(Object obj) {
                                    return i3 != 0 ? aeizVar.a((aeip) obj) : aeizVar.b((arxk) obj);
                                }
                            }, aeisVar.d.r ? angq.a : aeisVar.b);
                            final aeiz aeizVar2 = aeisVar.g;
                            aeizVar2.getClass();
                            anaf.Y(anfq.i(i4, new anfz() { // from class: aeij
                                @Override // defpackage.anfz
                                public final anhy a(Object obj) {
                                    return i2 != 0 ? aeizVar2.a((aeip) obj) : aeizVar2.b((arxk) obj);
                                }
                            }, aeisVar.d.r ? angq.a : aeisVar.b), aeisVar.e, angq.a);
                            return;
                        }
                        return;
                    }
                }
            }
            throw new aelo(103, "Missing crypto params");
        }
        if (i == 2) {
            this.a.d(bArr);
            return;
        }
        if (i == 6) {
            String str = new String(bArr);
            aeis aeisVar2 = (aeis) this.a;
            zhy b = zhy.b(aeisVar2.l);
            b.a = str;
            if (!aeisVar2.b().isEmpty()) {
                Iterator it = aeisVar2.b().iterator();
                while (it.hasNext()) {
                    b.j((String) it.next());
                }
                b.g("ompr", "1");
            }
            aeisVar2.n(b.a(), 0L);
            return;
        }
        if (i == 11) {
            this.a.k(new String(bArr));
            return;
        }
        switch (i) {
            case 14:
                Set hashSet = new HashSet();
                Iterator it2 = ovrVar.k.iterator();
                while (it2.hasNext()) {
                    try {
                        hashSet.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                    } catch (NumberFormatException unused) {
                        hashSet = Collections.emptySet();
                    }
                }
                if (hashSet.isEmpty()) {
                    afsi.e(1, 8, "RESTRICTED_FORMATS_HINT header with no itags. Ignored.", 1.0E-4d);
                    return;
                } else {
                    this.a.f(ovrVar.d, hashSet);
                    return;
                }
            case 15:
                aeln aelnVar2 = this.a;
                aelu aeluVar = new aelu(new byte[0], ovrVar.d, Integer.parseInt(ovrVar.e), ovrVar.g, (32768 & ovrVar.b) != 0 ? ovrVar.m : -1L, false, false, ovrVar.f, ovrVar.h, aelt.a(0L, 0L));
                aeis aeisVar3 = (aeis) aelnVar2;
                aeisVar3.g(aeluVar.c);
                aeisVar3.a.i(aeluVar.c, aeluVar.d, aeluVar.e, aeluVar.f, aeluVar.j);
                return;
            case 16:
                try {
                    int parseInt = Integer.parseInt(ovrVar.e);
                    ammv ammvVar = amlr.a;
                    long j = ovrVar.j;
                    if (j > 0) {
                        ammvVar = ammv.j(Long.valueOf(j));
                    }
                    ammv ammvVar2 = ammvVar;
                    ammv ammvVar3 = amlr.a;
                    if ((ovrVar.b & 4096) != 0) {
                        ovq ovqVar = ovrVar.l;
                        if (ovqVar == null) {
                            ovqVar = ovq.a;
                        }
                        if (ovqVar.b >= 0) {
                            ovq ovqVar2 = ovrVar.l;
                            if (ovqVar2 == null) {
                                ovqVar2 = ovq.a;
                            }
                            if (ovqVar2.c > 0) {
                                ovq ovqVar3 = ovrVar.l;
                                if (ovqVar3 == null) {
                                    ovqVar3 = ovq.a;
                                }
                                long j2 = ovqVar3.b;
                                ovq ovqVar4 = ovrVar.l;
                                if (ovqVar4 == null) {
                                    ovqVar4 = ovq.a;
                                }
                                long j3 = ovqVar4.c;
                                if (j3 < j2) {
                                    afsi.b(1, 8, "end_timestamp_less_than_start_timestamp");
                                    j3 = j2;
                                }
                                ammvVar3 = ammv.j(new aelp(j2, j3));
                            }
                        }
                    }
                    aelq aelqVar = new aelq(ovrVar.d, parseInt, ovrVar.g, (32768 & ovrVar.b) != 0 ? ovrVar.m : -1L, ovrVar.f, ammvVar2, ammvVar3);
                    aeis aeisVar4 = (aeis) this.a;
                    aeisVar4.g(aelqVar.a);
                    aeisVar4.a.h(aelqVar);
                    return;
                } catch (NumberFormatException unused2) {
                    afsi.b(1, 8, "STREAM_METADATA invalid itag received.");
                    return;
                }
            default:
                switch (i) {
                    case 23:
                        aeln aelnVar3 = this.a;
                        ajcc ajccVar = ovrVar.n;
                        if (ajccVar == null) {
                            ajccVar = ajcc.a;
                        }
                        aeis aeisVar5 = (aeis) aelnVar3;
                        aeisVar5.g(ajccVar.b);
                        aeisVar5.a.g(ajccVar);
                        return;
                    case 24:
                        aeln aelnVar4 = this.a;
                        ajcc ajccVar2 = ovrVar.n;
                        if (ajccVar2 == null) {
                            ajccVar2 = ajcc.a;
                        }
                        ((aeis) aelnVar4).a.j(ajccVar2);
                        return;
                    case 25:
                        try {
                            ovh ovhVar = (ovh) aonm.parseFrom(ovh.a, bArr, aomw.b());
                            aeln aelnVar5 = this.a;
                            arfd a = ((aeis) aelnVar5).c.a();
                            if (a != null) {
                                atcl atclVar = a.i;
                                if (atclVar == null) {
                                    atclVar = atcl.a;
                                }
                                atsh atshVar = atclVar.d;
                                if (atshVar == null) {
                                    atshVar = atsh.a;
                                }
                                atsfVar = atshVar.g;
                                if (atsfVar == null) {
                                    atsfVar = atsf.b;
                                }
                            } else {
                                atsfVar = atsf.b;
                            }
                            if (atsfVar.B || (aypzVar = ((aeis) aelnVar5).k) == null) {
                                return;
                            }
                            aomf aomfVar3 = ovhVar.b;
                            aomf aomfVar4 = ovhVar.c;
                            aomf aomfVar5 = ovhVar.d;
                            int au2 = aobq.au(ovhVar.e);
                            if (au2 != 0) {
                                i3 = au2;
                            }
                            aypzVar.d(aeip.a(aomfVar3, aomfVar4, aomfVar5, i3));
                            return;
                        } catch (aoob unused3) {
                            throw new aelo(110, "unparseable_encrypted_innertube_response_part");
                        }
                    case 26:
                        aeln aelnVar6 = this.a;
                        aoms aomsVar = ovrVar.o;
                        if (aomsVar == null) {
                            aomsVar = aoms.a;
                        }
                        aeis aeisVar6 = (aeis) aelnVar6;
                        aeisVar6.i.set(aeisVar6.h.d() + aoqx.a(aomsVar));
                        return;
                    default:
                        return;
                }
        }
    }

    public final void d(ovr ovrVar) {
        c(ovrVar, new byte[0]);
    }
}
