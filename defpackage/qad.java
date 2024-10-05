package defpackage;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qad implements qbn {
    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final boolean g;

    public qad(Date date, int i, Set set, Location location, boolean z, int i2, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = z2;
    }

    @Override // defpackage.qbn
    @Deprecated
    public final int a() {
        return this.b;
    }

    @Override // defpackage.qbn
    public final int b() {
        return this.f;
    }

    @Override // defpackage.qbn
    public final Location c() {
        return this.e;
    }

    @Override // defpackage.qbn
    @Deprecated
    public final Date d() {
        return this.a;
    }

    @Override // defpackage.qbn
    public final Set e() {
        return this.c;
    }

    @Override // defpackage.qbn
    @Deprecated
    public final boolean f() {
        return this.g;
    }

    @Override // defpackage.qbn
    public final boolean g() {
        return this.d;
    }
}
