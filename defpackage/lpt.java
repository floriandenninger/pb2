package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lpt implements ajom, lpd {
    public final aahd a;
    public aupu b;
    public AlertDialog c;
    public int d;
    public final aoae e;
    private final Context f;
    private final ajop g;
    private final akgl h;
    private final View i;
    private final TextView j;
    private final TextView k;
    private final Switch l;

    public lpt(Context context, gma gmaVar, final aahd aahdVar, final akgl akglVar, final aoae aoaeVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f = context;
        this.g = gmaVar;
        this.a = aahdVar;
        this.h = akglVar;
        this.e = aoaeVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.i = inflate;
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.summary);
        Switch r12 = (Switch) inflate.findViewById(R.id.switch_button);
        this.l = r12;
        final byte[] bArr5 = null;
        final byte[] bArr6 = null;
        final byte[] bArr7 = null;
        final byte[] bArr8 = null;
        r12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(akglVar, aahdVar, aoaeVar, bArr5, bArr6, bArr7, bArr8) { // from class: lps
            public final /* synthetic */ akgl b;
            public final /* synthetic */ aahd c;
            public final /* synthetic */ aoae d;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                apxf apxfVar;
                lpt lptVar = lpt.this;
                akgl akglVar2 = this.b;
                aahd aahdVar2 = this.c;
                aoae aoaeVar2 = this.d;
                aupu aupuVar = lptVar.b;
                if (aupuVar == null || z == akglVar2.g(aupuVar)) {
                    return;
                }
                amkq.u(lptVar.b);
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.valueOf(z));
                if (z) {
                    aupu aupuVar2 = lptVar.b;
                    amkq.u(aupuVar2);
                    apxfVar = aupuVar2.h;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    aupu aupuVar3 = lptVar.b;
                    amkq.u(aupuVar3);
                    apxfVar = aupuVar3.i;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                }
                aahdVar2.c(apxfVar, hashMap);
                aupu aupuVar4 = lptVar.b;
                amkq.u(aupuVar4);
                akglVar2.d(aupuVar4, z);
                Iterator it = aoaeVar2.b.iterator();
                while (it.hasNext()) {
                    ((lpd) it.next()).d(z);
                }
            }
        });
        gmaVar.c(inflate);
        gmaVar.d(new View.OnClickListener() { // from class: lpr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lpt lptVar = lpt.this;
                aupu aupuVar = lptVar.b;
                amkq.u(aupuVar);
                AlertDialog.Builder f = lptVar.f(aupuVar);
                AlertDialog alertDialog = lptVar.c;
                if (!(alertDialog == null && f == null) && alertDialog == null) {
                    lptVar.c = f.create();
                    lptVar.c.show();
                }
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.g).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b = null;
        this.e.b.remove(this);
    }

    @Override // defpackage.lpd
    public final void d(boolean z) {
        this.l.setChecked(z);
    }

    @Override // defpackage.lpd
    public final void e(int i) {
        auqb auqbVar;
        if (this.d != i) {
            akgl akglVar = this.h;
            aupu aupuVar = this.b;
            amkq.u(aupuVar);
            aone builder = akglVar.c(aupuVar).toBuilder();
            int i2 = 0;
            while (i2 < ((auqh) builder.instance).f.size()) {
                aone builder2 = builder.aP(i2).toBuilder();
                auqd aP = builder.aP(i2);
                if (aP.b == 190692730) {
                    auqbVar = (auqb) aP.c;
                } else {
                    auqbVar = auqb.a;
                }
                aone builder3 = auqbVar.toBuilder();
                boolean z = i2 == i;
                builder3.copyOnWrite();
                auqb auqbVar2 = (auqb) builder3.instance;
                auqbVar2.b |= 4;
                auqbVar2.d = z;
                builder2.copyOnWrite();
                auqd auqdVar = (auqd) builder2.instance;
                auqb auqbVar3 = (auqb) builder3.build();
                auqbVar3.getClass();
                auqdVar.c = auqbVar3;
                auqdVar.b = 190692730;
                auqd auqdVar2 = (auqd) builder2.build();
                builder.copyOnWrite();
                auqh auqhVar = (auqh) builder.instance;
                auqdVar2.getClass();
                auqhVar.a();
                auqhVar.f.set(i2, auqdVar2);
                i2++;
            }
            akgl akglVar2 = this.h;
            aupu aupuVar2 = this.b;
            amkq.u(aupuVar2);
            auqh auqhVar2 = (auqh) builder.build();
            Map map = akglVar2.a;
            aone builder4 = akglVar2.a(aupuVar2).toBuilder();
            aulq aulqVar = akglVar2.a(aupuVar2).n;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aong aongVar = (aong) aulqVar.toBuilder();
            aongVar.e(SettingRenderer.settingSingleOptionMenuRenderer, auqhVar2);
            builder4.copyOnWrite();
            aupu aupuVar3 = (aupu) builder4.instance;
            aulq aulqVar2 = (aulq) aongVar.build();
            aulqVar2.getClass();
            aupuVar3.n = aulqVar2;
            aupuVar3.b |= 32768;
            map.put(aupuVar2, (aupu) builder4.build());
            aupu aupuVar4 = this.b;
            amkq.u(aupuVar4);
            AlertDialog.Builder f = f(aupuVar4);
            if (f != null) {
                this.c = f.create();
            }
            aupu aupuVar5 = this.b;
            amkq.u(aupuVar5);
            i(aupuVar5);
        }
    }

    public final AlertDialog.Builder f(aupu aupuVar) {
        if (!this.h.i(aupuVar)) {
            return null;
        }
        auqh c = this.h.c(aupuVar);
        final List o = mcy.o(c);
        if (o.isEmpty()) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f);
        builder.setCustomTitle(mcy.l(this.f, c));
        this.d = mcy.k(o);
        final lqm lqmVar = new lqm(this.f);
        lqmVar.c(mcy.p(this.f, o));
        lqmVar.b(mcy.n(this.f, o));
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: lpq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                lpt lptVar = lpt.this;
                lqm lqmVar2 = lqmVar;
                List list = o;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Integer.valueOf(i));
                int a = lqmVar2.a();
                aahd aahdVar = lptVar.a;
                apxf apxfVar = ((auqb) list.get(a)).e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, hashMap);
                if (lptVar.d != a) {
                    Iterator it = lptVar.e.b.iterator();
                    while (it.hasNext()) {
                        ((lpd) it.next()).e(a);
                    }
                }
                lptVar.h(true);
                lptVar.d = a;
                dialogInterface.dismiss();
            }
        });
        builder.setNegativeButton(R.string.cancel, hgs.e);
        builder.setView(lqmVar);
        return builder;
    }

    @Override // defpackage.ajom
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, lqd lqdVar) {
        aqyg aqygVar;
        aupu aupuVar = lqdVar.a;
        this.b = aupuVar;
        amkq.u(aupuVar);
        aulq aulqVar = aupuVar.n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (((auqh) aulqVar.pX(SettingRenderer.settingSingleOptionMenuRenderer)).f.size() == 0) {
            return;
        }
        aupu aupuVar2 = this.b;
        amkq.u(aupuVar2);
        int i = aupuVar2.b & 16;
        if (i != 0) {
            TextView textView = this.j;
            if (i != 0) {
                aqygVar = aupuVar2.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(textView, ajcq.b(aqygVar));
        }
        aupu aupuVar3 = this.b;
        amkq.u(aupuVar3);
        i(aupuVar3);
        akgl akglVar = this.h;
        aupu aupuVar4 = this.b;
        amkq.u(aupuVar4);
        h(Boolean.valueOf(akglVar.g(aupuVar4)));
        this.e.b.add(this);
        this.g.e(ajokVar);
    }

    public final void h(Boolean bool) {
        Switch r0 = this.l;
        if (r0 != null) {
            r0.setChecked(bool.booleanValue());
        }
    }

    private final void i(aupu aupuVar) {
        CharSequence b;
        if (!aupuVar.g || (aupuVar.b & 4096) == 0) {
            if (this.h.g(aupuVar) || (aupuVar.b & 2048) == 0) {
                if (!this.h.i(aupuVar)) {
                    aqyg aqygVar = aupuVar.e;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    b = ajcq.b(aqygVar);
                } else {
                    List o = mcy.o(this.h.c(aupuVar));
                    Context context = this.f;
                    b = context.getString(R.string.pref_notification_digest_summary, mcy.n(context, o));
                }
            } else {
                aqyg aqygVar2 = aupuVar.j;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                b = ajcq.b(aqygVar2);
            }
        } else {
            aqyg aqygVar3 = aupuVar.k;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            b = ajcq.b(aqygVar3);
        }
        whu.G(this.k, b);
    }
}
