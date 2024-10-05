package defpackage;

import android.content.DialogInterface;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UnpluggedPauseMembershipDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yeh implements aaha {
    private final acqz a;
    private final ydb b;

    public yeh(acqz acqzVar, ydb ydbVar) {
        this.a = acqzVar;
        this.b = ydbVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        apmg apmgVar;
        apmg apmgVar2;
        aulq aulqVar = ((YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand) apxfVar.pX(YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.ypcPauseMembershipDialogCommand)).b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        avqh avqhVar = (avqh) aulqVar.pX(UnpluggedPauseMembershipDialogRendererOuterClass.unpluggedPauseMembershipDialogRenderer);
        ajok ajokVar = new ajok();
        ajokVar.a(this.a.mM());
        final ydb ydbVar = this.b;
        ydbVar.j = avqhVar;
        ydbVar.i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ycw
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ydb ydbVar2 = ydb.this;
                if (ydbVar2.j.i.size() > 0) {
                    ydbVar2.a.d(ydbVar2.j.i, null);
                }
            }
        });
        ydbVar.i.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ycv
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ydb ydbVar2 = ydb.this;
                if (ydbVar2.j.j.size() > 0) {
                    ydbVar2.a.d(ydbVar2.j.j, null);
                }
            }
        });
        TextView textView = ydbVar.c;
        aqyg aqygVar = ydbVar.j.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        Spanned[] n = ajcq.n(ydbVar.j.c);
        whu.G(ydbVar.d, ydb.a(n, 0));
        whu.G(ydbVar.e, ydb.a(n, 1));
        ydbVar.f.setMax(ydbVar.j.d.size() - 1);
        ydbVar.f.setOnSeekBarChangeListener(new yda(ydbVar));
        int i = ydbVar.j.e;
        ydbVar.k = i;
        ydbVar.f.setProgress(i);
        ydbVar.b();
        final acra acraVar = ajokVar.a;
        ajyf ajyfVar = ydbVar.g;
        apmh apmhVar = ydbVar.j.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = ydbVar.j.f;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        ajyfVar.b(apmgVar, acraVar);
        ydbVar.g.c = new ajyc() { // from class: ycy
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                ydb.this.i.dismiss();
            }
        };
        ajyf ajyfVar2 = ydbVar.h;
        apmh apmhVar3 = ydbVar.j.g;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        if ((apmhVar3.b & 1) != 0) {
            apmh apmhVar4 = ydbVar.j.g;
            if (apmhVar4 == null) {
                apmhVar4 = apmh.a;
            }
            apmgVar2 = apmhVar4.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
        } else {
            apmgVar2 = null;
        }
        ajyfVar2.b(apmgVar2, acraVar);
        ydbVar.h.c = new ajyc() { // from class: ycz
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                ydb ydbVar2 = ydb.this;
                acraVar.I(3, new acqx(((apmg) aongVar.instance).t), null);
                ydbVar2.i.cancel();
            }
        };
        ydbVar.g.d = new ajyb() { // from class: ycx
            @Override // defpackage.ajyb
            public final Map a() {
                ydb ydbVar2 = ydb.this;
                HashMap hashMap = new HashMap();
                avqh avqhVar2 = ydbVar2.j;
                hashMap.put("pause_subscription_resume_time_ms_key", Long.valueOf(((avqg) avqhVar2.d.get(ydbVar2.k)).e));
                return hashMap;
            }
        };
        acraVar.u(new acqx(avqhVar.h), null);
        View findViewById = ydbVar.b.findViewById(R.id.scroll_body);
        double d = ydbVar.i.getContext().getResources().getDisplayMetrics().heightPixels;
        Double.isNaN(d);
        int i2 = (int) (d * 0.5d);
        findViewById.getLayoutParams().height = -2;
        if (findViewById.getMeasuredHeight() > i2) {
            findViewById.getLayoutParams().height = i2;
        }
        ydbVar.i.show();
    }
}
