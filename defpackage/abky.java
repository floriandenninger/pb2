package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abky implements ajom {
    protected final Context a;
    protected final View b;
    public final aahd c;
    final abij d;
    private final ajvb e;

    public abky(Context context, aahd aahdVar, azrw azrwVar, ajvb ajvbVar) {
        this.a = context;
        this.b = View.inflate(context, R.layout.live_chat_light_auto_mod_item, null);
        this.e = ajvbVar;
        this.c = aahdVar;
        this.d = new abkv(azrwVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        d().removeAllViews();
        e().removeAllViews();
    }

    protected final ViewGroup d() {
        return (ViewGroup) this.b.findViewById(R.id.auto_moderated_item);
    }

    protected final ViewGroup e() {
        return (ViewGroup) this.b.findViewById(R.id.auto_mod_buttons);
    }

    protected final TextView f() {
        return (TextView) this.b.findViewById(R.id.header_text);
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aulq aulqVar;
        aulq aulqVar2;
        final aspj aspjVar = (aspj) obj;
        TextView f = f();
        if ((aspjVar.b & 16) != 0) {
            aqygVar = aspjVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        f.setText(ajcq.b(aqygVar));
        aulq aulqVar3 = aspjVar.f;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: abkx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abky abkyVar = abky.this;
                    aulq aulqVar4 = aspjVar.f;
                    if (aulqVar4 == null) {
                        aulqVar4 = aulq.a;
                    }
                    apxf apxfVar = ((apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer)).o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    abkyVar.c.c(apxfVar, null);
                }
            };
            f().setOnClickListener(onClickListener);
            View findViewById = this.b.findViewById(R.id.warning_icon);
            if (findViewById != null) {
                findViewById.setOnClickListener(onClickListener);
            }
        }
        int i = aspjVar.b & 8;
        if (i != 0) {
            ajos ajosVar = ((abmv) this.e).a;
            if (i != 0) {
                aulqVar = aspjVar.d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
            } else {
                aulqVar = null;
            }
            int c = ajosVar.c(ahbj.m(aulqVar));
            ajokVar.f("is-auto-mod-message", true);
            ajom e = ((abmv) this.e).a.e(c, d());
            if ((aspjVar.b & 8) != 0) {
                aulqVar2 = aspjVar.d;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
            } else {
                aulqVar2 = null;
            }
            e.oB(ajokVar, ahbj.m(aulqVar2));
            d().addView(e.a());
        }
        ViewGroup e2 = e();
        e2.removeAllViews();
        Iterator it = aspjVar.g.iterator();
        while (it.hasNext()) {
            final apmg apmgVar = (apmg) ((aulq) it.next()).pX(ButtonRendererOuterClass.buttonRenderer);
            if (apmgVar.c == 1) {
                ((Integer) apmgVar.d).intValue();
            }
            Button button = (Button) LayoutInflater.from(this.a).inflate(R.layout.live_chat_auto_mod_button_grey_light, (ViewGroup) null, false);
            if (apmgVar.h) {
                button.setEnabled(false);
            } else {
                button.setEnabled(true);
                if ((apmgVar.b & 8192) != 0) {
                    button.setOnClickListener(new View.OnClickListener() { // from class: abkw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            abky abkyVar = abky.this;
                            apxf apxfVar = apmgVar.n;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", abkyVar.d);
                            abkyVar.c.c(apxfVar, hashMap);
                        }
                    });
                }
            }
            aqyg aqygVar2 = apmgVar.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            button.setText(ajcq.b(aqygVar2));
            e2.addView(button);
        }
    }
}
