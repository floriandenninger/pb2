package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajvo {
    public final ajtx a;
    public final Object b;
    public final View.OnClickListener c;
    public final ajvp d;

    public ajvo(ajtx ajtxVar, Object obj, View.OnClickListener onClickListener, ajvp ajvpVar) {
        this.a = ajtxVar;
        this.b = obj;
        this.c = onClickListener;
        this.d = ajvpVar;
    }

    public static ajvn a() {
        return new ajvn();
    }

    public final ajvo b(ajtx ajtxVar) {
        return new ajvo(ajtxVar, this.b, this.c, this.d);
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("event", this.a);
        Y.b("eventId", this.b);
        Y.b("onRetry", this.d);
        Y.b("onMore", this.c);
        Y.b("moreLabel", null);
        return Y.toString();
    }
}
