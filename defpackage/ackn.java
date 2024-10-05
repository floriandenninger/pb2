package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ackn implements View.OnClickListener, ajom {
    public final ajjz a;
    public final abrx b;
    public final Handler c;
    private final Context d;
    private final ajut e;
    private final aahd f;
    private final Executor g;
    private final acko h;
    private final View i;
    private final View j;
    private final ImageButton k;

    public ackn(Context context, ajjz ajjzVar, ajut ajutVar, abrx abrxVar, aahd aahdVar, Executor executor, acko ackoVar) {
        this.d = context;
        this.c = new Handler(context.getMainLooper());
        this.a = ajjzVar;
        this.e = ajutVar;
        this.b = abrxVar;
        this.f = aahdVar;
        this.g = executor;
        this.h = ackoVar;
        View inflate = View.inflate(context, R.layout.lc_scheduled_stream_item, null);
        this.i = inflate;
        this.k = (ImageButton) inflate.findViewById(R.id.event_delete);
        this.j = inflate.findViewById(R.id.event_overlay);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        final ateu ateuVar = (ateu) obj;
        if ((ateuVar.b & 1) != 0) {
            TextView textView = (TextView) this.i.findViewById(R.id.title);
            aqyg aqygVar = ateuVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
        }
        TextView textView2 = (TextView) this.i.findViewById(R.id.date);
        if ((ateuVar.b & 2) != 0) {
            aqyg aqygVar2 = ateuVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            textView2.setText(ajcq.b(aqygVar2));
        }
        if ((ateuVar.b & 8) != 0) {
            arfs arfsVar = ateuVar.e;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            int a = this.e.a(b);
            if (a != 0) {
                Resources resources = this.d.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lc_scheduled_event_date_drawable_dimensions);
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(new BitmapDrawable(resources, Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, a), dimensionPixelSize, dimensionPixelSize, true)), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        final ImageView imageView = (ImageView) this.i.findViewById(R.id.event_thumbnail);
        if ((ateuVar.b & 16) != 0) {
            avgg avggVar = ateuVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            final Uri aj = wbs.aj(ahbw.F(avggVar).c);
            this.g.execute(new Runnable() { // from class: ackj
                @Override // java.lang.Runnable
                public final void run() {
                    ackn acknVar = ackn.this;
                    ateu ateuVar2 = ateuVar;
                    Uri uri = aj;
                    ImageView imageView2 = imageView;
                    abrx abrxVar = acknVar.b;
                    aulq aulqVar = ateuVar2.h;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    String str = null;
                    if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar2 = ateuVar2.h;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                        apxf apxfVar = apmgVar.n;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        if (apxfVar.pY(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)) {
                            apxf apxfVar2 = apmgVar.n;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint = (DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) apxfVar2.pX(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
                            if ((deleteVideoEndpointOuterClass$DeleteVideoEndpoint.b & 1) != 0) {
                                str = deleteVideoEndpointOuterClass$DeleteVideoEndpoint.c;
                            }
                        }
                    }
                    abrxVar.d(str, acknVar.a, uri, abvp.a, new ackl(acknVar, imageView2));
                }
            });
        }
        if ((ateuVar.b & 32) != 0) {
            this.j.setOnClickListener(this);
            View view = this.j;
            apxf apxfVar = ateuVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            view.setTag(apxfVar);
        }
        aulq aulqVar = ateuVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = ateuVar.h;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
            if ((apmgVar.b & 65536) != 0) {
                ImageButton imageButton = this.k;
                aots aotsVar = apmgVar.r;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                imageButton.setContentDescription(aotsVar.c);
            }
            if ((apmgVar.b & 32) != 0) {
                ajut ajutVar = this.e;
                arfs arfsVar2 = apmgVar.g;
                if (arfsVar2 == null) {
                    arfsVar2 = arfs.a;
                }
                arfr b2 = arfr.b(arfsVar2.c);
                if (b2 == null) {
                    b2 = arfr.UNKNOWN;
                }
                int a2 = ajutVar.a(b2);
                if (a2 != 0) {
                    this.k.setImageDrawable(aii.a(this.d, a2));
                }
            }
            this.k.setTag(apmgVar);
            this.k.setOnClickListener(this);
        }
        int i = ateuVar.b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar;
        if (view != this.j || !(view.getTag() instanceof apxf)) {
            if (view == this.k && (view.getTag() instanceof apmg)) {
                apmg apmgVar = (apmg) view.getTag();
                aahd aahdVar = this.f;
                if ((apmgVar.b & 16384) != 0) {
                    apxfVar = apmgVar.o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    apxfVar = apmgVar.n;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                }
                aahdVar.c(apxfVar, this.h.p());
                return;
            }
            return;
        }
        this.f.c((apxf) view.getTag(), this.h.p());
    }
}
