package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class liv extends lhs {
    public aahd ae;
    public afsy af;
    public acpl ag;
    acra ah;
    auqe ai;
    liu aj;
    public String ak;
    public RadioGroup al;
    public RadioGroup am;
    public ScrollView an;
    public akbc ao;
    public agcm ap;

    public static liv aH(auqe auqeVar, acra acraVar) {
        auqeVar.getClass();
        liv livVar = new liv();
        livVar.ah = acraVar;
        Bundle bundle = new Bundle();
        amkq.cn(bundle, "renderer", auqeVar);
        livVar.af(bundle);
        return livVar;
    }

    private final RadioGroup.OnCheckedChangeListener aL() {
        return new RadioGroup.OnCheckedChangeListener() { // from class: liq
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                liv livVar = liv.this;
                livVar.ak = ((RadioButton) radioGroup.findViewById(i)).getText().toString();
                if (radioGroup.equals(livVar.al)) {
                    livVar.aJ(livVar.am);
                } else if (radioGroup.equals(livVar.am)) {
                    livVar.aJ(livVar.al);
                }
            }
        };
    }

    public final String aI() {
        String c = akbc.c();
        String a = this.ao.a();
        if (c.isEmpty() || a.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(c.length() + 1 + String.valueOf(a).length());
        sb.append(c);
        sb.append("-");
        sb.append(a);
        return sb.toString();
    }

    public final void aJ(RadioGroup radioGroup) {
        radioGroup.setOnCheckedChangeListener(null);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(aL());
    }

    public final void aK(LayoutInflater layoutInflater, RadioGroup radioGroup, auqk auqkVar) {
        auqc auqcVar;
        auqc auqcVar2;
        TextView textView = (TextView) layoutInflater.inflate(R.layout.voice_language_selector_section_title, (ViewGroup) radioGroup, false);
        aqyg aqygVar = auqkVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        radioGroup.addView(textView);
        for (auqd auqdVar : auqkVar.c) {
            final RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.voice_language_selector_item, (ViewGroup) radioGroup, false);
            radioButton.setId(View.generateViewId());
            if (auqdVar.b == 64166933) {
                auqcVar = (auqc) auqdVar.c;
            } else {
                auqcVar = auqc.a;
            }
            radioButton.setText(auqcVar.c);
            radioGroup.addView(radioButton);
            if (auqdVar.b == 64166933) {
                auqcVar2 = (auqc) auqdVar.c;
            } else {
                auqcVar2 = auqc.a;
            }
            if (amkq.e(auqcVar2.e, this.ak)) {
                radioButton.setChecked(true);
                this.an.post(new Runnable() { // from class: lis
                    @Override // java.lang.Runnable
                    public final void run() {
                        liv.this.an.scrollTo(0, Math.round(radioButton.getY()));
                    }
                });
            }
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        aooy aooyVar;
        super.mR(bundle);
        try {
            aooyVar = amkq.ck(this.m, "renderer", auqe.a, aomw.b());
        } catch (RuntimeException unused) {
            zga.b("Failed to merge proto for renderer");
            aooyVar = null;
        }
        this.ai = (auqe) aooyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [char] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // defpackage.ce
    public final View mg(final LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String valueOf;
        super.mg(layoutInflater, viewGroup, bundle);
        if (C() instanceof liu) {
            this.aj = (liu) C();
        }
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.voice_language_selector_fragment, viewGroup, false);
        this.an = (ScrollView) inflate.findViewById(R.id.scroll_view);
        ((TextView) inflate.findViewById(R.id.title)).setText(R.string.select_voice_language);
        this.al = (RadioGroup) inflate.findViewById(R.id.suggested_language_group);
        this.am = (RadioGroup) inflate.findViewById(R.id.all_language_group);
        ynm.i(this.ap.k(), new ynl() { // from class: lir
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                auqc auqcVar;
                liv livVar = liv.this;
                LayoutInflater layoutInflater2 = layoutInflater;
                livVar.ak = (String) obj;
                ArrayList arrayList = new ArrayList(Arrays.asList(livVar.al, livVar.am));
                int i2 = 0;
                loop0: while (true) {
                    if (i2 >= livVar.ai.e.size()) {
                        i2 = -1;
                        break;
                    }
                    for (auqd auqdVar : ((auqk) livVar.ai.e.get(i2)).c) {
                        if (auqdVar.b == 64166933) {
                            auqcVar = (auqc) auqdVar.c;
                        } else {
                            auqcVar = auqc.a;
                        }
                        if (amkq.e(auqcVar.e, livVar.ak)) {
                            break loop0;
                        }
                    }
                    i2++;
                }
                for (int i3 = 0; i3 < livVar.ai.e.size(); i3++) {
                    auqk auqkVar = (auqk) livVar.ai.e.get(i3);
                    if (!auqkVar.d || i2 == i3) {
                        livVar.aK(layoutInflater2, (RadioGroup) arrayList.get(i3), auqkVar);
                    } else {
                        LinearLayout linearLayout = (LinearLayout) layoutInflater2.inflate(R.layout.voice_language_selector_section_title_collapsed, (ViewGroup) arrayList.get(i3), false);
                        TextView textView = (TextView) linearLayout.findViewById(R.id.collapsed_title_text);
                        aqyg aqygVar = auqkVar.b;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        textView.setText(ajcq.b(aqygVar));
                        ((RadioGroup) arrayList.get(i3)).addView(linearLayout);
                        linearLayout.setOnClickListener(new lit(livVar, layoutInflater2, (RadioGroup) arrayList.get(i3), auqkVar));
                    }
                }
                livVar.ah.n(new acqx(acsb.c(95981)));
            }
        });
        TextView textView = (TextView) inflate.findViewById(R.id.cancel_button);
        CharSequence text = qX().getText(android.R.string.cancel);
        if (text instanceof String) {
            valueOf = amkq.d((String) text);
        } else {
            int length = text.length();
            char[] cArr = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = text.charAt(i2);
                if (amkq.f(charAt)) {
                    charAt ^= 32;
                }
                cArr[i2] = (char) charAt;
            }
            valueOf = String.valueOf(cArr);
        }
        textView.setText(valueOf);
        final int i3 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: lip
            public final /* synthetic */ liv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                auqc auqcVar;
                auqc auqcVar2;
                if (i3 == 0) {
                    liv livVar = this.a;
                    String str = livVar.ak;
                    Iterator it = livVar.ai.e.iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            auqcVar = null;
                            break;
                        }
                        for (auqd auqdVar : ((auqk) it.next()).c) {
                            if (auqdVar.b == 64166933) {
                                auqcVar = (auqc) auqdVar.c;
                            } else {
                                auqcVar = auqc.a;
                            }
                            if (auqcVar.c.equals(str)) {
                                break loop0;
                            }
                        }
                    }
                    if (auqcVar != null) {
                        if (livVar.af.t()) {
                            aahd aahdVar = livVar.ae;
                            apxf apxfVar = auqcVar.g;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar.a(apxfVar);
                        }
                        livVar.ap.a.b(new fjz(auqcVar.e, 4), angq.a).d(bqc.h, angq.a);
                        aone createBuilder = awax.a.createBuilder();
                        String aI = livVar.aI();
                        createBuilder.copyOnWrite();
                        awax awaxVar = (awax) createBuilder.instance;
                        aI.getClass();
                        awaxVar.b = aI;
                        String str2 = auqcVar.e;
                        createBuilder.copyOnWrite();
                        awax awaxVar2 = (awax) createBuilder.instance;
                        str2.getClass();
                        awaxVar2.c = str2;
                        awax awaxVar3 = (awax) createBuilder.build();
                        acpl acplVar = livVar.ag;
                        arpn a = arpp.a();
                        a.copyOnWrite();
                        ((arpp) a.instance).eh(awaxVar3);
                        acplVar.c((arpp) a.build());
                        if (livVar.aj != null) {
                            String str3 = auqcVar.c;
                            String str4 = auqcVar.e;
                            if (str4.isEmpty()) {
                                str4 = livVar.aI();
                                Iterator it2 = livVar.ai.e.iterator();
                                loop2: while (true) {
                                    if (it2.hasNext()) {
                                        for (auqd auqdVar2 : ((auqk) it2.next()).c) {
                                            if (auqdVar2.b == 64166933) {
                                                auqcVar2 = (auqc) auqdVar2.c;
                                            } else {
                                                auqcVar2 = auqc.a;
                                            }
                                            if (amkq.e(auqcVar2.e, str4)) {
                                                str3 = auqcVar2.c;
                                                break loop2;
                                            }
                                        }
                                    } else {
                                        List h = amnm.b('-').h(str4);
                                        str3 = new Locale((String) h.get(0), amkq.d((String) h.get(1))).getDisplayName();
                                        break;
                                    }
                                }
                            }
                            livVar.aj.c(str3, str4);
                        }
                    }
                    livVar.ah.I(3, new acqx(acsb.c(95981)), null);
                    livVar.dismiss();
                    return;
                }
                liv livVar2 = this.a;
                livVar2.ah.I(3, new acqx(acsb.c(95980)), null);
                livVar2.dismiss();
            }
        });
        this.ah.n(new acqx(acsb.c(95980)));
        TextView textView2 = (TextView) inflate.findViewById(R.id.apply_button);
        textView2.setText(qX().getText(R.string.ok_button));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: lip
            public final /* synthetic */ liv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                auqc auqcVar;
                auqc auqcVar2;
                if (i == 0) {
                    liv livVar = this.a;
                    String str = livVar.ak;
                    Iterator it = livVar.ai.e.iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            auqcVar = null;
                            break;
                        }
                        for (auqd auqdVar : ((auqk) it.next()).c) {
                            if (auqdVar.b == 64166933) {
                                auqcVar = (auqc) auqdVar.c;
                            } else {
                                auqcVar = auqc.a;
                            }
                            if (auqcVar.c.equals(str)) {
                                break loop0;
                            }
                        }
                    }
                    if (auqcVar != null) {
                        if (livVar.af.t()) {
                            aahd aahdVar = livVar.ae;
                            apxf apxfVar = auqcVar.g;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar.a(apxfVar);
                        }
                        livVar.ap.a.b(new fjz(auqcVar.e, 4), angq.a).d(bqc.h, angq.a);
                        aone createBuilder = awax.a.createBuilder();
                        String aI = livVar.aI();
                        createBuilder.copyOnWrite();
                        awax awaxVar = (awax) createBuilder.instance;
                        aI.getClass();
                        awaxVar.b = aI;
                        String str2 = auqcVar.e;
                        createBuilder.copyOnWrite();
                        awax awaxVar2 = (awax) createBuilder.instance;
                        str2.getClass();
                        awaxVar2.c = str2;
                        awax awaxVar3 = (awax) createBuilder.build();
                        acpl acplVar = livVar.ag;
                        arpn a = arpp.a();
                        a.copyOnWrite();
                        ((arpp) a.instance).eh(awaxVar3);
                        acplVar.c((arpp) a.build());
                        if (livVar.aj != null) {
                            String str3 = auqcVar.c;
                            String str4 = auqcVar.e;
                            if (str4.isEmpty()) {
                                str4 = livVar.aI();
                                Iterator it2 = livVar.ai.e.iterator();
                                loop2: while (true) {
                                    if (it2.hasNext()) {
                                        for (auqd auqdVar2 : ((auqk) it2.next()).c) {
                                            if (auqdVar2.b == 64166933) {
                                                auqcVar2 = (auqc) auqdVar2.c;
                                            } else {
                                                auqcVar2 = auqc.a;
                                            }
                                            if (amkq.e(auqcVar2.e, str4)) {
                                                str3 = auqcVar2.c;
                                                break loop2;
                                            }
                                        }
                                    } else {
                                        List h = amnm.b('-').h(str4);
                                        str3 = new Locale((String) h.get(0), amkq.d((String) h.get(1))).getDisplayName();
                                        break;
                                    }
                                }
                            }
                            livVar.aj.c(str3, str4);
                        }
                    }
                    livVar.ah.I(3, new acqx(acsb.c(95981)), null);
                    livVar.dismiss();
                    return;
                }
                liv livVar2 = this.a;
                livVar2.ah.I(3, new acqx(acsb.c(95980)), null);
                livVar2.dismiss();
            }
        });
        this.ah.n(new acqx(acsb.c(95981)));
        this.al.setOnCheckedChangeListener(aL());
        this.am.setOnCheckedChangeListener(aL());
        return inflate;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        zz C = C();
        if (C instanceof liu) {
            ((liu) C).b();
        }
    }
}
