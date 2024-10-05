package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abmh implements ajom {
    public ajok a;
    public final aahd b;
    private final ViewGroup c;
    private final Context d;
    private final abjt e;

    public abmh(Context context, aahd aahdVar, abjt abjtVar) {
        this.d = context;
        this.b = aahdVar;
        this.e = abjtVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.live_chat_purchase_menu, (ViewGroup) null);
        this.c = viewGroup;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_creator_support_menu_padding);
        jw.Y(viewGroup, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    private final Button d(apmg apmgVar) {
        int i;
        int a;
        final apxf apxfVar;
        if (apmgVar.c != 1 || (i = anaf.aJ(((Integer) apmgVar.d).intValue())) == 0) {
            i = 1;
        }
        int i2 = i - 1;
        if (i2 != 4) {
            a = i2 != 6 ? R.layout.live_chat_action_button_primary : R.layout.live_chat_action_button_payment;
        } else {
            a = this.e.a(9);
        }
        aqyg aqygVar = null;
        Button button = (Button) LayoutInflater.from(this.d).inflate(a, (ViewGroup) null, false);
        whu.E(button, button.getBackground());
        if (apmgVar.h) {
            button.setEnabled(false);
        } else {
            button.setEnabled(true);
            if ((apmgVar.b & 16384) != 0) {
                apxfVar = apmgVar.o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = null;
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: abmg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abmh abmhVar = abmh.this;
                    apxf apxfVar2 = apxfVar;
                    if (apxfVar2 != null) {
                        abmhVar.b.c(apxfVar2, null);
                        return;
                    }
                    Object c = abmhVar.a.c("listenerKey");
                    if (c instanceof abqe) {
                        ((abqe) c).s();
                    }
                }
            });
        }
        if ((apmgVar.b & 256) != 0 && (aqygVar = apmgVar.i) == null) {
            aqygVar = aqyg.a;
        }
        button.setText(ajcq.b(aqygVar));
        return button;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.removeAllViews();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        asou asouVar;
        asou asouVar2;
        asow asowVar = (asow) obj;
        this.a = ajokVar;
        Resources resources = this.d.getResources();
        for (asov asovVar : asowVar.c) {
            int i = asovVar.b;
            if (i == 65153809) {
                this.c.addView(d((apmg) asovVar.c), -1, resources.getDimensionPixelOffset(R.dimen.live_chat_button_height));
            } else if (i == 138897108) {
                ViewGroup viewGroup = this.c;
                apmh apmhVar = ((asou) asovVar.c).c;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                viewGroup.addView(d(apmgVar), -1, resources.getDimensionPixelOffset(R.dimen.live_chat_button_height));
                if (asovVar.b == 138897108) {
                    asouVar = (asou) asovVar.c;
                } else {
                    asouVar = asou.a;
                }
                if ((asouVar.b & 2) != 0) {
                    if (asovVar.b == 138897108) {
                        asouVar2 = (asou) asovVar.c;
                    } else {
                        asouVar2 = asou.a;
                    }
                    aqyg aqygVar = asouVar2.d;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    Spanned b = ajcq.b(aqygVar);
                    TextView textView = (TextView) LayoutInflater.from(this.d).inflate(this.e.a(8), (ViewGroup) null, false);
                    textView.setText(b);
                    this.c.addView(textView);
                }
            }
        }
        apmh apmhVar2 = asowVar.d;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        if ((apmhVar2.b & 1) != 0) {
            apmh apmhVar3 = asowVar.d;
            if (apmhVar3 == null) {
                apmhVar3 = apmh.a;
            }
            apmg apmgVar2 = apmhVar3.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            this.c.addView(d(apmgVar2), -1, this.d.getResources().getDimensionPixelOffset(R.dimen.live_chat_button_height));
        }
        this.c.setVisibility(0);
    }
}
