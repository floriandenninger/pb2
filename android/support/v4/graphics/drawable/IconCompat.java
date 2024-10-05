package android.support.v4.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public String j;
    public String k;

    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
    }

    public IconCompat(int i) {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
        this.b = i;
    }

    public static Bitmap c(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat f(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f = i;
        iconCompat.c = "";
        iconCompat.k = "";
        return iconCompat;
    }

    public final int b() {
        if (this.b != -1 || Build.VERSION.SDK_INT < 23) {
            return this.b;
        }
        Icon icon = (Icon) this.c;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        }
    }

    public final String toString() {
        String str;
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }

    public final int a() {
        if (this.b != -1 || Build.VERSION.SDK_INT < 23) {
            if (this.b == 2) {
                return this.f;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Icon icon = (Icon) this.c;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public final Uri e() {
        if (this.b != -1 || Build.VERSION.SDK_INT < 23) {
            int i = this.b;
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.c);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        Icon icon = (Icon) this.c;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public final Icon d(Context context) {
        Icon createWithBitmap;
        int i = this.b;
        String str = null;
        r3 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i) {
            case -1:
                return (Icon) this.c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.c);
                break;
            case 2:
                if (i == -1 && Build.VERSION.SDK_INT >= 23) {
                    Icon icon = (Icon) this.c;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = icon.getResPackage();
                    } else {
                        try {
                            str = (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        }
                    }
                } else {
                    if (this.b != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    str = TextUtils.isEmpty(this.k) ? ((String) this.c).split(":", -1)[0] : this.k;
                }
                createWithBitmap = Icon.createWithResource(str, this.f);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.c, this.f, this.g);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.c);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.c);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(c((Bitmap) this.c, false));
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri e4 = e();
                    String scheme = e4.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(e4);
                        } catch (Exception e5) {
                            Log.w("IconCompat", "Unable to load image from URI: " + e4, e5);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.c));
                        } catch (FileNotFoundException e6) {
                            Log.w("IconCompat", "Unable to load image from path: " + e4, e6);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(openInputStream));
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(c(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.i;
        if (mode != a) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
