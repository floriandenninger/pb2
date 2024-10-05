package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oif {
    public akdd a;
    private final Context b;
    private final fjs c;
    private final LoadingFrameLayout d;
    private final ysy e;
    private final ajyg f;
    private final acra g;
    private final boolean h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private ajyd n;
    private boolean o;

    public oif(Context context, fjs fjsVar, ysy ysyVar, ajyg ajygVar, acra acraVar, LoadingFrameLayout loadingFrameLayout, boolean z) {
        this.b = context;
        this.c = fjsVar;
        this.e = ysyVar;
        this.f = ajygVar;
        this.g = acraVar;
        this.d = loadingFrameLayout;
        this.h = z;
        if (z) {
            return;
        }
        loadingFrameLayout.g(R.layout.loading_frame_offline_status_view);
    }

    private final void b() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.j = (TextView) this.d.findViewById(R.id.watch_panel_error_offline_message).findViewById(R.id.error_sub_message_text);
        TextView textView = (TextView) this.d.findViewById(R.id.link_button);
        this.k = textView;
        this.n = this.f.a(textView);
        this.l = (TextView) this.d.findViewById(R.id.error_retry_button);
        this.m = (TextView) ((ViewStub) this.d.findViewById(R.id.secondary_retry_button_stub)).inflate();
    }

    public final void a(aigr aigrVar) {
        if (this.h) {
            this.d.h(null);
            return;
        }
        if (!this.e.o()) {
            if (this.c.h()) {
                this.d.i(this.b.getString(R.string.offline_no_content_title_offline_eligible_and_has_content), R.drawable.ic_offline_no_content_on_watch);
                b();
                this.j.setText(this.b.getString(R.string.offline_navigate_to_downloads_detail_text));
                ajyd ajydVar = this.n;
                String string = this.b.getString(R.string.offline_navigate_to_downloads_action_text);
                apxf apxfVar = fia.a;
                aong aongVar = (aong) apmg.a.createBuilder();
                aongVar.copyOnWrite();
                apmg apmgVar = (apmg) aongVar.instance;
                apmgVar.d = 2;
                apmgVar.c = 1;
                aongVar.copyOnWrite();
                apmg apmgVar2 = (apmg) aongVar.instance;
                apmgVar2.e = 3;
                apmgVar2.b |= 8;
                aqyg g = ajcq.g(string);
                aongVar.copyOnWrite();
                apmg apmgVar3 = (apmg) aongVar.instance;
                g.getClass();
                apmgVar3.i = g;
                apmgVar3.b |= 256;
                aongVar.copyOnWrite();
                apmg apmgVar4 = (apmg) aongVar.instance;
                apxfVar.getClass();
                apmgVar4.o = apxfVar;
                apmgVar4.b |= 16384;
                ajydVar.b((apmg) aongVar.build(), null);
                this.j.setVisibility(0);
                this.k.setVisibility(0);
                this.l.setVisibility(8);
            } else {
                this.d.i(this.b.getString(R.string.offline_no_content_title_not_offline_eligible), R.drawable.ic_offline_no_content_upside_down);
                b();
                this.j.setText(this.b.getString(R.string.offline_no_content_body_text_not_offline_eligible));
                this.j.setVisibility(0);
                this.k.setVisibility(8);
                this.l.setVisibility(8);
            }
            TextView textView = this.m;
            if (textView != null) {
                textView.setText(this.b.getString(R.string.offline_retry));
                this.m.setOnClickListener(new View.OnClickListener() { // from class: oie
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        akdd akddVar = oif.this.a;
                        if (akddVar != null) {
                            akddVar.qJ();
                        }
                    }
                });
                this.m.setVisibility(0);
                this.g.n(new acqx(acsb.c(49504)));
                return;
            }
            return;
        }
        this.d.b(aigrVar.d, aigrVar.a);
        if (this.i == null) {
            this.i = (TextView) this.d.findViewById(R.id.error_message_text);
        }
        this.i.setTextSize(yjk.J(this.b.getResources().getDisplayMetrics(), this.b.getResources().getDimension(R.dimen.medium_font_size)));
        this.i.setTextColor(this.b.getResources().getColor(R.color.yt_grey3));
        this.i.setTypeface(ajct.ROBOTO_LIGHT.a(this.b));
    }
}
