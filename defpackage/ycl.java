package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerksSectionRendererOuterClass;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ycl implements ajom {
    public final ViewGroup a;
    public final aahd b;
    private final Context c;
    private final ajjz d;
    private final ajut e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final int j;
    private final yfl k;

    public ycl(Context context, ajjz ajjzVar, ajut ajutVar, yfl yflVar, aahd aahdVar, View view, byte[] bArr) {
        this.c = context;
        this.d = ajjzVar;
        this.b = aahdVar;
        this.e = ajutVar;
        this.k = yflVar;
        if (view == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.a = linearLayout;
        } else {
            this.a = (ViewGroup) view;
        }
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_title_margin);
        this.g = context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_subtitle_margin);
        this.h = context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_default_margin);
        this.j = context.getResources().getDimensionPixelOffset(R.dimen.membership_offer_perk_picture_margin);
        this.i = context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_top_perk_margin);
    }

    public static void d(YouTubeTextView youTubeTextView, CharSequence charSequence) {
        youTubeTextView.setText(charSequence);
        CharSequence text = youTubeTextView.getText();
        if (!(text instanceof Spanned) || ((ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class)).length == 0) {
            youTubeTextView.b();
        } else {
            youTubeTextView.c();
        }
    }

    private static final void f(ImageView imageView, avgg avggVar) {
        if (avggVar != null && (avggVar.b & 4) != 0) {
            aott aottVar = avggVar.d;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            if ((aottVar.b & 1) != 0) {
                aott aottVar2 = avggVar.d;
                if (aottVar2 == null) {
                    aottVar2 = aott.a;
                }
                aots aotsVar = aottVar2.c;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                imageView.setContentDescription(aotsVar.c);
                return;
            }
        }
        imageView.setContentDescription(null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v21, types: [android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.android.libraries.youtube.common.ui.YouTubeTextView] */
    public final void e(atty attyVar) {
        aulq aulqVar;
        aulq aulqVar2;
        LayoutInflater from = LayoutInflater.from(this.c);
        this.a.removeAllViews();
        boolean z = false;
        for (attt atttVar : attyVar.b) {
            if (atttVar.b == 4) {
                aulqVar = (aulq) atttVar.c;
            } else {
                aulqVar = aulq.a;
            }
            ?? r6 = 0;
            aqyg aqygVar = null;
            if (aulqVar.pY(PerksSectionRendererOuterClass.perkItemRenderer)) {
                ViewGroup viewGroup = this.a;
                if (atttVar.b == 4) {
                    aulqVar2 = (aulq) atttVar.c;
                } else {
                    aulqVar2 = aulq.a;
                }
                attx attxVar = (attx) aulqVar2.pX(PerksSectionRendererOuterClass.perkItemRenderer);
                yfl yflVar = this.k;
                aahd aahdVar = this.b;
                Context context = (Context) yflVar.b.get();
                context.getClass();
                ajjz ajjzVar = (ajjz) yflVar.a.get();
                ajjzVar.getClass();
                ycj ycjVar = new ycj(context, ajjzVar, aahdVar, viewGroup);
                ycjVar.d(attxVar);
                r6 = ycjVar.a;
            } else {
                int i = atttVar.b;
                if (i == 1) {
                    ViewGroup viewGroup2 = this.a;
                    final attw attwVar = (attw) atttVar.c;
                    ViewGroup viewGroup3 = (ViewGroup) from.inflate(R.layout.ypc_perk_text_layout, viewGroup2, false);
                    YouTubeTextView youTubeTextView = (YouTubeTextView) viewGroup3.findViewById(R.id.text);
                    if ((attwVar.b & 1) != 0 && (aqygVar = attwVar.c) == null) {
                        aqygVar = aqyg.a;
                    }
                    d(youTubeTextView, aahk.a(aqygVar, this.b, false));
                    float f = this.h;
                    int bJ = anaf.bJ(attwVar.d);
                    if (bJ == 0) {
                        bJ = 1;
                    }
                    int i2 = bJ - 1;
                    if (i2 == 1) {
                        f = this.f;
                        jm.s(youTubeTextView, R.style.TextAppearance_YouTube_Title);
                        youTubeTextView.setTextSize(2, 18.0f);
                        youTubeTextView.setTextColor(wbs.W(this.c, R.attr.ytTextPrimary).orElse(0));
                    } else if (i2 == 2) {
                        f = this.g;
                        jm.s(youTubeTextView, R.style.TextAppearance_YouTube_Body2);
                        youTubeTextView.setTextSize(2, 16.0f);
                        youTubeTextView.setTextColor(wbs.W(this.c, R.attr.ytTextPrimary).orElse(0));
                    } else if (i2 == 4) {
                        jm.s(youTubeTextView, R.style.TextAppearance_YouTube_Caption);
                        youTubeTextView.setTextColor(wbs.W(this.c, R.attr.ytTextDisabled).orElse(0));
                    } else {
                        jm.s(youTubeTextView, R.style.TextAppearance_YouTube_Body1);
                        youTubeTextView.setTextColor(wbs.W(this.c, R.attr.ytTextSecondary).orElse(0));
                    }
                    viewGroup3.findViewById(R.id.separator).setVisibility(true != attwVar.f ? 8 : 0);
                    if (attwVar.f) {
                        f = this.f;
                        if (!z) {
                            yny.z(viewGroup3, yny.v((int) this.i), ViewGroup.MarginLayoutParams.class);
                        }
                    }
                    if ((attwVar.b & 4) != 0) {
                        final Map singletonMap = Collections.singletonMap("com.google.android.libraries.youtube.innertube.endpoint.tag", new Object());
                        viewGroup3.setOnClickListener(new View.OnClickListener() { // from class: yck
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ycl yclVar = ycl.this;
                                attw attwVar2 = attwVar;
                                Map map = singletonMap;
                                aahd aahdVar2 = yclVar.b;
                                apxf apxfVar = attwVar2.e;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, map);
                            }
                        });
                    }
                    int i3 = (int) f;
                    youTubeTextView.setPadding(0, i3, 0, i3);
                    r6 = viewGroup3;
                } else if (i == 2) {
                    ViewGroup viewGroup4 = this.a;
                    attv attvVar = (attv) atttVar.c;
                    r6 = (YouTubeTextView) from.inflate(R.layout.ypc_perk_item_layout, viewGroup4, false);
                    aqyg aqygVar2 = attvVar.b;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    d(r6, aahk.a(aqygVar2, this.b, false));
                } else if (i == 3) {
                    attu attuVar = (attu) atttVar.c;
                    if ((attuVar.b & 1) == 0) {
                        r6 = (ViewGroup) from.inflate(R.layout.ypc_perk_images_extra, this.a, false);
                        for (avgg avggVar : attuVar.c) {
                            ImageView imageView = new ImageView(this.c);
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            imageView.setAdjustViewBounds(true);
                            int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.membership_offer_perk_picture_height);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(dimensionPixelSize, dimensionPixelSize);
                            int i4 = this.j;
                            marginLayoutParams.setMargins(i4, i4, i4, i4);
                            imageView.setLayoutParams(marginLayoutParams);
                            r6.addView(imageView);
                            this.d.h(imageView, avggVar);
                            f(imageView, avggVar);
                        }
                    } else {
                        r6 = (ViewGroup) from.inflate(R.layout.ypc_perk_badge_extra, this.a, false);
                        YouTubeTextView youTubeTextView2 = (YouTubeTextView) r6.findViewById(R.id.badge_text);
                        ImageView imageView2 = (ImageView) r6.findViewById(R.id.badge_icon);
                        aqyg aqygVar3 = attuVar.d;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                        d(youTubeTextView2, ajcq.b(aqygVar3));
                        if ((attuVar.b & 2) == 0) {
                            Drawable a = aii.a(this.c, this.e.a(arfr.SPONSORSHIPS));
                            zau.f(a, aih.f(this.c, R.color.membership_branding_color_green), PorterDuff.Mode.DST_ATOP);
                            imageView2.setImageDrawable(a);
                        } else {
                            ajjz ajjzVar2 = this.d;
                            avgg avggVar2 = attuVar.e;
                            if (avggVar2 == null) {
                                avggVar2 = avgg.a;
                            }
                            ajjzVar2.h(imageView2, avggVar2);
                        }
                        avgg avggVar3 = attuVar.e;
                        if (avggVar3 == null) {
                            avggVar3 = avgg.a;
                        }
                        f(imageView2, avggVar3);
                    }
                }
            }
            z = atttVar.b == 1;
            if (r6 != 0) {
                this.a.addView(r6);
            }
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        e((atty) obj);
    }
}
