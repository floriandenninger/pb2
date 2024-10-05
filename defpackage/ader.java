package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ader extends bnp implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final String a = zga.a("MDX.MdxBaseMediaRouteChooserDialog");
    protected TextView b;
    protected ListView c;
    protected ListView d;
    protected ProgressBar e;
    protected View f;
    protected TextView g;
    protected View h;
    protected YouTubeTextView i;
    protected Handler j;
    protected Runnable k;
    protected Context l;

    public ader(Context context) {
        super(context);
        this.l = context;
    }

    @Override // defpackage.ng, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        View view = this.h;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.j.removeCallbacks(this.k);
        }
    }

    protected abstract void j(rpi rpiVar);

    protected void k() {
        this.b.setText(R.string.mdx_media_route_dialog_searching_title);
        this.e.setVisibility(0);
        this.f.setVisibility(0);
        this.g.setText(R.string.mdx_searching_for_device_text);
        this.j.postDelayed(this.k, 20000L);
    }

    protected final void l(YouTubeTextView youTubeTextView) {
        TypedValue typedValue = new TypedValue();
        boolean z = this.l.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
        final Intent bZ = adyu.bZ(this.l, !z);
        bZ.putExtra("useTvCode", 1);
        youTubeTextView.setOnClickListener(new View.OnClickListener() { // from class: adeo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ader aderVar = ader.this;
                aderVar.l.startActivity(bZ);
            }
        });
        youTubeTextView.setCompoundDrawablesWithIntrinsicBounds(true != z ? R.drawable.quantum_ic_youtube_linked_tv_white_24 : R.drawable.quantum_ic_youtube_linked_tv_grey600_24, 0, 0, 0);
    }

    protected abstract void m();

    protected abstract boolean n();

    protected abstract boolean o();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnp, defpackage.ng, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.d = listView;
        if (listView != null) {
            setContentView(R.layout.mdx_media_route_chooser_dialog);
            this.j = new Handler(this.l.getMainLooper());
            ListView listView2 = (ListView) findViewById(R.id.list_of_routes);
            this.c = listView2;
            listView2.setAdapter(this.d.getAdapter());
            this.c.setOnItemClickListener(this.d.getOnItemClickListener());
            this.b = (TextView) findViewById(R.id.dialog_title);
            this.e = (ProgressBar) findViewById(R.id.progress_bar);
            this.g = (TextView) findViewById(R.id.search_status);
            this.f = findViewById(R.id.space);
            View findViewById = findViewById(android.R.id.empty);
            this.h = findViewById;
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.c.setEmptyView(this.h);
            this.k = new Runnable() { // from class: adeq
                @Override // java.lang.Runnable
                public final void run() {
                    ader aderVar = ader.this;
                    aderVar.e.setVisibility(8);
                    aderVar.f.setVisibility(8);
                    aderVar.g.setText(R.string.mdx_no_device_found_text);
                }
            };
            YouTubeTextView youTubeTextView = (YouTubeTextView) findViewById(R.id.learn_more);
            this.i = youTubeTextView;
            youTubeTextView.setOnClickListener(new aden(this, 0));
            TypedValue typedValue = new TypedValue();
            this.i.setCompoundDrawablesWithIntrinsicBounds(true != (this.l.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0) ? R.drawable.quantum_ic_info_outline_white_24 : R.drawable.quantum_ic_info_outline_grey600_24, 0, 0, 0);
            if (o()) {
                YouTubeTextView youTubeTextView2 = (YouTubeTextView) findViewById(R.id.link_with_tv_code);
                youTubeTextView2.setVisibility(0);
                l(youTubeTextView2);
                YouTubeTextView youTubeTextView3 = (YouTubeTextView) View.inflate(this.l, R.layout.mdx_media_route_chooser_dialog_link_tv_footer, null);
                this.c.addFooterView(youTubeTextView3);
                l(youTubeTextView3);
            }
            m();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object tag = this.h.getTag();
        int visibility = this.h.getVisibility();
        if (tag == null || ((Integer) tag).intValue() != visibility) {
            if (visibility == 0) {
                k();
            } else {
                this.b.setText(R.string.mdx_media_route_dialog_devices_title);
            }
            this.h.setTag(Integer.valueOf(visibility));
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        final View findViewById;
        final View findViewById2;
        final View findViewById3;
        super.show();
        if (!n() || (findViewById = findViewById(R.id.cast_setting_desc)) == null || (findViewById2 = findViewById(R.id.go_to_cast_settings)) == null || (findViewById3 = findViewById(R.id.separator)) == null) {
            return;
        }
        findViewById2.setOnClickListener(new aden(this, 1));
        j(new rpi() { // from class: adep
            @Override // defpackage.rpi
            public final void a(rpt rptVar) {
                View view = findViewById;
                View view2 = findViewById2;
                View view3 = findViewById3;
                String str = ader.a;
                int i = 8;
                if (!rptVar.k()) {
                    zga.m(ader.a, "cannot read cast settings value, assuming cast enabled since it is the default value");
                } else {
                    String.valueOf(String.valueOf(rptVar.g())).length();
                    if (rptVar.g() != null && ((Integer) rptVar.g()).intValue() == 0) {
                        i = 0;
                    }
                }
                view.setVisibility(i);
                view2.setVisibility(i);
                view3.setVisibility(i);
            }
        });
    }

    public ader(Context context, byte[] bArr) {
        super(context, null);
        this.l = context;
    }
}
