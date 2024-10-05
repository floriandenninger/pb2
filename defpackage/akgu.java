package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akgu extends ajpc {
    public final RadioButton a;
    private final View b;
    private final AppCompatImageView c;
    private final ajut d;

    public akgu(Context context, ajut ajutVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.subscription_notification_primary_option, (ViewGroup) null);
        this.b = inflate;
        this.a = (RadioButton) inflate.findViewById(R.id.radio);
        this.c = (AppCompatImageView) inflate.findViewById(R.id.icon);
        this.d = ajutVar;
        inflate.setOnClickListener(new View.OnClickListener() { // from class: akgs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akgu.this.a.toggle();
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.setOnCheckedChangeListener(null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        String str;
        aqyg aqygVar;
        final avai avaiVar = (avai) obj;
        RadioButton radioButton = this.a;
        aott aottVar = avaiVar.i;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        aots aotsVar = aottVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) != 0) {
            aott aottVar2 = avaiVar.i;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar2 = aottVar2.c;
            if (aotsVar2 == null) {
                aotsVar2 = aots.a;
            }
            str = aotsVar2.c;
        } else {
            str = null;
        }
        radioButton.setContentDescription(str);
        RadioButton radioButton2 = this.a;
        if ((avaiVar.b & 1) != 0) {
            aqygVar = avaiVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        radioButton2.setText(ajcq.b(aqygVar));
        final akgr akgrVar = (akgr) ajokVar.c(akgr.o);
        if ((avaiVar.b & 2) == 0) {
            this.c.setVisibility(8);
        } else {
            AppCompatImageView appCompatImageView = this.c;
            ajut ajutVar = this.d;
            arfs arfsVar = avaiVar.d;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            appCompatImageView.setImageResource(ajutVar.a(b));
            jj.h(this.c, wbs.S(this.b.getContext(), true != akgrVar.f(avaiVar) ? R.attr.ytIconInactive : R.attr.ytCallToAction));
            this.c.setVisibility(0);
        }
        this.a.setOnCheckedChangeListener(null);
        this.a.setChecked(akgrVar.f(avaiVar));
        this.a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: akgt
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                akgr.this.c(avaiVar, z);
            }
        });
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avai) obj).h.I();
    }
}
