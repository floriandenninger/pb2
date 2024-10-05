package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.metadataeditor.elements.suggest.MdeSuggestBottomSheetController$CandidateChipSpan;
import com.google.android.libraries.youtube.metadataeditor.elements.suggest.OverlayView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afnl implements afnt {
    public final CoordinatorLayout a;
    public final EditText b;
    public final ViewGroup c;
    public final BottomSheetBehavior d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final afnm i;
    public final avuu j;
    public final afqi k;
    public MdeSuggestBottomSheetController$CandidateChipSpan l;
    public int m;
    public int n;
    public int o;
    public final RecyclerView p;
    public afnk q;
    public final awuf r;
    private final Context s;
    private boolean t;
    private int u;

    private final ViewParent g() {
        ViewParent parent = this.b.getParent();
        while (parent != null && !(parent instanceof ScrollView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            parent = this.b.getParent();
            if (parent != null) {
                parent = parent.getParent();
            }
            while (parent != null && !(parent instanceof ViewGroup)) {
                parent = parent.getParent();
            }
        }
        return parent;
    }

    private final boolean h() {
        return this.b.getSelectionStart() == this.b.getSelectionEnd();
    }

    public final void a() {
        if (this.l != null) {
            this.b.getText().removeSpan(this.l);
            this.i.f();
            if (this.q != null) {
                f();
                ((afmv) this.q).b();
            }
        }
        this.l = null;
        b();
    }

    public final void b() {
        this.d.G(5);
    }

    public final void c() {
        int indexOf;
        int selectionStart;
        if (this.l == null && h() && (selectionStart = this.b.getSelectionStart()) > 0) {
            Editable text = this.b.getText();
            if (selectionStart >= this.r.c.length()) {
                if (this.r.c.contentEquals(text.subSequence(selectionStart - this.r.c.length(), selectionStart)) && this.m < 10) {
                    int selectionStart2 = this.b.getSelectionStart();
                    this.l = new MdeSuggestBottomSheetController$CandidateChipSpan();
                    this.b.getText().setSpan(this.l, selectionStart2 - this.r.c.length(), selectionStart2, 34);
                    this.i.e();
                    return;
                }
            }
        }
        if (this.l != null) {
            if (h()) {
                Editable text2 = this.b.getText();
                int selectionStart3 = this.b.getSelectionStart();
                boolean z = false;
                boolean z2 = selectionStart3 > 0 && text2.charAt(selectionStart3 + (-1)) == ' ';
                if (selectionStart3 >= 2 && text2.charAt(selectionStart3 - 2) == ' ') {
                    z = true;
                }
                if ((!this.t && !z) || !z2) {
                    int spanStart = text2.getSpanStart(this.l);
                    int spanEnd = text2.getSpanEnd(this.l);
                    if (selectionStart3 >= spanStart && selectionStart3 <= spanEnd && (indexOf = text2.toString().indexOf(this.r.c, spanStart)) != -1 && indexOf == spanStart) {
                        Editable text3 = this.b.getText();
                        int spanStart2 = text3.getSpanStart(this.l);
                        int spanEnd2 = text3.getSpanEnd(this.l);
                        if (spanEnd2 > this.r.c.length() + spanStart2 && spanEnd2 <= text3.length()) {
                            this.i.b(text3.subSequence(spanStart2 + this.r.c.length(), spanEnd2).toString());
                            return;
                        } else {
                            if (spanEnd2 == spanStart2 + 1) {
                                if (this.i.g()) {
                                    this.i.b("");
                                    return;
                                } else {
                                    b();
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }
            a();
        }
    }

    @Override // defpackage.afnt
    public final void d(boolean z) {
        if (z) {
            b();
        } else {
            BottomSheetBehavior bottomSheetBehavior = this.d;
            if (bottomSheetBehavior.t == 5) {
                bottomSheetBehavior.G(4);
            }
        }
        this.t = z;
        if (z) {
            return;
        }
        e();
    }

    public final void e() {
        ViewParent g;
        Layout layout = this.b.getLayout();
        if (layout != null) {
            Rect rect = new Rect();
            this.p.getGlobalVisibleRect(rect);
            int a = (int) aflm.a(layout, this.b);
            if (rect.top > a || rect.top <= 10 || (g = g()) == null) {
                return;
            }
            int i = a - rect.top;
            ((ViewGroup) g).scrollBy(0, i);
            this.u += i;
        }
    }

    public final void f() {
        ViewParent g = g();
        if (g != null) {
            ((ViewGroup) g).scrollBy(0, -this.u);
            this.u = 0;
        }
    }

    public afnl(Context context, alor alorVar, afqp afqpVar, CoordinatorLayout coordinatorLayout, EditText editText, awuf awufVar, ViewGroup viewGroup, acra acraVar, avuu avuuVar, afnm afnmVar, boolean z, byte[] bArr, byte[] bArr2) {
        afnm afnyVar;
        RecyclerView recyclerView;
        int i;
        this.s = context;
        this.j = avuuVar;
        this.k = afqpVar.b;
        this.a = coordinatorLayout;
        this.b = editText;
        this.r = awufVar;
        this.c = viewGroup;
        this.g = avuuVar == avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER ? 0 : wbs.W(context, R.attr.ytBadgeChipBackground).orElse(0);
        coordinatorLayout.addOnLayoutChangeListener(new afnh(this));
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.social_suggestions_bottom_sheet);
        RecyclerView recyclerView2 = new RecyclerView(context);
        this.p = recyclerView2;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(1);
        recyclerView2.af(linearLayoutManager);
        viewGroup2.addView(recyclerView2, -1, -2);
        if (afnmVar != null) {
            afnyVar = afnmVar;
            recyclerView = recyclerView2;
            i = 0;
        } else {
            ajoy ajoyVar = (ajoy) alorVar.c.get();
            ajoyVar.getClass();
            ajvb ajvbVar = (ajvb) alorVar.b.get();
            ajvbVar.getClass();
            ((aahd) alorVar.d.get()).getClass();
            acpl acplVar = (acpl) alorVar.e.get();
            acplVar.getClass();
            ajkn ajknVar = (ajkn) alorVar.f.get();
            ajknVar.getClass();
            akpe akpeVar = (akpe) alorVar.a.get();
            akpeVar.getClass();
            recyclerView = recyclerView2;
            i = 0;
            afnyVar = new afny(ajoyVar, ajvbVar, acplVar, ajknVar, akpeVar, context, this, recyclerView2, acraVar, avuuVar, null);
        }
        this.i = afnyVar;
        RecyclerView recyclerView3 = recyclerView;
        afnyVar.d(this, recyclerView3);
        OverlayView overlayView = (OverlayView) viewGroup.findViewById(R.id.social_suggestions_overlay);
        overlayView.a = recyclerView3;
        overlayView.b = new afng(this);
        View findViewById = viewGroup.findViewById(R.id.user_mention_suggestions_top_bar);
        OptionalInt W = wbs.W(context, R.attr.yt10PercentLayer);
        if (W.isPresent()) {
            findViewById.setBackgroundColor(W.getAsInt());
        }
        this.u = i;
        BottomSheetBehavior x = BottomSheetBehavior.x(viewGroup);
        this.d = x;
        x.E(true);
        x.G(5);
        x.F(i);
        if (z) {
            x.y(new afni(this));
            editText.getViewTreeObserver().addOnGlobalLayoutListener(new afnj(this));
        }
        Resources resources = context.getResources();
        this.e = resources.getDimension(R.dimen.user_mention_chip_corner_radius);
        this.f = resources.getDimension(R.dimen.user_mention_chip_horizontal_padding);
        this.h = resources.getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top);
    }
}
