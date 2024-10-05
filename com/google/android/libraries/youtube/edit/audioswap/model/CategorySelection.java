package com.google.android.libraries.youtube.edit.audioswap.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aoob;
import defpackage.apgq;
import defpackage.xes;
import defpackage.zga;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CategorySelection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xes(10);
    public CharSequence a;
    public List b;

    public CategorySelection(Parcel parcel) {
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = new ArrayList();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            aone createBuilder = apgq.a.createBuilder();
            try {
                createBuilder.mergeFrom(bArr, aomw.b());
                this.b.add((apgq) createBuilder.build());
            } catch (aoob e) {
                zga.d("Cannot deserialize AudioTracksCategoryRenderer from stored proto byte[] in parcel. Safely ignoring.", e);
            }
        }
    }

    public CategorySelection(CharSequence charSequence, List list) {
        this.a = charSequence;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CategorySelection) {
            CategorySelection categorySelection = (CategorySelection) obj;
            return this.a.equals(categorySelection.a) && this.b.equals(categorySelection.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.a, parcel, 0);
        parcel.writeInt(this.b.size());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((apgq) it.next()).toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        }
    }
}
