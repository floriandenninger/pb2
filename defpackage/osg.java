package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class osg extends ajpc {
    public final eoa a;
    public awbq b;
    public int c;
    private final aahd d;
    private final acra e;
    private final Context f;
    private final View g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;

    public osg(aahd aahdVar, acra acraVar, Context context, eoa eoaVar, ViewGroup viewGroup) {
        this.d = aahdVar;
        this.e = acraVar;
        this.a = eoaVar;
        this.f = context;
        LayoutInflater from = LayoutInflater.from(context);
        final int i = 0;
        View inflate = from.inflate(R.layout.watch_break, viewGroup, false);
        this.g = inflate;
        this.h = (TextView) inflate.findViewById(R.id.heading);
        this.i = (TextView) inflate.findViewById(R.id.notice);
        TextView textView = (TextView) inflate.findViewById(R.id.primary_button);
        this.j = textView;
        final int i2 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: osf
            public final /* synthetic */ osg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    osg osgVar = this.a;
                    int i3 = osgVar.c;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == 3) {
                        osgVar.a.e(apkz.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
                    }
                    awbq awbqVar = osgVar.b;
                    if (awbqVar != null) {
                        aulq aulqVar = awbqVar.e;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        osgVar.f(aulqVar);
                        return;
                    }
                    return;
                }
                osg osgVar2 = this.a;
                awbq awbqVar2 = osgVar2.b;
                if (awbqVar2 != null) {
                    aulq aulqVar2 = awbqVar2.f;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    osgVar2.f(aulqVar2);
                }
                int i4 = osgVar2.c;
                if (i4 == 0) {
                    throw null;
                }
                if (i4 == 3) {
                    osgVar2.a.c(apkz.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
                }
            }
        });
        TextView textView2 = (TextView) inflate.findViewById(R.id.secondary_button);
        this.k = textView2;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: osf
            public final /* synthetic */ osg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    osg osgVar = this.a;
                    int i3 = osgVar.c;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == 3) {
                        osgVar.a.e(apkz.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
                    }
                    awbq awbqVar = osgVar.b;
                    if (awbqVar != null) {
                        aulq aulqVar = awbqVar.e;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        osgVar.f(aulqVar);
                        return;
                    }
                    return;
                }
                osg osgVar2 = this.a;
                awbq awbqVar2 = osgVar2.b;
                if (awbqVar2 != null) {
                    aulq aulqVar2 = awbqVar2.f;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    osgVar2.f(aulqVar2);
                }
                int i4 = osgVar2.c;
                if (i4 == 0) {
                    throw null;
                }
                if (i4 == 3) {
                    osgVar2.a.c(apkz.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
                }
            }
        });
        this.l = (ImageView) inflate.findViewById(R.id.reminder_icon);
        this.c = 1;
    }

    private static void g(TextView textView, aulq aulqVar) {
        aqyg aqygVar;
        if (!aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            textView.setVisibility(8);
            return;
        }
        apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        if ((apmgVar.b & 256) != 0) {
            aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        awbq awbqVar = (awbq) obj;
        this.b = awbqVar;
        if ((awbqVar.b & 16) != 0) {
            int T = awxr.T(awbqVar.g);
            if (T == 0) {
                T = 1;
            }
            this.c = T;
        }
        TextView textView = this.h;
        aqyg aqygVar = this.b.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.i;
        aqyg aqygVar2 = this.b.d;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, aahk.a(aqygVar2, this.d, false));
        TextView textView3 = this.j;
        aulq aulqVar = this.b.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        g(textView3, aulqVar);
        TextView textView4 = this.k;
        aulq aulqVar2 = this.b.f;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        g(textView4, aulqVar2);
        TextView textView5 = this.j;
        whu.E(textView5, textView5.getBackground());
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            this.l.setImageDrawable(wbs.T(this.f, R.attr.bedtimeSlothIcon));
        } else {
            this.l.setImageDrawable(wbs.T(this.f, R.attr.takeABreakIcon));
        }
        int i2 = this.c;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 3) {
            this.a.d(apkz.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awbq) obj).h.I();
    }

    public final void f(aulq aulqVar) {
        apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        if ((apmgVar.b & 32768) != 0) {
            aahd aahdVar = this.d;
            apxf apxfVar = apmgVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
            this.e.I(3, new acqx(apmgVar.t), null);
        }
    }
}
