package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ybx extends ajpc {
    public final aahd a;
    public final View b;
    private final ybz c;
    private final TextView d;
    private final TextView e;
    private final ycl f;
    private final ycl g;
    private final ybo h;

    public ybx(Context context, aahd aahdVar, zzw zzwVar, ajyw ajywVar, ViewGroup viewGroup, ybo yboVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ycc yccVar = new ycc(aahdVar, new ycb(new Runnable() { // from class: ybw
            @Override // java.lang.Runnable
            public final void run() {
                ybx.this.f();
            }
        }, 1));
        this.a = yccVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ypc_membership_post_transaction_layout, viewGroup, false);
        this.b = inflate;
        this.c = ajywVar.e(inflate);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.okay_button);
        this.h = yboVar;
        inflate.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: ybu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ybx.this.f();
            }
        });
        this.f = zzwVar.b(yccVar, inflate.findViewById(R.id.yt_perks));
        this.g = zzwVar.b(yccVar, inflate.findViewById(R.id.custom_perks));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        final apmg apmgVar;
        aqyg aqygVar2;
        atcr atcrVar = (atcr) obj;
        ybz ybzVar = this.c;
        avgg avggVar = atcrVar.h;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        avgg avggVar2 = atcrVar.g;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        avgg avggVar3 = atcrVar.f;
        if (avggVar3 == null) {
            avggVar3 = avgg.a;
        }
        arfs arfsVar = atcrVar.d;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        ybzVar.a(avggVar, avggVar2, avggVar3, arfsVar);
        TextView textView = this.d;
        if ((atcrVar.b & 1) != 0) {
            aqygVar = atcrVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        ycl yclVar = this.f;
        aulq aulqVar = atcrVar.i;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ybz.c(yclVar, aulqVar);
        ycl yclVar2 = this.g;
        aulq aulqVar2 = atcrVar.j;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        ybz.c(yclVar2, aulqVar2);
        apmh apmhVar = atcrVar.e;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = atcrVar.e;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        if (apmgVar != null) {
            TextView textView2 = this.e;
            if ((apmgVar.b & 256) != 0) {
                aqygVar2 = apmgVar.i;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView2.setText(ajcq.b(aqygVar2));
            this.e.setOnClickListener(new View.OnClickListener() { // from class: ybv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ybx ybxVar = ybx.this;
                    apmg apmgVar2 = apmgVar;
                    ybxVar.f();
                    Map g = acrc.g(apmgVar2);
                    int i = apmgVar2.b;
                    if ((i & 8192) != 0) {
                        aahd aahdVar = ybxVar.a;
                        apxf apxfVar = apmgVar2.n;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, g);
                        return;
                    }
                    if ((i & 16384) != 0) {
                        aahd aahdVar2 = ybxVar.a;
                        apxf apxfVar2 = apmgVar2.o;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar2.c(apxfVar2, g);
                        return;
                    }
                    if ((i & 32768) != 0) {
                        aahd aahdVar3 = ybxVar.a;
                        apxf apxfVar3 = apmgVar2.p;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        aahdVar3.c(apxfVar3, g);
                    }
                }
            });
            ajokVar.a.u(new acqx(apmgVar.t), null);
        }
        whu.I(this.e, apmgVar != null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atcr) obj).k.I();
    }

    public final void f() {
        ((grn) this.h).a.dismiss();
    }
}
