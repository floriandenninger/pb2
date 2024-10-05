package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatProductButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint;
import com.google.protos.youtube.api.innertube.OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abmx implements ajom {
    public final aahd a;
    public final abjr b;
    private final Context c;
    private final ajut d;
    private final ViewGroup e;
    private final ViewGroup f;
    private final ViewGroup g;
    private final View h;
    private final azrw i;
    private ajok j;
    private final TextView k;
    private final View l;

    public abmx(Context context, azrw azrwVar, aahd aahdVar, ajut ajutVar, zim zimVar, abjr abjrVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.live_chat_product_picker_menu, (ViewGroup) null);
        this.e = viewGroup;
        this.f = (ViewGroup) viewGroup.findViewById(R.id.product_picker);
        this.g = (ViewGroup) viewGroup.findViewById(R.id.product_picker_menu);
        this.h = viewGroup.findViewById(R.id.loading_spinner);
        View findViewById = viewGroup.findViewById(R.id.product_picker_header);
        this.l = findViewById;
        this.k = (TextView) findViewById.findViewById(R.id.product_picker_header_text);
        this.c = new ContextThemeWrapper(context, zimVar.a);
        this.i = azrwVar;
        this.a = aahdVar;
        this.d = ajutVar;
        this.b = abjrVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.g.removeAllViews();
        this.l.setVisibility(8);
        this.j = null;
    }

    public final acra d() {
        return ((abht) this.i.get()).p;
    }

    public final void e() {
        Object c = this.j.c("listenerKey");
        if (c instanceof abqe) {
            ((abqe) c).p();
        }
    }

    public final void f() {
        Object c = this.j.c("listenerKey");
        if (c instanceof abqe) {
            ((abqe) c).aF();
        }
    }

    public final void g(boolean z) {
        if (z) {
            this.h.setVisibility(0);
            this.f.setVisibility(8);
        } else {
            this.h.setVisibility(8);
            this.f.setVisibility(0);
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        asqv asqvVar = (asqv) obj;
        d().u(new acqx(asqvVar.d), null);
        this.j = ajokVar;
        aqyg aqygVar2 = asqvVar.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar2);
        if (!TextUtils.isEmpty(b)) {
            this.l.setVisibility(0);
            this.k.setText(b);
            this.k.setContentDescription(b);
        }
        for (aulq aulqVar : asqvVar.c) {
            if (aulqVar.pY(LiveChatProductButtonRendererOuterClass.liveChatProductButtonRenderer)) {
                ViewGroup viewGroup = this.g;
                final asqu asquVar = (asqu) aulqVar.pX(LiveChatProductButtonRendererOuterClass.liveChatProductButtonRenderer);
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.c).inflate(R.layout.bottom_panel_product, (ViewGroup) null);
                ImageView imageView = (ImageView) linearLayout.findViewById(R.id.product_card_image);
                ViewStub viewStub = (ViewStub) linearLayout.findViewById(R.id.new_content_count);
                TextView textView = (TextView) linearLayout.findViewById(R.id.product_card_text);
                TextView textView2 = (TextView) linearLayout.findViewById(R.id.product_card_subtext);
                if ((asquVar.b & 1) != 0) {
                    aqygVar = asquVar.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                textView.setText(ajcq.b(aqygVar));
                aqyg aqygVar3 = asquVar.d;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                whu.G(textView2, ajcq.b(aqygVar3));
                if ((asquVar.b & 4) == 0) {
                    zga.b("Product picker button icon not available");
                } else {
                    ajut ajutVar = this.d;
                    arfs arfsVar = asquVar.e;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b2 = arfr.b(arfsVar.c);
                    if (b2 == null) {
                        b2 = arfr.UNKNOWN;
                    }
                    int a = ajutVar.a(b2);
                    if (a != 0) {
                        imageView.setImageResource(a);
                    }
                }
                if (asquVar.f) {
                    imageView.setColorFilter(wbs.Q(this.c, R.attr.ytIconDisabled));
                    textView.setTextColor(wbs.Q(this.c, R.attr.ytTextDisabled));
                    textView2.setTextColor(wbs.Q(this.c, R.attr.ytTextDisabled));
                    imageView.setContentDescription(this.e.getResources().getString(R.string.pdg_product_disabled));
                } else if ((asquVar.b & 4) != 0) {
                    imageView.setColorFilter(wbs.Q(this.c, R.attr.ytIconInactive));
                    textView2.setTextColor(wbs.Q(this.c, R.attr.ytTextSecondary));
                }
                if (viewStub != null && !asquVar.h.isEmpty() && !asquVar.f) {
                    float applyDimension = TypedValue.applyDimension(1, 2.0f, this.c.getResources().getDisplayMetrics());
                    TextView textView3 = (TextView) viewStub.inflate();
                    whu.G(textView3, asquVar.h);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(wbs.Q(this.c, R.attr.ytThemedBlue));
                    gradientDrawable.setStroke((int) applyDimension, wbs.Q(this.c, R.attr.ytBrandBackgroundSolid));
                    textView3.setBackground(gradientDrawable);
                }
                final acqx acqxVar = new acqx(asquVar.i);
                d().u(acqxVar, null);
                linearLayout.setOnClickListener(asquVar.f ? null : new View.OnClickListener() { // from class: abmw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abmx abmxVar = abmx.this;
                        acqx acqxVar2 = acqxVar;
                        asqu asquVar2 = asquVar;
                        abmxVar.d().I(3, acqxVar2, null);
                        if ((asquVar2.b & 16) != 0) {
                            apxf apxfVar = asquVar2.g;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            if (apxfVar.pY(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand) || apxfVar.pY(OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.openSuperStickerBuyFlowCommand) || apxfVar.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
                                if (abmxVar.b.c) {
                                    abmxVar.f();
                                }
                                abmxVar.e();
                            }
                            if (apxfVar.pY(LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.liveChatPurchaseMessageEndpoint) && abmxVar.b.c) {
                                abmxVar.f();
                            }
                            aahd aahdVar = abmxVar.a;
                            apxf apxfVar2 = asquVar2.g;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aahdVar.c(apxfVar2, amrz.l("live_chat_product_picker_endpoint_key", abmxVar, "engagement_panel_id_key", "live-chat-item-section"));
                        }
                    }
                });
                viewGroup.addView(linearLayout);
            }
        }
    }
}
