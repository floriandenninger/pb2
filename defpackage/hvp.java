package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvp {
    public final View a;
    public final Resources b;
    public final hvn c;
    public final RecordingInfo d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final acra h;
    public final ci i;

    public hvp() {
    }

    public hvp(View view, Resources resources, hvn hvnVar, RecordingInfo recordingInfo, boolean z, boolean z2, boolean z3, acra acraVar, ci ciVar) {
        this.a = view;
        this.b = resources;
        this.c = hvnVar;
        this.d = recordingInfo;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = acraVar;
        this.i = ciVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hvp) {
            hvp hvpVar = (hvp) obj;
            if (this.a.equals(hvpVar.a) && this.b.equals(hvpVar.b) && this.c.equals(hvpVar.c) && this.d.equals(hvpVar.d) && this.e == hvpVar.e && this.f == hvpVar.f && this.g == hvpVar.g && this.h.equals(hvpVar.h) && this.i.equals(hvpVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 176 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("SetupParameter{root=");
        sb.append(valueOf);
        sb.append(", resources=");
        sb.append(valueOf2);
        sb.append(", reelEditTopBarCallback=");
        sb.append(valueOf3);
        sb.append(", recordingInfo=");
        sb.append(valueOf4);
        sb.append(", isTextEnabled=");
        sb.append(z);
        sb.append(", isTrimEnabled=");
        sb.append(z2);
        sb.append(", isSaveEnabled=");
        sb.append(z3);
        sb.append(", interactionLogger=");
        sb.append(valueOf5);
        sb.append(", fragmentActivity=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
