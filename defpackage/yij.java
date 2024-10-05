package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yij extends yie {
    public acqz ae;
    public aarr af;
    public ajyw ag;
    private Context ah;
    private asfw ai;

    @Override // defpackage.yie, defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        this.ah = context;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (this.m.containsKey("transaction_response")) {
            this.ai = (asfw) this.af.a(this.m.getByteArray("transaction_response"), asfw.a);
        }
        o(0, R.style.Sponsorships_FullScreen);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sponsorships_celebration_dialog_layout, viewGroup, false);
        if (inflate.getLayoutParams() == null) {
            inflate.setLayoutParams(new we(-1, -1));
        }
        ((ImageView) inflate.findViewById(R.id.close_button)).setOnClickListener(new View.OnClickListener() { // from class: yih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yij.this.dismiss();
            }
        });
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.celebration_view);
        auwv h = wcy.h(this.ai);
        if (h != null) {
            ajyw ajywVar = this.ag;
            Context context = this.ah;
            yii yiiVar = new yii(this);
            ajyg ajygVar = (ajyg) ajywVar.a.get();
            ajygVar.getClass();
            aahd aahdVar = (aahd) ajywVar.c.get();
            aahdVar.getClass();
            ajjz ajjzVar = (ajjz) ajywVar.b.get();
            ajjzVar.getClass();
            context.getClass();
            frameLayout.getClass();
            yim yimVar = new yim(ajygVar, aahdVar, ajjzVar, context, yiiVar, frameLayout);
            frameLayout.addView(yimVar.a);
            ajok ajokVar = new ajok();
            ajokVar.a(this.ae.mM());
            yimVar.oB(ajokVar, h);
        }
        return inflate;
    }
}
