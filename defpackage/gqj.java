package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreatePlaylistDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqj implements aaha {
    public final zaw a;
    private final aahv b;
    private final Activity c;
    private final afsy d;
    private final aftn e;
    private final glq f;
    private final kwr g;

    public gqj(Activity activity, afsy afsyVar, aftn aftnVar, zaw zawVar, glq glqVar, aahv aahvVar, kwr kwrVar) {
        this.c = activity;
        this.b = aahvVar;
        this.d = afsyVar;
        this.e = aftnVar;
        this.a = zawVar;
        this.f = glqVar;
        this.g = kwrVar;
    }

    public final void b(final List list, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, final ammv ammvVar) {
        aulq aulqVar;
        int i;
        list.getClass();
        if (createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.c == 9) {
            aulqVar = (aulq) createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.d;
        } else {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer)) {
            ci ciVar = this.g.a;
            kwq kwqVar = new kwq();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("SelectedVideoIds", new ArrayList<>(list));
            bundle.putByteArray("CreatePlaylistDialogEndpoint", createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.toByteArray());
            kwqVar.af(bundle);
            kwqVar.qh(ciVar.getSupportFragmentManager(), "CreatePlaylistDialogFragment");
            return;
        }
        final glq glqVar = this.f;
        final String str = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.f;
        final String str2 = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.g;
        str.getClass();
        str2.getClass();
        View inflate = glqVar.a.getLayoutInflater().inflate(R.layout.create_playlist_dialog, (ViewGroup) null, false);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.name_text_input_layout);
        textInputLayout.C(false);
        final EditText editText = (EditText) inflate.findViewById(R.id.name);
        final PrivacySpinner privacySpinner = (PrivacySpinner) inflate.findViewById(R.id.privacy_select);
        privacySpinner.c(3);
        aswb aswbVar = glqVar.f.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.d & 4194304) != 0) {
            i = anaf.bu(aswbVar.V);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 2;
        }
        privacySpinner.e(i);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: glj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                glq glqVar2 = glq.this;
                EditText editText2 = editText;
                PrivacySpinner privacySpinner2 = privacySpinner;
                List list2 = list;
                String str3 = str;
                String str4 = str2;
                ammv ammvVar2 = ammvVar;
                whu.C(editText2);
                if (i2 != -1) {
                    return;
                }
                String trim = editText2.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                int d = privacySpinner2.d();
                abap d2 = glqVar2.b.d();
                d2.e(trim);
                d2.c = d;
                d2.k();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    d2.d((String) it.next());
                }
                if (!TextUtils.isEmpty(str3)) {
                    d2.a = str3;
                }
                if (!TextUtils.isEmpty(str4)) {
                    d2.b = str4;
                }
                glqVar2.b.g(d2, new glp(glqVar2, 1));
                if (ammvVar2.h()) {
                    ((kwx) ((kwb) ammvVar2.c()).a.m).dismiss();
                }
            }
        };
        AlertDialog create = new AlertDialog.Builder(glqVar.a).setTitle(R.string.create_playlist_dialog_title).setView(inflate).setPositiveButton(glqVar.a.getString(R.string.create_button_text), onClickListener).setNegativeButton(glqVar.a.getString(android.R.string.cancel), onClickListener).create();
        privacySpinner.c = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: glm
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                glq glqVar2 = glq.this;
                TextInputLayout textInputLayout2 = textInputLayout;
                EditText editText2 = editText;
                Button button = ((AlertDialog) dialogInterface).getButton(-1);
                gln glnVar = new gln(glqVar2, textInputLayout2, button);
                glqVar2.b(button, false);
                editText2.addTextChangedListener(glnVar);
            }
        });
        Window window = create.getWindow();
        window.getClass();
        window.setSoftInputMode(4);
        create.show();
    }

    public final void c(List list, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, Map map) {
        ammv ammvVar;
        if (map == null || !(map.get("PLAYLIST_CREATION_LISTENER_KEY") instanceof kwb)) {
            ammvVar = amlr.a;
        } else {
            ammvVar = ammv.j((kwb) map.get("PLAYLIST_CREATION_LISTENER_KEY"));
        }
        if (this.d.t()) {
            b(list, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, ammvVar);
        } else {
            this.e.c(this.c, null, new gqi(this, list, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, ammvVar));
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, final Map map) {
        final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint) apxfVar.pX(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint);
        if ((createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.b & 8) == 0) {
            c(createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.e, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
            return;
        }
        final int i = 1;
        ayps o = this.b.a(this.d.c()).f(createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.h).z(ayqr.a()).o(new ayrs(this) { // from class: gqh
            public final /* synthetic */ gqj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    this.a.c(amru.q(), createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
                    return;
                }
                this.a.c(((athw) ((aakt) obj)).getSelectedVideoIds(), createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
            }
        });
        final int i2 = 0;
        o.m(new ayrs(this) { // from class: gqh
            public final /* synthetic */ gqj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    this.a.c(amru.q(), createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
                    return;
                }
                this.a.c(((athw) ((aakt) obj)).getSelectedVideoIds(), createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
            }
        }).l(new ayrm() { // from class: gqg
            @Override // defpackage.ayrm
            public final void a() {
                gqj.this.c(amru.q(), createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
            }
        }).T();
    }
}
