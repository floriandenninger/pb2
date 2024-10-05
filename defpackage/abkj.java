package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abkj implements afwx {
    final /* synthetic */ abkk a;

    public abkj(abkk abkkVar) {
        this.a = abkkVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.dismiss();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        atdc atdcVar;
        atdc atdcVar2;
        artz artzVar = (artz) obj;
        arua aruaVar = artzVar.c;
        if (aruaVar == null) {
            aruaVar = arua.a;
        }
        if (aruaVar.b == 66439850) {
            atdcVar = (atdc) aruaVar.c;
        } else {
            atdcVar = atdc.a;
        }
        if (atdcVar.c.size() != 0) {
            final abkk abkkVar = this.a;
            arua aruaVar2 = artzVar.c;
            if (aruaVar2 == null) {
                aruaVar2 = arua.a;
            }
            if (aruaVar2.b == 66439850) {
                atdcVar2 = (atdc) aruaVar2.c;
            } else {
                atdcVar2 = atdc.a;
            }
            abkkVar.ah.setVisibility(8);
            abkkVar.ai.setVisibility(0);
            abkkVar.ai.removeAllViews();
            LayoutInflater layoutInflater = abkkVar.af.getLayoutInflater();
            for (final atda atdaVar : atdcVar2.c) {
                TextView textView = (TextView) layoutInflater.inflate(R.layout.live_chat_item_context_menu_item, (ViewGroup) abkkVar.ai, false);
                textView.setText(adyu.m0do(atdaVar));
                if (adyu.dk(atdaVar) == null && adyu.dl(atdaVar) == null) {
                    atde atdeVar = atdaVar.d;
                    if (atdeVar == null) {
                        atdeVar = atde.a;
                    }
                    if ((atdeVar.b & 16) == 0) {
                        abkkVar.ai.addView(textView);
                    }
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: abki
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abkk abkkVar2 = abkk.this;
                        atda atdaVar2 = atdaVar;
                        abqb abqbVar = abkkVar2.ag;
                        if (abqbVar != null) {
                            abqbVar.i(atdaVar2);
                        }
                        abkkVar2.dismiss();
                    }
                });
                abkkVar.ai.addView(textView);
            }
            return;
        }
        this.a.dismiss();
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
