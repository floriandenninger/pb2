package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ablz implements View.OnClickListener, abqd, ajom {
    protected final Context a;
    protected final View b;
    protected final ImageView c;
    protected final TextView d;
    public final ClipDrawable e;
    protected final acra f;
    public boolean g;
    public long h;
    public long i;
    private final GradientDrawable j;
    private final GradientDrawable k;
    private final aahd l;
    private apxf m;
    private apxf n;
    private final Runnable o = new ably(this);

    public ablz(Context context, acqz acqzVar, aahd aahdVar) {
        this.a = context;
        this.l = aahdVar;
        this.f = acqzVar.mM();
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_chat_ticker_item, (ViewGroup) null);
        this.b = inflate;
        this.c = (ImageView) inflate.findViewById(R.id.avatar);
        this.d = (TextView) inflate.findViewById(R.id.associated_text);
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_bottom_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(dimensionPixelOffset);
        marginLayoutParams.setMarginEnd(dimensionPixelOffset);
        marginLayoutParams.bottomMargin = dimensionPixelOffset2;
        inflate.setLayoutParams(marginLayoutParams);
        GradientDrawable gradientDrawable = (GradientDrawable) aii.a(context, R.drawable.live_chat_ticker_item);
        this.j = gradientDrawable;
        GradientDrawable gradientDrawable2 = (GradientDrawable) aii.a(context, R.drawable.live_chat_ticker_item);
        this.k = gradientDrawable2;
        ClipDrawable clipDrawable = new ClipDrawable(gradientDrawable2, 8388611, 1);
        this.e = clipDrawable;
        inflate.setBackground(new LayerDrawable(new Drawable[]{gradientDrawable, clipDrawable}));
        inflate.setOnClickListener(this);
    }

    @Override // defpackage.ajom
    public View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
        mX();
        this.d.setText("");
        this.e.setLevel(10000);
        this.h = 0L;
        this.i = 0L;
        this.m = null;
        this.n = null;
    }

    protected abstract int f(Object obj);

    protected abstract int g(Object obj);

    protected abstract int h(Object obj);

    protected abstract long i(Object obj);

    protected abstract long j(Object obj);

    protected abstract Spanned k(Object obj);

    protected abstract acqx l();

    protected abstract apxf m(Object obj);

    @Override // defpackage.abqd
    public final void mU() {
        this.g = false;
        this.b.removeCallbacks(this.o);
    }

    @Override // defpackage.abqd
    public final void mV() {
        this.g = true;
        this.b.post(this.o);
    }

    @Override // defpackage.abqd
    public final void mW() {
        this.g = true;
        this.b.post(this.o);
    }

    @Override // defpackage.abqd
    public final void mX() {
        this.g = false;
        this.b.removeCallbacks(this.o);
    }

    protected abstract avgg n(Object obj);

    protected void o(Object obj) {
    }

    @Override // defpackage.ajom
    public void oB(ajok ajokVar, Object obj) {
        o(obj);
        this.n = (apxf) ajokVar.c("ticker_applied_action");
        this.d.setText(k(obj));
        this.d.setTextColor(f(obj));
        apxf apxfVar = this.n;
        boolean z = false;
        if (apxfVar == null || (!apxfVar.pY(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction) && !this.n.pY(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction))) {
            this.c.setVisibility(0);
            p(n(obj));
        } else {
            this.c.setVisibility(8);
        }
        this.h = j(obj);
        this.i = ((Long) ajokVar.c("ticker_start_timestamp_ms")).longValue() + i(obj);
        this.j.setColor(g(obj));
        this.k.setColor(h(obj));
        apxf m = m(obj);
        this.m = m;
        View view = this.b;
        if (this.l != null && m != null) {
            z = true;
        }
        view.setClickable(z);
        acqx l = l();
        if (l != null) {
            this.f.n(l);
        }
        mW();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.m != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("ticker_applied_action", this.n);
            if (q()) {
                hashMap.put("is_fullscreen", true);
            }
            ViewParent parent = this.b.getParent();
            if (parent instanceof RecyclerView) {
                hashMap.put("live_chat_ticker_view", parent);
            } else {
                hashMap.put("live_chat_ticker_view", this.b);
            }
            acqx l = l();
            if (l != null) {
                this.f.I(3, l, null);
            }
            this.l.c(this.m, hashMap);
        }
    }

    protected abstract void p(avgg avggVar);

    protected boolean q() {
        return false;
    }
}
