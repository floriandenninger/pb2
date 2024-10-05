package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import defpackage.acsc;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b {
    public final a a;
    public final byte[] b;
    public final acsc c;

    public b(a aVar, acsc acscVar) {
        this.a = aVar;
        this.c = acscVar;
        this.b = null;
    }

    public b(a aVar, byte[] bArr) {
        this.a = aVar;
        this.b = bArr;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && Arrays.equals(this.b, bVar.b)) {
            acsc acscVar = this.c;
            acsc acscVar2 = bVar.c;
            if (acscVar == acscVar2) {
                return true;
            }
            if (acscVar != null && acscVar2 != null && acscVar.equals(acscVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        acsc acscVar = this.c;
        return Arrays.deepHashCode(new Object[]{this.a, this.b, Integer.valueOf(acscVar == null ? 0 : acscVar.a)});
    }
}
