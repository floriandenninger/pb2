package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class saq {
    private final RectF a = new RectF();
    private final Paint b = new Paint();
    private final Map c;

    public saq() {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (!hashMap.containsKey("aplos.HOLLOW")) {
            hashMap.put("aplos.HOLLOW", new san(new sam(0)));
        }
        if (hashMap.containsKey("aplos.SOLID")) {
            return;
        }
        hashMap.put("aplos.SOLID", new san(new sam(1)));
    }

    public final void a(Canvas canvas, rvs rvsVar, int i, RectF rectF, Paint paint, Paint paint2) {
        int i2;
        int i3 = i;
        RectF rectF2 = rectF;
        if (rvsVar.j.isEmpty()) {
            return;
        }
        float round = Math.round(rvsVar.a);
        float round2 = Math.round(rvsVar.b);
        if (round2 != 0.0f) {
            float f = rvsVar.d;
            if (f > 0.0f) {
                float round3 = Math.round(rvsVar.h);
                float round4 = Math.round(rvsVar.i);
                float round5 = Math.round(rvsVar.f);
                float round6 = Math.round(rvsVar.g);
                float f2 = rvsVar.d;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 0) {
                    if (rvsVar.i >= rvsVar.g) {
                        round6 = round4 + f2;
                    } else {
                        round5 = round3 - f2;
                    }
                    this.a.set(round, round5, round + round2, round6);
                } else if (i4 == 1) {
                    if (rvsVar.i <= rvsVar.g) {
                        round5 = round3 - f2;
                    } else {
                        round6 = round4 + f2;
                    }
                    this.a.set(round5, round, round6, round + round2);
                } else {
                    throw new AssertionError();
                }
            }
            int i5 = 0;
            while (i5 < rvsVar.j.size()) {
                rvr rvrVar = (rvr) rvsVar.j.get(i5);
                if (c(rectF2, i3, rvrVar, round, round2)) {
                    i2 = i5;
                } else {
                    san b = b(rvrVar.d);
                    this.b.set(paint);
                    paint.setColor(rvrVar.c);
                    float round7 = Math.round(rvrVar.b);
                    float round8 = Math.round(rvrVar.a);
                    int i6 = i3 - 1;
                    if (i3 != 0) {
                        if (i6 == 0) {
                            i2 = i5;
                            if (f <= 0.0f) {
                                b.b.a(paint);
                                san.c(paint, round7, round8);
                                float b2 = san.b(paint);
                                if (san.d(paint)) {
                                    canvas.drawRect(round + b2, Math.min(round7, round8) + b2, (round + round2) - b2, Math.max(round7, round8) - b2, paint);
                                } else {
                                    float copySign = Math.copySign(b2, round7 - round8);
                                    float f3 = round + b2;
                                    canvas.drawLine(f3, round7, f3, round8, paint);
                                    float f4 = round8 + copySign;
                                    float f5 = round + round2;
                                    canvas.drawLine(round, f4, f5, f4, paint);
                                    float f6 = f5 - b2;
                                    canvas.drawLine(f6, round8, f6, round7, paint);
                                }
                            } else {
                                float f7 = rvsVar.d;
                                RectF rectF3 = this.a;
                                b.b.a(paint);
                                san.c(paint, round7, round8);
                                float b3 = san.b(paint);
                                canvas.save();
                                float f8 = round + round2;
                                canvas.clipRect(round, Math.min(round7, round8), f8, Math.max(round7, round8));
                                b.a.set(rectF3);
                                RectF rectF4 = b.a;
                                rectF4.left += b3;
                                rectF4.right -= b3;
                                if (round7 >= round8) {
                                    rectF4.top += b3;
                                } else {
                                    rectF4.bottom -= b3;
                                }
                                canvas.drawRoundRect(b.a, f7, f7, paint);
                                if (san.e(paint)) {
                                    float copySign2 = round8 + Math.copySign(b3, round7 - round8);
                                    float a = san.a(copySign2, round7 > round8 ? b.a.top : b.a.bottom, f7);
                                    canvas.drawLine(round + a, copySign2, f8 - a, copySign2, paint);
                                }
                                canvas.restore();
                            }
                        } else {
                            if (i6 != 1) {
                                throw new AssertionError();
                            }
                            if (f <= 0.0f) {
                                i2 = i5;
                                b.b.a(paint);
                                san.c(paint, round7, round8);
                                float b4 = san.b(paint);
                                if (san.d(paint)) {
                                    canvas.drawRect(Math.min(round7, round8) + b4, round + b4, Math.max(round7, round8) - b4, (round + round2) - b4, paint);
                                } else {
                                    float copySign3 = Math.copySign(b4, round7 - round8);
                                    float f9 = round + b4;
                                    canvas.drawLine(round7, f9, round8, f9, paint);
                                    float f10 = round8 + copySign3;
                                    float f11 = round + round2;
                                    canvas.drawLine(f10, round, f10, f11, paint);
                                    float f12 = f11 - b4;
                                    canvas.drawLine(round8, f12, round7, f12, paint);
                                }
                            } else {
                                float f13 = rvsVar.d;
                                RectF rectF5 = this.a;
                                b.b.a(paint);
                                san.c(paint, round7, round8);
                                float b5 = san.b(paint);
                                canvas.save();
                                float f14 = round + round2;
                                i2 = i5;
                                canvas.clipRect(Math.min(round7, round8), round, Math.max(round7, round8), f14);
                                b.a.set(rectF5);
                                RectF rectF6 = b.a;
                                rectF6.top += b5;
                                rectF6.bottom -= b5;
                                if (round7 >= round8) {
                                    rectF6.left += b5;
                                } else {
                                    rectF6.right -= b5;
                                }
                                canvas.drawRoundRect(b.a, f13, f13, paint);
                                if (san.e(paint)) {
                                    float copySign4 = round8 + Math.copySign(b5, round7 - round8);
                                    float a2 = san.a(copySign4, round7 > round8 ? b.a.left : b.a.right, f13);
                                    canvas.drawLine(copySign4, round + a2, copySign4, f14 - a2, paint);
                                }
                                canvas.restore();
                            }
                        }
                        paint.set(this.b);
                    } else {
                        throw null;
                    }
                }
                i5 = i2 + 1;
                i3 = i;
                rectF2 = rectF;
            }
            if (rvsVar.e) {
                float f15 = rvsVar.c;
                if (f15 <= 0.0f) {
                    return;
                }
                paint2.setStrokeWidth(f15);
                float f16 = rvsVar.i;
                float f17 = rvsVar.g;
                if (f16 > f17) {
                    f17 = rvsVar.f;
                }
                float f18 = f17;
                for (rvr rvrVar2 : rvsVar.j) {
                    if (rvrVar2.a != f18 && !c(rectF, i, rvrVar2, round, round2)) {
                        b(rvrVar2.d);
                        float round9 = Math.round(rvrVar2.a);
                        int i7 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i7 == 0) {
                            canvas.drawLine(round, round9, round + round2, round9, paint2);
                        } else if (i7 == 1) {
                            canvas.drawLine(round9, round, round9, round + round2, paint2);
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
            }
        }
    }

    final san b(String str) {
        if (this.c.containsKey(str)) {
            return (san) this.c.get(str);
        }
        return (san) this.c.get("aplos.SOLID");
    }

    private static final boolean c(RectF rectF, int i, rvr rvrVar, float f, float f2) {
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? !rectF.intersects(Math.min(rvrVar.b, rvrVar.a), f, Math.max(rvrVar.b, rvrVar.a), f2 + f) : !rectF.intersects(f, Math.min(rvrVar.b, rvrVar.a), f2 + f, Math.max(rvrVar.b, rvrVar.a));
        }
        throw null;
    }
}
