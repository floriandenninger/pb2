package defpackage;

import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gps implements vt {
    public final View a;
    public String b;
    public WebView c;
    final zik d = zik.a(geo.g);
    vu e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final acra j;

    public gps(ViewStub viewStub, final gni gniVar, final acra acraVar) {
        this.j = acraVar;
        viewStub.setLayoutResource(R.layout.web_view_bottom_sheet_header);
        View inflate = viewStub.inflate();
        this.a = inflate;
        inflate.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: gpp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gps.this.d.b(view);
            }
        });
        inflate.findViewById(R.id.open_in_browser_button).setOnClickListener(new View.OnClickListener() { // from class: gpr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gps gpsVar = gps.this;
                acraVar.I(3, new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW_OPEN_IN_EXTERNAL_BROWSER_BUTTON), null);
                gpsVar.d.b(view);
                fav.F(gpsVar.a.getContext(), Uri.parse(gpsVar.b));
            }
        });
        inflate.findViewById(R.id.overflow_menu).setOnClickListener(new View.OnClickListener() { // from class: gpq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gps gpsVar = gps.this;
                gpsVar.e = new vu(new aaq(gpsVar.a.getContext(), gniVar.a() == gng.LIGHT ? R.style.OverflowMenuTheme_Light : R.style.OverflowMenuTheme_Dark), view);
                vu vuVar = gpsVar.e;
                new pw(vuVar.a).inflate(R.menu.web_view_title_overflow_menu, vuVar.b);
                gpsVar.e.d = gpsVar;
                if (!gpsVar.c.canGoBack()) {
                    gpsVar.b(gpsVar.e.b.findItem(R.id.back_button));
                }
                if (!gpsVar.c.canGoForward()) {
                    gpsVar.b(gpsVar.e.b.findItem(R.id.forward_button));
                }
                gpsVar.e.a();
            }
        });
        this.f = (TextView) inflate.findViewById(R.id.webview_title);
        TextView textView = (TextView) inflate.findViewById(R.id.webview_url);
        this.g = textView;
        textView.setTextColor(wbs.Q(textView.getContext(), R.attr.ytTextSecondary));
        this.i = inflate.findViewById(R.id.not_secured_icon);
        this.h = inflate.findViewById(R.id.secured_icon);
        acraVar.n(new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW_BACK_BUTTON));
        acraVar.n(new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW_FORWARD_BUTTON));
        acraVar.n(new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW_REFRESH_BUTTON));
        acraVar.n(new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW_OPEN_IN_EXTERNAL_BROWSER_BUTTON));
    }

    @Override // defpackage.vt
    public final boolean a(MenuItem menuItem) {
        int i = ((qt) menuItem).a;
        if (i == R.id.back_button) {
            this.j.I(3, new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW_BACK_BUTTON), null);
            this.c.goBack();
            return true;
        }
        if (i == R.id.forward_button) {
            this.j.I(3, new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW_FORWARD_BUTTON), null);
            this.c.goForward();
            return true;
        }
        if (i != R.id.refresh_button) {
            return false;
        }
        this.j.I(3, new acqx(acrb.SEARCH_BOTTOM_SHEET_WEB_VIEW_REFRESH_BUTTON), null);
        this.c.reload();
        return true;
    }

    public final void b(MenuItem menuItem) {
        menuItem.setEnabled(false);
        SpannableString spannableString = new SpannableString(menuItem.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(wbs.Q(this.a.getContext(), R.attr.ytIconDisabled)), 0, spannableString.length(), 0);
        menuItem.setTitle(spannableString);
    }

    public final void c(WebView webView, String str) {
        this.b = str;
        this.c = webView;
        this.f.setText(webView.getTitle());
        this.g.setText(str);
        boolean contains = str.contains("https://");
        whu.I(this.h, contains);
        whu.I(this.i, !contains);
        this.a.requestLayout();
    }
}
