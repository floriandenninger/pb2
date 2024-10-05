package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.r;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.t;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import defpackage.ecp;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IEmbedFragmentServiceFactoryService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class Stub extends ecq implements IEmbedFragmentServiceFactoryService {

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public class Proxy extends ecp implements IEmbedFragmentServiceFactoryService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService
            public final IEmbedFragmentService a(t tVar, int i) {
                IEmbedFragmentService proxy;
                Parcel pn = pn();
                ecr.i(pn, tVar);
                pn.writeInt(i);
                Parcel po = po(1, pn);
                IBinder readStrongBinder = po.readStrongBinder();
                if (readStrongBinder == null) {
                    proxy = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
                    if (queryLocalInterface instanceof IEmbedFragmentService) {
                        proxy = (IEmbedFragmentService) queryLocalInterface;
                    } else {
                        proxy = new IEmbedFragmentService.Stub.Proxy(readStrongBinder);
                    }
                }
                po.recycle();
                return proxy;
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
        }

        @Override // defpackage.ecq
        protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            t rVar;
            if (i != 1) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                rVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
                if (queryLocalInterface instanceof t) {
                    rVar = (t) queryLocalInterface;
                } else {
                    rVar = new r(readStrongBinder);
                }
            }
            IEmbedFragmentService a = a(rVar, parcel.readInt());
            parcel2.writeNoException();
            ecr.i(parcel2, a);
            return true;
        }
    }

    IEmbedFragmentService a(t tVar, int i);
}
