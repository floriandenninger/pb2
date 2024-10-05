package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import defpackage.ecp;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IEmbedFragmentService extends IInterface {
    int a();

    c b();

    d d();

    void e(int i);

    void f();

    void g();

    void h(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem);

    void i();

    void j();

    void r(SimplePlaybackDescriptor simplePlaybackDescriptor);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class Stub extends ecq implements IEmbedFragmentService {

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public class Proxy extends ecp implements IEmbedFragmentService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final int a() {
                Parcel po = po(3, pn());
                int readInt = po.readInt();
                po.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final c b() {
                c aVar;
                Parcel po = po(9, pn());
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

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final d d() {
                d bVar;
                Parcel po = po(10, pn());
                IBinder readStrongBinder = po.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
                    if (queryLocalInterface instanceof d) {
                        bVar = (d) queryLocalInterface;
                    } else {
                        bVar = new b(readStrongBinder);
                    }
                }
                po.recycle();
                return bVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final void e(int i) {
                Parcel pn = pn();
                pn.writeInt(i);
                pp(4, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final void f() {
                pp(5, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a
            public final void g() {
                pp(6, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d
            public final void h(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
                Parcel pn = pn();
                ecr.g(pn, subscriptionNotificationMenuItem);
                pp(7, pn);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final void i() {
                pp(2, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a
            public final void j() {
                pp(8, pn());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final void r(SimplePlaybackDescriptor simplePlaybackDescriptor) {
                Parcel pn = pn();
                ecr.g(pn, simplePlaybackDescriptor);
                pp(1, pn);
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
        }

        @Override // defpackage.ecq
        protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    r((SimplePlaybackDescriptor) ecr.a(parcel, SimplePlaybackDescriptor.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    i();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 4:
                    e(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    f();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    g();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    h((SubscriptionNotificationMenuItem) ecr.a(parcel, SubscriptionNotificationMenuItem.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    j();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    c b = b();
                    parcel2.writeNoException();
                    ecr.i(parcel2, b);
                    return true;
                case 10:
                    d d = d();
                    parcel2.writeNoException();
                    ecr.i(parcel2, d);
                    return true;
                default:
                    return false;
            }
        }
    }
}
