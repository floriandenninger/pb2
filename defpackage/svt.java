package defpackage;

import com.google.android.libraries.elements.interfaces.Component;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class svt {
    public final azrl a;
    public Component b;
    public final String c;
    public awrt d;
    public final Object e;

    public svt(String str) {
        this(str, null);
    }

    public final void a(awrt awrtVar) {
        synchronized (this.e) {
            this.d = awrtVar;
        }
    }

    public final String toString() {
        String str = this.c;
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("DebuggerInfo(");
        sb.append(str);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public svt(String str, Component component) {
        this.a = azrl.e();
        this.e = new Object();
        this.c = str;
        this.b = component;
    }
}
