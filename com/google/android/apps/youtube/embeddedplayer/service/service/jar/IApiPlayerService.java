package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import defpackage.ecp;
import defpackage.ecq;
import defpackage.ecr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IApiPlayerService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class Stub extends ecq implements IApiPlayerService {

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public class Proxy extends ecp implements IApiPlayerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void A(EmbedsPrewarmData embedsPrewarmData) {
                Parcel pn = pn();
                ecr.g(pn, embedsPrewarmData);
                pp(41, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void B(boolean z) {
                Parcel pn = pn();
                ecr.e(pn, z);
                pp(14, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void D(CommandWrapper commandWrapper) {
                Parcel pn = pn();
                ecr.g(pn, commandWrapper);
                pp(40, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void E(int i) {
                Parcel pn = pn();
                pn.writeInt(i);
                pp(18, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void F(int i) {
                Parcel pn = pn();
                pn.writeInt(i);
                pp(17, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void G(boolean z) {
                Parcel pn = pn();
                ecr.e(pn, z);
                pp(19, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void H(boolean z) {
                Parcel pn = pn();
                ecr.e(pn, z);
                pp(22, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void I(boolean z) {
                Parcel pn = pn();
                ecr.e(pn, z);
                pp(20, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void J() {
                pp(21, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void K(String str) {
                Parcel pn = pn();
                pn.writeString(str);
                pp(36, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void L() {
                pp(37, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void M() {
                pp(10, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void N() {
                pp(11, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final boolean O() {
                Parcel po = po(13, pn());
                boolean j = ecr.j(po);
                po.recycle();
                return j;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final boolean P(byte[] bArr) {
                Parcel pn = pn();
                pn.writeByteArray(bArr);
                Parcel po = po(29, pn);
                boolean j = ecr.j(po);
                po.recycle();
                return j;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final byte[] Q() {
                Parcel po = po(33, pn());
                byte[] createByteArray = po.createByteArray();
                po.recycle();
                return createByteArray;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final byte[] R() {
                Parcel po = po(28, pn());
                byte[] createByteArray = po.createByteArray();
                po.recycle();
                return createByteArray;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final d a() {
                d bVar;
                Parcel po = po(39, pn());
                IBinder readStrongBinder = po.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.csi.shared.ICsiControllerService");
                    if (queryLocalInterface instanceof d) {
                        bVar = (d) queryLocalInterface;
                    } else {
                        bVar = new b(readStrongBinder);
                    }
                }
                po.recycle();
                return bVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final c b() {
                c aVar;
                Parcel po = po(42, pn());
                IBinder readStrongBinder = po.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedErrorLoggingService");
                    if (queryLocalInterface instanceof c) {
                        aVar = (c) queryLocalInterface;
                    } else {
                        aVar = new a(readStrongBinder);
                    }
                }
                po.recycle();
                return aVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d bVar;
                Parcel po = po(35, pn());
                IBinder readStrongBinder = po.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
                    if (queryLocalInterface instanceof com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d) {
                        bVar = (com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d) queryLocalInterface;
                    } else {
                        bVar = new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.b(readStrongBinder);
                    }
                }
                po.recycle();
                return bVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e() {
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c aVar;
                Parcel po = po(32, pn());
                IBinder readStrongBinder = po.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.ISelectableItemRegistryService");
                    if (queryLocalInterface instanceof com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) {
                        aVar = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) queryLocalInterface;
                    } else {
                        aVar = new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.a(readStrongBinder);
                    }
                }
                po.recycle();
                return aVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void f() {
                pp(23, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void g() {
                pp(12, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void h(String str, int i, int i2, int i3) {
                Parcel pn = pn();
                pn.writeString(str);
                pn.writeInt(i);
                pn.writeInt(i2);
                pn.writeInt(i3);
                pp(4, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void i(String str, int i, int i2) {
                Parcel pn = pn();
                pn.writeString(str);
                pn.writeInt(i);
                pn.writeInt(i2);
                pp(2, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void j(List list, int i, int i2, int i3) {
                Parcel pn = pn();
                pn.writeStringList(list);
                pn.writeInt(i);
                pn.writeInt(i2);
                pn.writeInt(i3);
                pp(6, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void k(boolean z) {
                Parcel pn = pn();
                ecr.e(pn, z);
                pp(24, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void l(String str) {
                Parcel pn = pn();
                pn.writeString(str);
                pp(38, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void m() {
                pp(31, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void n() {
                pp(30, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void o(String str, int i, int i2, boolean z, int i3) {
                Parcel pn = pn();
                pn.writeString(str);
                pn.writeInt(i);
                pn.writeInt(i2);
                ecr.e(pn, z);
                pn.writeInt(i3);
                pp(5, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void p(String str, boolean z, int i, boolean z2, int i2) {
                Parcel pn = pn();
                pn.writeString(str);
                ecr.e(pn, z);
                pn.writeInt(i);
                ecr.e(pn, z2);
                pn.writeInt(i2);
                pp(3, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void q(List list, int i, int i2, boolean z, int i3) {
                Parcel pn = pn();
                pn.writeStringList(list);
                pn.writeInt(i);
                pn.writeInt(i2);
                ecr.e(pn, z);
                pn.writeInt(i3);
                pp(7, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void r() {
                pp(15, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void s(VisibilityChangeEventData visibilityChangeEventData) {
                Parcel pn = pn();
                ecr.g(pn, visibilityChangeEventData);
                pp(1, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void t(byte[] bArr) {
                Parcel pn = pn();
                pn.writeByteArray(bArr);
                pp(34, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void u(int i, KeyEvent keyEvent) {
                Parcel pn = pn();
                pn.writeInt(i);
                ecr.g(pn, keyEvent);
                pp(25, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void v(int i, KeyEvent keyEvent) {
                Parcel pn = pn();
                pn.writeInt(i);
                ecr.g(pn, keyEvent);
                pp(26, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void w() {
                pp(27, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void x() {
                pp(9, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void y() {
                pp(8, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
            public final void z() {
                pp(16, pn());
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
        }

        @Override // defpackage.ecq
        protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    s((VisibilityChangeEventData) ecr.a(parcel, VisibilityChangeEventData.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    i(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    p(parcel.readString(), ecr.j(parcel), parcel.readInt(), ecr.j(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    h(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    o(parcel.readString(), parcel.readInt(), parcel.readInt(), ecr.j(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    j(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    q(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), ecr.j(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    y();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    x();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    M();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    N();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    g();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    boolean O = O();
                    parcel2.writeNoException();
                    ecr.e(parcel2, O);
                    return true;
                case 14:
                    B(ecr.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    r();
                    parcel2.writeNoException();
                    return true;
                case 16:
                    z();
                    parcel2.writeNoException();
                    return true;
                case 17:
                    F(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    E(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    G(ecr.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    I(ecr.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    J();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    H(ecr.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    f();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    k(ecr.j(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    u(parcel.readInt(), (KeyEvent) ecr.a(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    v(parcel.readInt(), (KeyEvent) ecr.a(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    w();
                    parcel2.writeNoException();
                    return true;
                case 28:
                    byte[] R = R();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(R);
                    return true;
                case 29:
                    boolean P = P(parcel.createByteArray());
                    parcel2.writeNoException();
                    ecr.e(parcel2, P);
                    return true;
                case 30:
                    n();
                    parcel2.writeNoException();
                    return true;
                case 31:
                    m();
                    parcel2.writeNoException();
                    return true;
                case 32:
                    com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e = e();
                    parcel2.writeNoException();
                    ecr.i(parcel2, e);
                    return true;
                case 33:
                    byte[] Q = Q();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(Q);
                    return true;
                case 34:
                    t(parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d = d();
                    parcel2.writeNoException();
                    ecr.i(parcel2, d);
                    return true;
                case 36:
                    K(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 37:
                    L();
                    parcel2.writeNoException();
                    return true;
                case 38:
                    l(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 39:
                    d a = a();
                    parcel2.writeNoException();
                    ecr.i(parcel2, a);
                    return true;
                case 40:
                    D((CommandWrapper) ecr.a(parcel, CommandWrapper.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    A((EmbedsPrewarmData) ecr.a(parcel, EmbedsPrewarmData.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    c b = b();
                    parcel2.writeNoException();
                    ecr.i(parcel2, b);
                    return true;
                default:
                    return false;
            }
        }
    }

    void A(EmbedsPrewarmData embedsPrewarmData);

    void B(boolean z);

    void D(CommandWrapper commandWrapper);

    void E(int i);

    void F(int i);

    void G(boolean z);

    void H(boolean z);

    void I(boolean z);

    void J();

    void K(String str);

    void L();

    void M();

    void N();

    boolean O();

    boolean P(byte[] bArr);

    byte[] Q();

    byte[] R();

    d a();

    c b();

    com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d();

    com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e();

    void f();

    void g();

    void h(String str, int i, int i2, int i3);

    void i(String str, int i, int i2);

    void j(List list, int i, int i2, int i3);

    void k(boolean z);

    void l(String str);

    void m();

    void n();

    void o(String str, int i, int i2, boolean z, int i3);

    void p(String str, boolean z, int i, boolean z2, int i2);

    void q(List list, int i, int i2, boolean z, int i3);

    void r();

    void s(VisibilityChangeEventData visibilityChangeEventData);

    void t(byte[] bArr);

    void u(int i, KeyEvent keyEvent);

    void v(int i, KeyEvent keyEvent);

    void w();

    void x();

    void y();

    void z();
}
