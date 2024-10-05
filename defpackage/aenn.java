package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aenn implements aeny {
    final ArrayList a;
    final ArrayList b;
    private final float d;
    private final int e;
    private final LinkedList f;
    private final afip g;

    public aenn(int i, float f) {
        afki.b(f > 0.0f);
        afki.b(f < 1.0f);
        this.e = i;
        this.d = f;
        this.f = new LinkedList();
        this.g = new afip();
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private final boolean a() {
        int size = this.a.size();
        int size2 = this.b.size();
        return size + size2 <= this.e || size2 < 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01df, code lost:
    
        r1.c = r9;
        r1.d = r11;
     */
    @Override // defpackage.aeny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aenn.b():float");
    }

    @Override // defpackage.aeny
    public final void f(float f) {
        this.f.addFirst(new aenm(Math.log10(f)));
    }

    @Override // defpackage.aeny
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aeny
    public final void h() {
    }

    @Override // defpackage.aeny
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.aeny
    public final /* synthetic */ int j() {
        return 1;
    }
}
