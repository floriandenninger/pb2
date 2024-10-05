package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface rfg extends IInterface {
    String a(AppMetadata appMetadata);

    List f(String str, String str2, AppMetadata appMetadata);

    List g(String str, String str2, String str3);

    List h(String str, String str2, boolean z, AppMetadata appMetadata);

    List i(String str, String str2, String str3, boolean z);

    void j(AppMetadata appMetadata);

    void k(EventParcel eventParcel, AppMetadata appMetadata);

    void l(AppMetadata appMetadata);

    void m(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata);

    void n(AppMetadata appMetadata);

    void o(long j, String str, String str2, String str3);

    void p(Bundle bundle, AppMetadata appMetadata);

    void q(AppMetadata appMetadata);

    void r(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata);

    byte[] s(EventParcel eventParcel, String str);
}
