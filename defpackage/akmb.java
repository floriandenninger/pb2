package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akmb implements View.OnClickListener, ajom {
    private final akma a;
    private final View b;
    private final ImageView c;
    private final TextView d;
    private final ajkj e;
    private final float f;
    private final float g;
    private auru h;

    public akmb(Context context, akma akmaVar, ajjz ajjzVar) {
        this.a = akmaVar;
        View inflate = View.inflate(context, R.layout.share_target_service_update, null);
        this.b = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        this.c = imageView;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = new ajkj(ajjzVar, imageView);
        this.f = inflate.getAlpha();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        this.g = typedValue.getFloat();
        inflate.setOnClickListener(this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.h = null;
        this.c.setImageDrawable(null);
        this.e.a();
        this.d.setText((CharSequence) null);
    }

    public final void d(auru auruVar, CharSequence charSequence, Drawable drawable) {
        if (amkq.b(this.h, auruVar)) {
            this.d.setText(charSequence);
            this.c.setImageDrawable(drawable);
            if (((akiq) this.a).j) {
                this.b.animate().alpha(this.f).start();
            } else {
                this.b.setAlpha(this.g);
            }
        }
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        final auru auruVar = (auru) obj;
        this.h = auruVar;
        this.b.setTag(auruVar);
        this.b.setAlpha(0.0f);
        final akiq akiqVar = (akiq) this.a;
        hx hxVar = (hx) akiqVar.g.get(auruVar);
        if (hxVar != null) {
            d(auruVar, (CharSequence) hxVar.a, (Drawable) hxVar.b);
        } else {
            final ResolveInfo resolveInfo = (ResolveInfo) akiqVar.f.get(auruVar);
            if (resolveInfo == null) {
                this.b.setAlpha(((akiq) this.a).j ? this.f : this.g);
                if ((auruVar.b & 8) != 0) {
                    ajkj ajkjVar = this.e;
                    avgg avggVar = auruVar.e;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    ajkjVar.k(avggVar);
                }
                TextView textView = this.d;
                if ((auruVar.b & 4) != 0) {
                    aqygVar = auruVar.d;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                textView.setText(ajcq.b(aqygVar));
            } else {
                ynm.k(akiqVar.i.submit(new Callable() { // from class: akio
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        akiq akiqVar2 = akiq.this;
                        ResolveInfo resolveInfo2 = resolveInfo;
                        PackageManager packageManager = akiqVar2.a;
                        return new hx(resolveInfo2.loadLabel(packageManager), resolveInfo2.loadIcon(packageManager));
                    }
                }), akiqVar.h, ailg.i, new ynl() { // from class: akin
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj2) {
                        akiq akiqVar2 = akiq.this;
                        auru auruVar2 = auruVar;
                        akmb akmbVar = this;
                        hx hxVar2 = (hx) obj2;
                        akiqVar2.g.put(auruVar2, hxVar2);
                        akmbVar.d(auruVar2, (CharSequence) hxVar2.a, (Drawable) hxVar2.b);
                    }
                });
            }
        }
        ((akiq) this.a).e.u(new acqx(auruVar.g), akiq.k(auruVar));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        akma akmaVar = this.a;
        akiq akiqVar = (akiq) akmaVar;
        if (akiqVar.j) {
            auru auruVar = (auru) view.getTag();
            akiqVar.d.d(new akix());
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", akmaVar);
            hashMap.put("endpoint_resolver_override", akiqVar.b);
            hashMap.put("interaction_logger_override", akiqVar.e);
            hashMap.put("click_tracking_params", auruVar.g.I());
            asht k = akiq.k(auruVar);
            if (k != null) {
                hashMap.put("client_data_override", k);
            }
            aahd aahdVar = akiqVar.b;
            String str = akiqVar.k;
            apxf apxfVar = auruVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aong aongVar = (aong) apxfVar.toBuilder();
            if (aongVar.pY(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)) {
                aone builder = ((SendShareEndpoint$SendShareExternallyEndpoint) aongVar.pX(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).toBuilder();
                SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint) builder.instance;
                if ((sendShareEndpoint$SendShareExternallyEndpoint.b & 1) != 0) {
                    arlh arlhVar = sendShareEndpoint$SendShareExternallyEndpoint.c;
                    if (arlhVar == null) {
                        arlhVar = arlh.a;
                    }
                    aone builder2 = arlhVar.toBuilder();
                    String h = zhq.h(str);
                    builder2.copyOnWrite();
                    arlh arlhVar2 = (arlh) builder2.instance;
                    arlhVar2.b |= 4;
                    arlhVar2.c = h;
                    builder.copyOnWrite();
                    SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint) builder.instance;
                    arlh arlhVar3 = (arlh) builder2.build();
                    arlhVar3.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint2.c = arlhVar3;
                    sendShareEndpoint$SendShareExternallyEndpoint2.b |= 1;
                }
                SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint3 = (SendShareEndpoint$SendShareExternallyEndpoint) builder.instance;
                if ((sendShareEndpoint$SendShareExternallyEndpoint3.b & 2) != 0) {
                    arlf arlfVar = sendShareEndpoint$SendShareExternallyEndpoint3.d;
                    if (arlfVar == null) {
                        arlfVar = arlf.a;
                    }
                    aone builder3 = arlfVar.toBuilder();
                    builder3.copyOnWrite();
                    arlf arlfVar2 = (arlf) builder3.instance;
                    arlfVar2.b |= 2;
                    arlfVar2.d = false;
                    builder.copyOnWrite();
                    SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint4 = (SendShareEndpoint$SendShareExternallyEndpoint) builder.instance;
                    arlf arlfVar3 = (arlf) builder3.build();
                    arlfVar3.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint4.d = arlfVar3;
                    sendShareEndpoint$SendShareExternallyEndpoint4.b |= 2;
                }
                aongVar.e(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint, (SendShareEndpoint$SendShareExternallyEndpoint) builder.build());
            }
            aahdVar.c((apxf) aongVar.build(), hashMap);
            akiqVar.c.b(true);
        }
    }
}
