package com.google.android.apps.youtube.app.extensions.upload;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import defpackage.akvf;
import defpackage.akwd;
import defpackage.akyb;
import defpackage.avtp;
import defpackage.gjj;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UploadFrontendIdMapHelper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gjj(12);
    public Map a;
    public Set b;

    public UploadFrontendIdMapHelper(int i) {
        this.a = new ConcurrentHashMap(i);
        this.b = new CopyOnWriteArraySet();
    }

    public final String a(Uri uri) {
        return (String) this.a.get(uri);
    }

    public final void b(String str, akvf akvfVar) {
        if (e(str) || !akwd.f(str)) {
            return;
        }
        akvfVar.e(str, avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_NOT_OPENABLE_VIDEO);
        this.b.add(str);
    }

    public final void c(String str, akyb akybVar) {
        if (e(str) || akwd.f(str)) {
            return;
        }
        akybVar.e(str, null, avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_NOT_OPENABLE_VIDEO);
        this.b.add(str);
    }

    public final void d(String str) {
        if (e(str)) {
            return;
        }
        this.b.add(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(String str) {
        return this.b.contains(str);
    }

    public final boolean f(String str) {
        return this.a.containsValue(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.b.size());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
    }

    public UploadFrontendIdMapHelper(Parcel parcel) {
        int readInt = parcel.readInt();
        this.a = new ArrayMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.put((Uri) parcel.readParcelable(Uri.class.getClassLoader()), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        this.b = new CopyOnWriteArraySet();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.b.add(parcel.readString());
        }
    }
}
