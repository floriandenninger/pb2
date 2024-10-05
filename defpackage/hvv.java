package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.AutoValue_ReelItemEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvv {
    private RecordingInfo a;
    private VideoMetaData b;
    private EditableVideoEdits c;
    private String d;
    private Boolean e;

    public hvv() {
    }

    public hvv(ReelItemEditModel reelItemEditModel) {
        AutoValue_ReelItemEditModel autoValue_ReelItemEditModel = (AutoValue_ReelItemEditModel) reelItemEditModel;
        this.a = autoValue_ReelItemEditModel.a;
        this.b = autoValue_ReelItemEditModel.b;
        this.c = autoValue_ReelItemEditModel.c;
        this.d = autoValue_ReelItemEditModel.d;
        this.e = Boolean.valueOf(autoValue_ReelItemEditModel.e);
    }

    public final ReelItemEditModel a() {
        VideoMetaData videoMetaData;
        EditableVideoEdits editableVideoEdits;
        String str;
        Boolean bool;
        RecordingInfo recordingInfo = this.a;
        if (recordingInfo == null || (videoMetaData = this.b) == null || (editableVideoEdits = this.c) == null || (str = this.d) == null || (bool = this.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" recordingInfo");
            }
            if (this.b == null) {
                sb.append(" videoMetaData");
            }
            if (this.c == null) {
                sb.append(" editableVideoEdits");
            }
            if (this.d == null) {
                sb.append(" stateEventFilePath");
            }
            if (this.e == null) {
                sb.append(" isWatchLaterStickerAdded");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_ReelItemEditModel(recordingInfo, videoMetaData, editableVideoEdits, str, bool.booleanValue());
    }

    public final void b(EditableVideoEdits editableVideoEdits) {
        if (editableVideoEdits == null) {
            throw new NullPointerException("Null editableVideoEdits");
        }
        this.c = editableVideoEdits;
    }

    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void d(RecordingInfo recordingInfo) {
        if (recordingInfo == null) {
            throw new NullPointerException("Null recordingInfo");
        }
        this.a = recordingInfo;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null stateEventFilePath");
        }
        this.d = str;
    }

    public final void f(VideoMetaData videoMetaData) {
        if (videoMetaData == null) {
            throw new NullPointerException("Null videoMetaData");
        }
        this.b = videoMetaData;
    }
}
