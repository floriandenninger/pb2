package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajvn {
    public ajtx a;
    public Object b;
    public View.OnClickListener c;
    public ajvp d;

    public ajvn() {
    }

    public ajvn(ajvo ajvoVar) {
        this.a = ajvoVar.a;
        this.b = ajvoVar.b;
        this.c = ajvoVar.c;
        this.d = ajvoVar.d;
    }

    public final ajvo a() {
        return new ajvo(this.a, this.b, this.c, this.d);
    }
}
