package com.google.android.apps.youtube.app.settings.presenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.auqa;
import defpackage.auqh;
import defpackage.lqp;
import defpackage.lqs;
import defpackage.mcy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TimeRangeView extends FrameLayout {
    public final Context a;
    public lqs b;
    public lqs c;
    public int d;
    public int e;
    public List f;
    public auqa g;
    private final ViewStub h;
    private final ViewStub i;

    public TimeRangeView(Context context) {
        this(context, null);
    }

    public final int a() {
        lqs lqsVar = this.b;
        lqsVar.getClass();
        return lqsVar.a;
    }

    public final int b() {
        lqs lqsVar = this.c;
        lqsVar.getClass();
        return lqsVar.a;
    }

    public final boolean c(auqa auqaVar, int i) {
        this.d = 2;
        this.e = 1;
        this.g = auqaVar;
        List q = mcy.q(auqaVar);
        this.f = q;
        if (q.size() != 2) {
            return false;
        }
        ViewStub viewStub = this.h;
        if (viewStub != null) {
            lqs lqsVar = new lqs(this.a, viewStub, (auqh) this.f.get(0));
            this.b = lqsVar;
            if (i >= 0) {
                lqsVar.c.add(new lqp(this, i));
            }
        }
        ViewStub viewStub2 = this.i;
        if (viewStub2 != null) {
            this.c = new lqs(this.a, viewStub2, (auqh) this.f.get(1));
        }
        return true;
    }

    public final void d(auqa auqaVar) {
        List q = mcy.q(auqaVar);
        this.f = q;
        if (q.size() != this.d) {
            return;
        }
        Context context = this.a;
        context.getClass();
        lqs lqsVar = this.b;
        if (lqsVar != null) {
            lqsVar.a(context, (auqh) this.f.get(0));
        }
        lqs lqsVar2 = this.c;
        if (lqsVar2 != null) {
            lqsVar2.a(this.a, (auqh) this.f.get(this.e));
        }
    }

    public TimeRangeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeRangeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new ArrayList();
        this.a = context;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        inflate(context, R.layout.time_range_view, this);
        this.h = (ViewStub) findViewById(R.id.lower_bound_view_stub);
        this.i = (ViewStub) findViewById(R.id.upper_bound_view_stub);
    }
}
