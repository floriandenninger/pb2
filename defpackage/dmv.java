package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dmv {
    public diy a;
    public diy b;
    public final diy c;
    public boolean d;
    public boolean e;
    private int f;

    public dmv(diy diyVar, diy diyVar2, diy diyVar3) {
        this.a = diyVar;
        this.b = diyVar2;
        this.c = diyVar3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.f = z ? this.f | 32 : this.f & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Rect rect, Rect rect2) {
        if (rect.top == rect2.top) {
            this.f |= 4;
        }
        if (rect.bottom == rect2.bottom) {
            this.f |= 16;
        }
        if (rect.left == rect2.left) {
            this.f |= 2;
        }
        if (rect.right == rect2.right) {
            this.f |= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return (this.f & 32) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return (this.f & 30) == 30;
    }
}
