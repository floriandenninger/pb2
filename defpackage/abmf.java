package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abmf implements ajom {
    protected final View a;
    protected final Resources b;
    private final Context c;
    private final ajut d;
    private final TextView e;
    private final ImageView f;
    private final TextView g;
    private View.OnClickListener h;
    private final advq i;

    public abmf(Context context, ajut ajutVar, advq advqVar, byte[] bArr) {
        this.c = context;
        ajutVar.getClass();
        this.d = ajutVar;
        this.i = advqVar;
        this.b = context.getResources();
        View inflate = View.inflate(context, d(), null);
        this.a = inflate;
        this.e = (TextView) inflate.findViewById(R.id.live_chat_vem_text);
        this.f = (ImageView) inflate.findViewById(R.id.live_chat_vem_icon);
        this.g = (TextView) inflate.findViewById(R.id.live_chat_vem_button);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.e.setPadding(0, 0, 0, 0);
    }

    public abstract int d();

    public abstract aahd e();

    public abstract Map f();

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        final aspt asptVar = (aspt) obj;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: abmd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abmf abmfVar = abmf.this;
                aspt asptVar2 = asptVar;
                if ((asptVar2.b & 64) != 0) {
                    aahd e = abmfVar.e();
                    apxf apxfVar = asptVar2.h;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    e.c(apxfVar, null);
                }
            }
        };
        this.h = onClickListener;
        this.a.setOnClickListener(onClickListener);
        if ((asptVar.b & 16) != 0) {
            aqyg aqygVar = asptVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            this.e.setText(aahk.a(aqygVar, new aahd() { // from class: abme
                @Override // defpackage.aahd
                public final /* synthetic */ void a(apxf apxfVar) {
                    aahc.a(this, apxfVar);
                }

                @Override // defpackage.aahd
                public final /* synthetic */ void b(List list) {
                    aahc.b(this, list);
                }

                @Override // defpackage.aahd
                public final void c(apxf apxfVar, Map map) {
                    abmf abmfVar = abmf.this;
                    abmfVar.e().c(apxfVar, abmfVar.f());
                }

                @Override // defpackage.aahd
                public final /* synthetic */ void d(List list, Map map) {
                    aahc.c(this, list, map);
                }

                @Override // defpackage.aahd
                public final /* synthetic */ void e(List list, Object obj2) {
                    aahc.d(this, list, obj2);
                }
            }, false));
            this.e.setVisibility(0);
            this.e.setOnClickListener(this.h);
            this.e.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if ((asptVar.b & 32) != 0) {
            aulq aulqVar = asptVar.g;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if ((((apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer)).b & 256) != 0) {
                abhb b = this.i.b(this.g);
                aulq aulqVar2 = asptVar.g;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                b.oB(ajokVar, (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer));
            }
        } else {
            this.e.setPadding(0, 0, 0, this.b.getDimensionPixelOffset(R.dimen.live_chat_vem_content_margin_bottom));
        }
        if (asptVar.c == 3) {
            arfr b2 = arfr.b(((arfs) asptVar.d).c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            if (b2 != arfr.UNKNOWN) {
                ajut ajutVar = this.d;
                arfr b3 = arfr.b((asptVar.c == 3 ? (arfs) asptVar.d : arfs.a).c);
                if (b3 == null) {
                    b3 = arfr.UNKNOWN;
                }
                if (ajutVar.a(b3) != 0) {
                    this.f.setVisibility(0);
                    Context context = this.c;
                    ajut ajutVar2 = this.d;
                    arfr b4 = arfr.b((asptVar.c == 3 ? (arfs) asptVar.d : arfs.a).c);
                    if (b4 == null) {
                        b4 = arfr.UNKNOWN;
                    }
                    Drawable a = aii.a(context, ajutVar2.a(b4));
                    if (a != null) {
                        arfr b5 = arfr.b((asptVar.c == 3 ? (arfs) asptVar.d : arfs.a).c);
                        if (b5 == null) {
                            b5 = arfr.UNKNOWN;
                        }
                        if (b5 == arfr.POLL) {
                            Drawable c = gl.c(a);
                            c.mutate();
                            c.setTint(wbs.Q(this.c, R.attr.ytBrandRed));
                            this.f.setImageDrawable(c);
                            return;
                        }
                    }
                    this.f.setImageDrawable(a);
                }
            }
        }
    }
}
