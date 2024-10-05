package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fv extends fy {
    @Override // defpackage.fy
    public final Typeface a(Context context, fb fbVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (fc fcVar : fbVar.a) {
                try {
                    Font build = new Font.Builder(resources, fcVar.f).setWeight(fcVar.b).setSlant(fcVar.c ? 1 : 0).setTtcIndex(fcVar.e).setFontVariationSettings(fcVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.fy
    public final Typeface b(Context context, CancellationSignal cancellationSignal, ajg[] ajgVarArr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (ajg ajgVar : ajgVarArr) {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(ajgVar.a, "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        try {
                            Font build = new Font.Builder(openFileDescriptor).setWeight(ajgVar.c).setSlant(ajgVar.d ? 1 : 0).setTtcIndex(ajgVar.b).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                            openFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (IOException unused2) {
                }
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused3) {
            return null;
        }
    }

    @Override // defpackage.fy
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fy
    public final Typeface k(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fy
    public final ajg l(ajg[] ajgVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
