package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mko implements ajom, flg, ypd {
    public final ImageView a;
    public final ImageView b;
    public mkm c;
    public final aahd d;
    public final ainl e;
    public final aoae f;
    private final Context g;
    private final ypa h;
    private final ajuw i;
    private final PlaybackLoopShuffleMonitor j;
    private final ojg k;
    private final ggy l;
    private final lwq m;
    private final ftw n;
    private final View o;
    private final TextView p;
    private final ImageView q;
    private final ImageView r;
    private final ImageView s;
    private acra t;
    private ghf u;

    public mko(Context context, ypa ypaVar, ajuw ajuwVar, ggy ggyVar, final ainl ainlVar, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, ojg ojgVar, aahd aahdVar, aoae aoaeVar, fvf fvfVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.g = context;
        this.h = ypaVar;
        this.j = playbackLoopShuffleMonitor;
        this.k = ojgVar;
        this.i = ajuwVar;
        this.l = ggyVar;
        this.d = aahdVar;
        this.e = ainlVar;
        this.f = aoaeVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.set_content_header, viewGroup, false);
        this.o = inflate;
        this.p = (TextView) inflate.findViewById(R.id.set_content_title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.set_repeat);
        this.a = imageView;
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.set_shuffle);
        this.b = imageView2;
        this.q = (ImageView) inflate.findViewById(R.id.like_button);
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.save_button);
        this.s = imageView3;
        ImageView imageView4 = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.r = imageView4;
        imageView4.setClickable(true);
        imageView4.setEnabled(true);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: mkl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ainlVar.h(!mko.this.a.isSelected() ? 1 : 0);
            }
        });
        imageView2.setOnClickListener(new mkn(this));
        ggyVar.b(inflate.findViewById(R.id.like_button));
        this.m = new lwq(context, inflate.findViewById(R.id.set_share), aahdVar);
        playbackLoopShuffleMonitor.g(this);
        ftw c = fvfVar.c(imageView3);
        this.n = c;
        c.b = imageView3;
    }

    public static boolean e(apmp apmpVar) {
        return (apmpVar == null || (apmpVar.b & 1024) == 0) ? false : true;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.o;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.h.m(this);
    }

    public final void d(ghf ghfVar) {
        mkm mkmVar = this.c;
        if (mkmVar == null || ghfVar == null || !TextUtils.equals(mkmVar.a.k, ghfVar.b())) {
            this.u = null;
            return;
        }
        this.l.f(ghfVar.a());
        boolean z = ghfVar.a() == asno.LIKE;
        if (!this.n.e()) {
            ftw ftwVar = this.n;
            apmp apmpVar = ftwVar.d;
            apmpVar.getClass();
            if (apmpVar.e != z) {
                ftwVar.c();
            }
        }
        this.u = ghfVar;
    }

    @Override // defpackage.flg
    public final void g(int i, boolean z) {
        this.a.setSelected(i == 1);
        if (e(this.c.a())) {
            return;
        }
        this.b.setSelected(z);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ghf.class};
        }
        if (i == 0) {
            d((ghf) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atdc atdcVar;
        aong aongVar;
        aqyg aqygVar;
        this.h.h(this, mko.class);
        this.c = (mkm) obj;
        this.t = ajokVar.a;
        this.o.setVisibility(0);
        mkm mkmVar = this.c;
        boolean z = mkmVar.c || mkmVar.a() != null;
        if (this.c.b || z) {
            this.p.setVisibility(8);
            this.a.setVisibility(true != this.c.b ? 8 : 0);
            this.b.setVisibility(true != z ? 8 : 0);
        } else {
            this.p.setVisibility(0);
            TextView textView = this.p;
            aubs aubsVar = this.c.a;
            if ((aubsVar.c & 128) != 0) {
                aqygVar = aubsVar.n;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            this.a.setVisibility(8);
            this.b.setVisibility(8);
        }
        PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = this.j;
        g(playbackLoopShuffleMonitor.a, playbackLoopShuffleMonitor.b);
        aubs aubsVar2 = this.c.a;
        if (aubsVar2.r) {
            this.p.setText(this.g.getResources().getString(R.string.radio_total_videos));
            this.r.setVisibility(8);
        } else {
            ajuw ajuwVar = this.i;
            ImageView imageView = this.r;
            atdf atdfVar = aubsVar2.z;
            if (atdfVar == null) {
                atdfVar = atdf.a;
            }
            if ((atdfVar.b & 1) != 0) {
                atdf atdfVar2 = aubsVar2.z;
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
            ajuwVar.d(imageView, atdcVar, aubsVar2, this.t);
        }
        fhf a = this.k.a();
        if (a == null || a.e()) {
            this.q.setVisibility(8);
            this.s.setVisibility(8);
        } else {
            asnj asnjVar = this.c.a.u;
            if (asnjVar == null) {
                asnjVar = asnj.a;
            }
            if ((asnjVar.b & 1) != 0) {
                asnj asnjVar2 = this.c.a.u;
                if (asnjVar2 == null) {
                    asnjVar2 = asnj.a;
                }
                asni asniVar = asnjVar2.c;
                if (asniVar == null) {
                    asniVar = asni.a;
                }
                aongVar = (aong) asniVar.toBuilder();
            } else {
                aongVar = null;
            }
            if (aongVar != null) {
                aong aongVar2 = (aong) this.c.a.toBuilder();
                asnj asnjVar3 = ((aubs) aongVar2.instance).u;
                if (asnjVar3 == null) {
                    asnjVar3 = asnj.a;
                }
                aone builder = asnjVar3.toBuilder();
                builder.copyOnWrite();
                asnj asnjVar4 = (asnj) builder.instance;
                asni asniVar2 = (asni) aongVar.build();
                asniVar2.getClass();
                asnjVar4.c = asniVar2;
                asnjVar4.b |= 1;
                aongVar2.copyOnWrite();
                aubs aubsVar3 = (aubs) aongVar2.instance;
                asnj asnjVar5 = (asnj) builder.build();
                asnjVar5.getClass();
                aubsVar3.u = asnjVar5;
                aubsVar3.c |= 524288;
                this.c.a = (aubs) aongVar2.build();
            }
            this.l.i(aongVar);
            apmk apmkVar = this.c.a.A;
            if (apmkVar == null) {
                apmkVar = apmk.a;
            }
            if ((apmkVar.b & 1) == 0) {
                this.n.b(null);
            } else {
                ftw ftwVar = this.n;
                apmk apmkVar2 = this.c.a.A;
                if (apmkVar2 == null) {
                    apmkVar2 = apmk.a;
                }
                apmp apmpVar = apmkVar2.c;
                if (apmpVar == null) {
                    apmpVar = apmp.a;
                }
                ftwVar.b(apmpVar);
            }
        }
        d(this.u);
        lwq lwqVar = this.m;
        aubs aubsVar4 = this.c.a;
        if (aubsVar4 == null || adyu.dh(aubsVar4) == null) {
            whu.I(lwqVar.a, false);
            lwqVar.a.setOnClickListener(null);
            return;
        }
        atdf atdfVar3 = aubsVar4.z;
        if (atdfVar3 == null) {
            atdfVar3 = atdf.a;
        }
        atdc atdcVar2 = atdfVar3.c;
        if (atdcVar2 == null) {
            atdcVar2 = atdc.a;
        }
        Iterator it = atdcVar2.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            atda atdaVar = (atda) it.next();
            atdb atdbVar = atdaVar.c;
            if (atdbVar == null) {
                atdbVar = atdb.a;
            }
            apxf apxfVar = atdbVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)) {
                atdb atdbVar2 = atdaVar.c;
                if (atdbVar2 == null) {
                    atdbVar2 = atdb.a;
                }
                apxf apxfVar2 = atdbVar2.e;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                lwqVar.d = apxfVar2;
            }
        }
        lwqVar.b = zhq.h(aubsVar4.g);
        lwqVar.c = adyu.dh(aubsVar4);
        lwqVar.a.setOnClickListener(lwqVar);
        whu.I(lwqVar.a, !adtt.a(aubsVar4.k));
    }
}
