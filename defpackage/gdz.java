package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gdz {
    public final gee a;
    public final aahd b;
    public acra c = acra.l;
    public ajxa d;
    public gek e;

    public gdz(gee geeVar, aahd aahdVar) {
        this.a = geeVar;
        this.b = aahdVar;
    }

    private final void h(boolean z) {
        if (this.a.h() && this.a.b().h()) {
            this.a.d(z);
            ged gedVar = (ged) this.a.b().c();
            if (gedVar.d.h()) {
                ((akbl) gedVar.d.c()).li(gedVar, 3);
            }
            if (gedVar.h == 2 && e()) {
                this.e.d(false);
            }
        }
    }

    public final void a() {
        h(false);
    }

    public final void b() {
        h(true);
    }

    public final void c(FrameLayout frameLayout, ajxa ajxaVar, gek gekVar, acra acraVar) {
        if (this.a.h()) {
            a();
        }
        this.d = ajxaVar;
        this.e = gekVar;
        this.c = acraVar;
        this.a.e(frameLayout);
    }

    public final boolean d() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.e != null;
    }

    public final void f(final ged gedVar, boolean z) {
        if (d()) {
            Object f = this.a.b().f();
            if (this.a.h()) {
                if (gedVar == f) {
                    return;
                } else {
                    a();
                }
            }
            this.a.g(gedVar, z);
            if (!this.a.a().h()) {
                throw new IllegalStateException("Click target is not available for pill");
            }
            if (gedVar != f) {
                ((View) this.a.a().c()).setOnClickListener(new View.OnClickListener() { // from class: gdy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        gdz gdzVar = gdz.this;
                        ged gedVar2 = gedVar;
                        if (gedVar2.e.h()) {
                            ((View.OnClickListener) gedVar2.e.c()).onClick(view);
                        }
                        int i = gedVar2.h;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 1) {
                            if (gdzVar.e()) {
                                gdzVar.e.mT();
                                gdzVar.b();
                                return;
                            }
                            return;
                        }
                        if (i2 == 4) {
                            if (gedVar2.c.h()) {
                                gdzVar.b.c((apxf) gedVar2.c.c(), null);
                            }
                        } else {
                            ajxa ajxaVar = gdzVar.d;
                            if (ajxaVar != null) {
                                ajxaVar.lo();
                            }
                        }
                    }
                });
            }
            if (gedVar.h == 2 && e()) {
                this.e.d(true);
            }
            if (gedVar.d.h()) {
                ((akbl) gedVar.d.c()).lj(gedVar);
            }
        }
    }

    public final ged g(final aqet aqetVar) {
        int i;
        aqyg aqygVar;
        avfc avfcVar;
        gec gecVar;
        arfr arfrVar;
        int i2;
        int i3;
        avfc avfcVar2;
        int i4;
        if (aqetVar == null) {
            gecVar = ged.a();
        } else {
            int i5 = 4;
            if ((aqetVar.b & 4) != 0) {
                aqer aqerVar = aqetVar.e;
                if (aqerVar == null) {
                    aqerVar = aqer.a;
                }
                i5 = aobq.ar(aqerVar.b);
                if (i5 == 0) {
                    i5 = 1;
                }
            }
            if ((aqetVar.b & 128) != 0) {
                aqes aqesVar = aqetVar.g;
                if (aqesVar == null) {
                    aqesVar = aqes.a;
                }
                i = aobq.aq(aqesVar.c);
                if (i == 0) {
                    i = 1;
                }
            } else {
                i = 5;
            }
            arfr arfrVar2 = arfr.REFRESH;
            if ((aqetVar.b & 2) != 0) {
                arfs arfsVar = aqetVar.d;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfrVar2 = arfr.b(arfsVar.c);
                if (arfrVar2 == null) {
                    arfrVar2 = arfr.UNKNOWN;
                }
            }
            gec a = ged.a();
            apxf apxfVar = null;
            if ((aqetVar.b & 1) != 0) {
                aqygVar = aqetVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b = ajcq.b(aqygVar);
            if (b != null) {
                a.a = b;
                a.h = i5;
                a.g = i;
                if (arfrVar2 != null) {
                    a.b = arfrVar2;
                    if ((aqetVar.b & 512) != 0 && (apxfVar = aqetVar.h) == null) {
                        apxfVar = apxf.a;
                    }
                    a.c = ammv.i(apxfVar);
                    if ((aqetVar.b & 1024) != 0) {
                        avfcVar = aqetVar.i;
                        if (avfcVar == null) {
                            avfcVar = avfc.a;
                        }
                    } else {
                        avfcVar = avfc.a;
                    }
                    a.a(avfcVar);
                    int as = aobq.as(aqetVar.j);
                    a.i = as != 0 ? as : 1;
                    gecVar = a;
                } else {
                    throw new NullPointerException("Null iconType");
                }
            } else {
                throw new NullPointerException("Null text");
            }
        }
        final acra acraVar = this.c;
        gecVar.d = ammv.i(new geb(aqetVar, acraVar));
        gecVar.e = ammv.i(new View.OnClickListener() { // from class: gea
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aqet aqetVar2 = aqet.this;
                acra acraVar2 = acraVar;
                if (acraVar2 != null) {
                    acraVar2.I(3, new acqx(aqetVar2.f), null);
                }
            }
        });
        CharSequence charSequence = gecVar.a;
        if (charSequence == null || (arfrVar = gecVar.b) == null || (i2 = gecVar.g) == 0 || (i3 = gecVar.h) == 0 || (avfcVar2 = gecVar.f) == null || (i4 = gecVar.i) == 0) {
            StringBuilder sb = new StringBuilder();
            if (gecVar.a == null) {
                sb.append(" text");
            }
            if (gecVar.b == null) {
                sb.append(" iconType");
            }
            if (gecVar.g == 0) {
                sb.append(" position");
            }
            if (gecVar.h == 0) {
                sb.append(" behavior");
            }
            if (gecVar.f == null) {
                sb.append(" colorPalette");
            }
            if (gecVar.i == 0) {
                sb.append(" presentationStyle");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ged(charSequence, arfrVar, i2, i3, gecVar.c, gecVar.d, gecVar.e, avfcVar2, i4);
    }
}
