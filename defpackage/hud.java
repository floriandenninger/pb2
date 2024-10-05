package defpackage;

import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hud implements zfi {
    public final /* synthetic */ hur a;
    private final /* synthetic */ int b;

    public /* synthetic */ hud(hur hurVar, int i) {
        this.b = i;
        this.a = hurVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        final boolean z;
        boolean z2;
        if (this.b == 0) {
            hur hurVar = this.a;
            idr idrVar = (idr) obj;
            if (hurVar.p(idrVar) || hurVar.o(idrVar)) {
                ((YouTubeButton) hurVar.x.findViewById(R.id.reel_post_button_text)).setText(hurVar.x.getResources().getString(R.string.reel_accessibility_edit_next));
                hurVar.q.n(new acqx(acsb.c(84513)));
                return;
            } else {
                hurVar.q.n(new acqx(acsb.c(36857)));
                return;
            }
        }
        final hur hurVar2 = this.a;
        idr idrVar2 = (idr) obj;
        int i = 1;
        if (idrVar2 != null) {
            z2 = hurVar2.o(idrVar2);
            z = hurVar2.p(idrVar2);
        } else {
            z = true;
            z2 = true;
        }
        if (z2 || z) {
            hurVar2.D = hurVar2.u.getContext();
            int i2 = hurVar2.j.a() == gng.LIGHT ? R.style.ReelPostCaptureDialogTheme : R.style.ReelPostCaptureDialogThemeDark;
            hurVar2.E = i2;
            hurVar2.F = new ContextThemeWrapper(hurVar2.D, i2);
            hurVar2.C = new algj(hurVar2.F, hurVar2.E);
            hurVar2.C.setCanceledOnTouchOutside(true);
            hurVar2.C.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: huc
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    hur hurVar3 = hur.this;
                    hurVar3.q.I(3, new acqx(acsb.c(85443)), null);
                    hurVar3.q.t();
                }
            });
            if (z2) {
                hurVar2.C.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hui
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        hur hurVar3 = hur.this;
                        boolean z3 = z;
                        hurVar3.q.n(new acqx(acsb.c(136519)));
                        hurVar3.q.n(new acqx(acsb.c(136520)));
                        hurVar3.q.n(new acqx(acsb.c(136521)));
                        hurVar3.q.n(new acqx(acsb.c(85443)));
                        if (z3) {
                            return;
                        }
                        hurVar3.q.n(new acqx(acsb.c(36857)));
                    }
                });
                View inflate = LayoutInflater.from(hurVar2.F).inflate(R.layout.stories_aadc_notice, (ViewGroup) null);
                ((YouTubeTextView) inflate.findViewById(R.id.stories_aadc_notice_text)).d(true);
                inflate.findViewById(R.id.stories_aadc_notice_next_button).setOnClickListener(new View.OnClickListener() { // from class: huk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        hur hurVar3 = hur.this;
                        boolean z3 = z;
                        hurVar3.q.I(3, new acqx(acsb.c(136521)), null);
                        if (z3) {
                            hurVar3.H = true;
                            hurVar3.j();
                            hurVar3.k();
                            hurVar3.i();
                        }
                    }
                });
                inflate.findViewById(R.id.reel_post_button).setOnClickListener(new huj(hurVar2, 0));
                inflate.findViewById(R.id.close_button).setOnClickListener(new huj(hurVar2, i));
                inflate.findViewById(R.id.stories_aadc_notice_next_button).setVisibility(true != z ? 8 : 0);
                inflate.findViewById(R.id.reel_post_button).setVisibility(true == z ? 8 : 0);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.stories_aadc_notice_icon);
                aong aongVar = (aong) avgg.a.createBuilder();
                aone createBuilder = avgf.a.createBuilder();
                createBuilder.copyOnWrite();
                avgf avgfVar = (avgf) createBuilder.instance;
                avgfVar.b = 1 | avgfVar.b;
                avgfVar.c = "https://www.gstatic.com/youtube/img/aadc/teen_uploads_mobile_1x.png";
                createBuilder.copyOnWrite();
                avgf avgfVar2 = (avgf) createBuilder.instance;
                avgfVar2.b |= 2;
                avgfVar2.d = 95;
                createBuilder.copyOnWrite();
                avgf avgfVar3 = (avgf) createBuilder.instance;
                avgfVar3.b |= 4;
                avgfVar3.e = 95;
                aongVar.cB(createBuilder);
                hurVar2.i.h(imageView, (avgg) aongVar.build());
                hurVar2.C.setContentView(inflate);
            } else {
                hurVar2.C.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hug
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        hur hurVar3 = hur.this;
                        hurVar3.i();
                        hurVar3.q.n(new acqx(acsb.c(85443)));
                    }
                });
                hurVar2.k();
            }
            hurVar2.C.show();
            hurVar2.q.I(3, new acqx(acsb.c(84513)), null);
            return;
        }
        hurVar2.m();
    }
}
