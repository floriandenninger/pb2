package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qmu;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new qmu(9);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    boolean i = false;
    private boolean j = true;

    static {
        String[] strArr = new String[0];
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final void a(String str, int i) {
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException(str.length() != 0 ? "No such column: ".concat(str) : new String("No such column: "));
        }
        if (!b()) {
            if (i < 0 || i >= this.h) {
                throw new CursorIndexOutOfBoundsException(i, this.h);
            }
            return;
        }
        throw new IllegalArgumentException("Buffer is closed.");
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.j && this.d.length > 0 && !b()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.G(parcel, 1, this.b);
        qip.I(parcel, 2, this.d, i);
        qip.s(parcel, 3, this.e);
        qip.v(parcel, 4, this.f);
        qip.s(parcel, 1000, this.a);
        qip.n(parcel, m);
        if ((i & 1) != 0) {
            close();
        }
    }
}
