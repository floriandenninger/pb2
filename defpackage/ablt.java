package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ablt implements ajom, ajjy {
    public final acra a;
    public final aahd b;
    protected final View c;
    protected final TextView d;
    protected final Context e;
    private final ajkj f;
    private final ajla g;
    private final int h;
    private final int i;
    private final ImageView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final ImageView n;
    private final View o;

    public ablt(Context context, ajjs ajjsVar, acqz acqzVar, aahd aahdVar, ajla ajlaVar, zim zimVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, zimVar.a);
        this.e = contextThemeWrapper;
        this.a = acqzVar.mM();
        this.b = aahdVar;
        View inflate = View.inflate(contextThemeWrapper, h(), null);
        this.c = inflate;
        this.g = ajlaVar;
        ajlaVar.d(this);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.avatar);
        this.j = imageView;
        TextView textView = (TextView) inflate.findViewById(R.id.live_chat_paid_sticker_author_name);
        this.d = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.live_chat_paid_sticker_price);
        this.k = textView2;
        this.l = (TextView) inflate.findViewById(R.id.timestamp);
        this.m = (TextView) inflate.findViewById(R.id.live_chat_paid_sticker_subtext);
        this.n = (ImageView) inflate.findViewById(R.id.live_chat_paid_sticker_animation);
        this.o = inflate.findViewById(R.id.live_chat_sticker_background);
        this.h = textView != null ? textView.getCurrentTextColor() : -16777216;
        this.i = textView2 != null ? textView2.getCurrentTextColor() : -16777216;
        ajjsVar.getClass();
        imageView.getClass();
        this.f = new ajkj(ajjsVar, imageView, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
        this.c.setOnClickListener(null);
        this.f.a();
        this.d.setText((CharSequence) null);
        this.d.setTextColor(this.h);
        TextView textView = this.m;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.l;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = this.k;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
            this.k.setTextColor(this.i);
        }
        this.g.e(this.n);
        this.n.setBackgroundColor(aih.d(this.e, R.color.yt_grey1));
        this.n.setContentDescription(null);
    }

    @Override // defpackage.ajjy
    public final void d(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
    }

    @Override // defpackage.ajjy
    public final void e(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
    }

    @Override // defpackage.ajjy
    public final void f(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
    }

    @Override // defpackage.ajjy
    public final void g(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        imageView.setBackgroundColor(0);
    }

    protected abstract int h();

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        CharSequence charSequence;
        asqk asqkVar = (asqk) obj;
        aqyg aqygVar = asqkVar.g;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(b)) {
            adyu.da(this.e, spannableStringBuilder, b, R.style.live_chat_author_default, true);
        }
        aqyg aqygVar2 = asqkVar.k;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        adyu.cZ(this.e, spannableStringBuilder2, b2, R.style.live_chat_paid_sticker_money_chip);
        if ((asqkVar.b & 4096) != 0) {
            aqyg aqygVar3 = asqkVar.m;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            charSequence = ajcq.b(aqygVar3);
        } else if (asqkVar.e != 0) {
            charSequence = DateFormat.getTimeFormat(this.e).format(new Date(TimeUnit.MICROSECONDS.toMillis(asqkVar.e)));
        } else {
            charSequence = null;
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(charSequence)) {
            adyu.cZ(this.e, spannableStringBuilder3, charSequence, R.style.live_chat_message_time);
        }
        Spanned b3 = ajcq.b(new abiz((apxf) ajokVar.c("live_chat_item_action")).a());
        if (TextUtils.isEmpty(b3)) {
            aqyg aqygVar4 = asqkVar.n;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            Spanned b4 = ajcq.b(aqygVar4);
            if (!TextUtils.isEmpty(b4)) {
                adyu.cZ(this.e, spannableStringBuilder2, b4, R.style.live_chat_subtext);
            }
            avgg avggVar = asqkVar.o;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            if (ahbw.L(avggVar)) {
                if (asqkVar.p != 0 && asqkVar.q != 0) {
                    DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
                    yny.B(this.n, yjk.K(displayMetrics, asqkVar.p), yjk.K(displayMetrics, asqkVar.q));
                }
                this.n.setVisibility(0);
                ajla ajlaVar = this.g;
                ImageView imageView = this.n;
                avgg avggVar2 = asqkVar.o;
                if (avggVar2 == null) {
                    avggVar2 = avgg.a;
                }
                ajlaVar.h(imageView, avggVar2);
                aott aottVar = avggVar.d;
                if (aottVar == null) {
                    aottVar = aott.a;
                }
                if ((aottVar.b & 1) != 0) {
                    ImageView imageView2 = this.n;
                    aott aottVar2 = avggVar.d;
                    if (aottVar2 == null) {
                        aottVar2 = aott.a;
                    }
                    aots aotsVar = aottVar2.c;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                    imageView2.setContentDescription(aotsVar.c);
                }
            }
        } else {
            adyu.db(spannableStringBuilder2, this.e.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing) / this.d.getPaint().measureText(" "));
            adyu.cZ(this.e, spannableStringBuilder2, b3, R.style.live_chat_paid_sticker_deleted);
            this.n.setVisibility(8);
        }
        if (this.k != null && !TextUtils.isEmpty(spannableStringBuilder2)) {
            this.k.setText(spannableStringBuilder2);
            if ((asqkVar.b & 512) != 0) {
                this.k.setTextColor(asqkVar.j);
            }
        }
        ((GradientDrawable) this.o.getBackground()).setColor(asqkVar.i);
        TextView textView = this.d;
        aqyg aqygVar5 = asqkVar.g;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar5));
        if ((asqkVar.b & 64) != 0) {
            this.d.setTextColor(asqkVar.h);
        }
        if ((asqkVar.b & 512) != 0) {
            this.k.setTextColor(asqkVar.j);
        }
        if ((asqkVar.b & 16) != 0) {
            ajkj ajkjVar = this.f;
            avgg avggVar3 = asqkVar.f;
            if (avggVar3 == null) {
                avggVar3 = avgg.a;
            }
            ajkjVar.k(avggVar3);
        }
        acqx acqxVar = new acqx(acrb.PDG_LIVE_CHAT_PAID_STICKER);
        this.a.n(acqxVar);
        if ((asqkVar.b & 2) != 0) {
            this.c.setOnClickListener(new abls(this, asqkVar, acqxVar));
        }
    }
}
