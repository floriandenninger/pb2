package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoeo {
    public final Uri a;
    public final Bitmap b;
    public final Long c;
    public final aoeg d;
    public final Integer e;
    private final byte[] f;

    public aoeo() {
    }

    public aoeo(Uri uri, Bitmap bitmap, Long l, aoeg aoegVar, Integer num) {
        this.a = uri;
        this.b = bitmap;
        this.f = null;
        this.c = l;
        this.d = aoegVar;
        this.e = num;
    }

    public static aoen b() {
        return new aoen();
    }

    public final Bundle a(edo edoVar) {
        Bundle bundle = new Bundle();
        Uri uri = this.a;
        if (uri != null) {
            bundle.putParcelable("uri", uri);
        }
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            int i = (edoVar.b & 4) != 0 ? edoVar.e : 33554432;
            if (bitmap.getByteCount() > i) {
                Log.w("LensMetadata", String.format("Input bitmap is %d bytes, which is larger than our maximum of %d bytes. Downsampling...", Integer.valueOf(bitmap.getByteCount()), Integer.valueOf(i)));
                float sqrt = (float) Math.sqrt(i / bitmap.getByteCount());
                Matrix matrix = new Matrix();
                matrix.setScale(sqrt, sqrt);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            bundle.putParcelable("bitmap", bitmap);
        }
        bundle.putInt("lens_transition_type", 0);
        return bundle;
    }

    public final aoen c() {
        return new aoen(this);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        Long l = this.c;
        if (l != null) {
            bundle.putLong("activity_launch_timestamp_nanos", l.longValue());
        }
        aoeg aoegVar = this.d;
        if (aoegVar != null) {
            bundle.putByteArray("lens_initial_parameters", aoegVar.toByteArray());
        }
        Integer num = this.e;
        if (num != null) {
            bundle.putInt("lens_intent_type", num.intValue());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        Long l;
        aoeg aoegVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoeo) {
            aoeo aoeoVar = (aoeo) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(aoeoVar.a) : aoeoVar.a == null) {
                Bitmap bitmap = this.b;
                if (bitmap != null ? bitmap.equals(aoeoVar.b) : aoeoVar.b == null) {
                    if (aoeoVar instanceof aoeo) {
                        byte[] bArr = aoeoVar.f;
                    }
                    if (Arrays.equals((byte[]) null, (byte[]) null) && ((l = this.c) != null ? l.equals(aoeoVar.c) : aoeoVar.c == null) && ((aoegVar = this.d) != null ? aoegVar.equals(aoeoVar.d) : aoeoVar.d == null)) {
                        Integer num = this.e;
                        Integer num2 = aoeoVar.e;
                        if (num != null ? num.equals(num2) : num2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String arrays = Arrays.toString((byte[]) null);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = "null".length();
        int length4 = "null".length();
        int length5 = "null".length();
        int length6 = "null".length();
        int length7 = "null".length();
        int length8 = String.valueOf(arrays).length();
        int length9 = String.valueOf(valueOf3).length();
        int length10 = "null".length();
        int length11 = "null".length();
        int length12 = "null".length();
        int length13 = String.valueOf(valueOf4).length();
        int length14 = "null".length();
        int length15 = String.valueOf(valueOf5).length();
        int length16 = "null".length();
        int length17 = "null".length();
        int length18 = "null".length();
        StringBuilder sb = new StringBuilder(length + 379 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + "null".length() + "null".length());
        sb.append("LensMetadata{bitmapUri=");
        sb.append(valueOf);
        sb.append(", bitmap=");
        sb.append(valueOf2);
        sb.append(", imageLocationOnScreen=");
        sb.append("null");
        sb.append(", account=null, cropBoundingBox=");
        sb.append("null");
        sb.append(", imageLocation=");
        sb.append("null");
        sb.append(", imagePlaceId=null, imagePayload=");
        sb.append(arrays);
        sb.append(", lensActivityLaunchTimestampNanos=");
        sb.append(valueOf3);
        sb.append(", startStreamingRequestTimestampNanos=");
        sb.append("null");
        sb.append(", hideLensCloseButton=");
        sb.append("null");
        sb.append(", disableArtLookalike=");
        sb.append("null");
        sb.append(", lensInitParams=");
        sb.append(valueOf4);
        sb.append(", transitionType=");
        sb.append("null");
        sb.append(", intentType=");
        sb.append(valueOf5);
        sb.append(", tapLocation=");
        sb.append("null");
        sb.append(", lensTheme=");
        sb.append("null");
        sb.append(", fifeUrl=null, disableIntentOptimizations=");
        sb.append("null");
        sb.append(", promoAddShortcut=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = ((uri == null ? 0 : uri.hashCode()) ^ 1000003) * 1000003;
        Bitmap bitmap = this.b;
        int hashCode2 = (((hashCode ^ (bitmap == null ? 0 : bitmap.hashCode())) * 272515929) ^ Arrays.hashCode((byte[]) null)) * 1000003;
        Long l = this.c;
        int hashCode3 = (hashCode2 ^ (l == null ? 0 : l.hashCode())) * 1525764945;
        aoeg aoegVar = this.d;
        int hashCode4 = (hashCode3 ^ (aoegVar == null ? 0 : aoegVar.hashCode())) * (-721379959);
        Integer num = this.e;
        return (hashCode4 ^ (num != null ? num.hashCode() : 0)) * (-429739981);
    }
}
