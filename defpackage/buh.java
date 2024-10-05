package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class buh {
    final Context a;
    public String b;
    public bug c;
    public boolean d;

    public buh(Context context) {
        this.a = context;
    }

    public final bui a() {
        if (this.c == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (this.a != null) {
            if (!this.d || !TextUtils.isEmpty(this.b)) {
                return new bui(this.a, this.b, this.c, this.d);
            }
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }
}
