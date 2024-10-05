package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lpz implements ajom, lpe {
    public final Context a;
    public final aahd b;
    public aupu c;
    public int d;
    public int e;
    public final aoae f;
    private final ajop g;
    private final akgl h;
    private final View i;
    private final TextView j;
    private final TextView k;
    private final Switch l;

    public lpz(Context context, gma gmaVar, final aahd aahdVar, final aoae aoaeVar, final akgl akglVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.g = gmaVar;
        this.b = aahdVar;
        this.f = aoaeVar;
        this.h = akglVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.i = inflate;
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.summary);
        Switch r12 = (Switch) inflate.findViewById(R.id.switch_button);
        this.l = r12;
        final byte[] bArr4 = null;
        final byte[] bArr5 = null;
        final byte[] bArr6 = null;
        r12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(akglVar, aahdVar, aoaeVar, bArr4, bArr5, bArr6) { // from class: lpx
            public final /* synthetic */ akgl b;
            public final /* synthetic */ aahd c;
            public final /* synthetic */ aoae d;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                boolean g;
                apxf apxfVar;
                lpz lpzVar = lpz.this;
                akgl akglVar2 = this.b;
                aahd aahdVar2 = this.c;
                aoae aoaeVar2 = this.d;
                aupu aupuVar = lpzVar.c;
                if (aupuVar == null || z == (g = akglVar2.g(aupuVar))) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.valueOf(g));
                if (z) {
                    apxfVar = lpzVar.c.h;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    apxfVar = lpzVar.c.i;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                }
                aahdVar2.c(apxfVar, hashMap);
                akglVar2.d(lpzVar.c, z);
                Iterator it = aoaeVar2.b.iterator();
                while (it.hasNext()) {
                    ((lpe) it.next()).d(z);
                }
            }
        });
        gmaVar.c(inflate);
        gmaVar.d(new View.OnClickListener() { // from class: lpw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lpz lpzVar = lpz.this;
                akgl akglVar2 = akglVar;
                aupu aupuVar = lpzVar.c;
                if (aupuVar == null || !akglVar2.j(aupuVar)) {
                    return;
                }
                auqa b = akglVar2.b(lpzVar.c);
                final lqo lqoVar = new lqo(lpzVar.a);
                final lpy lpyVar = new lpy(lpzVar, b);
                AlertDialog alertDialog = null;
                View inflate2 = LayoutInflater.from(lqoVar.a).inflate(R.layout.setting_boolean_time_range_dialog, (ViewGroup) null, false);
                lqoVar.b = (TextView) inflate2.findViewById(R.id.dialog_title);
                LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(R.id.time_range);
                lqoVar.c = new TimeRangeView(lqoVar.a);
                linearLayout.addView(lqoVar.c, new LinearLayout.LayoutParams(-1, -2));
                TextView textView = lqoVar.b;
                textView.getClass();
                aqyg aqygVar = b.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar));
                TimeRangeView timeRangeView = lqoVar.c;
                timeRangeView.getClass();
                if (timeRangeView.c(b, -1)) {
                    AlertDialog.Builder view2 = new AlertDialog.Builder(lqoVar.a).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setView(inflate2);
                    view2.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: lqn
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            auqb auqbVar;
                            auqb auqbVar2;
                            lqo lqoVar2 = lqo.this;
                            lpy lpyVar2 = lpyVar;
                            TimeRangeView timeRangeView2 = lqoVar2.c;
                            timeRangeView2.getClass();
                            int a = timeRangeView2.a();
                            TimeRangeView timeRangeView3 = lqoVar2.c;
                            timeRangeView3.getClass();
                            int b2 = timeRangeView3.b();
                            lpz lpzVar2 = lpyVar2.a;
                            auqa auqaVar = lpyVar2.b;
                            if (a != lpzVar2.d) {
                                auqaVar = mcy.s(auqaVar, 0, a);
                                HashMap hashMap = new HashMap();
                                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Integer.valueOf(a));
                                List r = mcy.r(auqaVar, 0);
                                aahd aahdVar2 = lpzVar2.b;
                                auqd auqdVar = (auqd) r.get(a);
                                if (auqdVar.b == 190692730) {
                                    auqbVar2 = (auqb) auqdVar.c;
                                } else {
                                    auqbVar2 = auqb.a;
                                }
                                apxf apxfVar = auqbVar2.e;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, hashMap);
                                Iterator it = lpzVar2.f.b.iterator();
                                while (it.hasNext()) {
                                    ((lpe) it.next()).f(a);
                                }
                                lpzVar2.d = a;
                            }
                            if (b2 != lpzVar2.e) {
                                auqa s = mcy.s(auqaVar, 1, b2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Integer.valueOf(b2));
                                List r2 = mcy.r(s, 1);
                                aahd aahdVar3 = lpzVar2.b;
                                auqd auqdVar2 = (auqd) r2.get(b2);
                                if (auqdVar2.b == 190692730) {
                                    auqbVar = (auqb) auqdVar2.c;
                                } else {
                                    auqbVar = auqb.a;
                                }
                                apxf apxfVar2 = auqbVar.e;
                                if (apxfVar2 == null) {
                                    apxfVar2 = apxf.a;
                                }
                                aahdVar3.c(apxfVar2, hashMap2);
                                Iterator it2 = lpzVar2.f.b.iterator();
                                while (it2.hasNext()) {
                                    ((lpe) it2.next()).e(b2);
                                }
                                lpzVar2.e = b2;
                            }
                            lpzVar2.h(true);
                        }
                    });
                    alertDialog = view2.create();
                }
                if (alertDialog != null) {
                    alertDialog.show();
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
        this.f.b.remove(this);
        this.c = null;
    }

    @Override // defpackage.lpe
    public final void d(boolean z) {
        this.l.setChecked(z);
    }

    @Override // defpackage.lpe
    public final void e(int i) {
        this.h.f(this.c, mcy.s(this.h.b(this.c), 1, i));
    }

    @Override // defpackage.lpe
    public final void f(int i) {
        this.h.f(this.c, mcy.s(this.h.b(this.c), 0, i));
    }

    @Override // defpackage.ajom
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, lqe lqeVar) {
        Spanned b;
        aupu aupuVar = lqeVar.a;
        this.c = aupuVar;
        if (this.h.j(aupuVar)) {
            TextView textView = this.j;
            aqyg aqygVar = this.c.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.G(textView, ajcq.b(aqygVar));
            aupu aupuVar2 = this.c;
            if (!aupuVar2.g || (aupuVar2.b & 4096) == 0) {
                if (!this.h.g(aupuVar2)) {
                    aupu aupuVar3 = this.c;
                    if ((aupuVar3.b & 2048) != 0) {
                        aqyg aqygVar2 = aupuVar3.j;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                        b = ajcq.b(aqygVar2);
                    }
                }
                aqyg aqygVar3 = this.c.e;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                b = ajcq.b(aqygVar3);
            } else {
                aqyg aqygVar4 = aupuVar2.k;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
                b = ajcq.b(aqygVar4);
            }
            whu.G(this.k, b);
            h(Boolean.valueOf(this.h.g(this.c)));
            this.f.b.add(this);
            this.g.e(ajokVar);
        }
    }

    public final void h(Boolean bool) {
        Switch r0 = this.l;
        if (r0 != null) {
            r0.setChecked(bool.booleanValue());
        }
    }
}
