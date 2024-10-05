package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ljh implements lkd {
    public lkc a;
    private final Context b;
    private final MicrophoneView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;

    public ljh(Context context, View view, acra acraVar) {
        this.b = context;
        MicrophoneView microphoneView = (MicrophoneView) view.findViewById(R.id.microphone_container);
        this.c = microphoneView;
        ((FloatingActionButton) microphoneView.findViewById(R.id.disabled_microphone)).setImageDrawable(whu.y(microphoneView.getContext(), R.drawable.yt_outline_mic_white_48, R.attr.ytTextPrimary));
        ((FloatingActionButton) microphoneView.findViewById(R.id.enabled_microphone)).setImageResource(R.drawable.yt_fill_mic_white_48);
        this.f = (TextView) view.findViewById(R.id.state_text_view);
        this.d = (TextView) view.findViewById(R.id.stable_recognized_text);
        this.e = (TextView) view.findViewById(R.id.unstable_recognized_text);
        this.g = (TextView) view.findViewById(R.id.listening_voice_tips_text);
        final int i = 1;
        view.findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener(this) { // from class: ljg
            public final /* synthetic */ ljh a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (i != 0) {
                    lkc lkcVar = this.a.a;
                    if (lkcVar != null) {
                        ((ljn) lkcVar).e();
                        return;
                    }
                    return;
                }
                lkc lkcVar2 = this.a.a;
                if (lkcVar2 != null) {
                    lkcVar2.h();
                }
            }
        });
        final int i2 = 0;
        microphoneView.setOnClickListener(new View.OnClickListener(this) { // from class: ljg
            public final /* synthetic */ ljh a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (i2 != 0) {
                    lkc lkcVar = this.a.a;
                    if (lkcVar != null) {
                        ((ljn) lkcVar).e();
                        return;
                    }
                    return;
                }
                lkc lkcVar2 = this.a.a;
                if (lkcVar2 != null) {
                    lkcVar2.h();
                }
            }
        });
        acraVar.n(new acqx(acsb.c(22156)));
        acraVar.n(new acqx(acsb.c(88272)));
    }

    @Override // defpackage.lkd
    public final int a() {
        return 1;
    }

    @Override // defpackage.lkd
    public final String b() {
        return " ";
    }

    @Override // defpackage.lkd
    public final void c(StringBuilder sb) {
    }

    @Override // defpackage.lkd
    public final void d(lkc lkcVar) {
        this.a = lkcVar;
    }

    @Override // defpackage.lkd
    public final void e(StringBuilder sb) {
        this.g.setText(sb);
    }

    @Override // defpackage.lkd
    public final void f(int i) {
        this.c.b(i);
    }

    @Override // defpackage.lkd
    public final void g() {
        this.f.setText(this.b.getText(R.string.you_are_online_half_plate));
        this.c.setEnabled(true);
        this.c.setVisibility(0);
    }

    @Override // defpackage.lkd
    public final void h() {
        this.f.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.d();
    }

    @Override // defpackage.lkd
    public final void i() {
        this.d.setVisibility(8);
        this.d.setText("");
        this.e.setText("");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.f.setText(this.b.getResources().getText(R.string.listening));
        this.f.setVisibility(0);
        this.c.f();
    }

    @Override // defpackage.lkd
    public final void j() {
        this.g.setVisibility(0);
    }

    @Override // defpackage.lkd
    public final void k() {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.f.setText(this.b.getResources().getText(R.string.you_are_offline));
        this.f.setVisibility(0);
        this.c.setVisibility(8);
        this.c.d();
    }

    @Override // defpackage.lkd
    public final void l() {
        this.c.setEnabled(false);
        this.c.e();
    }

    @Override // defpackage.lkd
    public final void m() {
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        this.c.c();
    }

    @Override // defpackage.lkd
    public final void n(String str) {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.e.setText("");
        this.d.setText(str);
    }

    @Override // defpackage.lkd
    public final void o(boolean z, boolean z2) {
        this.f.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.d();
        Resources resources = this.b.getResources();
        if (!z) {
            this.f.setText(resources.getText(R.string.you_are_offline));
            this.c.setEnabled(false);
        } else if (!z2) {
            this.f.setText(resources.getText(R.string.didnt_hear_that_half_plate));
        } else {
            this.f.setText(resources.getText(R.string.try_again_text_half_plate));
        }
    }

    @Override // defpackage.lkd
    public final void p(String str) {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.e.setText(str);
    }

    @Override // defpackage.lkd
    public final boolean q() {
        return true;
    }

    @Override // defpackage.lkd
    public final boolean r() {
        return this.c.b == 1;
    }
}
