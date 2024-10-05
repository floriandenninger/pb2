package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import java.text.NumberFormat;
import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yju {
    public final Context a;
    public final View b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final EditText g;
    public final ImageView h;
    public final ajkj i;
    public final ajkj j;
    public final ajkj k;
    public final CircularImageView l;
    public final ajut m;
    public final NumberFormat n;
    public boolean o;
    public final yjr p;
    public aong q;
    private final View r;
    private final View s;
    private final InputMethodManager t;
    private final NumberFormat u;
    private boolean v;

    public yju(Context context, ajjs ajjsVar, ajut ajutVar, InputMethodManager inputMethodManager, View view) {
        this.a = context;
        view.getClass();
        this.r = view;
        ajutVar.getClass();
        this.m = ajutVar;
        this.t = inputMethodManager;
        View findViewById = view.findViewById(R.id.decrement);
        this.b = findViewById;
        View findViewById2 = view.findViewById(R.id.increment);
        this.c = findViewById2;
        this.d = (TextView) view.findViewById(R.id.header);
        this.s = view.findViewById(R.id.amount_underline);
        TextView textView = (TextView) view.findViewById(R.id.amount);
        this.e = textView;
        this.f = (TextView) view.findViewById(R.id.additional_info);
        EditText editText = (EditText) view.findViewById(R.id.amount_input);
        this.g = editText;
        this.u = NumberFormat.getInstance();
        this.n = NumberFormat.getCurrencyInstance();
        ImageView imageView = (ImageView) view.findViewById(R.id.channel_banner);
        this.h = imageView;
        this.i = new ajkj(ajjsVar, imageView, true);
        this.j = new ajkj(ajjsVar, (ImageView) view.findViewById(R.id.channel_thumbnail), true);
        this.k = new ajkj(ajjsVar, (ImageView) view.findViewById(R.id.viewer_thumbnail), true);
        this.l = (CircularImageView) view.findViewById(R.id.tip_icon);
        yjs yjsVar = new yjs(this);
        findViewById2.setOnClickListener(yjsVar);
        findViewById.setOnClickListener(yjsVar);
        yjt yjtVar = new yjt(this);
        textView.setOnFocusChangeListener(yjtVar);
        textView.setOnTouchListener(yjtVar);
        editText.setOnEditorActionListener(yjtVar);
        view.setOnTouchListener(yjtVar);
        this.p = new yjr(view);
    }

    public final awhn a() {
        b();
        yjr yjrVar = this.p;
        String obj = yjrVar.c.getText().toString();
        if (yjrVar.d == null || TextUtils.isEmpty(obj)) {
            yjrVar.d.d(awho.d);
        } else {
            yjrVar.d.e(awho.d, obj.toString());
        }
        return (awhn) this.q.build();
    }

    public final void b() {
        double a;
        if (this.q == null || !this.v) {
            return;
        }
        this.v = false;
        try {
            a = this.u.parse(this.g.getText().toString()).doubleValue();
        } catch (ParseException unused) {
            zga.b("Failed to parse viewer's tip currency input.");
            a = yjj.a((awhn) this.q.build());
        }
        d(a);
        this.g.setVisibility(8);
        this.e.setVisibility(0);
        this.s.setVisibility(0);
        InputMethodManager inputMethodManager = this.t;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.g.getWindowToken(), 0);
        }
        c();
    }

    public final void c() {
        aong aongVar = this.q;
        if (aongVar == null) {
            return;
        }
        double a = yjj.a((awhn) aongVar.build());
        this.e.setText(this.n.format(a));
        this.g.setText(this.u.format(a));
    }

    public final void d(double d) {
        aong aongVar = this.q;
        if (aongVar == null || this.o) {
            return;
        }
        yjj.f(aongVar, Double.valueOf(d * 1000000.0d).longValue());
    }

    public final void e() {
        if (this.v) {
            return;
        }
        this.v = true;
        this.e.setVisibility(4);
        this.s.setVisibility(4);
        this.g.setVisibility(0);
        EditText editText = this.g;
        editText.setSelection(editText.getText().length());
        this.g.requestFocusFromTouch();
        InputMethodManager inputMethodManager = this.t;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.g, 0);
        }
    }
}
