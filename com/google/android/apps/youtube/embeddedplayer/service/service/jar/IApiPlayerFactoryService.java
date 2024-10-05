package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.o;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.q;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.j;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c;
import defpackage.ecp;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IApiPlayerFactoryService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class Stub extends ecq implements IApiPlayerFactoryService {

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public class Proxy extends ecp implements IApiPlayerFactoryService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService
            public final IApiPlayerService a(q qVar, c cVar, f fVar, l lVar, com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar4, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar5, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f fVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c cVar6, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c cVar7, com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar8, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c cVar9, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f fVar3, com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c cVar10, com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f fVar4, boolean z) {
                IApiPlayerService proxy;
                Parcel pn = pn();
                ecr.i(pn, qVar);
                ecr.i(pn, cVar);
                ecr.i(pn, fVar);
                ecr.i(pn, lVar);
                ecr.i(pn, cVar2);
                ecr.i(pn, cVar3);
                ecr.i(pn, cVar4);
                ecr.i(pn, cVar5);
                ecr.i(pn, fVar2);
                ecr.i(pn, cVar6);
                ecr.i(pn, cVar7);
                ecr.i(pn, cVar8);
                ecr.i(pn, cVar9);
                ecr.i(pn, fVar3);
                ecr.i(pn, cVar10);
                ecr.i(pn, fVar4);
                ecr.e(pn, z);
                Parcel po = po(1, pn);
                IBinder readStrongBinder = po.readStrongBinder();
                if (readStrongBinder == null) {
                    proxy = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
                    if (queryLocalInterface instanceof IApiPlayerService) {
                        proxy = (IApiPlayerService) queryLocalInterface;
                    } else {
                        proxy = new IApiPlayerService.Stub.Proxy(readStrongBinder);
                    }
                }
                po.recycle();
                return proxy;
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
        }

        @Override // defpackage.ecq
        protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            q oVar;
            q qVar;
            c aVar;
            c cVar;
            f dVar;
            f fVar;
            l jVar;
            l lVar;
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c aVar2;
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar2;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c aVar3;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar3;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c aVar4;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar4;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c aVar5;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar5;
            com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f dVar2;
            com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f fVar2;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c aVar6;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c cVar6;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c aVar7;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c cVar7;
            com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c aVar8;
            com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar8;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c aVar9;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c cVar9;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f dVar3;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f fVar3;
            com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c aVar10;
            com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c cVar10;
            if (i != 1) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f fVar4 = null;
            if (readStrongBinder == null) {
                qVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
                if (queryLocalInterface instanceof q) {
                    oVar = (q) queryLocalInterface;
                } else {
                    oVar = new o(readStrongBinder);
                }
                qVar = oVar;
            }
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 == null) {
                cVar = null;
            } else {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
                if (queryLocalInterface2 instanceof c) {
                    aVar = (c) queryLocalInterface2;
                } else {
                    aVar = new a(readStrongBinder2);
                }
                cVar = aVar;
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
                if (queryLocalInterface3 instanceof f) {
                    dVar = (f) queryLocalInterface3;
                } else {
                    dVar = new d(readStrongBinder3);
                }
                fVar = dVar;
            }
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 == null) {
                lVar = null;
            } else {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureClient");
                if (queryLocalInterface4 instanceof l) {
                    jVar = (l) queryLocalInterface4;
                } else {
                    jVar = new j(readStrongBinder4);
                }
                lVar = jVar;
            }
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 == null) {
                cVar2 = null;
            } else {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
                if (queryLocalInterface5 instanceof com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c) {
                    aVar2 = (com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c) queryLocalInterface5;
                } else {
                    aVar2 = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.a(readStrongBinder5);
                }
                cVar2 = aVar2;
            }
            IBinder readStrongBinder6 = parcel.readStrongBinder();
            if (readStrongBinder6 == null) {
                cVar3 = null;
            } else {
                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
                if (queryLocalInterface6 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c) {
                    aVar3 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c) queryLocalInterface6;
                } else {
                    aVar3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.a(readStrongBinder6);
                }
                cVar3 = aVar3;
            }
            IBinder readStrongBinder7 = parcel.readStrongBinder();
            if (readStrongBinder7 == null) {
                cVar4 = null;
            } else {
                IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
                if (queryLocalInterface7 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c) {
                    aVar4 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c) queryLocalInterface7;
                } else {
                    aVar4 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.a(readStrongBinder7);
                }
                cVar4 = aVar4;
            }
            IBinder readStrongBinder8 = parcel.readStrongBinder();
            if (readStrongBinder8 == null) {
                cVar5 = null;
            } else {
                IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
                if (queryLocalInterface8 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c) {
                    aVar5 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c) queryLocalInterface8;
                } else {
                    aVar5 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.a(readStrongBinder8);
                }
                cVar5 = aVar5;
            }
            IBinder readStrongBinder9 = parcel.readStrongBinder();
            if (readStrongBinder9 == null) {
                fVar2 = null;
            } else {
                IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
                if (queryLocalInterface9 instanceof com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f) {
                    dVar2 = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f) queryLocalInterface9;
                } else {
                    dVar2 = new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.d(readStrongBinder9);
                }
                fVar2 = dVar2;
            }
            IBinder readStrongBinder10 = parcel.readStrongBinder();
            if (readStrongBinder10 == null) {
                cVar6 = null;
            } else {
                IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
                if (queryLocalInterface10 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c) {
                    aVar6 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c) queryLocalInterface10;
                } else {
                    aVar6 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.a(readStrongBinder10);
                }
                cVar6 = aVar6;
            }
            IBinder readStrongBinder11 = parcel.readStrongBinder();
            if (readStrongBinder11 == null) {
                cVar7 = null;
            } else {
                IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
                if (queryLocalInterface11 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c) {
                    aVar7 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c) queryLocalInterface11;
                } else {
                    aVar7 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.a(readStrongBinder11);
                }
                cVar7 = aVar7;
            }
            IBinder readStrongBinder12 = parcel.readStrongBinder();
            if (readStrongBinder12 == null) {
                cVar8 = null;
            } else {
                IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
                if (queryLocalInterface12 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c) {
                    aVar8 = (com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c) queryLocalInterface12;
                } else {
                    aVar8 = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.a(readStrongBinder12);
                }
                cVar8 = aVar8;
            }
            IBinder readStrongBinder13 = parcel.readStrongBinder();
            if (readStrongBinder13 == null) {
                cVar9 = null;
            } else {
                IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
                if (queryLocalInterface13 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c) {
                    aVar9 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c) queryLocalInterface13;
                } else {
                    aVar9 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.a(readStrongBinder13);
                }
                cVar9 = aVar9;
            }
            IBinder readStrongBinder14 = parcel.readStrongBinder();
            if (readStrongBinder14 == null) {
                fVar3 = null;
            } else {
                IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayClient");
                if (queryLocalInterface14 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f) {
                    dVar3 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f) queryLocalInterface14;
                } else {
                    dVar3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.d(readStrongBinder14);
                }
                fVar3 = dVar3;
            }
            IBinder readStrongBinder15 = parcel.readStrongBinder();
            if (readStrongBinder15 == null) {
                cVar10 = null;
            } else {
                IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.databus.shared.IDataBusClient");
                if (queryLocalInterface15 instanceof com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c) {
                    aVar10 = (com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c) queryLocalInterface15;
                } else {
                    aVar10 = new com.google.android.apps.youtube.embeddedplayer.service.databus.shared.a(readStrongBinder15);
                }
                cVar10 = aVar10;
            }
            IBinder readStrongBinder16 = parcel.readStrongBinder();
            if (readStrongBinder16 != null) {
                IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
                if (queryLocalInterface16 instanceof com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f) {
                    fVar4 = (com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f) queryLocalInterface16;
                } else {
                    fVar4 = new com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.d(readStrongBinder16);
                }
            }
            IApiPlayerService a = a(qVar, cVar, fVar, lVar, cVar2, cVar3, cVar4, cVar5, fVar2, cVar6, cVar7, cVar8, cVar9, fVar3, cVar10, fVar4, ecr.j(parcel));
            parcel2.writeNoException();
            ecr.i(parcel2, a);
            return true;
        }
    }

    IApiPlayerService a(q qVar, c cVar, f fVar, l lVar, com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar4, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar5, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f fVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c cVar6, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c cVar7, com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar8, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c cVar9, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f fVar3, com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c cVar10, com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f fVar4, boolean z);
}
