package com.google.android.apps.youtube.app.fragments;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.anaf;
import defpackage.gjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaylistEditorFragment$EditorState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gjj(13);
    public final CharSequence a;
    public final CharSequence b;
    public final int c;

    public PlaylistEditorFragment$EditorState(Parcel parcel) {
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = anaf.bu(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.a, parcel, 0);
        TextUtils.writeToParcel(this.b, parcel, 0);
        int i2 = this.c;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i3);
    }

    public PlaylistEditorFragment$EditorState(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.a = charSequence;
        this.b = charSequence2;
        if (i == 0) {
            throw null;
        }
        this.c = i;
    }
}
