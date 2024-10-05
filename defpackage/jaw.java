package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.CloseStreamEndScreenCommandOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jaw implements aaha {
    private final Activity a;
    private final aahd b;
    private final /* synthetic */ int c;

    public jaw(Activity activity, aahd aahdVar, int i) {
        this.c = i;
        this.a = activity;
        this.b = aahdVar;
    }

    public jaw(Activity activity, aahd aahdVar, int i, byte[] bArr) {
        this.c = i;
        this.a = activity;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    private final void b(apcn apcnVar, Map map) {
        if ((apcnVar.b & 4) == 0) {
            whu.K(this.a, R.string.error_generic, 0);
            return;
        }
        aahd aahdVar = this.b;
        apxf apxfVar = apcnVar.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, map);
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqyg aqygVar;
        apmg apmgVar;
        aqyg aqygVar2;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                Intent aC = wbs.aC();
                apcn apcnVar = (apcn) apxfVar.pX(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
                aC.setClassName(apcnVar.c, apcnVar.d);
                for (askp askpVar : apcnVar.e) {
                    aC.putExtra(askpVar.e, askpVar.c == 2 ? (String) askpVar.d : "");
                }
                if (!this.a.getPackageManager().queryIntentActivities(aC, 128).isEmpty()) {
                    try {
                        this.a.startActivity(aC);
                        return;
                    } catch (ActivityNotFoundException unused) {
                        b(apcnVar, map);
                        return;
                    }
                }
                b(apcnVar, map);
                return;
            }
            apwv apwvVar = (apwv) apxfVar.pX(CloseStreamEndScreenCommandOuterClass.closeStreamEndScreenCommand);
            if ((apwvVar.b & 1) != 0) {
                aahd aahdVar = this.b;
                apxf apxfVar2 = apwvVar.c;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar.a(apxfVar2);
            }
            this.a.finish();
            return;
        }
        if (apxfVar.pY(LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.liveChatDialogEndpoint)) {
            LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint = (LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint) apxfVar.pX(LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.liveChatDialogEndpoint);
            asoy asoyVar = liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.b;
            if (asoyVar == null) {
                asoyVar = asoy.a;
            }
            if ((asoyVar.b & 1) != 0) {
                asoy asoyVar2 = liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.b;
                if (asoyVar2 == null) {
                    asoyVar2 = asoy.a;
                }
                aspa aspaVar = asoyVar2.c;
                if (aspaVar == null) {
                    aspaVar = aspa.a;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
                if ((aspaVar.b & 1) != 0) {
                    aqygVar = aspaVar.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                AlertDialog.Builder message = builder.setTitle(ajcq.b(aqygVar)).setMessage(ajcq.k("\n\n", aahk.c((aqyg[]) aspaVar.d.toArray(new aqyg[0]), this.b, true)));
                asoz asozVar = aspaVar.e;
                if (asozVar == null) {
                    asozVar = asoz.a;
                }
                if (asozVar.b != 65153809) {
                    message.setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null);
                } else {
                    asoz asozVar2 = aspaVar.e;
                    if (asozVar2 == null) {
                        asozVar2 = asoz.a;
                    }
                    if (asozVar2.b == 65153809) {
                        apmgVar = (apmg) asozVar2.c;
                    } else {
                        apmgVar = apmg.a;
                    }
                    if ((apmgVar.b & 256) != 0) {
                        aqygVar2 = apmgVar.i;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    message.setPositiveButton(ajcq.b(aqygVar2), (DialogInterface.OnClickListener) null);
                }
                message.create().show();
            }
        }
    }
}
