package com.google.android.gms.people.internal;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rlt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MatrixCursorParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rlt(20);
    private final Cursor a;
    private final int b;

    public MatrixCursorParcelable(Cursor cursor) {
        this.a = cursor;
        this.b = cursor == null ? 0 : cursor.getCount();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Cursor cursor = this.a;
        if (cursor != null) {
            try {
                int columnCount = cursor.getColumnCount();
                parcel.writeInt(columnCount);
                parcel.writeStringArray(this.a.getColumnNames());
                parcel.writeInt(this.b);
                this.a.moveToPosition(-1);
                while (this.a.moveToNext()) {
                    Object[] objArr = new Object[columnCount];
                    for (int i2 = 0; i2 < columnCount; i2++) {
                        int type = this.a.getType(i2);
                        if (type == 0) {
                            objArr[i2] = null;
                        } else if (type == 1) {
                            objArr[i2] = Integer.valueOf(this.a.getInt(i2));
                        } else if (type == 2) {
                            objArr[i2] = Float.valueOf(this.a.getFloat(i2));
                        } else if (type == 3) {
                            objArr[i2] = this.a.getString(i2);
                        } else if (type == 4) {
                            objArr[i2] = this.a.getBlob(i2);
                        }
                    }
                    parcel.writeArray(objArr);
                }
                return;
            } finally {
                this.a.close();
            }
        }
        parcel.writeInt(0);
        parcel.writeStringArray(new String[0]);
        parcel.writeInt(0);
    }
}
