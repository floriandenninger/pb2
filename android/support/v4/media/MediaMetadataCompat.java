package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import defpackage.adz;
import defpackage.bg;
import defpackage.go;
import defpackage.hn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final adz a;
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    public final Bundle b;
    public MediaMetadata c;
    private MediaDescriptionCompat g;

    static {
        adz adzVar = new adz();
        a = adzVar;
        adzVar.put("android.media.metadata.TITLE", 1);
        adzVar.put("android.media.metadata.ARTIST", 1);
        adzVar.put("android.media.metadata.DURATION", 0);
        adzVar.put("android.media.metadata.ALBUM", 1);
        adzVar.put("android.media.metadata.AUTHOR", 1);
        adzVar.put("android.media.metadata.WRITER", 1);
        adzVar.put("android.media.metadata.COMPOSER", 1);
        adzVar.put("android.media.metadata.COMPILATION", 1);
        adzVar.put("android.media.metadata.DATE", 1);
        adzVar.put("android.media.metadata.YEAR", 0);
        adzVar.put("android.media.metadata.GENRE", 1);
        adzVar.put("android.media.metadata.TRACK_NUMBER", 0);
        adzVar.put("android.media.metadata.NUM_TRACKS", 0);
        adzVar.put("android.media.metadata.DISC_NUMBER", 0);
        adzVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        adzVar.put("android.media.metadata.ART", 2);
        adzVar.put("android.media.metadata.ART_URI", 1);
        adzVar.put("android.media.metadata.ALBUM_ART", 2);
        adzVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        adzVar.put("android.media.metadata.USER_RATING", 3);
        adzVar.put("android.media.metadata.RATING", 3);
        adzVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        adzVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        adzVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        adzVar.put("android.media.metadata.DISPLAY_ICON", 2);
        adzVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        adzVar.put("android.media.metadata.MEDIA_ID", 1);
        adzVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        adzVar.put("android.media.metadata.MEDIA_URI", 1);
        adzVar.put("android.media.metadata.ADVERTISEMENT", 0);
        adzVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        e = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new bg(7);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.b = bundle2;
        hn.c(bundle2);
    }

    public static MediaMetadataCompat c(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.c = mediaMetadata;
        return mediaMetadataCompat;
    }

    public final long a(String str) {
        return this.b.getLong(str, 0L);
    }

    public final MediaDescriptionCompat b() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.g;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String e2 = e("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence d2 = d("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(d2)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = d;
                int length = strArr.length;
                if (i2 >= 7) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence d3 = d(strArr[i2]);
                if (!TextUtils.isEmpty(d3)) {
                    charSequenceArr[i] = d3;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = d2;
            charSequenceArr[1] = d("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = d("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = e;
            int length2 = strArr2.length;
            if (i4 >= 3) {
                bitmap = null;
                break;
            }
            try {
                bitmap = (Bitmap) this.b.getParcelable(strArr2[i4]);
            } catch (Exception e3) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e3);
                bitmap = null;
            }
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = f;
            int length3 = strArr3.length;
            if (i5 >= 3) {
                uri = null;
                break;
            }
            String e4 = e(strArr3[i5]);
            if (!TextUtils.isEmpty(e4)) {
                uri = Uri.parse(e4);
                break;
            }
            i5++;
        }
        String e5 = e("android.media.metadata.MEDIA_URI");
        Uri parse = TextUtils.isEmpty(e5) ? null : Uri.parse(e5);
        go goVar = new go();
        goVar.a = e2;
        goVar.b = charSequenceArr[0];
        goVar.c = charSequenceArr[1];
        goVar.d = charSequenceArr[2];
        goVar.e = bitmap;
        goVar.f = uri;
        goVar.h = parse;
        Bundle bundle = new Bundle();
        if (this.b.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", a("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.b.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", a("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            goVar.g = bundle;
        }
        MediaDescriptionCompat a2 = goVar.a();
        this.g = a2;
        return a2;
    }

    public final CharSequence d(String str) {
        return this.b.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e(String str) {
        CharSequence charSequence = this.b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.b = parcel.readBundle(hn.class.getClassLoader());
    }
}
