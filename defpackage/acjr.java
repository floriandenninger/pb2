package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupEventButtonRendererOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acjr extends achm implements View.OnClickListener, acko, abxs, abxu, abxw {
    public abya a;
    public ajoy ae;
    public abrx af;
    public Executor ag;
    ackp ah;
    private ImageButton ai;
    private TextView aj;
    private RecyclerView ak;
    private GridLayoutManager al;
    private ViewGroup am;
    private NetworkOperationView an;
    private atfe ao;
    public acjq b;
    public ajjz c;
    public acfh d;
    public aahd e;

    private final void s() {
        atfe atfeVar = this.ao;
        if (atfeVar == null) {
            return;
        }
        aulq aulqVar = atfeVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = this.ao.c;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
            if ((apmgVar.b & 32) != 0) {
                acfh acfhVar = this.d;
                arfs arfsVar = apmgVar.g;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                int a = acfhVar.a(b);
                if (a != 0) {
                    this.ai.setImageResource(a);
                    this.ai.setOnClickListener(this);
                }
                if ((apmgVar.b & 65536) != 0) {
                    ImageButton imageButton = this.ai;
                    aots aotsVar = apmgVar.r;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                    imageButton.setContentDescription(aotsVar.c);
                }
            }
        }
        atfe atfeVar2 = this.ao;
        if ((atfeVar2.b & 2) != 0) {
            TextView textView = this.aj;
            aqyg aqygVar = atfeVar2.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
        }
        ackp ackpVar = this.ah;
        aony<aulq> aonyVar = this.ao.e;
        ackpVar.a.clear();
        ackpVar.a.l();
        for (aulq aulqVar3 : aonyVar) {
            ateu ateuVar = (ateu) aulqVar3.pX(MobileBroadcastSetupEventButtonRendererOuterClass.mobileBroadcastSetupEventButtonRenderer);
            if (aulqVar3.pY(MobileBroadcastSetupEventButtonRendererOuterClass.mobileBroadcastSetupEventButtonRenderer)) {
                ackpVar.a.add(ateuVar);
            }
            aulq aulqVar4 = ateuVar.h;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            if (aulqVar4.pY(ButtonRendererOuterClass.buttonRenderer)) {
                aulq aulqVar5 = ateuVar.h;
                if (aulqVar5 == null) {
                    aulqVar5 = aulq.a;
                }
                apmg apmgVar2 = (apmg) aulqVar5.pX(ButtonRendererOuterClass.buttonRenderer);
                apxf apxfVar = apmgVar2.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                if (apxfVar.pY(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)) {
                    apxf apxfVar2 = apmgVar2.n;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint = (DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) apxfVar2.pX(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
                    if ((deleteVideoEndpointOuterClass$DeleteVideoEndpoint.b & 1) != 0) {
                        ackpVar.b.put(deleteVideoEndpointOuterClass$DeleteVideoEndpoint.c, ateuVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.abxs
    public final void a(String str) {
        ackp ackpVar = this.ah;
        ateu ateuVar = (ateu) ackpVar.b.get(str);
        if (ateuVar != null) {
            ackpVar.a.remove(ateuVar);
        }
        this.an.a(0);
        if (this.ah.a.size() == 0) {
            q();
        }
    }

    @Override // defpackage.abxs
    public final void b() {
        Toast.makeText(C(), R.string.lc_error_delete_broadcast, 0).show();
    }

    @Override // defpackage.abxu
    public final void c() {
        this.an.a(1);
        this.an.setVisibility(0);
        this.am.setVisibility(8);
    }

    @Override // defpackage.abxu
    public final void d(atfe atfeVar) {
        if (atfeVar != null) {
            this.ao = atfeVar;
            s();
            this.an.a(2);
            this.am.setVisibility(0);
            this.an.setVisibility(8);
            return;
        }
        c();
    }

    @Override // defpackage.abxw
    public final void e() {
        zga.l("Get confirm broadcast for scheduled broadcast failed");
        Toast.makeText(C(), R.string.lc_error_load_scheduled_broadcast, 0).show();
    }

    @Override // defpackage.abxw
    public final void h(arrn arrnVar) {
        atey ateyVar;
        if (acfm.b(this)) {
            arrl arrlVar = arrnVar.c;
            if (arrlVar == null) {
                arrlVar = arrl.a;
            }
            if (arrlVar.b != 126007832) {
                e();
                return;
            }
            acjq acjqVar = this.b;
            arrl arrlVar2 = arrnVar.c;
            if (arrlVar2 == null) {
                arrlVar2 = arrl.a;
            }
            if (arrlVar2.b == 126007832) {
                ateyVar = (atey) arrlVar2.c;
            } else {
                ateyVar = atey.a;
            }
            acjqVar.ad(ateyVar);
            this.an.a(2);
        }
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        atfe atfeVar = this.ao;
        if (atfeVar != null) {
            bundle.putParcelable("STATE_SCHEDULE_SCREEN_RENDERER", new ParcelableMessageLite(atfeVar));
        }
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.ah = new ackp(qR(), this.c, this.d, this.af, this.e, this.ag, this.ae, this);
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        int i = this.an.c;
        if (i == 1) {
            c();
        } else if (i == 2) {
            d(this.ao);
        } else {
            r();
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ParcelableMessageLite parcelableMessageLite;
        super.mg(layoutInflater, viewGroup, bundle);
        if (bundle != null && bundle.containsKey("STATE_SCHEDULE_SCREEN_RENDERER") && (parcelableMessageLite = (ParcelableMessageLite) bundle.getParcelable("STATE_SCHEDULE_SCREEN_RENDERER")) != null) {
            this.ao = (atfe) parcelableMessageLite.a(atfe.a);
        }
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.lc_scheduled_events_fragment, viewGroup, false);
        this.ai = (ImageButton) inflate.findViewById(R.id.close_button);
        this.aj = (TextView) inflate.findViewById(R.id.scheduled_events_title);
        NetworkOperationView networkOperationView = (NetworkOperationView) inflate.findViewById(R.id.scheduled_events_network_operation);
        this.an = networkOperationView;
        final int i2 = 1;
        networkOperationView.b(new View.OnClickListener(this) { // from class: acjo
            public final /* synthetic */ acjr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    this.a.b.ae();
                } else {
                    acjr acjrVar = this.a;
                    acjrVar.a.c(acjrVar);
                }
            }
        });
        this.an.c(new View.OnClickListener(this) { // from class: acjo
            public final /* synthetic */ acjr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    this.a.b.ae();
                } else {
                    acjr acjrVar = this.a;
                    acjrVar.a.c(acjrVar);
                }
            }
        });
        this.ak = (RecyclerView) inflate.findViewById(R.id.scheduled_events);
        this.am = (ViewGroup) inflate.findViewById(R.id.scheduled_events_container);
        this.al = new GridLayoutManager(qX().getInteger(R.integer.lc_scheduled_events_columns), null);
        this.ak.aB(new acjp(this));
        this.ak.af(this.al);
        this.ak.ac(this.ah.c);
        s();
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.ai) {
            q();
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int J2 = this.al.J();
        this.al.q(qX().getInteger(R.integer.lc_scheduled_events_columns));
        this.ak.N();
        this.al.Z(J2);
    }

    @Override // defpackage.acko
    public final Map p() {
        return amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
    }

    public final void q() {
        this.b.ae();
    }

    public final void r() {
        this.an.a(0);
        this.an.setVisibility(0);
        this.am.setVisibility(8);
        this.a.c(this);
    }
}
