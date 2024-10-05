package com.google.android.apps.youtube.embeddedplayer.service.csi.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecp implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.csi.shared.ICsiControllerService");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void a() {
        pp(7, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void b() {
        throw null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void c() {
        pp(4, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void d(d dVar) {
        throw null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void e(Tick tick, long j) {
        Parcel pn = pn();
        ecr.g(pn, tick);
        pn.writeLong(j);
        pp(6, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void f(Tick tick, long j) {
        Parcel pn = pn();
        ecr.g(pn, tick);
        pn.writeLong(j);
        pp(9, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void g(Tick tick, long j) {
        Parcel pn = pn();
        ecr.g(pn, tick);
        pn.writeLong(j);
        pp(3, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void h(long j) {
        Parcel pn = pn();
        pn.writeLong(j);
        pp(5, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void i(long j) {
        Parcel pn = pn();
        pn.writeLong(j);
        pp(8, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void j(SetOperationType setOperationType, long j) {
        Parcel pn = pn();
        ecr.g(pn, setOperationType);
        pn.writeLong(j);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void k(SetOperationType setOperationType, long j) {
        Parcel pn = pn();
        ecr.g(pn, setOperationType);
        pn.writeLong(j);
        pp(2, pn);
    }
}
