package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gpo extends gpi {
    CoordinatorLayout ae;
    WebView af;
    gps ag;
    public gni ah;
    public ainy ai;
    public acra aj;
    public acpl ak;
    public aahd al;
    public final algb am = new gpl(this);
    private apxf an;

    @Override // defpackage.ce
    public final void V() {
        this.aj.q(new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW), null);
        this.al.b(((avuo) this.an.pX(UrlEndpointOuterClass.urlEndpoint)).e);
        super.V();
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.an = (apxf) ((ParcelableMessageLite) this.m.getParcelable("navigation_endpoint")).a(apxf.a);
        o(0, this.ah.a() == gng.LIGHT ? R.style.WebViewBottomSheetDialogTheme_Light : R.style.WebViewBottomSheetDialogTheme_Dark);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ai.a();
        View inflate = layoutInflater.inflate(R.layout.web_view_bottom_sheet, viewGroup, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.bottom_sheet_coordinator_layout);
        this.ae = coordinatorLayout;
        this.af = (WebView) coordinatorLayout.findViewById(R.id.webview);
        gps gpsVar = new gps((ViewStub) inflate.findViewById(R.id.webview_header), this.ah, this.aj);
        this.ag = gpsVar;
        gpsVar.d.c(new Runnable() { // from class: gpk
            @Override // java.lang.Runnable
            public final void run() {
                gpo.this.d.dismiss();
            }
        });
        this.d.setOnShowListener(new DialogInterface.OnShowListener() { // from class: gpj
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                gpo gpoVar = gpo.this;
                Bundle bundle2 = gpoVar.m;
                if (bundle2 != null) {
                    CoordinatorLayout coordinatorLayout2 = gpoVar.ae;
                    if (coordinatorLayout2 == null || coordinatorLayout2.getParent() == null || !((View) gpoVar.ae.getParent()).isAttachedToWindow()) {
                        gpoVar.onDismiss(dialogInterface);
                        return;
                    }
                    BottomSheetBehavior x = BottomSheetBehavior.x((View) gpoVar.ae.getParent());
                    int round = Math.round(gpoVar.ae.getRootView().getMeasuredHeight() * 0.8f);
                    x.F(round);
                    x.y(gpoVar.am);
                    FrameLayout frameLayout = (FrameLayout) gpoVar.ae.findViewById(R.id.progress_loader_layout);
                    yny.z(frameLayout, yny.n(round - gpoVar.ag.a.getHeight()), ViewGroup.LayoutParams.class);
                    String string = bundle2.getString("URL_KEY");
                    WebView webView = gpoVar.af;
                    webView.setWebViewClient(new gpn(gpoVar.ag, frameLayout, webView));
                    gpoVar.af.getSettings().setJavaScriptEnabled(true);
                    gpoVar.af.loadUrl(string);
                    gpoVar.ag.c(gpoVar.af, string);
                    gpoVar.af.setOnTouchListener(new gpm(0));
                    gpoVar.ae.getParent().requestLayout();
                }
            }
        });
        this.aj.n(new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW));
        return inflate;
    }

    @Override // defpackage.algk, defpackage.nh, defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Window window;
        Dialog oq = super.oq(bundle);
        if (Build.VERSION.SDK_INT >= 27 && (window = oq.getWindow()) != null) {
            window.getDecorView().setSystemUiVisibility(-2147475440);
            window.clearFlags(2);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            ColorDrawable colorDrawable = new ColorDrawable();
            colorDrawable.setColor(window.getDecorView().getResources().getColor(R.color.yt_black_pure_opacity60));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, new ColorDrawable()});
            layerDrawable.setLayerInsetTop(1, displayMetrics.heightPixels);
            window.setBackgroundDrawable(layerDrawable);
        }
        return oq;
    }
}
