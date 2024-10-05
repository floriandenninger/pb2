package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajte {
    public TextView a;
    public TextView b;
    public View c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;

    public ajte() {
    }

    public ajte(ajtf ajtfVar) {
        this.a = ajtfVar.a;
        this.b = ajtfVar.b;
        this.c = ajtfVar.c;
        this.g = Integer.valueOf(ajtfVar.d);
        this.h = Integer.valueOf(ajtfVar.e);
        this.d = ajtfVar.f;
        this.i = Integer.valueOf(ajtfVar.g);
        this.e = ajtfVar.h;
        this.j = Integer.valueOf(ajtfVar.i);
        this.f = ajtfVar.j;
    }

    public final ajtf a() {
        Integer num = this.g;
        if (num == null || this.h == null || this.i == null || this.j == null) {
            StringBuilder sb = new StringBuilder();
            if (this.g == null) {
                sb.append(" fallbackBackgroundColor");
            }
            if (this.h == null) {
                sb.append(" fallbackTitleColor");
            }
            if (this.i == null) {
                sb.append(" fallbackBodyColor");
            }
            if (this.j == null) {
                sb.append(" fallbackLinkColor");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajtf(this.a, this.b, this.c, num.intValue(), this.h.intValue(), this.d, this.i.intValue(), this.e, this.j.intValue(), this.f);
    }

    public final void b() {
        this.a = null;
        g(0);
        f();
        this.b = null;
        e(0);
        this.e = null;
        d(0);
        f();
        this.c = null;
        c();
    }

    public final void c() {
        this.g = 0;
    }

    public final void d(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void e(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void f() {
        this.f = null;
    }

    public final void g(int i) {
        this.h = Integer.valueOf(i);
    }
}
