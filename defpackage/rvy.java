package defpackage;

import android.content.Context;
import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvy {
    public boolean a;
    public final int b;
    public final boolean c;
    public final float d;
    public rwh e;
    private boolean f;
    private final float g;

    public rvy(Context context) {
        this.g = 0.0f;
        this.a = false;
        this.b = Color.parseColor("#C0C0C0");
        this.c = true;
        this.d = rwq.b(context, 1.0f);
    }

    public rvy(rvy rvyVar) {
        this.g = 0.0f;
        this.a = rvyVar.a;
        this.e = rvyVar.e;
        this.b = rvyVar.b;
        boolean z = rvyVar.c;
        this.c = true;
        this.d = rvyVar.d;
        boolean z2 = rvyVar.f;
        this.f = false;
        float f = rvyVar.g;
    }
}
