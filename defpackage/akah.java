package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akah extends SparseArray {
    public akah(byte[] bArr) {
        put(1, "INIT");
        put(4, "SPEED_TEST");
        put(2, "CREATE_INGESTION_REQUEST");
        put(3, "CREATE_INGESTION_FAILED");
        put(5, "RECONNECT_INIT");
        put(6, "START_ENCODER");
        put(7, "PREVIEW");
        put(8, "START_REQUEST");
        put(9, "LIVE");
        put(10, "STOP_REQUEST");
        put(11, "STOP_FLUSH");
        put(12, "STOP_ENCODER");
        put(13, "DONE");
        put(14, "ERROR");
    }

    public akah() {
        append(0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
        append(1, new String[]{"android.permission.CAMERA"});
        append(2, new String[]{"android.permission.RECORD_AUDIO"});
        append(3, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }
}
