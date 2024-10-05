package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class mxd {
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    public final View d;
    public final mxe e;
    final /* synthetic */ mxf f;
    private View g;

    public mxd(mxf mxfVar, int i) {
        this.f = mxfVar;
        View inflate = View.inflate(mxfVar.a, i, null);
        this.d = inflate;
        this.e = new mxe(mxfVar.a, mxfVar.b, inflate, mxfVar.c, mxfVar.m, mxfVar.o, mxfVar.n, mxfVar.f, mxfVar.h, null, null, null, null, null, null);
        this.a = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.b = (TextView) inflate.findViewById(R.id.post_author);
        this.c = (TextView) inflate.findViewById(R.id.post_text);
    }

    public void a(ajok ajokVar) {
        c(ajokVar);
        ajok ajokVar2 = new ajok(ajokVar);
        ajokVar2.b = this.f.j.d();
        b(this.e.y, ajokVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(View view, ajok ajokVar) {
        atdc atdcVar;
        mxf mxfVar = this.f;
        ajuw ajuwVar = mxfVar.d;
        View view2 = this.d;
        jal jalVar = mxfVar.j;
        atdf atdfVar = jalVar.a().v;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = jalVar.a().v;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
        } else {
            atdcVar = null;
        }
        ajuwVar.e(view2, view, atdcVar, this.f.j, ajokVar.a);
    }

    public final void c(ajok ajokVar) {
        apsq apsqVar;
        avgg avggVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        avrx avrxVar;
        aqyg aqygVar3;
        Spanned b;
        aqyg aqygVar4;
        aqyg aqygVar5;
        aqyg aqygVar6;
        aqyg aqygVar7;
        avrx avrxVar2;
        apkh apkhVar;
        apke apkeVar;
        atdu atduVar;
        aqyg aqygVar8;
        int i;
        final avzv a = this.f.j.a();
        ajjz ajjzVar = this.f.b;
        ImageView imageView = this.a;
        if (a.d == 33) {
            apsqVar = (apsq) a.e;
        } else {
            apsqVar = apsq.a;
        }
        apsr apsrVar = apsqVar.c;
        if (apsrVar == null) {
            apsrVar = apsr.a;
        }
        if ((apsrVar.b & 1) != 0) {
            apsr apsrVar2 = apsqVar.c;
            if (apsrVar2 == null) {
                apsrVar2 = apsr.a;
            }
            avggVar = apsrVar2.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else if (a.d == 19) {
            avggVar = (avgg) a.e;
        } else {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        this.a.setOnClickListener(new View.OnClickListener() { // from class: mxc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mxd mxdVar = mxd.this;
                avzv avzvVar = a;
                if (mxf.g(avzvVar) != null) {
                    mxdVar.f.c.c(mxf.g(avzvVar), null);
                    return;
                }
                mxf mxfVar = mxdVar.f;
                jal jalVar = mxfVar.j;
                if (jalVar != null) {
                    aqwe aqweVar = jalVar.a;
                    if ((aqweVar.b & 4) != 0) {
                        aahd aahdVar = mxfVar.c;
                        apxf apxfVar = aqweVar.e;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, null);
                    }
                }
            }
        });
        ajok ajokVar2 = new ajok(ajokVar);
        ajokVar2.b = this.f.j.d();
        aqwe aqweVar = this.f.j.a;
        apju apjuVar = null;
        if ((aqweVar.b & 32) != 0) {
            aqygVar = aqweVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b2 = ajcq.b(aqygVar);
        boolean z = !TextUtils.isEmpty(b2);
        whu.I(this.b, z);
        whu.I(this.c, z);
        if (z) {
            TextView textView = this.b;
            aqwe aqweVar2 = this.f.j.a;
            if ((aqweVar2.b & 8) != 0) {
                aqygVar8 = aqweVar2.f;
                if (aqygVar8 == null) {
                    aqygVar8 = aqyg.a;
                }
            } else {
                aqygVar8 = null;
            }
            textView.setText(ajcq.b(aqygVar8));
            mxf mxfVar = this.f;
            aqwe aqweVar3 = mxfVar.j.a;
            if (aqweVar3.c == 14) {
                ajut ajutVar = mxfVar.e;
                arfr b3 = arfr.b(((arfs) aqweVar3.d).c);
                if (b3 == null) {
                    b3 = arfr.UNKNOWN;
                }
                i = ajutVar.a(b3);
            } else {
                i = 0;
            }
            jm.t(this.b, i, 0);
            this.c.setText(b2);
        }
        if (this.f.j.a().w) {
            if (this.g == null) {
                this.g = ((ViewStub) this.d.findViewById(R.id.watched_overlay_stub)).inflate();
            }
            this.g.setVisibility(0);
        } else {
            View view = this.g;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        mxe mxeVar = this.e;
        if ((a.b & 8) != 0) {
            aqygVar2 = a.h;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        mxeVar.A(ajcq.b(aqygVar2));
        mxe mxeVar2 = this.e;
        ArrayList aO = amkq.aO();
        Context context = mxeVar2.g;
        shf shfVar = mxeVar2.a;
        if ((a.b & 2097152) != 0) {
            avrxVar = a.t;
            if (avrxVar == null) {
                avrxVar = avrx.a;
            }
        } else {
            avrxVar = null;
        }
        CharSequence g = mcy.g(context, shfVar, avrxVar);
        if (!TextUtils.isEmpty(g)) {
            aO.add(g);
        } else {
            aqyg aqygVar9 = a.n;
            if (aqygVar9 == null) {
                aqygVar9 = aqyg.a;
            }
            if (!TextUtils.isEmpty(ajcq.b(aqygVar9))) {
                aqyg aqygVar10 = a.n;
                if (aqygVar10 == null) {
                    aqygVar10 = aqyg.a;
                }
                b = ajcq.b(aqygVar10);
            } else {
                if ((a.b & 8192) != 0) {
                    aqygVar3 = a.m;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                b = ajcq.b(aqygVar3);
            }
            aO.add(fav.y(b));
            if ((a.b & 2048) != 0) {
                aqygVar4 = a.j;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            aO.add(fav.y(ajcq.b(aqygVar4)));
        }
        if ((a.b & 1024) != 0) {
            aqygVar5 = a.i;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
        } else {
            aqygVar5 = null;
        }
        mxeVar2.l(fav.y(ajcq.b(aqygVar5)), aO, mxf.f(a) != null);
        mxe mxeVar3 = this.e;
        if ((a.b & 4096) != 0) {
            aqygVar6 = a.k;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
        } else {
            aqygVar6 = null;
        }
        Spanned b4 = ajcq.b(aqygVar6);
        if ((a.b & 4096) != 0) {
            aqygVar7 = a.k;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
        } else {
            aqygVar7 = null;
        }
        CharSequence i2 = ajcq.i(aqygVar7);
        aony aonyVar = a.x;
        if ((a.b & 2097152) != 0) {
            avrxVar2 = a.t;
            if (avrxVar2 == null) {
                avrxVar2 = avrx.a;
            }
        } else {
            avrxVar2 = null;
        }
        mxeVar3.p(b4, i2, aonyVar, avrxVar2);
        mxe mxeVar4 = this.e;
        avgg avggVar2 = a.g;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        mxeVar4.y(avggVar2);
        this.e.t(mcy.O(a.x));
        mxe mxeVar5 = this.e;
        apkd apkdVar = a.r;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 1) != 0) {
            apkd apkdVar2 = a.r;
            if (apkdVar2 == null) {
                apkdVar2 = apkd.a;
            }
            apkhVar = apkdVar2.c;
            if (apkhVar == null) {
                apkhVar = apkh.a;
            }
        } else {
            apkhVar = null;
        }
        mxeVar5.w(apkhVar);
        mxe mxeVar6 = this.e;
        apkd apkdVar3 = a.q;
        if (apkdVar3 == null) {
            apkdVar3 = apkd.a;
        }
        if ((apkdVar3.b & 4) != 0) {
            apkd apkdVar4 = a.q;
            if (apkdVar4 == null) {
                apkdVar4 = apkd.a;
            }
            apkeVar = apkdVar4.e;
            if (apkeVar == null) {
                apkeVar = apke.a;
            }
        } else {
            apkeVar = null;
        }
        mxeVar6.u(apkeVar);
        this.e.s.a(mxf.f(a));
        mxe mxeVar7 = this.e;
        apkd apkdVar5 = a.s;
        if (apkdVar5 == null) {
            apkdVar5 = apkd.a;
        }
        if ((apkdVar5.b & 8) != 0) {
            apkd apkdVar6 = a.s;
            if (apkdVar6 == null) {
                apkdVar6 = apkd.a;
            }
            atduVar = apkdVar6.f;
            if (atduVar == null) {
                atduVar = atdu.a;
            }
        } else {
            atduVar = null;
        }
        mxeVar7.r(atduVar);
        mxf mxfVar2 = this.f;
        Iterator it = a.p.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            apjt apjtVar = (apjt) it.next();
            if ((apjtVar.b & 524288) != 0) {
                apjuVar = apjtVar.g;
                if (apjuVar == null) {
                    apjuVar = apju.a;
                }
            }
        }
        mxfVar2.i = apjuVar;
        mxf mxfVar3 = this.f;
        mxfVar3.g.b(this.e.r, mxfVar3.i);
        this.e.oB(ajokVar2, a);
    }
}
