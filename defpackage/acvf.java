package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acvf extends BroadcastReceiver {
    final /* synthetic */ acvg a;

    public acvf(acvg acvgVar) {
        this.a = acvgVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        acuq acuqVar = this.a.d;
        if (acuqVar == null) {
            zga.m(acvg.a, "no action listener set, ignoring action");
            return;
        }
        InteractionLoggingScreen interactionLoggingScreen = (InteractionLoggingScreen) intent.getParcelableExtra("INTERACTION_SCREEN");
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        if (valueOf.length() != 0) {
            "action: ".concat(valueOf);
        }
        switch (action.hashCode()) {
            case -670475291:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 685086653:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1446453054:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1545822060:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            acve acveVar = this.a.c;
            if (interactionLoggingScreen == null || ((acqq) acveVar.g).g == null) {
                zga.m(acve.a, "Interaction logging screen is not set");
            }
            acveVar.g.B(interactionLoggingScreen);
            acveVar.g.I(3, new acqx(acve.f), null);
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            String str = acuu.a;
            acuqVar.a.i.setFlags(268435456);
            acuu acuuVar = acuqVar.a;
            acuuVar.b.startActivity(acuuVar.i);
            return;
        }
        if (c == 1) {
            acve acveVar2 = this.a.c;
            if (interactionLoggingScreen == null || ((acqq) acveVar2.g).g == null) {
                zga.m(acve.a, "Interaction logging screen is not set");
            }
            acveVar2.g.B(interactionLoggingScreen);
            acveVar2.g.I(3, new acqx(acve.e), null);
            acvd acvdVar = this.a.b;
            acvdVar.getClass();
            String str2 = acuu.a;
            acuqVar.a.f(acvdVar, true);
            return;
        }
        if (c != 2) {
            if (c == 3) {
                String str3 = acuu.a;
                acuqVar.a.b();
                acuqVar.a.g.a();
                this.a.e();
                return;
            }
            String str4 = acvg.a;
            String valueOf2 = String.valueOf(action);
            zga.m(str4, valueOf2.length() != 0 ? "Unknown action:".concat(valueOf2) : new String("Unknown action:"));
            return;
        }
        acve acveVar3 = this.a.c;
        if (interactionLoggingScreen == null || ((acqq) acveVar3.g).g == null) {
            zga.m(acve.a, "Interaction logging screen is not set");
        }
        acveVar3.g.B(interactionLoggingScreen);
        acveVar3.g.I(3, new acqx(acve.d), null);
        String str5 = acuu.a;
        acuqVar.a.b();
        acuqVar.a.g.a();
    }
}
