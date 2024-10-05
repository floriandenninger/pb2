package defpackage;

import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bou {
    final Bundle a;
    List b;
    List c;

    public bou(Bundle bundle) {
        this.a = bundle;
    }

    public static bou l(Bundle bundle) {
        if (bundle != null) {
            return new bou(bundle);
        }
        return null;
    }

    public final int a() {
        return this.a.getInt("connectionState", 0);
    }

    public final int b() {
        return this.a.getInt("deviceType");
    }

    public final int c() {
        return this.a.getInt("playbackStream", -1);
    }

    public final int d() {
        return this.a.getInt("playbackType", 1);
    }

    public final int e() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public final int f() {
        return this.a.getInt("volume");
    }

    public final int g() {
        return this.a.getInt("volumeHandling", 0);
    }

    public final int h() {
        return this.a.getInt("volumeMax");
    }

    public final IntentSender i() {
        return (IntentSender) this.a.getParcelable("settingsIntent");
    }

    public final Uri j() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Bundle k() {
        return this.a.getBundle("extras");
    }

    public final String m() {
        return this.a.getString("status");
    }

    public final String n() {
        return this.a.getString("id");
    }

    public final String o() {
        return this.a.getString("name");
    }

    public final List p() {
        r();
        return this.c;
    }

    public final List q() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("groupMemberIds");
            this.b = stringArrayList;
            if (stringArrayList == null) {
                this.b = Collections.emptyList();
            }
        }
        return this.b;
    }

    final void r() {
        if (this.c == null) {
            ArrayList parcelableArrayList = this.a.getParcelableArrayList("controlFilters");
            this.c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.c = Collections.emptyList();
            }
        }
    }

    public final boolean s() {
        return this.a.getBoolean("canDisconnect", false);
    }

    public final boolean t() {
        return this.a.getBoolean("enabled", true);
    }

    public final String toString() {
        return "MediaRouteDescriptor{ id=" + n() + ", groupMemberIds=" + q() + ", name=" + o() + ", description=" + m() + ", iconUri=" + j() + ", isEnabled=" + t() + ", connectionState=" + a() + ", controlFilters=" + Arrays.toString(p().toArray()) + ", playbackType=" + d() + ", playbackStream=" + c() + ", deviceType=" + b() + ", volume=" + f() + ", volumeMax=" + h() + ", volumeHandling=" + g() + ", presentationDisplayId=" + e() + ", extras=" + k() + ", isValid=" + u() + ", minClientVersion=" + this.a.getInt("minClientVersion", 1) + ", maxClientVersion=" + this.a.getInt("maxClientVersion", Integer.MAX_VALUE) + " }";
    }

    public final boolean u() {
        r();
        return (TextUtils.isEmpty(n()) || TextUtils.isEmpty(o()) || this.c.contains(null)) ? false : true;
    }
}
