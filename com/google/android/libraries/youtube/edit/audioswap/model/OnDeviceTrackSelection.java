package com.google.android.libraries.youtube.edit.audioswap.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import defpackage.xes;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OnDeviceTrackSelection extends TrackSelection {
    static final String[] a = {"title", "artist", "duration", "_id", "album_id", "mime_type"};
    private static final Set d = new HashSet(Arrays.asList("audio/aac-adts", "audio/aac", "audio/x-aac", "audio/vnd.dlna.adts", "audio/flac", "application/ogg", "audio/ogg", "audio/wav", "audio/x-wav", "audio/wave", "audio/x-pn-wav"));
    public static final Parcelable.Creator CREATOR = new xes(12);

    public OnDeviceTrackSelection(Parcel parcel) {
        super(parcel);
    }

    public static Cursor b(Context context) {
        context.getClass();
        return context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, a, "is_music != 0", null, "title");
    }

    public static boolean c(Cursor cursor) {
        int i = cursor.getInt(2);
        String string = cursor.getString(5);
        return i > 0 && (string == null || !d.contains(string.toLowerCase(Locale.ENGLISH)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:3:0x0014, B:5:0x001a, B:8:0x0020, B:11:0x0032, B:15:0x003c, B:17:0x0042, B:23:0x0050, B:26:0x0062, B:28:0x0082, B:29:0x0089, B:32:0x0058, B:34:0x0079), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:3:0x0014, B:5:0x001a, B:8:0x0020, B:11:0x0032, B:15:0x003c, B:17:0x0042, B:23:0x0050, B:26:0x0062, B:28:0x0082, B:29:0x0089, B:32:0x0058, B:34:0x0079), top: B:2:0x0014 }] */
    @Override // com.google.android.libraries.youtube.edit.audioswap.model.TrackSelection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.audioswap.model.OnDeviceTrackSelection.a(android.content.Context):java.util.List");
    }

    public OnDeviceTrackSelection(CharSequence charSequence) {
        super(charSequence, 0);
    }
}
