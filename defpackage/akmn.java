package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akmn implements ajom, ajof {
    private final acra a;
    private final bv b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final ypa f;
    private final ajoi g;
    private akml h;

    public akmn(aahd aahdVar, acra acraVar, bv bvVar, ypa ypaVar) {
        this.a = acraVar;
        this.b = bvVar;
        ypaVar.getClass();
        this.f = ypaVar;
        View inflate = View.inflate(bvVar.C(), R.layout.share_target, null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.icon);
        this.e = (TextView) inflate.findViewById(R.id.label);
        this.g = new ajoi(aahdVar, inflate, this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajof
    public final boolean h(View view) {
        apxf apxfVar;
        this.f.d(new akiy());
        if (this.h != null) {
            aone createBuilder = asht.a.createBuilder();
            aone createBuilder2 = ashy.a.createBuilder();
            akml akmlVar = this.h;
            Object[] objArr = new Object[2];
            objArr[0] = akml.a(akmlVar.d);
            if (akmlVar.e == null && (apxfVar = akmlVar.d) != null && apxfVar.pY(AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
                akmlVar.e = ((apcn) akmlVar.d.pX(AndroidApplicationEndpointOuterClass.androidAppEndpoint)).d;
            }
            objArr[1] = akmlVar.e;
            String format = String.format("%s/%s", objArr);
            createBuilder2.copyOnWrite();
            ashy ashyVar = (ashy) createBuilder2.instance;
            format.getClass();
            ashyVar.b = 1 | ashyVar.b;
            ashyVar.c = format;
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashy ashyVar2 = (ashy) createBuilder2.build();
            ashyVar2.getClass();
            ashtVar.i = ashyVar2;
            ashtVar.b |= 32;
            asht ashtVar2 = (asht) createBuilder.build();
            byte[] bArr = this.h.c;
            if (bArr != null) {
                this.a.I(3, new acqx(bArr), ashtVar2);
            }
        }
        this.b.kv();
        return false;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        akml akmlVar = (akml) obj;
        this.g.a(this.a, akmlVar.d, null);
        byte[] bArr = akmlVar.c;
        if (bArr != null) {
            this.a.u(new acqx(bArr), null);
        }
        this.d.setImageDrawable(akmlVar.a);
        this.e.setText(akmlVar.b);
        this.h = akmlVar;
    }
}
