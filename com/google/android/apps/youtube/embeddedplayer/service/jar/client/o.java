package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class o extends ecp implements q {
    public o(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final String a(String str) {
        Parcel pn = pn();
        pn.writeString(str);
        Parcel po = po(20, pn);
        String readString = po.readString();
        po.recycle();
        return readString;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void f() {
        pp(6, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void g(boolean z, long j) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pn.writeLong(j);
        pp(14, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void h() {
        pp(19, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void i() {
        pp(18, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void j(String str) {
        Parcel pn = pn();
        pn.writeString(str);
        pp(9, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void k(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(16, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void l(String str, String str2, long j, long j2, boolean z, boolean z2, int i) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        pn.writeLong(j);
        pn.writeLong(j2);
        ecr.e(pn, z);
        ecr.e(pn, z2);
        pn.writeInt(i);
        pp(5, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void m() {
        pp(4, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void n() {
        pp(2, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void o(long j) {
        Parcel pn = pn();
        pn.writeLong(j);
        pp(11, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void p(long j, long j2) {
        Parcel pn = pn();
        pn.writeLong(j);
        pn.writeLong(j2);
        pp(10, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void q() {
        pp(17, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void r() {
        pp(3, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void s() {
        pp(1, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void t(long j, long j2) {
        Parcel pn = pn();
        pn.writeLong(j);
        pn.writeLong(j2);
        pp(13, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void u(long j) {
        Parcel pn = pn();
        pn.writeLong(j);
        pp(15, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void v() {
        pp(12, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void w() {
        pp(8, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void x() {
        pp(7, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void y(String str) {
        Parcel pn = pn();
        pn.writeString(str);
        pp(22, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void z(Intent intent) {
        Parcel pn = pn();
        ecr.g(pn, intent);
        pp(21, pn);
    }
}
