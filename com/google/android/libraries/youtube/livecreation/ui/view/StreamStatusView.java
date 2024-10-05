package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abww;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StreamStatusView extends LinearLayout {
    public TextView a;
    private abww b;
    private String c;
    private LinearLayout d;
    private FrameLayout e;
    private Chronometer f;
    private TextView g;
    private TextView h;
    private TextView i;
    private View j;
    private View k;
    private View l;

    public StreamStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = abww.GOOD;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.lc_stream_status, this);
    }

    public final void a() {
        b(SystemClock.elapsedRealtime());
    }

    public final void b(long j) {
        this.f.stop();
        this.f.setBase(j);
    }

    public final void c(abww abwwVar, String str) {
        String valueOf = String.valueOf(abwwVar);
        String valueOf2 = String.valueOf(this.b);
        String.valueOf(valueOf).length();
        String.valueOf(valueOf2).length();
        this.b = abwwVar;
        this.c = str;
        boolean z = TextUtils.equals(str, getContext().getString(R.string.lc_error_battery_low)) && !TextUtils.isEmpty(this.c);
        abww abwwVar2 = abww.GOOD;
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            this.d.setVisibility(0);
            this.e.setVisibility(8);
            return;
        }
        if (ordinal == 1) {
            this.d.setVisibility(8);
            if (z) {
                this.i.setText(this.c);
            } else {
                this.i.setText(R.string.lc_stream_status_poor_connection);
            }
            this.e.setVisibility(0);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        this.d.setVisibility(8);
        if (z) {
            this.i.setText(this.c);
        } else {
            this.i.setText(R.string.lc_stream_status_bad_connection);
        }
        this.e.setVisibility(0);
    }

    public final void d(String str) {
        this.h.setText(str);
        int i = true != TextUtils.isEmpty(str) ? 0 : 8;
        this.h.setVisibility(i);
        this.l.setVisibility(i);
    }

    public final void e(String str) {
        this.g.setText(str);
        int i = true != TextUtils.isEmpty(str) ? 0 : 8;
        this.g.setVisibility(i);
        this.k.setVisibility(i);
    }

    public final void f(String str) {
        this.a.setText(str);
        int i = true != TextUtils.isEmpty(str) ? 0 : 8;
        this.a.setVisibility(i);
        this.j.setVisibility(i);
    }

    public final void g(long j) {
        this.f.setBase(j);
        this.f.start();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (LinearLayout) findViewById(R.id.healthy_status_container);
        this.f = (Chronometer) findViewById(R.id.stream_duration);
        this.j = findViewById(R.id.stream_status_viewers_image);
        this.a = (TextView) findViewById(R.id.stream_status_viewers_count);
        this.g = (TextView) findViewById(R.id.stream_status_thumbs_up_count);
        this.h = (TextView) findViewById(R.id.super_chat_total);
        this.k = findViewById(R.id.stream_status_thumbs_up_count_image);
        this.l = findViewById(R.id.super_chat_total_image);
        this.e = (FrameLayout) findViewById(R.id.problem_status_container);
        this.i = (TextView) findViewById(R.id.stream_status_text);
        c(this.b, this.c);
    }
}
