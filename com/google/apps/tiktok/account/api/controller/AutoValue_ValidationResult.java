package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValue_ValidationResult extends ValidationResult {
    private final boolean a;
    private final boolean b;
    private final Intent c;

    public AutoValue_ValidationResult(boolean z, boolean z2, Intent intent) {
        this.a = z;
        this.b = z2;
        this.c = intent;
    }

    @Override // com.google.apps.tiktok.account.api.controller.ValidationResult
    public final Intent a() {
        return this.c;
    }

    @Override // com.google.apps.tiktok.account.api.controller.ValidationResult
    public final boolean b() {
        return this.b;
    }

    @Override // com.google.apps.tiktok.account.api.controller.ValidationResult
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Intent intent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValidationResult) {
            ValidationResult validationResult = (ValidationResult) obj;
            if (this.a == validationResult.c() && this.b == validationResult.b() && ((intent = this.c) != null ? intent.equals(validationResult.a()) : validationResult.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003;
        Intent intent = this.c;
        return i ^ (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
        sb.append("ValidationResult{isValid=");
        sb.append(z);
        sb.append(", clearState=");
        sb.append(z2);
        sb.append(", getIntentToMeet=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
