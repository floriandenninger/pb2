package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mok implements ajom {
    public apxf a;
    private final Context b;
    private final TextView c;
    private final TextView d;
    private final ImageView e;
    private final ajop f;
    private final akbd g;
    private final View.OnClickListener h;
    private final fyl i;

    public mok(Context context, gma gmaVar, final aahd aahdVar, akbd akbdVar) {
        context.getClass();
        this.b = context;
        this.f = gmaVar;
        this.g = akbdVar;
        aahdVar.getClass();
        View inflate = View.inflate(context, R.layout.expand_button_down, null);
        this.c = (TextView) inflate.findViewById(R.id.link_text_start);
        this.d = (TextView) inflate.findViewById(R.id.link_text_end);
        this.e = (ImageView) inflate.findViewById(R.id.link_icon);
        this.h = new View.OnClickListener() { // from class: moj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mok mokVar = mok.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar = mokVar.a;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
            }
        };
        fyl fylVar = new fyl(inflate.getBackground(), wbs.Q(context, R.attr.ytSeparator), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.i = fylVar;
        inflate.setBackground(fylVar);
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.f).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        CharSequence charSequence;
        int Q;
        ajum ajumVar = (ajum) obj;
        this.a = ajumVar.d;
        ajop ajopVar = this.f;
        View.OnClickListener onClickListener = ajumVar.c;
        if (onClickListener == null) {
            onClickListener = this.h;
        }
        ajopVar.d(onClickListener);
        CharSequence string = this.b.getString(R.string.load_more_label);
        int i = ajumVar.e;
        if (i == 0) {
            throw null;
        }
        if (i != 2) {
            charSequence = TextUtils.isEmpty(ajumVar.a) ? string : ajumVar.a;
            if (this.a != null) {
                Q = wbs.Q(this.b, R.attr.ytCallToAction);
            } else {
                Q = wbs.Q(this.b, R.attr.ytTextSecondary);
            }
        } else {
            charSequence = ajumVar.b;
            Q = wbs.Q(this.b, R.attr.ytTextSecondary);
        }
        this.d.setTextColor(Q);
        if (ajumVar.f == 3) {
            whu.G(this.c, charSequence);
            whu.I(this.d, false);
        } else {
            whu.G(this.d, charSequence);
            whu.I(this.c, false);
        }
        View a = a();
        if (true != TextUtils.isEmpty(charSequence)) {
            string = charSequence;
        }
        a.setContentDescription(string);
        ImageView imageView = this.e;
        int i2 = ajumVar.e;
        boolean z = i2 == 1;
        if (i2 != 0) {
            whu.I(imageView, !z);
            int i3 = ajumVar.e;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 1) {
                this.e.setImageDrawable(aii.a(this.b, R.drawable.yt_outline_chevron_down_black_24));
            } else if (i4 == 2) {
                this.e.setImageDrawable(aii.a(this.b, R.drawable.yt_outline_chevron_up_black_24));
            }
            if (this.g.d()) {
                this.g.b(a(), this.g.a(a(), null));
            } else {
                this.f.e(ajokVar);
            }
            int i5 = ajumVar.f;
            Resources resources = this.b.getResources();
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    a().setMinimumHeight(resources.getDimensionPixelSize(R.dimen.expand_button_compact_height));
                    return;
                } else if (i6 != 2) {
                    return;
                }
            }
            a().setMinimumHeight(resources.getDimensionPixelSize(R.dimen.expand_button_default_height));
            return;
        }
        throw null;
    }
}
