package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wvi implements wuy, xjk {
    public int a = -1;
    private final /* synthetic */ int b;

    public wvi(int i) {
        this.b = i;
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void i(xiv xivVar) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.xjk
    public final void q(int i, int i2) {
        if (this.b != 0) {
            this.a = i;
        } else {
            this.a = i2;
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.wuy
    public final String a() {
        return this.b != 0 ? Integer.toString(-1) : Integer.toString(-1);
    }

    @Override // defpackage.wuy
    public final String b(xcp xcpVar) {
        return this.b != 0 ? Integer.toString(this.a) : Integer.toString(this.a);
    }
}
