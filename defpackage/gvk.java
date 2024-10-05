package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvk extends gvi implements fua {
    public fub a;
    public yht b;
    public aahd c;
    private ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand d;

    private static final void q(View view, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getPaddingBottom(), i - view.getResources().getDimensionPixelSize(R.dimen.bottom_vertical_padding_monitor_superfluous_padding));
        ofInt.addUpdateListener(new jmh(view, 1));
        ofInt.setDuration(200L);
        ofInt.start();
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        Iterator it = this.d.d.iterator();
        while (it.hasNext()) {
            this.c.a((apxf) it.next());
        }
    }

    @Override // defpackage.fua
    public final void a(int i) {
        View view = this.O;
        if (view != null) {
            q(view, i);
        }
    }

    @Override // defpackage.gir
    public final CharSequence aS() {
        aqyg aqygVar = this.d.e;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.gir, defpackage.ce
    public final void lZ() {
        super.lZ();
        this.a.b.remove(this);
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = this.d;
        if (showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand != null) {
            this.b.c(showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.b);
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = null;
        try {
            byte[] byteArray = this.m.getByteArray("show_webview_dialog_command");
            byteArray.getClass();
            aomw b = aomw.b();
            apxf apxfVar = (apxf) aonm.parseFrom(apxf.a, byteArray, b);
            if (apxfVar.pY(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand)) {
                showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) apxfVar.pX(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
            }
        } catch (aoob e) {
            zga.f("WebViewPaneFragment", "Failed to deserialize show command.", e);
        }
        showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.getClass();
        this.d = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
        gac a = this.as.a();
        a.m(gbr.h);
        this.as = a.a();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.web_view_pane_fragment, viewGroup, false);
        q(viewGroup2, this.a.c);
        this.a.a(this);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewGroup2.findViewById(R.id.web_view_loading_layout);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.webview_container);
        yht yhtVar = this.b;
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2 = this.d;
        yhtVar.b(loadingFrameLayout, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2.b, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2.c, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2.h, new gvj(this));
        viewGroup3.addView(this.b.a());
        return viewGroup2;
    }
}
