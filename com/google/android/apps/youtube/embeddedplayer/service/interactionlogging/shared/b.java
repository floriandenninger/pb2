package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecp implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final int a(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        Parcel po = po(1, pn);
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void b(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(7, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void c(byte[] bArr) {
        Parcel pn = pn();
        pn.writeByteArray(bArr);
        pp(8, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void d(int i, int i2) {
        throw null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void e(int i, byte[] bArr) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeByteArray(bArr);
        pp(12, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void f(int i, SimplePlaybackDescriptor simplePlaybackDescriptor, boolean z) {
        Parcel pn = pn();
        pn.writeInt(i);
        ecr.g(pn, simplePlaybackDescriptor);
        ecr.e(pn, true);
        pp(4, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void g(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(3, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void h(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(5, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void i(byte[] bArr) {
        Parcel pn = pn();
        pn.writeByteArray(bArr);
        pp(6, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void j(int i, int i2) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeInt(i2);
        pp(9, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void k(int i, byte[] bArr) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeByteArray(bArr);
        pp(10, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void l(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(2, pn);
    }
}
