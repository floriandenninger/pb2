package com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service;

import android.os.BadParcelableException;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
import defpackage.afsi;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.b {
    public String a = "";

    @Override // com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c
    public final void a(RemoteEmbedExceptionData remoteEmbedExceptionData) {
        Throwable th;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler != null) {
            try {
                th = remoteEmbedExceptionData.a(this.a);
            } catch (BadParcelableException unused) {
                th = remoteEmbedExceptionData.a;
            }
            if (th != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
                return;
            }
        }
        Throwable th2 = remoteEmbedExceptionData.a;
        if (th2 != null) {
            String valueOf = String.valueOf(this.a);
            afsi.c(2, 4, valueOf.length() != 0 ? "Error throwing Remote Crash Exception in Service from package: ".concat(valueOf) : new String("Error throwing Remote Crash Exception in Service from package: "), th2);
        }
    }
}
