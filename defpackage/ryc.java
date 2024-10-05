package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryc extends ryd {
    private static final float n(ryb rybVar, rze rzeVar, int i) {
        float round = Math.round(rzeVar.a(rybVar.a));
        float c = rzeVar.c();
        if (c > 0.0f) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0 || i2 == 2) {
                int i3 = rybVar.i;
                if (i3 == 0) {
                    return round - (c / 2.0f);
                }
                if (i3 == 1) {
                    return round + (c / 2.0f);
                }
            } else {
                int i4 = rybVar.i;
                if (i4 == 0) {
                    return round + (c / 2.0f);
                }
                if (i4 == 1) {
                    return round - (c / 2.0f);
                }
            }
        }
        return round;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rxy
    public final void f(rxx rxxVar, rze rzeVar, rze rzeVar2, int i) {
        super.f(rxxVar, rzeVar, rzeVar2, i);
        ryb rybVar = (ryb) rxxVar;
        float n = n(rybVar, rzeVar, i);
        rybVar.a((rzeVar2 == null || !rzeVar2.n(rybVar.a)) ? n : n(rybVar, rzeVar2, i));
        rybVar.b(n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rxy
    public final void i(rxx rxxVar, rxx rxxVar2, rze rzeVar, int i) {
        super.i(rxxVar, rxxVar2, rzeVar, i);
        ryb rybVar = (ryb) rxxVar;
        rybVar.i = ((ryb) rxxVar2).i;
        rybVar.b(n(rybVar, rzeVar, i));
    }

    @Override // defpackage.rxy
    protected final rxx k(Object obj, CharSequence charSequence, int i, int i2) {
        ryb rybVar = new ryb(obj, charSequence);
        rybVar.i = i == 0 ? 0 : i == i2 + (-1) ? 1 : 2;
        return rybVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ryd
    public final Paint.Align l(int i, float f, rxx rxxVar) {
        int i2 = ((ryb) rxxVar).i;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i3 == 0 || i3 == 2) {
            if (f == 0.0f) {
                if (i2 == 0) {
                    return Paint.Align.LEFT;
                }
                if (i2 == 1) {
                    return Paint.Align.RIGHT;
                }
            }
        } else if (f == 90.0f) {
            if (i2 == 0) {
                return Paint.Align.LEFT;
            }
            if (i2 == 1) {
                return Paint.Align.RIGHT;
            }
        } else if (f == -90.0f) {
            if (i2 == 0) {
                return Paint.Align.RIGHT;
            }
            if (i2 == 1) {
                return Paint.Align.LEFT;
            }
        }
        return super.l(i, f, rxxVar);
    }
}
