package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.cardboard.sdk.R;
import defpackage.hvv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_ReelItemEditModel extends ReelItemEditModel {
    public final RecordingInfo a;
    public final VideoMetaData b;
    public final EditableVideoEdits c;
    public final String d;
    public final boolean e;

    public AutoValue_ReelItemEditModel(RecordingInfo recordingInfo, VideoMetaData videoMetaData, EditableVideoEdits editableVideoEdits, String str, boolean z) {
        this.a = recordingInfo;
        this.b = videoMetaData;
        this.c = editableVideoEdits;
        this.d = str;
        this.e = z;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel
    public final hvv a() {
        return new hvv(this);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel
    public final EditableVideoEdits b() {
        return this.c;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel
    public final VideoMetaData c() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel
    public final RecordingInfo d() {
        return this.a;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReelItemEditModel) {
            ReelItemEditModel reelItemEditModel = (ReelItemEditModel) obj;
            if (this.a.equals(reelItemEditModel.d()) && this.b.equals(reelItemEditModel.c()) && this.c.equals(reelItemEditModel.b()) && this.d.equals(reelItemEditModel.e()) && this.e == reelItemEditModel.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        boolean z = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedWidthMinor + length2 + length3 + str.length());
        sb.append("ReelItemEditModel{recordingInfo=");
        sb.append(valueOf);
        sb.append(", videoMetaData=");
        sb.append(valueOf2);
        sb.append(", editableVideoEdits=");
        sb.append(valueOf3);
        sb.append(", stateEventFilePath=");
        sb.append(str);
        sb.append(", isWatchLaterStickerAdded=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
