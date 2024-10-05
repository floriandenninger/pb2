package com.google.android.setupcompat.logging;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import defpackage.alsr;
import defpackage.alsz;
import defpackage.alta;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CustomEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alsz(0);
    private final long a;
    private final MetricKey b;
    private final PersistableBundle c;
    private final PersistableBundle d;

    private CustomEvent(long j, MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        alta.j(j >= 0, "Timestamp cannot be negative.");
        alta.l(metricKey, "MetricKey cannot be null.");
        alta.l(persistableBundle, "Bundle cannot be null.");
        alta.j(true ^ persistableBundle.isEmpty(), "Bundle cannot be empty.");
        alta.l(persistableBundle2, "piiValues cannot be null.");
        i(persistableBundle);
        this.a = j;
        this.b = metricKey;
        this.c = new PersistableBundle(persistableBundle);
        this.d = new PersistableBundle(persistableBundle2);
    }

    public /* synthetic */ CustomEvent(long j, MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2, alta altaVar) {
        this(j, metricKey, persistableBundle, persistableBundle2);
    }

    public static Bundle b(CustomEvent customEvent) {
        Bundle bundle = new Bundle();
        bundle.putInt("CustomEvent_version", 1);
        bundle.putLong("CustomEvent_timestamp", customEvent.a());
        bundle.putBundle("CustomEvent_metricKey", MetricKey.a(customEvent.g()));
        bundle.putBundle("CustomEvent_bundleValues", alsr.a(customEvent.d()));
        bundle.putBundle("CustomEvent_pii_bundleValues", alsr.a(customEvent.c()));
        return bundle;
    }

    public static CustomEvent e(MetricKey metricKey, PersistableBundle persistableBundle) {
        alta.j(Build.VERSION.SDK_INT >= 29, "The constructor only support on sdk Q or higher.");
        return f(metricKey, persistableBundle, PersistableBundle.EMPTY);
    }

    public static CustomEvent f(MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        alta.j(Build.VERSION.SDK_INT >= 29, "The constructor only support on sdk Q or higher");
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        alsr.d(persistableBundle);
        alsr.d(persistableBundle2);
        return new CustomEvent(millis, metricKey, persistableBundle, persistableBundle2);
    }

    public static String h(String str) {
        return str.length() <= 50 ? str : String.format("%s…", str.substring(0, 49));
    }

    private static void i(PersistableBundle persistableBundle) {
        for (String str : persistableBundle.keySet()) {
            alta.a(str, "bundle key", 3, 50);
            Object obj = persistableBundle.get(str);
            if (obj instanceof String) {
                alta.j(((String) obj).length() <= 50, String.format("Maximum length of string value for key='%s' cannot exceed %s.", str, 50));
            }
        }
    }

    public long a() {
        return this.a;
    }

    public PersistableBundle c() {
        return this.d;
    }

    public PersistableBundle d() {
        return new PersistableBundle(this.c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomEvent)) {
            return false;
        }
        CustomEvent customEvent = (CustomEvent) obj;
        return this.a == customEvent.a && alta.e(this.b, customEvent.b) && alsr.c(this.c, customEvent.c) && alsr.c(this.d, customEvent.d);
    }

    public MetricKey g() {
        return this.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writePersistableBundle(this.c);
        parcel.writePersistableBundle(this.d);
    }
}
