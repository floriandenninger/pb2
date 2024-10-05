package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqi extends ajpc {
    public apxf a;
    public apxf b;
    private final TextView c;
    private final TextView d;
    private final ajop e;

    public mqi(Context context, final aahd aahdVar, gma gmaVar) {
        aahdVar.getClass();
        this.e = gmaVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.link_sub_menu, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.link_text);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.title_text);
        this.d = textView2;
        gmaVar.c(inflate);
        final int i = 0;
        gmaVar.b(false);
        final int i2 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: mqh
            public final /* synthetic */ mqi a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    mqi mqiVar = this.a;
                    aahd aahdVar2 = aahdVar;
                    apxf apxfVar = mqiVar.a;
                    if (apxfVar != null) {
                        aahdVar2.c(apxfVar, null);
                        return;
                    }
                    return;
                }
                mqi mqiVar2 = this.a;
                aahd aahdVar3 = aahdVar;
                apxf apxfVar2 = mqiVar2.b;
                if (apxfVar2 != null) {
                    aahdVar3.c(apxfVar2, null);
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: mqh
            public final /* synthetic */ mqi a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    mqi mqiVar = this.a;
                    aahd aahdVar2 = aahdVar;
                    apxf apxfVar = mqiVar.a;
                    if (apxfVar != null) {
                        aahdVar2.c(apxfVar, null);
                        return;
                    }
                    return;
                }
                mqi mqiVar2 = this.a;
                aahd aahdVar3 = aahdVar;
                apxf apxfVar2 = mqiVar2.b;
                if (apxfVar2 != null) {
                    aahdVar3.c(apxfVar2, null);
                }
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.e).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apxf apxfVar;
        asnr asnrVar = (asnr) obj;
        TextView textView = this.c;
        apxf apxfVar2 = null;
        if ((asnrVar.b & 4) != 0) {
            aqygVar = asnrVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.d;
        if ((asnrVar.b & 1) != 0) {
            aqygVar2 = asnrVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        if ((asnrVar.b & 8) != 0) {
            apxfVar = asnrVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        this.a = apxfVar;
        if ((asnrVar.b & 2) != 0 && (apxfVar2 = asnrVar.d) == null) {
            apxfVar2 = apxf.a;
        }
        this.b = apxfVar2;
        this.e.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((asnr) obj).g.I();
    }
}
