package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yib extends yhu implements View.OnClickListener {
    public aahd ae;
    public Context af;
    public yht ag;
    private final Set ah = amkq.an();
    private String ai;

    public static yib aH(apxf apxfVar, int i) {
        Bundle bundle = new Bundle();
        yib yibVar = new yib();
        bundle.putByteArray("show_webview_dialog_command", apxfVar.toByteArray());
        bundle.putInt("mini_player_size", i);
        yibVar.af(bundle);
        return yibVar;
    }

    public final void aI(yia yiaVar) {
        this.ah.add(yiaVar);
    }

    @Override // defpackage.ce
    public final void aa(View view, Bundle bundle) {
        Dialog dialog;
        final int i = this.m.getInt("mini_player_size");
        if (i <= 0 || (dialog = this.d) == null) {
            return;
        }
        final Window window = dialog.getWindow();
        View view2 = this.O;
        if (view2 != null) {
            view2.post(new Runnable() { // from class: yhy
                @Override // java.lang.Runnable
                public final void run() {
                    yib yibVar = yib.this;
                    int i2 = i;
                    Window window2 = window;
                    int height = yibVar.O.getHeight();
                    int dimensionPixelSize = yibVar.O.getResources().getDimensionPixelSize(R.dimen.pivot_bar_height);
                    window2.setLayout(yibVar.O.getWidth(), ((height - dimensionPixelSize) - i2) + uye.c(yibVar.af));
                }
            });
        }
        window.setGravity(48);
        this.d.setCanceledOnTouchOutside(true);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lZ() {
        super.lZ();
        this.ag.c(this.ai);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(0, R.style.WebviewDialog_FullScreen);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        try {
            apxf apxfVar = (apxf) aonm.parseFrom(apxf.a, this.m.getByteArray("show_webview_dialog_command"), aomw.b());
            if (!apxfVar.pY(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand)) {
                return null;
            }
            ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) apxfVar.pX(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
            this.ai = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.b;
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.cloneInContext(this.af).inflate(R.layout.webview_dialog_layout, viewGroup, false);
            Context context = this.af;
            final aahd aahdVar = this.ae;
            View inflate = LayoutInflater.from(context).inflate(R.layout.webview_dialog_header_layout, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            aqyg aqygVar = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
            View findViewById = inflate.findViewById(R.id.information_button);
            aulq aulqVar = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.f;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            final apmg apmgVar = (apmg) ahbj.m(aulqVar);
            if (apmgVar != null) {
                aott aottVar = apmgVar.s;
                if (aottVar == null) {
                    aottVar = aott.a;
                }
                if ((aottVar.b & 1) != 0) {
                    aott aottVar2 = apmgVar.s;
                    if (aottVar2 == null) {
                        aottVar2 = aott.a;
                    }
                    aots aotsVar = aottVar2.c;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                    if ((aotsVar.b & 2) != 0) {
                        findViewById.setContentDescription(aotsVar.c);
                    }
                }
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: yic
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        aahd aahdVar2 = aahd.this;
                        apxf apxfVar2 = apmgVar.p;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar2.c(apxfVar2, null);
                    }
                });
                whu.I(findViewById, true);
            }
            View findViewById2 = inflate.findViewById(R.id.close_button);
            ((ViewGroup) viewGroup2.findViewById(R.id.dialog_header)).addView(inflate);
            findViewById2.setOnClickListener(this);
            LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewGroup2.findViewById(R.id.web_view_loading_layout);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.webview_container);
            this.ag.b(loadingFrameLayout, this.ai, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.c, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.h, new yhz(this));
            viewGroup3.addView(this.ag.a());
            return viewGroup2;
        } catch (aoob e) {
            zga.f("WebViewDialog", "Failed to deserialize show command.", e);
            return null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Iterator it = this.ah.iterator();
        while (it.hasNext()) {
            ((yia) it.next()).a();
        }
    }
}
