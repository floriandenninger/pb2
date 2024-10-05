package com.google.android.libraries.youtube.comment.ui;

import android.content.Context;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView;
import com.google.android.youtube.R;
import defpackage.ajcq;
import defpackage.amkq;
import defpackage.aqyg;
import defpackage.audl;
import defpackage.wbs;
import defpackage.whu;
import defpackage.xwt;
import defpackage.xxj;
import defpackage.zev;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BackstagePollEditorView extends LinearLayout {
    public audl a;
    public TextView b;
    public xxj c;
    private int d;
    private int e;

    public BackstagePollEditorView(Context context) {
        super(context);
        e(context);
    }

    private final void e(Context context) {
        setOrientation(1);
        setGravity(8388611);
        this.d = wbs.W(context, R.attr.ytTextSecondary).orElse(0);
        this.e = wbs.Q(context, R.attr.ytStaticBrandRed);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount() - 1; i++) {
            arrayList.add(((EditText) getChildAt(i).findViewById(R.id.option_text)).getText().toString().trim());
        }
        return arrayList;
    }

    public final void b(String str) {
        aqyg aqygVar;
        amkq.O(getChildCount() > 0 && this.b != null, "The create option button must be added to the view before adding options");
        if (getChildCount() - 1 >= this.a.f) {
            return;
        }
        final View inflate = LayoutInflater.from(getContext()).inflate(R.layout.backstage_poll_editor_option, (ViewGroup) this, false);
        View findViewById = inflate.findViewById(R.id.remove_button);
        TextView textView = (TextView) inflate.findViewById(R.id.character_counter);
        final EditText editText = (EditText) inflate.findViewById(R.id.option_text);
        editText.setText(str);
        d(str.length(), textView);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: xwr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackstagePollEditorView backstagePollEditorView = BackstagePollEditorView.this;
                View view2 = inflate;
                if (backstagePollEditorView.getChildCount() - 1 <= backstagePollEditorView.a.e) {
                    backstagePollEditorView.c();
                    xxj xxjVar = backstagePollEditorView.c;
                    if (xxjVar != null) {
                        xxjVar.a.aE.setVisibility(8);
                        xxjVar.a.aK();
                        xxjVar.a.aM();
                        return;
                    }
                    return;
                }
                backstagePollEditorView.removeView(view2);
                whu.I(backstagePollEditorView.b, true);
                xxj xxjVar2 = backstagePollEditorView.c;
                if (xxjVar2 != null) {
                    xxjVar2.a();
                }
            }
        });
        audl audlVar = this.a;
        if ((audlVar.b & 2) != 0) {
            aqygVar = audlVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if (!TextUtils.isEmpty(b)) {
            editText.setHint(b);
        }
        if (this.a.h > 0) {
            editText.addTextChangedListener(new xwt(this, textView));
        }
        Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!TextUtils.isEmpty((String) it.next())) {
                editText.requestFocus();
                if (zev.e(getContext())) {
                    new Handler().postDelayed(new Runnable() { // from class: xws
                        @Override // java.lang.Runnable
                        public final void run() {
                            editText.sendAccessibilityEvent(8);
                        }
                    }, 500L);
                }
            }
        }
        addView(inflate, getChildCount() - 1);
        if (getChildCount() - 1 >= this.a.f) {
            whu.I(this.b, false);
        }
    }

    public final void c() {
        removeAllViews();
        this.b = null;
    }

    public final void d(int i, TextView textView) {
        String str;
        if (i > 0) {
            int i2 = this.a.h;
            StringBuilder sb = new StringBuilder(25);
            sb.append(i);
            sb.append(" / ");
            sb.append(i2);
            str = sb.toString();
        } else {
            str = "";
        }
        textView.setText(str);
        textView.setTextColor(i > this.a.h ? this.e : this.d);
    }

    public BackstagePollEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public BackstagePollEditorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }
}
