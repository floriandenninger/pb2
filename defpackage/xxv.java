package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePostCommandOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xxv implements View.OnClickListener {
    final /* synthetic */ xxz a;
    private final /* synthetic */ int b;

    public xxv(xxz xxzVar, int i) {
        this.b = i;
        this.a = xxzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim;
        int i = this.b;
        if (i == 0) {
            xzt xztVar = this.a.am;
            if (xztVar != null) {
                xztVar.c();
                return;
            }
            return;
        }
        if (i == 1) {
            xzt xztVar2 = this.a.am;
            if (xztVar2 != null) {
                xztVar2.c();
                return;
            }
            return;
        }
        if (i == 2) {
            xzt xztVar3 = this.a.am;
            if (xztVar3 != null) {
                xztVar3.c();
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4) {
                xzt xztVar4 = this.a.am;
                if (xztVar4 != null) {
                    xztVar4.c();
                    return;
                }
                return;
            }
            xzt xztVar5 = this.a.am;
            if (xztVar5 != null) {
                xztVar5.c();
            }
            Dialog dialog = this.a.d;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            if (this.a.al.getText().toString().trim().length() > 0) {
                new AlertDialog.Builder(this.a.C()).setMessage(R.string.discard_post).setNegativeButton(R.string.comments_discard_negative_button, new hgs(11)).setPositiveButton(R.string.comments_discard_positive_button, new xxy(dialog)).setCancelable(false).create().show();
                return;
            } else {
                dialog.dismiss();
                return;
            }
        }
        xxz xxzVar = this.a;
        if (xxzVar.an) {
            apjm apjmVar = xxzVar.ak;
            if ((apjmVar.b & 512) != 0) {
                aahd aahdVar = xxzVar.ah;
                apxf apxfVar = apjmVar.k;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
                return;
            }
        }
        if (xxzVar.ap != null) {
            xzt xztVar6 = xxzVar.am;
            if (xztVar6 != null) {
                trim = xztVar6.a();
            } else {
                trim = xxzVar.al.getText().toString().trim();
            }
            if (trim.length() > 0) {
                int length = trim.length();
                xxz xxzVar2 = this.a;
                if (length <= xxzVar2.ak.i) {
                    xnh xnhVar = xxzVar2.ap;
                    xnk xnkVar = xnhVar.a;
                    apjm apjmVar2 = xnhVar.b;
                    xnkVar.c.d = trim;
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xnkVar.c);
                    aulq aulqVar = apjmVar2.d;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    apxf apxfVar2 = ((apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer)).n;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aqgw aqgwVar = (aqgw) apxfVar2.pX(CreatePostCommandOuterClass.createPostCommand);
                    arma armaVar = aqgwVar.c;
                    if (armaVar == null) {
                        armaVar = arma.a;
                    }
                    aone builder = armaVar.toBuilder();
                    builder.copyOnWrite();
                    arma armaVar2 = (arma) builder.instance;
                    trim.getClass();
                    armaVar2.b = 4 | armaVar2.b;
                    armaVar2.g = trim;
                    aone builder2 = aqgwVar.toBuilder();
                    builder2.copyOnWrite();
                    aqgw aqgwVar2 = (aqgw) builder2.instance;
                    arma armaVar3 = (arma) builder.build();
                    armaVar3.getClass();
                    aqgwVar2.c = armaVar3;
                    aqgwVar2.b = 1 | aqgwVar2.b;
                    aong aongVar = (aong) apxfVar2.toBuilder();
                    aongVar.e(CreatePostCommandOuterClass.createPostCommand, (aqgw) builder2.build());
                    xnkVar.b.c((apxf) aongVar.build(), hashMap);
                    this.a.d.dismiss();
                }
            }
        }
    }
}
