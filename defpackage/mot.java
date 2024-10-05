package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mot extends mlc {
    private final ajop a;
    private final LinearLayout b;
    private final TextView c;
    private final ajuw d;
    private final ajoi e;

    public mot(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, gma gmaVar, ohg ohgVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, ajjzVar, gmaVar, LayoutInflater.from(context).inflate(R.layout.grid_narrow_video_item, (ViewGroup) null, false), aahdVar, ohgVar, null, cVar, null, null, null, null, null, null);
        LinearLayout linearLayout = (LinearLayout) this.i.findViewById(R.id.video_info_view);
        this.b = linearLayout;
        this.c = (TextView) linearLayout.findViewById(R.id.title);
        this.d = ajuwVar;
        this.a = gmaVar;
        this.e = new ajoi(aahdVar, gmaVar);
    }

    private static apkf d(arcr arcrVar) {
        if ((arcrVar.b & 2048) == 0) {
            return null;
        }
        apkd apkdVar = arcrVar.m;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        apkf apkfVar = apkdVar.d;
        return apkfVar == null ? apkf.a : apkfVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.a).b;
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atdc atdcVar;
        Spanned spanned;
        aqyg aqygVar;
        aqyg aqygVar2;
        apkh apkhVar;
        arcr arcrVar = (arcr) obj;
        arcrVar.getClass();
        boolean z = d(arcrVar) != null;
        ajoi ajoiVar = this.e;
        acra acraVar = ajokVar.a;
        apxf apxfVar = arcrVar.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
        apke apkeVar = null;
        ajokVar.a.u(new acqx(arcrVar.n), null);
        aqyg aqygVar3 = arcrVar.e;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        A(ajcq.b(aqygVar3));
        avgg avggVar = arcrVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        y(avggVar);
        this.a.e(ajokVar);
        ajok ajokVar2 = new ajok(ajokVar);
        acra acraVar2 = ajokVar2.a;
        ajuw ajuwVar = this.d;
        View view = ((gma) this.a).b;
        View view2 = this.y;
        atdf atdfVar = arcrVar.g;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = arcrVar.g;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdc atdcVar2 = atdfVar2.c;
            if (atdcVar2 == null) {
                atdcVar2 = atdc.a;
            }
            atdcVar = atdcVar2;
        } else {
            atdcVar = null;
        }
        ajuwVar.e(view, view2, atdcVar, arcrVar, acraVar2);
        avfx avfxVar = (avfx) mcy.P(arcrVar.d, laf.e);
        if (avfxVar != null) {
            aqyg aqygVar4 = avfxVar.d;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            spanned = ajcq.b(aqygVar4);
        } else {
            spanned = null;
        }
        p(spanned, null, arcrVar.d, null);
        if ((arcrVar.b & 256) != 0) {
            aqygVar = arcrVar.j;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((arcrVar.b & 128) != 0) {
            aqygVar2 = arcrVar.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        m(b, ajcq.b(aqygVar2), z);
        if ((arcrVar.b & 1024) != 0) {
            apkd apkdVar = arcrVar.l;
            if (apkdVar == null) {
                apkdVar = apkd.a;
            }
            apkhVar = apkdVar.c;
            if (apkhVar == null) {
                apkhVar = apkh.a;
            }
        } else {
            apkhVar = null;
        }
        w(apkhVar);
        v(d(arcrVar));
        if ((arcrVar.b & 512) != 0) {
            apkd apkdVar2 = arcrVar.k;
            if (apkdVar2 == null) {
                apkdVar2 = apkd.a;
            }
            apkeVar = apkdVar2.e;
            if (apkeVar == null) {
                apkeVar = apke.a;
            }
        }
        u(apkeVar);
        t(mcy.O(arcrVar.d));
        this.a.e(ajokVar2);
        TextView textView = this.c;
        int i = arcrVar.f;
        textView.setMaxLines(i != 0 ? i : 1);
    }
}
