package com.youtube.android.libraries.elements;

import defpackage.abb;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StatusOr {
    public final boolean hasValue;
    public final Status status;
    public final Object value;

    private StatusOr(Status status, Object obj, boolean z) {
        this.status = status;
        this.value = obj;
        this.hasValue = z;
    }

    public static StatusOr fromStatus(Status status) {
        if (status.f()) {
            throw new IllegalArgumentException("StatusOr with status OK must have a value. Please use fromValue(T value) instead.");
        }
        return new StatusOr(status, null, false);
    }

    public static StatusOr fromValue(Object obj) {
        return new StatusOr(Status.b, obj, true);
    }

    public final Object a(abb abbVar) {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        throw ((RuntimeException) abbVar.a(this.status.d()));
    }
}
