package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.extensions.social.controller.MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iox implements xzt, ipg {
    public final CoordinatorLayout a;
    public final EditText b;
    public final ViewGroup c;
    public final BottomSheetBehavior d;
    public final float e;
    public final float f;
    public final int g;
    public final iph h;
    public final avuu i;
    public final List j;
    public final boolean k;
    public MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan l;
    public axdx m;
    public boolean n;
    public int o;
    private final Context p;
    private RecyclerView q;

    public iox(Context context, jlb jlbVar, CoordinatorLayout coordinatorLayout, EditText editText, ViewGroup viewGroup, apxf apxfVar, acra acraVar, avuu avuuVar, boolean z, byte[] bArr, byte[] bArr2) {
        this.j = new ArrayList();
        this.p = context;
        this.i = avuuVar;
        this.a = coordinatorLayout;
        this.b = editText;
        this.k = z;
        this.c = viewGroup;
        this.g = avuuVar == avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER ? 0 : wbs.W(context, R.attr.ytBadgeChipBackground).orElse(0);
        iot iotVar = new iot(this);
        iou iouVar = new iou(this);
        editText.addTextChangedListener(iotVar);
        editText.addTextChangedListener(new yag());
        editText.getText().setSpan(iouVar, 0, 0, 18);
        coordinatorLayout.addOnLayoutChangeListener(new iov(this));
        RecyclerView recyclerView = new RecyclerView(context);
        this.q = recyclerView;
        viewGroup.addView(recyclerView, -1, -2);
        this.h = jlbVar.a(this, this.q, apxfVar, acraVar, avuuVar);
        BottomSheetBehavior x = BottomSheetBehavior.x(viewGroup);
        this.d = x;
        x.G(5);
        Resources resources = context.getResources();
        this.e = resources.getDimension(R.dimen.user_mention_chip_corner_radius);
        this.f = resources.getDimension(R.dimen.user_mention_chip_horizontal_padding);
        if (avuuVar == avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
            editText.addTextChangedListener(new ios(this));
        }
    }

    @Override // defpackage.xzt
    public final String a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b.getText());
        wcy.n(spannableStringBuilder);
        return spannableStringBuilder.toString().trim();
    }

    public final void b() {
        if (this.l != null) {
            this.b.getText().removeSpan(this.l);
            this.h.f();
        }
        this.l = null;
        c();
    }

    @Override // defpackage.xzt
    public final void c() {
        this.d.G(5);
    }

    public final void d(String str, String str2, int i, int i2) {
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "@".concat(valueOf) : new String("@");
        if (this.i != avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 2);
            sb.append((char) 160);
            sb.append(concat);
            sb.append((char) 160);
            concat = sb.toString();
        }
        this.b.getText().replace(i, i2, concat);
        ajtg ajtgVar = new ajtg(str2, this.e, this.f, this.b.getMeasuredWidth() * 0.9f, this.g);
        int length = concat.length() + i;
        if (this.i == avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
            UnderlineSpan underlineSpan = new UnderlineSpan();
            this.b.getText().setSpan(underlineSpan, i, length, 33);
            this.j.add(new iow(this, str2, str, underlineSpan));
            this.o++;
            return;
        }
        this.b.getText().setSpan(ajtgVar, i, length, 33);
        this.b.getText().setSpan(new yaf(), i, length, 33);
    }

    @Override // defpackage.ipg
    public final void e(boolean z) {
        if (z) {
            c();
        } else {
            BottomSheetBehavior bottomSheetBehavior = this.d;
            if (bottomSheetBehavior.t == 5) {
                bottomSheetBehavior.G(4);
            }
        }
        this.n = z;
    }

    public final boolean f() {
        return this.b.getSelectionStart() == this.b.getSelectionEnd();
    }

    @Override // defpackage.ipg
    public final void g(avuy avuyVar) {
        if (this.l == null) {
            return;
        }
        Editable text = this.b.getText();
        int spanStart = text.getSpanStart(this.l);
        int spanEnd = text.getSpanEnd(this.l);
        b();
        if (this.i != avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
            d(avuyVar.d, avuyVar.c, spanStart, spanEnd);
            this.b.getText().insert(this.b.getSelectionStart(), " ");
            return;
        }
        aone createBuilder = axdx.a.createBuilder();
        String str = avuyVar.c;
        createBuilder.copyOnWrite();
        axdx axdxVar = (axdx) createBuilder.instance;
        str.getClass();
        axdxVar.b |= 1;
        axdxVar.c = str;
        String str2 = avuyVar.d;
        createBuilder.copyOnWrite();
        axdx axdxVar2 = (axdx) createBuilder.instance;
        str2.getClass();
        axdxVar2.b |= 2;
        axdxVar2.d = str2;
        createBuilder.copyOnWrite();
        axdx axdxVar3 = (axdx) createBuilder.instance;
        axdxVar3.b |= 4;
        axdxVar3.e = spanStart;
        createBuilder.copyOnWrite();
        axdx axdxVar4 = (axdx) createBuilder.instance;
        axdxVar4.b |= 8;
        axdxVar4.f = spanEnd;
        this.m = (axdx) createBuilder.build();
    }

    public iox(Context context, jlb jlbVar, CoordinatorLayout coordinatorLayout, EditText editText, ViewGroup viewGroup, apxf apxfVar, acra acraVar, avuu avuuVar, algb algbVar, byte[] bArr, byte[] bArr2) {
        this(context, jlbVar, coordinatorLayout, editText, viewGroup, apxfVar, acraVar, avuuVar, false, (byte[]) null, (byte[]) null);
        BottomSheetBehavior bottomSheetBehavior = this.d;
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        bottomSheetBehavior.z.clear();
        bottomSheetBehavior.z.add(algbVar);
    }
}
