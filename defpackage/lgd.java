package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgd extends ajpc {
    public final aahd a;
    public boolean b;
    public awcv c;
    private final Context d;
    private final ajjz e;
    private final ajop f;
    private final Resources g;
    private final LayoutInflater h;
    private final LinearLayout i;
    private final LinearLayout j;
    private FrameLayout k;
    private ImageView l;
    private TextView m;
    private LinearLayout n;
    private boolean o;
    private boolean p;
    private int q;

    public lgd(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar) {
        this.d = context;
        ajjzVar.getClass();
        this.e = ajjzVar;
        this.f = gmaVar;
        aahdVar.getClass();
        this.a = aahdVar;
        this.g = context.getResources();
        LayoutInflater from = LayoutInflater.from(context);
        this.h = from;
        View inflate = from.inflate(R.layout.watch_card, (ViewGroup) null);
        this.i = (LinearLayout) inflate.findViewById(R.id.card_layout);
        this.j = (LinearLayout) inflate.findViewById(R.id.card_content);
        this.b = false;
        this.o = false;
        this.p = false;
        gmaVar.c(inflate);
    }

    private final void g() {
        aqyg aqygVar;
        apxf apxfVar;
        aqyg aqygVar2;
        awct awctVar = this.c.g;
        if (awctVar == null) {
            awctVar = awct.a;
        }
        if (awctVar.d.size() == 0) {
            return;
        }
        awct awctVar2 = this.c.g;
        if (awctVar2 == null) {
            awctVar2 = awct.a;
        }
        aony aonyVar = awctVar2.d;
        if (!this.p) {
            this.h.inflate(R.layout.watch_card_section_title, (ViewGroup) this.j, true);
            TextView textView = (TextView) this.j.getChildAt(r1.getChildCount() - 1);
            awct awctVar3 = this.c.g;
            if (awctVar3 == null) {
                awctVar3 = awct.a;
            }
            if ((awctVar3.b & 1) != 0) {
                awct awctVar4 = this.c.g;
                if (awctVar4 == null) {
                    awctVar4 = awct.a;
                }
                aqygVar2 = awctVar4.c;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView.setText(ajcq.b(aqygVar2));
            this.h.inflate(R.layout.watch_card_list_item_separator, (ViewGroup) this.j, true);
        }
        LinearLayout linearLayout = this.n;
        if (linearLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(this.d);
            this.n = linearLayout2;
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.n.setOrientation(0);
            int K = yjk.K(this.g.getDisplayMetrics(), 7);
            this.n.setPadding(K, K, K, K);
            this.j.addView(this.n);
        } else {
            linearLayout.removeAllViews();
        }
        int integer = this.g.getInteger(R.integer.watch_card_related_entities_count);
        int min = Math.min(integer, aonyVar.size());
        this.n.setWeightSum(integer);
        for (int i = 0; i < min; i++) {
            awcu awcuVar = (awcu) aonyVar.get(i);
            View inflate = this.h.inflate(R.layout.watch_card_related_entity, (ViewGroup) null);
            TextView textView2 = (TextView) inflate.findViewById(R.id.title);
            if ((awcuVar.b & 1) != 0) {
                aqygVar = awcuVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView2.setText(ajcq.b(aqygVar));
            avgg avggVar = awcuVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            h(inflate, R.id.thumbnail, avggVar);
            if ((awcuVar.b & 4) != 0) {
                apxfVar = awcuVar.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = null;
            }
            inflate.setOnClickListener(new lgc(this, apxfVar, 0));
            this.n.addView(inflate);
            inflate.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
    }

    private final void h(View view, int i, avgg avggVar) {
        ImageView imageView = (ImageView) view.findViewById(i);
        this.e.h(imageView, avggVar);
        imageView.setVisibility(true != ahbw.L(avggVar) ? 8 : 0);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.f).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        awcj awcjVar;
        awck awckVar;
        awdc awdcVar;
        apxf apxfVar;
        awcv awcvVar = (awcv) obj;
        this.p = false;
        if (!awcvVar.equals(this.c)) {
            this.o = false;
        }
        if (!this.o || this.g.getConfiguration().orientation != this.q) {
            if (!this.o) {
                this.c = awcvVar;
                this.b = !awcvVar.i;
            }
            if (this.i.findViewById(R.id.card_header) != null) {
                this.i.removeViewAt(0);
            }
            aqyg aqygVar3 = null;
            LinearLayout linearLayout = (LinearLayout) this.h.inflate(R.layout.watch_card_header, (ViewGroup) null);
            this.i.addView(linearLayout, 0);
            TextView textView = (TextView) this.i.findViewById(R.id.card_title);
            awcv awcvVar2 = this.c;
            if ((awcvVar2.b & 1) != 0) {
                aqygVar = awcvVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            TextView textView2 = (TextView) this.i.findViewById(R.id.card_label);
            this.m = textView2;
            textView2.setPadding(0, 0, 0, yjk.K(this.g.getDisplayMetrics(), 4));
            this.m.setVisibility(0);
            this.m.setText(ajcq.n(this.c.e)[0]);
            if ((this.c.b & 4) != 0) {
                this.i.findViewById(R.id.card_description).setOnClickListener(new lfz(this, 1));
            }
            TextView textView3 = (TextView) linearLayout.findViewById(R.id.card_switch_label);
            awcv awcvVar3 = this.c;
            if ((awcvVar3.b & 128) != 0) {
                aqygVar2 = awcvVar3.j;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView3.setText(ajcq.b(aqygVar2));
            this.l = (ImageView) this.i.findViewById(R.id.card_switch_icon);
            FrameLayout frameLayout = (FrameLayout) this.i.findViewById(R.id.card_switch);
            this.k = frameLayout;
            frameLayout.setOnClickListener(new lfz(this, 0));
            FrameLayout frameLayout2 = (FrameLayout) this.i.findViewById(R.id.call_to_action_layout);
            FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = (FixedAspectRatioRelativeLayout) this.i.findViewById(R.id.call_to_action_container);
            TextView textView4 = (TextView) frameLayout2.findViewById(R.id.call_to_action_button);
            awcv awcvVar4 = this.c;
            if ((awcvVar4.b & 8) != 0) {
                awcjVar = awcvVar4.f;
                if (awcjVar == null) {
                    awcjVar = awcj.a;
                }
            } else {
                awcjVar = null;
            }
            int i = awcjVar.b;
            int i2 = 49968063;
            if (i == 49968063) {
                awckVar = (awck) awcjVar.c;
            } else {
                i2 = i;
                awckVar = null;
            }
            if (awckVar != null) {
                fixedAspectRatioRelativeLayout.a = this.g.getFraction(R.fraction.aspect_ratio_2_1, 1, 1);
                if (frameLayout2.findViewById(R.id.watch_card_collage) == null) {
                    ((ViewStub) frameLayout2.findViewById(R.id.watch_card_collage_stub)).inflate();
                }
                apxfVar = awckVar.f;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                avgg avggVar = awckVar.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                h(frameLayout2, R.id.left_thumbnail, avggVar);
                avgg avggVar2 = awckVar.d;
                if (avggVar2 == null) {
                    avggVar2 = avgg.a;
                }
                h(frameLayout2, R.id.top_right_thumbnail, avggVar2);
                avgg avggVar3 = awckVar.e;
                if (avggVar3 == null) {
                    avggVar3 = avgg.a;
                }
                h(frameLayout2, R.id.bottom_right_thumbnail, avggVar3);
                if ((awckVar.b & 16) != 0 && (aqygVar3 = awckVar.g) == null) {
                    aqygVar3 = aqyg.a;
                }
                textView4.setText(ajcq.b(aqygVar3));
            } else {
                if (i2 == 49970284) {
                    awdcVar = (awdc) awcjVar.c;
                } else {
                    awdcVar = awdc.a;
                }
                apxf apxfVar2 = awdcVar.d;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                avgg avggVar4 = awdcVar.c;
                if (avggVar4 == null) {
                    avggVar4 = avgg.a;
                }
                h(frameLayout2, R.id.watch_card_single_image, avggVar4);
                if ((awdcVar.b & 4) != 0 && (aqygVar3 = awdcVar.e) == null) {
                    aqygVar3 = aqyg.a;
                }
                textView4.setText(ajcq.b(aqygVar3));
                apxfVar = apxfVar2;
            }
            frameLayout2.setOnClickListener(new lgc(this, apxfVar, 1));
            if (this.o && this.p) {
                g();
            }
            f();
            this.o = true;
            int i3 = this.g.getConfiguration().orientation;
            this.q = i3;
            if (i3 == 2) {
                yny.z(frameLayout2, yny.w(awckVar != null ? 4 : 1), LinearLayout.LayoutParams.class);
                yny.z((LinearLayout) linearLayout.findViewById(R.id.card_description_and_switch), yny.w(2.0f), LinearLayout.LayoutParams.class);
            }
            this.f.e(ajokVar);
            return;
        }
        this.f.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awcv) obj).k.I();
    }

    public final void f() {
        aony aonyVar;
        awcg awcgVar;
        awcg awcgVar2;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        awdf awdfVar;
        if (this.b) {
            if (!this.p) {
                awcv awcvVar = this.c;
                awcq awcqVar = awcvVar.h;
                if (awcqVar == null) {
                    awcqVar = awcq.a;
                }
                if (awcqVar.b == 49961548) {
                    awcq awcqVar2 = awcvVar.h;
                    if (awcqVar2 == null) {
                        awcqVar2 = awcq.a;
                    }
                    if (awcqVar2.b == 49961548) {
                        awdfVar = (awdf) awcqVar2.c;
                    } else {
                        awdfVar = awdf.a;
                    }
                    aonyVar = awdfVar.b;
                } else {
                    aonyVar = null;
                }
                if (aonyVar != null) {
                    this.j.removeAllViews();
                    for (int i = 0; i < aonyVar.size(); i++) {
                        if (i != 0) {
                            this.h.inflate(R.layout.watch_card_list_item_separator, (ViewGroup) this.j, true);
                        }
                        LinearLayout linearLayout = this.j;
                        awdd awddVar = (awdd) aonyVar.get(i);
                        View inflate = this.h.inflate(R.layout.watch_card_video, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.title);
                        if ((awddVar.b & 4) != 0) {
                            aqygVar3 = awddVar.e;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                        } else {
                            aqygVar3 = null;
                        }
                        textView.setText(ajcq.b(aqygVar3));
                        TextView textView2 = (TextView) inflate.findViewById(R.id.duration);
                        if ((awddVar.b & 8) != 0) {
                            aqygVar4 = awddVar.f;
                            if (aqygVar4 == null) {
                                aqygVar4 = aqyg.a;
                            }
                        } else {
                            aqygVar4 = null;
                        }
                        whu.G(textView2, ajcq.b(aqygVar4));
                        if ((awddVar.b & 2) != 0) {
                            aqygVar5 = awddVar.d;
                            if (aqygVar5 == null) {
                                aqygVar5 = aqyg.a;
                            }
                        } else {
                            aqygVar5 = null;
                        }
                        Spanned b = ajcq.b(aqygVar5);
                        if (!TextUtils.isEmpty(b)) {
                            TextView textView3 = (TextView) inflate.findViewById(R.id.index);
                            textView3.setVisibility(0);
                            textView3.setText(b);
                        }
                        if ((awddVar.b & 1) != 0) {
                            avgg avggVar = awddVar.c;
                            if (avggVar == null) {
                                avggVar = avgg.a;
                            }
                            h(inflate, R.id.thumbnail, avggVar);
                        }
                        inflate.findViewById(R.id.video_layout).setOnClickListener(new lga(this, awddVar));
                        linearLayout.addView(inflate);
                    }
                }
                awcq awcqVar3 = this.c.h;
                if (awcqVar3 == null) {
                    awcqVar3 = awcq.a;
                }
                if (awcqVar3.b == 49627160) {
                    int i2 = 0;
                    while (true) {
                        if (awcqVar3.b == 49627160) {
                            awcgVar = (awcg) awcqVar3.c;
                        } else {
                            awcgVar = awcg.a;
                        }
                        if (i2 >= awcgVar.b.size()) {
                            break;
                        }
                        if (i2 != 0) {
                            this.h.inflate(R.layout.watch_card_list_item_separator, (ViewGroup) this.j, true);
                        }
                        LinearLayout linearLayout2 = this.j;
                        if (awcqVar3.b == 49627160) {
                            awcgVar2 = (awcg) awcqVar3.c;
                        } else {
                            awcgVar2 = awcg.a;
                        }
                        awcf awcfVar = (awcf) awcgVar2.b.get(i2);
                        View inflate2 = this.h.inflate(R.layout.watch_card_album, (ViewGroup) null);
                        TextView textView4 = (TextView) inflate2.findViewById(R.id.title);
                        if ((awcfVar.b & 2) != 0) {
                            aqygVar = awcfVar.d;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        textView4.setText(ajcq.b(aqygVar));
                        TextView textView5 = (TextView) inflate2.findViewById(R.id.year);
                        if ((awcfVar.b & 4) != 0) {
                            aqygVar2 = awcfVar.e;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        whu.G(textView5, ajcq.b(aqygVar2));
                        if ((awcfVar.b & 1) != 0) {
                            avgg avggVar2 = awcfVar.c;
                            if (avggVar2 == null) {
                                avggVar2 = avgg.a;
                            }
                            h(inflate2, R.id.thumbnail, avggVar2);
                        }
                        inflate2.findViewById(R.id.album_layout).setOnClickListener(new lgb(this, awcfVar));
                        linearLayout2.addView(inflate2);
                        i2++;
                    }
                }
                g();
                this.p = true;
            }
            if (this.g.getConfiguration().orientation == 1) {
                View findViewById = this.k.findViewById(R.id.card_switch_content);
                int paddingTop = findViewById.getPaddingTop();
                findViewById.setPadding(paddingTop, paddingTop, paddingTop, 0);
            }
            this.l.setImageResource(R.drawable.arrows_collapse);
            this.j.setVisibility(0);
            return;
        }
        if (this.g.getConfiguration().orientation == 1) {
            View findViewById2 = this.k.findViewById(R.id.card_switch_content);
            int paddingTop2 = findViewById2.getPaddingTop();
            findViewById2.setPadding(paddingTop2, paddingTop2, paddingTop2, paddingTop2);
        }
        this.l.setImageResource(R.drawable.arrows_expand);
        this.j.setVisibility(8);
    }
}
