package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yha extends ajpc implements View.OnClickListener {
    public final axpg a;
    public final View b;
    public final TextView c;
    public final aoae d;
    private final ImageView e;
    private final ColorStateList f;
    private final Context g;
    private final aahd h;
    private final ajut i;
    private final aahv j;
    private arfm k;
    private ayqx l;
    private boolean m;

    public yha(aahd aahdVar, ajut ajutVar, aahv aahvVar, aoae aoaeVar, axpg axpgVar, ViewStub viewStub, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.h = aahdVar;
        this.i = ajutVar;
        this.j = aahvVar;
        this.d = aoaeVar;
        this.a = axpgVar;
        viewStub.setLayoutResource(R.layout.icon_badge);
        Context context = viewStub.getContext();
        this.g = context;
        View inflate = viewStub.inflate();
        this.b = inflate;
        inflate.setVisibility(8);
        inflate.setOnClickListener(this);
        this.c = (TextView) inflate.findViewById(R.id.badge_text);
        this.e = (ImageView) inflate.findViewById(R.id.badge_icon);
        this.f = wbs.S(context, R.attr.ytTextPrimary);
        this.m = false;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.k = null;
        this.b.setVisibility(8);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        arfm arfmVar = (arfm) obj;
        arfmVar.getClass();
        this.k = arfmVar;
        ajut ajutVar = this.i;
        arfs arfsVar = arfmVar.d;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        int a = ajutVar.a(b);
        if (a == 0) {
            this.e.setVisibility(8);
        } else {
            zau zauVar = new zau(this.g);
            this.e.setImageResource(a);
            ImageView imageView = this.e;
            imageView.setImageDrawable(zauVar.c(imageView.getDrawable(), this.f));
            this.e.setVisibility(0);
        }
        if ((arfmVar.b & 4) == 0) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(arfmVar.e);
            this.c.setVisibility(0);
        }
        if ((arfmVar.b & 16) != 0) {
            int dP = amkq.dP(arfmVar.g);
            if (dP == 0) {
                dP = 1;
            }
            int i = dP - 1;
            if (i == 1) {
                this.c.setBackgroundResource(R.drawable.icon_badge_red_background);
            } else if (i == 2) {
                this.c.setBackgroundResource(R.drawable.icon_badge_blue_background);
            } else {
                this.c.setBackgroundResource(R.drawable.icon_badge_blue_background);
            }
        }
        if (!this.m) {
            h(arfmVar);
        }
        if (arfmVar.f) {
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arfm) obj).k.I();
    }

    public final Drawable f() {
        return this.e.getDrawable();
    }

    public final void g() {
        this.b.setVisibility(8);
    }

    public final void h(final arfm arfmVar) {
        arfmVar.getClass();
        this.k = arfmVar;
        if ((arfmVar.b & 1) != 0) {
            ayqx ayqxVar = this.l;
            if (ayqxVar != null && !ayqxVar.e()) {
                ayrz.c((AtomicReference) this.l);
            }
            this.l = null;
            this.l = this.j.c().h(arfmVar.c, true).L(oht.k).Y(suj.p).k(arfk.class).ab(ayqr.a()).ax(new ayrs() { // from class: ygz
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    yha yhaVar = yha.this;
                    arfm arfmVar2 = arfmVar;
                    arfk arfkVar = (arfk) obj;
                    Iterator it = yhaVar.d.b.iterator();
                    while (it.hasNext()) {
                        ((ygx) it.next()).ou(arfkVar);
                    }
                    if ((arfkVar.b.b & 2) == 0) {
                        yhaVar.c.setVisibility(8);
                    } else {
                        yhaVar.c.setText(arfkVar.getBadgeText());
                        yhaVar.c.setVisibility(0);
                    }
                    if (arfkVar.getIsVisible().booleanValue()) {
                        yhaVar.b.setVisibility(0);
                        if ((arfmVar2.b & 128) != 0) {
                            ((akcp) yhaVar.a.get()).d(arfmVar2.j, yhaVar.b);
                            return;
                        }
                        return;
                    }
                    yhaVar.b.setVisibility(8);
                    if ((arfmVar2.b & 128) != 0) {
                        ((akcp) yhaVar.a.get()).g(arfmVar2.j);
                    }
                }
            });
            this.m = true;
        }
    }

    public final void j(ygx ygxVar) {
        this.d.b.add(ygxVar);
    }

    public final void k(Drawable drawable) {
        if (this.e.getVisibility() == 0) {
            this.e.setImageDrawable(drawable);
        }
    }

    public final void m(ygx ygxVar) {
        this.d.b.remove(ygxVar);
    }

    public final boolean n(arfk arfkVar) {
        arfm arfmVar = this.k;
        return (arfmVar == null || (arfmVar.b & 1) == 0 || !arfmVar.c.equals(arfkVar.d())) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        arfm arfmVar = this.k;
        if (arfmVar == null || (arfmVar.b & 32) == 0) {
            return;
        }
        aahd aahdVar = this.h;
        apxf apxfVar = arfmVar.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.a(apxfVar);
    }
}
