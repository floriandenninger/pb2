package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akvs implements aldm, akxi, ypd {
    public static final String a = aalt.d(avug.b.a(), "com.google.android.libraries.youtube.upload.upload_status_entity");
    private static final amru m = amru.s(akzq.NORMAL_UPLOAD, akzq.SHORTS_UPLOAD);
    public final ypa b;
    public final afsy c;
    public final aahv d;
    public final akxh e;
    public final aldn f;
    public String i;
    public avuf j;
    public final aadw l;
    private final shf n;
    private final akwm o;
    public final Map g = new HashMap();
    public final Object h = new Object();
    public volatile boolean k = false;

    public akvs(shf shfVar, aadw aadwVar, ypa ypaVar, afsy afsyVar, aahv aahvVar, akwm akwmVar, akxh akxhVar, aldn aldnVar) {
        this.n = shfVar;
        this.l = aadwVar;
        this.b = ypaVar;
        this.c = afsyVar;
        this.d = aahvVar;
        this.o = akwmVar;
        this.e = akxhVar;
        this.f = aldnVar;
    }

    private final void u() {
        synchronized (this.h) {
            int size = this.g.size();
            float f = 0.0f;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (akvr akvrVar : this.g.values()) {
                int i4 = akvrVar.d;
                float f2 = 1.0f;
                if (i4 != 3 && i4 != 4) {
                    f2 = (akvrVar.a * 0.12f) + (akvrVar.b * 0.68f) + (akvrVar.c * 0.2f);
                }
                f += f2 / size;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == 1) {
                    i3++;
                } else if (i5 == 2) {
                    i++;
                } else if (i5 == 3) {
                    i2++;
                }
            }
            aahu c = this.d.c();
            avud d = avue.d(a);
            Float valueOf = Float.valueOf(f);
            aone aoneVar = d.a;
            float floatValue = valueOf.floatValue();
            aoneVar.copyOnWrite();
            avug avugVar = (avug) aoneVar.instance;
            avug avugVar2 = avug.a;
            avugVar.c = 2 | avugVar.c;
            avugVar.e = floatValue;
            Integer valueOf2 = Integer.valueOf(i3);
            aone aoneVar2 = d.a;
            int intValue = valueOf2.intValue();
            aoneVar2.copyOnWrite();
            avug avugVar3 = (avug) aoneVar2.instance;
            avugVar3.c |= 4;
            avugVar3.f = intValue;
            Integer valueOf3 = Integer.valueOf(i2);
            aone aoneVar3 = d.a;
            int intValue2 = valueOf3.intValue();
            aoneVar3.copyOnWrite();
            avug avugVar4 = (avug) aoneVar3.instance;
            avugVar4.c |= 8;
            avugVar4.g = intValue2;
            Integer valueOf4 = Integer.valueOf(i);
            aone aoneVar4 = d.a;
            int intValue3 = valueOf4.intValue();
            aoneVar4.copyOnWrite();
            avug avugVar5 = (avug) aoneVar4.instance;
            avugVar5.c |= 16;
            avugVar5.h = intValue3;
            avuf b = d.b();
            avuf avufVar = this.j;
            if (avufVar == null || !b.equals(avufVar)) {
                this.j = b;
                avud e = b.e();
                Long valueOf5 = Long.valueOf(this.n.c());
                aone aoneVar5 = e.a;
                long longValue = valueOf5.longValue();
                aoneVar5.copyOnWrite();
                avug avugVar6 = (avug) aoneVar5.instance;
                avugVar6.c |= 32;
                avugVar6.i = longValue;
                avuf b2 = e.b();
                aaio c2 = ((aaih) c).c();
                c2.d(b2);
                c2.b();
                String.valueOf(String.valueOf(b2)).length();
            }
        }
    }

    private final void v(akzs akzsVar, boolean z) {
        synchronized (this.h) {
            if (akzsVar.t && !akzsVar.u) {
                return;
            }
            amru amruVar = m;
            akzq a2 = akzq.a(akzsVar.l);
            if (a2 == null) {
                a2 = akzq.UNKNOWN_UPLOAD;
            }
            if (amruVar.contains(a2)) {
                String str = this.i;
                if (str != null && str.equals(akzsVar.e)) {
                    akvr akvrVar = new akvr();
                    if (akzsVar.ae) {
                        this.g.remove(akzsVar.k);
                    } else {
                        if (!akzsVar.af) {
                            amru amruVar2 = akwh.a;
                            akzr a3 = akzr.a(akzsVar.Z);
                            if (a3 == null) {
                                a3 = akzr.UNKNOWN;
                            }
                            if (!amruVar2.contains(a3)) {
                                akvrVar.d = 2;
                                float f = 0.0f;
                                if (akzsVar.z) {
                                    akzp akzpVar = akzsVar.A;
                                    if (akzpVar == null) {
                                        akzpVar = akzp.a;
                                    }
                                    akvrVar.a(true != alep.j(akzpVar) ? 0.0f : 1.0f);
                                } else {
                                    akvrVar.a(1.0f);
                                }
                                akzp akzpVar2 = akzsVar.f65J;
                                if (akzpVar2 == null) {
                                    akzpVar2 = akzp.a;
                                }
                                akvrVar.c(true != alep.j(akzpVar2) ? 0.0f : 1.0f);
                                akzp akzpVar3 = akzsVar.aa;
                                if (akzpVar3 == null) {
                                    akzpVar3 = akzp.a;
                                }
                                if (true == alep.j(akzpVar3)) {
                                    f = 1.0f;
                                }
                                akvrVar.b(f);
                                if (z || this.g.containsKey(akzsVar.k)) {
                                    this.g.put(akzsVar.k, akvrVar);
                                }
                            }
                        }
                        akvrVar.d = 4;
                        if (z || this.g.containsKey(akzsVar.k)) {
                            this.g.put(akzsVar.k, akvrVar);
                        }
                    }
                    u();
                }
            }
        }
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void a(String str, boolean z, boolean z2) {
    }

    @Override // defpackage.akxi
    public final void b(String str, long j, long j2) {
        synchronized (this.h) {
            if (j2 != 0) {
                akvr akvrVar = (akvr) this.g.get(str);
                if (akvrVar != null) {
                    akvrVar.a(((float) j) / ((float) j2));
                    u();
                }
            }
        }
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void c(String str, akzw akzwVar) {
    }

    @Override // defpackage.akxi
    public final void d(String str, aufk aufkVar) {
        synchronized (this.h) {
            akvr akvrVar = (akvr) this.g.get(str);
            if (akvrVar != null) {
                akvrVar.b((float) aufkVar.b);
                u();
            }
        }
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void e(String str, double d) {
    }

    @Override // defpackage.akxi
    public final void f(String str, long j, long j2, double d) {
        synchronized (this.h) {
            if (j2 != 0) {
                akvr akvrVar = (akvr) this.g.get(str);
                if (akvrVar != null) {
                    akvrVar.c(((float) j) / ((float) j2));
                    u();
                }
            }
        }
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void g(String str, akzp akzpVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void h(akzs akzsVar) {
    }

    @Override // defpackage.akxi
    public final void i(String str, akzs akzsVar) {
        synchronized (this.h) {
            if (!this.g.containsKey(str)) {
                v(akzsVar, true);
            }
        }
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void j(String str) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void k(String str, boolean z) {
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            aftm aftmVar = (aftm) obj;
            synchronized (this.h) {
                aahu c = this.d.c();
                this.g.clear();
                aaio c2 = ((aaih) c).c();
                c2.d(avue.d(a).b());
                c2.b();
                this.j = null;
                this.i = aftmVar.a().d();
            }
            return null;
        }
        if (i == 1) {
            synchronized (this.h) {
                aahu c3 = this.d.c();
                this.g.clear();
                aaio c4 = ((aaih) c3).c();
                c4.d(avue.d(a).b());
                c4.b();
                this.j = null;
                this.i = null;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void l(String str, avuh avuhVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void m(String str, String str2) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void n(String str, akzr akzrVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void o(String str, int i) {
    }

    @Override // defpackage.aldm
    public final void p(String str) {
    }

    @Override // defpackage.aldm
    public final void q(String str, akzs akzsVar) {
        synchronized (this.h) {
            v(akzsVar, true);
        }
    }

    @Override // defpackage.aldm
    public final void r(String str) {
        akzs akzsVar;
        synchronized (this.h) {
            try {
                akzsVar = this.o.b(str);
            } catch (akwn e) {
                String valueOf = String.valueOf(str);
                zga.f("UploadIndicatorController", valueOf.length() != 0 ? "Error reading job ".concat(valueOf) : new String("Error reading job "), e);
                akzsVar = null;
            }
            if (akzsVar == null) {
                if (this.g.containsKey(str)) {
                    ((akvr) this.g.get(str)).d = 3;
                    u();
                }
            } else {
                v(akzsVar, false);
            }
        }
    }

    @Override // defpackage.aldm
    public final void s(String str) {
    }

    @Override // defpackage.aldm
    public final void t(String str) {
    }
}
