package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwx implements fgu {
    public final ci a;
    public final fjs b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public ProgressBar h;
    public ajyf i;
    public Button j;
    public ivg k;
    private final ajyg l;
    private final FrameLayout m;
    private boolean n;

    public jwx(ci ciVar, fjs fjsVar, ajyg ajygVar, FrameLayout frameLayout) {
        this.a = ciVar;
        this.b = fjsVar;
        this.l = ajygVar;
        this.m = frameLayout;
    }

    public static apmg b(String str, apxf apxfVar) {
        aong aongVar = (aong) apmg.a.createBuilder();
        aongVar.copyOnWrite();
        apmg apmgVar = (apmg) aongVar.instance;
        apmgVar.d = 2;
        apmgVar.c = 1;
        aongVar.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar.instance;
        apmgVar2.e = 3;
        apmgVar2.b |= 8;
        aqyg g = ajcq.g(str);
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
        return (apmg) aongVar.build();
    }

    public static void c(acra acraVar, acrb acrbVar) {
        if (acraVar == null) {
            zga.b("No valid interaction logger.");
        } else {
            acraVar.n(new acqx(acrbVar));
        }
    }

    @Override // defpackage.fgu
    public final void a(acra acraVar) {
        f(false, acraVar);
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(this.a.getString(R.string.offline_retry));
            this.g.setOnClickListener(new View.OnClickListener() { // from class: jwu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ivg ivgVar = jwx.this.k;
                    if (ivgVar != null) {
                        ivgVar.a();
                    }
                }
            });
            this.g.setVisibility(0);
            c(acraVar, acrb.OFFLINE_ZERO_STATE_SCREEN_RETRY_BUTTON);
        }
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final void d() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.d = (TextView) this.m.findViewById(R.id.error_message_text);
        this.c = (ImageView) this.m.findViewById(R.id.error_icon);
        this.e = (TextView) this.m.findViewById(R.id.error_sub_message_text);
        TextView textView = (TextView) this.m.findViewById(R.id.link_button);
        this.f = textView;
        this.i = this.l.a(textView);
        this.j = (Button) this.m.findViewById(R.id.error_retry_button);
        this.g = (TextView) ((ViewStub) this.m.findViewById(R.id.secondary_retry_button_stub)).inflate();
        this.h = (ProgressBar) ((ViewStub) this.m.findViewById(R.id.load_spinner_stub)).inflate();
    }

    public final void e() {
        d();
        this.c.getClass();
        TextView textView = this.d;
        textView.getClass();
        this.e.getClass();
        this.f.getClass();
        this.j.getClass();
        textView.setText(this.a.getString(R.string.offline_no_content_title_not_offline_eligible));
        this.c.setImageResource(R.drawable.ic_offline_no_content_upside_down);
        this.e.setText(this.a.getString(R.string.offline_no_content_body_text_not_offline_eligible));
        this.e.setVisibility(0);
        this.f.setVisibility(8);
        this.j.setVisibility(8);
    }

    public final void f(final boolean z, final acra acraVar) {
        final boolean h = this.b.h();
        ynm.n(this.a, this.b.b(), new zfi() { // from class: jwv
            @Override // defpackage.zfi
            public final void a(Object obj) {
                jwx.this.e();
                zga.d("Failed to get has offline access.", (Throwable) obj);
            }
        }, new zfi() { // from class: jww
            @Override // defpackage.zfi
            public final void a(Object obj) {
                jwx jwxVar = jwx.this;
                boolean z2 = h;
                boolean z3 = z;
                acra acraVar2 = acraVar;
                Boolean bool = (Boolean) obj;
                if (z2 || Boolean.TRUE.equals(bool)) {
                    jwxVar.d();
                    ImageView imageView = jwxVar.c;
                    imageView.getClass();
                    jwxVar.d.getClass();
                    jwxVar.e.getClass();
                    jwxVar.i.getClass();
                    jwxVar.f.getClass();
                    jwxVar.j.getClass();
                    imageView.setImageResource(R.drawable.ic_offline_no_content_on_watch);
                    if (z2) {
                        jwxVar.d.setText(jwxVar.a.getString(R.string.offline_no_content_title_offline_eligible_and_has_content));
                        if (jwxVar.b.n()) {
                            jwxVar.d.setText(R.string.offline_no_content_title_has_download_recommendations);
                            jwxVar.e.setText(R.string.offline_no_content_body_text_has_download_recommendations);
                            jwxVar.i.b(jwx.b(jwxVar.a.getString(R.string.offline_no_content_button_text_has_download_recommendations), fia.a), null);
                        } else if (jwxVar.b.e()) {
                            jwxVar.e.setText(R.string.offline_no_content_body_text_has_both_downloads_and_recommendations);
                            jwxVar.i.b(jwx.b(jwxVar.a.getString(R.string.offline_no_content_button_text_has_download_recommendations), fia.a), null);
                        } else {
                            jwxVar.e.setText(jwxVar.a.getString(R.string.offline_navigate_to_downloads_detail_text));
                            jwxVar.i.b(jwx.b(jwxVar.a.getString(R.string.offline_navigate_to_downloads_action_text), fia.a), null);
                        }
                        jwxVar.f.setVisibility(0);
                        if (!z3) {
                            jwx.c(acraVar2, acrb.OFFLINE_ZERO_STATE_SCREEN_GOTO_BUTTON);
                        }
                    } else {
                        jwxVar.d.setText(jwxVar.a.getString(R.string.offline_no_content_title_offline_eligible_and_no_content));
                        jwxVar.e.setText(jwxVar.a.getString(R.string.offline_no_content_body_text_offline_eligible_and_no_content));
                        jwxVar.f.setVisibility(8);
                    }
                    jwxVar.e.setVisibility(0);
                    jwxVar.j.setVisibility(8);
                    return;
                }
                jwxVar.e();
            }
        });
    }
}
