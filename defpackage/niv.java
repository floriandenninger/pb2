package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class niv implements ajom, ypd {
    public auap a;
    private final ypa b;
    private final ajut c;
    private final View d;
    private final TextView e;
    private final ImageView f;
    private final CheckBox g;
    private final ImageView h;
    private final nmm i;

    public niv(Activity activity, final aahd aahdVar, ypa ypaVar, ajut ajutVar, final nmm nmmVar, ViewGroup viewGroup) {
        this.b = ypaVar;
        this.i = nmmVar;
        this.c = ajutVar;
        View inflate = activity.getLayoutInflater().inflate(R.layout.playlist_add_to_entry, viewGroup, false);
        this.d = inflate;
        inflate.setOnClickListener(new View.OnClickListener() { // from class: niu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                niv nivVar = niv.this;
                aahd aahdVar2 = aahdVar;
                nmm nmmVar2 = nmmVar;
                int bE = anaf.bE(nivVar.a.e);
                if (bE == 0) {
                    bE = 1;
                }
                int i = bE - 1;
                if (i == 0) {
                    apxf apxfVar = nivVar.a.g;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar2.c(apxfVar, null);
                    nmmVar2.b.b.aL(true);
                    return;
                }
                if (i == 3) {
                    apxf apxfVar2 = nivVar.a.h;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar2.c(apxfVar2, null);
                    nivVar.d(4, nivVar.a.c);
                    return;
                }
                apxf apxfVar3 = nivVar.a.g;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar2.c(apxfVar3, null);
                nivVar.d(2, nivVar.a.c);
            }
        });
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.f = (ImageView) inflate.findViewById(R.id.icon);
        this.g = (CheckBox) inflate.findViewById(R.id.checkbox);
        this.h = (ImageView) inflate.findViewById(R.id.privacy_status);
    }

    private final void e() {
        CheckBox checkBox = this.g;
        int bE = anaf.bE(this.a.e);
        boolean z = false;
        if (bE != 0 && bE == 4) {
            z = true;
        }
        checkBox.setChecked(z);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.m(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{abbe.class};
        }
        if (i == 0) {
            abbe abbeVar = (abbe) obj;
            if (!this.a.c.equals(abbeVar.a)) {
                return null;
            }
            int bE = anaf.bE(this.a.e);
            d(bE != 0 ? bE : 1, abbeVar.a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        auap auapVar = (auap) obj;
        this.b.m(this);
        this.b.g(this);
        this.a = auapVar;
        TextView textView = this.e;
        aqyg aqygVar2 = null;
        if ((auapVar.b & 2) != 0) {
            aqygVar = auapVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.e;
        if ((auapVar.b & 2) != 0 && (aqygVar2 = auapVar.d) == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setContentDescription(ajcq.i(aqygVar2));
        int bE = anaf.bE(auapVar.e);
        if (bE == 0 || bE == 1) {
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            if (auapVar.c.equals("WL")) {
                this.f.setImageResource(R.drawable.ic_drawer_watch_later_normal);
                return;
            } else {
                this.f.setImageResource(R.drawable.quantum_ic_playlist_play_grey600_24);
                return;
            }
        }
        this.f.setVisibility(8);
        this.g.setVisibility(0);
        ajut ajutVar = this.c;
        arfs arfsVar = this.a.f;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        int a = ajutVar.a(b);
        if (a != 0) {
            this.h.setImageResource(a);
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        e();
    }

    public final void d(int i, String str) {
        int i2 = i - 1;
        if (i2 == 1) {
            aong aongVar = (aong) this.a.toBuilder();
            aongVar.copyOnWrite();
            auap auapVar = (auap) aongVar.instance;
            auapVar.e = 3;
            auapVar.b |= 16;
            this.a = (auap) aongVar.build();
            this.i.b.d(str, 4);
        } else if (i2 == 3) {
            aong aongVar2 = (aong) this.a.toBuilder();
            aongVar2.copyOnWrite();
            auap auapVar2 = (auap) aongVar2.instance;
            auapVar2.e = 1;
            auapVar2.b |= 16;
            this.a = (auap) aongVar2.build();
            nmm nmmVar = this.i;
            nmmVar.b.d(str, 2);
            if (Collection.EL.stream(nmmVar.b.e).filter(jzf.t).map(mjq.l).allMatch(jzf.s)) {
                String f = aalt.f(231, nmmVar.b.c);
                aahu c = nmmVar.b.d.c();
                c.f(f).H(ayps.w(aumu.d(f).c())).g(aumv.class).c(new fiy(c, 6)).Q();
                nmmVar.a.d(new kwl(nmmVar.b.c));
            }
        }
        e();
    }
}
