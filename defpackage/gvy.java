package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConnectGpgDialogCommand$ConnectGPGDialogCommand;
import com.google.protos.youtube.api.innertube.ConnectGpgDialogRenderer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvy implements aaha {
    private final Context a;
    private final aahd b;
    private final acra c;
    private final ajut d;
    private final ajjz e;
    private final ajdh f;

    public gvy(Context context, ajjz ajjzVar, aahd aahdVar, acra acraVar, ajut ajutVar, ajdh ajdhVar) {
        this.a = context;
        this.b = aahdVar;
        this.c = acraVar;
        this.d = ajutVar;
        this.e = ajjzVar;
        this.f = ajdhVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        apxfVar.getClass();
        gwk gwkVar = new gwk(this.b, this.c, this.d, this.e, this.f);
        aulq aulqVar = ((ConnectGpgDialogCommand$ConnectGPGDialogCommand) apxfVar.pX(ConnectGpgDialogCommand$ConnectGPGDialogCommand.connectGpgDialogCommand)).b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aqdu aqduVar = aulqVar.pY(ConnectGpgDialogRenderer.connectGpgDialogRenderer) ? (aqdu) aulqVar.pX(ConnectGpgDialogRenderer.connectGpgDialogRenderer) : null;
        if (aqduVar == null) {
            zga.b("Could not get ConnectGPGDialog from command.");
            return;
        }
        ((acqq) this.c).D(new acqx(acrb.CONNECT_GPGDIALOG_RENDERER));
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.connect_gpg_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        aqyg aqygVar = aqduVar.f;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = (TextView) inflate.findViewById(R.id.message);
        textView2.setText(gwk.c(aqduVar.g, gwkVar.a));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        Resources resources = context.getResources();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.user_avatar);
        avgg avggVar = aqduVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        gwkVar.g(resources, imageView, avggVar);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.play_icon);
        ajut ajutVar = gwkVar.c;
        arfs arfsVar = aqduVar.d;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        imageView2.setImageResource(ajutVar.a(b));
        TextView textView3 = (TextView) inflate.findViewById(R.id.gamer_tag);
        aqyg aqygVar2 = aqduVar.b;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar2));
        TextView textView4 = (TextView) inflate.findViewById(R.id.user_email);
        aqyg aqygVar3 = aqduVar.e;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView4, ajcq.b(aqygVar3));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setNegativeButton((CharSequence) null, gwkVar);
        builder.setPositiveButton((CharSequence) null, gwkVar);
        apmh apmhVar = aqduVar.h;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        gwkVar.d = apmgVar;
        TextView textView5 = (TextView) inflate.findViewById(R.id.link_button);
        new zau(context).b(textView5.getBackground(), wbs.W(context, R.attr.ytCallToAction).orElse(0));
        textView5.setTextColor(wbs.W(context, R.attr.ytFilledButtonText).orElse(0));
        textView5.setText(gwk.b(gwkVar.d));
        View findViewById = inflate.findViewById(R.id.link_button_container);
        findViewById.setOnClickListener(new gwj(gwkVar, 1));
        findViewById.setOnTouchListener(akaw.c());
        inflate.findViewById(R.id.close_button).setOnClickListener(new gwj(gwkVar, 0));
        apmh apmhVar2 = aqduVar.i;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar2 = apmhVar2.c;
        if (apmgVar2 == null) {
            apmgVar2 = apmg.a;
        }
        gwkVar.e = apmgVar2;
        apmg apmgVar3 = gwkVar.e;
        if (apmgVar3 != null && (apmgVar3.b & 1048576) != 0) {
            ((acqq) gwkVar.b).D(new acqx(apmgVar3.t));
        }
        builder.setView(inflate);
        gwkVar.j(builder.create());
        gwkVar.k();
    }
}
