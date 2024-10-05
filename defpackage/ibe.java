package defpackage;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ibe implements ioz, icp {
    public static final amrz a = amrz.l(axbs.CHANNEL_MENTION_NORMAL, Integer.valueOf(R.style.NormalDynamicSticker), axbs.CHANNEL_MENTION_LIGHT, Integer.valueOf(R.style.LightDynamicSticker));
    public static final axbs b = axbs.CHANNEL_MENTION_NORMAL;
    public final ci c;
    public final icq d;
    public final iax e;
    public final acqz f;
    public ViewGroup g;
    public ipa h;
    public aulq i;
    public boolean j;
    public apxf k;
    public hbg l;
    public hyq m;
    public final jgp n;
    public final agcm o;
    public final wcy p;
    public final axze q;
    private final ajjz r;

    public ibe(jgp jgpVar, ci ciVar, ajjz ajjzVar, icq icqVar, agcm agcmVar, wcy wcyVar, iax iaxVar, acqz acqzVar, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.n = jgpVar;
        this.c = ciVar;
        this.r = ajjzVar;
        this.d = icqVar;
        this.o = agcmVar;
        this.p = wcyVar;
        this.e = iaxVar;
        this.f = acqzVar;
        this.q = axzeVar;
    }

    private final void f(axdj axdjVar, axbs axbsVar, ici iciVar) {
        axbr axbrVar;
        axbr axbrVar2;
        axbr axbrVar3;
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.c, ((Integer) a.get(axbsVar)).intValue())).inflate(R.layout.user_mention_sticker, new FrameLayout(this.c));
        aone builder = ((axdk) axdjVar.instance).i().toBuilder();
        axdi i = ((axdk) axdjVar.instance).i();
        if (i.c == 6) {
            axbrVar = (axbr) i.d;
        } else {
            axbrVar = axbr.a;
        }
        aone builder2 = axbrVar.toBuilder();
        axdi i2 = ((axdk) axdjVar.instance).i();
        if (i2.c == 6) {
            axbrVar2 = (axbr) i2.d;
        } else {
            axbrVar2 = axbr.a;
        }
        axbq axbqVar = axbrVar2.f;
        if (axbqVar == null) {
            axbqVar = axbq.b;
        }
        aone builder3 = axbqVar.toBuilder();
        builder3.copyOnWrite();
        axbq axbqVar2 = (axbq) builder3.instance;
        axbqVar2.d = axbsVar.d;
        axbqVar2.c |= 1;
        builder2.copyOnWrite();
        axbr axbrVar4 = (axbr) builder2.instance;
        axbq axbqVar3 = (axbq) builder3.build();
        axbqVar3.getClass();
        axbrVar4.f = axbqVar3;
        axbrVar4.b |= 8;
        builder.copyOnWrite();
        axdi axdiVar = (axdi) builder.instance;
        axbr axbrVar5 = (axbr) builder2.build();
        axbrVar5.getClass();
        axdiVar.d = axbrVar5;
        axdiVar.c = 6;
        axdjVar.copyOnWrite();
        ((axdk) axdjVar.instance).F((axdi) builder.build());
        axdi i3 = ((axdk) axdjVar.instance).i();
        if (i3.c == 6) {
            axbrVar3 = (axbr) i3.d;
        } else {
            axbrVar3 = axbr.a;
        }
        ((TextView) inflate.findViewById(R.id.text)).setText(axbrVar3.d);
        this.r.l(wbs.aj(axbrVar3.e), new ibd(this, (ImageView) inflate.findViewById(R.id.icon), inflate, axdjVar, iciVar));
    }

    @Override // defpackage.icp
    public final void a(axcg axcgVar) {
        axbr axbrVar;
        this.f.mM().I(3, new acqx(acsb.c(65452)), null);
        axdi i = axcgVar.c().i();
        if (i.c == 6) {
            axbrVar = (axbr) i.d;
        } else {
            axbrVar = axbr.a;
        }
        axbq axbqVar = axbrVar.f;
        if (axbqVar == null) {
            axbqVar = axbq.b;
        }
        aonw aonwVar = new aonw(axbqVar.e, axbq.a);
        axbs b2 = axbs.b(axbqVar.d);
        if (b2 == null) {
            b2 = axbs.CHANNEL_MENTION_STYLE_UNSPECIFIED;
        }
        axbs axbsVar = (axbs) iam.a(aonwVar, b2);
        final aone builder = axcgVar.toBuilder();
        f((axdj) ((axcg) builder.instance).c().toBuilder(), axbsVar, new ici() { // from class: ibb
            @Override // defpackage.ici
            public final void a(axdj axdjVar) {
                ibe ibeVar = ibe.this;
                aone aoneVar = builder;
                aoneVar.copyOnWrite();
                ((axcg) aoneVar.instance).e((axdk) axdjVar.build());
                ibeVar.d.aT(aoneVar);
            }
        });
    }

    public final void c(axdj axdjVar, axbs axbsVar, final boolean z) {
        f(axdjVar, axbsVar, new ici() { // from class: ibc
            @Override // defpackage.ici
            public final void a(axdj axdjVar2) {
                ibe ibeVar = ibe.this;
                boolean z2 = z;
                ibeVar.d.aI(axdjVar2);
                if (z2) {
                    ibeVar.e.d(axdjVar2);
                }
            }
        });
    }

    public final void d() {
        this.l.a();
        this.g.setVisibility(8);
    }

    public final void e(ImageView imageView) {
        imageView.getDrawable().setTint(this.c.getColor(R.color.yt_dark_blue));
    }

    @Override // defpackage.icp
    public final void my(axdk axdkVar) {
        axbr axbrVar;
        this.f.mM().I(3, new acqx(acsb.c(65452)), null);
        axdi i = axdkVar.i();
        if (i.c == 6) {
            axbrVar = (axbr) i.d;
        } else {
            axbrVar = axbr.a;
        }
        axbq axbqVar = axbrVar.f;
        if (axbqVar == null) {
            axbqVar = axbq.b;
        }
        aonw aonwVar = new aonw(axbqVar.e, axbq.a);
        axbs b2 = axbs.b(axbqVar.d);
        if (b2 == null) {
            b2 = axbs.CHANNEL_MENTION_STYLE_UNSPECIFIED;
        }
        c((axdj) axdkVar.toBuilder(), (axbs) iam.a(aonwVar, b2), false);
    }
}
