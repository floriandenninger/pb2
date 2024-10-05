package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ahus;
import defpackage.amkq;
import defpackage.yjk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ahus {
    public Spanned a;
    public CharSequence b;
    public boolean c;
    public boolean d;
    public f e;
    private String f;

    public b(Context context) {
        super(context);
    }

    private final void k(TextView textView) {
        if (this.c) {
            return;
        }
        textView.setAutoLinkMask(15);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void m(Context context, FrameLayout frameLayout) {
        String string;
        if (np()) {
            if (yjk.W(context)) {
                string = context.getString(R.string.tap_to_retry);
            } else {
                string = context.getString(R.string.click_to_retry);
            }
            this.f = string;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence = this.b;
            String str = "";
            if (charSequence == null) {
                charSequence = "";
            }
            SpannableStringBuilder append = spannableStringBuilder.append(charSequence);
            if (this.c) {
                String valueOf = String.valueOf(this.f);
                str = valueOf.length() != 0 ? "\n\n".concat(valueOf) : new String("\n\n");
            }
            SpannableStringBuilder append2 = append.append((CharSequence) str);
            TextView textView = (TextView) frameLayout.findViewById(R.id.primary_error_text);
            textView.setText(append2);
            k(textView);
        }
        if (np()) {
            if (this.a == null) {
                ((TextView) frameLayout.findViewById(R.id.watch_on_youtube_link)).setVisibility(8);
                return;
            }
            amkq.E(!this.c);
            TextView textView2 = (TextView) frameLayout.findViewById(R.id.watch_on_youtube_link);
            textView2.setText(this.a);
            textView2.setVisibility(0);
            k(textView2);
        }
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        a aVar = new a(this, context);
        from.inflate(R.layout.embed_error_view, aVar);
        m(context, aVar);
        return aVar;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        if (ab(1)) {
            m(context, frameLayout);
        }
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.d;
    }
}
