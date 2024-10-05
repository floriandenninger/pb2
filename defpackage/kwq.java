package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePlaylistDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.DropdownRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kwq extends kws {
    public aahd ae;
    public ajyg af;
    public abav ag;
    public zaw ah;
    public ypa ai;
    public CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint aj;
    public List ak;
    public aqgv al;
    public EditText am;
    public ajyf an;
    public kvw ao;
    public c ap;
    public ajoy aq;
    private View ar;

    public static boolean aF(aqgv aqgvVar) {
        aulq aulqVar = aqgvVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return aulqVar.pY(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        amru q;
        CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        aulq aulqVar;
        aulq aulqVar2;
        super.mR(bundle);
        o(0, 0);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("SelectedVideoIds")) {
            q = amru.q();
        } else {
            q = amru.o(bundle2.getStringArrayList("SelectedVideoIds"));
        }
        this.ak = q;
        if (bundle2 == null || !bundle2.containsKey("CreatePlaylistDialogEndpoint")) {
            createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a;
        } else {
            byte[] byteArray = bundle2.getByteArray("CreatePlaylistDialogEndpoint");
            if (byteArray != null) {
                try {
                    createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint) aonm.parseFrom(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a, byteArray, aomw.b());
                } catch (aoob e) {
                    zga.d("Unable to decode create playlist endpoint", e);
                }
            }
            createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a;
        }
        this.aj = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        if (createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.c == 9) {
            aulqVar = (aulq) createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.d;
        } else {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer)) {
            CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint2 = this.aj;
            if (createPlaylistEndpointOuterClass$CreatePlaylistEndpoint2.c == 9) {
                aulqVar2 = (aulq) createPlaylistEndpointOuterClass$CreatePlaylistEndpoint2.d;
            } else {
                aulqVar2 = aulq.a;
            }
            this.al = (aqgv) aulqVar2.pX(CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer);
            return;
        }
        this.al = aqgv.a;
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.create_playlist_dialog, viewGroup, false);
        this.ar = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_title);
        aqyg aqygVar = this.al.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextInputLayout textInputLayout = (TextInputLayout) this.ar.findViewById(R.id.name_text_input_layout);
        textInputLayout.C(false);
        EditText editText = (EditText) this.ar.findViewById(R.id.name);
        this.am = editText;
        editText.setHint(this.al.c);
        this.am.addTextChangedListener(new kwo(this, textInputLayout));
        PrivacySpinner privacySpinner = (PrivacySpinner) this.ar.findViewById(R.id.privacy_select);
        this.ao = this.ap.h(privacySpinner);
        gaf J2 = this.aq.J(qR(), (ViewStub) this.ar.findViewById(R.id.privacy_badge));
        final int i2 = 1;
        if (aF(this.al)) {
            aulq aulqVar = this.al.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            J2.f((atdu) aulqVar.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
            this.ar.findViewById(R.id.privacy_dropdown_container).setVisibility(8);
        } else {
            aulq aulqVar2 = this.al.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            if (aulqVar2.pY(DropdownRendererOuterClass.dropdownRenderer)) {
                kvw kvwVar = this.ao;
                aulq aulqVar3 = this.al.d;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                kvwVar.a((aqph) aulqVar3.pX(DropdownRendererOuterClass.dropdownRenderer));
                this.ao.c = new kwn(this);
            } else {
                this.ao.a(null);
                this.ao.c(1);
            }
            privacySpinner.c = this.d;
            this.ar.findViewById(R.id.privacy_dropdown_container).setVisibility(0);
            J2.f(null);
        }
        ajyf a = this.af.a((TextView) this.ar.findViewById(R.id.cancel_button));
        aulq aulqVar4 = this.al.f;
        if (aulqVar4 == null) {
            aulqVar4 = aulq.a;
        }
        a.b((apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer), null);
        a.c = new ajyc(this) { // from class: kwm
            public final /* synthetic */ kwq a;

            {
                this.a = this;
            }

            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i2 == 0) {
                    kwq kwqVar = this.a;
                    whu.C(kwqVar.am);
                    String trim = kwqVar.am.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        abap d = kwqVar.ag.d();
                        d.k();
                        d.e(trim);
                        if (kwq.aF(kwqVar.al)) {
                            int bu = anaf.bu(kwqVar.al.e);
                            if (bu == 0) {
                                bu = 1;
                            }
                            d.c = bu;
                        } else {
                            d.c = kwqVar.ao.b();
                        }
                        Iterator it = kwqVar.ak.iterator();
                        while (it.hasNext()) {
                            d.d((String) it.next());
                        }
                        if (!kwqVar.aj.f.isEmpty()) {
                            d.a = kwqVar.aj.f;
                        }
                        if (!TextUtils.isEmpty(kwqVar.aj.g)) {
                            d.b = kwqVar.aj.g;
                        }
                        kwqVar.ag.g(d, new kwp(kwqVar));
                    }
                    if ((kwqVar.aj.b & 8) != 0) {
                        kwqVar.ai.d(new kwj());
                    }
                    kwqVar.dismiss();
                    return;
                }
                kwq kwqVar2 = this.a;
                whu.C(kwqVar2.am);
                kwqVar2.dismiss();
            }
        };
        ajyf a2 = this.af.a((TextView) this.ar.findViewById(R.id.create_button));
        this.an = a2;
        aulq aulqVar5 = this.al.g;
        if (aulqVar5 == null) {
            aulqVar5 = aulq.a;
        }
        a2.b((apmg) aulqVar5.pX(ButtonRendererOuterClass.buttonRenderer), null);
        this.an.d(false);
        this.an.c = new ajyc(this) { // from class: kwm
            public final /* synthetic */ kwq a;

            {
                this.a = this;
            }

            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i == 0) {
                    kwq kwqVar = this.a;
                    whu.C(kwqVar.am);
                    String trim = kwqVar.am.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        abap d = kwqVar.ag.d();
                        d.k();
                        d.e(trim);
                        if (kwq.aF(kwqVar.al)) {
                            int bu = anaf.bu(kwqVar.al.e);
                            if (bu == 0) {
                                bu = 1;
                            }
                            d.c = bu;
                        } else {
                            d.c = kwqVar.ao.b();
                        }
                        Iterator it = kwqVar.ak.iterator();
                        while (it.hasNext()) {
                            d.d((String) it.next());
                        }
                        if (!kwqVar.aj.f.isEmpty()) {
                            d.a = kwqVar.aj.f;
                        }
                        if (!TextUtils.isEmpty(kwqVar.aj.g)) {
                            d.b = kwqVar.aj.g;
                        }
                        kwqVar.ag.g(d, new kwp(kwqVar));
                    }
                    if ((kwqVar.aj.b & 8) != 0) {
                        kwqVar.ai.d(new kwj());
                    }
                    kwqVar.dismiss();
                    return;
                }
                kwq kwqVar2 = this.a;
                whu.C(kwqVar2.am);
                kwqVar2.dismiss();
            }
        };
        this.ar.findViewById(R.id.cancel_and_create_button).setVisibility(0);
        return this.ar;
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        oq.getWindow().setSoftInputMode(4);
        return oq;
    }
}
