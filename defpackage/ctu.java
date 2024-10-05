package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctu implements ctm {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final ctv b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public ctu(long j) {
        cua cuaVar = new cua();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = cuaVar;
        this.c = unmodifiableSet;
    }

    private static Bitmap f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private final synchronized Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            String valueOf = String.valueOf(config);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 176);
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(valueOf);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
        ctv ctvVar = this.b;
        if (config == null) {
            config = a;
        }
        int b = ddn.b(i, i2, config);
        cty d = ((cua) ctvVar).f.d(b, config);
        int i3 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = ctx.a[config.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : cua.e : cua.d : cua.c : cua.a;
        } else {
            configArr = cua.b;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer num = (Integer) ((cua) ctvVar).b(config2).ceilingKey(Integer.valueOf(b));
            if (num == null || num.intValue() > b * 8) {
                i3++;
            } else {
                if (num.intValue() == b) {
                    if (config2 == null) {
                        if (config != null) {
                        }
                    } else if (config2.equals(config)) {
                    }
                }
                ((cua) ctvVar).f.c(d);
                d = ((cua) ctvVar).f.d(num.intValue(), config2);
            }
        }
        bitmap = (Bitmap) ((cua) ctvVar).g.a(d);
        if (bitmap != null) {
            ((cua) ctvVar).c(Integer.valueOf(d.a), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        if (bitmap == null) {
            this.g++;
        } else {
            this.f++;
            this.e -= ddn.a(bitmap);
            bitmap.setHasAlpha(true);
            bitmap.setPremultiplied(true);
        }
        return bitmap;
    }

    private final synchronized void h(long j) {
        while (this.e > j) {
            ctv ctvVar = this.b;
            Bitmap bitmap = (Bitmap) ((cua) ctvVar).g.b();
            if (bitmap != null) {
                ((cua) ctvVar).c(Integer.valueOf(ddn.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    String.valueOf(String.valueOf(this.b)).length();
                }
                this.e = 0L;
                return;
            }
            this.e -= ddn.a(bitmap);
            this.i++;
            bitmap.recycle();
        }
    }

    @Override // defpackage.ctm
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap g = g(i, i2, config);
        if (g != null) {
            g.eraseColor(0);
            return g;
        }
        return f(i, i2, config);
    }

    @Override // defpackage.ctm
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap g = g(i, i2, config);
        return g == null ? f(i, i2, config) : g;
    }

    @Override // defpackage.ctm
    public final void c() {
        h(0L);
    }

    @Override // defpackage.ctm
    public final void e(int i) {
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            c();
        } else if (i >= 20 || i == 15) {
            h(this.d >> 1);
        }
    }

    @Override // defpackage.ctm
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && ddn.a(bitmap) <= this.d && this.c.contains(bitmap.getConfig())) {
                int a2 = ddn.a(bitmap);
                ctv ctvVar = this.b;
                cty d = ((cua) ctvVar).f.d(ddn.a(bitmap), bitmap.getConfig());
                ((cua) ctvVar).g.c(d, bitmap);
                NavigableMap b = ((cua) ctvVar).b(bitmap.getConfig());
                Integer num = (Integer) b.get(Integer.valueOf(d.a));
                b.put(Integer.valueOf(d.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                this.h++;
                this.e += a2;
                h(this.d);
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }
}
